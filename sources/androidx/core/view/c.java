package androidx.core.view;

import androidx.lifecycle.DispatchQueue;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import b1.h1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18853c;

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.f18851a = i2;
        this.f18852b = obj;
        this.f18853c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i2 = this.f18851a;
        Object obj = this.f18853c;
        Object obj2 = this.f18852b;
        switch (i2) {
            case 0:
                MenuHostHelper menuHostHelper = (MenuHostHelper) obj2;
                MenuProvider menuProvider = (MenuProvider) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.c(menuProvider);
                    return;
                } else {
                    menuHostHelper.getClass();
                    return;
                }
            default:
                LifecycleController lifecycleController = (LifecycleController) obj2;
                h1 h1Var = (h1) obj;
                p0.a.s(lifecycleController, "this$0");
                p0.a.s(h1Var, "$parentJob");
                if (lifecycleOwner.getLifecycle().b() == Lifecycle.State.f19987a) {
                    h1Var.a(null);
                    lifecycleController.a();
                    return;
                }
                int compareTo = lifecycleOwner.getLifecycle().b().compareTo(lifecycleController.f19993b);
                DispatchQueue dispatchQueue = lifecycleController.f19994c;
                if (compareTo < 0) {
                    dispatchQueue.f19957a = true;
                    return;
                } else {
                    if (dispatchQueue.f19957a) {
                        if (!(!dispatchQueue.f19958b)) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                        }
                        dispatchQueue.f19957a = false;
                        dispatchQueue.a();
                        return;
                    }
                    return;
                }
        }
    }
}
