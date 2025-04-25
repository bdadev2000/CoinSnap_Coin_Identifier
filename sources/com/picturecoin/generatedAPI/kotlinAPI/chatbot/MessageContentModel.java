package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.firebase.messaging.Constants;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.enums.MessageType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MessageContentModel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0016J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0014J\t\u0010\"\u001a\u00020\u0005HÂ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010$\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContentModel;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "messageType", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageType;", "getMessageType", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageType;", "setMessageType", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageType;)V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "component1", "copy", "toString", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class MessageContentModel extends APIModelBase<MessageContentModel> implements Serializable, Cloneable {
    public MessageType messageType;
    public String text;
    private final int unused;

    public MessageContentModel() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final MessageContentModel copy(int unused) {
        return new MessageContentModel(unused);
    }

    public String toString() {
        return "MessageContentModel(unused=" + this.unused + ")";
    }

    public /* synthetic */ MessageContentModel(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ MessageContentModel copy$default(MessageContentModel messageContentModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = messageContentModel.unused;
        }
        return messageContentModel.copy(i);
    }

    public MessageContentModel(int i) {
        this.unused = i;
    }

    public final MessageType getMessageType() {
        MessageType messageType = this.messageType;
        if (messageType != null) {
            return messageType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageType");
        return null;
    }

    public final void setMessageType(MessageType messageType) {
        Intrinsics.checkNotNullParameter(messageType, "<set-?>");
        this.messageType = messageType;
    }

    public final String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("text");
        return null;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageContentModel(JSONObject obj) {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Constants.MessagePayloadKeys.MESSAGE_TYPE) && !obj.isNull(Constants.MessagePayloadKeys.MESSAGE_TYPE)) {
            setMessageType(MessageType.INSTANCE.fromValue(obj.getInt(Constants.MessagePayloadKeys.MESSAGE_TYPE)));
            if (obj.has("text") && !obj.isNull("text")) {
                setText(obj.getString("text"));
                return;
            }
            throw new ParameterCheckFailException("text is missing in model MessageContentModel");
        }
        throw new ParameterCheckFailException("messageType is missing in model MessageContentModel");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.MessagePayloadKeys.MESSAGE_TYPE, Integer.valueOf(getMessageType().getValue()));
        hashMap.put("text", getText());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof MessageContentModel)) {
            return false;
        }
        MessageContentModel messageContentModel = (MessageContentModel) other;
        return getMessageType() == messageContentModel.getMessageType() && Intrinsics.areEqual(getText(), messageContentModel.getText());
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + getMessageType().hashCode()) * 31) + getText().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        MessageContentModel messageContentModel = new MessageContentModel(0, 1, null);
        cloneTo(messageContentModel);
        return messageContentModel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object other) {
        if (other != null && (other instanceof MessageContentModel)) {
            MessageContentModel messageContentModel = (MessageContentModel) other;
            messageContentModel.setMessageType(getMessageType());
            messageContentModel.setText(getText());
        }
    }
}
