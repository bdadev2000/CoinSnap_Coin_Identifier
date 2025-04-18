package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class NavigationItemKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10235a = NavigationRailKt.f10323c;

    /* renamed from: b, reason: collision with root package name */
    public static final float f10236b = NavigationRailKt.d;

    /* renamed from: c, reason: collision with root package name */
    public static final float f10237c = 12;

    public static final void a(boolean z2, q0.a aVar, p pVar, TextStyle textStyle, Shape shape, float f2, float f3, float f4, float f5, float f6, float f7, NavigationItemColors navigationItemColors, Modifier modifier, boolean z3, p pVar2, p pVar3, int i2, MutableInteractionSource mutableInteractionSource, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(547979956);
        if ((i3 & 6) == 0) {
            i5 = (g2.a(z2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g2.I(textStyle) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= g2.I(shape) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= g2.b(f2) ? 131072 : 65536;
        }
        int i7 = i3 & 1572864;
        int i8 = Opcodes.ASM8;
        if (i7 == 0) {
            i5 |= g2.b(f3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= g2.b(f4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= g2.b(f5) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= g2.b(f6) ? 536870912 : 268435456;
        }
        int i9 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (g2.b(f7) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= g2.I(navigationItemColors) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= g2.I(modifier) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= g2.a(z3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= g2.w(pVar2) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= g2.w(pVar3) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            if (g2.c(i2)) {
                i8 = 1048576;
            }
            i6 |= i8;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= g2.I(mutableInteractionSource) ? 8388608 : 4194304;
        }
        if ((i9 & 306783379) == 306783378 && (i6 & 4793491) == 4793490 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            ComposableLambdaImpl c2 = ComposableLambdaKt.c(-44329638, new NavigationItemKt$NavigationItem$styledIcon$1(navigationItemColors, z2, z3, pVar2, pVar), g2);
            g2.J(-1735402128);
            if (pVar3 != null) {
                c2 = ComposableLambdaKt.c(1836184859, new NavigationItemKt$NavigationItem$iconWithBadge$1(pVar3, c2), g2);
            }
            ComposableLambdaImpl composableLambdaImpl = c2;
            g2.V(false);
            g2.J(-1735395524);
            ComposableLambdaImpl c3 = pVar2 == null ? null : ComposableLambdaKt.c(-254668050, new NavigationItemKt$NavigationItem$styledLabel$1$1(navigationItemColors, z2, z3, textStyle, pVar2), g2);
            g2.V(false);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotIntStateKt.a(0);
                g2.o(u2);
            }
            MutableIntState mutableIntState = (MutableIntState) u2;
            Modifier a2 = SizeKt.a(SelectableKt.a(modifier, z2, mutableInteractionSource, null, z3, new Role(4), aVar), f10235a, f10236b);
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new NavigationItemKt$NavigationItem$1$1(mutableIntState);
                composerImpl = g2;
                composerImpl.o(u3);
            } else {
                composerImpl = g2;
            }
            Modifier a3 = OnRemeasuredModifierKt.a(a2, (l) u3);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.e, true);
            int i10 = composerImpl.P;
            PersistentCompositionLocalMap Q = composerImpl.Q();
            Modifier c4 = ComposedModifierKt.c(composerImpl, a3);
            ComposeUiNode.h8.getClass();
            q0.a aVar2 = ComposeUiNode.Companion.f15895b;
            if (!(composerImpl.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composerImpl.z();
            if (composerImpl.O) {
                composerImpl.B(aVar2);
            } else {
                composerImpl.n();
            }
            Updater.b(composerImpl, e, ComposeUiNode.Companion.f15898g);
            Updater.b(composerImpl, Q, ComposeUiNode.Companion.f15897f);
            p pVar4 = ComposeUiNode.Companion.f15900i;
            if (composerImpl.O || !p0.a.g(composerImpl.u(), Integer.valueOf(i10))) {
                d.x(i10, composerImpl, i10, pVar4);
            }
            Updater.b(composerImpl, c4, ComposeUiNode.Companion.d);
            InteractionSource interactionSource = null;
            State b2 = AnimateAsStateKt.b(z2 ? 1.0f : 0.0f, AnimationSpecKt.d(100, 0, null, 6), composerImpl);
            composerImpl.J(-1634400795);
            if (i2 == 0) {
                long a4 = OffsetKt.a((mutableIntState.g() - r3.F0(f2)) / 2, ((Density) composerImpl.K(CompositionLocalsKt.f16434f)).y1(f10237c));
                boolean d = ((i6 & 29360128) == 8388608) | composerImpl.d(a4);
                Object u4 = composerImpl.u();
                if (d || u4 == composer$Companion$Empty$1) {
                    u4 = new MappedInteractionSource(mutableInteractionSource, a4);
                    composerImpl.o(u4);
                }
                interactionSource = (MappedInteractionSource) u4;
            }
            composerImpl.V(false);
            InteractionSource interactionSource2 = interactionSource != null ? interactionSource : mutableInteractionSource;
            long j2 = navigationItemColors.f10232c;
            boolean I = composerImpl.I(b2);
            Object u5 = composerImpl.u();
            if (I || u5 == composer$Companion$Empty$1) {
                u5 = new NavigationItemKt$NavigationItem$2$3$1(b2);
                composerImpl.o(u5);
            }
            int i11 = i9 << 3;
            b(interactionSource2, j2, shape, composableLambdaImpl, i2, c3, (q0.a) u5, f3, f4, f5, f6, f7, composerImpl, ((i9 >> 6) & 896) | ((i6 >> 6) & 57344) | (29360128 & i11) | (234881024 & i11) | (1879048192 & i11), ((i9 >> 27) & 14) | ((i6 << 3) & 112));
            composerImpl.V(true);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new NavigationItemKt$NavigationItem$3(z2, aVar, pVar, textStyle, shape, f2, f3, f4, f5, f6, f7, navigationItemColors, modifier, z3, pVar2, pVar3, i2, mutableInteractionSource, i3, i4);
        }
    }

    public static final void b(InteractionSource interactionSource, long j2, Shape shape, p pVar, int i2, p pVar2, q0.a aVar, float f2, float f3, float f4, float f5, float f6, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Object topIconOrIconOnlyMeasurePolicy;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(1757687417);
        if ((i3 & 6) == 0) {
            i5 = (g2.I(interactionSource) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= g2.d(j2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g2.I(shape) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= g2.c(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= g2.w(pVar2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= g2.w(aVar) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i3) == 0) {
            i5 |= g2.b(f2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= g2.b(f3) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= g2.b(f4) ? 536870912 : 268435456;
        }
        int i7 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (g2.b(f5) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= g2.b(f6) ? 32 : 16;
        }
        if ((i7 & 306783379) == 306783378 && (i6 & 19) == 18 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            if (pVar2 == null || i2 == 0) {
                composerImpl = g2;
                topIconOrIconOnlyMeasurePolicy = new TopIconOrIconOnlyMeasurePolicy(pVar2 != null, aVar, f2, f3, f4, f6);
            } else {
                topIconOrIconOnlyMeasurePolicy = new StartIconMeasurePolicy(aVar, f2, f3, f5);
                composerImpl = g2;
            }
            Modifier.Companion companion = Modifier.Companion.f14687a;
            int i8 = composerImpl.P;
            PersistentCompositionLocalMap Q = composerImpl.Q();
            Modifier c2 = ComposedModifierKt.c(composerImpl, companion);
            ComposeUiNode.h8.getClass();
            q0.a aVar2 = ComposeUiNode.Companion.f15895b;
            Applier applier = composerImpl.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composerImpl.z();
            if (composerImpl.O) {
                composerImpl.B(aVar2);
            } else {
                composerImpl.n();
            }
            p pVar3 = ComposeUiNode.Companion.f15898g;
            Updater.b(composerImpl, topIconOrIconOnlyMeasurePolicy, pVar3);
            p pVar4 = ComposeUiNode.Companion.f15897f;
            Updater.b(composerImpl, Q, pVar4);
            p pVar5 = ComposeUiNode.Companion.f15900i;
            if (composerImpl.O || !p0.a.g(composerImpl.u(), Integer.valueOf(i8))) {
                d.x(i8, composerImpl, i8, pVar5);
            }
            p pVar6 = ComposeUiNode.Companion.d;
            Updater.b(composerImpl, c2, pVar6);
            BoxKt.a(IndicationKt.a(ClipKt.a(LayoutIdKt.b(companion, "indicatorRipple"), shape), interactionSource, RippleKt.a(false, 0.0f, 0L, composerImpl, 0, 7)), composerImpl, 0);
            Modifier b2 = LayoutIdKt.b(companion, "indicator");
            boolean z2 = (i7 & 3670016) == 1048576;
            Object u2 = composerImpl.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new NavigationItemKt$NavigationItemLayout$1$1$1(aVar);
                composerImpl.o(u2);
            }
            BoxKt.a(BackgroundKt.a(GraphicsLayerModifierKt.a(b2, (l) u2), j2, shape), composerImpl, 0);
            Modifier b3 = LayoutIdKt.b(companion, "icon");
            BiasAlignment biasAlignment = Alignment.Companion.f14659a;
            MeasurePolicy e = BoxKt.e(biasAlignment, false);
            int i9 = composerImpl.P;
            PersistentCompositionLocalMap Q2 = composerImpl.Q();
            Modifier c3 = ComposedModifierKt.c(composerImpl, b3);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composerImpl.z();
            if (composerImpl.O) {
                composerImpl.B(aVar2);
            } else {
                composerImpl.n();
            }
            Updater.b(composerImpl, e, pVar3);
            Updater.b(composerImpl, Q2, pVar4);
            if (composerImpl.O || !p0.a.g(composerImpl.u(), Integer.valueOf(i9))) {
                d.x(i9, composerImpl, i9, pVar5);
            }
            Updater.b(composerImpl, c3, pVar6);
            pVar.invoke(composerImpl, Integer.valueOf((i7 >> 9) & 14));
            composerImpl.V(true);
            composerImpl.J(-776741606);
            if (pVar2 != null) {
                Modifier b4 = LayoutIdKt.b(companion, "label");
                MeasurePolicy e2 = BoxKt.e(biasAlignment, false);
                int i10 = composerImpl.P;
                PersistentCompositionLocalMap Q3 = composerImpl.Q();
                Modifier c4 = ComposedModifierKt.c(composerImpl, b4);
                if (!(applier instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                composerImpl.z();
                if (composerImpl.O) {
                    composerImpl.B(aVar2);
                } else {
                    composerImpl.n();
                }
                Updater.b(composerImpl, e2, pVar3);
                Updater.b(composerImpl, Q3, pVar4);
                if (composerImpl.O || !p0.a.g(composerImpl.u(), Integer.valueOf(i10))) {
                    d.x(i10, composerImpl, i10, pVar5);
                }
                Updater.b(composerImpl, c4, pVar6);
                d.y((i7 >> 15) & 14, pVar2, composerImpl, true);
            }
            composerImpl.V(false);
            composerImpl.V(true);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new NavigationItemKt$NavigationItemLayout$2(interactionSource, j2, shape, pVar, i2, pVar2, aVar, f2, f3, f4, f5, f6, i3, i4);
        }
    }
}
