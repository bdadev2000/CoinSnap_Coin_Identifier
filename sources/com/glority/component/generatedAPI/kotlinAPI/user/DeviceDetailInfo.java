package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DeviceDetailInfo.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u000101002\u0006\u00102\u001a\u000203J\u0016\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010100H\u0016J\u0013\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00106\u001a\u00020\u0005H\u0016J\b\u00107\u001a\u000201H\u0016J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u000101H\u0014J\t\u0010;\u001a\u00020\u0005HÂ\u0003J\u0013\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010=\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001c\u0010)\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u001c\u0010,\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010¨\u0006?"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceDetailInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "appsFlyerId", "", "getAppsFlyerId", "()Ljava/lang/String;", "setAppsFlyerId", "(Ljava/lang/String;)V", "appsFlyerAdvertisingId", "getAppsFlyerAdvertisingId", "setAppsFlyerAdvertisingId", "iosDeviceData", "Lcom/glority/component/generatedAPI/kotlinAPI/user/IosDeviceData;", "getIosDeviceData", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/IosDeviceData;", "setIosDeviceData", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/IosDeviceData;)V", "androidDeviceData", "Lcom/glority/component/generatedAPI/kotlinAPI/user/AndroidDeviceData;", "getAndroidDeviceData", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/AndroidDeviceData;", "setAndroidDeviceData", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/AndroidDeviceData;)V", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCountryCode", "setCountryCode", "language", "getLanguage", "setLanguage", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "getAppVersion", "setAppVersion", "deviceOs", "getDeviceOs", "setDeviceOs", "deviceModel", "getDeviceModel", "setDeviceModel", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class DeviceDetailInfo extends APIModelBase<DeviceDetailInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AndroidDeviceData androidDeviceData;
    public String appVersion;
    private String appsFlyerAdvertisingId;
    public String appsFlyerId;
    public String countryCode;
    private String deviceModel;
    private String deviceOs;
    private IosDeviceData iosDeviceData;
    public String language;
    private int unused;

    public DeviceDetailInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final DeviceDetailInfo copy(int unused) {
        return new DeviceDetailInfo(unused);
    }

    public String toString() {
        return "DeviceDetailInfo(unused=" + this.unused + ")";
    }

    public DeviceDetailInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ DeviceDetailInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ DeviceDetailInfo copy$default(DeviceDetailInfo deviceDetailInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deviceDetailInfo.unused;
        }
        return deviceDetailInfo.copy(i);
    }

    public final String getAppsFlyerId() {
        String str = this.appsFlyerId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appsFlyerId");
        return null;
    }

    public final void setAppsFlyerId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appsFlyerId = str;
    }

    public final String getAppsFlyerAdvertisingId() {
        return this.appsFlyerAdvertisingId;
    }

    public final void setAppsFlyerAdvertisingId(String str) {
        this.appsFlyerAdvertisingId = str;
    }

    public final IosDeviceData getIosDeviceData() {
        return this.iosDeviceData;
    }

    public final void setIosDeviceData(IosDeviceData iosDeviceData) {
        this.iosDeviceData = iosDeviceData;
    }

    public final AndroidDeviceData getAndroidDeviceData() {
        return this.androidDeviceData;
    }

    public final void setAndroidDeviceData(AndroidDeviceData androidDeviceData) {
        this.androidDeviceData = androidDeviceData;
    }

    public final String getCountryCode() {
        String str = this.countryCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        return null;
    }

    public final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public final String getLanguage() {
        String str = this.language;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("language");
        return null;
    }

    public final void setLanguage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.language = str;
    }

    public final String getAppVersion() {
        String str = this.appVersion;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        return null;
    }

    public final void setAppVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final String getDeviceOs() {
        return this.deviceOs;
    }

    public final void setDeviceOs(String str) {
        this.deviceOs = str;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceDetailInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("apps_flyer_id") && !obj.isNull("apps_flyer_id")) {
            setAppsFlyerId(obj.getString("apps_flyer_id"));
            if (obj.has("apps_flyer_advertising_id") && !obj.isNull("apps_flyer_advertising_id")) {
                this.appsFlyerAdvertisingId = obj.getString("apps_flyer_advertising_id");
            } else {
                this.appsFlyerAdvertisingId = null;
            }
            if (obj.has("ios_device_data") && !obj.isNull("ios_device_data")) {
                Object obj2 = obj.get("ios_device_data");
                if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                    obj2 = new JSONObject();
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                this.iosDeviceData = new IosDeviceData((JSONObject) obj2);
            } else {
                this.iosDeviceData = null;
            }
            if (obj.has("android_device_data") && !obj.isNull("android_device_data")) {
                Object obj3 = obj.get("android_device_data");
                if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                    obj3 = new JSONObject();
                }
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                this.androidDeviceData = new AndroidDeviceData((JSONObject) obj3);
            } else {
                this.androidDeviceData = null;
            }
            if (obj.has("country_code") && !obj.isNull("country_code")) {
                setCountryCode(obj.getString("country_code"));
                if (obj.has("language") && !obj.isNull("language")) {
                    setLanguage(obj.getString("language"));
                    if (obj.has("app_version") && !obj.isNull("app_version")) {
                        setAppVersion(obj.getString("app_version"));
                        if (obj.has("device_os") && !obj.isNull("device_os")) {
                            this.deviceOs = obj.getString("device_os");
                        } else {
                            this.deviceOs = null;
                        }
                        if (obj.has("device_model") && !obj.isNull("device_model")) {
                            this.deviceModel = obj.getString("device_model");
                            return;
                        } else {
                            this.deviceModel = null;
                            return;
                        }
                    }
                    throw new ParameterCheckFailException("appVersion is missing in model DeviceDetailInfo");
                }
                throw new ParameterCheckFailException("language is missing in model DeviceDetailInfo");
            }
            throw new ParameterCheckFailException("countryCode is missing in model DeviceDetailInfo");
        }
        throw new ParameterCheckFailException("appsFlyerId is missing in model DeviceDetailInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("apps_flyer_id", getAppsFlyerId());
        String str = this.appsFlyerAdvertisingId;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("apps_flyer_advertising_id", str);
        } else if (keepNull) {
            hashMap.put("apps_flyer_advertising_id", null);
        }
        IosDeviceData iosDeviceData = this.iosDeviceData;
        if (iosDeviceData != null) {
            Intrinsics.checkNotNull(iosDeviceData);
            hashMap.put("ios_device_data", iosDeviceData.getJsonMap());
        } else if (keepNull) {
            hashMap.put("ios_device_data", null);
        }
        AndroidDeviceData androidDeviceData = this.androidDeviceData;
        if (androidDeviceData != null) {
            Intrinsics.checkNotNull(androidDeviceData);
            hashMap.put("android_device_data", androidDeviceData.getJsonMap());
        } else if (keepNull) {
            hashMap.put("android_device_data", null);
        }
        hashMap.put("country_code", getCountryCode());
        hashMap.put("language", getLanguage());
        hashMap.put("app_version", getAppVersion());
        String str2 = this.deviceOs;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("device_os", str2);
        } else if (keepNull) {
            hashMap.put("device_os", null);
        }
        String str3 = this.deviceModel;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("device_model", str3);
        } else if (keepNull) {
            hashMap.put("device_model", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof DeviceDetailInfo)) {
            return false;
        }
        DeviceDetailInfo deviceDetailInfo = (DeviceDetailInfo) other;
        return Intrinsics.areEqual(getAppsFlyerId(), deviceDetailInfo.getAppsFlyerId()) && Intrinsics.areEqual(this.appsFlyerAdvertisingId, deviceDetailInfo.appsFlyerAdvertisingId) && Intrinsics.areEqual(this.iosDeviceData, deviceDetailInfo.iosDeviceData) && Intrinsics.areEqual(this.androidDeviceData, deviceDetailInfo.androidDeviceData) && Intrinsics.areEqual(getCountryCode(), deviceDetailInfo.getCountryCode()) && Intrinsics.areEqual(getLanguage(), deviceDetailInfo.getLanguage()) && Intrinsics.areEqual(getAppVersion(), deviceDetailInfo.getAppVersion()) && Intrinsics.areEqual(this.deviceOs, deviceDetailInfo.deviceOs) && Intrinsics.areEqual(this.deviceModel, deviceDetailInfo.deviceModel);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + getAppsFlyerId().hashCode()) * 31;
        String str = this.appsFlyerAdvertisingId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        IosDeviceData iosDeviceData = this.iosDeviceData;
        int hashCode3 = (hashCode2 + (iosDeviceData != null ? iosDeviceData.hashCode() : 0)) * 31;
        AndroidDeviceData androidDeviceData = this.androidDeviceData;
        int hashCode4 = (((((((hashCode3 + (androidDeviceData != null ? androidDeviceData.hashCode() : 0)) * 31) + getCountryCode().hashCode()) * 31) + getLanguage().hashCode()) * 31) + getAppVersion().hashCode()) * 31;
        String str2 = this.deviceOs;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.deviceModel;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        DeviceDetailInfo deviceDetailInfo = new DeviceDetailInfo(0, 1, null);
        cloneTo(deviceDetailInfo);
        return deviceDetailInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.DeviceDetailInfo");
        DeviceDetailInfo deviceDetailInfo = (DeviceDetailInfo) o;
        super.cloneTo(deviceDetailInfo);
        deviceDetailInfo.setAppsFlyerId(cloneField(getAppsFlyerId()));
        String str = this.appsFlyerAdvertisingId;
        deviceDetailInfo.appsFlyerAdvertisingId = str != null ? cloneField(str) : null;
        APIModelBase aPIModelBase = this.iosDeviceData;
        deviceDetailInfo.iosDeviceData = aPIModelBase != null ? (IosDeviceData) cloneField(aPIModelBase) : null;
        APIModelBase aPIModelBase2 = this.androidDeviceData;
        deviceDetailInfo.androidDeviceData = aPIModelBase2 != null ? (AndroidDeviceData) cloneField(aPIModelBase2) : null;
        deviceDetailInfo.setCountryCode(cloneField(getCountryCode()));
        deviceDetailInfo.setLanguage(cloneField(getLanguage()));
        deviceDetailInfo.setAppVersion(cloneField(getAppVersion()));
        String str2 = this.deviceOs;
        deviceDetailInfo.deviceOs = str2 != null ? cloneField(str2) : null;
        String str3 = this.deviceModel;
        deviceDetailInfo.deviceModel = str3 != null ? cloneField(str3) : null;
    }

    /* compiled from: DeviceDetailInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceDetailInfo$Companion;", "", "<init>", "()V", "getDeviceDetailInfoJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceDetailInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getDeviceDetailInfoJsonArrayMap(List<DeviceDetailInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DeviceDetailInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
