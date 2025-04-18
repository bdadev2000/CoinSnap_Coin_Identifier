package androidx.compose.ui.geometry;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MutableRect {

    /* renamed from: a, reason: collision with root package name */
    public float f14910a;

    /* renamed from: b, reason: collision with root package name */
    public float f14911b;

    /* renamed from: c, reason: collision with root package name */
    public float f14912c;
    public float d;

    public final void a(float f2, float f3, float f4, float f5) {
        this.f14910a = Math.max(f2, this.f14910a);
        this.f14911b = Math.max(f3, this.f14911b);
        this.f14912c = Math.min(f4, this.f14912c);
        this.d = Math.min(f5, this.d);
    }

    public final boolean b() {
        return this.f14910a >= this.f14912c || this.f14911b >= this.d;
    }

    public final String toString() {
        return "MutableRect(" + GeometryUtilsKt.a(this.f14910a) + ", " + GeometryUtilsKt.a(this.f14911b) + ", " + GeometryUtilsKt.a(this.f14912c) + ", " + GeometryUtilsKt.a(this.d) + ')';
    }
}
