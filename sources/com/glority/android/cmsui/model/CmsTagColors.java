package com.glority.android.cmsui.model;

import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CmsTagColors.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0007HÂ\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001dJ\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001d2\u0006\u0010\u001f\u001a\u00020\u0019J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u001eHÖ\u0001R&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/glority/android/cmsui/model/CmsTagColors;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/android/cmsui/model/Color;", "color", "getColor", "()Lcom/glority/android/cmsui/model/Color;", "setColor", "(Lcom/glority/android/cmsui/model/Color;)V", "Lcom/glority/android/cmsui/model/CmsTagValueType;", "type", "getType", "()Lcom/glority/android/cmsui/model/CmsTagValueType;", "setType", "(Lcom/glority/android/cmsui/model/CmsTagValueType;)V", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "", "keepNull", "hashCode", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CmsTagColors implements Serializable, Cloneable {
    public Color color;
    public CmsTagValueType type;
    private int unused;

    public CmsTagColors() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsTagColors copy$default(CmsTagColors cmsTagColors, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsTagColors.unused;
        }
        return cmsTagColors.copy(i);
    }

    public final CmsTagColors copy(int unused) {
        return new CmsTagColors(unused);
    }

    public int hashCode() {
        return Integer.hashCode(this.unused);
    }

    public String toString() {
        return "CmsTagColors(unused=" + this.unused + ")";
    }

    public CmsTagColors(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTagColors(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final Color getColor() {
        Color color = this.color;
        if (color == null) {
            Intrinsics.throwUninitializedPropertyAccessException("color");
        }
        return color;
    }

    public final void setColor(Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.color = color;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsTagColors(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("type") && !obj.isNull("type")) {
            this.type = CmsTagValueType.INSTANCE.fromValue(obj.getInt("type"));
            if (obj.has("color") && !obj.isNull("color")) {
                this.color = Color.INSTANCE.fromValue(obj.getInt("color"));
                return;
            }
            throw new ParameterCheckFailException("color is missing in model CmsTagColors");
        }
        throw new ParameterCheckFailException("type is missing in model CmsTagColors");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        hashMap.put("type", Integer.valueOf(cmsTagValueType.getValue()));
        Color color = this.color;
        if (color == null) {
            Intrinsics.throwUninitializedPropertyAccessException("color");
        }
        hashMap.put("color", Integer.valueOf(color.getValue()));
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTagColors)) {
            return false;
        }
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        CmsTagColors cmsTagColors = (CmsTagColors) other;
        CmsTagValueType cmsTagValueType2 = cmsTagColors.type;
        if (cmsTagValueType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        if (cmsTagValueType != cmsTagValueType2) {
            return false;
        }
        Color color = this.color;
        if (color == null) {
            Intrinsics.throwUninitializedPropertyAccessException("color");
        }
        Color color2 = cmsTagColors.color;
        if (color2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("color");
        }
        return color == color2;
    }
}
