package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import e0.x;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class SessionEvents {

    @NotNull
    public static final SessionEvents INSTANCE = new SessionEvents();

    @NotNull
    private static final DataEncoder SESSION_EVENT_ENCODER;

    static {
        DataEncoder build = new JsonDataEncoderBuilder().configureWith(AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        p0.a.r(build, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = build;
    }

    private SessionEvents() {
    }

    public static /* synthetic */ SessionEvent buildSession$default(SessionEvents sessionEvents, FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map map, String str, String str2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            map = x.f30219a;
        }
        return sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, map, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? "" : str2);
    }

    private final DataCollectionState toDataCollectionState(SessionSubscriber sessionSubscriber) {
        return sessionSubscriber == null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : sessionSubscriber.isDataCollectionEnabled() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
    }

    @NotNull
    public final SessionEvent buildSession(@NotNull FirebaseApp firebaseApp, @NotNull SessionDetails sessionDetails, @NotNull SessionsSettings sessionsSettings, @NotNull Map<SessionSubscriber.Name, ? extends SessionSubscriber> map, @NotNull String str, @NotNull String str2) {
        p0.a.s(firebaseApp, "firebaseApp");
        p0.a.s(sessionDetails, "sessionDetails");
        p0.a.s(sessionsSettings, "sessionsSettings");
        p0.a.s(map, "subscribers");
        p0.a.s(str, "firebaseInstallationId");
        p0.a.s(str2, "firebaseAuthenticationToken");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(toDataCollectionState(map.get(SessionSubscriber.Name.PERFORMANCE)), toDataCollectionState(map.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.getSamplingRate()), str, str2), getApplicationInfo(firebaseApp));
    }

    @NotNull
    public final ApplicationInfo getApplicationInfo(@NotNull FirebaseApp firebaseApp) {
        String valueOf;
        long longVersionCode;
        p0.a.s(firebaseApp, "firebaseApp");
        Context applicationContext = firebaseApp.getApplicationContext();
        p0.a.r(applicationContext, "firebaseApp.applicationContext");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        String applicationId = firebaseApp.getOptions().getApplicationId();
        p0.a.r(applicationId, "firebaseApp.options.applicationId");
        String str2 = Build.MODEL;
        p0.a.r(str2, "MODEL");
        String str3 = Build.VERSION.RELEASE;
        p0.a.r(str3, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        p0.a.r(packageName, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? str : str4;
        String str6 = Build.MANUFACTURER;
        p0.a.r(str6, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        p0.a.r(applicationContext2, "firebaseApp.applicationContext");
        ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext2);
        Context applicationContext3 = firebaseApp.getApplicationContext();
        p0.a.r(applicationContext3, "firebaseApp.applicationContext");
        return new ApplicationInfo(applicationId, str2, BuildConfig.VERSION_NAME, str3, logEnvironment, new AndroidApplicationInfo(packageName, str5, str, str6, currentProcessDetails, processDetailsProvider.getAppProcessDetails(applicationContext3)));
    }

    @NotNull
    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }
}
