package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnitKt;
import d0.b0;
import e0.x;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class TabKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11728a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f11729b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f11730c;
    public static final float d;
    public static final float e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f11731f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f11732g;

    static {
        float f2 = PrimaryNavigationTabTokens.f13488a;
        f11728a = PrimaryNavigationTabTokens.d;
        f11729b = 72;
        f11730c = 16;
        d = 14;
        e = 6;
        f11731f = TextUnitKt.b(20);
        f11732g = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r21, q0.a r22, androidx.compose.ui.Modifier r23, boolean r24, long r25, long r27, androidx.compose.foundation.interaction.MutableInteractionSource r29, q0.q r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.a(boolean, q0.a, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(long j2, long j3, boolean z2, p pVar, Composer composer, int i2) {
        int i3;
        long j4;
        boolean z3;
        ComposerImpl g2 = composer.g(735731848);
        if ((i2 & 6) == 0) {
            i3 = (g2.d(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.d(j3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.a(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 1171) == 1170 && g2.i()) {
            g2.A();
        } else {
            int i4 = i3 >> 6;
            Transition e2 = TransitionKt.e(Boolean.valueOf(z2), null, g2, i4 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = TabKt$TabTransition$color$2.f11793a;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = e2.d;
            boolean booleanValue = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            g2.J(-1997025499);
            long j5 = booleanValue ? j2 : j3;
            g2.V(false);
            ColorSpace f2 = Color.f(j5);
            boolean I = g2.I(f2);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = (TwoWayConverter) ColorVectorConverterKt.a().invoke(f2);
                g2.o(u2);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) u2;
            boolean booleanValue2 = ((Boolean) e2.f2267a.a()).booleanValue();
            g2.J(-1997025499);
            if (booleanValue2) {
                z3 = false;
                j4 = j2;
            } else {
                j4 = j3;
                z3 = false;
            }
            g2.V(z3);
            Color color = new Color(j4);
            boolean booleanValue3 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            g2.J(-1997025499);
            long j6 = booleanValue3 ? j2 : j3;
            g2.V(false);
            CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(((Color) TransitionKt.c(e2, color, new Color(j6), (FiniteAnimationSpec) tabKt$TabTransition$color$2.invoke(e2.f(), g2, 0), twoWayConverter, g2, 0).f2294k.getValue()).f14964a, ContentColorKt.f8654a), pVar, g2, (i4 & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TabKt$TabTransition$1(j2, j3, z2, pVar, i2);
        }
    }

    public static final void c(final p pVar, final p pVar2, Composer composer, int i2) {
        int i3;
        int i4;
        BiasAlignment biasAlignment;
        boolean z2;
        ComposerImpl g2 = composer.g(514131524);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            int i5 = i3 & 14;
            boolean z3 = (i5 == 4) | ((i3 & 112) == 32);
            Object u2 = g2.u();
            if (z3 || u2 == Composer.Companion.f13690a) {
                u2 = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1

                    /* renamed from: androidx.compose.material3.TabKt$TabBaselineLayout$2$1$1, reason: invalid class name */
                    /* loaded from: classes2.dex */
                    final class AnonymousClass1 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Placeable f11780a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ Placeable f11781b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ MeasureScope f11782c;
                        public final /* synthetic */ int d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ int f11783f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ Integer f11784g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ Integer f11785h;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i2, int i3, Integer num, Integer num2) {
                            super(1);
                            this.f11780a = placeable;
                            this.f11781b = placeable2;
                            this.f11782c = measureScope;
                            this.d = i2;
                            this.f11783f = i3;
                            this.f11784g = num;
                            this.f11785h = num2;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            Placeable placeable = this.f11781b;
                            int i2 = this.f11783f;
                            Placeable placeable2 = this.f11780a;
                            if (placeable2 != null && placeable != null) {
                                Integer num = this.f11784g;
                                p0.a.p(num);
                                int intValue = num.intValue();
                                Integer num2 = this.f11785h;
                                p0.a.p(num2);
                                int intValue2 = num2.intValue();
                                float f2 = intValue == intValue2 ? TabKt.d : TabKt.e;
                                MeasureScope measureScope = this.f11782c;
                                int F0 = measureScope.F0(PrimaryNavigationTabTokens.f13488a) + measureScope.F0(f2);
                                int C1 = (measureScope.C1(TabKt.f11731f) + placeable.f15826b) - intValue;
                                int i3 = placeable2.f15825a;
                                int i4 = this.d;
                                int i5 = (i2 - intValue2) - F0;
                                Placeable.PlacementScope.h(placementScope, placeable2, (i4 - i3) / 2, i5);
                                Placeable.PlacementScope.h(placementScope, placeable, (i4 - placeable.f15825a) / 2, i5 - C1);
                            } else if (placeable2 != null) {
                                float f3 = TabKt.f11728a;
                                Placeable.PlacementScope.h(placementScope, placeable2, 0, (i2 - placeable2.f15826b) / 2);
                            } else if (placeable != null) {
                                float f4 = TabKt.f11728a;
                                Placeable.PlacementScope.h(placementScope, placeable, 0, (i2 - placeable.f15826b) / 2);
                            }
                            return b0.f30125a;
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
                        Placeable placeable;
                        Placeable placeable2;
                        if (p.this != null) {
                            int size = list.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                Measurable measurable = (Measurable) list.get(i6);
                                if (p0.a.g(LayoutIdKt.a(measurable), "text")) {
                                    placeable = measurable.V(Constraints.b(j2, 0, 0, 0, 0, 11));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable = null;
                        if (pVar2 != null) {
                            int size2 = list.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                Measurable measurable2 = (Measurable) list.get(i7);
                                if (p0.a.g(LayoutIdKt.a(measurable2), "icon")) {
                                    placeable2 = measurable2.V(j2);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable2 = null;
                        int max = Math.max(placeable != null ? placeable.f15825a : 0, placeable2 != null ? placeable2.f15825a : 0);
                        int max2 = Math.max(measureScope.F0((placeable == null || placeable2 == null) ? TabKt.f11728a : TabKt.f11729b), measureScope.C1(TabKt.f11731f) + (placeable2 != null ? placeable2.f15826b : 0) + (placeable != null ? placeable.f15826b : 0));
                        return measureScope.T(max, max2, x.f30219a, new AnonymousClass1(placeable, placeable2, measureScope, max, max2, placeable != null ? Integer.valueOf(placeable.Z(AlignmentLineKt.f15692a)) : null, placeable != null ? Integer.valueOf(placeable.Z(AlignmentLineKt.f15693b)) : null));
                    }
                };
                g2.o(u2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u2;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            int i6 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, companion);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            p pVar3 = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, measurePolicy, pVar3);
            p pVar4 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar4);
            p pVar5 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar5);
            }
            p pVar6 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar6);
            g2.J(871566271);
            BiasAlignment biasAlignment2 = Alignment.Companion.f14659a;
            if (pVar != null) {
                i4 = i3;
                Modifier h2 = PaddingKt.h(LayoutIdKt.b(companion, "text"), f11730c, 0.0f, 2);
                MeasurePolicy e2 = BoxKt.e(biasAlignment2, false);
                int i7 = g2.P;
                PersistentCompositionLocalMap Q2 = g2.Q();
                Modifier c3 = ComposedModifierKt.c(g2, h2);
                biasAlignment = biasAlignment2;
                if (!(applier instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                g2.z();
                if (g2.O) {
                    g2.B(aVar);
                } else {
                    g2.n();
                }
                Updater.b(g2, e2, pVar3);
                Updater.b(g2, Q2, pVar4);
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                    d.x(i7, g2, i7, pVar5);
                }
                Updater.b(g2, c3, pVar6);
                d.y(i5, pVar, g2, true);
            } else {
                i4 = i3;
                biasAlignment = biasAlignment2;
            }
            boolean z4 = false;
            g2.V(false);
            g2.J(871570579);
            if (pVar2 != null) {
                Modifier b2 = LayoutIdKt.b(companion, "icon");
                MeasurePolicy e3 = BoxKt.e(biasAlignment, false);
                int i8 = g2.P;
                PersistentCompositionLocalMap Q3 = g2.Q();
                Modifier c4 = ComposedModifierKt.c(g2, b2);
                if (!(applier instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                g2.z();
                if (g2.O) {
                    g2.B(aVar);
                } else {
                    g2.n();
                }
                Updater.b(g2, e3, pVar3);
                Updater.b(g2, Q3, pVar4);
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i8))) {
                    d.x(i8, g2, i8, pVar5);
                }
                Updater.b(g2, c4, pVar6);
                z2 = true;
                d.y((i4 >> 3) & 14, pVar2, g2, true);
                z4 = false;
            } else {
                z2 = true;
            }
            g2.V(z4);
            g2.V(z2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TabKt$TabBaselineLayout$3(pVar, pVar2, i2);
        }
    }
}
