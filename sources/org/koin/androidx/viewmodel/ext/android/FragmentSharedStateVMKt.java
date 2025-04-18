package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import b1.f0;
import d0.a;
import d0.h;
import d0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import x0.c;

/* loaded from: classes2.dex */
public final class FragmentSharedStateVMKt {
    @a
    @MainThread
    public static final <T extends ViewModel> T getSharedStateViewModel(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3) {
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

    public static ViewModel getSharedStateViewModel$default(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = ScopeExtKt.emptyState();
        }
        if ((i2 & 4) != 0) {
            aVar2 = new FragmentSharedStateVMKt$getSharedStateViewModel$1(fragment);
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
    public static final <T extends ViewModel> h sharedStateViewModel(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "state");
        p0.a.s(aVar2, "owner");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }

    public static h sharedStateViewModel$default(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, q0.a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = ScopeExtKt.emptyState();
        }
        if ((i2 & 4) != 0) {
            aVar2 = new FragmentSharedStateVMKt$sharedStateViewModel$1(fragment);
        }
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "state");
        p0.a.s(aVar2, "owner");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }

    @a
    @MainThread
    @NotNull
    public static final <T extends ViewModel> h sharedStateViewModel(@NotNull Fragment fragment, @Nullable Qualifier qualifier, @NotNull q0.a aVar, @NotNull q0.a aVar2, @NotNull c cVar, @Nullable q0.a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "state");
        p0.a.s(aVar2, "owner");
        p0.a.s(cVar, "clazz");
        return f0.s(i.f30133c, new FragmentSharedStateVMKt$sharedStateViewModel$4(fragment, qualifier, aVar, aVar2, cVar, aVar3));
    }

    @a
    @MainThread
    @NotNull
    public static final <T extends ViewModel> T getSharedStateViewModel(@NotNull Fragment fragment, @Nullable Qualifier qualifier, @NotNull q0.a aVar, @NotNull q0.a aVar2, @NotNull c cVar, @Nullable q0.a aVar3) {
        ViewModel resolveViewModel;
        p0.a.s(fragment, "<this>");
        p0.a.s(aVar, "state");
        p0.a.s(aVar2, "owner");
        p0.a.s(cVar, "clazz");
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) aVar2.invoke()).getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras((Bundle) aVar.invoke(), fragment);
        if (extras == null) {
            extras = fragment.getDefaultViewModelCreationExtras();
            p0.a.r(extras, "<get-defaultViewModelCreationExtras>(...)");
        }
        resolveViewModel = GetViewModelKt.resolveViewModel(cVar, viewModelStore, (r16 & 4) != 0 ? null : null, extras, (r16 & 16) != 0 ? null : qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), (r16 & 64) != 0 ? null : aVar3);
        return (T) resolveViewModel;
    }

    public static /* synthetic */ h sharedStateViewModel$default(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, c cVar, q0.a aVar3, int i2, Object obj) {
        Qualifier qualifier2 = (i2 & 1) != 0 ? null : qualifier;
        if ((i2 & 2) != 0) {
            aVar = ScopeExtKt.emptyState();
        }
        q0.a aVar4 = aVar;
        if ((i2 & 4) != 0) {
            aVar2 = new FragmentSharedStateVMKt$sharedStateViewModel$3(fragment);
        }
        return sharedStateViewModel(fragment, qualifier2, aVar4, aVar2, cVar, (i2 & 16) != 0 ? null : aVar3);
    }

    public static /* synthetic */ ViewModel getSharedStateViewModel$default(Fragment fragment, Qualifier qualifier, q0.a aVar, q0.a aVar2, c cVar, q0.a aVar3, int i2, Object obj) {
        Qualifier qualifier2 = (i2 & 1) != 0 ? null : qualifier;
        if ((i2 & 2) != 0) {
            aVar = ScopeExtKt.emptyState();
        }
        q0.a aVar4 = aVar;
        if ((i2 & 4) != 0) {
            aVar2 = new FragmentSharedStateVMKt$getSharedStateViewModel$2(fragment);
        }
        return getSharedStateViewModel(fragment, qualifier2, aVar4, aVar2, cVar, (i2 & 16) != 0 ? null : aVar3);
    }
}
