package com.glority.base.utils;

import android.content.Context;
import android.util.Log;
import androidx.core.os.BundleKt;
import androidx.core.os.EnvironmentCompat;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.network.util.HttpState;
import com.glority.utils.stability.LogUtils;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: InstallReferrerUtils.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0006\u0010\u0010\u001a\u00020\u0005J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/base/utils/InstallReferrerUtils;", "", "<init>", "()V", "cacheKey", "", HttpState.TIMEOUT, "", "disconnectCode", "", "eventConnect", "eventDetail", "queryInstallReferrer", "", "context", "Landroid/content/Context;", "getReferrer", "task", "Ljava/util/concurrent/FutureTask;", "Lcom/android/installreferrer/api/InstallReferrerClient;", "installReferrerMap", "name", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class InstallReferrerUtils {
    public static final int $stable = 0;
    public static final InstallReferrerUtils INSTANCE = new InstallReferrerUtils();
    private static final String cacheKey = "user_install_referrer";
    private static final int disconnectCode = -2;
    private static final String eventConnect = "installreferrerclient_connect_click";
    private static final String eventDetail = "installreferrerclient_detail_click";
    private static final long timeout = 5;

    private InstallReferrerUtils() {
    }

    public final void queryInstallReferrer(Context context) {
        String installReferrer;
        if (((String) PersistData.INSTANCE.get(cacheKey, null)) != null || context == null) {
            return;
        }
        try {
            FutureTask<InstallReferrerClient> task = task(context);
            Executors.newSingleThreadExecutor().submit(task);
            InstallReferrerClient installReferrerClient = task.get(5L, TimeUnit.SECONDS);
            try {
                if (installReferrerClient != null) {
                    ReferrerDetails installReferrer2 = installReferrerClient.getInstallReferrer();
                    try {
                        installReferrer = URLDecoder.decode(installReferrer2.getInstallReferrer());
                    } catch (Throwable unused) {
                        installReferrer = installReferrer2.getInstallReferrer();
                    }
                    if (installReferrer == null) {
                        installReferrer = EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    PersistData.INSTANCE.set(cacheKey, installReferrer);
                    Pair[] pairArr = new Pair[7];
                    pairArr[0] = TuplesKt.to("status", "success");
                    String installReferrer3 = installReferrer2.getInstallReferrer();
                    String str = "";
                    if (installReferrer3 == null) {
                        installReferrer3 = "";
                    }
                    pairArr[1] = TuplesKt.to("content", installReferrer3);
                    pairArr[2] = TuplesKt.to(LogEventArguments.ARG_STRING_1, String.valueOf(installReferrer2.getReferrerClickTimestampSeconds()));
                    pairArr[3] = TuplesKt.to(LogEventArguments.ARG_STRING_2, String.valueOf(installReferrer2.getInstallBeginTimestampSeconds()));
                    pairArr[4] = TuplesKt.to(LogEventArguments.ARG_STRING_3, String.valueOf(installReferrer2.getGooglePlayInstantParam()));
                    String installVersion = installReferrer2.getInstallVersion();
                    if (installVersion != null) {
                        str = installVersion;
                    }
                    pairArr[5] = TuplesKt.to(LogEventArguments.ARG_STRING_4, str);
                    pairArr[6] = TuplesKt.to(LogEventArguments.ARG_STRING_5, installReferrerMap(installReferrer));
                    new LogEventRequest(eventDetail, BundleKt.bundleOf(pairArr)).post();
                    installReferrerClient.endConnection();
                } else {
                    new LogEventRequest(eventDetail, BundleKt.bundleOf(TuplesKt.to("status", "failed"))).post();
                    PersistData.INSTANCE.set(cacheKey, "error");
                }
            } catch (Throwable unused2) {
                new LogEventRequest(eventDetail, BundleKt.bundleOf(TuplesKt.to("status", "failed"))).post();
                PersistData.INSTANCE.set(cacheKey, "error");
            }
        } catch (Throwable unused3) {
            new LogEventRequest(eventDetail, BundleKt.bundleOf(TuplesKt.to("status", "failed"))).post();
            PersistData.INSTANCE.set(cacheKey, "error");
        }
    }

    public final String getReferrer() {
        return installReferrerMap((String) PersistData.INSTANCE.get(cacheKey, EnvironmentCompat.MEDIA_UNKNOWN));
    }

    private final FutureTask<InstallReferrerClient> task(final Context context) {
        return new FutureTask<>(new Callable() { // from class: com.glority.base.utils.InstallReferrerUtils$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InstallReferrerClient task$lambda$1;
                task$lambda$1 = InstallReferrerUtils.task$lambda$1(context);
                return task$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InstallReferrerClient task$lambda$1(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        long currentTimeMillis = System.currentTimeMillis();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -3;
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            build.startConnection(new InstallReferrerStateListener() { // from class: com.glority.base.utils.InstallReferrerUtils$task$1$1$1
                /* JADX WARN: Type inference failed for: r0v1, types: [com.android.installreferrer.api.InstallReferrerClient, T] */
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int responseCode) {
                    Ref.IntRef.this.element = responseCode;
                    if (responseCode == 0) {
                        objectRef.element = build;
                    }
                    countDownLatch.countDown();
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    Ref.IntRef.this.element = -2;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            new LogEventRequest(eventConnect, BundleKt.bundleOf(TuplesKt.to("code", String.valueOf(intRef.element)), TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)))).post();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return (InstallReferrerClient) objectRef.element;
    }

    private final String installReferrerMap(String name) {
        Object obj;
        List split$default;
        String str = null;
        if (StringsKt.startsWith$default(name, "utm_source=google-play&utm_medium=organic", false, 2, (Object) null)) {
            return "utm_source=google-play&utm_medium=organic";
        }
        if (StringsKt.startsWith$default(name, "gclid=", false, 2, (Object) null)) {
            return Constants.REFERRER_API_GOOGLE;
        }
        if (StringsKt.startsWith$default(name, "utm_source=apps.facebook.com&utm_campaign=fb4a", false, 2, (Object) null)) {
            return "facebook";
        }
        if (StringsKt.startsWith$default(name, "adjust_external_click_id=E.C.P.C", false, 2, (Object) null)) {
            return "ecpc";
        }
        if (StringsKt.startsWith$default(name, "adjust_external_click_id=unityads", false, 2, (Object) null)) {
            return "unityads";
        }
        if (StringsKt.startsWith$default(name, "utm_source=apps.instagram.com&utm_campaign=ig4a", false, 2, (Object) null)) {
            return "instagram";
        }
        if (!StringsKt.startsWith$default(name, "adjust_reftag=", false, 2, (Object) null)) {
            return name;
        }
        Iterator it = StringsKt.split$default((CharSequence) name, new String[]{"&"}, false, 0, 6, (Object) null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.startsWith$default((String) obj, "utm_source=", false, 2, (Object) null)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null && (split$default = StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null)) != null) {
            str = (String) CollectionsKt.lastOrNull(split$default);
        }
        return str != null ? str : name;
    }
}
