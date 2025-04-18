package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 extends h {
    final /* synthetic */ l0 this$0;

    public j0(l0 l0Var) {
        this.this$0 = l0Var;
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = o0.f1808c;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.checkNotNull(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((o0) findFragmentByTag).f1809b = this.this$0.f1801j;
        }
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        l0 l0Var = this.this$0;
        int i10 = l0Var.f1795c - 1;
        l0Var.f1795c = i10;
        if (i10 == 0) {
            Handler handler = l0Var.f1798g;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(l0Var.f1800i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @RequiresApi(com.vungle.ads.internal.protos.n.NOTIFICATION_REDIRECT_VALUE)
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        h0.a(activity, new i0(this.this$0));
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        l0 l0Var = this.this$0;
        int i10 = l0Var.f1794b - 1;
        l0Var.f1794b = i10;
        if (i10 == 0 && l0Var.f1796d) {
            l0Var.f1799h.e(n.ON_STOP);
            l0Var.f1797f = true;
        }
    }
}
