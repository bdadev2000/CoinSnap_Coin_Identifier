package androidx.navigation;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateViewModelFactory;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavBackStackEntry$defaultFactory$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f20340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$defaultFactory$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.f20340a = navBackStackEntry;
    }

    @Override // q0.a
    public final Object invoke() {
        NavBackStackEntry navBackStackEntry = this.f20340a;
        Context context = navBackStackEntry.f20327a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        return new SavedStateViewModelFactory(applicationContext instanceof Application ? (Application) applicationContext : null, navBackStackEntry, navBackStackEntry.a());
    }
}
