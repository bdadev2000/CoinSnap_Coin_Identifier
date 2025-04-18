package org.koin.androidx.viewmodel;

import androidx.lifecycle.StateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import d0.a;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.factory.DefaultViewModelFactory;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.scope.Scope;

/* loaded from: classes.dex */
public final class ViewModelResolverKt {
    @a
    @KoinInternalApi
    @NotNull
    public static final <T extends ViewModel> ViewModelProvider.Factory pickFactory(@NotNull Scope scope, @NotNull ViewModelParameter<T> viewModelParameter) {
        p0.a.s(scope, "<this>");
        p0.a.s(viewModelParameter, "viewModelParameters");
        return (viewModelParameter.getRegistryOwner() == null || viewModelParameter.getState() == null) ? new DefaultViewModelFactory(scope, viewModelParameter) : new StateViewModelFactory(scope, viewModelParameter);
    }

    @a
    @KoinInternalApi
    @NotNull
    public static final <T extends ViewModel> T resolveInstance(@NotNull ViewModelProvider viewModelProvider, @NotNull ViewModelParameter<T> viewModelParameter) {
        p0.a.s(viewModelProvider, "<this>");
        p0.a.s(viewModelParameter, "viewModelParameters");
        Class i02 = p0.a.i0(viewModelParameter.getClazz());
        return viewModelParameter.getQualifier() != null ? (T) viewModelProvider.b(i02, viewModelParameter.getQualifier().toString()) : (T) viewModelProvider.a(i02);
    }
}
