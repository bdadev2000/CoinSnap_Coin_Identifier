package com.glority.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.glority.app.MyApplication_HiltComponents;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class DaggerMyApplication_HiltComponents_SingletonC {
    private DaggerMyApplication_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MyApplication_HiltComponents.SingletonC create() {
        return new Builder().build();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private Builder() {
        }

        @Deprecated
        public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
            Preconditions.checkNotNull(applicationContextModule);
            return this;
        }

        public MyApplication_HiltComponents.SingletonC build() {
            return new SingletonCImpl();
        }
    }

    /* loaded from: classes4.dex */
    private static final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
        private SavedStateHandleHolder savedStateHandleHolder;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public ActivityRetainedCBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
            this.savedStateHandleHolder = (SavedStateHandleHolder) Preconditions.checkNotNull(savedStateHandleHolder);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public MyApplication_HiltComponents.ActivityRetainedC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandleHolder, SavedStateHandleHolder.class);
            return new ActivityRetainedCImpl(this.singletonCImpl, this.savedStateHandleHolder);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public ActivityCBuilder activity(Activity activity) {
            this.activity = (Activity) Preconditions.checkNotNull(activity);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public MyApplication_HiltComponents.ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }
    }

    /* loaded from: classes4.dex */
    private static final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Fragment fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public FragmentCBuilder fragment(Fragment fragment) {
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public MyApplication_HiltComponents.FragmentC build() {
            Preconditions.checkBuilderRequirement(this.fragment, Fragment.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public ViewWithFragmentCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewWithFragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public ViewCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public MyApplication_HiltComponents.ViewC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ViewModelCBuilder implements MyApplication_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private SavedStateHandle savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private ViewModelLifecycle viewModelLifecycle;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(handle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
            this.viewModelLifecycle = (ViewModelLifecycle) Preconditions.checkNotNull(viewModelLifecycle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public MyApplication_HiltComponents.ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.viewModelLifecycle, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle, this.viewModelLifecycle);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public ServiceCBuilder service(Service service) {
            this.service = (Service) Preconditions.checkNotNull(service);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public MyApplication_HiltComponents.ServiceC build() {
            Preconditions.checkBuilderRequirement(this.service, Service.class);
            return new ServiceCImpl(this.singletonCImpl, this.service);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ViewWithFragmentCImpl extends MyApplication_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl;

        private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, View viewParam) {
            this.viewWithFragmentCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class FragmentCImpl extends MyApplication_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;

        private FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, Fragment fragmentParam) {
            this.fragmentCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ViewCImpl extends MyApplication_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewCImpl viewCImpl;

        private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
            this.viewCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
            this.activityCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ImmutableMap.of(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public Map<Class<?>, Boolean> getViewModelKeys() {
            return ImmutableMap.of();
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
        public FragmentComponentBuilder fragmentComponentBuilder() {
            return new FragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
        public ViewComponentBuilder viewComponentBuilder() {
            return new ViewCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ViewModelCImpl extends MyApplication_HiltComponents.ViewModelC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewModelCImpl viewModelCImpl;

        private ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
            this.viewModelCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<Class<?>, Provider<ViewModel>> getHiltViewModelMap() {
            return ImmutableMap.of();
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
            return ImmutableMap.of();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private dagger.internal.Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCImpl(SingletonCImpl singletonCImpl, SavedStateHandleHolder savedStateHandleHolderParam) {
            this.activityRetainedCImpl = this;
            this.singletonCImpl = singletonCImpl;
            initialize(savedStateHandleHolderParam);
        }

        private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
            this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return this.provideActivityRetainedLifecycleProvider.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static final class SwitchingProvider<T> implements dagger.internal.Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;
            private final int id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.id = id;
            }

            @Override // javax.inject.Provider
            public T get() {
                if (this.id == 0) {
                    return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
                }
                throw new AssertionError(this.id);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
        private final ServiceCImpl serviceCImpl;
        private final SingletonCImpl singletonCImpl;

        private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
            this.serviceCImpl = this;
            this.singletonCImpl = singletonCImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SingletonCImpl extends MyApplication_HiltComponents.SingletonC {
        private final SingletonCImpl singletonCImpl;

        @Override // com.glority.app.MyApplication_GeneratedInjector
        public void injectMyApplication(MyApplication arg0) {
        }

        private SingletonCImpl() {
            this.singletonCImpl = this;
        }

        @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
        public Set<Boolean> getDisableFragmentGetContextFix() {
            return ImmutableSet.of();
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
        public ServiceComponentBuilder serviceComponentBuilder() {
            return new ServiceCBuilder(this.singletonCImpl);
        }
    }
}
