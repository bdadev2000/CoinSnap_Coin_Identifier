package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.q;

/* loaded from: classes3.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.animation.core.Transition r34, q0.l r35, androidx.compose.ui.Modifier r36, androidx.compose.animation.EnterTransition r37, androidx.compose.animation.ExitTransition r38, q0.p r39, androidx.compose.animation.OnLookaheadMeasured r40, q0.q r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.a(androidx.compose.animation.core.Transition, q0.l, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, q0.p, androidx.compose.animation.OnLookaheadMeasured, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.foundation.layout.ColumnScope r18, boolean r19, androidx.compose.ui.Modifier r20, androidx.compose.animation.EnterTransition r21, androidx.compose.animation.ExitTransition r22, java.lang.String r23, q0.q r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.b(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.foundation.layout.RowScope r18, boolean r19, androidx.compose.ui.Modifier r20, androidx.compose.animation.EnterTransition r21, androidx.compose.animation.ExitTransition r22, java.lang.String r23, q0.q r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.c(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(boolean r16, androidx.compose.ui.Modifier r17, androidx.compose.animation.EnterTransition r18, androidx.compose.animation.ExitTransition r19, java.lang.String r20, q0.q r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.d(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(Transition transition, l lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, q qVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(429978603);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(transition) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(lVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(enterTransition) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.I(exitTransition) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= g2.w(qVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i3) == 74898 && g2.i()) {
            g2.A();
        } else {
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z2 = (i4 == 32) | (i5 == 4);
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(lVar, transition);
                g2.o(u2);
            }
            a(transition, lVar, LayoutModifierKt.a(modifier, (q) u2), enterTransition, exitTransition, AnimatedVisibilityKt$AnimatedVisibilityImpl$2.f1764a, null, qVar, g2, i5 | 196608 | i4 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128), 64);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AnimatedVisibilityKt$AnimatedVisibilityImpl$3(transition, lVar, modifier, enterTransition, exitTransition, qVar, i2);
        }
    }

    public static final EnterExitState f(Transition transition, l lVar, Object obj, Composer composer) {
        composer.y(-902048200, transition);
        boolean g2 = transition.g();
        EnterExitState enterExitState = EnterExitState.f1806a;
        EnterExitState enterExitState2 = EnterExitState.f1808c;
        EnterExitState enterExitState3 = EnterExitState.f1807b;
        TransitionState transitionState = transition.f2267a;
        if (g2) {
            composer.J(2101296683);
            composer.D();
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                enterExitState = enterExitState3;
            } else if (((Boolean) lVar.invoke(transitionState.a())).booleanValue()) {
                enterExitState = enterExitState2;
            }
        } else {
            composer.J(2101530516);
            Object u2 = composer.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
                composer.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            if (((Boolean) lVar.invoke(transitionState.a())).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                enterExitState = enterExitState3;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = enterExitState2;
            }
            composer.D();
        }
        composer.G();
        return enterExitState;
    }
}
