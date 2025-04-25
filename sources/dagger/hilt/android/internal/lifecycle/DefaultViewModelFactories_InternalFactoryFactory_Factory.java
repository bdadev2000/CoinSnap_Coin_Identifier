package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements Factory<DefaultViewModelFactories.InternalFactoryFactory> {
    private final Provider<Map<Class<?>, Boolean>> keySetProvider;
    private final Provider<ViewModelComponentBuilder> viewModelComponentBuilderProvider;

    public DefaultViewModelFactories_InternalFactoryFactory_Factory(Provider<Map<Class<?>, Boolean>> keySetProvider, Provider<ViewModelComponentBuilder> viewModelComponentBuilderProvider) {
        this.keySetProvider = keySetProvider;
        this.viewModelComponentBuilderProvider = viewModelComponentBuilderProvider;
    }

    @Override // javax.inject.Provider
    public DefaultViewModelFactories.InternalFactoryFactory get() {
        return newInstance(this.keySetProvider.get(), this.viewModelComponentBuilderProvider.get());
    }

    public static DefaultViewModelFactories_InternalFactoryFactory_Factory create(Provider<Map<Class<?>, Boolean>> keySetProvider, Provider<ViewModelComponentBuilder> viewModelComponentBuilderProvider) {
        return new DefaultViewModelFactories_InternalFactoryFactory_Factory(keySetProvider, viewModelComponentBuilderProvider);
    }

    public static DefaultViewModelFactories.InternalFactoryFactory newInstance(Map<Class<?>, Boolean> keySet, ViewModelComponentBuilder viewModelComponentBuilder) {
        return new DefaultViewModelFactories.InternalFactoryFactory(keySet, viewModelComponentBuilder);
    }
}
