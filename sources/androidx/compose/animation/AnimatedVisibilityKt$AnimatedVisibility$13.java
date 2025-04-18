package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$13 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f1722c;
    public final /* synthetic */ EnterTransition d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1723f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f1724g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1725h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1726i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$13(Transition transition, l lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, q qVar, int i2, int i3) {
        super(2);
        this.f1720a = transition;
        this.f1721b = lVar;
        this.f1722c = modifier;
        this.d = enterTransition;
        this.f1723f = exitTransition;
        this.f1724g = qVar;
        this.f1725h = i2;
        this.f1726i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        ExitTransition exitTransition;
        ((Number) obj2).intValue();
        Transition transition = this.f1720a;
        l lVar = this.f1721b;
        q qVar = this.f1724g;
        int a2 = RecomposeScopeImplKt.a(this.f1725h | 1);
        int i3 = this.f1726i;
        ComposerImpl g2 = ((Composer) obj).g(1031950689);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(transition) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i3 & 1) != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.w(lVar) ? 32 : 16;
        }
        int i4 = i3 & 2;
        Modifier modifier2 = this.f1722c;
        if (i4 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(modifier2) ? 256 : 128;
        }
        int i5 = i3 & 4;
        EnterTransition enterTransition = this.d;
        if (i5 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.I(enterTransition) ? Opcodes.ACC_STRICT : 1024;
        }
        int i6 = i3 & 8;
        ExitTransition exitTransition2 = this.f1723f;
        if (i6 != 0) {
            i2 |= 24576;
        } else if ((a2 & 24576) == 0) {
            i2 |= g2.I(exitTransition2) ? 16384 : 8192;
        }
        if ((i3 & 16) != 0) {
            i2 |= 196608;
        } else if ((a2 & 196608) == 0) {
            i2 |= g2.w(qVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i2) == 74898 && g2.i()) {
            g2.A();
            modifier = modifier2;
            exitTransition = exitTransition2;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.Companion.f14687a;
            }
            Modifier modifier3 = modifier2;
            if (i5 != 0) {
                enterTransition = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c());
            }
            EnterTransition enterTransition2 = enterTransition;
            if (i6 != 0) {
                exitTransition2 = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
            }
            ExitTransition exitTransition3 = exitTransition2;
            AnimatedVisibilityKt.e(transition, lVar, modifier3, enterTransition2, exitTransition3, qVar, g2, (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (i2 & Opcodes.ASM7));
            modifier = modifier3;
            enterTransition = enterTransition2;
            exitTransition = exitTransition3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AnimatedVisibilityKt$AnimatedVisibility$13(transition, lVar, modifier, enterTransition, exitTransition, qVar, a2, i3);
        }
        return b0.f30125a;
    }
}
