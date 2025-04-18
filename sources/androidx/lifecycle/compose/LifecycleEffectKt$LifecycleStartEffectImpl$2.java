package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LifecycleEffectKt$LifecycleStartEffectImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleStartStopEffectScope f20222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20223c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEffectKt$LifecycleStartEffectImpl$2(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, l lVar, int i2) {
        super(2);
        this.f20221a = lifecycleOwner;
        this.f20222b = lifecycleStartStopEffectScope;
        this.f20223c = lVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        LifecycleStartStopEffectScope lifecycleStartStopEffectScope = this.f20222b;
        l lVar = this.f20223c;
        LifecycleEffectKt.b(this.f20221a, lifecycleStartStopEffectScope, lVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
