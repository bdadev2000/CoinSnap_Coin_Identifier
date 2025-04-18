package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f16618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f16619b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, o oVar) {
        super(0);
        this.f16618a = lifecycle;
        this.f16619b = oVar;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f16618a.d(this.f16619b);
        return b0.f30125a;
    }
}
