import javax.swing.JTextField;
import java.lang.reflect.*;

import edu.mit.cxsci.raidar.asset.model.raidar.*;

public class SuperClasses {
    public static void main(String[] args) {
        //showHierarchy(DisplayArtist.class);
        inspect(DisplayArtist.class);
    }
    static void showHierarchy(Class<?> c) {
        if (c.getSuperclass() == null) {
            System.out.println(c.getName());
            return;
        }
        showHierarchy(c.getSuperclass());
        System.out.println(c.getName());
    }
    
 
    static <T> void inspect(Class<T> klazz) {
        Field[] fields = klazz.getDeclaredFields();
        System.out.printf("%d fields:%n", fields.length);
        for (Field field : fields) {
            System.out.printf("%s %s %s%n",
                Modifier.toString(field.getModifiers()),
                field.getType().getSimpleName(),
                field.getName()
            );
        }
    }
}
