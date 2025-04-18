package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class TabRowKt$TabRowWithSubcomposeImpl$1$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f11964c;

    /* renamed from: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f11965a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SubcomposeMeasureScope f11966b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f11967c;
        public final /* synthetic */ d0 d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f11968f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f11969g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ q f11970h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f11971i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f11972j;

        /* renamed from: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        final class AnonymousClass3 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f11973a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f11974b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(q qVar, List list) {
                super(2);
                this.f11973a = qVar;
                this.f11974b = list;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    this.f11973a.invoke(this.f11974b, composer, 0);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList arrayList, SubcomposeMeasureScope subcomposeMeasureScope, p pVar, d0 d0Var, long j2, int i2, q qVar, ArrayList arrayList2, int i3) {
            super(1);
            this.f11965a = arrayList;
            this.f11966b = subcomposeMeasureScope;
            this.f11967c = pVar;
            this.d = d0Var;
            this.f11968f = j2;
            this.f11969g = i2;
            this.f11970h = qVar;
            this.f11971i = arrayList2;
            this.f11972j = i3;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            int i2;
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            List list = this.f11965a;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Placeable.PlacementScope.h(placementScope, (Placeable) list.get(i3), this.d.f30925a * i3, 0);
            }
            TabSlots tabSlots = TabSlots.f11982b;
            p pVar = this.f11967c;
            SubcomposeMeasureScope subcomposeMeasureScope = this.f11966b;
            List D1 = subcomposeMeasureScope.D1(tabSlots, pVar);
            long j2 = this.f11968f;
            int size2 = D1.size();
            int i4 = 0;
            while (true) {
                i2 = this.f11969g;
                if (i4 >= size2) {
                    break;
                }
                Placeable V = ((Measurable) D1.get(i4)).V(Constraints.b(j2, 0, 0, 0, 0, 11));
                Placeable.PlacementScope.h(placementScope, V, 0, i2 - V.f15826b);
                i4++;
                D1 = D1;
            }
            TabSlots tabSlots2 = TabSlots.f11983c;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f11970h, this.f11971i);
            Object obj2 = ComposableLambdaKt.f14482a;
            List D12 = subcomposeMeasureScope.D1(tabSlots2, new ComposableLambdaImpl(1621992604, anonymousClass3, true));
            int size3 = D12.size();
            for (int i5 = 0; i5 < size3; i5++) {
                Placeable.PlacementScope.h(placementScope, ((Measurable) D12.get(i5)).V(Constraints.Companion.c(this.f11972j, i2)), 0, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRowWithSubcomposeImpl$1$1$1(p pVar, p pVar2, q qVar) {
        super(2);
        this.f11962a = pVar;
        this.f11963b = pVar2;
        this.f11964c = qVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
        long j2 = ((Constraints) obj2).f17480a;
        int i2 = Constraints.i(j2);
        List D1 = subcomposeMeasureScope.D1(TabSlots.f11981a, this.f11962a);
        int size = D1.size();
        ?? obj3 = new Object();
        if (size > 0) {
            obj3.f30925a = i2 / size;
        }
        Integer num = 0;
        int size2 = D1.size();
        for (int i3 = 0; i3 < size2; i3++) {
            num = Integer.valueOf(Math.max(((Measurable) D1.get(i3)).s(obj3.f30925a), num.intValue()));
        }
        int intValue = num.intValue();
        ArrayList arrayList = new ArrayList(D1.size());
        int size3 = D1.size();
        int i4 = 0;
        while (i4 < size3) {
            Measurable measurable = (Measurable) D1.get(i4);
            int i5 = obj3.f30925a;
            i4 = d.e(measurable, Constraints.a(i5, i5, intValue, intValue), arrayList, i4, 1);
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList2.add(new TabPosition(subcomposeMeasureScope.H(obj3.f30925a) * i6, subcomposeMeasureScope.H(obj3.f30925a), ((Dp) kotlin.jvm.internal.q.h(new Dp(subcomposeMeasureScope.H(Math.min(((Measurable) D1.get(i6)).S(intValue), obj3.f30925a)) - (TabKt.f11730c * 2)), new Dp(24))).f17486a));
        }
        return subcomposeMeasureScope.T(i2, intValue, x.f30219a, new AnonymousClass1(arrayList, subcomposeMeasureScope, this.f11963b, obj3, j2, intValue, this.f11964c, arrayList2, i2));
    }
}
