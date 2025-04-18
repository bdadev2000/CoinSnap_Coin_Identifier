package h1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import h.o0;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {
    public static final b a = b.f18707c;

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    b strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    Intrinsics.checkNotNull(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(b bVar, j jVar) {
        Fragment fragment = jVar.f18710b;
        String name = fragment.getClass().getName();
        a aVar = a.PENALTY_LOG;
        Set set = bVar.a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), jVar);
        }
        if (set.contains(a.PENALTY_DEATH)) {
            o0 o0Var = new o0(4, name, jVar);
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().getHost().f1649d;
                Intrinsics.checkNotNullExpressionValue(handler, "fragment.parentFragmentManager.host.handler");
                if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                    o0Var.run();
                    return;
                } else {
                    handler.post(o0Var);
                    return;
                }
            }
            o0Var.run();
        }
    }

    public static void c(j jVar) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "StrictMode violation in ".concat(jVar.f18710b.getClass().getName()), jVar);
        }
    }

    public static final void d(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        d dVar = new d(fragment, previousFragmentId);
        c(dVar);
        b a10 = a(fragment);
        if (a10.a.contains(a.DETECT_FRAGMENT_REUSE) && e(a10, fragment.getClass(), d.class)) {
            b(a10, dVar);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f18708b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!Intrinsics.areEqual(cls2.getSuperclass(), j.class) && CollectionsKt.contains(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
