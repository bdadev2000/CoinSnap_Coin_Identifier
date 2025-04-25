package com.glority.android.core.lifecycle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReactiveLifecycleObserver.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/glority/android/core/lifecycle/ReactiveLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onObserve", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public interface ReactiveLifecycleObserver extends DefaultLifecycleObserver {

    /* compiled from: ReactiveLifecycleObserver.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static void onObserve(ReactiveLifecycleObserver reactiveLifecycleObserver, Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(reactiveLifecycleObserver, "this");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        }
    }

    void onObserve(Lifecycle lifecycle);
}
