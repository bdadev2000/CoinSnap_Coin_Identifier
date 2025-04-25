package com.glority.android.picturexx.gpt;

import com.google.firebase.messaging.Constants;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.enums.MessageType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GPT4oMessageContentModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/gpt/GPT4oMessageContentModel;", "", "messageType", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageType;", "text", "", "<init>", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageType;Ljava/lang/String;)V", "getMessageType", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageType;", "getText", "()Ljava/lang/String;", "convertToJsonMap", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class GPT4oMessageContentModel {
    public static final int $stable = 0;
    private final MessageType messageType;
    private final String text;

    /* renamed from: component1, reason: from getter */
    public final MessageType getMessageType() {
        return this.messageType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final GPT4oMessageContentModel copy(MessageType messageType, String text) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(text, "text");
        return new GPT4oMessageContentModel(messageType, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GPT4oMessageContentModel)) {
            return false;
        }
        GPT4oMessageContentModel gPT4oMessageContentModel = (GPT4oMessageContentModel) other;
        return this.messageType == gPT4oMessageContentModel.messageType && Intrinsics.areEqual(this.text, gPT4oMessageContentModel.text);
    }

    public int hashCode() {
        return (this.messageType.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        return "GPT4oMessageContentModel(messageType=" + this.messageType + ", text=" + this.text + ")";
    }

    public GPT4oMessageContentModel(MessageType messageType, String text) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(text, "text");
        this.messageType = messageType;
        this.text = text;
    }

    public static /* synthetic */ GPT4oMessageContentModel copy$default(GPT4oMessageContentModel gPT4oMessageContentModel, MessageType messageType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            messageType = gPT4oMessageContentModel.messageType;
        }
        if ((i & 2) != 0) {
            str = gPT4oMessageContentModel.text;
        }
        return gPT4oMessageContentModel.copy(messageType, str);
    }

    public final MessageType getMessageType() {
        return this.messageType;
    }

    public final String getText() {
        return this.text;
    }

    public final Map<String, Object> convertToJsonMap() {
        return MapsKt.mapOf(TuplesKt.to(Constants.MessagePayloadKeys.MESSAGE_TYPE, Integer.valueOf(this.messageType.getValue())), TuplesKt.to("text", this.text));
    }
}
