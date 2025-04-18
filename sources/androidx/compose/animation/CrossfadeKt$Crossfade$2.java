package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
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

/* loaded from: classes3.dex */
final class CrossfadeKt$Crossfade$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f1789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f1790c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1792g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$2(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, q qVar, int i2, int i3) {
        super(2);
        this.f1788a = obj;
        this.f1789b = modifier;
        this.f1790c = finiteAnimationSpec;
        this.d = qVar;
        this.f1791f = i2;
        this.f1792g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        FiniteAnimationSpec finiteAnimationSpec;
        ((Number) obj2).intValue();
        Object obj3 = this.f1788a;
        q qVar = this.d;
        int a2 = RecomposeScopeImplKt.a(this.f1791f | 1);
        int i3 = this.f1792g;
        ComposerImpl g2 = ((Composer) obj).g(523603005);
        if ((i3 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = ((a2 & 8) == 0 ? g2.I(obj3) : g2.w(obj3) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = i3 & 2;
        Modifier modifier2 = this.f1789b;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(modifier2) ? 32 : 16;
        }
        int i5 = i3 & 4;
        FiniteAnimationSpec finiteAnimationSpec2 = this.f1790c;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.w(finiteAnimationSpec2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.w(qVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 1171) == 1170 && g2.i()) {
            g2.A();
            modifier = modifier2;
            finiteAnimationSpec = finiteAnimationSpec2;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.Companion.f14687a;
            }
            Modifier modifier3 = modifier2;
            if (i5 != 0) {
                finiteAnimationSpec2 = AnimationSpecKt.d(0, 0, null, 7);
            }
            FiniteAnimationSpec finiteAnimationSpec3 = finiteAnimationSpec2;
            CrossfadeKt.a(androidx.compose.animation.core.TransitionKt.e(obj3, null, g2, (i2 & 8) | (i2 & 14), 2), modifier3, finiteAnimationSpec3, null, qVar, g2, (i2 & 112) | (i2 & 896) | ((i2 << 3) & 57344), 4);
            modifier = modifier3;
            finiteAnimationSpec = finiteAnimationSpec3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CrossfadeKt$Crossfade$2(obj3, modifier, finiteAnimationSpec, qVar, a2, i3);
        }
        return b0.f30125a;
    }
}
