package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
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
import org.json.JSONObject;

/* compiled from: UserFeedbackMessage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RBW\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020.H\u0016J\t\u0010/\u001a\u00020\u0005HÄ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÄ\u0003J\t\u00101\u001a\u00020\u0007HÄ\u0003J\t\u00102\u001a\u00020\u0005HÄ\u0003J\t\u00103\u001a\u00020\nHÄ\u0003J\t\u00104\u001a\u00020\u0005HÄ\u0003J\t\u00105\u001a\u00020\u0005HÄ\u0003J\t\u00106\u001a\u00020\u0005HÄ\u0003J\t\u00107\u001a\u00020\u0005HÄ\u0003J\t\u00108\u001a\u00020\u0005HÄ\u0003Jo\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010:\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010=\u001a\u00020.H\u0016J\u0014\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020@0?H\u0016J\u0014\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<0?H\u0016J\b\u0010B\u001a\u00020CH\u0016J\u0013\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050EH\u0016¢\u0006\u0002\u0010FJ\b\u0010G\u001a\u00020.H\u0016J\b\u0010H\u001a\u00020.H\u0016J\u0012\u0010I\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\t\u0010J\u001a\u00020\u0005HÖ\u0001J\u0010\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020L2\u0006\u0010P\u001a\u00020QH\u0016R\u001a\u0010\r\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000f\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015¨\u0006S"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/UserFeedbackMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "userId", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "deviceType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "deviceOs", "deviceModel", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "productName", "feedbackType", "content", "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "getContent", "setContent", "getCountryCode", "setCountryCode", "getDeviceModel", "setDeviceModel", "getDeviceOs", "setDeviceOs", "getDeviceType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "setDeviceType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;)V", "getFeedbackType", "setFeedbackType", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getProductName", "setProductName", "getUserId", "setUserId", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class UserFeedbackMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String appVersion;
    private String content;
    private String countryCode;
    private String deviceModel;
    private String deviceOs;
    private DeviceType deviceType;
    private String feedbackType;
    private LanguageCode languageCode;
    private String productName;
    private String userId;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getUserId() {
        return this.userId;
    }

    /* renamed from: component10, reason: from getter */
    protected final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    protected final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component5, reason: from getter */
    protected final String getDeviceOs() {
        return this.deviceOs;
    }

    /* renamed from: component6, reason: from getter */
    protected final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component7, reason: from getter */
    protected final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component8, reason: from getter */
    protected final String getProductName() {
        return this.productName;
    }

    /* renamed from: component9, reason: from getter */
    protected final String getFeedbackType() {
        return this.feedbackType;
    }

    public final UserFeedbackMessage copy(String userId, LanguageCode languageCode, String countryCode, DeviceType deviceType, String deviceOs, String deviceModel, String appVersion, String productName, String feedbackType, String content) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceOs, "deviceOs");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        return new UserFeedbackMessage(userId, languageCode, countryCode, deviceType, deviceOs, deviceModel, appVersion, productName, feedbackType, content);
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
        return "UserFeedbackMessage(userId=" + this.userId + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", deviceType=" + this.deviceType + ", deviceOs=" + this.deviceOs + ", deviceModel=" + this.deviceModel + ", appVersion=" + this.appVersion + ", productName=" + this.productName + ", feedbackType=" + this.feedbackType + ", content=" + ((Object) this.content) + ')';
    }

    protected final String getUserId() {
        return this.userId;
    }

    protected final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
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

    protected final DeviceType getDeviceType() {
        return this.deviceType;
    }

    protected final void setDeviceType(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "<set-?>");
        this.deviceType = deviceType;
    }

    protected final String getDeviceOs() {
        return this.deviceOs;
    }

    protected final void setDeviceOs(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceOs = str;
    }

    protected final String getDeviceModel() {
        return this.deviceModel;
    }

    protected final void setDeviceModel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceModel = str;
    }

    protected final String getAppVersion() {
        return this.appVersion;
    }

    protected final void setAppVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    protected final String getProductName() {
        return this.productName;
    }

    protected final void setProductName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productName = str;
    }

    protected final String getFeedbackType() {
        return this.feedbackType;
    }

    protected final void setFeedbackType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.feedbackType = str;
    }

    protected final String getContent() {
        return this.content;
    }

    protected final void setContent(String str) {
        this.content = str;
    }

    public UserFeedbackMessage(String userId, LanguageCode languageCode, String countryCode, DeviceType deviceType, String deviceOs, String deviceModel, String appVersion, String productName, String feedbackType, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceOs, "deviceOs");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        this.userId = userId;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.deviceType = deviceType;
        this.deviceOs = deviceOs;
        this.deviceModel = deviceModel;
        this.appVersion = appVersion;
        this.productName = productName;
        this.feedbackType = feedbackType;
        this.content = str;
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
        hashMap.put("user_id", this.userId);
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        hashMap.put("device_type", Integer.valueOf(this.deviceType.getValue()));
        hashMap.put("device_os", this.deviceOs);
        hashMap.put("device_model", this.deviceModel);
        hashMap.put("app_version", this.appVersion);
        hashMap.put("product_name", this.productName);
        hashMap.put("feedback_type", this.feedbackType);
        String str = this.content;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("content", str);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof UserFeedbackMessage)) {
            return false;
        }
        UserFeedbackMessage userFeedbackMessage = (UserFeedbackMessage) other;
        return Intrinsics.areEqual(this.userId, userFeedbackMessage.userId) && this.languageCode == userFeedbackMessage.languageCode && Intrinsics.areEqual(this.countryCode, userFeedbackMessage.countryCode) && this.deviceType == userFeedbackMessage.deviceType && Intrinsics.areEqual(this.deviceOs, userFeedbackMessage.deviceOs) && Intrinsics.areEqual(this.deviceModel, userFeedbackMessage.deviceModel) && Intrinsics.areEqual(this.appVersion, userFeedbackMessage.appVersion) && Intrinsics.areEqual(this.productName, userFeedbackMessage.productName) && Intrinsics.areEqual(this.feedbackType, userFeedbackMessage.feedbackType) && Intrinsics.areEqual(this.content, userFeedbackMessage.content);
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
        if (other == null || !(other instanceof UserFeedbackMessage)) {
            return false;
        }
        UserFeedbackMessage userFeedbackMessage = (UserFeedbackMessage) other;
        return Intrinsics.areEqual(this.userId, userFeedbackMessage.userId) && this.languageCode == userFeedbackMessage.languageCode && Intrinsics.areEqual(this.countryCode, userFeedbackMessage.countryCode) && this.deviceType == userFeedbackMessage.deviceType && Intrinsics.areEqual(this.deviceOs, userFeedbackMessage.deviceOs) && Intrinsics.areEqual(this.deviceModel, userFeedbackMessage.deviceModel) && Intrinsics.areEqual(this.appVersion, userFeedbackMessage.appVersion) && Intrinsics.areEqual(this.productName, userFeedbackMessage.productName) && Intrinsics.areEqual(this.feedbackType, userFeedbackMessage.feedbackType) && Intrinsics.areEqual(this.content, userFeedbackMessage.content);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((getClass().hashCode() * 31) + this.userId.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.deviceOs.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.feedbackType.hashCode()) * 31;
        String str = this.content;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* compiled from: UserFeedbackMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/UserFeedbackMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/cms/user_feedback";
        }
    }
}
