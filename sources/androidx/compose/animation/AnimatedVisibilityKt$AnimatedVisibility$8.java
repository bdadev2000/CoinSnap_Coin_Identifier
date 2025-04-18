package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$8 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f1753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f1754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnterTransition f1755c;
    public final /* synthetic */ ExitTransition d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f1757g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1758h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1759i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$8(MutableTransitionState mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q qVar, int i2, int i3) {
        super(2);
        this.f1753a = mutableTransitionState;
        this.f1754b = modifier;
        this.f1755c = enterTransition;
        this.d = exitTransition;
        this.f1756f = str;
        this.f1757g = qVar;
        this.f1758h = i2;
        this.f1759i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        EnterTransition enterTransition;
        ExitTransition exitTransition;
        String str;
        ((Number) obj2).intValue();
        MutableTransitionState mutableTransitionState = this.f1753a;
        q qVar = this.f1757g;
        int a2 = RecomposeScopeImplKt.a(this.f1758h | 1);
        int i3 = this.f1759i;
        ComposerImpl g2 = ((Composer) obj).g(-222898426);
        if ((i3 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = ((a2 & 8) == 0 ? g2.I(mutableTransitionState) : g2.w(mutableTransitionState) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = i3 & 2;
        Modifier modifier2 = this.f1754b;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(modifier2) ? 32 : 16;
        }
        int i5 = i3 & 4;
        EnterTransition enterTransition2 = this.f1755c;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(enterTransition2) ? 256 : 128;
        }
        int i6 = i3 & 8;
        ExitTransition exitTransition2 = this.d;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.I(exitTransition2) ? Opcodes.ACC_STRICT : 1024;
        }
        int i7 = i3 & 16;
        String str2 = this.f1756f;
        if (i7 != 0) {
            i2 |= 24576;
        } else if ((a2 & 24576) == 0) {
            i2 |= g2.I(str2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i2 |= 196608;
        } else if ((a2 & 196608) == 0) {
            i2 |= g2.w(qVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i2) == 74898 && g2.i()) {
            g2.A();
            modifier = modifier2;
            enterTransition = enterTransition2;
            exitTransition = exitTransition2;
            str = str2;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.Companion.f14687a;
            }
            Modifier modifier3 = modifier2;
            if (i5 != 0) {
                enterTransition2 = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c());
            }
            EnterTransition enterTransition3 = enterTransition2;
            if (i6 != 0) {
                exitTransition2 = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
            }
            ExitTransition exitTransition3 = exitTransition2;
            if (i7 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i8 = i2 << 3;
            AnimatedVisibilityKt.e(androidx.compose.animation.core.TransitionKt.d(mutableTransitionState, str2, g2, (i2 & 14) | ((i2 >> 9) & 112)), AnimatedVisibilityKt$AnimatedVisibility$7.f1752a, modifier3, enterTransition3, exitTransition3, qVar, g2, (i2 & Opcodes.ASM7) | (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168));
            modifier = modifier3;
            enterTransition = enterTransition3;
            exitTransition = exitTransition3;
            str = str2;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AnimatedVisibilityKt$AnimatedVisibility$8(mutableTransitionState, modifier, enterTransition, exitTransition, str, qVar, a2, i3);
        }
        return b0.f30125a;
    }
}
