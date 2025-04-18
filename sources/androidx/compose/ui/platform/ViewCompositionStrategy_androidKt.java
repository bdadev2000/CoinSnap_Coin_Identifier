package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes4.dex */
public final class ViewCompositionStrategy_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.platform.o, androidx.lifecycle.LifecycleObserver] */
    public static final q0.a a(final AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.f19987a) > 0) {
            ?? r02 = new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.o
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        AbstractComposeView.this.d();
                    }
                }
            };
            lifecycle.a(r02);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, r02);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
