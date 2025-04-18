package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class ProcessLifecycleOwner implements LifecycleOwner {

    /* renamed from: j, reason: collision with root package name */
    public static final ProcessLifecycleOwner f20052j = new ProcessLifecycleOwner();

    /* renamed from: a, reason: collision with root package name */
    public int f20053a;

    /* renamed from: b, reason: collision with root package name */
    public int f20054b;

    /* renamed from: f, reason: collision with root package name */
    public Handler f20056f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20055c = true;
    public boolean d = true;

    /* renamed from: g, reason: collision with root package name */
    public final LifecycleRegistry f20057g = new LifecycleRegistry(this);

    /* renamed from: h, reason: collision with root package name */
    public final c f20058h = new Runnable() { // from class: androidx.lifecycle.c
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f20052j;
            ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
            p0.a.s(processLifecycleOwner2, "this$0");
            int i2 = processLifecycleOwner2.f20054b;
            LifecycleRegistry lifecycleRegistry = processLifecycleOwner2.f20057g;
            if (i2 == 0) {
                processLifecycleOwner2.f20055c = true;
                lifecycleRegistry.g(Lifecycle.Event.ON_PAUSE);
            }
            if (processLifecycleOwner2.f20053a == 0 && processLifecycleOwner2.f20055c) {
                lifecycleRegistry.g(Lifecycle.Event.ON_STOP);
                processLifecycleOwner2.d = true;
            }
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public final ProcessLifecycleOwner$initializationListener$1 f20059i = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public final void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public final void onResume() {
            ProcessLifecycleOwner.this.a();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public final void onStart() {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
            int i2 = processLifecycleOwner.f20053a + 1;
            processLifecycleOwner.f20053a = i2;
            if (i2 == 1 && processLifecycleOwner.d) {
                processLifecycleOwner.f20057g.g(Lifecycle.Event.ON_START);
                processLifecycleOwner.d = false;
            }
        }
    };

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Api29Impl {
        @DoNotInline
        public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            p0.a.s(activity, "activity");
            p0.a.s(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public final void a() {
        int i2 = this.f20054b + 1;
        this.f20054b = i2;
        if (i2 == 1) {
            if (this.f20055c) {
                this.f20057g.g(Lifecycle.Event.ON_RESUME);
                this.f20055c = false;
            } else {
                Handler handler = this.f20056f;
                p0.a.p(handler);
                handler.removeCallbacks(this.f20058h);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f20057g;
    }
}
