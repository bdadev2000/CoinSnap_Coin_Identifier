package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import b1.d0;
import b1.f0;
import com.google.android.gms.common.api.Api;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class TabRowKt$ScrollableTabRowImpl$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollState f11851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11853c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11854f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f11855g;

    /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f11856a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TabRowKt$ScrollableTabRowImpl$1$scope$1$1 f11857b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1) {
            super(2);
            this.f11856a = qVar;
            this.f11857b = tabRowKt$ScrollableTabRowImpl$1$scope$1$1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                this.f11856a.invoke(this.f11857b, composer, 6);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRowImpl$1(float f2, int i2, ScrollState scrollState, p pVar, p pVar2, q qVar) {
        super(2);
        this.f11851a = scrollState;
        this.f11852b = pVar;
        this.f11853c = pVar2;
        this.d = f2;
        this.f11854f = i2;
        this.f11855g = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Object u2 = composer.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.g(composer));
                composer.o(compositionScopedCoroutineScopeCanceller);
                u2 = compositionScopedCoroutineScopeCanceller;
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
            ScrollState scrollState = this.f11851a;
            boolean I = composer.I(scrollState) | composer.I(d0Var);
            Object u3 = composer.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = new ScrollableTabData(scrollState, d0Var);
                composer.o(u3);
            }
            final ScrollableTabData scrollableTabData = (ScrollableTabData) u3;
            Object u4 = composer.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1();
                composer.o(u4);
            }
            final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) u4;
            List v2 = f0.v(this.f11852b, this.f11853c, ComposableLambdaKt.c(-1530560661, new AnonymousClass1(this.f11855g, tabRowKt$ScrollableTabRowImpl$1$scope$1$1), composer));
            final float f2 = this.d;
            boolean b2 = composer.b(f2);
            final int i2 = this.f11854f;
            boolean c2 = b2 | composer.c(i2) | composer.w(scrollableTabData);
            Object u5 = composer.u();
            if (c2 || u5 == composer$Companion$Empty$1) {
                u5 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1

                    /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1$1, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    final class AnonymousClass1 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ c0 f11861a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ float f11862b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ List f11863c;
                        public final /* synthetic */ List d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ List f11864f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ ScrollableTabData f11865g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ MeasureScope f11866h;

                        /* renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ int f11867i;

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ List f11868j;

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f11869k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ int f11870l;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(c0 c0Var, float f2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ScrollableTabData scrollableTabData, MeasureScope measureScope, int i2, ArrayList arrayList4, int i3, int i4) {
                            super(1);
                            this.f11861a = c0Var;
                            this.f11862b = f2;
                            this.f11863c = arrayList;
                            this.d = arrayList2;
                            this.f11864f = arrayList3;
                            this.f11865g = scrollableTabData;
                            this.f11866h = measureScope;
                            this.f11867i = i2;
                            this.f11868j = arrayList4;
                            this.f11869k = i3;
                            this.f11870l = i4;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            MeasureScope measureScope;
                            List list;
                            int i2;
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            float f2 = this.f11862b;
                            c0 c0Var = this.f11861a;
                            c0Var.f30922a = f2;
                            List list2 = this.f11863c;
                            int size = list2.size();
                            int i3 = 0;
                            while (true) {
                                measureScope = this.f11866h;
                                list = this.f11868j;
                                if (i3 >= size) {
                                    break;
                                }
                                Placeable.PlacementScope.h(placementScope, (Placeable) list2.get(i3), measureScope.F0(c0Var.f30922a), 0);
                                c0Var.f30922a += ((TabPosition) list.get(i3)).f11795b;
                                i3++;
                            }
                            List list3 = this.d;
                            int size2 = list3.size();
                            int i4 = 0;
                            while (true) {
                                i2 = this.f11870l;
                                if (i4 >= size2) {
                                    break;
                                }
                                Placeable placeable = (Placeable) list3.get(i4);
                                Placeable.PlacementScope.h(placementScope, placeable, 0, i2 - placeable.f15826b);
                                i4++;
                            }
                            List list4 = this.f11864f;
                            int size3 = list4.size();
                            int i5 = 0;
                            while (true) {
                                int i6 = this.f11869k;
                                if (i5 >= size3) {
                                    this.f11865g.a(measureScope, this.f11867i, list, i6);
                                    return b0.f30125a;
                                }
                                Placeable placeable2 = (Placeable) list4.get(i5);
                                Placeable.PlacementScope.h(placementScope, placeable2, Math.max(0, (measureScope.F0(((TabPosition) list.get(i6)).f11795b) - placeable2.f15825a) / 2), i2 - placeable2.f15826b);
                                i5++;
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.jvm.internal.c0] */
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo1measure3p2s80s(MeasureScope measureScope, List list, long j2) {
                        ArrayList arrayList = (ArrayList) list;
                        List list2 = (List) arrayList.get(0);
                        List list3 = (List) arrayList.get(1);
                        int i3 = 2;
                        List list4 = (List) arrayList.get(2);
                        float f3 = f2;
                        int F0 = measureScope.F0(f3);
                        int size = list2.size();
                        int F02 = measureScope.F0(TabRowKt.f11818a);
                        Integer num = 0;
                        int size2 = list2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            num = Integer.valueOf(Math.max(num.intValue(), ((Measurable) list2.get(i4)).s(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
                        }
                        int intValue = num.intValue();
                        int i5 = F0 * 2;
                        long b3 = Constraints.b(j2, F02, 0, intValue, intValue, 2);
                        ?? obj3 = new Object();
                        obj3.f30922a = f3;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size3 = list2.size();
                        for (int i6 = 0; i6 < size3; i6 = d.e((Measurable) list2.get(i6), b3, arrayList2, i6, 1)) {
                        }
                        ArrayList arrayList3 = new ArrayList(size);
                        int i7 = i5;
                        int i8 = 0;
                        while (i8 < size) {
                            float f4 = ((Dp) kotlin.jvm.internal.q.h(new Dp(TabRowKt.f11818a), new Dp(measureScope.H(((Placeable) arrayList2.get(i8)).f15825a)))).f17486a;
                            i7 += measureScope.F0(f4);
                            Dp dp = (Dp) kotlin.jvm.internal.q.h(new Dp(f4 - (TabKt.f11730c * i3)), new Dp(24));
                            float f5 = obj3.f30922a;
                            TabPosition tabPosition = new TabPosition(f5, f4, dp.f17486a);
                            obj3.f30922a = f5 + f4;
                            arrayList3.add(tabPosition);
                            i8++;
                            i3 = 2;
                        }
                        tabRowKt$ScrollableTabRowImpl$1$scope$1$1.f11871a.setValue(arrayList3);
                        ArrayList arrayList4 = new ArrayList(list3.size());
                        int size4 = list3.size();
                        int i9 = 0;
                        while (i9 < size4) {
                            i9 = d.e((Measurable) list3.get(i9), Constraints.b(j2, i7, i7, 0, 0, 8), arrayList4, i9, 1);
                        }
                        ArrayList arrayList5 = new ArrayList(list4.size());
                        int size5 = list4.size();
                        int i10 = 0;
                        while (i10 < size5) {
                            i10 = d.e((Measurable) list4.get(i10), Constraints.a(0, measureScope.F0(((TabPosition) arrayList3.get(i2)).f11795b), 0, intValue), arrayList5, i10, 1);
                        }
                        return measureScope.T(i7, intValue, x.f30219a, new AnonymousClass1(obj3, f2, arrayList2, arrayList4, arrayList5, scrollableTabData, measureScope, F0, arrayList3, i2, intValue));
                    }
                };
                composer.o(u5);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) u5;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            ComposableLambdaImpl a2 = LayoutKt.a(v2);
            boolean I2 = composer.I(multiContentMeasurePolicy);
            Object u6 = composer.u();
            if (I2 || u6 == composer$Companion$Empty$1) {
                u6 = new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
                composer.o(u6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u6;
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, companion);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(composer.j() instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            Updater.b(composer, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c3, ComposeUiNode.Companion.d);
            a2.invoke(composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
