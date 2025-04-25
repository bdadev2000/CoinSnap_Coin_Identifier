package com.glority.component.generatedAPI.kotlinAPI.user;

import androidx.autofill.HintConstants;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: ResetPasswordAndLoginMessage.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GB'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0016J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002000/H\u0016J\u0014\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002020/H\u0016J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\b\u00107\u001a\u000204H\u0016J\b\u00108\u001a\u000204H\u0016J\b\u00109\u001a\u000204H\u0016J\b\u0010:\u001a\u000204H\u0016J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050<H\u0016¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u0010?\u001a\u00020@H\u0016J\t\u0010A\u001a\u00020\u0005HÄ\u0003J\t\u0010B\u001a\u00020\u0005HÄ\u0003J\t\u0010C\u001a\u00020\u0005HÄ\u0003J\t\u0010D\u001a\u00020\tHÄ\u0003J1\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000f¨\u0006H"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/ResetPasswordAndLoginMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "email", "", "verifyCode", HintConstants.AUTOFILL_HINT_PASSWORD, "deviceInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getVerifyCode", "setVerifyCode", "getPassword", "setPassword", "getDeviceInfo", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;", "setDeviceInfo", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;)V", "user", "Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "getUser", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "setUser", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/User;)V", "userAdditionalData", "Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "getUserAdditionalData", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "setUserAdditionalData", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;)V", "accessToken", "getAccessToken", "setAccessToken", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ResetPasswordAndLoginMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String accessToken;
    private DeviceInfo deviceInfo;
    private String email;
    private String password;
    public User user;
    public UserAdditionalData userAdditionalData;
    private String verifyCode;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getVerifyCode() {
        return this.verifyCode;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getPassword() {
        return this.password;
    }

    /* renamed from: component4, reason: from getter */
    protected final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final ResetPasswordAndLoginMessage copy(String email, String verifyCode, String password, DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return new ResetPasswordAndLoginMessage(email, verifyCode, password, deviceInfo);
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
        return false;
    }

    public String toString() {
        return "ResetPasswordAndLoginMessage(email=" + this.email + ", verifyCode=" + this.verifyCode + ", password=" + this.password + ", deviceInfo=" + this.deviceInfo + ")";
    }

    public static /* synthetic */ ResetPasswordAndLoginMessage copy$default(ResetPasswordAndLoginMessage resetPasswordAndLoginMessage, String str, String str2, String str3, DeviceInfo deviceInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetPasswordAndLoginMessage.email;
        }
        if ((i & 2) != 0) {
            str2 = resetPasswordAndLoginMessage.verifyCode;
        }
        if ((i & 4) != 0) {
            str3 = resetPasswordAndLoginMessage.password;
        }
        if ((i & 8) != 0) {
            deviceInfo = resetPasswordAndLoginMessage.deviceInfo;
        }
        return resetPasswordAndLoginMessage.copy(str, str2, str3, deviceInfo);
    }

    protected final String getEmail() {
        return this.email;
    }

    protected final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    protected final String getVerifyCode() {
        return this.verifyCode;
    }

    protected final void setVerifyCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyCode = str;
    }

    protected final String getPassword() {
        return this.password;
    }

    protected final void setPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    protected final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    protected final void setDeviceInfo(DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<set-?>");
        this.deviceInfo = deviceInfo;
    }

    public ResetPasswordAndLoginMessage(String email, String verifyCode, String password, DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.email = email;
        this.verifyCode = verifyCode;
        this.password = password;
        this.deviceInfo = deviceInfo;
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
        String str = this.accessToken;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accessToken");
        return null;
    }

    public final void setAccessToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessToken = str;
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
                    setAccessToken(obj.getString("access_token"));
                    this._response_at = new Date();
                    return;
                }
                throw new ParameterCheckFailException("access_token is missing in api ResetPasswordAndLogin");
            }
            throw new ParameterCheckFailException("user_additional_data is missing in api ResetPasswordAndLogin");
        }
        throw new ParameterCheckFailException("user is missing in api ResetPasswordAndLogin");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("email", this.email);
        hashMap.put("verify_code", this.verifyCode);
        hashMap.put(HintConstants.AUTOFILL_HINT_PASSWORD, this.password);
        hashMap.put("device_info", this.deviceInfo.getJsonMap());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof ResetPasswordAndLoginMessage)) {
            return false;
        }
        ResetPasswordAndLoginMessage resetPasswordAndLoginMessage = (ResetPasswordAndLoginMessage) other;
        return Intrinsics.areEqual(this.email, resetPasswordAndLoginMessage.email) && Intrinsics.areEqual(this.verifyCode, resetPasswordAndLoginMessage.verifyCode) && Intrinsics.areEqual(this.password, resetPasswordAndLoginMessage.password) && Intrinsics.areEqual(this.deviceInfo, resetPasswordAndLoginMessage.deviceInfo);
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
        if (other == null || !(other instanceof ResetPasswordAndLoginMessage)) {
            return false;
        }
        ResetPasswordAndLoginMessage resetPasswordAndLoginMessage = (ResetPasswordAndLoginMessage) other;
        return Intrinsics.areEqual(this.email, resetPasswordAndLoginMessage.email) && Intrinsics.areEqual(this.verifyCode, resetPasswordAndLoginMessage.verifyCode) && Intrinsics.areEqual(this.password, resetPasswordAndLoginMessage.password) && Intrinsics.areEqual(this.deviceInfo, resetPasswordAndLoginMessage.deviceInfo) && Intrinsics.areEqual(getUser(), resetPasswordAndLoginMessage.getUser()) && Intrinsics.areEqual(getUserAdditionalData(), resetPasswordAndLoginMessage.getUserAdditionalData()) && Intrinsics.areEqual(getAccessToken(), resetPasswordAndLoginMessage.getAccessToken());
    }

    public int hashCode() {
        return (((((((((((((getClass().hashCode() * 31) + this.email.hashCode()) * 31) + this.verifyCode.hashCode()) * 31) + this.password.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + getUser().hashCode()) * 31) + getUserAdditionalData().hashCode()) * 31) + getAccessToken().hashCode();
    }

    /* compiled from: ResetPasswordAndLoginMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/ResetPasswordAndLoginMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/reset_password_and_login";
        }
    }
}
