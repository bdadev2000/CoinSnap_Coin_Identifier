package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1808c = 0;

    /* renamed from: b, reason: collision with root package name */
    public k0 f1809b;

    public final void a(n nVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            ka.e.h(activity, nVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(n.ON_DESTROY);
        this.f1809b = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        k0 k0Var = this.f1809b;
        if (k0Var != null) {
            k0Var.a.a();
        }
        a(n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        k0 k0Var = this.f1809b;
        if (k0Var != null) {
            l0 l0Var = k0Var.a;
            int i10 = l0Var.f1794b + 1;
            l0Var.f1794b = i10;
            if (i10 == 1 && l0Var.f1797f) {
                l0Var.f1799h.e(n.ON_START);
                l0Var.f1797f = false;
            }
        }
        a(n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(n.ON_STOP);
    }
}
