package androidx.navigation;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavBackStackEntry$savedStateHandle$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f20341a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$savedStateHandle$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.f20341a = navBackStackEntry;
    }

    @Override // q0.a
    public final Object invoke() {
        NavBackStackEntry navBackStackEntry = this.f20341a;
        if (!navBackStackEntry.f20335k) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (navBackStackEntry.f20333i.d != Lifecycle.State.f19987a) {
            return ((NavBackStackEntry.SavedStateViewModel) new ViewModelProvider(navBackStackEntry, new AbstractSavedStateViewModelFactory(navBackStackEntry, null)).a(NavBackStackEntry.SavedStateViewModel.class)).f20339b;
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
    }
}
