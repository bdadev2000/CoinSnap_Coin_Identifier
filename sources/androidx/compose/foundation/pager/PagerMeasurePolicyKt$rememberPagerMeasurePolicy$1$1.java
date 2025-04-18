package androidx.compose.foundation.pager;

import android.support.v4.media.d;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.d0;
import b1.f0;
import e0.n;
import e0.q;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;
import w0.g;
import x0.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Orientation f5225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5226c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f5227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PageSize f5228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f5229h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f5230i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f5231j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f5232k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5233l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SnapPosition f5234m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d0 f5235n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(PagerState pagerState, Orientation orientation, PaddingValues paddingValues, boolean z2, float f2, PageSize pageSize, j jVar, a aVar, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i2, SnapPosition snapPosition, d0 d0Var) {
        super(2);
        this.f5224a = pagerState;
        this.f5225b = orientation;
        this.f5226c = paddingValues;
        this.d = z2;
        this.f5227f = f2;
        this.f5228g = pageSize;
        this.f5229h = jVar;
        this.f5230i = aVar;
        this.f5231j = vertical;
        this.f5232k = horizontal;
        this.f5233l = i2;
        this.f5234m = snapPosition;
        this.f5235n = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v70, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long a2;
        Orientation orientation;
        l lVar;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        n nVar;
        int i7;
        int i8;
        int i9;
        MeasuredPage measuredPage;
        int i10;
        Orientation orientation2;
        Orientation orientation3;
        boolean z2;
        MeasuredPage measuredPage2;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        List list;
        ArrayList arrayList2;
        List arrayList3;
        List arrayList4;
        Object obj3;
        PagerState pagerState;
        PagerMeasureResult pagerMeasureResult;
        int i14;
        n nVar2;
        LazyLayoutMeasureScope lazyLayoutMeasureScope = (LazyLayoutMeasureScope) obj;
        long j3 = ((Constraints) obj2).f17480a;
        PagerState pagerState2 = this.f5224a;
        pagerState2.D.getValue();
        Orientation orientation4 = Orientation.f3394a;
        Orientation orientation5 = this.f5225b;
        boolean z3 = orientation5 == orientation4;
        CheckScrollableContainerConstraintsKt.a(j3, z3 ? orientation4 : Orientation.f3395b);
        PaddingValues paddingValues = this.f5226c;
        int F0 = z3 ? lazyLayoutMeasureScope.F0(paddingValues.b(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.F0(PaddingKt.d(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
        int F02 = z3 ? lazyLayoutMeasureScope.F0(paddingValues.c(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.F0(PaddingKt.c(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
        int F03 = lazyLayoutMeasureScope.F0(paddingValues.d());
        int F04 = lazyLayoutMeasureScope.F0(paddingValues.a());
        int i15 = F03 + F04;
        int i16 = F0 + F02;
        int i17 = z3 ? i15 : i16;
        boolean z4 = this.d;
        if (z3 && !z4) {
            F02 = F03;
        } else if (z3 && z4) {
            F02 = F04;
        } else if (!z3 && !z4) {
            F02 = F0;
        }
        int i18 = i17 - F02;
        long k2 = ConstraintsKt.k(-i16, -i15, j3);
        pagerState2.f5276p = lazyLayoutMeasureScope;
        int F05 = lazyLayoutMeasureScope.F0(this.f5227f);
        int h2 = z3 ? Constraints.h(j3) - i15 : Constraints.i(j3) - i16;
        if (!z4 || h2 > 0) {
            a2 = IntOffsetKt.a(F0, F03);
        } else {
            if (!z3) {
                F0 += h2;
            }
            if (z3) {
                F03 += h2;
            }
            a2 = IntOffsetKt.a(F0, F03);
        }
        long j4 = a2;
        int a3 = this.f5228g.a(lazyLayoutMeasureScope, h2, F05);
        int i19 = a3 < 0 ? 0 : a3;
        pagerState2.A = ConstraintsKt.b(orientation5 == orientation4 ? Constraints.i(k2) : i19, orientation5 != orientation4 ? Constraints.h(k2) : i19, 5);
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) this.f5229h.invoke();
        SnapPosition snapPosition = this.f5234m;
        Snapshot a4 = Snapshot.Companion.a();
        if (a4 != null) {
            orientation = orientation4;
            lVar = a4.f();
        } else {
            orientation = orientation4;
            lVar = null;
        }
        Snapshot c2 = Snapshot.Companion.c(a4);
        long j5 = k2;
        try {
            int j6 = pagerState2.j();
            PagerScrollPosition pagerScrollPosition = pagerState2.f5265c;
            int a5 = LazyLayoutItemProviderKt.a(j6, pagerLazyLayoutItemProvider, pagerScrollPosition.e);
            if (j6 != a5) {
                j2 = j3;
                pagerScrollPosition.f5259b.b(a5);
                pagerScrollPosition.f5261f.a(j6);
            } else {
                j2 = j3;
            }
            int i20 = i19 + F05;
            int t02 = p0.a.t0(snapPosition.a(h2, i19, F02, i18, pagerState2.j(), pagerState2.m()) - (pagerState2.k() * i20));
            Snapshot.Companion.f(a4, c2, lVar);
            List a6 = LazyLayoutBeyondBoundsStateKt.a(pagerLazyLayoutItemProvider, pagerState2.B, pagerState2.w);
            int intValue = ((Number) this.f5230i.invoke()).intValue();
            Orientation orientation6 = this.f5225b;
            Alignment.Vertical vertical = this.f5231j;
            Alignment.Horizontal horizontal = this.f5232k;
            boolean z5 = this.d;
            int i21 = this.f5233l;
            int i22 = t02;
            SnapPosition snapPosition2 = this.f5234m;
            List list2 = a6;
            d0 d0Var = this.f5235n;
            PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1(lazyLayoutMeasureScope, j2, i16, i15);
            if (F02 < 0) {
                throw new IllegalArgumentException("negative beforeContentPadding".toString());
            }
            if (i18 < 0) {
                throw new IllegalArgumentException("negative afterContentPadding".toString());
            }
            int i23 = i20 < 0 ? 0 : i20;
            List list3 = w.f30218a;
            if (intValue <= 0) {
                pagerMeasureResult = new PagerMeasureResult(i19, F05, i18, orientation6, -F02, h2 + i18, i21, snapPosition2, (MeasureResult) pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1.invoke(Integer.valueOf(Constraints.k(j5)), Integer.valueOf(Constraints.j(j5)), PagerMeasureKt$measurePager$4.f5207a), d0Var);
                pagerState = pagerState2;
            } else {
                Orientation orientation7 = orientation;
                Orientation orientation8 = orientation6;
                long b2 = ConstraintsKt.b(orientation8 == orientation7 ? Constraints.i(j5) : i19, orientation8 != orientation7 ? Constraints.h(j5) : i19, 5);
                while (a5 > 0 && i22 > 0) {
                    a5--;
                    i22 -= i23;
                }
                int i24 = i22 * (-1);
                if (a5 >= intValue) {
                    a5 = intValue - 1;
                    i24 = 0;
                }
                n nVar3 = new n();
                int i25 = -F02;
                int i26 = F05;
                int i27 = i25 + (i26 < 0 ? i26 : 0);
                int i28 = i24 + i27;
                int i29 = 0;
                while (i28 < 0 && a5 > 0) {
                    int i30 = a5 - 1;
                    LayoutDirection layoutDirection = lazyLayoutMeasureScope.getLayoutDirection();
                    int i31 = i26;
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope;
                    Orientation orientation9 = orientation8;
                    n nVar4 = nVar3;
                    int i32 = i23;
                    MeasuredPage a7 = PagerMeasureKt.a(lazyLayoutMeasureScope2, i30, b2, pagerLazyLayoutItemProvider, j4, orientation9, horizontal, vertical, layoutDirection, z5, i19);
                    nVar4.add(0, a7);
                    i29 = Math.max(i29, a7.f5133k);
                    nVar3 = nVar4;
                    i28 += i32;
                    i23 = i32;
                    i20 = i20;
                    a5 = i30;
                    snapPosition2 = snapPosition2;
                    i25 = i25;
                    lazyLayoutMeasureScope = lazyLayoutMeasureScope3;
                    orientation8 = orientation9;
                    F02 = F02;
                    intValue = intValue;
                    h2 = h2;
                    i26 = i31;
                    d0Var = d0Var;
                    j5 = j5;
                    orientation7 = orientation7;
                    list2 = list2;
                }
                LazyLayoutMeasureScope lazyLayoutMeasureScope4 = lazyLayoutMeasureScope;
                int i33 = i26;
                int i34 = i25;
                Orientation orientation10 = orientation8;
                n nVar5 = nVar3;
                Orientation orientation11 = orientation7;
                int i35 = F02;
                int i36 = intValue;
                int i37 = h2;
                d0 d0Var2 = d0Var;
                List list4 = list2;
                long j7 = j5;
                SnapPosition snapPosition3 = snapPosition2;
                int i38 = i20;
                int i39 = i23;
                int i40 = i27;
                int i41 = i28;
                if (i41 < i40) {
                    i41 = i40;
                }
                int i42 = i41 - i40;
                int i43 = i37;
                int i44 = i43 + i18;
                int i45 = i44 < 0 ? 0 : i44;
                int i46 = -i42;
                int i47 = a5;
                int i48 = 0;
                boolean z6 = false;
                while (i48 < nVar5.f30212c) {
                    if (i46 >= i45) {
                        nVar5.c(i48);
                        z6 = true;
                    } else {
                        i47++;
                        i46 += i39;
                        i48++;
                    }
                }
                int i49 = i42;
                boolean z7 = z6;
                int i50 = i47;
                int i51 = a5;
                int i52 = i36;
                int i53 = i46;
                while (i50 < i52 && (i53 < i45 || i53 <= 0 || nVar5.isEmpty())) {
                    int i54 = i52;
                    n nVar6 = nVar5;
                    int i55 = i50;
                    int i56 = i45;
                    int i57 = i29;
                    int i58 = i53;
                    int i59 = i43;
                    int i60 = i40;
                    int i61 = i39;
                    MeasuredPage a8 = PagerMeasureKt.a(lazyLayoutMeasureScope4, i50, b2, pagerLazyLayoutItemProvider, j4, orientation10, horizontal, vertical, lazyLayoutMeasureScope4.getLayoutDirection(), z5, i19);
                    int i62 = i54 - 1;
                    i53 = i58 + (i55 == i62 ? i19 : i61);
                    if (i53 > i60 || i55 == i62) {
                        i39 = i61;
                        i29 = Math.max(i57, a8.f5133k);
                        nVar2 = nVar6;
                        nVar2.addLast(a8);
                    } else {
                        i39 = i61;
                        i49 -= i39;
                        i51 = i55 + 1;
                        nVar2 = nVar6;
                        i29 = i57;
                        z7 = true;
                    }
                    i50 = i55 + 1;
                    nVar5 = nVar2;
                    i52 = i54;
                    i45 = i56;
                    i43 = i59;
                    i40 = i60;
                }
                n nVar7 = nVar5;
                int i63 = i29;
                int i64 = i52;
                int i65 = i50;
                int i66 = i53;
                if (i66 < i43) {
                    int i67 = i43 - i66;
                    int i68 = i66 + i67;
                    int i69 = i63;
                    int i70 = i49 - i67;
                    int i71 = i35;
                    while (i70 < i71 && i51 > 0) {
                        i51--;
                        int i72 = i64;
                        n nVar8 = nVar7;
                        int i73 = i68;
                        int i74 = i39;
                        MeasuredPage a9 = PagerMeasureKt.a(lazyLayoutMeasureScope4, i51, b2, pagerLazyLayoutItemProvider, j4, orientation10, horizontal, vertical, lazyLayoutMeasureScope4.getLayoutDirection(), z5, i19);
                        nVar8.add(0, a9);
                        i69 = Math.max(i69, a9.f5133k);
                        i70 += i74;
                        i39 = i74;
                        nVar7 = nVar8;
                        i71 = i71;
                        i65 = i65;
                        i64 = i72;
                        i43 = i43;
                        i68 = i73;
                    }
                    i6 = i65;
                    int i75 = i68;
                    i5 = i71;
                    int i76 = i70;
                    i8 = i69;
                    i2 = i43;
                    i3 = i39;
                    i4 = i64;
                    nVar = nVar7;
                    if (i76 < 0) {
                        i7 = i75 + i76;
                        i9 = 0;
                    } else {
                        i7 = i75;
                        i9 = i76;
                    }
                } else {
                    i2 = i43;
                    i3 = i39;
                    i4 = i64;
                    i5 = i35;
                    i6 = i65;
                    nVar = nVar7;
                    i7 = i66;
                    i8 = i63;
                    i9 = i49;
                }
                if (i9 < 0) {
                    throw new IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
                }
                int i77 = -i9;
                MeasuredPage measuredPage3 = (MeasuredPage) nVar.first();
                if (i5 > 0 || i33 < 0) {
                    int i78 = nVar.f30212c;
                    int i79 = i9;
                    int i80 = 0;
                    while (i80 < i78 && i79 != 0 && i3 <= i79 && i80 != f0.p(nVar)) {
                        i79 -= i3;
                        i80++;
                        measuredPage3 = (MeasuredPage) nVar.get(i80);
                    }
                    measuredPage = measuredPage3;
                    i10 = i79;
                } else {
                    i10 = i9;
                    measuredPage = measuredPage3;
                }
                int i81 = i8;
                int i82 = i3;
                MeasuredPage measuredPage4 = measuredPage;
                PagerMeasureKt$measurePager$extraPagesBefore$1 pagerMeasureKt$measurePager$extraPagesBefore$1 = new PagerMeasureKt$measurePager$extraPagesBefore$1(lazyLayoutMeasureScope4, b2, pagerLazyLayoutItemProvider, j4, orientation10, horizontal, vertical, z5, i19);
                int max = Math.max(0, i51 - i21);
                int i83 = i51 - 1;
                List list5 = null;
                if (max <= i83) {
                    while (true) {
                        if (list5 == null) {
                            list5 = new ArrayList();
                        }
                        list5.add(pagerMeasureKt$measurePager$extraPagesBefore$1.invoke(Integer.valueOf(i83)));
                        if (i83 == max) {
                            break;
                        }
                        i83--;
                    }
                }
                int size = list4.size();
                int i84 = 0;
                while (i84 < size) {
                    List list6 = list4;
                    int intValue2 = ((Number) list6.get(i84)).intValue();
                    if (intValue2 < max) {
                        if (list5 == null) {
                            list5 = new ArrayList();
                        }
                        list5.add(pagerMeasureKt$measurePager$extraPagesBefore$1.invoke(Integer.valueOf(intValue2)));
                    }
                    i84++;
                    list4 = list6;
                }
                List list7 = list4;
                List list8 = list5 == null ? list3 : list5;
                int size2 = list8.size();
                int i85 = i81;
                for (int i86 = 0; i86 < size2; i86++) {
                    i85 = Math.max(i85, ((MeasuredPage) list8.get(i86)).f5133k);
                }
                int i87 = ((MeasuredPage) nVar.last()).f5125a;
                int i88 = i7;
                List list9 = list7;
                int i89 = i85;
                List list10 = list8;
                PagerMeasureKt$measurePager$extraPagesAfter$1 pagerMeasureKt$measurePager$extraPagesAfter$1 = new PagerMeasureKt$measurePager$extraPagesAfter$1(lazyLayoutMeasureScope4, b2, pagerLazyLayoutItemProvider, j4, orientation10, horizontal, vertical, z5, i19);
                int min = Math.min(i87 + i21, i4 - 1);
                int i90 = i87 + 1;
                List list11 = null;
                if (i90 <= min) {
                    while (true) {
                        if (list11 == null) {
                            list11 = new ArrayList();
                        }
                        list11.add(pagerMeasureKt$measurePager$extraPagesAfter$1.invoke(Integer.valueOf(i90)));
                        if (i90 == min) {
                            break;
                        }
                        i90++;
                    }
                }
                int size3 = list9.size();
                int i91 = 0;
                while (i91 < size3) {
                    List list12 = list9;
                    int intValue3 = ((Number) list12.get(i91)).intValue();
                    int i92 = i4;
                    if (min + 1 <= intValue3 && intValue3 < i92) {
                        if (list11 == null) {
                            list11 = new ArrayList();
                        }
                        list11.add(pagerMeasureKt$measurePager$extraPagesAfter$1.invoke(Integer.valueOf(intValue3)));
                    }
                    i91++;
                    list9 = list12;
                    i4 = i92;
                }
                int i93 = i4;
                if (list11 == null) {
                    list11 = list3;
                }
                int size4 = list11.size();
                int i94 = i89;
                for (int i95 = 0; i95 < size4; i95++) {
                    i94 = Math.max(i94, ((MeasuredPage) list11.get(i95)).f5133k);
                }
                if (p0.a.g(measuredPage4, nVar.first()) && list10.isEmpty() && list11.isEmpty()) {
                    z2 = true;
                    orientation2 = orientation10;
                    orientation3 = orientation11;
                } else {
                    orientation2 = orientation10;
                    orientation3 = orientation11;
                    z2 = false;
                }
                int h3 = ConstraintsKt.h(orientation2 == orientation3 ? i94 : i88, j7);
                if (orientation2 == orientation3) {
                    i94 = i88;
                }
                int g2 = ConstraintsKt.g(i94, j7);
                int i96 = orientation2 == orientation3 ? g2 : h3;
                int i97 = i2;
                boolean z8 = i88 < Math.min(i96, i97);
                int i98 = i77;
                if (z8 && i98 != 0) {
                    throw new IllegalStateException(d.i("non-zero pagesScrollOffset=", i98).toString());
                }
                ArrayList arrayList5 = new ArrayList(list11.size() + list10.size() + nVar.b());
                if (!z8) {
                    measuredPage2 = measuredPage4;
                    arrayList = arrayList5;
                    i11 = i88;
                    i12 = i97;
                    i13 = i33;
                    int size5 = list10.size();
                    int i99 = i98;
                    for (int i100 = 0; i100 < size5; i100++) {
                        MeasuredPage measuredPage5 = (MeasuredPage) list10.get(i100);
                        i99 -= i38;
                        measuredPage5.c(i99, h3, g2);
                        arrayList.add(measuredPage5);
                    }
                    list = list10;
                    int b3 = nVar.b();
                    for (int i101 = 0; i101 < b3; i101++) {
                        MeasuredPage measuredPage6 = (MeasuredPage) nVar.get(i101);
                        measuredPage6.c(i98, h3, g2);
                        arrayList.add(measuredPage6);
                        i98 += i38;
                    }
                    int size6 = list11.size();
                    for (int i102 = 0; i102 < size6; i102++) {
                        MeasuredPage measuredPage7 = (MeasuredPage) list11.get(i102);
                        measuredPage7.c(i98, h3, g2);
                        arrayList.add(measuredPage7);
                        i98 += i38;
                    }
                } else {
                    if (!list10.isEmpty() || !list11.isEmpty()) {
                        throw new IllegalArgumentException("No extra pages".toString());
                    }
                    int b4 = nVar.b();
                    int[] iArr = new int[b4];
                    for (int i103 = 0; i103 < b4; i103++) {
                        iArr[i103] = i19;
                    }
                    int[] iArr2 = new int[b4];
                    int i104 = 0;
                    while (i104 < b4) {
                        iArr2[i104] = 0;
                        i104++;
                        arrayList5 = arrayList5;
                    }
                    ArrayList arrayList6 = arrayList5;
                    float H = lazyLayoutMeasureScope4.H(i33);
                    i13 = i33;
                    measuredPage2 = measuredPage4;
                    Arrangement.SpacedAligned spacedAligned = new Arrangement.SpacedAligned(H, false, null);
                    LayoutDirection layoutDirection2 = LayoutDirection.f17494a;
                    if (orientation2 == orientation3) {
                        arrayList = arrayList6;
                        i11 = i88;
                        i14 = i96;
                        i12 = i97;
                        spacedAligned.c(lazyLayoutMeasureScope4, i96, iArr, layoutDirection2, iArr2);
                    } else {
                        arrayList = arrayList6;
                        i12 = i97;
                        i11 = i88;
                        i14 = i96;
                        spacedAligned.c(lazyLayoutMeasureScope4, i14, iArr, layoutDirection2, iArr2);
                    }
                    g c02 = q.c0(iArr2);
                    g gVar = c02;
                    if (z5) {
                        gVar = p0.a.r0(c02);
                    }
                    int i105 = gVar.f31406a;
                    int i106 = gVar.f31407b;
                    int i107 = gVar.f31408c;
                    if ((i107 > 0 && i105 <= i106) || (i107 < 0 && i106 <= i105)) {
                        while (true) {
                            int i108 = iArr2[i105];
                            MeasuredPage measuredPage8 = (MeasuredPage) nVar.get(!z5 ? i105 : (b4 - i105) - 1);
                            if (z5) {
                                i108 = (i14 - i108) - measuredPage8.f5126b;
                            }
                            measuredPage8.c(i108, h3, g2);
                            arrayList.add(measuredPage8);
                            if (i105 == i106) {
                                break;
                            }
                            i105 += i107;
                        }
                    }
                    list = list10;
                }
                if (z2) {
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = new ArrayList(arrayList.size());
                    int size7 = arrayList.size();
                    for (int i109 = 0; i109 < size7; i109++) {
                        Object obj4 = arrayList.get(i109);
                        MeasuredPage measuredPage9 = (MeasuredPage) obj4;
                        if (measuredPage9.f5125a >= ((MeasuredPage) nVar.first()).f5125a) {
                            if (measuredPage9.f5125a <= ((MeasuredPage) nVar.last()).f5125a) {
                                arrayList2.add(obj4);
                            }
                        }
                    }
                }
                if (list.isEmpty()) {
                    arrayList3 = list3;
                } else {
                    arrayList3 = new ArrayList(arrayList.size());
                    int size8 = arrayList.size();
                    for (int i110 = 0; i110 < size8; i110++) {
                        Object obj5 = arrayList.get(i110);
                        if (((MeasuredPage) obj5).f5125a < ((MeasuredPage) nVar.first()).f5125a) {
                            arrayList3.add(obj5);
                        }
                    }
                }
                if (list11.isEmpty()) {
                    arrayList4 = list3;
                } else {
                    arrayList4 = new ArrayList(arrayList.size());
                    int size9 = arrayList.size();
                    for (int i111 = 0; i111 < size9; i111++) {
                        Object obj6 = arrayList.get(i111);
                        if (((MeasuredPage) obj6).f5125a > ((MeasuredPage) nVar.last()).f5125a) {
                            arrayList4.add(obj6);
                        }
                    }
                }
                int i112 = orientation2 == orientation3 ? g2 : h3;
                if (arrayList2.isEmpty()) {
                    obj3 = null;
                } else {
                    Object obj7 = arrayList2.get(0);
                    MeasuredPage measuredPage10 = (MeasuredPage) obj7;
                    float f2 = -Math.abs(measuredPage10.f5135m - snapPosition3.a(i112, i82, i5, i18, measuredPage10.f5125a, i93));
                    int p2 = f0.p(arrayList2);
                    if (1 <= p2) {
                        int i113 = 1;
                        while (true) {
                            Object obj8 = arrayList2.get(i113);
                            MeasuredPage measuredPage11 = (MeasuredPage) obj8;
                            float f3 = -Math.abs(measuredPage11.f5135m - snapPosition3.a(i112, i82, i5, i18, measuredPage11.f5125a, i93));
                            if (Float.compare(f2, f3) < 0) {
                                f2 = f3;
                                obj7 = obj8;
                            }
                            if (i113 == p2) {
                                break;
                            }
                            i113++;
                        }
                    }
                    obj3 = obj7;
                }
                MeasuredPage measuredPage12 = (MeasuredPage) obj3;
                pagerState = pagerState2;
                pagerMeasureResult = new PagerMeasureResult(arrayList2, i19, i13, i18, orientation2, i34, i44, z5, i21, measuredPage2, measuredPage12, i82 == 0 ? 0.0f : p0.a.z((snapPosition3.a(i12, i19, i5, i18, measuredPage12 != null ? measuredPage12.f5125a : 0, i93) - (measuredPage12 != null ? measuredPage12.f5135m : 0)) / i82, -0.5f, 0.5f), i10, i6 < i93 || i11 > i12, snapPosition3, (MeasureResult) pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1.invoke(Integer.valueOf(h3), Integer.valueOf(g2), new PagerMeasureKt$measurePager$14(arrayList, pagerState.C)), z7, arrayList3, arrayList4, d0Var2);
            }
            pagerState.h(pagerMeasureResult, false);
            return pagerMeasureResult;
        } catch (Throwable th) {
            Snapshot.Companion.f(a4, c2, lVar);
            throw th;
        }
    }
}
