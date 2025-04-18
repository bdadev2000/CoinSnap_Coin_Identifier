package com.google.firebase.sessions.settings;

import a1.c;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import h0.l;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import p0.a;
import t0.b;
import x0.n;

/* loaded from: classes.dex */
public final class SessionsSettings {

    @NotNull
    private static final String TAG = "SessionsSettings";

    @NotNull
    private final SettingsProvider localOverrideSettings;

    @NotNull
    private final SettingsProvider remoteSettings;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final b dataStore$delegate = PreferenceDataStoreDelegateKt.a(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), new ReplaceFileCorruptionHandler(SessionsSettings$Companion$dataStore$2.INSTANCE));

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ n[] $$delegatedProperties;

        static {
            z zVar = new z(Companion.class);
            g0.f30932a.getClass();
            $$delegatedProperties = new n[]{zVar};
        }

        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore<Preferences> getDataStore(Context context) {
            return (DataStore) SessionsSettings.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        @NotNull
        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            a.r(obj, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) obj;
        }
    }

    public SessionsSettings(@NotNull SettingsProvider settingsProvider, @NotNull SettingsProvider settingsProvider2) {
        a.s(settingsProvider, "localOverrideSettings");
        a.s(settingsProvider2, "remoteSettings");
        this.localOverrideSettings = settingsProvider;
        this.remoteSettings = settingsProvider2;
    }

    private final boolean isValidSamplingRate(double d) {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE <= d && d <= 1.0d;
    }

    /* renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m607isValidSessionRestartTimeoutLRDsOJo(long j2) {
        int i2 = a1.a.d;
        return j2 > 0 && (a1.a.f(j2) ^ true);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double doubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(doubleValue)) {
                return doubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double doubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    /* renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m608getSessionRestartTimeoutUwyO8pc() {
        a1.a mo606getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo606getSessionRestartTimeoutFghU774();
        if (mo606getSessionRestartTimeoutFghU774 != null) {
            long j2 = mo606getSessionRestartTimeoutFghU774.f60a;
            if (m607isValidSessionRestartTimeoutLRDsOJo(j2)) {
                return j2;
            }
        }
        a1.a mo606getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo606getSessionRestartTimeoutFghU774();
        if (mo606getSessionRestartTimeoutFghU7742 != null) {
            long j3 = mo606getSessionRestartTimeoutFghU7742.f60a;
            if (m607isValidSessionRestartTimeoutLRDsOJo(j3)) {
                return j3;
            }
        }
        int i2 = a1.a.d;
        return e.E(30, c.f64f);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull h0.g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.jvm.internal.q.m(r6)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            kotlin.jvm.internal.q.m(r6)
            goto L4b
        L3a:
            kotlin.jvm.internal.q.m(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r2.remoteSettings
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            d0.b0 r6 = d0.b0.f30125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(h0.g):java.lang.Object");
    }

    private SessionsSettings(Context context, l lVar, l lVar2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(lVar2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, lVar, null, 4, null), Companion.getDataStore(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SessionsSettings(@org.jetbrains.annotations.NotNull com.google.firebase.FirebaseApp r8, @org.jetbrains.annotations.NotNull h0.l r9, @org.jetbrains.annotations.NotNull h0.l r10, @org.jetbrains.annotations.NotNull com.google.firebase.installations.FirebaseInstallationsApi r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            p0.a.s(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            p0.a.s(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            p0.a.s(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            p0.a.s(r11, r0)
            android.content.Context r2 = r8.getApplicationContext()
            java.lang.String r0 = "firebaseApp.applicationContext"
            p0.a.r(r2, r0)
            com.google.firebase.sessions.SessionEvents r0 = com.google.firebase.sessions.SessionEvents.INSTANCE
            com.google.firebase.sessions.ApplicationInfo r6 = r0.getApplicationInfo(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.<init>(com.google.firebase.FirebaseApp, h0.l, h0.l, com.google.firebase.installations.FirebaseInstallationsApi):void");
    }
}
