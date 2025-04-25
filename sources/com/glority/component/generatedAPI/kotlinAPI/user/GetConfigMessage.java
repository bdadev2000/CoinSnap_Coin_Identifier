package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetConfigMessage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(0\u0019H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010,\u001a\u00020\u0007H\u0016J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J\b\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0016J\u0013\u00101\u001a\b\u0012\u0004\u0012\u00020\u000702H\u0016¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u00105\u001a\u000206H\u0016J\t\u00107\u001a\u00020\u0005HÄ\u0003J\t\u00108\u001a\u00020\u0007HÄ\u0003J\u001d\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010:\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006<"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/GetConfigMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "config", "Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;", "getConfig", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;", "setConfig", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;)V", "otherConfigs", "", "", "getOtherConfigs", "()Ljava/util/Map;", "setOtherConfigs", "(Ljava/util/Map;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class GetConfigMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public ClientConfig config;
    private String countryCode;
    private LanguageCode languageCode;
    public Map<String, ? extends Object> otherConfigs;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getCountryCode() {
        return this.countryCode;
    }

    public final GetConfigMessage copy(LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GetConfigMessage(languageCode, countryCode);
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
        return "GetConfigMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    public static /* synthetic */ GetConfigMessage copy$default(GetConfigMessage getConfigMessage, LanguageCode languageCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = getConfigMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = getConfigMessage.countryCode;
        }
        return getConfigMessage.copy(languageCode, str);
    }

    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    protected final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    protected final String getCountryCode() {
        return this.countryCode;
    }

    protected final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public GetConfigMessage(LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final ClientConfig getConfig() {
        ClientConfig clientConfig = this.config;
        if (clientConfig != null) {
            return clientConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("config");
        return null;
    }

    public final void setConfig(ClientConfig clientConfig) {
        Intrinsics.checkNotNullParameter(clientConfig, "<set-?>");
        this.config = clientConfig;
    }

    public final Map<String, Object> getOtherConfigs() {
        Map<String, ? extends Object> map = this.otherConfigs;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otherConfigs");
        return null;
    }

    public final void setOtherConfigs(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.otherConfigs = map;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("config") && !obj.isNull("config")) {
            Object obj2 = obj.get("config");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            setConfig(new ClientConfig((JSONObject) obj2));
            if (obj.has("other_configs") && !obj.isNull("other_configs")) {
                Object obj3 = obj.get("other_configs");
                if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                    obj3 = new JSONObject();
                }
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                setOtherConfigs(jsonObjectToMap((JSONObject) obj3));
                this._response_at = new Date();
                return;
            }
            throw new ParameterCheckFailException("other_configs is missing in api GetConfig");
        }
        throw new ParameterCheckFailException("config is missing in api GetConfig");
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
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetConfigMessage)) {
            return false;
        }
        GetConfigMessage getConfigMessage = (GetConfigMessage) other;
        return this.languageCode == getConfigMessage.languageCode && Intrinsics.areEqual(this.countryCode, getConfigMessage.countryCode);
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
        if (other == null || !(other instanceof GetConfigMessage)) {
            return false;
        }
        GetConfigMessage getConfigMessage = (GetConfigMessage) other;
        return this.languageCode == getConfigMessage.languageCode && Intrinsics.areEqual(this.countryCode, getConfigMessage.countryCode) && Intrinsics.areEqual(getConfig(), getConfigMessage.getConfig()) && Intrinsics.areEqual(getOtherConfigs(), getConfigMessage.getOtherConfigs());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + getConfig().hashCode()) * 31) + getOtherConfigs().hashCode();
    }

    /* compiled from: GetConfigMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/GetConfigMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/get_config";
        }
    }
}
