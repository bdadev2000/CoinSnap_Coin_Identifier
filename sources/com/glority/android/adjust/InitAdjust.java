package com.glority.android.adjust;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adjust.sdk.OnDeviceIdsRead;
import com.adjust.sdk.OnSessionTrackingFailedListener;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.init.InitTask;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.core.utils.mediaSource.MediaSourceUtils;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: InitAdjust.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0017R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/glority/android/adjust/InitAdjust;", "Lcom/glority/android/core/init/InitTask;", "()V", "grade", "", "getGrade", "()I", "preconditions", "", "getPreconditions", "()Ljava/util/List;", "initActivityLifecycle", "", "context", "Landroid/app/Application;", "run", "AdjustObserver", "Companion", "base-adjust_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class InitAdjust implements InitTask {
    public static final String ADJUST_APP_TOKEN = "ADJUST_APP_TOKEN";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // com.glority.android.core.init.InitTask
    public int getGrade() {
        return 2;
    }

    @Override // com.glority.android.core.init.InitTask
    public List<InitTask> getPreconditions() {
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String config = AppContext.INSTANCE.getConfig(ADJUST_APP_TOKEN);
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), com.glority.android.app.BuildConfig.ENV)) {
            str = AdjustConfig.ENVIRONMENT_PRODUCTION;
        } else {
            str = AdjustConfig.ENVIRONMENT_SANDBOX;
        }
        AdjustConfig adjustConfig = new AdjustConfig(AppContext.INSTANCE.peekContext().getApplicationContext(), config, str);
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), com.glority.android.app.BuildConfig.ENV)) {
            adjustConfig.setLogLevel(LogLevel.SUPRESS);
        } else {
            adjustConfig.setLogLevel(LogLevel.VERBOSE);
        }
        adjustConfig.setSendInBackground(true);
        adjustConfig.setOnSessionTrackingSucceededListener(new OnSessionTrackingSucceededListener() { // from class: com.glority.android.adjust.InitAdjust$$ExternalSyntheticLambda0
            @Override // com.adjust.sdk.OnSessionTrackingSucceededListener
            public final void onFinishedSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
                InitAdjust.m7695run$lambda0(adjustSessionSuccess);
            }
        });
        adjustConfig.setOnSessionTrackingFailedListener(new OnSessionTrackingFailedListener() { // from class: com.glority.android.adjust.InitAdjust$$ExternalSyntheticLambda1
            @Override // com.adjust.sdk.OnSessionTrackingFailedListener
            public final void onFinishedSessionTrackingFailed(AdjustSessionFailure adjustSessionFailure) {
                InitAdjust.m7696run$lambda1(adjustSessionFailure);
            }
        });
        final long currentTimeMillis = System.currentTimeMillis();
        adjustConfig.setOnAttributionChangedListener(new OnAttributionChangedListener() { // from class: com.glority.android.adjust.InitAdjust$run$3
            @Override // com.adjust.sdk.OnAttributionChangedListener
            public void onAttributionChanged(AdjustAttribution attribution) {
                double currentTimeMillis2 = (System.currentTimeMillis() - currentTimeMillis) / 1000;
                if (attribution == null) {
                    new LogEventRequest("adjust_init_get_attrs_async_null", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("time", Double.valueOf(currentTimeMillis2)))).post();
                    return;
                }
                InitAdjust.INSTANCE.setMediaSource();
                if (((Boolean) PersistData.INSTANCE.get(PersistKey.HAS_GOT_ADJUST_ATTRIBUTIONS_ASYNC, false)).booleanValue()) {
                    return;
                }
                PersistData.INSTANCE.set(PersistKey.HAS_GOT_ADJUST_ATTRIBUTIONS_ASYNC, true);
                Pair[] pairArr = new Pair[6];
                String str2 = attribution.network;
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[0] = TuplesKt.to("source", str2);
                pairArr[1] = TuplesKt.to("time", Double.valueOf(currentTimeMillis2));
                String str3 = attribution.campaign;
                if (str3 == null) {
                    str3 = "";
                }
                pairArr[2] = TuplesKt.to(LogEventArguments.ARG_STRING_1, str3);
                String str4 = attribution.adgroup;
                if (str4 == null) {
                    str4 = "";
                }
                pairArr[3] = TuplesKt.to(LogEventArguments.ARG_STRING_2, str4);
                String str5 = attribution.creative;
                if (str5 == null) {
                    str5 = "";
                }
                pairArr[4] = TuplesKt.to(LogEventArguments.ARG_STRING_3, str5);
                String str6 = attribution.fbInstallReferrer;
                pairArr[5] = TuplesKt.to("content", str6 != null ? str6 : "");
                new LogEventRequest("adjust_init_get_attrs_async", LogEventArgumentsKt.logEventBundleOf(pairArr)).post();
            }
        });
        Adjust.onCreate(adjustConfig);
        Adjust.onResume();
        Adjust.getGoogleAdId(AppContext.INSTANCE.peekContext().getApplicationContext(), new OnDeviceIdsRead() { // from class: com.glority.android.adjust.InitAdjust$$ExternalSyntheticLambda2
            @Override // com.adjust.sdk.OnDeviceIdsRead
            public final void onGoogleAdIdRead(String str2) {
                InitAdjust.m7697run$lambda2(str2);
            }
        });
        if (AppContext.INSTANCE.peekContext().getApplicationContext() instanceof Application) {
            Context applicationContext = AppContext.INSTANCE.peekContext().getApplicationContext();
            if (applicationContext == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            initActivityLifecycle((Application) applicationContext);
        }
        INSTANCE.setMediaSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: run$lambda-0, reason: not valid java name */
    public static final void m7695run$lambda0(AdjustSessionSuccess adjustSessionSuccess) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new InitAdjust$run$1$1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: run$lambda-1, reason: not valid java name */
    public static final void m7696run$lambda1(AdjustSessionFailure adjustSessionFailure) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new InitAdjust$run$2$1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: run$lambda-2, reason: not valid java name */
    public static final void m7697run$lambda2(String str) {
        Pair[] pairArr = new Pair[1];
        if (str == null) {
            str = "";
        }
        pairArr[0] = TuplesKt.to("id", str);
        new LogEventRequest("adjust_get_adid", BundleKt.bundleOf(pairArr)).post();
    }

    /* compiled from: InitAdjust.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/glority/android/adjust/InitAdjust$Companion;", "", "()V", InitAdjust.ADJUST_APP_TOKEN, "", "setMediaSource", "", "base-adjust_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setMediaSource() {
            AdjustAttribution attribution;
            if (MediaSourceUtils.INSTANCE.getMediaSources().length() == 0 && MediaSourceUtils.INSTANCE.getMediaSourceControlValue() == 0 && (attribution = Adjust.getAttribution()) != null) {
                MediaSourceUtils.INSTANCE.setMediaSourceFrom(2);
                MediaSourceUtils mediaSourceUtils = MediaSourceUtils.INSTANCE;
                String str = attribution.network;
                if (str == null) {
                    str = "";
                }
                mediaSourceUtils.setMediaSources(str);
                MediaSourceUtils mediaSourceUtils2 = MediaSourceUtils.INSTANCE;
                String str2 = attribution.campaign;
                if (str2 == null) {
                    str2 = "";
                }
                mediaSourceUtils2.setCampaign(str2);
                MediaSourceUtils mediaSourceUtils3 = MediaSourceUtils.INSTANCE;
                String str3 = attribution.fbInstallReferrer;
                mediaSourceUtils3.setFbInstallReferrer(str3 != null ? str3 : "");
            }
        }
    }

    private final void initActivityLifecycle(Application context) {
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null || !(!runningAppProcesses.isEmpty())) {
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid && Intrinsics.areEqual(runningAppProcessInfo.processName, context.getPackageName())) {
                context.registerActivityLifecycleCallbacks(new AdjustObserver());
            }
        }
    }

    /* compiled from: InitAdjust.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/glority/android/adjust/InitAdjust$AdjustObserver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "base-adjust_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class AdjustObserver implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LogUtils.i("adjust--------> onActivityCreated");
            InitAdjust.INSTANCE.setMediaSource();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LogUtils.i("adjust--------> onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LogUtils.i("adjust--------> onActivityResumed");
            Adjust.onResume();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LogUtils.i("adjust--------> onActivityPaused");
            InitAdjust.INSTANCE.setMediaSource();
            Adjust.onPause();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LogUtils.i("adjust--------> onActivityStopped");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            LogUtils.i("adjust--------> onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LogUtils.i("adjust--------> onActivityDestroyed");
        }
    }
}
