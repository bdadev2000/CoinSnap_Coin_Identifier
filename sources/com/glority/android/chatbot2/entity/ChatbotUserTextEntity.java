package com.glority.android.chatbot2.entity;

import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotUserTextEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/chatbot2/entity/ChatbotUserTextEntity;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "text", "", "(Ljava/lang/String;)V", "isSendError", "", "()Z", "setSendError", "(Z)V", "getText", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotUserTextEntity extends BaseChatbotEntity {
    private boolean isSendError;
    private final String text;

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotUserTextEntity(String text) {
        super(MessageFrom.USER);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    /* renamed from: isSendError, reason: from getter */
    public final boolean getIsSendError() {
        return this.isSendError;
    }

    public final void setSendError(boolean z) {
        this.isSendError = z;
    }
}
