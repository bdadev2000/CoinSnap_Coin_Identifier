package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import j5.C2400c;

/* loaded from: classes.dex */
public final class Q extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4860c = 0;
    public C2400c b;

    public final void a(EnumC0503m enumC0503m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            G7.j.d(activity, "activity");
            V.d(activity, enumC0503m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0503m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0503m.ON_DESTROY);
        this.b = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0503m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C2400c c2400c = this.b;
        if (c2400c != null) {
            ((I) c2400c.f21107c).a();
        }
        a(EnumC0503m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C2400c c2400c = this.b;
        if (c2400c != null) {
            I i9 = (I) c2400c.f21107c;
            int i10 = i9.b + 1;
            i9.b = i10;
            if (i10 == 1 && i9.f4831f) {
                i9.f4833h.e(EnumC0503m.ON_START);
                i9.f4831f = false;
            }
        }
        a(EnumC0503m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0503m.ON_STOP);
    }
}
