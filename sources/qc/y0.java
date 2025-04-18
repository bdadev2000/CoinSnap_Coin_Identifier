package qc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23890b = new y0();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23891c;

    /* renamed from: d, reason: collision with root package name */
    public static u0 f23892d;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        u0 u0Var = f23892d;
        if (u0Var != null) {
            u0Var.c(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        u0 u0Var = f23892d;
        if (u0Var != null) {
            u0Var.c(1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            f23891c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
