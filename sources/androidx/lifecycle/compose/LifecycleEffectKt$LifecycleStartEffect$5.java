package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
final class LifecycleEffectKt$LifecycleStartEffect$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20216c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEffectKt$LifecycleStartEffect$5(LifecycleOwner lifecycleOwner, l lVar, int i2, int i3) {
        super(2);
        this.f20214a = lifecycleOwner;
        this.f20215b = lVar;
        this.f20216c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f20216c | 1);
        ComposerImpl g2 = ((Composer) obj).g(-50807951);
        int i2 = a2 & 1;
        int i3 = this.d;
        if (i2 == 0 && g2.i()) {
            g2.A();
            RecomposeScopeImpl Z = g2.Z();
            if (Z != null) {
                Z.d = new LifecycleEffectKt$LifecycleStartEffect$5(this.f20214a, this.f20215b, a2, i3);
            }
            return b0.f30125a;
        }
        g2.u0();
        if (i2 != 0 && !g2.e0()) {
            g2.A();
            int i4 = i3 & 1;
        } else if ((i3 & 1) != 0) {
        }
        g2.W();
        throw new IllegalStateException("LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
    }
}
