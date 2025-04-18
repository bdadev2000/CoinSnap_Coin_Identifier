package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends h {
    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = o0.f1808c;
        ka.e.n(activity);
    }
}
