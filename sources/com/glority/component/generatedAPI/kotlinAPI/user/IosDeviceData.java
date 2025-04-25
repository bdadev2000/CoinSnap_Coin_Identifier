package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.android.core.definition.APIModelBase;
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

/* compiled from: IosDeviceData.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0016J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0014J\t\u0010 \u001a\u00020\u0005HÂ\u0003J\u0013\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\"\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006$"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/IosDeviceData;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "idfa", "", "getIdfa", "()Ljava/lang/String;", "setIdfa", "(Ljava/lang/String;)V", "idfv", "getIdfv", "setIdfv", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class IosDeviceData extends APIModelBase<IosDeviceData> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String idfa;
    private String idfv;
    private int unused;

    public IosDeviceData() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final IosDeviceData copy(int unused) {
        return new IosDeviceData(unused);
    }

    public String toString() {
        return "IosDeviceData(unused=" + this.unused + ")";
    }

    public IosDeviceData(int i) {
        this.unused = i;
    }

    public /* synthetic */ IosDeviceData(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ IosDeviceData copy$default(IosDeviceData iosDeviceData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iosDeviceData.unused;
        }
        return iosDeviceData.copy(i);
    }

    public final String getIdfa() {
        return this.idfa;
    }

    public final void setIdfa(String str) {
        this.idfa = str;
    }

    public final String getIdfv() {
        return this.idfv;
    }

    public final void setIdfv(String str) {
        this.idfv = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IosDeviceData(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("idfa") && !obj.isNull("idfa")) {
            this.idfa = obj.getString("idfa");
        } else {
            this.idfa = null;
        }
        if (obj.has("idfv") && !obj.isNull("idfv")) {
            this.idfv = obj.getString("idfv");
        } else {
            this.idfv = null;
        }
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.idfa;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("idfa", str);
        } else if (keepNull) {
            hashMap.put("idfa", null);
        }
        String str2 = this.idfv;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("idfv", str2);
        } else if (keepNull) {
            hashMap.put("idfv", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof IosDeviceData)) {
            return false;
        }
        IosDeviceData iosDeviceData = (IosDeviceData) other;
        return Intrinsics.areEqual(this.idfa, iosDeviceData.idfa) && Intrinsics.areEqual(this.idfv, iosDeviceData.idfv);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.idfa;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.idfv;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        IosDeviceData iosDeviceData = new IosDeviceData(0, 1, null);
        cloneTo(iosDeviceData);
        return iosDeviceData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.IosDeviceData");
        IosDeviceData iosDeviceData = (IosDeviceData) o;
        super.cloneTo(iosDeviceData);
        String str = this.idfa;
        iosDeviceData.idfa = str != null ? cloneField(str) : null;
        String str2 = this.idfv;
        iosDeviceData.idfv = str2 != null ? cloneField(str2) : null;
    }

    /* compiled from: IosDeviceData.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/IosDeviceData$Companion;", "", "<init>", "()V", "getIosDeviceDataJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/IosDeviceData;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getIosDeviceDataJsonArrayMap(List<IosDeviceData> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((IosDeviceData) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
