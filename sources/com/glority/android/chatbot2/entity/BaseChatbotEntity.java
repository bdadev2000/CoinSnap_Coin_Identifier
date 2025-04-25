package com.glority.android.chatbot2.entity;

import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseChatbotEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "", "messageFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageFrom;", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageFrom;)V", "autoScrollToThisItem", "", "getAutoScrollToThisItem", "()Z", "setAutoScrollToThisItem", "(Z)V", "avatarIcon", "", "getAvatarIcon", "()Ljava/lang/Integer;", "setAvatarIcon", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "ignoreAvatarSize", "getIgnoreAvatarSize", "setIgnoreAvatarSize", "getMessageFrom", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageFrom;", "showAvatar", "getShowAvatar", "()Ljava/lang/Boolean;", "setShowAvatar", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "visible", "getVisible", "setVisible", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public abstract class BaseChatbotEntity {
    private boolean autoScrollToThisItem;
    private Integer avatarIcon;
    private boolean ignoreAvatarSize;
    private final MessageFrom messageFrom;
    private Boolean showAvatar;
    private boolean visible;

    public BaseChatbotEntity(MessageFrom messageFrom) {
        Intrinsics.checkNotNullParameter(messageFrom, "messageFrom");
        this.messageFrom = messageFrom;
        this.visible = true;
        this.autoScrollToThisItem = true;
    }

    public final MessageFrom getMessageFrom() {
        return this.messageFrom;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }

    public final Boolean getShowAvatar() {
        return this.showAvatar;
    }

    public final void setShowAvatar(Boolean bool) {
        this.showAvatar = bool;
    }

    public final Integer getAvatarIcon() {
        return this.avatarIcon;
    }

    public final void setAvatarIcon(Integer num) {
        this.avatarIcon = num;
    }

    public boolean getIgnoreAvatarSize() {
        return this.ignoreAvatarSize;
    }

    public void setIgnoreAvatarSize(boolean z) {
        this.ignoreAvatarSize = z;
    }

    public boolean getAutoScrollToThisItem() {
        return this.autoScrollToThisItem;
    }

    public void setAutoScrollToThisItem(boolean z) {
        this.autoScrollToThisItem = z;
    }
}
