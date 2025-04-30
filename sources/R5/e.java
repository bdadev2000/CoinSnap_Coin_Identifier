package R5;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class e implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2743c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2744d;

    /* renamed from: f, reason: collision with root package name */
    public Object f2745f;

    public void a(boolean z8) {
        int i9 = this.b;
    }

    public boolean d() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i9 = this.b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i9 = this.b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i9 = this.b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i9 = this.b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i9 = this.b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.b) {
            case 0:
                if (!this.f2744d) {
                    this.f2744d = true;
                    if (this.f2743c) {
                        a(true);
                        d dVar = (d) this.f2745f;
                        if (dVar != null) {
                            dVar.a(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!this.f2744d) {
                    this.f2744d = true;
                    if (this.f2743c) {
                        a(true);
                        b6.d dVar2 = (b6.d) this.f2745f;
                        if (dVar2 != null) {
                            dVar2.a(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean z8;
        boolean z9;
        switch (this.b) {
            case 0:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100 || d()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (this.f2744d != z8) {
                    this.f2744d = z8;
                    if (this.f2743c) {
                        a(z8);
                        d dVar = (d) this.f2745f;
                        if (dVar != null) {
                            dVar.a(z8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo2);
                if (runningAppProcessInfo2.importance == 100 || d()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.f2744d != z9) {
                    this.f2744d = z9;
                    if (this.f2743c) {
                        a(z9);
                        b6.d dVar2 = (b6.d) this.f2745f;
                        if (dVar2 != null) {
                            dVar2.a(z9);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private void b(boolean z8) {
    }

    private void c(boolean z8) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    private final void k(Activity activity) {
    }

    private final void l(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity, Bundle bundle) {
    }

    private final void m(Activity activity, Bundle bundle) {
    }

    private final void n(Activity activity, Bundle bundle) {
    }
}
