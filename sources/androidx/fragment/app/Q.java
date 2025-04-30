package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class Q extends N {
    public final Activity b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4683c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4684d;

    /* renamed from: f, reason: collision with root package name */
    public final C0478n0 f4685f;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.FragmentManager, androidx.fragment.app.n0] */
    public Q(FragmentActivity fragmentActivity) {
        G7.j.e(fragmentActivity, "activity");
        Handler handler = new Handler();
        this.b = fragmentActivity;
        this.f4683c = fragmentActivity;
        this.f4684d = handler;
        this.f4685f = new FragmentManager();
    }

    public final void d(Fragment fragment, Intent intent, int i9, Bundle bundle) {
        G7.j.e(fragment, "fragment");
        G7.j.e(intent, "intent");
        if (i9 == -1) {
            I.h.startActivity(this.f4683c, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
    }
}
