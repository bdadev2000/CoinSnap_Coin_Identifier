package o0;

import G7.j;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2491c f21935a = C2491c.f21934a;

    public static C2491c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                j.d(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    C2491c strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    j.b(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f21935a;
    }

    public static void b(i iVar) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "StrictMode violation in ".concat(iVar.b.getClass().getName()), iVar);
        }
    }

    public static final void c(Fragment fragment, String str) {
        j.e(fragment, "fragment");
        j.e(str, "previousFragmentId");
        b(new i(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str));
        a(fragment).getClass();
    }
}
