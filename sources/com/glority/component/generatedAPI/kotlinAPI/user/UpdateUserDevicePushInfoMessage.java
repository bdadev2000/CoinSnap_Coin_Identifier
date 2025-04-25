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
import org.json.JSONObject;

/* compiled from: UpdateUserDevicePushInfoMessage.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B/\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 H\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0 H\u0016J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010!H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016J\b\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-H\u0016¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u00069"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateUserDevicePushInfoMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "", "pushKey", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getTimeZone", "()Ljava/lang/String;", "setTimeZone", "(Ljava/lang/String;)V", "getPushKey", "setPushKey", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "setCountryCode", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class UpdateUserDevicePushInfoMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private LanguageCode languageCode;
    private String pushKey;
    private String timeZone;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPushKey() {
        return this.pushKey;
    }

    /* renamed from: component3, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final UpdateUserDevicePushInfoMessage copy(String timeZone, String pushKey, LanguageCode languageCode, String countryCode) {
        return new UpdateUserDevicePushInfoMessage(timeZone, pushKey, languageCode, countryCode);
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
        return "UpdateUserDevicePushInfoMessage(timeZone=" + this.timeZone + ", pushKey=" + this.pushKey + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    public static /* synthetic */ UpdateUserDevicePushInfoMessage copy$default(UpdateUserDevicePushInfoMessage updateUserDevicePushInfoMessage, String str, String str2, LanguageCode languageCode, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateUserDevicePushInfoMessage.timeZone;
        }
        if ((i & 2) != 0) {
            str2 = updateUserDevicePushInfoMessage.pushKey;
        }
        if ((i & 4) != 0) {
            languageCode = updateUserDevicePushInfoMessage.languageCode;
        }
        if ((i & 8) != 0) {
            str3 = updateUserDevicePushInfoMessage.countryCode;
        }
        return updateUserDevicePushInfoMessage.copy(str, str2, languageCode, str3);
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final void setTimeZone(String str) {
        this.timeZone = str;
    }

    public final String getPushKey() {
        return this.pushKey;
    }

    public final void setPushKey(String str) {
        this.pushKey = str;
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

    public UpdateUserDevicePushInfoMessage(String str, String str2, LanguageCode languageCode, String str3) {
        this.timeZone = str;
        this.pushKey = str2;
        this.languageCode = languageCode;
        this.countryCode = str3;
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
        String str = this.timeZone;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("time_zone", str);
        }
        String str2 = this.pushKey;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("push_key", str2);
        }
        LanguageCode languageCode = this.languageCode;
        if (languageCode != null) {
            Intrinsics.checkNotNull(languageCode);
            hashMap.put("language_code", Integer.valueOf(languageCode.getValue()));
        }
        String str3 = this.countryCode;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("country_code", str3);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof UpdateUserDevicePushInfoMessage)) {
            return false;
        }
        UpdateUserDevicePushInfoMessage updateUserDevicePushInfoMessage = (UpdateUserDevicePushInfoMessage) other;
        return Intrinsics.areEqual(this.timeZone, updateUserDevicePushInfoMessage.timeZone) && Intrinsics.areEqual(this.pushKey, updateUserDevicePushInfoMessage.pushKey) && this.languageCode == updateUserDevicePushInfoMessage.languageCode && Intrinsics.areEqual(this.countryCode, updateUserDevicePushInfoMessage.countryCode);
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
        if (other == null || !(other instanceof UpdateUserDevicePushInfoMessage)) {
            return false;
        }
        UpdateUserDevicePushInfoMessage updateUserDevicePushInfoMessage = (UpdateUserDevicePushInfoMessage) other;
        return Intrinsics.areEqual(this.timeZone, updateUserDevicePushInfoMessage.timeZone) && Intrinsics.areEqual(this.pushKey, updateUserDevicePushInfoMessage.pushKey) && this.languageCode == updateUserDevicePushInfoMessage.languageCode && Intrinsics.areEqual(this.countryCode, updateUserDevicePushInfoMessage.countryCode);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.timeZone;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.pushKey;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        LanguageCode languageCode = this.languageCode;
        int hashCode4 = (hashCode3 + (languageCode != null ? languageCode.hashCode() : 0)) * 31;
        String str3 = this.countryCode;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* compiled from: UpdateUserDevicePushInfoMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateUserDevicePushInfoMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/update_user_device_push_info";
        }
    }
}
