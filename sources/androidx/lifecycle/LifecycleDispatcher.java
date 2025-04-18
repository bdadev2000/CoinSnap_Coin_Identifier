package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.ReportFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class LifecycleDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f20008a = new AtomicBoolean(false);

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            p0.a.s(activity, "activity");
            int i2 = ReportFragment.f20088b;
            ReportFragment.Companion.b(activity);
        }
    }
}
