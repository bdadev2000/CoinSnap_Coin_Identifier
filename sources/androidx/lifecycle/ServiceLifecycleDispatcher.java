package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.safedk.android.analytics.events.MaxEvent;

/* loaded from: classes2.dex */
public class ServiceLifecycleDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final LifecycleRegistry f20111a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f20112b;

    /* renamed from: c, reason: collision with root package name */
    public DispatchRunnable f20113c;

    /* loaded from: classes2.dex */
    public static final class DispatchRunnable implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final LifecycleRegistry f20114a;

        /* renamed from: b, reason: collision with root package name */
        public final Lifecycle.Event f20115b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20116c;

        public DispatchRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
            p0.a.s(lifecycleRegistry, "registry");
            p0.a.s(event, MaxEvent.f29810a);
            this.f20114a = lifecycleRegistry;
            this.f20115b = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20116c) {
                return;
            }
            this.f20114a.g(this.f20115b);
            this.f20116c = true;
        }
    }

    public ServiceLifecycleDispatcher(LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "provider");
        this.f20111a = new LifecycleRegistry(lifecycleOwner);
        this.f20112b = new Handler();
    }

    public final void a(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.f20113c;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.f20111a, event);
        this.f20113c = dispatchRunnable2;
        this.f20112b.postAtFrontOfQueue(dispatchRunnable2);
    }
}
