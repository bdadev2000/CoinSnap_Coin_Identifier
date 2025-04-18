package org.koin.androidx.viewmodel.factory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.parameter.AndroidParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import q0.a;
import x0.c;

/* loaded from: classes3.dex */
public final class KoinViewModelFactory implements ViewModelProvider.Factory {

    @NotNull
    private final c kClass;

    @Nullable
    private final a params;

    @Nullable
    private final Qualifier qualifier;

    @NotNull
    private final Scope scope;

    public KoinViewModelFactory(@NotNull c cVar, @NotNull Scope scope, @Nullable Qualifier qualifier, @Nullable a aVar) {
        p0.a.s(cVar, "kClass");
        p0.a.s(scope, "scope");
        this.kClass = cVar;
        this.scope = scope;
        this.qualifier = qualifier;
        this.params = aVar;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public /* bridge */ /* synthetic */ ViewModel create(@NotNull Class cls) {
        super.create(cls);
        throw null;
    }

    public /* synthetic */ KoinViewModelFactory(c cVar, Scope scope, Qualifier qualifier, a aVar, int i2, k kVar) {
        this(cVar, scope, (i2 & 4) != 0 ? null : qualifier, (i2 & 8) != 0 ? null : aVar);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public /* bridge */ /* synthetic */ ViewModel create(@NotNull c cVar, @NotNull CreationExtras creationExtras) {
        return super.create(cVar, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> cls, @NotNull CreationExtras creationExtras) {
        p0.a.s(cls, "modelClass");
        p0.a.s(creationExtras, "extras");
        return (T) this.scope.get(this.kClass, this.qualifier, new KoinViewModelFactory$create$1(new AndroidParametersHolder(this.params, creationExtras)));
    }
}
