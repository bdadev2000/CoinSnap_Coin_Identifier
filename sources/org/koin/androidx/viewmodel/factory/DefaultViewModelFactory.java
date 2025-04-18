package org.koin.androidx.viewmodel.factory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import d0.a;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelParameter;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.scope.Scope;
import x0.c;

@a
@KoinInternalApi
/* loaded from: classes4.dex */
public final class DefaultViewModelFactory<T extends ViewModel> implements ViewModelProvider.Factory {

    @NotNull
    private final ViewModelParameter<T> parameters;

    @NotNull
    private final Scope scope;

    public DefaultViewModelFactory(@NotNull Scope scope, @NotNull ViewModelParameter<T> viewModelParameter) {
        p0.a.s(scope, "scope");
        p0.a.s(viewModelParameter, "parameters");
        this.scope = scope;
        this.parameters = viewModelParameter;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public /* bridge */ /* synthetic */ ViewModel create(@NotNull Class cls, @NotNull CreationExtras creationExtras) {
        return super.create(cls, creationExtras);
    }

    @NotNull
    public final ViewModelParameter<T> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public /* bridge */ /* synthetic */ ViewModel create(@NotNull c cVar, @NotNull CreationExtras creationExtras) {
        return super.create(cVar, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> cls) {
        p0.a.s(cls, "modelClass");
        Object obj = this.scope.get(this.parameters.getClazz(), this.parameters.getQualifier(), this.parameters.getParameters());
        p0.a.q(obj, "null cannot be cast to non-null type T of org.koin.androidx.viewmodel.factory.DefaultViewModelFactory.create");
        return (T) obj;
    }
}
