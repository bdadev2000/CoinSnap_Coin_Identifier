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
public final class LifecycleEffectKt$LifecycleResumeEffectImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleResumePauseEffectScope f20193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20194c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEffectKt$LifecycleResumeEffectImpl$2(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, l lVar, int i2) {
        super(2);
        this.f20192a = lifecycleOwner;
        this.f20193b = lifecycleResumePauseEffectScope;
        this.f20194c = lVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = this.f20193b;
        l lVar = this.f20194c;
        LifecycleEffectKt.a(this.f20192a, lifecycleResumePauseEffectScope, lVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
