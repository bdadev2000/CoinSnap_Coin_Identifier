package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntSizeKt;
import b1.d0;
import java.util.List;
import java.util.Map;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final List f5239a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5240b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5241c;
    public final int d;
    public final Orientation e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5242f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5243g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5244h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5245i;

    /* renamed from: j, reason: collision with root package name */
    public final MeasuredPage f5246j;

    /* renamed from: k, reason: collision with root package name */
    public final MeasuredPage f5247k;

    /* renamed from: l, reason: collision with root package name */
    public float f5248l;

    /* renamed from: m, reason: collision with root package name */
    public int f5249m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5250n;

    /* renamed from: o, reason: collision with root package name */
    public final SnapPosition f5251o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5252p;

    /* renamed from: q, reason: collision with root package name */
    public final List f5253q;

    /* renamed from: r, reason: collision with root package name */
    public final List f5254r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f5255s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MeasureResult f5256t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ PagerMeasureResult(int r22, int r23, int r24, androidx.compose.foundation.gestures.Orientation r25, int r26, int r27, int r28, androidx.compose.foundation.gestures.snapping.SnapPosition r29, androidx.compose.ui.layout.MeasureResult r30, b1.d0 r31) {
        /*
            r21 = this;
            e0.w r19 = e0.w.f30218a
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r0 = r21
            r1 = r19
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r9 = r28
            r15 = r29
            r16 = r30
            r18 = r19
            r20 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerMeasureResult.<init>(int, int, int, androidx.compose.foundation.gestures.Orientation, int, int, int, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.ui.layout.MeasureResult, b1.d0):void");
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final long a() {
        MeasureResult measureResult = this.f5256t;
        return IntSizeKt.a(measureResult.getWidth(), measureResult.getHeight());
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int b() {
        return this.d;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final Orientation c() {
        return this.e;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int d() {
        return -this.f5242f;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int e() {
        return this.f5243g;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final boolean f() {
        return this.f5244h;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int g() {
        return this.f5242f;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        return this.f5256t.getHeight();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int getPageSize() {
        return this.f5240b;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        return this.f5256t.getWidth();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final List h() {
        return this.f5239a;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int i() {
        return this.f5241c;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int j() {
        return this.f5245i;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final SnapPosition k() {
        return this.f5251o;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map q() {
        return this.f5256t.q();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void r() {
        this.f5256t.r();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final l s() {
        return this.f5256t.s();
    }

    public PagerMeasureResult(List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6, boolean z2, int i7, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f2, int i8, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List list2, List list3, d0 d0Var) {
        this.f5239a = list;
        this.f5240b = i2;
        this.f5241c = i3;
        this.d = i4;
        this.e = orientation;
        this.f5242f = i5;
        this.f5243g = i6;
        this.f5244h = z2;
        this.f5245i = i7;
        this.f5246j = measuredPage;
        this.f5247k = measuredPage2;
        this.f5248l = f2;
        this.f5249m = i8;
        this.f5250n = z3;
        this.f5251o = snapPosition;
        this.f5252p = z4;
        this.f5253q = list2;
        this.f5254r = list3;
        this.f5255s = d0Var;
        this.f5256t = measureResult;
    }
}
