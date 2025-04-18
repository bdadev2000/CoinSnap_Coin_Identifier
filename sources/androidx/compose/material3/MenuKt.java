package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
public final class MenuKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9737a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f9738b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f9739c = 12;
    public static final float d = 8;
    public static final float e = 112;

    /* renamed from: f, reason: collision with root package name */
    public static final float f9740f = 280;

    static {
        float f2 = 48;
        f9737a = f2;
        f9738b = f2;
    }

    public static final void a(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar, Composer composer, int i2) {
        int i3;
        int i4;
        ComposerImpl g2 = composer.g(-151448888);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? g2.I(mutableTransitionState) : g2.w(mutableTransitionState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(mutableState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(scrollState) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.I(shape) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.d(j2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.b(f2) ? 1048576 : Opcodes.ASM8;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= g2.b(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.I(borderStroke) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= g2.w(qVar) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && g2.i()) {
            g2.A();
        } else {
            int i5 = ((i3 >> 3) & 14) | 48;
            Transition d2 = TransitionKt.d(mutableTransitionState, "DropDownMenu", g2, (i5 & 112) | (i5 & 14));
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = MenuKt$DropdownMenuContent$scale$2.f9759a;
            TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
            boolean booleanValue = ((Boolean) d2.f2267a.a()).booleanValue();
            g2.J(2139028452);
            float f4 = booleanValue ? 1.0f : 0.8f;
            g2.V(false);
            Float valueOf = Float.valueOf(f4);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = d2.d;
            boolean booleanValue2 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            g2.J(2139028452);
            float f5 = booleanValue2 ? 1.0f : 0.8f;
            g2.V(false);
            Transition.TransitionAnimationState c2 = TransitionKt.c(d2, valueOf, Float.valueOf(f5), (FiniteAnimationSpec) menuKt$DropdownMenuContent$scale$2.invoke(d2.f(), g2, 0), twoWayConverter, g2, 0);
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = MenuKt$DropdownMenuContent$alpha$2.f9758a;
            boolean booleanValue3 = ((Boolean) d2.f2267a.a()).booleanValue();
            g2.J(-249413128);
            float f6 = booleanValue3 ? 1.0f : 0.0f;
            g2.V(false);
            Float valueOf2 = Float.valueOf(f6);
            boolean booleanValue4 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            g2.J(-249413128);
            float f7 = booleanValue4 ? 1.0f : 0.0f;
            g2.V(false);
            Transition.TransitionAnimationState c3 = TransitionKt.c(d2, valueOf2, Float.valueOf(f7), (FiniteAnimationSpec) menuKt$DropdownMenuContent$alpha$2.invoke(d2.f(), g2, 0), twoWayConverter, g2, 0);
            boolean booleanValue5 = ((Boolean) g2.K(InspectionModeKt.f16522a)).booleanValue();
            Modifier.Companion companion = Modifier.Companion.f14687a;
            boolean a2 = g2.a(booleanValue5) | g2.I(c2) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && g2.w(mutableTransitionState))) | g2.I(c3) | ((i3 & 896) == 256);
            Object u2 = g2.u();
            if (a2 || u2 == Composer.Companion.f13690a) {
                i4 = i3;
                MenuKt$DropdownMenuContent$1$1 menuKt$DropdownMenuContent$1$1 = new MenuKt$DropdownMenuContent$1$1(booleanValue5, mutableTransitionState, mutableState, c2, c3);
                g2.o(menuKt$DropdownMenuContent$1$1);
                u2 = menuKt$DropdownMenuContent$1$1;
            } else {
                i4 = i3;
            }
            int i6 = i4 >> 9;
            int i7 = i4 >> 6;
            SurfaceKt.a(GraphicsLayerModifierKt.a(companion, (l) u2), shape, j2, 0L, f2, f3, borderStroke, ComposableLambdaKt.c(1573559053, new MenuKt$DropdownMenuContent$2(modifier, scrollState, qVar), g2), g2, (i6 & 896) | (i6 & 112) | 12582912 | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new MenuKt$DropdownMenuContent$3(modifier, mutableTransitionState, mutableState, scrollState, shape, j2, f2, f3, borderStroke, qVar, i2);
        }
    }

    public static final void b(p pVar, q0.a aVar, Modifier modifier, p pVar2, p pVar3, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1564716777);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(pVar2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.a(z2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.I(menuItemColors) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.I(paddingValues) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.I(mutableInteractionSource) ? 67108864 : 33554432;
        }
        if ((i3 & 38347923) == 38347922 && g2.i()) {
            g2.A();
        } else {
            Modifier e2 = PaddingKt.e(SizeKt.q(SizeKt.d(ClickableKt.b(modifier, mutableInteractionSource, RippleKt.a(true, 0.0f, 0L, g2, 6, 6), z2, null, aVar, 24), 1.0f), e, f9738b, f9740f, 8), paddingValues);
            RowMeasurePolicy a2 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14667k, g2, 48);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, e2);
            ComposeUiNode.h8.getClass();
            q0.a aVar2 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar2);
            } else {
                g2.n();
            }
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar4 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar4);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            TextKt.a(MaterialTheme.b(g2).f12628m, ComposableLambdaKt.c(1065051884, new MenuKt$DropdownMenuItemContent$1$1(pVar2, menuItemColors, z2, pVar3, pVar), g2), g2, 48);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new MenuKt$DropdownMenuItemContent$2(pVar, aVar, modifier, pVar2, pVar3, z2, menuItemColors, paddingValues, mutableInteractionSource, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long c(androidx.compose.ui.unit.IntRect r6, androidx.compose.ui.unit.IntRect r7) {
        /*
            int r0 = r7.f17490a
            int r1 = r6.f17492c
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lb
        L9:
            r0 = r3
            goto L31
        Lb:
            int r0 = r7.f17492c
            int r1 = r6.f17490a
            if (r0 > r1) goto L13
            r0 = r2
            goto L31
        L13:
            int r4 = r7.c()
            if (r4 != 0) goto L1a
            goto L9
        L1a:
            int r4 = r7.f17490a
            int r1 = java.lang.Math.max(r1, r4)
            int r5 = r6.f17492c
            int r0 = java.lang.Math.min(r5, r0)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r7.c()
            float r1 = (float) r1
            float r0 = r0 / r1
        L31:
            int r1 = r7.f17491b
            int r4 = r6.d
            if (r1 < r4) goto L39
        L37:
            r2 = r3
            goto L5b
        L39:
            int r5 = r7.d
            int r6 = r6.f17491b
            if (r5 > r6) goto L40
            goto L5b
        L40:
            int r2 = r7.b()
            if (r2 != 0) goto L47
            goto L37
        L47:
            int r6 = java.lang.Math.max(r6, r1)
            int r2 = java.lang.Math.min(r4, r5)
            int r2 = r2 + r6
            int r2 = r2 / 2
            int r2 = r2 - r1
            float r6 = (float) r2
            int r7 = r7.b()
            float r7 = (float) r7
            float r2 = r6 / r7
        L5b:
            long r6 = androidx.compose.ui.graphics.TransformOriginKt.a(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.c(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }
}
