package com.glority.android.chatbot2.chatbot;

import com.glority.android.chatbot2.entity.BaseChatbotEntity;
import com.glority.android.chatbot2.handler.ChatbotReceiveMsgHandler;
import com.glority.android.chatbot2.handler.ChatbotSendMsgHandler;
import com.glority.generatedAPI.kotlinAPI.chatbot.Message;
import com.glority.generatedAPI.kotlinAPI.chatbot.SendMessageMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandlerChatBot.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0016\u0010\u0010\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/glority/android/chatbot2/chatbot/HandlerChatBot;", "Lcom/glority/android/chatbot2/chatbot/NormalChatBot;", "chatbotReceiveMsgHandler", "Lcom/glority/android/chatbot2/handler/ChatbotReceiveMsgHandler;", "chatbotSendMsgHandler", "Lcom/glority/android/chatbot2/handler/ChatbotSendMsgHandler;", "(Lcom/glority/android/chatbot2/handler/ChatbotReceiveMsgHandler;Lcom/glority/android/chatbot2/handler/ChatbotSendMsgHandler;)V", "chatbot", "Lcom/glority/android/chatbot2/chatbot/HandlerChatBot$Chatbot;", "getChatbot", "()Lcom/glority/android/chatbot2/chatbot/HandlerChatBot$Chatbot;", "receivedMsg", "", "replyMessageList", "", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/Message;", "receivedMsgInner", "sendGptMsg", "sendMessageMessage", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/SendMessageMessage;", "visible", "", "sendMsgInner", "Chatbot", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class HandlerChatBot extends NormalChatBot {
    private final Chatbot chatbot = new Chatbot(this);
    private final ChatbotReceiveMsgHandler chatbotReceiveMsgHandler;
    private final ChatbotSendMsgHandler chatbotSendMsgHandler;

    public HandlerChatBot(ChatbotReceiveMsgHandler chatbotReceiveMsgHandler, ChatbotSendMsgHandler chatbotSendMsgHandler) {
        this.chatbotReceiveMsgHandler = chatbotReceiveMsgHandler;
        this.chatbotSendMsgHandler = chatbotSendMsgHandler;
    }

    public final Chatbot getChatbot() {
        return this.chatbot;
    }

    @Override // com.glority.android.chatbot2.chatbot.NormalChatBot
    public void sendGptMsg(SendMessageMessage sendMessageMessage, boolean visible) {
        Intrinsics.checkNotNullParameter(sendMessageMessage, "sendMessageMessage");
        ChatbotSendMsgHandler chatbotSendMsgHandler = this.chatbotSendMsgHandler;
        if (chatbotSendMsgHandler == null || !chatbotSendMsgHandler.sendMsg(sendMessageMessage, this.chatbot)) {
            super.sendGptMsg(sendMessageMessage, visible);
        }
    }

    @Override // com.glority.android.chatbot2.chatbot.NormalChatBot
    public void receivedMsg(List<Message> replyMessageList) {
        Intrinsics.checkNotNullParameter(replyMessageList, "replyMessageList");
        ChatbotReceiveMsgHandler chatbotReceiveMsgHandler = this.chatbotReceiveMsgHandler;
        if (chatbotReceiveMsgHandler == null || !chatbotReceiveMsgHandler.receiveMsg(replyMessageList, this.chatbot)) {
            super.receivedMsg(replyMessageList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMsgInner(SendMessageMessage sendMessageMessage, boolean visible) {
        super.sendGptMsg(sendMessageMessage, visible);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void receivedMsgInner(List<Message> replyMessageList) {
        super.receivedMsg(replyMessageList);
    }

    /* compiled from: HandlerChatBot.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/chatbot2/chatbot/HandlerChatBot$Chatbot;", "", "handlerChatBot", "Lcom/glority/android/chatbot2/chatbot/HandlerChatBot;", "(Lcom/glority/android/chatbot2/chatbot/HandlerChatBot;)V", "receivedMsg", "", "replyMessageList", "", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/Message;", "sendCustomMsg", "chatBotBaseEntity", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "sendMsg", "sendMessageMessage", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/SendMessageMessage;", "visible", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Chatbot {
        private final HandlerChatBot handlerChatBot;

        public Chatbot(HandlerChatBot handlerChatBot) {
            Intrinsics.checkNotNullParameter(handlerChatBot, "handlerChatBot");
            this.handlerChatBot = handlerChatBot;
        }

        public static /* synthetic */ void sendMsg$default(Chatbot chatbot, SendMessageMessage sendMessageMessage, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            chatbot.sendMsg(sendMessageMessage, z);
        }

        public final void sendMsg(SendMessageMessage sendMessageMessage, boolean visible) {
            Intrinsics.checkNotNullParameter(sendMessageMessage, "sendMessageMessage");
            this.handlerChatBot.sendMsgInner(sendMessageMessage, visible);
        }

        public final void receivedMsg(List<Message> replyMessageList) {
            Intrinsics.checkNotNullParameter(replyMessageList, "replyMessageList");
            this.handlerChatBot.receivedMsgInner(replyMessageList);
        }

        public final void sendCustomMsg(BaseChatbotEntity chatBotBaseEntity) {
            Intrinsics.checkNotNullParameter(chatBotBaseEntity, "chatBotBaseEntity");
            this.handlerChatBot.sendCustomMsg(chatBotBaseEntity);
        }
    }
}
