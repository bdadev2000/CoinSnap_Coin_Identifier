package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import androidx.core.app.NotificationCompat;
import com.glority.android.core.definition.APIModelBase;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.enums.MessageDataEventType;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MessageDataEvent.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageDataEvent;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", NotificationCompat.CATEGORY_EVENT, "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageDataEventType;", "getEvent", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageDataEventType;", "setEvent", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageDataEventType;)V", "data", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageDataEventData;", "getData", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageDataEventData;", "setData", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageDataEventData;)V", "clone", "", "getJsonMap", "", "", "hashCode", "equals", "", "other", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MessageDataEvent extends APIModelBase<MessageDataEvent> implements Serializable, Cloneable {
    public MessageDataEventData data;
    public MessageDataEventType event;
    private final int unused;

    public MessageDataEvent() {
        this(0, 1, null);
    }

    public /* synthetic */ MessageDataEvent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public MessageDataEvent(int i) {
        this.unused = i;
    }

    public final MessageDataEventType getEvent() {
        MessageDataEventType messageDataEventType = this.event;
        if (messageDataEventType != null) {
            return messageDataEventType;
        }
        Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_EVENT);
        return null;
    }

    public final void setEvent(MessageDataEventType messageDataEventType) {
        Intrinsics.checkNotNullParameter(messageDataEventType, "<set-?>");
        this.event = messageDataEventType;
    }

    public final MessageDataEventData getData() {
        MessageDataEventData messageDataEventData = this.data;
        if (messageDataEventData != null) {
            return messageDataEventData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("data");
        return null;
    }

    public final void setData(MessageDataEventData messageDataEventData) {
        Intrinsics.checkNotNullParameter(messageDataEventData, "<set-?>");
        this.data = messageDataEventData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageDataEvent(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(NotificationCompat.CATEGORY_EVENT) && !obj.isNull(NotificationCompat.CATEGORY_EVENT)) {
            MessageDataEventType.Companion companion = MessageDataEventType.INSTANCE;
            String string = obj.getString(NotificationCompat.CATEGORY_EVENT);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            setEvent(companion.fromValue(string));
            if (obj.has("data") && !obj.isNull("data")) {
                JSONObject jSONObject = obj.getJSONObject("data");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                setData(new MessageDataEventData(jSONObject));
                return;
            }
            throw new Exception("data is required in MessageDataEvent");
        }
        throw new Exception("event is required in MessageDataEvent");
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        MessageDataEvent messageDataEvent = new MessageDataEvent(0, 1, null);
        Object clone = getData().clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.chatbot.MessageDataEventData");
        messageDataEvent.setData((MessageDataEventData) clone);
        messageDataEvent.setEvent(getEvent());
        return messageDataEvent;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        Map<String, Object> jsonMap = super.getJsonMap();
        Intrinsics.checkNotNull(jsonMap);
        jsonMap.put(NotificationCompat.CATEGORY_EVENT, getEvent().getEventName());
        jsonMap.put("data", getData().getJsonMap());
        return jsonMap;
    }

    public int hashCode() {
        return (((MessageDataEvent.class.hashCode() * 31) + getEvent().hashCode()) * 31) + getData().hashCode();
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof MessageDataEvent)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        MessageDataEvent messageDataEvent = (MessageDataEvent) other;
        return getEvent() == messageDataEvent.getEvent() && Intrinsics.areEqual(getData(), messageDataEvent.getData());
    }
}
