package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class G extends AbstractC0497g {
    final /* synthetic */ I this$0;

    public G(I i9) {
        this.this$0 = i9;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        G7.j.e(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        G7.j.e(activity, "activity");
        I i9 = this.this$0;
        int i10 = i9.b + 1;
        i9.b = i10;
        if (i10 == 1 && i9.f4831f) {
            i9.f4833h.e(EnumC0503m.ON_START);
            i9.f4831f = false;
        }
    }
}
