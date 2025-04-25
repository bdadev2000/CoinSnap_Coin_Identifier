package com.glority.android.cmsui.model;

import com.glority.android.cmsui.exception.ParameterCheckFailException;
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

/* compiled from: CmsTagValue.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0007HÂ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0017J\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00172\u0006\u0010\u0019\u001a\u00020\u0013J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\t\u0010\u001b\u001a\u00020\u0018HÖ\u0001R&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/android/cmsui/model/CmsTagValue;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/android/cmsui/model/CmsTagValueType;", "type", "getType", "()Lcom/glority/android/cmsui/model/CmsTagValueType;", "setType", "(Lcom/glority/android/cmsui/model/CmsTagValueType;)V", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "", "keepNull", "hashCode", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsTagValue implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CmsTagValueType type;
    private int unused;

    public CmsTagValue() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsTagValue copy$default(CmsTagValue cmsTagValue, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsTagValue.unused;
        }
        return cmsTagValue.copy(i);
    }

    public final CmsTagValue copy(int unused) {
        return new CmsTagValue(unused);
    }

    public String toString() {
        return "CmsTagValue(unused=" + this.unused + ")";
    }

    public CmsTagValue(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTagValue(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public Object clone() {
        return super.clone();
    }

    public final CmsTagValueType getType() {
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        return cmsTagValueType;
    }

    public final void setType(CmsTagValueType cmsTagValueType) {
        Intrinsics.checkNotNullParameter(cmsTagValueType, "<set-?>");
        this.type = cmsTagValueType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsTagValue(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("type") && !obj.isNull("type")) {
            this.type = CmsTagValueType.INSTANCE.fromValue(obj.getInt("type"));
            return;
        }
        throw new ParameterCheckFailException("type is missing in model CmsTagValue");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        hashMap.put("type", Integer.valueOf(cmsTagValueType.getValue()));
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTagValue)) {
            return false;
        }
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        CmsTagValueType cmsTagValueType2 = ((CmsTagValue) other).type;
        if (cmsTagValueType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        return cmsTagValueType == cmsTagValueType2;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        return hashCode + cmsTagValueType.hashCode();
    }

    /* compiled from: CmsTagValue.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/CmsTagValue$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsTagValueJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/CmsTagValue;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getCmsTagValueJsonArrayMap(List<CmsTagValue> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsTagValue) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
