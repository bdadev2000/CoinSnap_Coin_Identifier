package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
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
import b1.f0;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
final class TabRowKt$TabRowImpl$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f11944c;

    /* renamed from: androidx.compose.material3.TabRowKt$TabRowImpl$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f11945a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TabRowKt$TabRowImpl$1$scope$1$1 f11946b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1) {
            super(2);
            this.f11945a = qVar;
            this.f11946b = tabRowKt$TabRowImpl$1$scope$1$1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                this.f11945a.invoke(this.f11946b, composer, 6);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRowImpl$1(p pVar, p pVar2, q qVar) {
        super(2);
        this.f11942a = pVar;
        this.f11943b = pVar2;
        this.f11944c = qVar;
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
                u2 = new TabRowKt$TabRowImpl$1$scope$1$1();
                composer.o(u2);
            }
            final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) u2;
            Modifier d = SizeKt.d(Modifier.Companion.f14687a, 1.0f);
            List v2 = f0.v(this.f11942a, this.f11943b, ComposableLambdaKt.c(1236693605, new AnonymousClass1(this.f11944c, tabRowKt$TabRowImpl$1$scope$1$1), composer));
            Object u3 = composer.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1

                    /* renamed from: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    final class AnonymousClass2 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f11948a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ List f11949b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ List f11950c;
                        public final /* synthetic */ d0 d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ int f11951f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, d0 d0Var, int i2) {
                            super(1);
                            this.f11948a = arrayList;
                            this.f11949b = arrayList2;
                            this.f11950c = arrayList3;
                            this.d = d0Var;
                            this.f11951f = i2;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            int i2;
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            List list = this.f11948a;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                Placeable.PlacementScope.h(placementScope, (Placeable) list.get(i3), this.d.f30925a * i3, 0);
                            }
                            List list2 = this.f11949b;
                            int size2 = list2.size();
                            int i4 = 0;
                            while (true) {
                                i2 = this.f11951f;
                                if (i4 >= size2) {
                                    break;
                                }
                                Placeable placeable = (Placeable) list2.get(i4);
                                Placeable.PlacementScope.h(placementScope, placeable, 0, i2 - placeable.f15826b);
                                i4++;
                            }
                            List list3 = this.f11950c;
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                Placeable placeable2 = (Placeable) list3.get(i5);
                                Placeable.PlacementScope.h(placementScope, placeable2, 0, i2 - placeable2.f15826b);
                            }
                            return b0.f30125a;
                        }
                    }

                    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo1measure3p2s80s(MeasureScope measureScope, List list, long j2) {
                        ArrayList arrayList = (ArrayList) list;
                        List list2 = (List) arrayList.get(0);
                        List list3 = (List) arrayList.get(1);
                        List list4 = (List) arrayList.get(2);
                        int i2 = Constraints.i(j2);
                        int size = list2.size();
                        ?? obj3 = new Object();
                        if (size > 0) {
                            obj3.f30925a = i2 / size;
                        }
                        Integer num = 0;
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            num = Integer.valueOf(Math.max(((Measurable) list2.get(i3)).s(obj3.f30925a), num.intValue()));
                        }
                        int intValue = num.intValue();
                        ArrayList arrayList2 = new ArrayList(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList2.add(new TabPosition(measureScope.H(obj3.f30925a) * i4, measureScope.H(obj3.f30925a), ((Dp) kotlin.jvm.internal.q.h(new Dp(measureScope.H(Math.min(((Measurable) list2.get(i4)).S(intValue), obj3.f30925a)) - (TabKt.f11730c * 2)), new Dp(24))).f17486a));
                        }
                        TabRowKt$TabRowImpl$1$scope$1$1.this.f11952a.setValue(arrayList2);
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Measurable measurable = (Measurable) list2.get(i5);
                            int i6 = obj3.f30925a;
                            i5 = d.e(measurable, Constraints.a(i6, i6, intValue, intValue), arrayList3, i5, 1);
                        }
                        ArrayList arrayList4 = new ArrayList(list3.size());
                        int size4 = list3.size();
                        int i7 = 0;
                        while (i7 < size4) {
                            i7 = d.e((Measurable) list3.get(i7), Constraints.b(j2, 0, 0, 0, 0, 11), arrayList4, i7, 1);
                        }
                        ArrayList arrayList5 = new ArrayList(list4.size());
                        int size5 = list4.size();
                        int i8 = 0;
                        while (i8 < size5) {
                            Measurable measurable2 = (Measurable) list4.get(i8);
                            int i9 = obj3.f30925a;
                            i8 = d.e(measurable2, Constraints.a(i9, i9, 0, intValue), arrayList5, i8, 1);
                        }
                        return measureScope.T(i2, intValue, x.f30219a, new AnonymousClass2(arrayList3, arrayList4, arrayList5, obj3, intValue));
                    }
                };
                composer.o(u3);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) u3;
            ComposableLambdaImpl a2 = LayoutKt.a(v2);
            Object u4 = composer.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
                composer.o(u4);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u4;
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, d);
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
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            a2.invoke(composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
