package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.google.firebase.messaging.Constants;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.enums.MessageFrom;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Message.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001AB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u00104\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#0!2\u0006\u00105\u001a\u000206J\u0016\u00104\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H\u0016J\u0013\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u00109\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020#H\u0016J\u0012\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010#H\u0014J\t\u0010>\u001a\u00020\u0005HÂ\u0003J\u0013\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010@\u001a\u00020\"HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006B"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/Message;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "messageId", "", "getMessageId", "()J", "setMessageId", "(J)V", Args.sessionId, "getSessionId", "setSessionId", "from", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;", "getFrom", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;", "setFrom", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;)V", "messageContent", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContent;", "getMessageContent", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContent;", "setMessageContent", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContent;)V", Args.extraFields, "", "", "", "getExtraFields", "()Ljava/util/Map;", "setExtraFields", "(Ljava/util/Map;)V", "messageTags", "", "getMessageTags", "()Ljava/util/List;", "setMessageTags", "(Ljava/util/List;)V", "sendAt", "Ljava/util/Date;", "getSendAt", "()Ljava/util/Date;", "setSendAt", "(Ljava/util/Date;)V", "getJsonMap", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class Message extends APIModelBase<Message> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Map<String, ? extends Object> extraFields;
    public MessageFrom from;
    public MessageContent messageContent;
    private long messageId;
    private List<String> messageTags;
    public Date sendAt;
    private long sessionId;
    private int unused;

    public Message() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final Message copy(int unused) {
        return new Message(unused);
    }

    public String toString() {
        return "Message(unused=" + this.unused + ")";
    }

    public Message(int i) {
        this.unused = i;
    }

    public /* synthetic */ Message(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ Message copy$default(Message message, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = message.unused;
        }
        return message.copy(i);
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public final void setMessageId(long j) {
        this.messageId = j;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(long j) {
        this.sessionId = j;
    }

    public final MessageFrom getFrom() {
        MessageFrom messageFrom = this.from;
        if (messageFrom != null) {
            return messageFrom;
        }
        Intrinsics.throwUninitializedPropertyAccessException("from");
        return null;
    }

    public final void setFrom(MessageFrom messageFrom) {
        Intrinsics.checkNotNullParameter(messageFrom, "<set-?>");
        this.from = messageFrom;
    }

    public final MessageContent getMessageContent() {
        MessageContent messageContent = this.messageContent;
        if (messageContent != null) {
            return messageContent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageContent");
        return null;
    }

    public final void setMessageContent(MessageContent messageContent) {
        Intrinsics.checkNotNullParameter(messageContent, "<set-?>");
        this.messageContent = messageContent;
    }

    public final Map<String, Object> getExtraFields() {
        return this.extraFields;
    }

    public final void setExtraFields(Map<String, ? extends Object> map) {
        this.extraFields = map;
    }

    public final List<String> getMessageTags() {
        return this.messageTags;
    }

    public final void setMessageTags(List<String> list) {
        this.messageTags = list;
    }

    public final Date getSendAt() {
        Date date = this.sendAt;
        if (date != null) {
            return date;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sendAt");
        return null;
    }

    public final void setSendAt(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.sendAt = date;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Message(org.json.JSONObject r7) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.chatbot.Message.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.MessagePayloadKeys.MSGID_SERVER, Long.valueOf(this.messageId));
        hashMap.put("session_id", Long.valueOf(this.sessionId));
        hashMap.put("from", Integer.valueOf(getFrom().getValue()));
        hashMap.put("message_content", getMessageContent().getJsonMap());
        Map<String, ? extends Object> map = this.extraFields;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            hashMap.put("extra_fields", map);
        } else if (keepNull) {
            hashMap.put("extra_fields", null);
        }
        List<String> list = this.messageTags;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("message_tags", list);
        } else if (keepNull) {
            hashMap.put("message_tags", null);
        }
        hashMap.put("send_at", Long.valueOf(getSendAt().getTime() / 1000));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return this.messageId == message.messageId && this.sessionId == message.sessionId && getFrom() == message.getFrom() && Intrinsics.areEqual(getMessageContent(), message.getMessageContent()) && Intrinsics.areEqual(this.extraFields, message.extraFields) && Intrinsics.areEqual(this.messageTags, message.messageTags) && Intrinsics.areEqual(getSendAt(), message.getSendAt());
    }

    public int hashCode() {
        int hashCode = ((((((((getClass().hashCode() * 31) + Long.hashCode(this.messageId)) * 31) + Long.hashCode(this.sessionId)) * 31) + getFrom().hashCode()) * 31) + getMessageContent().hashCode()) * 31;
        Map<String, ? extends Object> map = this.extraFields;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        List<String> list = this.messageTags;
        return ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + getSendAt().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Message message = new Message(0, 1, null);
        cloneTo(message);
        return message;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.chatbot.Message");
        Message message = (Message) o;
        super.cloneTo(message);
        message.messageId = cloneField(Long.valueOf(this.messageId)).longValue();
        message.sessionId = cloneField(Long.valueOf(this.sessionId)).longValue();
        message.setFrom((MessageFrom) cloneField(getFrom()));
        message.setMessageContent((MessageContent) cloneField(getMessageContent()));
        Map<String, Object> map = this.extraFields;
        message.extraFields = map != null ? cloneField(map) : null;
        if (this.messageTags == null) {
            message.messageTags = null;
        } else {
            message.messageTags = new ArrayList();
            List<String> list = this.messageTags;
            Intrinsics.checkNotNull(list);
            for (String str : list) {
                List<String> list2 = message.messageTags;
                Intrinsics.checkNotNull(list2);
                String cloneField = cloneField(str);
                Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
                list2.add(cloneField);
            }
        }
        message.setSendAt(cloneField(getSendAt()));
    }

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/Message$Companion;", "", "<init>", "()V", "getMessageJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/Message;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getMessageJsonArrayMap(List<Message> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Message) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("messageTags", String.class);
            return hashMap;
        }
    }
}
