package org.koin.androidx.viewmodel.ext.android;

import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import d0.h;
import d0.i;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes2.dex */
public final class FragmentVMKt {
    @MainThread
    public static final <T extends ViewModel> T getViewModel(Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "ownerProducer");
        ((ViewModelStoreOwner) aVar.invoke()).getViewModelStore();
        if (aVar2 == null || ((CreationExtras) aVar2.invoke()) == null) {
            p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }

    public static ViewModel getViewModel$default(Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = new FragmentVMKt$getViewModel$1(fragment);
        }
        if ((i2 & 4) != 0) {
            aVar2 = null;
        }
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "ownerProducer");
        ((ViewModelStoreOwner) aVar.invoke()).getViewModelStore();
        if (aVar2 == null || ((CreationExtras) aVar2.invoke()) == null) {
            p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }

    @MainThread
    public static final <T extends ViewModel> h viewModel(Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "ownerProducer");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }

    public static h viewModel$default(Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = new FragmentVMKt$viewModel$1(fragment);
        }
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "ownerProducer");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }
}
