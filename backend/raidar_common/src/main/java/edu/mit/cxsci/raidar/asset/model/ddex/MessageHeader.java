package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class MessageHeader {
	private String MessageThreadId;
	private String MessageId;
	MessageSender MessageSender;
	MessageRecipient MessageRecipient;
	private String MessageCreatedDateTime;
	private String MessageControlType;

	public String getMessageThreadId() {
		return MessageThreadId;
	}

	public String getMessageId() {
		return MessageId;
	}

	public MessageSender getMessageSender() {
		return MessageSender;
	}

	public MessageRecipient getMessageRecipient() {
		return MessageRecipient;
	}

	public String getMessageCreatedDateTime() {
		return MessageCreatedDateTime;
	}

	public String getMessageControlType() {
		return MessageControlType;
	}

	public void setMessageThreadId(String MessageThreadId) {
		this.MessageThreadId = MessageThreadId;
	}

	public void setMessageId(String MessageId) {
		this.MessageId = MessageId;
	}

	public void setMessageSender(MessageSender MessageSenderObject) {
		this.MessageSender = MessageSenderObject;
	}

	public void setMessageRecipient(MessageRecipient MessageRecipientObject) {
		this.MessageRecipient = MessageRecipientObject;
	}

	public void setMessageCreatedDateTime(String MessageCreatedDateTime) {
		this.MessageCreatedDateTime = MessageCreatedDateTime;
	}

	public void setMessageControlType(String MessageControlType) {
		this.MessageControlType = MessageControlType;
	}
}
