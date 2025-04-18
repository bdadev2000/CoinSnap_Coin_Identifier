package androidx.lifecycle;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends h {
    final /* synthetic */ l0 this$0;

    public i0(l0 l0Var) {
        this.this$0 = l0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        l0 l0Var = this.this$0;
        int i10 = l0Var.f1794b + 1;
        l0Var.f1794b = i10;
        if (i10 == 1 && l0Var.f1797f) {
            l0Var.f1799h.e(n.ON_START);
            l0Var.f1797f = false;
        }
    }
}
