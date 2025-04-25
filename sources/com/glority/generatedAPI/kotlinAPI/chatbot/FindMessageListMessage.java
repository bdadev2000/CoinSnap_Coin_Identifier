package com.glority.generatedAPI.kotlinAPI.chatbot;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.generatedAPI.kotlinAPI.chatbot.enums.OrderBy;
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

/* compiled from: FindMessageListMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JB1\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010(\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003JD\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u00020*H\u0016J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020807H\u0016J\u0014\u00109\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020407H\u0016J\b\u0010:\u001a\u00020;H\u0016J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0=H\u0016¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020*H\u0016J\b\u0010@\u001a\u00020*H\u0016J\u0012\u0010A\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\t\u0010B\u001a\u00020\fHÖ\u0001J\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020IH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019¨\u0006K"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/FindMessageListMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "lastMessageId", "", Args.sessionId, "orderBy", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/enums/OrderBy;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/glority/generatedAPI/kotlinAPI/chatbot/enums/OrderBy;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getLastMessageId", "()Ljava/lang/Long;", "setLastMessageId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "messageList", "", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/Message;", "getMessageList", "()Ljava/util/List;", "setMessageList", "(Ljava/util/List;)V", "getOrderBy", "()Lcom/glority/generatedAPI/kotlinAPI/chatbot/enums/OrderBy;", "setOrderBy", "(Lcom/glority/generatedAPI/kotlinAPI/chatbot/enums/OrderBy;)V", "getSessionId", "setSessionId", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/glority/generatedAPI/kotlinAPI/chatbot/enums/OrderBy;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)Lcom/glority/generatedAPI/kotlinAPI/chatbot/FindMessageListMessage;", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class FindMessageListMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private LanguageCode languageCode;
    private Long lastMessageId;
    public List<Message> messageList;
    private OrderBy orderBy;
    private Long sessionId;

    public static /* synthetic */ FindMessageListMessage copy$default(FindMessageListMessage findMessageListMessage, Long l, Long l2, OrderBy orderBy, LanguageCode languageCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = findMessageListMessage.lastMessageId;
        }
        if ((i & 2) != 0) {
            l2 = findMessageListMessage.sessionId;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            orderBy = findMessageListMessage.orderBy;
        }
        OrderBy orderBy2 = orderBy;
        if ((i & 8) != 0) {
            languageCode = findMessageListMessage.languageCode;
        }
        LanguageCode languageCode2 = languageCode;
        if ((i & 16) != 0) {
            str = findMessageListMessage.countryCode;
        }
        return findMessageListMessage.copy(l, l3, orderBy2, languageCode2, str);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final Long getLastMessageId() {
        return this.lastMessageId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderBy getOrderBy() {
        return this.orderBy;
    }

    /* renamed from: component4, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final FindMessageListMessage copy(Long lastMessageId, Long sessionId, OrderBy orderBy, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(orderBy, "orderBy");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new FindMessageListMessage(lastMessageId, sessionId, orderBy, languageCode, countryCode);
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
        return "FindMessageListMessage(lastMessageId=" + this.lastMessageId + ", sessionId=" + this.sessionId + ", orderBy=" + this.orderBy + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    public final Long getLastMessageId() {
        return this.lastMessageId;
    }

    public final void setLastMessageId(Long l) {
        this.lastMessageId = l;
    }

    public final Long getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(Long l) {
        this.sessionId = l;
    }

    public final OrderBy getOrderBy() {
        return this.orderBy;
    }

    public final void setOrderBy(OrderBy orderBy) {
        Intrinsics.checkNotNullParameter(orderBy, "<set-?>");
        this.orderBy = orderBy;
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public FindMessageListMessage(Long l, Long l2, OrderBy orderBy, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(orderBy, "orderBy");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.lastMessageId = l;
        this.sessionId = l2;
        this.orderBy = orderBy;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final List<Message> getMessageList() {
        List<Message> list = this.messageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageList");
        }
        return list;
    }

    public final void setMessageList(List<Message> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.messageList = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("message_list") && !obj.isNull("message_list")) {
            JSONArray jSONArray = obj.getJSONArray("message_list");
            this.messageList = new ArrayList();
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
                        List<Message> list = this.messageList;
                        if (list == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("messageList");
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
        throw new ParameterCheckFailException("message_list is missing in api FindMessageList");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        Long l = this.lastMessageId;
        if (l != null) {
            Intrinsics.checkNotNull(l);
            hashMap.put("last_message_id", l);
        }
        Long l2 = this.sessionId;
        if (l2 != null) {
            Intrinsics.checkNotNull(l2);
            hashMap.put("session_id", l2);
        }
        hashMap.put("order_by", Integer.valueOf(this.orderBy.getValue()));
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof FindMessageListMessage)) {
            return false;
        }
        FindMessageListMessage findMessageListMessage = (FindMessageListMessage) other;
        return ((Intrinsics.areEqual(this.lastMessageId, findMessageListMessage.lastMessageId) ^ true) || (Intrinsics.areEqual(this.sessionId, findMessageListMessage.sessionId) ^ true) || this.orderBy != findMessageListMessage.orderBy || this.languageCode != findMessageListMessage.languageCode || (Intrinsics.areEqual(this.countryCode, findMessageListMessage.countryCode) ^ true)) ? false : true;
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
        if (other == null || !(other instanceof FindMessageListMessage)) {
            return false;
        }
        FindMessageListMessage findMessageListMessage = (FindMessageListMessage) other;
        if ((!Intrinsics.areEqual(this.lastMessageId, findMessageListMessage.lastMessageId)) || (!Intrinsics.areEqual(this.sessionId, findMessageListMessage.sessionId)) || this.orderBy != findMessageListMessage.orderBy || this.languageCode != findMessageListMessage.languageCode || (!Intrinsics.areEqual(this.countryCode, findMessageListMessage.countryCode))) {
            return false;
        }
        List<Message> list = this.messageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageList");
        }
        List<Message> list2 = findMessageListMessage.messageList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageList");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        Long l = this.lastMessageId;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.sessionId;
        int hashCode3 = (((((((hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.orderBy.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        List<Message> list = this.messageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageList");
        }
        return hashCode3 + list.hashCode();
    }

    /* compiled from: FindMessageListMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/FindMessageListMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v3/chatbot/find_message_list";
        }
    }
}
