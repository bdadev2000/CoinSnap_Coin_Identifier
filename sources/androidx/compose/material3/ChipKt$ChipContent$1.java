package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import d0.b0;
import e0.x;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ChipKt$ChipContent$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f8306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f8308c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f8309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f8311h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8312i;

    /* renamed from: androidx.compose.material3.ChipKt$ChipContent$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f8313a = new Object();

        /* renamed from: androidx.compose.material3.ChipKt$ChipContent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C00321 extends r implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Placeable f8314a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f8315b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f8316c;
            public final /* synthetic */ Placeable d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f8317f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Placeable f8318g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ int f8319h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00321(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, Placeable placeable3, int i5) {
                super(1);
                this.f8314a = placeable;
                this.f8315b = i2;
                this.f8316c = i3;
                this.d = placeable2;
                this.f8317f = i4;
                this.f8318g = placeable3;
                this.f8319h = i5;
            }

            @Override // q0.l
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
                int i2 = this.f8316c;
                Placeable placeable = this.f8314a;
                if (placeable != null) {
                    Placeable.PlacementScope.h(placementScope, placeable, 0, vertical.a(this.f8315b, i2));
                }
                Placeable placeable2 = this.d;
                int i3 = this.f8317f;
                Placeable.PlacementScope.h(placementScope, placeable2, i3, 0);
                Placeable placeable3 = this.f8318g;
                if (placeable3 != null) {
                    Placeable.PlacementScope.h(placementScope, placeable3, i3 + placeable2.f15825a, vertical.a(this.f8319h, i2));
                }
                return b0.f30125a;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
            Object obj;
            Object obj2;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (p0.a.g(LayoutIdKt.a((Measurable) obj), "leadingIcon")) {
                    break;
                }
                i2++;
            }
            Measurable measurable = (Measurable) obj;
            Placeable V = measurable != null ? measurable.V(Constraints.b(j2, 0, 0, 0, 0, 10)) : null;
            int j3 = TextFieldImplKt.j(V);
            int h2 = TextFieldImplKt.h(V);
            int size2 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i3);
                if (p0.a.g(LayoutIdKt.a((Measurable) obj2), "trailingIcon")) {
                    break;
                }
                i3++;
            }
            Measurable measurable2 = (Measurable) obj2;
            Placeable V2 = measurable2 != null ? measurable2.V(Constraints.b(j2, 0, 0, 0, 0, 10)) : null;
            int j4 = TextFieldImplKt.j(V2);
            int h3 = TextFieldImplKt.h(V2);
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Measurable measurable3 = (Measurable) list.get(i4);
                if (p0.a.g(LayoutIdKt.a(measurable3), "label")) {
                    Placeable V3 = measurable3.V(ConstraintsKt.l(-(j3 + j4), 0, j2, 2));
                    int i5 = V3.f15825a + j3 + j4;
                    int max = Math.max(h2, Math.max(V3.f15826b, h3));
                    return measureScope.T(i5, max, x.f30219a, new C00321(V, h2, max, V3, j3, V2, h3));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$ChipContent$1(float f2, PaddingValues paddingValues, p pVar, p pVar2, p pVar3, long j2, p pVar4, long j3) {
        super(2);
        this.f8306a = f2;
        this.f8307b = paddingValues;
        this.f8308c = pVar;
        this.d = pVar2;
        this.f8309f = pVar3;
        this.f8310g = j2;
        this.f8311h = pVar4;
        this.f8312i = j3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier e = PaddingKt.e(SizeKt.b(companion, 0.0f, this.f8306a, 1), this.f8307b);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.f8313a;
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, e);
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
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, anonymousClass1, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(composer, c2, pVar4);
            composer.J(-1293169671);
            BiasAlignment biasAlignment = Alignment.Companion.e;
            p pVar5 = this.f8308c;
            p pVar6 = this.d;
            if (pVar5 != null || pVar6 != null) {
                Modifier b2 = LayoutIdKt.b(companion, "leadingIcon");
                MeasurePolicy e2 = BoxKt.e(biasAlignment, false);
                int E2 = composer.E();
                PersistentCompositionLocalMap m3 = composer.m();
                Modifier c3 = ComposedModifierKt.c(composer, b2);
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
                Updater.b(composer, e2, pVar);
                Updater.b(composer, m3, pVar2);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                    d.w(E2, composer, E2, pVar3);
                }
                Updater.b(composer, c3, pVar4);
                if (pVar5 != null) {
                    composer.J(832680499);
                    pVar5.invoke(composer, 0);
                    composer.D();
                } else if (pVar6 != null) {
                    composer.J(832788565);
                    CompositionLocalKt.a(ContentColorKt.f8654a.c(new Color(this.f8310g)), pVar6, composer, 8);
                    composer.D();
                } else {
                    composer.J(833040347);
                    composer.D();
                }
                composer.p();
            }
            composer.D();
            Modifier g2 = PaddingKt.g(LayoutIdKt.b(companion, "label"), ChipKt.f8252a, 0);
            RowMeasurePolicy a2 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14667k, composer, 54);
            int E3 = composer.E();
            PersistentCompositionLocalMap m4 = composer.m();
            Modifier c4 = ComposedModifierKt.c(composer, g2);
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
            Updater.b(composer, a2, pVar);
            Updater.b(composer, m4, pVar2);
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E3))) {
                d.w(E3, composer, E3, pVar3);
            }
            Updater.b(composer, c4, pVar4);
            this.f8311h.invoke(composer, 0);
            composer.p();
            composer.J(-1293135324);
            p pVar7 = this.f8309f;
            if (pVar7 != null) {
                Modifier b3 = LayoutIdKt.b(companion, "trailingIcon");
                MeasurePolicy e3 = BoxKt.e(biasAlignment, false);
                int E4 = composer.E();
                PersistentCompositionLocalMap m5 = composer.m();
                Modifier c5 = ComposedModifierKt.c(composer, b3);
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
                Updater.b(composer, e3, pVar);
                Updater.b(composer, m5, pVar2);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E4))) {
                    d.w(E4, composer, E4, pVar3);
                }
                Updater.b(composer, c5, pVar4);
                CompositionLocalKt.a(ContentColorKt.f8654a.c(new Color(this.f8312i)), pVar7, composer, 8);
                composer.p();
            }
            composer.D();
            composer.p();
        }
        return b0.f30125a;
    }
}
