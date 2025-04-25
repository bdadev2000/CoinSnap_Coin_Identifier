package com.glority.app;

import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.HiltWrapper_SavedStateHandleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import javax.inject.Singleton;

/* loaded from: classes4.dex */
public final class MyApplication_HiltComponents {

    @Subcomponent(modules = {HiltWrapper_ActivityModule.class, HiltWrapper_DefaultViewModelFactories_ActivityModule.class, FragmentCBuilderModule.class, ViewCBuilderModule.class})
    /* loaded from: classes4.dex */
    public static abstract class ActivityC implements ActivityComponent, DefaultViewModelFactories.ActivityEntryPoint, HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint, FragmentComponentManager.FragmentComponentBuilderEntryPoint, ViewComponentManager.ViewComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes4.dex */
        interface Builder extends ActivityComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityC.class})
    /* loaded from: classes4.dex */
    interface ActivityCBuilderModule {
        @Binds
        ActivityComponentBuilder bind(ActivityC.Builder builder);
    }

    @Subcomponent(modules = {HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class, HiltWrapper_SavedStateHandleModule.class, ActivityCBuilderModule.class, ViewModelCBuilderModule.class})
    /* loaded from: classes4.dex */
    public static abstract class ActivityRetainedC implements ActivityRetainedComponent, ActivityComponentManager.ActivityComponentBuilderEntryPoint, HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes4.dex */
        interface Builder extends ActivityRetainedComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityRetainedC.class})
    /* loaded from: classes4.dex */
    interface ActivityRetainedCBuilderModule {
        @Binds
        ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
    }

    @Subcomponent(modules = {ViewWithFragmentCBuilderModule.class})
    /* loaded from: classes4.dex */
    public static abstract class FragmentC implements FragmentComponent, DefaultViewModelFactories.FragmentEntryPoint, ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes4.dex */
        interface Builder extends FragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {FragmentC.class})
    /* loaded from: classes4.dex */
    interface FragmentCBuilderModule {
        @Binds
        FragmentComponentBuilder bind(FragmentC.Builder builder);
    }

    @Subcomponent
    /* loaded from: classes4.dex */
    public static abstract class ServiceC implements ServiceComponent, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes4.dex */
        interface Builder extends ServiceComponentBuilder {
        }
    }

    @Module(subcomponents = {ServiceC.class})
    /* loaded from: classes4.dex */
    interface ServiceCBuilderModule {
        @Binds
        ServiceComponentBuilder bind(ServiceC.Builder builder);
    }

    @Component(modules = {ApplicationContextModule.class, HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class, ActivityRetainedCBuilderModule.class, ServiceCBuilderModule.class})
    @Singleton
    /* loaded from: classes4.dex */
    public static abstract class SingletonC implements MyApplication_GeneratedInjector, FragmentGetContextFix.FragmentGetContextFixEntryPoint, HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint, ServiceComponentManager.ServiceComponentBuilderEntryPoint, SingletonComponent, GeneratedComponent {
    }

    @Subcomponent
    /* loaded from: classes4.dex */
    public static abstract class ViewC implements ViewComponent, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes4.dex */
        interface Builder extends ViewComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewC.class})
    /* loaded from: classes4.dex */
    interface ViewCBuilderModule {
        @Binds
        ViewComponentBuilder bind(ViewC.Builder builder);
    }

    @Subcomponent(modules = {HiltWrapper_HiltViewModelFactory_ViewModelModule.class})
    /* loaded from: classes4.dex */
    public static abstract class ViewModelC implements ViewModelComponent, HiltViewModelFactory.ViewModelFactoriesEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes4.dex */
        interface Builder extends ViewModelComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewModelC.class})
    /* loaded from: classes4.dex */
    interface ViewModelCBuilderModule {
        @Binds
        ViewModelComponentBuilder bind(ViewModelC.Builder builder);
    }

    @Subcomponent
    /* loaded from: classes4.dex */
    public static abstract class ViewWithFragmentC implements ViewWithFragmentComponent, GeneratedComponent {

        @Subcomponent.Builder
        /* loaded from: classes4.dex */
        interface Builder extends ViewWithFragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewWithFragmentC.class})
    /* loaded from: classes4.dex */
    interface ViewWithFragmentCBuilderModule {
        @Binds
        ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
    }

    private MyApplication_HiltComponents() {
    }
}
