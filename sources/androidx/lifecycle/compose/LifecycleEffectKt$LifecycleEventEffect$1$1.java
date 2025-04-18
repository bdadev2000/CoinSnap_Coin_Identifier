package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LifecycleEffectKt$LifecycleEventEffect$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.Event f20160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f20161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEffectKt$LifecycleEventEffect$1$1(LifecycleOwner lifecycleOwner, Lifecycle.Event event, MutableState mutableState) {
        super(1);
        this.f20159a = lifecycleOwner;
        this.f20160b = event;
        this.f20161c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.compose.a, androidx.lifecycle.LifecycleObserver] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        final Lifecycle.Event event = this.f20160b;
        final State state = this.f20161c;
        final ?? r3 = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                if (event2 == Lifecycle.Event.this) {
                    ((q0.a) state.getValue()).invoke();
                }
            }
        };
        final LifecycleOwner lifecycleOwner = this.f20159a;
        lifecycleOwner.getLifecycle().a(r3);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                LifecycleOwner.this.getLifecycle().d(r3);
            }
        };
    }
}
