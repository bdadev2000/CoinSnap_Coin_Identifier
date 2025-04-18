package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import b1.f0;
import b1.z;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import h0.l;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final Qualified<z> backgroundDispatcher;

    @NotNull
    private static final Qualified<z> blockingDispatcher;

    @NotNull
    private static final Qualified<FirebaseApp> firebaseApp;

    @NotNull
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi;

    @NotNull
    private static final Qualified<SessionLifecycleServiceBinder> sessionLifecycleServiceBinder;

    @NotNull
    private static final Qualified<SessionsSettings> sessionsSettings;

    @NotNull
    private static final Qualified<TransportFactory> transportFactory;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        Qualified<FirebaseApp> unqualified = Qualified.unqualified(FirebaseApp.class);
        p0.a.r(unqualified, "unqualified(FirebaseApp::class.java)");
        firebaseApp = unqualified;
        Qualified<FirebaseInstallationsApi> unqualified2 = Qualified.unqualified(FirebaseInstallationsApi.class);
        p0.a.r(unqualified2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = unqualified2;
        Qualified<z> qualified = Qualified.qualified(Background.class, z.class);
        p0.a.r(qualified, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = qualified;
        Qualified<z> qualified2 = Qualified.qualified(Blocking.class, z.class);
        p0.a.r(qualified2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = qualified2;
        Qualified<TransportFactory> unqualified3 = Qualified.unqualified(TransportFactory.class);
        p0.a.r(unqualified3, "unqualified(TransportFactory::class.java)");
        transportFactory = unqualified3;
        Qualified<SessionsSettings> unqualified4 = Qualified.unqualified(SessionsSettings.class);
        p0.a.r(unqualified4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = unqualified4;
        Qualified<SessionLifecycleServiceBinder> unqualified5 = Qualified.unqualified(SessionLifecycleServiceBinder.class);
        p0.a.r(unqualified5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = unqualified5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        p0.a.r(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(sessionsSettings);
        p0.a.r(obj2, "container[sessionsSettings]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        p0.a.r(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(sessionLifecycleServiceBinder);
        p0.a.r(obj4, "container[sessionLifecycleServiceBinder]");
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (l) obj3, (SessionLifecycleServiceBinder) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionGenerator getComponents$lambda$1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionFirelogPublisher getComponents$lambda$2(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        p0.a.r(obj, "container[firebaseApp]");
        FirebaseApp firebaseApp2 = (FirebaseApp) obj;
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        p0.a.r(obj2, "container[firebaseInstallationsApi]");
        FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) obj2;
        Object obj3 = componentContainer.get(sessionsSettings);
        p0.a.r(obj3, "container[sessionsSettings]");
        SessionsSettings sessionsSettings2 = (SessionsSettings) obj3;
        Provider provider = componentContainer.getProvider(transportFactory);
        p0.a.r(provider, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(provider);
        Object obj4 = componentContainer.get(backgroundDispatcher);
        p0.a.r(obj4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl(firebaseApp2, firebaseInstallationsApi2, sessionsSettings2, eventGDTLogger, (l) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionsSettings getComponents$lambda$3(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        p0.a.r(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(blockingDispatcher);
        p0.a.r(obj2, "container[blockingDispatcher]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        p0.a.r(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        p0.a.r(obj4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) obj, (l) obj2, (l) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionDatastore getComponents$lambda$4(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        p0.a.r(applicationContext, "container[firebaseApp].applicationContext");
        Object obj = componentContainer.get(backgroundDispatcher);
        p0.a.r(obj, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(applicationContext, (l) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionLifecycleServiceBinder getComponents$lambda$5(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        p0.a.r(obj, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        Component.Builder name = Component.builder(FirebaseSessions.class).name(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder add = name.add(Dependency.required(qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder add2 = add.add(Dependency.required(qualified2));
        Qualified<z> qualified3 = backgroundDispatcher;
        final int i2 = 0;
        Component build = add2.add(Dependency.required(qualified3)).add(Dependency.required(sessionLifecycleServiceBinder)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions components$lambda$0;
                SessionGenerator components$lambda$1;
                SessionFirelogPublisher components$lambda$2;
                SessionsSettings components$lambda$3;
                SessionDatastore components$lambda$4;
                SessionLifecycleServiceBinder components$lambda$5;
                switch (i2) {
                    case 0:
                        components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
                        return components$lambda$0;
                    case 1:
                        components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
                        return components$lambda$1;
                    case 2:
                        components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(componentContainer);
                        return components$lambda$2;
                    case 3:
                        components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(componentContainer);
                        return components$lambda$3;
                    case 4:
                        components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(componentContainer);
                        return components$lambda$4;
                    default:
                        components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(componentContainer);
                        return components$lambda$5;
                }
            }
        }).eagerInDefaultApp().build();
        final int i3 = 1;
        Component build2 = Component.builder(SessionGenerator.class).name("session-generator").factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions components$lambda$0;
                SessionGenerator components$lambda$1;
                SessionFirelogPublisher components$lambda$2;
                SessionsSettings components$lambda$3;
                SessionDatastore components$lambda$4;
                SessionLifecycleServiceBinder components$lambda$5;
                switch (i3) {
                    case 0:
                        components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
                        return components$lambda$0;
                    case 1:
                        components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
                        return components$lambda$1;
                    case 2:
                        components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(componentContainer);
                        return components$lambda$2;
                    case 3:
                        components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(componentContainer);
                        return components$lambda$3;
                    case 4:
                        components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(componentContainer);
                        return components$lambda$4;
                    default:
                        components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(componentContainer);
                        return components$lambda$5;
                }
            }
        }).build();
        Component.Builder add3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required(qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        final int i4 = 2;
        Component build3 = add3.add(Dependency.required(qualified4)).add(Dependency.required(qualified2)).add(Dependency.requiredProvider(transportFactory)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions components$lambda$0;
                SessionGenerator components$lambda$1;
                SessionFirelogPublisher components$lambda$2;
                SessionsSettings components$lambda$3;
                SessionDatastore components$lambda$4;
                SessionLifecycleServiceBinder components$lambda$5;
                switch (i4) {
                    case 0:
                        components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
                        return components$lambda$0;
                    case 1:
                        components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
                        return components$lambda$1;
                    case 2:
                        components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(componentContainer);
                        return components$lambda$2;
                    case 3:
                        components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(componentContainer);
                        return components$lambda$3;
                    case 4:
                        components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(componentContainer);
                        return components$lambda$4;
                    default:
                        components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(componentContainer);
                        return components$lambda$5;
                }
            }
        }).build();
        final int i5 = 3;
        Component build4 = Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required(qualified)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(qualified3)).add(Dependency.required(qualified4)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions components$lambda$0;
                SessionGenerator components$lambda$1;
                SessionFirelogPublisher components$lambda$2;
                SessionsSettings components$lambda$3;
                SessionDatastore components$lambda$4;
                SessionLifecycleServiceBinder components$lambda$5;
                switch (i5) {
                    case 0:
                        components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
                        return components$lambda$0;
                    case 1:
                        components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
                        return components$lambda$1;
                    case 2:
                        components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(componentContainer);
                        return components$lambda$2;
                    case 3:
                        components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(componentContainer);
                        return components$lambda$3;
                    case 4:
                        components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(componentContainer);
                        return components$lambda$4;
                    default:
                        components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(componentContainer);
                        return components$lambda$5;
                }
            }
        }).build();
        final int i6 = 4;
        Component build5 = Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required(qualified)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions components$lambda$0;
                SessionGenerator components$lambda$1;
                SessionFirelogPublisher components$lambda$2;
                SessionsSettings components$lambda$3;
                SessionDatastore components$lambda$4;
                SessionLifecycleServiceBinder components$lambda$5;
                switch (i6) {
                    case 0:
                        components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
                        return components$lambda$0;
                    case 1:
                        components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
                        return components$lambda$1;
                    case 2:
                        components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(componentContainer);
                        return components$lambda$2;
                    case 3:
                        components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(componentContainer);
                        return components$lambda$3;
                    case 4:
                        components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(componentContainer);
                        return components$lambda$4;
                    default:
                        components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(componentContainer);
                        return components$lambda$5;
                }
            }
        }).build();
        final int i7 = 5;
        return f0.v(build, build2, build3, build4, build5, Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required(qualified)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions components$lambda$0;
                SessionGenerator components$lambda$1;
                SessionFirelogPublisher components$lambda$2;
                SessionsSettings components$lambda$3;
                SessionDatastore components$lambda$4;
                SessionLifecycleServiceBinder components$lambda$5;
                switch (i7) {
                    case 0:
                        components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
                        return components$lambda$0;
                    case 1:
                        components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
                        return components$lambda$1;
                    case 2:
                        components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(componentContainer);
                        return components$lambda$2;
                    case 3:
                        components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(componentContainer);
                        return components$lambda$3;
                    case 4:
                        components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(componentContainer);
                        return components$lambda$4;
                    default:
                        components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(componentContainer);
                        return components$lambda$5;
                }
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
