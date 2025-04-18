package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;
import w0.d;

@StabilityInferred
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class RangeSliderState {

    /* renamed from: a, reason: collision with root package name */
    public final int f10761a;

    /* renamed from: b, reason: collision with root package name */
    public q0.a f10762b;

    /* renamed from: c, reason: collision with root package name */
    public final d f10763c;
    public final ParcelableSnapshotMutableFloatState d;
    public final ParcelableSnapshotMutableFloatState e;

    /* renamed from: f, reason: collision with root package name */
    public l f10764f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f10765g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f10766h = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f10767i = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f10768j = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f10769k = SnapshotIntStateKt.a(0);

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f10770l = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f10771m = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f10772n;

    /* renamed from: o, reason: collision with root package name */
    public final l f10773o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f10774p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f10775q;

    public RangeSliderState(float f2, float f3, int i2, q0.a aVar, d dVar) {
        ParcelableSnapshotMutableState f4;
        this.f10761a = i2;
        this.f10762b = aVar;
        this.f10763c = dVar;
        this.d = PrimitiveSnapshotStateKt.a(f2);
        this.e = PrimitiveSnapshotStateKt.a(f3);
        this.f10765g = SliderKt.j(i2);
        f4 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f10772n = f4;
        this.f10773o = new RangeSliderState$gestureEndAction$1(this);
        this.f10774p = PrimitiveSnapshotStateKt.a(0.0f);
        this.f10775q = PrimitiveSnapshotStateKt.a(0.0f);
    }

    public final float a() {
        return this.e.c();
    }

    public final float b() {
        return this.d.c();
    }

    public final float c() {
        d dVar = this.f10763c;
        return SliderKt.k(Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(dVar.f31405b).floatValue(), a());
    }

    public final float d() {
        d dVar = this.f10763c;
        return SliderKt.k(Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(dVar.f31405b).floatValue(), b());
    }

    public final int e() {
        return (int) Math.floor((1.0f - d()) * this.f10761a);
    }

    public final int f() {
        return (int) Math.floor(c() * this.f10761a);
    }

    public final void g(float f2, boolean z2) {
        long g2;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.d;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = this.e;
        float[] fArr = this.f10765g;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState3 = this.f10771m;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState4 = this.f10770l;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState5 = this.f10774p;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState6 = this.f10775q;
        if (z2) {
            parcelableSnapshotMutableFloatState4.n(parcelableSnapshotMutableFloatState4.c() + f2);
            parcelableSnapshotMutableFloatState3.n(h(parcelableSnapshotMutableFloatState6.c(), parcelableSnapshotMutableFloatState5.c(), parcelableSnapshotMutableFloatState2.c()));
            float c2 = parcelableSnapshotMutableFloatState3.c();
            g2 = SliderKt.g(SliderKt.i(p0.a.z(parcelableSnapshotMutableFloatState4.c(), parcelableSnapshotMutableFloatState6.c(), c2), parcelableSnapshotMutableFloatState6.c(), parcelableSnapshotMutableFloatState5.c(), fArr), c2);
        } else {
            parcelableSnapshotMutableFloatState3.n(parcelableSnapshotMutableFloatState3.c() + f2);
            parcelableSnapshotMutableFloatState4.n(h(parcelableSnapshotMutableFloatState6.c(), parcelableSnapshotMutableFloatState5.c(), parcelableSnapshotMutableFloatState.c()));
            float c3 = parcelableSnapshotMutableFloatState4.c();
            g2 = SliderKt.g(c3, SliderKt.i(p0.a.z(parcelableSnapshotMutableFloatState3.c(), c3, parcelableSnapshotMutableFloatState5.c()), parcelableSnapshotMutableFloatState6.c(), parcelableSnapshotMutableFloatState5.c(), fArr));
        }
        float c4 = parcelableSnapshotMutableFloatState6.c();
        float c5 = parcelableSnapshotMutableFloatState5.c();
        d dVar = this.f10763c;
        float floatValue = Float.valueOf(dVar.f31404a).floatValue();
        float floatValue2 = Float.valueOf(dVar.f31405b).floatValue();
        long g3 = SliderKt.g(SliderKt.l(c4, c5, SliderRange.b(g2), floatValue, floatValue2), SliderKt.l(c4, c5, SliderRange.a(g2), floatValue, floatValue2));
        if (g3 == SliderKt.g(parcelableSnapshotMutableFloatState.c(), parcelableSnapshotMutableFloatState2.c())) {
            return;
        }
        l lVar = this.f10764f;
        if (lVar != null) {
            lVar.invoke(new SliderRange(g3));
        } else {
            j(SliderRange.b(g3));
            i(SliderRange.a(g3));
        }
    }

    public final float h(float f2, float f3, float f4) {
        d dVar = this.f10763c;
        return SliderKt.l(Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(dVar.f31405b).floatValue(), f4, f2, f3);
    }

    public final void i(float f2) {
        float c2 = this.d.c();
        d dVar = this.f10763c;
        this.e.n(SliderKt.i(p0.a.z(f2, c2, Float.valueOf(dVar.f31405b).floatValue()), Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(dVar.f31405b).floatValue(), this.f10765g));
    }

    public final void j(float f2) {
        d dVar = this.f10763c;
        this.d.n(SliderKt.i(p0.a.z(f2, Float.valueOf(dVar.f31404a).floatValue(), this.e.c()), Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(dVar.f31405b).floatValue(), this.f10765g));
    }
}
