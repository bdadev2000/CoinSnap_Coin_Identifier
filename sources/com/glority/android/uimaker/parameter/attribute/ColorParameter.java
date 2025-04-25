package com.glority.android.uimaker.parameter.attribute;

import kotlin.Metadata;

/* compiled from: ColorParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0006\u0010\u0011\u001a\u00020\u0000J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0013J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "", "r", "", "g", "b", "a", "(FFFF)V", "getA", "()F", "getB", "getG", "getR", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "isWhite", "toString", "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final /* data */ class ColorParameter {
    private final float a;
    private final float b;
    private final float g;
    private final float r;

    public static /* synthetic */ ColorParameter copy$default(ColorParameter colorParameter, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = colorParameter.r;
        }
        if ((i & 2) != 0) {
            f2 = colorParameter.g;
        }
        if ((i & 4) != 0) {
            f3 = colorParameter.b;
        }
        if ((i & 8) != 0) {
            f4 = colorParameter.a;
        }
        return colorParameter.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getR() {
        return this.r;
    }

    /* renamed from: component2, reason: from getter */
    public final float getG() {
        return this.g;
    }

    /* renamed from: component3, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* renamed from: component4, reason: from getter */
    public final float getA() {
        return this.a;
    }

    public final ColorParameter copy(float r, float g, float b, float a2) {
        return new ColorParameter(r, g, b, a2);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.r) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.a);
    }

    public String toString() {
        return "ColorParameter(r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", a=" + this.a + ")";
    }

    public ColorParameter(float f, float f2, float f3, float f4) {
        this.r = f;
        this.g = f2;
        this.b = f3;
        this.a = f4;
    }

    public final float getA() {
        return this.a;
    }

    public final float getB() {
        return this.b;
    }

    public final float getG() {
        return this.g;
    }

    public final float getR() {
        return this.r;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ColorParameter)) {
            return false;
        }
        ColorParameter colorParameter = (ColorParameter) other;
        return this.r == colorParameter.r && this.g == colorParameter.g && this.b == colorParameter.b && this.a == colorParameter.a;
    }

    public final ColorParameter copy() {
        return new ColorParameter(this.r, this.g, this.b, this.a);
    }

    public final boolean isWhite() {
        return this.r == 1.0f && this.g == 1.0f && this.b == 1.0f && this.a == 1.0f;
    }
}
