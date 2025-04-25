package com.picturecoin.generatedAPI.kotlinAPI.recognize;

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
import org.json.JSONObject;

/* compiled from: EngineVersion.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00012B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020'J\u0016\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0016J\u0013\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010%H\u0014J\t\u0010/\u001a\u00020\u0005HÂ\u0003J\u0013\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010¨\u00063"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineVersion;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "appName", "getAppName", "setAppName", "dataVersion", "getDataVersion", "setDataVersion", "modelId", "getModelId", "setModelId", "env", "getEnv", "setEnv", "appBuildTime", "getAppBuildTime", "setAppBuildTime", "appCommit", "getAppCommit", "setAppCommit", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class EngineVersion extends APIModelBase<EngineVersion> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String appBuildTime;
    public String appCommit;
    public String appName;
    public String appVersion;
    public String dataVersion;
    public String env;
    public String modelId;
    private int unused;

    public EngineVersion() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final EngineVersion copy(int unused) {
        return new EngineVersion(unused);
    }

    public String toString() {
        return "EngineVersion(unused=" + this.unused + ")";
    }

    public EngineVersion(int i) {
        this.unused = i;
    }

    public /* synthetic */ EngineVersion(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ EngineVersion copy$default(EngineVersion engineVersion, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = engineVersion.unused;
        }
        return engineVersion.copy(i);
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

    public final String getAppName() {
        String str = this.appName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appName");
        return null;
    }

    public final void setAppName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appName = str;
    }

    public final String getDataVersion() {
        String str = this.dataVersion;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataVersion");
        return null;
    }

    public final void setDataVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataVersion = str;
    }

    public final String getModelId() {
        String str = this.modelId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("modelId");
        return null;
    }

    public final void setModelId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modelId = str;
    }

    public final String getEnv() {
        String str = this.env;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("env");
        return null;
    }

    public final void setEnv(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.env = str;
    }

    public final String getAppBuildTime() {
        String str = this.appBuildTime;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appBuildTime");
        return null;
    }

    public final void setAppBuildTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appBuildTime = str;
    }

    public final String getAppCommit() {
        String str = this.appCommit;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appCommit");
        return null;
    }

    public final void setAppCommit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCommit = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EngineVersion(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("app_version") && !obj.isNull("app_version")) {
            setAppVersion(obj.getString("app_version"));
            if (obj.has("app_name") && !obj.isNull("app_name")) {
                setAppName(obj.getString("app_name"));
                if (obj.has("data_version") && !obj.isNull("data_version")) {
                    setDataVersion(obj.getString("data_version"));
                    if (obj.has("model_id") && !obj.isNull("model_id")) {
                        setModelId(obj.getString("model_id"));
                        if (obj.has("env") && !obj.isNull("env")) {
                            setEnv(obj.getString("env"));
                            if (obj.has("app_build_time") && !obj.isNull("app_build_time")) {
                                setAppBuildTime(obj.getString("app_build_time"));
                                if (obj.has("app_commit") && !obj.isNull("app_commit")) {
                                    setAppCommit(obj.getString("app_commit"));
                                    return;
                                }
                                throw new ParameterCheckFailException("appCommit is missing in model EngineVersion");
                            }
                            throw new ParameterCheckFailException("appBuildTime is missing in model EngineVersion");
                        }
                        throw new ParameterCheckFailException("env is missing in model EngineVersion");
                    }
                    throw new ParameterCheckFailException("modelId is missing in model EngineVersion");
                }
                throw new ParameterCheckFailException("dataVersion is missing in model EngineVersion");
            }
            throw new ParameterCheckFailException("appName is missing in model EngineVersion");
        }
        throw new ParameterCheckFailException("appVersion is missing in model EngineVersion");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_version", getAppVersion());
        hashMap.put("app_name", getAppName());
        hashMap.put("data_version", getDataVersion());
        hashMap.put("model_id", getModelId());
        hashMap.put("env", getEnv());
        hashMap.put("app_build_time", getAppBuildTime());
        hashMap.put("app_commit", getAppCommit());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof EngineVersion)) {
            return false;
        }
        EngineVersion engineVersion = (EngineVersion) other;
        return Intrinsics.areEqual(getAppVersion(), engineVersion.getAppVersion()) && Intrinsics.areEqual(getAppName(), engineVersion.getAppName()) && Intrinsics.areEqual(getDataVersion(), engineVersion.getDataVersion()) && Intrinsics.areEqual(getModelId(), engineVersion.getModelId()) && Intrinsics.areEqual(getEnv(), engineVersion.getEnv()) && Intrinsics.areEqual(getAppBuildTime(), engineVersion.getAppBuildTime()) && Intrinsics.areEqual(getAppCommit(), engineVersion.getAppCommit());
    }

    public int hashCode() {
        return (((((((((((((getClass().hashCode() * 31) + getAppVersion().hashCode()) * 31) + getAppName().hashCode()) * 31) + getDataVersion().hashCode()) * 31) + getModelId().hashCode()) * 31) + getEnv().hashCode()) * 31) + getAppBuildTime().hashCode()) * 31) + getAppCommit().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        EngineVersion engineVersion = new EngineVersion(0, 1, null);
        cloneTo(engineVersion);
        return engineVersion;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.recognize.EngineVersion");
        EngineVersion engineVersion = (EngineVersion) o;
        super.cloneTo(engineVersion);
        engineVersion.setAppVersion(cloneField(getAppVersion()));
        engineVersion.setAppName(cloneField(getAppName()));
        engineVersion.setDataVersion(cloneField(getDataVersion()));
        engineVersion.setModelId(cloneField(getModelId()));
        engineVersion.setEnv(cloneField(getEnv()));
        engineVersion.setAppBuildTime(cloneField(getAppBuildTime()));
        engineVersion.setAppCommit(cloneField(getAppCommit()));
    }

    /* compiled from: EngineVersion.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineVersion$Companion;", "", "<init>", "()V", "getEngineVersionJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineVersion;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getEngineVersionJsonArrayMap(List<EngineVersion> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EngineVersion) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
