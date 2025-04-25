package com.glority.component.generatedAPI.kotlinAPI.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.component.generatedAPI.kotlinAPI.enums.CameraFlash;
import com.glority.component.generatedAPI.kotlinAPI.enums.CameraFocus;
import com.glority.component.generatedAPI.kotlinAPI.enums.CameraZoom;
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

/* compiled from: CameraSettings.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0014J\t\u0010\"\u001a\u00020\bHÂ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0016\u0010'\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010\u001e0(H\u0016J\u001c\u0010'\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010\u001e0(2\u0006\u0010*\u001a\u00020%J\b\u0010+\u001a\u00020\bH\u0016J\t\u0010,\u001a\u00020)HÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/core/CameraSettings;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraFlash;", "cameraFlash", "getCameraFlash", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraFlash;", "setCameraFlash", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraFlash;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraFocus;", "cameraFocus", "getCameraFocus", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraFocus;", "setCameraFocus", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraFocus;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraZoom;", "cameraZoom", "getCameraZoom", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraZoom;", "setCameraZoom", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CameraZoom;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "", "keepNull", "hashCode", "toString", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CameraSettings extends APIModelBase<CameraSettings> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private CameraFlash cameraFlash;
    private CameraFocus cameraFocus;
    private CameraZoom cameraZoom;
    private int unused;

    public CameraSettings() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CameraSettings copy$default(CameraSettings cameraSettings, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cameraSettings.unused;
        }
        return cameraSettings.copy(i);
    }

    public final CameraSettings copy(int unused) {
        return new CameraSettings(unused);
    }

    public String toString() {
        return "CameraSettings(unused=" + this.unused + ')';
    }

    public CameraSettings(int i) {
        this.unused = i;
    }

    public /* synthetic */ CameraSettings(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final CameraFlash getCameraFlash() {
        return this.cameraFlash;
    }

    public final void setCameraFlash(CameraFlash cameraFlash) {
        this.cameraFlash = cameraFlash;
    }

    public final CameraFocus getCameraFocus() {
        return this.cameraFocus;
    }

    public final void setCameraFocus(CameraFocus cameraFocus) {
        this.cameraFocus = cameraFocus;
    }

    public final CameraZoom getCameraZoom() {
        return this.cameraZoom;
    }

    public final void setCameraZoom(CameraZoom cameraZoom) {
        this.cameraZoom = cameraZoom;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraSettings(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("cameraFlash") && !obj.isNull("cameraFlash")) {
            this.cameraFlash = CameraFlash.INSTANCE.fromValue(obj.getInt("cameraFlash"));
        } else {
            this.cameraFlash = null;
        }
        if (obj.has("cameraFocus") && !obj.isNull("cameraFocus")) {
            this.cameraFocus = CameraFocus.INSTANCE.fromValue(obj.getInt("cameraFocus"));
        } else {
            this.cameraFocus = null;
        }
        if (obj.has("cameraZoom") && !obj.isNull("cameraZoom")) {
            this.cameraZoom = CameraZoom.INSTANCE.fromValue(obj.getInt("cameraZoom"));
        } else {
            this.cameraZoom = null;
        }
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        CameraFlash cameraFlash = this.cameraFlash;
        if (cameraFlash != null) {
            Intrinsics.checkNotNull(cameraFlash);
            hashMap.put("cameraFlash", Integer.valueOf(cameraFlash.getValue()));
        } else if (keepNull) {
            hashMap.put("cameraFlash", null);
        }
        CameraFocus cameraFocus = this.cameraFocus;
        if (cameraFocus != null) {
            Intrinsics.checkNotNull(cameraFocus);
            hashMap.put("cameraFocus", Integer.valueOf(cameraFocus.getValue()));
        } else if (keepNull) {
            hashMap.put("cameraFocus", null);
        }
        CameraZoom cameraZoom = this.cameraZoom;
        if (cameraZoom != null) {
            Intrinsics.checkNotNull(cameraZoom);
            hashMap.put("cameraZoom", Integer.valueOf(cameraZoom.getValue()));
        } else if (keepNull) {
            hashMap.put("cameraZoom", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CameraSettings)) {
            return false;
        }
        CameraSettings cameraSettings = (CameraSettings) other;
        return this.cameraFlash == cameraSettings.cameraFlash && this.cameraFocus == cameraSettings.cameraFocus && this.cameraZoom == cameraSettings.cameraZoom;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        CameraFlash cameraFlash = this.cameraFlash;
        int hashCode2 = (hashCode + (cameraFlash != null ? cameraFlash.hashCode() : 0)) * 31;
        CameraFocus cameraFocus = this.cameraFocus;
        int hashCode3 = (hashCode2 + (cameraFocus != null ? cameraFocus.hashCode() : 0)) * 31;
        CameraZoom cameraZoom = this.cameraZoom;
        return hashCode3 + (cameraZoom != null ? cameraZoom.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CameraSettings cameraSettings = new CameraSettings(0, 1, null);
        cloneTo(cameraSettings);
        return cameraSettings;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CameraSettings cameraSettings = (CameraSettings) o;
            super.cloneTo(cameraSettings);
            Enum r0 = this.cameraFlash;
            cameraSettings.cameraFlash = r0 != null ? (CameraFlash) cloneField(r0) : null;
            Enum r02 = this.cameraFocus;
            cameraSettings.cameraFocus = r02 != null ? (CameraFocus) cloneField(r02) : null;
            Enum r03 = this.cameraZoom;
            cameraSettings.cameraZoom = r03 != null ? (CameraZoom) cloneField(r03) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.core.CameraSettings");
    }

    /* compiled from: CameraSettings.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/core/CameraSettings$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCameraSettingsJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/core/CameraSettings;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCameraSettingsJsonArrayMap(List<CameraSettings> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CameraSettings) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
