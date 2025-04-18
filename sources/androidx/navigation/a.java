package androidx.navigation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20526b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f20525a = i2;
        this.f20526b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i2 = this.f20525a;
        Object obj = this.f20526b;
        switch (i2) {
            case 0:
                NavController navController = (NavController) obj;
                p0.a.s(navController, "this$0");
                navController.f20361s = event.a();
                if (navController.f20347c != null) {
                    Iterator<E> it = navController.f20349g.iterator();
                    while (it.hasNext()) {
                        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                        navBackStackEntry.getClass();
                        navBackStackEntry.d = event.a();
                        navBackStackEntry.d();
                    }
                    return;
                }
                return;
            default:
                SavedStateRegistry savedStateRegistry = (SavedStateRegistry) obj;
                p0.a.s(savedStateRegistry, "this$0");
                if (event == Lifecycle.Event.ON_START) {
                    savedStateRegistry.f21435f = true;
                    return;
                } else {
                    if (event == Lifecycle.Event.ON_STOP) {
                        savedStateRegistry.f21435f = false;
                        return;
                    }
                    return;
                }
        }
    }
}
