package androidx.navigation.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavHostController;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavHostKt$NavHost$26$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavHostController f20664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$26$1(NavHostController navHostController, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f20664a = navHostController;
        this.f20665b = lifecycleOwner;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Lifecycle lifecycle;
        NavHostController navHostController = this.f20664a;
        navHostController.getClass();
        LifecycleOwner lifecycleOwner = this.f20665b;
        p0.a.s(lifecycleOwner, "owner");
        if (!p0.a.g(lifecycleOwner, navHostController.f20358p)) {
            LifecycleOwner lifecycleOwner2 = navHostController.f20358p;
            androidx.navigation.a aVar = navHostController.f20362t;
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                lifecycle.d(aVar);
            }
            navHostController.f20358p = lifecycleOwner;
            lifecycleOwner.getLifecycle().a(aVar);
        }
        return new Object();
    }
}
