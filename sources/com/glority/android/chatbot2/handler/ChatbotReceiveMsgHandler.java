package com.glority.android.chatbot2.handler;

import com.glority.android.chatbot2.chatbot.HandlerChatBot;
import com.glority.generatedAPI.kotlinAPI.chatbot.Message;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ChatbotReceiveMsgHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/glority/android/chatbot2/handler/ChatbotReceiveMsgHandler;", "", "receiveMsg", "", "replyMessageList", "", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/Message;", "chatBot", "Lcom/glority/android/chatbot2/chatbot/HandlerChatBot$Chatbot;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public interface ChatbotReceiveMsgHandler {
    boolean receiveMsg(List<Message> replyMessageList, HandlerChatBot.Chatbot chatBot);
}
