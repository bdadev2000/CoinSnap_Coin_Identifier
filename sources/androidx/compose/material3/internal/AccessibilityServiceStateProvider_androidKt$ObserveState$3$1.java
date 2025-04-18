package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AccessibilityServiceStateProvider_androidKt$ObserveState$3$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f12765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f12766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f12767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(LifecycleOwner lifecycleOwner, l lVar, q0.a aVar) {
        super(1);
        this.f12765a = lifecycleOwner;
        this.f12766b = lVar;
        this.f12767c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LifecycleObserver, androidx.compose.material3.internal.a] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        final l lVar = this.f12766b;
        final ?? r4 = new LifecycleEventObserver() { // from class: androidx.compose.material3.internal.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                l.this.invoke(event);
            }
        };
        final LifecycleOwner lifecycleOwner = this.f12765a;
        lifecycleOwner.getLifecycle().a(r4);
        final q0.a aVar = this.f12767c;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                q0.a.this.invoke();
                lifecycleOwner.getLifecycle().d(r4);
            }
        };
    }
}
