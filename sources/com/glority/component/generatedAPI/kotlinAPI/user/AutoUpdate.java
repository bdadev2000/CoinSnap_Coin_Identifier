package com.glority.component.generatedAPI.kotlinAPI.user;

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
import org.json.JSONObject;

/* compiled from: AutoUpdate.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0006\u0010\u0018\u001a\u00020\fJ\u0016\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0016J\u0013\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017H\u0014J\t\u0010 \u001a\u00020\u0005HÂ\u0003J\u0013\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\"\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006$"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/AutoUpdate;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "hasUpdate", "", "getHasUpdate", "()Z", "setHasUpdate", "(Z)V", "forceUpdate", "getForceUpdate", "setForceUpdate", "getJsonMap", "", "", "", "keepNull", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class AutoUpdate extends APIModelBase<AutoUpdate> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean forceUpdate;
    private boolean hasUpdate;
    private int unused;

    public AutoUpdate() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final AutoUpdate copy(int unused) {
        return new AutoUpdate(unused);
    }

    public String toString() {
        return "AutoUpdate(unused=" + this.unused + ")";
    }

    public AutoUpdate(int i) {
        this.unused = i;
    }

    public /* synthetic */ AutoUpdate(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ AutoUpdate copy$default(AutoUpdate autoUpdate, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = autoUpdate.unused;
        }
        return autoUpdate.copy(i);
    }

    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    public final void setHasUpdate(boolean z) {
        this.hasUpdate = z;
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final void setForceUpdate(boolean z) {
        this.forceUpdate = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoUpdate(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("has_update") && !obj.isNull("has_update")) {
            this.hasUpdate = parseBoolean(obj, "has_update").booleanValue();
            if (obj.has("force_update") && !obj.isNull("force_update")) {
                this.forceUpdate = parseBoolean(obj, "force_update").booleanValue();
                return;
            }
            throw new ParameterCheckFailException("forceUpdate is missing in model AutoUpdate");
        }
        throw new ParameterCheckFailException("hasUpdate is missing in model AutoUpdate");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("has_update", Integer.valueOf(this.hasUpdate ? 1 : 0));
        hashMap.put("force_update", Integer.valueOf(this.forceUpdate ? 1 : 0));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof AutoUpdate)) {
            return false;
        }
        AutoUpdate autoUpdate = (AutoUpdate) other;
        return this.hasUpdate == autoUpdate.hasUpdate && this.forceUpdate == autoUpdate.forceUpdate;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + Boolean.hashCode(this.hasUpdate)) * 31) + Boolean.hashCode(this.forceUpdate);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        AutoUpdate autoUpdate = new AutoUpdate(0, 1, null);
        cloneTo(autoUpdate);
        return autoUpdate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.AutoUpdate");
        AutoUpdate autoUpdate = (AutoUpdate) o;
        super.cloneTo(autoUpdate);
        autoUpdate.hasUpdate = cloneField(Boolean.valueOf(this.hasUpdate)).booleanValue();
        autoUpdate.forceUpdate = cloneField(Boolean.valueOf(this.forceUpdate)).booleanValue();
    }

    /* compiled from: AutoUpdate.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/AutoUpdate$Companion;", "", "<init>", "()V", "getAutoUpdateJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/AutoUpdate;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getAutoUpdateJsonArrayMap(List<AutoUpdate> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AutoUpdate) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
