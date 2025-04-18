package com.google.firebase.sessions.settings;

import a1.c;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import b1.f0;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import d0.h;
import h0.l;
import i1.a;
import i1.e;
import java.util.regex.Pattern;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class RemoteSettings implements SettingsProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String FORWARD_SLASH_STRING = "/";

    @Deprecated
    @NotNull
    public static final String TAG = "SessionConfigFetcher";

    @NotNull
    private final ApplicationInfo appInfo;

    @NotNull
    private final l backgroundDispatcher;

    @NotNull
    private final CrashlyticsSettingsFetcher configsFetcher;

    @NotNull
    private final a fetchInProgress;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallationsApi;

    @NotNull
    private final h settingsCache$delegate;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public RemoteSettings(@NotNull l lVar, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo applicationInfo, @NotNull CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, @NotNull DataStore<Preferences> dataStore) {
        p0.a.s(lVar, "backgroundDispatcher");
        p0.a.s(firebaseInstallationsApi, "firebaseInstallationsApi");
        p0.a.s(applicationInfo, "appInfo");
        p0.a.s(crashlyticsSettingsFetcher, "configsFetcher");
        p0.a.s(dataStore, "dataStore");
        this.backgroundDispatcher = lVar;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = applicationInfo;
        this.configsFetcher = crashlyticsSettingsFetcher;
        this.settingsCache$delegate = f0.t(new RemoteSettings$settingsCache$2(dataStore));
        this.fetchInProgress = e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsCache getSettingsCache() {
        return (SettingsCache) this.settingsCache$delegate.getValue();
    }

    private final String removeForwardSlashesIn(String str) {
        Pattern compile = Pattern.compile(FORWARD_SLASH_STRING);
        p0.a.r(compile, "compile(...)");
        p0.a.s(str, "input");
        String replaceAll = compile.matcher(str).replaceAll("");
        p0.a.r(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @VisibleForTesting
    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        kotlin.jvm.internal.e.v(p0.a.c(this.backgroundDispatcher), null, 0, new RemoteSettings$clearCachedSettings$1(this, null), 3);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        return getSettingsCache().sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        return getSettingsCache().sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* renamed from: getSessionRestartTimeout-FghU774 */
    public a1.a mo606getSessionRestartTimeoutFghU774() {
        Integer sessionRestartTimeout = getSettingsCache().sessionRestartTimeout();
        if (sessionRestartTimeout == null) {
            return null;
        }
        int i2 = a1.a.d;
        return new a1.a(kotlin.jvm.internal.e.E(sessionRestartTimeout.intValue(), c.d));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00b3, B:28:0x00c1, B:31:0x00c7, B:36:0x008d, B:38:0x0097, B:39:0x00a2), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00b3, B:28:0x00c1, B:31:0x00c7, B:36:0x008d, B:38:0x0097, B:39:0x00a2), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00b3, B:28:0x00c1, B:31:0x00c7, B:36:0x008d, B:38:0x0097, B:39:0x00a2), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00b3, B:28:0x00c1, B:31:0x00c7, B:36:0x008d, B:38:0x0097, B:39:0x00a2), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull h0.g r18) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.updateSettings(h0.g):java.lang.Object");
    }
}
