package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.common.api.Api;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f11886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11888c;
    public final /* synthetic */ ScrollableTabData d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f11890g;

    /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11891a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f11892b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SubcomposeMeasureScope f11893c;
        public final /* synthetic */ p d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ScrollableTabData f11894f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f11895g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List f11896h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f11897i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f11898j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f11899k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f11900l;

        /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1$2$3, reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass3 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f11901a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f11902b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(q qVar, ArrayList arrayList) {
                super(2);
                this.f11901a = qVar;
                this.f11902b = arrayList;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    this.f11901a.invoke(this.f11902b, composer, 0);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i2, ArrayList arrayList, SubcomposeMeasureScope subcomposeMeasureScope, p pVar, ScrollableTabData scrollableTabData, int i3, ArrayList arrayList2, long j2, int i4, int i5, q qVar) {
            super(1);
            this.f11891a = i2;
            this.f11892b = arrayList;
            this.f11893c = subcomposeMeasureScope;
            this.d = pVar;
            this.f11894f = scrollableTabData;
            this.f11895g = i3;
            this.f11896h = arrayList2;
            this.f11897i = j2;
            this.f11898j = i4;
            this.f11899k = i5;
            this.f11900l = qVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            SubcomposeMeasureScope subcomposeMeasureScope;
            int i2;
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            ArrayList arrayList = new ArrayList();
            List list = this.f11892b;
            int size = list.size();
            int i3 = this.f11891a;
            int i4 = 0;
            int i5 = i3;
            while (true) {
                subcomposeMeasureScope = this.f11893c;
                if (i4 >= size) {
                    break;
                }
                Placeable placeable = (Placeable) list.get(i4);
                Placeable.PlacementScope.h(placementScope, placeable, i5, 0);
                arrayList.add(new TabPosition(subcomposeMeasureScope.H(i5), subcomposeMeasureScope.H(placeable.f15825a), ((Dp) this.f11896h.get(i4)).f17486a));
                i5 += placeable.f15825a;
                i4++;
            }
            List D1 = subcomposeMeasureScope.D1(TabSlots.f11982b, this.d);
            long j2 = this.f11897i;
            int i6 = this.f11898j;
            int size2 = D1.size();
            int i7 = 0;
            while (true) {
                i2 = this.f11899k;
                if (i7 >= size2) {
                    break;
                }
                Placeable V = ((Measurable) D1.get(i7)).V(Constraints.b(j2, i6, i6, 0, 0, 8));
                Placeable.PlacementScope.h(placementScope, V, 0, i2 - V.f15826b);
                i7++;
                size2 = size2;
            }
            TabSlots tabSlots = TabSlots.f11983c;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f11900l, arrayList);
            Object obj2 = ComposableLambdaKt.f14482a;
            List D12 = subcomposeMeasureScope.D1(tabSlots, new ComposableLambdaImpl(1734082948, anonymousClass3, true));
            int size3 = D12.size();
            for (int i8 = 0; i8 < size3; i8++) {
                Placeable.PlacementScope.h(placementScope, ((Measurable) D12.get(i8)).V(Constraints.Companion.c(this.f11898j, i2)), 0, 0);
            }
            this.f11894f.a(subcomposeMeasureScope, i3, arrayList, this.f11895g);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1(float f2, p pVar, p pVar2, ScrollableTabData scrollableTabData, int i2, q qVar) {
        super(2);
        this.f11886a = f2;
        this.f11887b = pVar;
        this.f11888c = pVar2;
        this.d = scrollableTabData;
        this.f11889f = i2;
        this.f11890g = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
        long j2 = ((Constraints) obj2).f17480a;
        int F0 = subcomposeMeasureScope.F0(TabRowKt.f11818a);
        int F02 = subcomposeMeasureScope.F0(this.f11886a);
        List D1 = subcomposeMeasureScope.D1(TabSlots.f11981a, this.f11887b);
        Integer num = 0;
        int size = D1.size();
        for (int i2 = 0; i2 < size; i2++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((Measurable) D1.get(i2)).s(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        }
        int intValue = num.intValue();
        long b2 = Constraints.b(j2, F0, 0, intValue, intValue, 2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = D1.size();
        int i3 = 0;
        while (i3 < size2) {
            Measurable measurable = (Measurable) D1.get(i3);
            Placeable V = measurable.V(b2);
            float H = subcomposeMeasureScope.H(Math.min(measurable.S(V.f15826b), V.f15825a)) - (TabKt.f11730c * 2);
            arrayList.add(V);
            arrayList2.add(new Dp(H));
            i3++;
            D1 = D1;
        }
        Integer valueOf = Integer.valueOf(F02 * 2);
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i4)).f15825a);
        }
        int intValue2 = valueOf.intValue();
        return subcomposeMeasureScope.T(intValue2, intValue, x.f30219a, new AnonymousClass2(F02, arrayList, subcomposeMeasureScope, this.f11888c, this.d, this.f11889f, arrayList2, j2, intValue2, intValue, this.f11890g));
    }
}
