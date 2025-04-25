package com.glority.android.chatbot2.entity;

import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotWelcome2Entity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/chatbot2/entity/ChatbotWelcome2Entity;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotWelcome2Entity extends BaseChatbotEntity {
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotWelcome2Entity(String text) {
        super(MessageFrom.CHAT_BOT);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    public final String getText() {
        return this.text;
    }
}
