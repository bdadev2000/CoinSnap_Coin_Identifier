package nd;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22729b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22730c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22731d;

    /* renamed from: f, reason: collision with root package name */
    public Object f22732f;

    public final void a(Context context) {
        switch (this.f22729b) {
            case 0:
                if (context instanceof Application) {
                    ((Application) context).registerActivityLifecycleCallbacks(this);
                    return;
                }
                return;
            default:
                if (context instanceof Application) {
                    ((Application) context).registerActivityLifecycleCallbacks(this);
                    return;
                }
                return;
        }
    }

    public final void b(boolean z10) {
        switch (this.f22729b) {
            case 0:
                if (this.f22731d != z10) {
                    this.f22731d = z10;
                    if (this.f22730c) {
                        e(z10);
                        d dVar = (d) this.f22732f;
                        if (dVar != null) {
                            dVar.a(z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (this.f22731d != z10) {
                    this.f22731d = z10;
                    if (this.f22730c) {
                        e(z10);
                        wd.d dVar2 = (wd.d) this.f22732f;
                        if (dVar2 != null) {
                            dVar2.a(z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final boolean c() {
        boolean z10;
        boolean z11;
        switch (this.f22729b) {
            case 0:
                if (d().importance == 100) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && !f()) {
                    return false;
                }
                return true;
            default:
                if (d().importance == 100) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !f()) {
                    return false;
                }
                return true;
        }
    }

    public final ActivityManager.RunningAppProcessInfo d() {
        switch (this.f22729b) {
            case 0:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                return runningAppProcessInfo;
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo2);
                return runningAppProcessInfo2;
        }
    }

    public void e(boolean z10) {
    }

    public boolean f() {
        return false;
    }

    public final void g() {
        switch (this.f22729b) {
            case 0:
                this.f22730c = true;
                boolean c10 = c();
                this.f22731d = c10;
                e(c10);
                return;
            default:
                this.f22730c = true;
                boolean c11 = c();
                this.f22731d = c11;
                e(c11);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f22729b) {
            case 0:
                b(true);
                return;
            default:
                b(true);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f22729b) {
            case 0:
                b(c());
                return;
            default:
                b(c());
                return;
        }
    }
}
