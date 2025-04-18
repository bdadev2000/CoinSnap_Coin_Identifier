package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes2.dex */
public final class SwitchKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11688a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f11689b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f11690c;
    public static final float d;
    public static final float e;

    /* renamed from: f, reason: collision with root package name */
    public static final SnapSpec f11691f;

    /* renamed from: g, reason: collision with root package name */
    public static final TweenSpec f11692g;

    static {
        float f2 = SwitchTokens.f13551b;
        f11688a = f2;
        f11689b = SwitchTokens.f13554g;
        f11690c = SwitchTokens.f13553f;
        float f3 = SwitchTokens.d;
        d = f3;
        e = (f3 - f2) / 2;
        f11691f = new SnapSpec(0);
        f11692g = new TweenSpec(100, (Easing) null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r51, q0.l r52, androidx.compose.ui.Modifier r53, q0.p r54, boolean r55, androidx.compose.material3.SwitchColors r56, androidx.compose.foundation.interaction.MutableInteractionSource r57, androidx.compose.runtime.Composer r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.a(boolean, q0.l, androidx.compose.ui.Modifier, q0.p, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Modifier modifier, boolean z2, boolean z3, SwitchColors switchColors, p pVar, InteractionSource interactionSource, Shape shape, Composer composer, int i2) {
        int i3;
        long j2;
        long j3;
        ComposerImpl g2 = composer.g(-1594099146);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.a(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.a(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(switchColors) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.I(interactionSource) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.I(shape) ? 1048576 : Opcodes.ASM8;
        }
        int i4 = i3;
        if ((i4 & 599187) == 599186 && g2.i()) {
            g2.A();
        } else {
            long j4 = z3 ? z2 ? switchColors.f11675b : switchColors.f11677f : z2 ? switchColors.f11681j : switchColors.f11685n;
            long j5 = z3 ? z2 ? switchColors.f11674a : switchColors.e : z2 ? switchColors.f11680i : switchColors.f11684m;
            float f2 = SwitchTokens.f13550a;
            Shape a2 = ShapesKt.a(ShapeKeyTokens.f13512f, g2);
            float f3 = SwitchTokens.e;
            if (z3) {
                j2 = j4;
                j3 = z2 ? switchColors.f11676c : switchColors.f11678g;
            } else {
                j2 = j4;
                j3 = z2 ? switchColors.f11682k : switchColors.f11686o;
            }
            Modifier a3 = BackgroundKt.a(modifier.T0(new BorderModifierNodeElement(f3, new SolidColor(j3), a2)), j2, a2);
            MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14659a, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a3);
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
            p pVar2 = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, e2, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar3);
            p pVar4 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar4);
            }
            p pVar5 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar5);
            Modifier a4 = BackgroundKt.a(IndicationKt.a(BoxScopeInstance.f3816a.a(Modifier.Companion.f14687a, Alignment.Companion.d).T0(new ThumbElement(interactionSource, z2)), interactionSource, RippleKt.a(false, SwitchTokens.f13552c / 2, 0L, g2, 54, 4)), j5, shape);
            MeasurePolicy e3 = BoxKt.e(Alignment.Companion.e, false);
            int i6 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, a4);
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
            Updater.b(g2, e3, pVar2);
            Updater.b(g2, Q2, pVar3);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar4);
            }
            Updater.b(g2, c3, pVar5);
            g2.J(1163457794);
            if (pVar != null) {
                CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(z3 ? z2 ? switchColors.d : switchColors.f11679h : z2 ? switchColors.f11683l : switchColors.f11687p, ContentColorKt.f8654a), pVar, g2, ((i4 >> 9) & 112) | 8);
            }
            g2.V(false);
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SwitchKt$SwitchImpl$2(modifier, z2, z3, switchColors, pVar, interactionSource, shape, i2);
        }
    }
}
