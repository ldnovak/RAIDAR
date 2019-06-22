import subprocess

port = '8102'
route = 'EntryDB'
address = 'http://localhost:'+port+'/'+route
null_char = "NULL_CHAR"


def run_terminal(list_of_commands):
    proc = subprocess.Popen(list_of_commands, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    output = proc.communicate()
    return output[0].decode("utf-8")

def print_help():
    print("Commands are:\n\t"
          "'help' to get commands\n\t"
          "'get all' to get all DictionaryEntries\n\t"
          "'get id {id}' to get a DictionaryEntry with specific {id}\n\t"
          "'get key {key}' to get all DictionaryEntries with key == {key}\n\t"
          "'post {path to json}' to add a DictionaryEntry with info specified in {path to json}\n\t"
          "'put single {'add' or 'remove'} {id} {vale}' to to {'add' or 'remove'} a {value} "
          "from a DictionaryEnty with {id}\n\t"
          "'put multiple {'add','remove', 'retain', or 'replace'} {id} {path to json}' to {'add','remove', 'retain', or 'replace'} "
          "values found in file {path to json} to a DictionaryEnty with {id}\n\t")

def print_null_char_issue(command, missing_phrase):
    print("Read '"+ command + "' without an " + missing_phrase + " being added. Please add an " + missing_phrase)
    return False


def get_all():
    list_of_commands = ['curl', '-X', 'GET', address]
    return run_terminal(list_of_commands)


def get_id(id):
    list_of_commands = ['curl', '-X', 'GET', address+"/"+"getId/"+id]
    return run_terminal(list_of_commands)


def get_key(key):
    list_of_commands = ['curl', '-X', 'GET', address+"/"+"getKey/"+key]
    return run_terminal(list_of_commands)


def post(json_path):
    list_of_commands = ['curl', '-X', 'POST', address+"/create", "-d", "@"+json_path,
                        "-H", "Content-Type:application/json"]
    return run_terminal(list_of_commands)


def put_multiple(add_or_remove, id, json_path):
    list_of_commands = ['curl', '-X', 'PUT', address+"/"+add_or_remove+"/"+id, "-d", "@"+json_path,
                        "-H", "Content-Type:application/json"]
    return run_terminal(list_of_commands)


def put_single(add_or_remove, id, value):
    list_of_commands = ['curl', '-X', 'PUT', address+"/"+add_or_remove+"/"+id+'/'+value]
    return run_terminal(list_of_commands)


def delete(id):
    list_of_commands = ['curl', '-X', 'DELETE', address+"/"+id]
    return run_terminal(list_of_commands)


if __name__ == '__main__':
    interacting = True
    incorrect_counter = 0
    print("Address you are connected to is: "+address)
    while interacting:
        correct_input = True
        action_string = input("What would you like to do?") + " " + null_char
        action = action_string.split()
        action_string = action_string[:-len(null_char)]
        if action[0] == 'help':
            print_help()
        elif action[0] == 'get':
            if action[1] == 'all':
                print(get_all())
            elif action[1] == "id":
                if action[2] == null_char:
                    correct_input = print_null_char_issue(action[::-len], "{id}")
                else:
                    print(get_id(action[2]))
            elif action[1] == "key":
                if action[2] == null_char:
                    correct_input = print_null_char_issue(action_string, '{key}')
                else:
                    print(get_key(action[2]))
        elif action[0] == 'post':
            if action[1] == null_char:
                correct_input = print_null_char_issue(action_string, '{path to json}')
            else:
                print(post(action[1]))
        elif action[0] == 'put':
            if action[1] == 'multiple':
                if action[2] in {'add', 'remove', 'retain', 'replace'}:
                    if action[3] == null_char:
                        correct_input = print_null_char_issue(action_string, '{id}')
                    elif action[4] == null_char:
                        correct_input = print_null_char_issue(action_string, "{path to json}")
                    else:
                        print(put_multiple(action[2], action[3],action[4]))
            elif action[1] == 'single':
                if action[2] in {'add', 'remove'}:
                    if action[3] == null_char:
                        correct_input = print_null_char_issue(action_string, '{id}')
                    elif action[4] == null_char:
                        correct_input = print_null_char_issue(action_string, "{value}")
                    else:
                        print(put_single(action[2], action[3],action[4]))
            else:
                correct_input = print_null_char_issue(action_string, "{rest of put statement}")
        elif action[0] == 'delete':
            if action[1] == null_char:
                incorrect_counter = print_null_char_issue(action_string, {id})
            else:
                print(delete(action[1]))
        else:
            correct_input = False

        if correct_input:
            incorrect_counter = 0
        elif incorrect_counter == 2:
            print_help()
        else:
            incorrect_counter += 1

