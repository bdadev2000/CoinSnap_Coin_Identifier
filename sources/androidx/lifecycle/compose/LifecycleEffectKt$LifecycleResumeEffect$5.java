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

/* loaded from: classes4.dex */
final class LifecycleEffectKt$LifecycleResumeEffect$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20187c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEffectKt$LifecycleResumeEffect$5(LifecycleOwner lifecycleOwner, l lVar, int i2, int i3) {
        super(2);
        this.f20185a = lifecycleOwner;
        this.f20186b = lVar;
        this.f20187c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f20187c | 1);
        ComposerImpl g2 = ((Composer) obj).g(-747476210);
        int i2 = a2 & 1;
        int i3 = this.d;
        if (i2 == 0 && g2.i()) {
            g2.A();
            RecomposeScopeImpl Z = g2.Z();
            if (Z != null) {
                Z.d = new LifecycleEffectKt$LifecycleResumeEffect$5(this.f20185a, this.f20186b, a2, i3);
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
        throw new IllegalStateException("LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
    }
}
