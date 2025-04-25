package com.glority.android.chatbot2.handler;

import com.glority.android.chatbot2.chatbot.HandlerChatBot;
import com.glority.generatedAPI.kotlinAPI.chatbot.SendMessageMessage;
import kotlin.Metadata;

/* compiled from: ChatbotSendMsgHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/android/chatbot2/handler/ChatbotSendMsgHandler;", "", "sendMsg", "", "sendMessageMessage", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/SendMessageMessage;", "chatBot", "Lcom/glority/android/chatbot2/chatbot/HandlerChatBot$Chatbot;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public interface ChatbotSendMsgHandler {
    boolean sendMsg(SendMessageMessage sendMessageMessage, HandlerChatBot.Chatbot chatBot);
}
