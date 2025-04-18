package org.koin.androidx.viewmodel;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import b1.f0;
import d0.h;
import d0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.factory.KoinViewModelFactory;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p0.a;
import x0.c;

/* loaded from: classes3.dex */
public final class GetViewModelKt {
    @KoinInternalApi
    @Nullable
    public static final String getViewModelKey(@Nullable Qualifier qualifier, @NotNull Scope scope, @Nullable String str) {
        String str2;
        a.s(scope, "scope");
        if (qualifier == null && str == null && scope.isRoot()) {
            return null;
        }
        if (qualifier == null || (str2 = qualifier.getValue()) == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        return androidx.compose.foundation.text.input.a.k(str2, str, scope.isRoot() ? "" : scope.getId());
    }

    @KoinInternalApi
    @MainThread
    @NotNull
    public static final <T extends ViewModel> h lazyResolveViewModel(@NotNull c cVar, @NotNull q0.a aVar, @Nullable String str, @NotNull q0.a aVar2, @Nullable Qualifier qualifier, @NotNull Scope scope, @Nullable q0.a aVar3) {
        a.s(cVar, "vmClass");
        a.s(aVar, "viewModelStore");
        a.s(aVar2, "extras");
        a.s(scope, "scope");
        return f0.s(i.f30133c, new GetViewModelKt$lazyResolveViewModel$1(cVar, aVar, str, aVar2, qualifier, scope, aVar3));
    }

    @KoinInternalApi
    @NotNull
    public static final <T extends ViewModel> T resolveViewModel(@NotNull c cVar, @NotNull ViewModelStore viewModelStore, @Nullable String str, @NotNull CreationExtras creationExtras, @Nullable Qualifier qualifier, @NotNull Scope scope, @Nullable q0.a aVar) {
        a.s(cVar, "vmClass");
        a.s(viewModelStore, "viewModelStore");
        a.s(creationExtras, "extras");
        a.s(scope, "scope");
        Class i02 = a.i0(cVar);
        ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStore, new KoinViewModelFactory(cVar, scope, qualifier, aVar), creationExtras);
        String viewModelKey = getViewModelKey(qualifier, scope, str);
        return viewModelKey != null ? (T) viewModelProvider.b(i02, viewModelKey) : (T) viewModelProvider.a(i02);
    }
}
