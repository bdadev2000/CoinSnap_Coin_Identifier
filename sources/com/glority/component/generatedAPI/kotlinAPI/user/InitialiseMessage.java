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

/* compiled from: InitialiseMessage.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001^B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020FH\u0016J\u0014\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020504H\u0016J\u0014\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020I04H\u0016J\u0012\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u000105H\u0016J\b\u0010M\u001a\u00020\u000bH\u0016J\b\u0010N\u001a\u00020KH\u0016J\b\u0010O\u001a\u00020KH\u0016J\b\u0010P\u001a\u00020KH\u0016J\b\u0010Q\u001a\u00020KH\u0016J\u0013\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0SH\u0016¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u000105H\u0096\u0002J\b\u0010V\u001a\u00020WH\u0016J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010Z\u001a\u00020\tHÆ\u0003J\t\u0010[\u001a\u00020\u000bHÆ\u0003J5\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010]\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001a\u0010-\u001a\u00020.X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010504X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006_"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/InitialiseMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "loginInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "deviceInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getLoginInfo", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "setLoginInfo", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;)V", "getDeviceInfo", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;", "setDeviceInfo", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "user", "Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "getUser", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "setUser", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/User;)V", "userAdditionalData", "Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "getUserAdditionalData", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "setUserAdditionalData", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;)V", "accessToken", "getAccessToken", "setAccessToken", "config", "Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;", "getConfig", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;", "setConfig", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;)V", "otherConfigs", "", "", "getOtherConfigs", "()Ljava/util/Map;", "setOtherConfigs", "(Ljava/util/Map;)V", "appServerTime", "Ljava/util/Date;", "getAppServerTime", "()Ljava/util/Date;", "setAppServerTime", "(Ljava/util/Date;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class InitialiseMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String accessToken;
    public Date appServerTime;
    public ClientConfig config;
    private String countryCode;
    private DeviceInfo deviceInfo;
    private LanguageCode languageCode;
    private LoginInfo loginInfo;
    public Map<String, ? extends Object> otherConfigs;
    public User user;
    public UserAdditionalData userAdditionalData;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final InitialiseMessage copy(LoginInfo loginInfo, DeviceInfo deviceInfo, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new InitialiseMessage(loginInfo, deviceInfo, languageCode, countryCode);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return false;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return true;
    }

    public String toString() {
        return "InitialiseMessage(loginInfo=" + this.loginInfo + ", deviceInfo=" + this.deviceInfo + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    public static /* synthetic */ InitialiseMessage copy$default(InitialiseMessage initialiseMessage, LoginInfo loginInfo, DeviceInfo deviceInfo, LanguageCode languageCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            loginInfo = initialiseMessage.loginInfo;
        }
        if ((i & 2) != 0) {
            deviceInfo = initialiseMessage.deviceInfo;
        }
        if ((i & 4) != 0) {
            languageCode = initialiseMessage.languageCode;
        }
        if ((i & 8) != 0) {
            str = initialiseMessage.countryCode;
        }
        return initialiseMessage.copy(loginInfo, deviceInfo, languageCode, str);
    }

    public final LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    public final void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
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

    public InitialiseMessage(LoginInfo loginInfo, DeviceInfo deviceInfo, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.loginInfo = loginInfo;
        this.deviceInfo = deviceInfo;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final User getUser() {
        User user = this.user;
        if (user != null) {
            return user;
        }
        Intrinsics.throwUninitializedPropertyAccessException("user");
        return null;
    }

    public final void setUser(User user) {
        Intrinsics.checkNotNullParameter(user, "<set-?>");
        this.user = user;
    }

    public final UserAdditionalData getUserAdditionalData() {
        UserAdditionalData userAdditionalData = this.userAdditionalData;
        if (userAdditionalData != null) {
            return userAdditionalData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAdditionalData");
        return null;
    }

    public final void setUserAdditionalData(UserAdditionalData userAdditionalData) {
        Intrinsics.checkNotNullParameter(userAdditionalData, "<set-?>");
        this.userAdditionalData = userAdditionalData;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
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

    public final Date getAppServerTime() {
        Date date = this.appServerTime;
        if (date != null) {
            return date;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appServerTime");
        return null;
    }

    public final void setAppServerTime(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.appServerTime = date;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("user") && !obj.isNull("user")) {
            Object obj2 = obj.get("user");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            setUser(new User((JSONObject) obj2));
            if (obj.has("user_additional_data") && !obj.isNull("user_additional_data")) {
                Object obj3 = obj.get("user_additional_data");
                if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                    obj3 = new JSONObject();
                }
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                setUserAdditionalData(new UserAdditionalData((JSONObject) obj3));
                if (obj.has("access_token") && !obj.isNull("access_token")) {
                    this.accessToken = obj.getString("access_token");
                } else {
                    this.accessToken = null;
                }
                if (obj.has("config") && !obj.isNull("config")) {
                    Object obj4 = obj.get("config");
                    if ((obj4 instanceof JSONArray) && ((JSONArray) obj4).length() == 0) {
                        obj4 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                    setConfig(new ClientConfig((JSONObject) obj4));
                    if (obj.has("other_configs") && !obj.isNull("other_configs")) {
                        Object obj5 = obj.get("other_configs");
                        if ((obj5 instanceof JSONArray) && ((JSONArray) obj5).length() == 0) {
                            obj5 = new JSONObject();
                        }
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                        setOtherConfigs(jsonObjectToMap((JSONObject) obj5));
                        if (obj.has("app_server_time") && !obj.isNull("app_server_time")) {
                            setAppServerTime(new Date(obj.getLong("app_server_time") * 1000));
                            this._response_at = new Date();
                            return;
                        }
                        throw new ParameterCheckFailException("app_server_time is missing in api Initialise");
                    }
                    throw new ParameterCheckFailException("other_configs is missing in api Initialise");
                }
                throw new ParameterCheckFailException("config is missing in api Initialise");
            }
            throw new ParameterCheckFailException("user_additional_data is missing in api Initialise");
        }
        throw new ParameterCheckFailException("user is missing in api Initialise");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        LoginInfo loginInfo = this.loginInfo;
        if (loginInfo != null) {
            Intrinsics.checkNotNull(loginInfo);
            hashMap.put("login_info", loginInfo.getJsonMap());
        }
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            Intrinsics.checkNotNull(deviceInfo);
            hashMap.put("device_info", deviceInfo.getJsonMap());
        }
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
        if (other == null || !(other instanceof InitialiseMessage)) {
            return false;
        }
        InitialiseMessage initialiseMessage = (InitialiseMessage) other;
        return Intrinsics.areEqual(this.loginInfo, initialiseMessage.loginInfo) && Intrinsics.areEqual(this.deviceInfo, initialiseMessage.deviceInfo) && this.languageCode == initialiseMessage.languageCode && Intrinsics.areEqual(this.countryCode, initialiseMessage.countryCode);
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
        if (other == null || !(other instanceof InitialiseMessage)) {
            return false;
        }
        InitialiseMessage initialiseMessage = (InitialiseMessage) other;
        return Intrinsics.areEqual(this.loginInfo, initialiseMessage.loginInfo) && Intrinsics.areEqual(this.deviceInfo, initialiseMessage.deviceInfo) && this.languageCode == initialiseMessage.languageCode && Intrinsics.areEqual(this.countryCode, initialiseMessage.countryCode) && Intrinsics.areEqual(getUser(), initialiseMessage.getUser()) && Intrinsics.areEqual(getUserAdditionalData(), initialiseMessage.getUserAdditionalData()) && Intrinsics.areEqual(this.accessToken, initialiseMessage.accessToken) && Intrinsics.areEqual(getConfig(), initialiseMessage.getConfig()) && Intrinsics.areEqual(getOtherConfigs(), initialiseMessage.getOtherConfigs()) && Intrinsics.areEqual(getAppServerTime(), initialiseMessage.getAppServerTime());
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        LoginInfo loginInfo = this.loginInfo;
        int hashCode2 = (hashCode + (loginInfo != null ? loginInfo.hashCode() : 0)) * 31;
        DeviceInfo deviceInfo = this.deviceInfo;
        int hashCode3 = (((((((((hashCode2 + (deviceInfo != null ? deviceInfo.hashCode() : 0)) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + getUser().hashCode()) * 31) + getUserAdditionalData().hashCode()) * 31;
        String str = this.accessToken;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + getConfig().hashCode()) * 31) + getOtherConfigs().hashCode()) * 31) + getAppServerTime().hashCode();
    }

    /* compiled from: InitialiseMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/InitialiseMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/initialise";
        }
    }
}
