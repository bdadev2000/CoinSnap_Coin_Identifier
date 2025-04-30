package R0;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0464g0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes.dex */
public final class b extends AbstractC0464g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f2617a;
    public final /* synthetic */ FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F6.a f2618c;

    public b(F6.a aVar, Fragment fragment, FrameLayout frameLayout) {
        this.f2618c = aVar;
        this.f2617a = fragment;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.AbstractC0464g0
    public final void c(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.f2617a) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(this);
            this.f2618c.getClass();
            F6.a.a(view, this.b);
        }
    }
}
