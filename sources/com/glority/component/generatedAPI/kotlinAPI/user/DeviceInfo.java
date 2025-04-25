package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
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

/* compiled from: DeviceInfo.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0006\u0010 \u001a\u00020!J\u0016\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001eH\u0016J\u0013\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0014J\t\u0010)\u001a\u00020\u0005HÂ\u0003J\u0013\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010+\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "deviceType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "getDeviceType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "setDeviceType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;)V", "deviceToken", "", "getDeviceToken", "()Ljava/lang/String;", "setDeviceToken", "(Ljava/lang/String;)V", "deviceDetailInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceDetailInfo;", "getDeviceDetailInfo", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceDetailInfo;", "setDeviceDetailInfo", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceDetailInfo;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class DeviceInfo extends APIModelBase<DeviceInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 1;
    private DeviceDetailInfo deviceDetailInfo;
    public String deviceToken;
    public DeviceType deviceType;
    private int unused;

    public DeviceInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final DeviceInfo copy(int unused) {
        return new DeviceInfo(unused);
    }

    public String toString() {
        return "DeviceInfo(unused=" + this.unused + ")";
    }

    public DeviceInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ DeviceInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deviceInfo.unused;
        }
        return deviceInfo.copy(i);
    }

    public final DeviceType getDeviceType() {
        DeviceType deviceType = this.deviceType;
        if (deviceType != null) {
            return deviceType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceType");
        return null;
    }

    public final void setDeviceType(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "<set-?>");
        this.deviceType = deviceType;
    }

    public final String getDeviceToken() {
        String str = this.deviceToken;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceToken");
        return null;
    }

    public final void setDeviceToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceToken = str;
    }

    public final DeviceDetailInfo getDeviceDetailInfo() {
        return this.deviceDetailInfo;
    }

    public final void setDeviceDetailInfo(DeviceDetailInfo deviceDetailInfo) {
        this.deviceDetailInfo = deviceDetailInfo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("device_type") && !obj.isNull("device_type")) {
            setDeviceType(DeviceType.INSTANCE.fromValue(obj.getInt("device_type")));
            if (obj.has("device_token") && !obj.isNull("device_token")) {
                setDeviceToken(obj.getString("device_token"));
                if (obj.has("device_detail_info") && !obj.isNull("device_detail_info")) {
                    Object obj2 = obj.get("device_detail_info");
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    this.deviceDetailInfo = new DeviceDetailInfo((JSONObject) obj2);
                    return;
                }
                this.deviceDetailInfo = null;
                return;
            }
            throw new ParameterCheckFailException("deviceToken is missing in model DeviceInfo");
        }
        throw new ParameterCheckFailException("deviceType is missing in model DeviceInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("device_type", Integer.valueOf(getDeviceType().getValue()));
        hashMap.put("device_token", getDeviceToken());
        DeviceDetailInfo deviceDetailInfo = this.deviceDetailInfo;
        if (deviceDetailInfo != null) {
            Intrinsics.checkNotNull(deviceDetailInfo);
            hashMap.put("device_detail_info", deviceDetailInfo.getJsonMap());
        } else if (keepNull) {
            hashMap.put("device_detail_info", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return getDeviceType() == deviceInfo.getDeviceType() && Intrinsics.areEqual(getDeviceToken(), deviceInfo.getDeviceToken()) && Intrinsics.areEqual(this.deviceDetailInfo, deviceInfo.deviceDetailInfo);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + getDeviceType().hashCode()) * 31) + getDeviceToken().hashCode()) * 31;
        DeviceDetailInfo deviceDetailInfo = this.deviceDetailInfo;
        return hashCode + (deviceDetailInfo != null ? deviceDetailInfo.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        DeviceInfo deviceInfo = new DeviceInfo(0, 1, null);
        cloneTo(deviceInfo);
        return deviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.DeviceInfo");
        DeviceInfo deviceInfo = (DeviceInfo) o;
        super.cloneTo(deviceInfo);
        deviceInfo.setDeviceType((DeviceType) cloneField(getDeviceType()));
        deviceInfo.setDeviceToken(cloneField(getDeviceToken()));
        APIModelBase aPIModelBase = this.deviceDetailInfo;
        deviceInfo.deviceDetailInfo = aPIModelBase != null ? (DeviceDetailInfo) cloneField(aPIModelBase) : null;
    }

    /* compiled from: DeviceInfo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getDeviceInfoJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getDeviceInfoJsonArrayMap(List<DeviceInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DeviceInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
