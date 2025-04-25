package com.glority.android.chatbot2.entity;

import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotWelcomeEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/glority/android/chatbot2/entity/ChatbotWelcomeEntity;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "text", "", "icon", "", "(Ljava/lang/String;I)V", "getIcon", "()I", "ignoreAvatarSize", "", "getIgnoreAvatarSize", "()Z", "setIgnoreAvatarSize", "(Z)V", "getText", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotWelcomeEntity extends BaseChatbotEntity {
    private final int icon;
    private boolean ignoreAvatarSize;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotWelcomeEntity(String text, int i) {
        super(MessageFrom.CHAT_BOT);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = i;
        this.ignoreAvatarSize = true;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.glority.android.chatbot2.entity.BaseChatbotEntity
    public boolean getIgnoreAvatarSize() {
        return this.ignoreAvatarSize;
    }

    @Override // com.glority.android.chatbot2.entity.BaseChatbotEntity
    public void setIgnoreAvatarSize(boolean z) {
        this.ignoreAvatarSize = z;
    }
}
