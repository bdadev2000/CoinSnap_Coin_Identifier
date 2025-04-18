package org.koin.androidx.viewmodel.ext.android;

import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import d0.a;
import d0.h;
import d0.i;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* loaded from: classes4.dex */
public final class FragmentSharedVMKt {
    @a
    @MainThread
    public static final <T extends ViewModel> T getSharedViewModel(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "owner");
        ((ViewModelStoreOwner) aVar.invoke()).getViewModelStore();
        if (aVar2 == null || ((CreationExtras) aVar2.invoke()) == null) {
            p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }

    public static ViewModel getSharedViewModel$default(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = new FragmentSharedVMKt$getSharedViewModel$1(fragment);
        }
        if ((i2 & 4) != 0) {
            aVar2 = null;
        }
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "owner");
        ((ViewModelStoreOwner) aVar.invoke()).getViewModelStore();
        if (aVar2 == null || ((CreationExtras) aVar2.invoke()) == null) {
            p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }

    @a
    @MainThread
    public static final <T extends ViewModel> h sharedViewModel(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "owner");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }

    public static h sharedViewModel$default(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = new FragmentSharedVMKt$sharedViewModel$1(fragment);
        }
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "owner");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }
}
