package com.glority.android.chatbot2;

import com.glority.android.chatbot2.chatbot.NormalChatBot;
import com.glority.android.chatbot2.config.ChatBotChatConfig;
import com.glority.android.chatbot2.config.ChatbotSurveyConfig;
import com.glority.android.chatbot2.config.ChatbotUiConfig;
import com.glority.android.chatbot2.views.ChatbotFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotLauncher.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/glority/android/chatbot2/ChatbotLauncher;", "", "()V", "getChatbotFragment", "Lcom/glority/android/chatbot2/views/ChatbotFragment;", "chatbot", "Lcom/glority/android/chatbot2/chatbot/NormalChatBot;", "chatBotChatConfig", "Lcom/glority/android/chatbot2/config/ChatBotChatConfig;", "chatbotUiConfig", "Lcom/glority/android/chatbot2/config/ChatbotUiConfig;", "chatbotSurveyConfig", "Lcom/glority/android/chatbot2/config/ChatbotSurveyConfig;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotLauncher {
    public static final ChatbotLauncher INSTANCE = new ChatbotLauncher();

    private ChatbotLauncher() {
    }

    public static /* synthetic */ ChatbotFragment getChatbotFragment$default(ChatbotLauncher chatbotLauncher, NormalChatBot normalChatBot, ChatBotChatConfig chatBotChatConfig, ChatbotUiConfig chatbotUiConfig, ChatbotSurveyConfig chatbotSurveyConfig, int i, Object obj) {
        if ((i & 8) != 0) {
            chatbotSurveyConfig = null;
        }
        return chatbotLauncher.getChatbotFragment(normalChatBot, chatBotChatConfig, chatbotUiConfig, chatbotSurveyConfig);
    }

    public final ChatbotFragment getChatbotFragment(NormalChatBot chatbot, ChatBotChatConfig chatBotChatConfig, ChatbotUiConfig chatbotUiConfig, ChatbotSurveyConfig chatbotSurveyConfig) {
        Intrinsics.checkNotNullParameter(chatbot, "chatbot");
        Intrinsics.checkNotNullParameter(chatBotChatConfig, "chatBotChatConfig");
        Intrinsics.checkNotNullParameter(chatbotUiConfig, "chatbotUiConfig");
        chatbot.setChatbotChatConfig(chatBotChatConfig);
        ChatbotFragment chatbotFragment = new ChatbotFragment();
        chatbotFragment.setChatbot(chatbot, chatBotChatConfig, chatbotUiConfig, chatbotSurveyConfig);
        return chatbotFragment;
    }
}
