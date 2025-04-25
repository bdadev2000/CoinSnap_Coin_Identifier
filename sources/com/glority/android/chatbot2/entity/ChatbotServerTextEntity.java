package com.glority.android.chatbot2.entity;

import com.glority.android.chatbot2.views.ChatbotFragment;
import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotServerTextEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u001aJ\r\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0014J\u0006\u0010\u001c\u001a\u00020\u001aR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/glority/android/chatbot2/entity/ChatbotServerTextEntity;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "text", "", "serverMessageId", "", "(Ljava/lang/String;J)V", "likeState", "", "Ljava/lang/Boolean;", "messageTags", "", "getMessageTags", "()Ljava/util/List;", "setMessageTags", "(Ljava/util/List;)V", "getServerMessageId", "()J", "showLikeDislike", "getShowLikeDislike", "()Ljava/lang/Boolean;", "setShowLikeDislike", "(Ljava/lang/Boolean;)V", "getText", "()Ljava/lang/String;", ChatbotFragment.MESSAGE_TAG_DISLIKE, "", "isLike", ChatbotFragment.MESSAGE_TAG_LIKE, "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public class ChatbotServerTextEntity extends BaseChatbotEntity {
    private Boolean likeState;
    private List<String> messageTags;
    private final long serverMessageId;
    private Boolean showLikeDislike;
    private final String text;

    public final long getServerMessageId() {
        return this.serverMessageId;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotServerTextEntity(String text, long j) {
        super(MessageFrom.CHAT_BOT);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.serverMessageId = j;
    }

    public final List<String> getMessageTags() {
        return this.messageTags;
    }

    public final void setMessageTags(List<String> list) {
        this.messageTags = list;
    }

    public final Boolean getShowLikeDislike() {
        return this.showLikeDislike;
    }

    public final void setShowLikeDislike(Boolean bool) {
        this.showLikeDislike = bool;
    }

    /* renamed from: isLike, reason: from getter */
    public final Boolean getLikeState() {
        return this.likeState;
    }

    public final void like() {
        this.likeState = true;
    }

    public final void dislike() {
        this.likeState = false;
    }
}
