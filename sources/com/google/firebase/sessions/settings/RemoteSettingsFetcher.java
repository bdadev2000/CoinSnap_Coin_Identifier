package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.firebase.sessions.ApplicationInfo;
import d0.b0;
import h0.g;
import h0.l;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String FIREBASE_PLATFORM = "android";

    @NotNull
    private static final String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";

    @NotNull
    private final ApplicationInfo appInfo;

    @NotNull
    private final String baseUrl;

    @NotNull
    private final l blockingDispatcher;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public RemoteSettingsFetcher(@NotNull ApplicationInfo applicationInfo, @NotNull l lVar, @NotNull String str) {
        a.s(applicationInfo, "appInfo");
        a.s(lVar, "blockingDispatcher");
        a.s(str, "baseUrl");
        this.appInfo = applicationInfo;
        this.blockingDispatcher = lVar;
        this.baseUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme(TournamentShareDialogURIBuilder.scheme).authority(this.baseUrl).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    @Nullable
    public Object doConfigFetch(@NotNull Map<String, String> map, @NotNull p pVar, @NotNull p pVar2, @NotNull g gVar) {
        Object G = e.G(gVar, this.blockingDispatcher, new RemoteSettingsFetcher$doConfigFetch$2(this, map, pVar, pVar2, null));
        return G == i0.a.f30806a ? G : b0.f30125a;
    }

    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, l lVar, String str, int i2, k kVar) {
        this(applicationInfo, lVar, (i2 & 4) != 0 ? FIREBASE_SESSIONS_BASE_URL_STRING : str);
    }
}
