package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import d0.a;
import d0.h;
import d0.i;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* loaded from: classes.dex */
public final class FragmentStateVMKt {
    @a
    @MainThread
    public static final <T extends ViewModel> T getStateViewModel(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "state");
        p0.a.s(aVar2, "owner");
        ((ViewModelStoreOwner) aVar2.invoke()).getViewModelStore();
        if (BundleExtKt.toExtras((Bundle) aVar.invoke(), fragment) == null) {
            p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }

    public static ViewModel getStateViewModel$default(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = ScopeExtKt.emptyState();
        }
        if ((i2 & 4) != 0) {
            aVar2 = new FragmentStateVMKt$getStateViewModel$1(fragment);
        }
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "state");
        p0.a.s(aVar2, "owner");
        ((ViewModelStoreOwner) aVar2.invoke()).getViewModelStore();
        if (BundleExtKt.toExtras((Bundle) aVar.invoke(), fragment) == null) {
            p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }

    @a
    @MainThread
    public static final <T extends ViewModel> h stateViewModel(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "state");
        p0.a.s(aVar2, "owner");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }

    public static h stateViewModel$default(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = ScopeExtKt.emptyState();
        }
        if ((i2 & 4) != 0) {
            aVar2 = new FragmentStateVMKt$stateViewModel$1(fragment);
        }
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "state");
        p0.a.s(aVar2, "owner");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }
}
