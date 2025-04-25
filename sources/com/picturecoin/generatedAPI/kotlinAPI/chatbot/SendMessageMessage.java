package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.abtesting.network.AbtestLogEvent;
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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XBm\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0016J\u0014\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0014\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020?0\u0011H\u0016J\u0012\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010C\u001a\u00020\tH\u0016J\b\u0010D\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020AH\u0016J\b\u0010F\u001a\u00020AH\u0016J\b\u0010G\u001a\u00020AH\u0016J\u0013\u0010H\u001a\b\u0012\u0004\u0012\u00020\t0IH\u0016¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010L\u001a\u00020MH\u0016J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0019\u0010U\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011HÆ\u0003J\u007f\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011HÆ\u0001J\t\u0010W\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010/\u001a\b\u0012\u0004\u0012\u0002000\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R \u00103\u001a\b\u0012\u0004\u0012\u0002000\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$¨\u0006Y"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/SendMessageMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", Args.sessionId, "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "messageContents", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContent;", "itemIds", Args.itemType, Args.uid, Args.extraFields, "", "", "<init>", "(JLcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getSessionId", "()J", "setSessionId", "(J)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getMessageContents", "()Ljava/util/List;", "setMessageContents", "(Ljava/util/List;)V", "getItemIds", "setItemIds", "getItemType", "setItemType", "getUid", "setUid", "getExtraFields", "()Ljava/util/Map;", "setExtraFields", "(Ljava/util/Map;)V", "questionMessageList", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/Message;", "getQuestionMessageList", "setQuestionMessageList", "replyMessageList", "getReplyMessageList", "setReplyMessageList", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class SendMessageMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private Map<String, ? extends Object> extraFields;
    private List<Long> itemIds;
    private String itemType;
    private LanguageCode languageCode;
    private List<MessageContent> messageContents;
    public List<Message> questionMessageList;
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

    public final List<MessageContent> component4() {
        return this.messageContents;
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

    public final SendMessageMessage copy(long sessionId, LanguageCode languageCode, String countryCode, List<MessageContent> messageContents, List<Long> itemIds, String itemType, String uid, Map<String, ? extends Object> extraFields) {
        Intrinsics.checkNotNullParameter(messageContents, "messageContents");
        return new SendMessageMessage(sessionId, languageCode, countryCode, messageContents, itemIds, itemType, uid, extraFields);
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
        return "SendMessageMessage(sessionId=" + this.sessionId + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", messageContents=" + this.messageContents + ", itemIds=" + this.itemIds + ", itemType=" + this.itemType + ", uid=" + this.uid + ", extraFields=" + this.extraFields + ")";
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

    public final List<MessageContent> getMessageContents() {
        return this.messageContents;
    }

    public final void setMessageContents(List<MessageContent> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.messageContents = list;
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

    public SendMessageMessage(long j, LanguageCode languageCode, String str, List<MessageContent> messageContents, List<Long> list, String str2, String str3, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(messageContents, "messageContents");
        this.sessionId = j;
        this.languageCode = languageCode;
        this.countryCode = str;
        this.messageContents = messageContents;
        this.itemIds = list;
        this.itemType = str2;
        this.uid = str3;
        this.extraFields = map;
    }

    public final List<Message> getQuestionMessageList() {
        List<Message> list = this.questionMessageList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("questionMessageList");
        return null;
    }

    public final void setQuestionMessageList(List<Message> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.questionMessageList = list;
    }

    public final List<Message> getReplyMessageList() {
        List<Message> list = this.replyMessageList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("replyMessageList");
        return null;
    }

    public final void setReplyMessageList(List<Message> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.replyMessageList = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("question_message_list") && !obj.isNull("question_message_list")) {
            JSONArray jSONArray = obj.getJSONArray("question_message_list");
            setQuestionMessageList(new ArrayList());
            int length = jSONArray.length() - 1;
            int i = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i2);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    Message message = new Message((JSONObject) obj2);
                    List<Message> questionMessageList = getQuestionMessageList();
                    Intrinsics.checkNotNull(questionMessageList);
                    questionMessageList.add(message);
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (obj.has("reply_message_list") && !obj.isNull("reply_message_list")) {
                JSONArray jSONArray2 = obj.getJSONArray("reply_message_list");
                setReplyMessageList(new ArrayList());
                int length2 = jSONArray2.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        Object obj3 = jSONArray2.get(i);
                        if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                            obj3 = new JSONObject();
                        }
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                        Message message2 = new Message((JSONObject) obj3);
                        List<Message> replyMessageList = getReplyMessageList();
                        Intrinsics.checkNotNull(replyMessageList);
                        replyMessageList.add(message2);
                        if (i == length2) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                this._response_at = new Date();
                return;
            }
            throw new ParameterCheckFailException("reply_message_list is missing in api SendMessage");
        }
        throw new ParameterCheckFailException("question_message_list is missing in api SendMessage");
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
        hashMap.put("message_contents", MessageContent.INSTANCE.getMessageContentJsonArrayMap(this.messageContents));
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
        return this.sessionId == sendMessageMessage.sessionId && this.languageCode == sendMessageMessage.languageCode && Intrinsics.areEqual(this.countryCode, sendMessageMessage.countryCode) && Intrinsics.areEqual(this.messageContents, sendMessageMessage.messageContents) && Intrinsics.areEqual(this.itemIds, sendMessageMessage.itemIds) && Intrinsics.areEqual(this.itemType, sendMessageMessage.itemType) && Intrinsics.areEqual(this.uid, sendMessageMessage.uid) && Intrinsics.areEqual(this.extraFields, sendMessageMessage.extraFields);
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
        return this.sessionId == sendMessageMessage.sessionId && this.languageCode == sendMessageMessage.languageCode && Intrinsics.areEqual(this.countryCode, sendMessageMessage.countryCode) && Intrinsics.areEqual(this.messageContents, sendMessageMessage.messageContents) && Intrinsics.areEqual(this.itemIds, sendMessageMessage.itemIds) && Intrinsics.areEqual(this.itemType, sendMessageMessage.itemType) && Intrinsics.areEqual(this.uid, sendMessageMessage.uid) && Intrinsics.areEqual(this.extraFields, sendMessageMessage.extraFields) && Intrinsics.areEqual(getQuestionMessageList(), sendMessageMessage.getQuestionMessageList()) && Intrinsics.areEqual(getReplyMessageList(), sendMessageMessage.getReplyMessageList());
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + Long.hashCode(this.sessionId)) * 31;
        LanguageCode languageCode = this.languageCode;
        int hashCode2 = (hashCode + (languageCode != null ? languageCode.hashCode() : 0)) * 31;
        String str = this.countryCode;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.messageContents.hashCode()) * 31;
        List<Long> list = this.itemIds;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.itemType;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.uid;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.extraFields;
        return ((((hashCode6 + (map != null ? map.hashCode() : 0)) * 31) + getQuestionMessageList().hashCode()) * 31) + getReplyMessageList().hashCode();
    }

    /* compiled from: SendMessageMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/SendMessageMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v4/chatbot/send_message";
        }
    }
}
