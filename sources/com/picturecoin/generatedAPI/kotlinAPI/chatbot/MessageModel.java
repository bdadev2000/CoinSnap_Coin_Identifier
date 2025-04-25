package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.google.firebase.messaging.Constants;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.enums.MessageFrom;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageModel.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#0!2\u0006\u0010/\u001a\u000200J\u0016\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H\u0016J\u0013\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u00103\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020#H\u0016J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010#H\u0014J\t\u00108\u001a\u00020\u0005HÂ\u0003J\u0013\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010:\u001a\u00020\"HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#0!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020\"0)X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006;"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageModel;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "messageId", "", "getMessageId", "()J", "setMessageId", "(J)V", Args.sessionId, "getSessionId", "setSessionId", "from", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;", "getFrom", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;", "setFrom", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;)V", "messageContent", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContentModel;", "getMessageContent", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContentModel;", "setMessageContent", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContentModel;)V", Args.extraFields, "", "", "", "getExtraFields", "()Ljava/util/Map;", "setExtraFields", "(Ljava/util/Map;)V", "messageTags", "", "getMessageTags", "()Ljava/util/List;", "setMessageTags", "(Ljava/util/List;)V", "getJsonMap", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class MessageModel extends APIModelBase<MessageModel> implements Serializable, Cloneable {
    public Map<String, ? extends Object> extraFields;
    public MessageFrom from;
    public MessageContentModel messageContent;
    private long messageId;
    public List<String> messageTags;
    private long sessionId;
    private final int unused;

    public MessageModel() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final MessageModel copy(int unused) {
        return new MessageModel(unused);
    }

    public String toString() {
        return "MessageModel(unused=" + this.unused + ")";
    }

    public /* synthetic */ MessageModel(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ MessageModel copy$default(MessageModel messageModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = messageModel.unused;
        }
        return messageModel.copy(i);
    }

    public MessageModel(int i) {
        this.unused = i;
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

    public final MessageContentModel getMessageContent() {
        MessageContentModel messageContentModel = this.messageContent;
        if (messageContentModel != null) {
            return messageContentModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageContent");
        return null;
    }

    public final void setMessageContent(MessageContentModel messageContentModel) {
        Intrinsics.checkNotNullParameter(messageContentModel, "<set-?>");
        this.messageContent = messageContentModel;
    }

    public final Map<String, Object> getExtraFields() {
        Map<String, ? extends Object> map = this.extraFields;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.extraFields);
        return null;
    }

    public final void setExtraFields(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extraFields = map;
    }

    public final List<String> getMessageTags() {
        List<String> list = this.messageTags;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageTags");
        return null;
    }

    public final void setMessageTags(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.messageTags = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageModel(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.chatbot.MessageModel.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.MessagePayloadKeys.MSGID_SERVER, Long.valueOf(this.messageId));
        hashMap.put("session_id", Long.valueOf(this.sessionId));
        hashMap.put("from", Integer.valueOf(getFrom().getValue()));
        hashMap.put("message_content", getMessageContent().getJsonMap(keepNull));
        hashMap.put("extra_fields", getExtraFields());
        hashMap.put("message_tags", getMessageTags());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof MessageModel)) {
            return false;
        }
        MessageModel messageModel = (MessageModel) other;
        return this.messageId == messageModel.messageId && this.sessionId == messageModel.sessionId && getFrom() == messageModel.getFrom() && Intrinsics.areEqual(getMessageContent(), messageModel.getMessageContent()) && Intrinsics.areEqual(getExtraFields(), messageModel.getExtraFields()) && Intrinsics.areEqual(getMessageTags(), messageModel.getMessageTags());
    }

    public int hashCode() {
        return (((((((((((getClass().hashCode() * 31) + Long.hashCode(this.messageId)) * 31) + Long.hashCode(this.sessionId)) * 31) + getFrom().hashCode()) * 31) + getMessageContent().hashCode()) * 31) + getExtraFields().hashCode()) * 31) + getMessageTags().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        MessageModel messageModel = new MessageModel(0, 1, null);
        cloneTo(messageModel);
        return messageModel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.chatbot.MessageModel");
        MessageModel messageModel = (MessageModel) o;
        super.cloneTo(messageModel);
        messageModel.messageId = cloneField(Long.valueOf(this.messageId)).longValue();
        messageModel.sessionId = cloneField(Long.valueOf(this.sessionId)).longValue();
        messageModel.setFrom((MessageFrom) cloneField(getFrom()));
        messageModel.setMessageContent((MessageContentModel) cloneField(getMessageContent()));
        messageModel.setExtraFields(cloneField(getExtraFields()));
        messageModel.setMessageTags(new ArrayList());
        List<String> messageTags = getMessageTags();
        Intrinsics.checkNotNull(messageTags);
        for (String str : messageTags) {
            List<String> messageTags2 = messageModel.getMessageTags();
            Intrinsics.checkNotNull(messageTags2);
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            messageTags2.add(cloneField);
        }
    }
}
