package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import d0.h;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class SharedTransitionScopeKt$SharedTransitionLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f1929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1931c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionLayout$2(Modifier modifier, q qVar, int i2, int i3) {
        super(2);
        this.f1929a = modifier;
        this.f1930b = qVar;
        this.f1931c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f1931c | 1);
        h hVar = SharedTransitionScopeKt.f1925a;
        ComposerImpl g2 = ((Composer) obj).g(2043053727);
        int i3 = this.d;
        int i4 = i3 & 1;
        Modifier modifier = this.f1929a;
        if (i4 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i5 = i3 & 2;
        q qVar = this.f1930b;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.w(qVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            SharedTransitionScopeKt.a(ComposableLambdaKt.c(-130587847, new SharedTransitionScopeKt$SharedTransitionLayout$1(modifier, qVar), g2), g2, 6);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SharedTransitionScopeKt$SharedTransitionLayout$2(modifier, qVar, a2, i3);
        }
        return b0.f30125a;
    }
}
