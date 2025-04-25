package com.glority.generatedAPI.kotlinAPI.chatbot;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: AddMessagesMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J-\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020\u001eH\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)0(H\u0016J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%0(H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070.H\u0016¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u001eH\u0016J\b\u00101\u001a\u00020\u001eH\u0016J\u0012\u00102\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\t\u00103\u001a\u00020\u0007HÖ\u0001J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006<"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessagesMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "addMessageParams", "", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessageParam;", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/util/List;)V", "getAddMessageParams", "()Ljava/util/List;", "setAddMessageParams", "(Ljava/util/List;)V", "addedMessageList", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/Message;", "getAddedMessageList", "setAddedMessageList", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class AddMessagesMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<AddMessageParam> addMessageParams;
    public List<Message> addedMessageList;
    private String countryCode;
    private LanguageCode languageCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddMessagesMessage copy$default(AddMessagesMessage addMessagesMessage, LanguageCode languageCode, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = addMessagesMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = addMessagesMessage.countryCode;
        }
        if ((i & 4) != 0) {
            list = addMessagesMessage.addMessageParams;
        }
        return addMessagesMessage.copy(languageCode, str, list);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<AddMessageParam> component3() {
        return this.addMessageParams;
    }

    public final AddMessagesMessage copy(LanguageCode languageCode, String countryCode, List<AddMessageParam> addMessageParams) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(addMessageParams, "addMessageParams");
        return new AddMessagesMessage(languageCode, countryCode, addMessageParams);
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
        return "AddMessagesMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", addMessageParams=" + this.addMessageParams + ")";
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

    public final List<AddMessageParam> getAddMessageParams() {
        return this.addMessageParams;
    }

    public final void setAddMessageParams(List<AddMessageParam> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.addMessageParams = list;
    }

    public AddMessagesMessage(LanguageCode languageCode, String countryCode, List<AddMessageParam> addMessageParams) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(addMessageParams, "addMessageParams");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.addMessageParams = addMessageParams;
    }

    public final List<Message> getAddedMessageList() {
        List<Message> list = this.addedMessageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addedMessageList");
        }
        return list;
    }

    public final void setAddedMessageList(List<Message> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.addedMessageList = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("added_message_list") && !obj.isNull("added_message_list")) {
            JSONArray jSONArray = obj.getJSONArray("added_message_list");
            this.addedMessageList = new ArrayList();
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
                        List<Message> list = this.addedMessageList;
                        if (list == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("addedMessageList");
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
        throw new ParameterCheckFailException("added_message_list is missing in api AddMessages");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        hashMap.put("add_message_params", AddMessageParam.INSTANCE.getAddMessageParamJsonArrayMap(this.addMessageParams));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof AddMessagesMessage)) {
            return false;
        }
        AddMessagesMessage addMessagesMessage = (AddMessagesMessage) other;
        return (this.languageCode != addMessagesMessage.languageCode || (Intrinsics.areEqual(this.countryCode, addMessagesMessage.countryCode) ^ true) || (Intrinsics.areEqual(this.addMessageParams, addMessagesMessage.addMessageParams) ^ true)) ? false : true;
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
        if (other == null || !(other instanceof AddMessagesMessage)) {
            return false;
        }
        AddMessagesMessage addMessagesMessage = (AddMessagesMessage) other;
        if (this.languageCode != addMessagesMessage.languageCode || (!Intrinsics.areEqual(this.countryCode, addMessagesMessage.countryCode)) || (!Intrinsics.areEqual(this.addMessageParams, addMessagesMessage.addMessageParams))) {
            return false;
        }
        List<Message> list = this.addedMessageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addedMessageList");
        }
        List<Message> list2 = addMessagesMessage.addedMessageList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addedMessageList");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.addMessageParams.hashCode()) * 31;
        List<Message> list = this.addedMessageList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addedMessageList");
        }
        return hashCode + list.hashCode();
    }

    /* compiled from: AddMessagesMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessagesMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v3/chatbot/add_messages";
        }
    }
}
