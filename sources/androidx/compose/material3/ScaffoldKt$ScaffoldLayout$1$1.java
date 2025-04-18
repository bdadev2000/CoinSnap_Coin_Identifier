package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.f0;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ScaffoldKt$ScaffoldLayout$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f10812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f10814c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f10816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f10817h;

    /* renamed from: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f10818a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f10819b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f10820c;
        public final /* synthetic */ List d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ FabPlacement f10821f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f10822g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f10823h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10824i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ SubcomposeMeasureScope f10825j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f10826k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f10827l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Integer f10828m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f10829n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Integer f10830o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, FabPlacement fabPlacement, int i2, int i3, WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, int i4, int i5, Integer num, ArrayList arrayList5, Integer num2) {
            super(1);
            this.f10818a = arrayList;
            this.f10819b = arrayList2;
            this.f10820c = arrayList3;
            this.d = arrayList4;
            this.f10821f = fabPlacement;
            this.f10822g = i2;
            this.f10823h = i3;
            this.f10824i = windowInsets;
            this.f10825j = subcomposeMeasureScope;
            this.f10826k = i4;
            this.f10827l = i5;
            this.f10828m = num;
            this.f10829n = arrayList5;
            this.f10830o = num2;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            int i2;
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            List list = this.f10818a;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                placementScope.e((Placeable) list.get(i3), 0, 0, 0.0f);
            }
            List list2 = this.f10819b;
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                placementScope.e((Placeable) list2.get(i4), 0, 0, 0.0f);
            }
            List list3 = this.f10820c;
            int size3 = list3.size();
            int i5 = 0;
            while (true) {
                i2 = this.f10826k;
                if (i5 >= size3) {
                    break;
                }
                Placeable placeable = (Placeable) list3.get(i5);
                int i6 = (this.f10822g - this.f10823h) / 2;
                SubcomposeMeasureScope subcomposeMeasureScope = this.f10825j;
                placementScope.e(placeable, this.f10824i.d(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()) + i6, i2 - this.f10827l, 0.0f);
                i5++;
            }
            List list4 = this.d;
            int size4 = list4.size();
            for (int i7 = 0; i7 < size4; i7++) {
                Placeable placeable2 = (Placeable) list4.get(i7);
                Integer num = this.f10828m;
                placementScope.e(placeable2, 0, i2 - (num != null ? num.intValue() : 0), 0.0f);
            }
            FabPlacement fabPlacement = this.f10821f;
            if (fabPlacement != null) {
                List list5 = this.f10829n;
                int size5 = list5.size();
                for (int i8 = 0; i8 < size5; i8++) {
                    Placeable placeable3 = (Placeable) list5.get(i8);
                    Integer num2 = this.f10830o;
                    p0.a.p(num2);
                    placementScope.e(placeable3, fabPlacement.f9414a, i2 - num2.intValue(), 0.0f);
                }
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1(p pVar, p pVar2, p pVar3, int i2, WindowInsets windowInsets, p pVar4, q qVar) {
        super(2);
        this.f10812a = pVar;
        this.f10813b = pVar2;
        this.f10814c = pVar3;
        this.d = i2;
        this.f10815f = windowInsets;
        this.f10816g = pVar4;
        this.f10817h = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        WindowInsets windowInsets;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        ArrayList arrayList2;
        FabPlacement fabPlacement;
        Object obj6;
        Integer num;
        int F0;
        int c2;
        Object obj7;
        Object obj8;
        int F02;
        int F03;
        SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
        long j2 = ((Constraints) obj2).f17480a;
        int i2 = Constraints.i(j2);
        int h2 = Constraints.h(j2);
        long b2 = Constraints.b(j2, 0, 0, 0, 0, 10);
        List D1 = subcomposeMeasureScope.D1(ScaffoldLayoutContent.f10845a, this.f10812a);
        ArrayList arrayList3 = new ArrayList(D1.size());
        for (int i3 = 0; i3 < D1.size(); i3 = d.e((Measurable) D1.get(i3), b2, arrayList3, i3, 1)) {
        }
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i4 = ((Placeable) obj3).f15826b;
            int p2 = f0.p(arrayList3);
            if (1 <= p2) {
                int i5 = 1;
                while (true) {
                    Object obj9 = arrayList3.get(i5);
                    int i6 = ((Placeable) obj9).f15826b;
                    if (i4 < i6) {
                        obj3 = obj9;
                        i4 = i6;
                    }
                    if (i5 == p2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Placeable placeable = (Placeable) obj3;
        int i7 = placeable != null ? placeable.f15826b : 0;
        List D12 = subcomposeMeasureScope.D1(ScaffoldLayoutContent.f10847c, this.f10813b);
        ArrayList arrayList4 = new ArrayList(D12.size());
        int size = D12.size();
        int i8 = 0;
        while (true) {
            windowInsets = this.f10815f;
            if (i8 >= size) {
                break;
            }
            i8 = d.e((Measurable) D12.get(i8), ConstraintsKt.k((-windowInsets.d(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.b(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.c(subcomposeMeasureScope), b2), arrayList4, i8, 1);
        }
        if (arrayList4.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList4.get(0);
            int i9 = ((Placeable) obj4).f15826b;
            int p3 = f0.p(arrayList4);
            if (1 <= p3) {
                int i10 = i9;
                Object obj10 = obj4;
                int i11 = 1;
                while (true) {
                    Object obj11 = arrayList4.get(i11);
                    int i12 = ((Placeable) obj11).f15826b;
                    if (i10 < i12) {
                        obj10 = obj11;
                        i10 = i12;
                    }
                    if (i11 == p3) {
                        break;
                    }
                    i11++;
                }
                obj4 = obj10;
            }
        }
        Placeable placeable2 = (Placeable) obj4;
        int i13 = placeable2 != null ? placeable2.f15826b : 0;
        if (arrayList4.isEmpty()) {
            arrayList = arrayList4;
            obj5 = null;
        } else {
            obj5 = arrayList4.get(0);
            int i14 = ((Placeable) obj5).f15825a;
            int p4 = f0.p(arrayList4);
            if (1 <= p4) {
                Object obj12 = obj5;
                int i15 = i14;
                int i16 = 1;
                while (true) {
                    Object obj13 = arrayList4.get(i16);
                    arrayList = arrayList4;
                    int i17 = ((Placeable) obj13).f15825a;
                    if (i15 < i17) {
                        i15 = i17;
                        obj12 = obj13;
                    }
                    if (i16 == p4) {
                        break;
                    }
                    i16++;
                    arrayList4 = arrayList;
                }
                obj5 = obj12;
            } else {
                arrayList = arrayList4;
            }
        }
        Placeable placeable3 = (Placeable) obj5;
        int i18 = placeable3 != null ? placeable3.f15825a : 0;
        List D13 = subcomposeMeasureScope.D1(ScaffoldLayoutContent.d, this.f10814c);
        ArrayList arrayList5 = new ArrayList(D13.size());
        int size2 = D13.size();
        int i19 = 0;
        while (i19 < size2) {
            List list = D13;
            int i20 = size2;
            int i21 = h2;
            Placeable V = ((Measurable) D13.get(i19)).V(ConstraintsKt.k((-windowInsets.d(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.b(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.c(subcomposeMeasureScope), b2));
            if (V.f15826b == 0 || V.f15825a == 0) {
                V = null;
            }
            if (V != null) {
                arrayList5.add(V);
            }
            i19++;
            D13 = list;
            size2 = i20;
            h2 = i21;
        }
        int i22 = h2;
        boolean z2 = !arrayList5.isEmpty();
        int i23 = this.d;
        if (z2) {
            if (arrayList5.isEmpty()) {
                obj7 = null;
            } else {
                obj7 = arrayList5.get(0);
                int i24 = ((Placeable) obj7).f15825a;
                int p5 = f0.p(arrayList5);
                if (1 <= p5) {
                    int i25 = i24;
                    int i26 = 1;
                    while (true) {
                        Object obj14 = arrayList5.get(i26);
                        Object obj15 = obj7;
                        int i27 = ((Placeable) obj14).f15825a;
                        if (i25 < i27) {
                            i25 = i27;
                            obj7 = obj14;
                        } else {
                            obj7 = obj15;
                        }
                        if (i26 == p5) {
                            break;
                        }
                        i26++;
                    }
                }
            }
            p0.a.p(obj7);
            int i28 = ((Placeable) obj7).f15825a;
            if (arrayList5.isEmpty()) {
                arrayList2 = arrayList5;
                obj8 = null;
            } else {
                obj8 = arrayList5.get(0);
                int i29 = ((Placeable) obj8).f15826b;
                int p6 = f0.p(arrayList5);
                if (1 <= p6) {
                    int i30 = 1;
                    Object obj16 = obj8;
                    int i31 = i29;
                    while (true) {
                        Object obj17 = arrayList5.get(i30);
                        arrayList2 = arrayList5;
                        int i32 = ((Placeable) obj17).f15826b;
                        if (i31 < i32) {
                            i31 = i32;
                            obj16 = obj17;
                        }
                        if (i30 == p6) {
                            break;
                        }
                        i30++;
                        arrayList5 = arrayList2;
                    }
                    obj8 = obj16;
                } else {
                    arrayList2 = arrayList5;
                }
            }
            p0.a.p(obj8);
            int i33 = ((Placeable) obj8).f15826b;
            boolean a2 = FabPosition.a(i23, 0);
            LayoutDirection layoutDirection = LayoutDirection.f17494a;
            if (!a2) {
                if (!FabPosition.a(i23, 2) && !FabPosition.a(i23, 3)) {
                    F02 = (i2 - i28) / 2;
                } else if (subcomposeMeasureScope.getLayoutDirection() == layoutDirection) {
                    F03 = subcomposeMeasureScope.F0(ScaffoldKt.f10792a);
                    F02 = (i2 - F03) - i28;
                } else {
                    F02 = subcomposeMeasureScope.F0(ScaffoldKt.f10792a);
                }
                fabPlacement = new FabPlacement(F02, i33);
            } else if (subcomposeMeasureScope.getLayoutDirection() == layoutDirection) {
                F02 = subcomposeMeasureScope.F0(ScaffoldKt.f10792a);
                fabPlacement = new FabPlacement(F02, i33);
            } else {
                F03 = subcomposeMeasureScope.F0(ScaffoldKt.f10792a);
                F02 = (i2 - F03) - i28;
                fabPlacement = new FabPlacement(F02, i33);
            }
        } else {
            arrayList2 = arrayList5;
            fabPlacement = null;
        }
        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.f10848f;
        ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1 scaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1 = new ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1(this.f10816g);
        Object obj18 = ComposableLambdaKt.f14482a;
        int i34 = i18;
        List D14 = subcomposeMeasureScope.D1(scaffoldLayoutContent, new ComposableLambdaImpl(-2146438447, scaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1, true));
        ArrayList arrayList6 = new ArrayList(D14.size());
        for (int i35 = 0; i35 < D14.size(); i35 = d.e((Measurable) D14.get(i35), b2, arrayList6, i35, 1)) {
        }
        if (arrayList6.isEmpty()) {
            obj6 = null;
        } else {
            obj6 = arrayList6.get(0);
            int i36 = ((Placeable) obj6).f15826b;
            int p7 = f0.p(arrayList6);
            int i37 = 1;
            if (1 <= p7) {
                while (true) {
                    Object obj19 = arrayList6.get(i37);
                    Object obj20 = obj6;
                    int i38 = ((Placeable) obj19).f15826b;
                    if (i36 < i38) {
                        i36 = i38;
                        obj6 = obj19;
                    } else {
                        obj6 = obj20;
                    }
                    if (i37 == p7) {
                        break;
                    }
                    i37++;
                }
            }
        }
        Placeable placeable4 = (Placeable) obj6;
        Integer valueOf = placeable4 != null ? Integer.valueOf(placeable4.f15826b) : null;
        if (fabPlacement != null) {
            int i39 = fabPlacement.f9415b;
            if (valueOf == null || FabPosition.a(i23, 3)) {
                F0 = subcomposeMeasureScope.F0(ScaffoldKt.f10792a) + i39;
                c2 = windowInsets.c(subcomposeMeasureScope);
            } else {
                F0 = valueOf.intValue() + i39;
                c2 = subcomposeMeasureScope.F0(ScaffoldKt.f10792a);
            }
            num = Integer.valueOf(c2 + F0);
        } else {
            num = null;
        }
        int intValue = i13 != 0 ? i13 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : windowInsets.c(subcomposeMeasureScope)) : 0;
        FabPlacement fabPlacement2 = fabPlacement;
        ArrayList arrayList7 = arrayList2;
        List D15 = subcomposeMeasureScope.D1(ScaffoldLayoutContent.f10846b, new ComposableLambdaImpl(-1213360416, new ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1(this.f10815f, subcomposeMeasureScope, arrayList3, i7, arrayList6, valueOf, this.f10817h), true));
        ArrayList arrayList8 = new ArrayList(D15.size());
        for (int i40 = 0; i40 < D15.size(); i40 = d.e((Measurable) D15.get(i40), b2, arrayList8, i40, 1)) {
        }
        return subcomposeMeasureScope.T(i2, i22, x.f30219a, new AnonymousClass1(arrayList8, arrayList3, arrayList, arrayList6, fabPlacement2, i2, i34, this.f10815f, subcomposeMeasureScope, i22, intValue, valueOf, arrayList7, num));
    }
}
