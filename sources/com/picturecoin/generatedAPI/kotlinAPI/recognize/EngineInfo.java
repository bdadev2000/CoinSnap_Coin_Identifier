package com.picturecoin.generatedAPI.kotlinAPI.recognize;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: EngineInfo.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0016J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0014J\t\u0010#\u001a\u00020\u0005HÂ\u0003J\u0013\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010%\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", LogEventArguments.ARG_VERSION, "Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineVersion;", "getVersion", "()Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineVersion;", "setVersion", "(Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineVersion;)V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class EngineInfo extends APIModelBase<EngineInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String address;
    private int unused;
    private EngineVersion version;

    public EngineInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final EngineInfo copy(int unused) {
        return new EngineInfo(unused);
    }

    public String toString() {
        return "EngineInfo(unused=" + this.unused + ")";
    }

    public EngineInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ EngineInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ EngineInfo copy$default(EngineInfo engineInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = engineInfo.unused;
        }
        return engineInfo.copy(i);
    }

    public final EngineVersion getVersion() {
        return this.version;
    }

    public final void setVersion(EngineVersion engineVersion) {
        this.version = engineVersion;
    }

    public final String getAddress() {
        String str = this.address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("address");
        return null;
    }

    public final void setAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EngineInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(LogEventArguments.ARG_VERSION) && !obj.isNull(LogEventArguments.ARG_VERSION)) {
            Object obj2 = obj.get(LogEventArguments.ARG_VERSION);
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            this.version = new EngineVersion((JSONObject) obj2);
        } else {
            this.version = null;
        }
        if (obj.has("address") && !obj.isNull("address")) {
            setAddress(obj.getString("address"));
            return;
        }
        throw new ParameterCheckFailException("address is missing in model EngineInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        EngineVersion engineVersion = this.version;
        if (engineVersion != null) {
            Intrinsics.checkNotNull(engineVersion);
            hashMap.put(LogEventArguments.ARG_VERSION, engineVersion.getJsonMap());
        } else if (keepNull) {
            hashMap.put(LogEventArguments.ARG_VERSION, null);
        }
        hashMap.put("address", getAddress());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof EngineInfo)) {
            return false;
        }
        EngineInfo engineInfo = (EngineInfo) other;
        return Intrinsics.areEqual(this.version, engineInfo.version) && Intrinsics.areEqual(getAddress(), engineInfo.getAddress());
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        EngineVersion engineVersion = this.version;
        return ((hashCode + (engineVersion != null ? engineVersion.hashCode() : 0)) * 31) + getAddress().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        EngineInfo engineInfo = new EngineInfo(0, 1, null);
        cloneTo(engineInfo);
        return engineInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.recognize.EngineInfo");
        EngineInfo engineInfo = (EngineInfo) o;
        super.cloneTo(engineInfo);
        APIModelBase aPIModelBase = this.version;
        engineInfo.version = aPIModelBase != null ? (EngineVersion) cloneField(aPIModelBase) : null;
        engineInfo.setAddress(cloneField(getAddress()));
    }

    /* compiled from: EngineInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineInfo$Companion;", "", "<init>", "()V", "getEngineInfoJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/EngineInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getEngineInfoJsonArrayMap(List<EngineInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EngineInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
