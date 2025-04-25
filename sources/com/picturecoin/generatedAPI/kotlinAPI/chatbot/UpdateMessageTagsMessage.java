package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UpdateMessageTagsMessage.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020\bH\u0016J\b\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0(H\u0016¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J%\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u00062"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/UpdateMessageTagsMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "messageId", "", "messageTags", "", "", "<init>", "(JLjava/util/List;)V", "getMessageId", "()J", "setMessageId", "(J)V", "getMessageTags", "()Ljava/util/List;", "setMessageTags", "(Ljava/util/List;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class UpdateMessageTagsMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long messageId;
    private List<String> messageTags;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    public final List<String> component2() {
        return this.messageTags;
    }

    public final UpdateMessageTagsMessage copy(long messageId, List<String> messageTags) {
        return new UpdateMessageTagsMessage(messageId, messageTags);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return true;
    }

    public String toString() {
        return "UpdateMessageTagsMessage(messageId=" + this.messageId + ", messageTags=" + this.messageTags + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateMessageTagsMessage copy$default(UpdateMessageTagsMessage updateMessageTagsMessage, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = updateMessageTagsMessage.messageId;
        }
        if ((i & 2) != 0) {
            list = updateMessageTagsMessage.messageTags;
        }
        return updateMessageTagsMessage.copy(j, list);
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public final void setMessageId(long j) {
        this.messageId = j;
    }

    public final List<String> getMessageTags() {
        return this.messageTags;
    }

    public final void setMessageTags(List<String> list) {
        this.messageTags = list;
    }

    public UpdateMessageTagsMessage(long j, List<String> list) {
        this.messageId = j;
        this.messageTags = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this._response_at = new Date();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.MessagePayloadKeys.MSGID_SERVER, Long.valueOf(this.messageId));
        List<String> list = this.messageTags;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("message_tags", list);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof UpdateMessageTagsMessage)) {
            return false;
        }
        UpdateMessageTagsMessage updateMessageTagsMessage = (UpdateMessageTagsMessage) other;
        return this.messageId == updateMessageTagsMessage.messageId && Intrinsics.areEqual(this.messageTags, updateMessageTagsMessage.messageTags);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{"post"};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UpdateMessageTagsMessage)) {
            return false;
        }
        UpdateMessageTagsMessage updateMessageTagsMessage = (UpdateMessageTagsMessage) other;
        return this.messageId == updateMessageTagsMessage.messageId && Intrinsics.areEqual(this.messageTags, updateMessageTagsMessage.messageTags);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + Long.hashCode(this.messageId)) * 31;
        List<String> list = this.messageTags;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    /* compiled from: UpdateMessageTagsMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/UpdateMessageTagsMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v4/chatbot/update_message_tags";
        }
    }
}
