package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.definition.APIModelBase;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MessageDataEvent.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageDataEventData;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "clone", "", "getJsonMap", "", "hashCode", "equals", "", "other", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MessageDataEventData extends APIModelBase<MessageDataEventData> implements Serializable, Cloneable {
    public String content;
    private final int unused;

    public MessageDataEventData() {
        this(0, 1, null);
    }

    public /* synthetic */ MessageDataEventData(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public MessageDataEventData(int i) {
        this.unused = i;
    }

    public final String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("content");
        return null;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageDataEventData(JSONObject jsonObject) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (jsonObject.has("content") && !jsonObject.isNull("content")) {
            setContent(jsonObject.getString("content"));
            return;
        }
        throw new Exception("content is required in MessageDataEventData");
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        MessageDataEventData messageDataEventData = new MessageDataEventData(0, 1, null);
        messageDataEventData.setContent(getContent());
        return messageDataEventData;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        Map<String, Object> jsonMap = super.getJsonMap();
        Intrinsics.checkNotNull(jsonMap);
        jsonMap.put("content", getContent());
        return jsonMap;
    }

    public int hashCode() {
        return (MessageDataEventData.class.hashCode() * 31) + getContent().hashCode();
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof MessageDataEventData)) {
            return this == other || Intrinsics.areEqual(getContent(), ((MessageDataEventData) other).getContent());
        }
        return false;
    }
}
