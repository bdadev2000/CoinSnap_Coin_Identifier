package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class H extends AbstractC0497g {
    final /* synthetic */ I this$0;

    public H(I i9) {
        this.this$0 = i9;
    }

    @Override // androidx.lifecycle.AbstractC0497g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i9 = Q.f4860c;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            G7.j.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((Q) findFragmentByTag).b = this.this$0.f4835j;
        }
    }

    @Override // androidx.lifecycle.AbstractC0497g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        G7.j.e(activity, "activity");
        I i9 = this.this$0;
        int i10 = i9.f4829c - 1;
        i9.f4829c = i10;
        if (i10 == 0) {
            Handler handler = i9.f4832g;
            G7.j.b(handler);
            handler.postDelayed(i9.f4834i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @RequiresApi(29)
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
        F.a(activity, new G(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0497g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        G7.j.e(activity, "activity");
        I i9 = this.this$0;
        int i10 = i9.b - 1;
        i9.b = i10;
        if (i10 == 0 && i9.f4830d) {
            i9.f4833h.e(EnumC0503m.ON_STOP);
            i9.f4831f = true;
        }
    }
}
