package com.glority.generatedAPI.kotlinAPI.chatbot;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SendMessageMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001SBe\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\b\u00101\u001a\u00020\tH\u0016J\b\u00102\u001a\u000203H\u0016J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0019\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0003Jy\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010=\u001a\u0002032\b\u0010>\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010?\u001a\u000203H\u0016J\u0014\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020A0\u0010H\u0016J\u0014\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010C\u001a\u00020DH\u0016J\u0013\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0FH\u0016¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u000203H\u0016J\b\u0010I\u001a\u000203H\u0016J\u0012\u0010J\u001a\u0002032\b\u0010>\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010K\u001a\u00020\tHÖ\u0001J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020M2\u0006\u0010Q\u001a\u00020RH\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R \u0010'\u001a\b\u0012\u0004\u0012\u00020(0\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016¨\u0006T"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/SendMessageMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", Args.sessionId, "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", LogEventArguments.ARG_MESSAGE, "itemIds", "", Args.itemType, Args.uid, Args.extraFields, "", "", "(JLcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getExtraFields", "()Ljava/util/Map;", "setExtraFields", "(Ljava/util/Map;)V", "getItemIds", "()Ljava/util/List;", "setItemIds", "(Ljava/util/List;)V", "getItemType", "setItemType", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getMessage", "setMessage", "replyMessageList", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/Message;", "getReplyMessageList", "setReplyMessageList", "getSessionId", "()J", "setSessionId", "(J)V", "getUid", "setUid", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "forceHttps", "getFiles", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class SendMessageMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private Map<String, ? extends Object> extraFields;
    private List<Long> itemIds;
    private String itemType;
    private LanguageCode languageCode;
    private String message;
    public List<Message> replyMessageList;
    private long sessionId;
    private String uid;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<Long> component5() {
        return this.itemIds;
    }

    /* renamed from: component6, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final Map<String, Object> component8() {
        return this.extraFields;
    }

    public final SendMessageMessage copy(long sessionId, LanguageCode languageCode, String countryCode, String message, List<Long> itemIds, String itemType, String uid, Map<String, ? extends Object> extraFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new SendMessageMessage(sessionId, languageCode, countryCode, message, itemIds, itemType, uid, extraFields);
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
        return "SendMessageMessage(sessionId=" + this.sessionId + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", message=" + this.message + ", itemIds=" + this.itemIds + ", itemType=" + this.itemType + ", uid=" + this.uid + ", extraFields=" + this.extraFields + ")";
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(long j) {
        this.sessionId = j;
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final List<Long> getItemIds() {
        return this.itemIds;
    }

    public final void setItemIds(List<Long> list) {
        this.itemIds = list;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final Map<String, Object> getExtraFields() {
        return this.extraFields;
    }

    public final void setExtraFields(Map<String, ? extends Object> map) {
        this.extraFields = map;
    }

    public SendMessageMessage(long j, LanguageCode languageCode, String str, String message, List<Long> list, String str2, String str3, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.sessionId = j;
        this.languageCode = languageCode;
        this.countryCode = str;
        this.message = message;
        this.itemIds = list;
        this.itemType = str2;
        this.uid = str3;
        this.extraFields = map;
    }

    public final List<Message> getReplyMessageList() {
        List<Message> list = this.replyMessageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replyMessageList");
        }
        return list;
    }

    public final void setReplyMessageList(List<Message> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.replyMessageList = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("reply_message_list") && !obj.isNull("reply_message_list")) {
            JSONArray jSONArray = obj.getJSONArray("reply_message_list");
            this.replyMessageList = new ArrayList();
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    if (obj2 != null) {
                        Message message = new Message((JSONObject) obj2);
                        List<Message> list = this.replyMessageList;
                        if (list == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("replyMessageList");
                        }
                        Intrinsics.checkNotNull(list);
                        list.add(message);
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
            }
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("reply_message_list is missing in api SendMessage");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", Long.valueOf(this.sessionId));
        LanguageCode languageCode = this.languageCode;
        if (languageCode != null) {
            Intrinsics.checkNotNull(languageCode);
            hashMap.put("language_code", Integer.valueOf(languageCode.getValue()));
        }
        String str = this.countryCode;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("country_code", str);
        }
        hashMap.put(LogEventArguments.ARG_MESSAGE, this.message);
        List<Long> list = this.itemIds;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("item_ids", list);
        }
        String str2 = this.itemType;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("item_type", str2);
        }
        String str3 = this.uid;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put(Args.uid, str3);
        }
        Map<String, ? extends Object> map = this.extraFields;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            hashMap.put("extra_fields", map);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof SendMessageMessage)) {
            return false;
        }
        SendMessageMessage sendMessageMessage = (SendMessageMessage) other;
        return (this.sessionId != sendMessageMessage.sessionId || this.languageCode != sendMessageMessage.languageCode || (Intrinsics.areEqual(this.countryCode, sendMessageMessage.countryCode) ^ true) || (Intrinsics.areEqual(this.message, sendMessageMessage.message) ^ true) || (Intrinsics.areEqual(this.itemIds, sendMessageMessage.itemIds) ^ true) || (Intrinsics.areEqual(this.itemType, sendMessageMessage.itemType) ^ true) || (Intrinsics.areEqual(this.uid, sendMessageMessage.uid) ^ true) || (Intrinsics.areEqual(this.extraFields, sendMessageMessage.extraFields) ^ true)) ? false : true;
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
        if (other == null || !(other instanceof SendMessageMessage)) {
            return false;
        }
        SendMessageMessage sendMessageMessage = (SendMessageMessage) other;
        if (this.sessionId != sendMessageMessage.sessionId || this.languageCode != sendMessageMessage.languageCode || (!Intrinsics.areEqual(this.countryCode, sendMessageMessage.countryCode)) || (!Intrinsics.areEqual(this.message, sendMessageMessage.message)) || (!Intrinsics.areEqual(this.itemIds, sendMessageMessage.itemIds)) || (!Intrinsics.areEqual(this.itemType, sendMessageMessage.itemType)) || (!Intrinsics.areEqual(this.uid, sendMessageMessage.uid)) || (!Intrinsics.areEqual(this.extraFields, sendMessageMessage.extraFields))) {
            return false;
        }
        List<Message> list = this.replyMessageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replyMessageList");
        }
        List<Message> list2 = sendMessageMessage.replyMessageList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replyMessageList");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + Long.hashCode(this.sessionId)) * 31;
        LanguageCode languageCode = this.languageCode;
        int hashCode2 = (hashCode + (languageCode != null ? languageCode.hashCode() : 0)) * 31;
        String str = this.countryCode;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.message.hashCode()) * 31;
        List<Long> list = this.itemIds;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.itemType;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.uid;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.extraFields;
        int hashCode7 = (hashCode6 + (map != null ? map.hashCode() : 0)) * 31;
        List<Message> list2 = this.replyMessageList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replyMessageList");
        }
        return hashCode7 + list2.hashCode();
    }

    /* compiled from: SendMessageMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/SendMessageMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v3/chatbot/send_message";
        }
    }
}
