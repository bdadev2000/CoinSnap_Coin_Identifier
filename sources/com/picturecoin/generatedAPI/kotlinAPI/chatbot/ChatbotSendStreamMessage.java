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
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ChatbotSendStreamMessage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010!H\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020$0#H\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020&0#H\u0016J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010$H\u0016J\b\u0010*\u001a\u00020\tH\u0016J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016J\b\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\t00H\u0016¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u00103\u001a\u000204H\u0016J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010;\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006="}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ChatbotSendStreamMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", Args.sessionId, "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "messageContents", Args.extraFields, "<init>", "(JLcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSessionId", "()J", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "getCountryCode", "()Ljava/lang/String;", "getMessageContents", "getExtraFields", "response", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ChatbotSendStreamMessageResponse;", "getResponse", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ChatbotSendStreamMessageResponse;", "setResponse", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ChatbotSendStreamMessageResponse;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class ChatbotSendStreamMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String countryCode;
    private final String extraFields;
    private final LanguageCode languageCode;
    private final String messageContents;
    public ChatbotSendStreamMessageResponse response;
    private final long sessionId;

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
    public final String getMessageContents() {
        return this.messageContents;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExtraFields() {
        return this.extraFields;
    }

    public final ChatbotSendStreamMessage copy(long sessionId, LanguageCode languageCode, String countryCode, String messageContents, String extraFields) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(messageContents, "messageContents");
        return new ChatbotSendStreamMessage(sessionId, languageCode, countryCode, messageContents, extraFields);
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
        return "ChatbotSendStreamMessage(sessionId=" + this.sessionId + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", messageContents=" + this.messageContents + ", extraFields=" + this.extraFields + ")";
    }

    public /* synthetic */ ChatbotSendStreamMessage(long j, LanguageCode languageCode, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, languageCode, str, str2, (i & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ ChatbotSendStreamMessage copy$default(ChatbotSendStreamMessage chatbotSendStreamMessage, long j, LanguageCode languageCode, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chatbotSendStreamMessage.sessionId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            languageCode = chatbotSendStreamMessage.languageCode;
        }
        LanguageCode languageCode2 = languageCode;
        if ((i & 4) != 0) {
            str = chatbotSendStreamMessage.countryCode;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = chatbotSendStreamMessage.messageContents;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = chatbotSendStreamMessage.extraFields;
        }
        return chatbotSendStreamMessage.copy(j2, languageCode2, str4, str5, str3);
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getMessageContents() {
        return this.messageContents;
    }

    public final String getExtraFields() {
        return this.extraFields;
    }

    public ChatbotSendStreamMessage(long j, LanguageCode languageCode, String countryCode, String messageContents, String str) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(messageContents, "messageContents");
        this.sessionId = j;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.messageContents = messageContents;
        this.extraFields = str;
    }

    public final ChatbotSendStreamMessageResponse getResponse() {
        ChatbotSendStreamMessageResponse chatbotSendStreamMessageResponse = this.response;
        if (chatbotSendStreamMessageResponse != null) {
            return chatbotSendStreamMessageResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    public final void setResponse(ChatbotSendStreamMessageResponse chatbotSendStreamMessageResponse) {
        Intrinsics.checkNotNullParameter(chatbotSendStreamMessageResponse, "<set-?>");
        this.response = chatbotSendStreamMessageResponse;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("response") && !obj.isNull("response")) {
            JSONObject jSONObject = obj.getJSONObject("response");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            setResponse(new ChatbotSendStreamMessageResponse(jSONObject));
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("response is missing in api ChatbotSendStreamMessage");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) {
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", Long.valueOf(this.sessionId));
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        hashMap.put("message_contents", this.messageContents);
        String str = this.extraFields;
        if (str != null) {
            hashMap.put("extra_fields", str);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new LinkedHashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof ChatbotSendStreamMessage)) {
            return false;
        }
        ChatbotSendStreamMessage chatbotSendStreamMessage = (ChatbotSendStreamMessage) other;
        return this.sessionId == chatbotSendStreamMessage.sessionId && this.languageCode == chatbotSendStreamMessage.languageCode && Intrinsics.areEqual(this.countryCode, chatbotSendStreamMessage.countryCode) && Intrinsics.areEqual(this.messageContents, chatbotSendStreamMessage.messageContents) && Intrinsics.areEqual(this.extraFields, chatbotSendStreamMessage.extraFields);
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
        if (other == null || !(other instanceof ChatbotSendStreamMessage)) {
            return false;
        }
        ChatbotSendStreamMessage chatbotSendStreamMessage = (ChatbotSendStreamMessage) other;
        return this.sessionId == chatbotSendStreamMessage.sessionId && this.languageCode == chatbotSendStreamMessage.languageCode && Intrinsics.areEqual(this.countryCode, chatbotSendStreamMessage.countryCode) && Intrinsics.areEqual(this.messageContents, chatbotSendStreamMessage.messageContents) && Intrinsics.areEqual(this.extraFields, chatbotSendStreamMessage.extraFields) && Intrinsics.areEqual(getResponse(), chatbotSendStreamMessage.getResponse());
    }

    public int hashCode() {
        int hashCode = ((((((((getClass().hashCode() * 31) + Long.hashCode(this.sessionId)) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.messageContents.hashCode()) * 31;
        String str = this.extraFields;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + getResponse().hashCode();
    }

    /* compiled from: ChatbotSendStreamMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ChatbotSendStreamMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v4/chat/send_stream_message";
        }
    }
}
