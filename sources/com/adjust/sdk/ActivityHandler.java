package com.adjust.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import com.adjust.sdk.network.ActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ActivityHandler implements IActivityHandler {
    private static final String ACTIVITY_STATE_NAME = "Activity state";
    private static final String ATTRIBUTION_NAME = "Attribution";
    private static long BACKGROUND_TIMER_INTERVAL = 0;
    private static final String BACKGROUND_TIMER_NAME = "Background timer";
    private static final String DELAY_START_TIMER_NAME = "Delay Start timer";
    private static long FOREGROUND_TIMER_INTERVAL = 0;
    private static final String FOREGROUND_TIMER_NAME = "Foreground timer";
    private static long FOREGROUND_TIMER_START = 0;
    private static final String SESSION_CALLBACK_PARAMETERS_NAME = "Session Callback parameters";
    private static long SESSION_INTERVAL = 0;
    private static final String SESSION_PARAMETERS_NAME = "Session parameters";
    private static final String SESSION_PARTNER_PARAMETERS_NAME = "Session Partner parameters";
    private static long SUBSESSION_INTERVAL = 0;
    private static final String TIME_TRAVEL = "Time travel!";
    private ActivityState activityState;
    private AdjustConfig adjustConfig;
    private AdjustAttribution attribution;
    private IAttributionHandler attributionHandler;
    private TimerOnce backgroundTimer;
    private String basePath;
    private TimerOnce delayStartTimer;
    private com.adjust.sdk.a deviceInfo;
    private ThreadExecutor executor;
    private TimerCycle foregroundTimer;
    private String gdprPath;
    private InstallReferrer installReferrer;
    private InstallReferrerHuawei installReferrerHuawei;
    private InternalState internalState;
    private ILogger logger;
    private IPackageHandler packageHandler;
    private ISdkClickHandler sdkClickHandler;
    private SessionParameters sessionParameters;
    private String subscriptionPath;

    /* loaded from: classes.dex */
    public class InternalState {
        public boolean background;
        public boolean delayStart;
        public boolean enabled;
        public boolean firstLaunch;
        public boolean firstSdkStart;
        public boolean offline;
        public boolean preinstallHasBeenRead;
        public boolean sessionResponseProcessed;
        public boolean updatePackages;

        public InternalState() {
        }

        public boolean hasFirstSdkStartNotOcurred() {
            return !this.firstSdkStart;
        }

        public boolean hasFirstSdkStartOcurred() {
            return this.firstSdkStart;
        }

        public boolean hasPreinstallBeenRead() {
            return this.preinstallHasBeenRead;
        }

        public boolean hasSessionResponseNotBeenProcessed() {
            return !this.sessionResponseProcessed;
        }

        public boolean isDisabled() {
            return !this.enabled;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public boolean isFirstLaunch() {
            return this.firstLaunch;
        }

        public boolean isInBackground() {
            return this.background;
        }

        public boolean isInDelayedStart() {
            return this.delayStart;
        }

        public boolean isInForeground() {
            return !this.background;
        }

        public boolean isNotFirstLaunch() {
            return !this.firstLaunch;
        }

        public boolean isNotInDelayedStart() {
            return !this.delayStart;
        }

        public boolean isOffline() {
            return this.offline;
        }

        public boolean isOnline() {
            return !this.offline;
        }

        public boolean itHasToUpdatePackages() {
            return this.updatePackages;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendPreinstallReferrerI();
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements IRunActivityHandler {
        public a0() {
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.setEnabledI(ActivityHandler.this.adjustConfig.startEnabled.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ReferrerDetails a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2812b;

        public b(ReferrerDetails referrerDetails, String str) {
            this.a = referrerDetails;
            this.f2812b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendInstallReferrerI(this.a, this.f2812b);
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements Runnable {
        public b0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.foregroundTimerFired();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ EventResponseData a;

        public c(EventResponseData eventResponseData) {
            this.a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchEventResponseTasksI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements Runnable {
        public c0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.backgroundTimerFired();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final /* synthetic */ SdkClickResponseData a;

        public d(SdkClickResponseData sdkClickResponseData) {
            this.a = sdkClickResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchSdkClickResponseTasksI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class d0 implements Runnable {
        public d0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendFirstPackages();
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ SessionResponseData a;

        public e(SessionResponseData sessionResponseData) {
            this.a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchSessionResponseTasksI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements InstallReferrerReadListener {
        public e0() {
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
            ActivityHandler.this.sendInstallReferrer(referrerDetails, str);
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public final /* synthetic */ AttributionResponseData a;

        public f(AttributionResponseData attributionResponseData) {
            this.a = attributionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchAttributionResponseTasksI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class f0 implements InstallReferrerReadListener {
        public f0() {
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
            ActivityHandler.this.sendInstallReferrer(referrerDetails, str);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendFirstPackagesI();
        }
    }

    /* loaded from: classes.dex */
    public class g0 implements Runnable {
        public g0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.stopForegroundTimerI();
            ActivityHandler.this.startBackgroundTimerI();
            ActivityHandler.this.logger.verbose("Subsession end", new Object[0]);
            ActivityHandler.this.endI();
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {
        public final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2818b;

        public h(String str, String str2) {
            this.a = str;
            this.f2818b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.addSessionCallbackParameterI(this.a, this.f2818b);
        }
    }

    /* loaded from: classes.dex */
    public class h0 implements Runnable {
        public h0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (samsungReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2820b;

        public i(String str, String str2) {
            this.a = str;
            this.f2820b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.addSessionPartnerParameterI(this.a, this.f2820b);
        }
    }

    /* loaded from: classes.dex */
    public class i0 implements Runnable {
        public i0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails xiaomiReferrer = Reflection.getXiaomiReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (xiaomiReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(xiaomiReferrer, Constants.REFERRER_API_XIAOMI);
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements Runnable {
        public final /* synthetic */ String a;

        public j(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.removeSessionCallbackParameterI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class j0 implements Runnable {
        public j0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails vivoReferrer = Reflection.getVivoReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (vivoReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(vivoReferrer, Constants.REFERRER_API_VIVO);
            }
        }
    }

    /* loaded from: classes.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.initI();
        }
    }

    /* loaded from: classes.dex */
    public class k0 implements Runnable {
        public final /* synthetic */ EventResponseData a;

        public k0(EventResponseData eventResponseData) {
            this.a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener.onFinishedEventTrackingSucceeded(this.a.getSuccessResponseData());
        }
    }

    /* loaded from: classes.dex */
    public class l implements Runnable {
        public final /* synthetic */ String a;

        public l(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.removeSessionPartnerParameterI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class l0 implements Runnable {
        public final /* synthetic */ EventResponseData a;

        public l0(EventResponseData eventResponseData) {
            this.a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onEventTrackingFailedListener.onFinishedEventTrackingFailed(this.a.getFailureResponseData());
        }
    }

    /* loaded from: classes.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.resetSessionCallbackParametersI();
        }
    }

    /* loaded from: classes.dex */
    public class m0 implements Runnable {
        public final /* synthetic */ SessionResponseData a;

        public m0(SessionResponseData sessionResponseData) {
            this.a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener.onFinishedSessionTrackingSucceeded(this.a.getSuccessResponseData());
        }
    }

    /* loaded from: classes.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.resetSessionPartnerParametersI();
        }
    }

    /* loaded from: classes.dex */
    public class n0 implements Runnable {
        public final /* synthetic */ SessionResponseData a;

        public n0(SessionResponseData sessionResponseData) {
            this.a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener.onFinishedSessionTrackingFailed(this.a.getFailureResponseData());
        }
    }

    /* loaded from: classes.dex */
    public class o implements Runnable {
        public final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2828b;

        public o(boolean z10, String str) {
            this.a = z10;
            this.f2828b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.a) {
                SharedPreferencesManager.getDefaultInstance(ActivityHandler.this.getContext()).savePushToken(this.f2828b);
            }
            if (ActivityHandler.this.internalState.hasFirstSdkStartNotOcurred()) {
                return;
            }
            ActivityHandler.this.setPushTokenI(this.f2828b);
        }
    }

    /* loaded from: classes.dex */
    public class o0 implements Runnable {
        public o0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onAttributionChangedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onAttributionChangedListener.onAttributionChanged(ActivityHandler.this.attribution);
        }
    }

    /* loaded from: classes.dex */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.gdprForgetMeI();
        }
    }

    /* loaded from: classes.dex */
    public class p0 implements Runnable {
        public final /* synthetic */ Uri a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f2830b;

        public p0(Uri uri, Intent intent) {
            this.a = uri;
            this.f2830b = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null) {
                return;
            }
            if (ActivityHandler.this.adjustConfig.onDeeplinkResponseListener != null ? ActivityHandler.this.adjustConfig.onDeeplinkResponseListener.launchReceivedDeeplink(this.a) : true) {
                ActivityHandler.this.launchDeeplinkMain(this.f2830b, this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.disableThirdPartySharingI();
        }
    }

    /* loaded from: classes.dex */
    public class q0 implements Runnable {
        public final /* synthetic */ AdjustEvent a;

        public q0(AdjustEvent adjustEvent) {
            this.a = adjustEvent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.internalState.hasFirstSdkStartNotOcurred()) {
                ActivityHandler.this.logger.warn("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
                ActivityHandler.this.startI();
            }
            ActivityHandler.this.trackEventI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class r implements Runnable {
        public final /* synthetic */ AdjustThirdPartySharing a;

        public r(AdjustThirdPartySharing adjustThirdPartySharing) {
            this.a = adjustThirdPartySharing;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackThirdPartySharingI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class r0 implements Runnable {
        public final /* synthetic */ boolean a;

        public r0(boolean z10) {
            this.a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.setEnabledI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class s implements Runnable {
        public final /* synthetic */ boolean a;

        public s(boolean z10) {
            this.a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackMeasurementConsentI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class s0 implements Runnable {
        public final /* synthetic */ boolean a;

        public s0(boolean z10) {
            this.a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.setOfflineModeI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class t implements Runnable {
        public final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f2837b;

        public t(String str, JSONObject jSONObject) {
            this.a = str;
            this.f2837b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackAdRevenueI(this.a, this.f2837b);
        }
    }

    /* loaded from: classes.dex */
    public class t0 implements Runnable {
        public final /* synthetic */ Uri a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f2839b;

        public t0(Uri uri, long j3) {
            this.a = uri;
            this.f2839b = j3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.readOpenUrlI(this.a, this.f2839b);
        }
    }

    /* loaded from: classes.dex */
    public class u implements Runnable {
        public final /* synthetic */ AdjustAdRevenue a;

        public u(AdjustAdRevenue adjustAdRevenue) {
            this.a = adjustAdRevenue;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackAdRevenueI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class u0 implements Runnable {
        public final /* synthetic */ boolean a;

        public u0(boolean z10) {
            this.a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.setAskingAttributionI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.delayStartI();
            ActivityHandler.this.stopBackgroundTimerI();
            ActivityHandler.this.startForegroundTimerI();
            ActivityHandler.this.logger.verbose("Subsession start", new Object[0]);
            ActivityHandler.this.startI();
        }
    }

    /* loaded from: classes.dex */
    public class v0 implements Runnable {
        public v0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendReftagReferrerI();
        }
    }

    /* loaded from: classes.dex */
    public class w implements Runnable {
        public final /* synthetic */ AdjustPlayStoreSubscription a;

        public w(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
            this.a = adjustPlayStoreSubscription;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.trackSubscriptionI(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.gotOptOutResponseI();
        }
    }

    /* loaded from: classes.dex */
    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.foregroundTimerFiredI();
        }
    }

    /* loaded from: classes.dex */
    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.backgroundTimerFiredI();
        }
    }

    private ActivityHandler(AdjustConfig adjustConfig) {
        init(adjustConfig);
        ILogger logger = AdjustFactory.getLogger();
        this.logger = logger;
        logger.lockLogLevel();
        this.executor = new SingleThreadCachedScheduler("ActivityHandler");
        InternalState internalState = new InternalState();
        this.internalState = internalState;
        Boolean bool = adjustConfig.startEnabled;
        internalState.enabled = bool != null ? bool.booleanValue() : true;
        InternalState internalState2 = this.internalState;
        internalState2.offline = adjustConfig.startOffline;
        internalState2.background = true;
        internalState2.delayStart = false;
        internalState2.updatePackages = false;
        internalState2.sessionResponseProcessed = false;
        internalState2.firstSdkStart = false;
        internalState2.preinstallHasBeenRead = false;
        this.executor.submit(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void backgroundTimerFiredI() {
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
    }

    private boolean checkActivityStateI(ActivityState activityState) {
        if (!this.internalState.hasFirstSdkStartNotOcurred()) {
            return true;
        }
        this.logger.error("Sdk did not yet start", new Object[0]);
        return false;
    }

    private boolean checkAdjustAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        if (adjustAdRevenue == null) {
            this.logger.error("Ad revenue object missing", new Object[0]);
            return false;
        }
        if (adjustAdRevenue.isValid()) {
            return true;
        }
        this.logger.error("Ad revenue object not initialized correctly", new Object[0]);
        return false;
    }

    private void checkAfterNewStartI() {
        checkAfterNewStartI(SharedPreferencesManager.getDefaultInstance(getContext()));
    }

    private void checkAttributionStateI() {
        if (checkActivityStateI(this.activityState)) {
            if (this.internalState.isFirstLaunch() && this.internalState.hasSessionResponseNotBeenProcessed()) {
                return;
            }
            if (this.attribution == null || this.activityState.askingAttribution) {
                this.attributionHandler.getAttribution();
            }
        }
    }

    private boolean checkEventI(AdjustEvent adjustEvent) {
        if (adjustEvent == null) {
            this.logger.error("Event missing", new Object[0]);
            return false;
        }
        if (adjustEvent.isValid()) {
            return true;
        }
        this.logger.error("Event not initialized correctly", new Object[0]);
        return false;
    }

    private void checkForInstallReferrerInfo(SdkClickResponseData sdkClickResponseData) {
        if (sdkClickResponseData.isInstallReferrer) {
            String str = sdkClickResponseData.referrerApi;
            if (str != null && str.equalsIgnoreCase(Constants.REFERRER_API_HUAWEI_ADS)) {
                ActivityState activityState = this.activityState;
                activityState.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState.installReferrerHuawei = sdkClickResponseData.installReferrer;
            } else {
                String str2 = sdkClickResponseData.referrerApi;
                if (str2 != null && str2.equalsIgnoreCase(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
                    ActivityState activityState2 = this.activityState;
                    activityState2.clickTimeHuawei = sdkClickResponseData.clickTime;
                    activityState2.installBeginHuawei = sdkClickResponseData.installBegin;
                    activityState2.installReferrerHuaweiAppGallery = sdkClickResponseData.installReferrer;
                } else {
                    String str3 = sdkClickResponseData.referrerApi;
                    if (str3 != null && str3.equalsIgnoreCase(Constants.REFERRER_API_SAMSUNG)) {
                        ActivityState activityState3 = this.activityState;
                        activityState3.clickTimeSamsung = sdkClickResponseData.clickTime;
                        activityState3.installBeginSamsung = sdkClickResponseData.installBegin;
                        activityState3.installReferrerSamsung = sdkClickResponseData.installReferrer;
                    } else {
                        String str4 = sdkClickResponseData.referrerApi;
                        if (str4 != null && str4.equalsIgnoreCase(Constants.REFERRER_API_XIAOMI)) {
                            ActivityState activityState4 = this.activityState;
                            activityState4.clickTimeXiaomi = sdkClickResponseData.clickTime;
                            activityState4.installBeginXiaomi = sdkClickResponseData.installBegin;
                            activityState4.installReferrerXiaomi = sdkClickResponseData.installReferrer;
                            activityState4.clickTimeServerXiaomi = sdkClickResponseData.clickTimeServer;
                            activityState4.installBeginServerXiaomi = sdkClickResponseData.installBeginServer;
                            activityState4.installVersionXiaomi = sdkClickResponseData.installVersion;
                        } else {
                            String str5 = sdkClickResponseData.referrerApi;
                            boolean z10 = str5 != null && str5.equalsIgnoreCase(Constants.REFERRER_API_VIVO);
                            ActivityState activityState5 = this.activityState;
                            if (z10) {
                                activityState5.clickTimeVivo = sdkClickResponseData.clickTime;
                                activityState5.installBeginVivo = sdkClickResponseData.installBegin;
                                activityState5.installReferrerVivo = sdkClickResponseData.installReferrer;
                                activityState5.installVersionVivo = sdkClickResponseData.installVersion;
                            } else {
                                activityState5.clickTime = sdkClickResponseData.clickTime;
                                activityState5.installBegin = sdkClickResponseData.installBegin;
                                activityState5.installReferrer = sdkClickResponseData.installReferrer;
                                activityState5.clickTimeServer = sdkClickResponseData.clickTimeServer;
                                activityState5.installBeginServer = sdkClickResponseData.installBeginServer;
                                activityState5.installVersion = sdkClickResponseData.installVersion;
                                activityState5.googlePlayInstant = sdkClickResponseData.googlePlayInstant;
                            }
                        }
                    }
                }
            }
            writeActivityStateI();
        }
    }

    private void checkForPreinstallI() {
        ActivityState activityState = this.activityState;
        if (activityState == null || !activityState.enabled || activityState.isGdprForgotten) {
            return;
        }
        sendPreinstallReferrerI();
        if (this.adjustConfig.preinstallTrackingEnabled && !this.internalState.hasPreinstallBeenRead()) {
            String str = this.deviceInfo.f2878i;
            if (str == null || str.isEmpty()) {
                this.logger.debug("Can't read preinstall payload, invalid package name", new Object[0]);
                return;
            }
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            long preinstallPayloadReadStatus = defaultInstance.getPreinstallPayloadReadStatus();
            if (PreinstallUtil.hasAllLocationsBeenRead(preinstallPayloadReadStatus)) {
                this.internalState.preinstallHasBeenRead = true;
                return;
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus)) {
                String payloadFromSystemProperty = PreinstallUtil.getPayloadFromSystemProperty(this.deviceInfo.f2878i, this.logger);
                if (payloadFromSystemProperty == null || payloadFromSystemProperty.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemProperty, Constants.SYSTEM_PROPERTIES);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyReflection = PreinstallUtil.getPayloadFromSystemPropertyReflection(this.deviceInfo.f2878i, this.logger);
                if (payloadFromSystemPropertyReflection == null || payloadFromSystemPropertyReflection.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyReflection, Constants.SYSTEM_PROPERTIES_REFLECTION);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyFilePath = PreinstallUtil.getPayloadFromSystemPropertyFilePath(this.deviceInfo.f2878i, this.logger);
                if (payloadFromSystemPropertyFilePath == null || payloadFromSystemPropertyFilePath.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePath, Constants.SYSTEM_PROPERTIES_PATH);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyFilePathReflection = PreinstallUtil.getPayloadFromSystemPropertyFilePathReflection(this.deviceInfo.f2878i, this.logger);
                if (payloadFromSystemPropertyFilePathReflection == null || payloadFromSystemPropertyFilePathReflection.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePathReflection, Constants.SYSTEM_PROPERTIES_PATH_REFLECTION);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus)) {
                String payloadFromContentProviderDefault = PreinstallUtil.getPayloadFromContentProviderDefault(this.adjustConfig.context, this.deviceInfo.f2878i, this.logger);
                if (payloadFromContentProviderDefault == null || payloadFromContentProviderDefault.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromContentProviderDefault, Constants.CONTENT_PROVIDER);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus)) {
                List<String> payloadsFromContentProviderIntentAction = PreinstallUtil.getPayloadsFromContentProviderIntentAction(this.adjustConfig.context, this.deviceInfo.f2878i, this.logger);
                if (payloadsFromContentProviderIntentAction == null || payloadsFromContentProviderIntentAction.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus);
                } else {
                    Iterator<String> it = payloadsFromContentProviderIntentAction.iterator();
                    while (it.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it.next(), Constants.CONTENT_PROVIDER_INTENT_ACTION);
                    }
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus)) {
                List<String> payloadsFromContentProviderNoPermission = PreinstallUtil.getPayloadsFromContentProviderNoPermission(this.adjustConfig.context, this.deviceInfo.f2878i, this.logger);
                if (payloadsFromContentProviderNoPermission == null || payloadsFromContentProviderNoPermission.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus);
                } else {
                    Iterator<String> it2 = payloadsFromContentProviderNoPermission.iterator();
                    while (it2.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it2.next(), Constants.CONTENT_PROVIDER_NO_PERMISSION);
                    }
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.FILE_SYSTEM, preinstallPayloadReadStatus)) {
                String payloadFromFileSystem = PreinstallUtil.getPayloadFromFileSystem(this.deviceInfo.f2878i, this.adjustConfig.preinstallFilePath, this.logger);
                if (payloadFromFileSystem == null || payloadFromFileSystem.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.FILE_SYSTEM, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromFileSystem, Constants.FILE_SYSTEM);
                }
            }
            defaultInstance.setPreinstallPayloadReadStatus(preinstallPayloadReadStatus);
            this.internalState.preinstallHasBeenRead = true;
        }
    }

    private boolean checkOrderIdI(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.activityState.findOrderId(str)) {
                this.logger.info("Skipping duplicated order ID '%s'", str);
                return false;
            }
            this.activityState.addOrderId(str);
            this.logger.verbose("Added order ID '%s'", str);
        }
        return true;
    }

    private Intent createDeeplinkIntentI(Uri uri) {
        Intent intent;
        if (this.adjustConfig.deepLinkComponent == null) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            AdjustConfig adjustConfig = this.adjustConfig;
            intent = new Intent("android.intent.action.VIEW", uri, adjustConfig.context, adjustConfig.deepLinkComponent);
        }
        intent.setFlags(268435456);
        intent.setPackage(this.adjustConfig.context.getPackageName());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayStartI() {
        if (this.internalState.isNotInDelayedStart() || isToUpdatePackagesI()) {
            return;
        }
        Double d10 = this.adjustConfig.delayStart;
        double doubleValue = d10 != null ? d10.doubleValue() : 0.0d;
        long maxDelayStart = AdjustFactory.getMaxDelayStart();
        long j3 = (long) (1000.0d * doubleValue);
        if (j3 > maxDelayStart) {
            double d11 = maxDelayStart / 1000;
            DecimalFormat decimalFormat = Util.SecondsDisplayFormat;
            this.logger.warn("Delay start of %s seconds bigger than max allowed value of %s seconds", decimalFormat.format(doubleValue), decimalFormat.format(d11));
            doubleValue = d11;
        } else {
            maxDelayStart = j3;
        }
        this.logger.info("Waiting %s seconds before starting first session", Util.SecondsDisplayFormat.format(doubleValue));
        this.delayStartTimer.startIn(maxDelayStart);
        this.internalState.updatePackages = true;
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.updatePackages = true;
            writeActivityStateI();
        }
    }

    public static boolean deleteActivityState(Context context) {
        return context.deleteFile(Constants.ACTIVITY_STATE_FILENAME);
    }

    public static boolean deleteAttribution(Context context) {
        return context.deleteFile(Constants.ATTRIBUTION_FILENAME);
    }

    public static boolean deleteSessionCallbackParameters(Context context) {
        return context.deleteFile(Constants.SESSION_CALLBACK_PARAMETERS_FILENAME);
    }

    public static boolean deleteSessionPartnerParameters(Context context) {
        return context.deleteFile(Constants.SESSION_PARTNER_PARAMETERS_FILENAME);
    }

    public static void deleteState(Context context) {
        deleteActivityState(context);
        deleteAttribution(context);
        deleteSessionCallbackParameters(context);
        deleteSessionPartnerParameters(context);
        SharedPreferencesManager.getDefaultInstance(context).clear();
    }

    private void disableThirdPartySharingForCoppaEnabledI() {
        if (shouldDisableThirdPartySharingWhenCoppaEnabled()) {
            this.activityState.isThirdPartySharingDisabledForCoppa = true;
            writeActivityStateI();
            ActivityPackage buildThirdPartySharingPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildThirdPartySharingPackage(new AdjustThirdPartySharing(Boolean.FALSE));
            this.packageHandler.addPackage(buildThirdPartySharingPackage);
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildThirdPartySharingPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disableThirdPartySharingI() {
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
        defaultInstance.setDisableThirdPartySharing();
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten || activityState.isThirdPartySharingDisabled) {
                return;
            }
            if (this.adjustConfig.coppaCompliantEnabled) {
                this.logger.warn("Call to disable third party sharing API ignored, already done when COPPA enabled", new Object[0]);
                return;
            }
            activityState.isThirdPartySharingDisabled = true;
            writeActivityStateI();
            ActivityPackage buildDisableThirdPartySharingPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildDisableThirdPartySharingPackage();
            this.packageHandler.addPackage(buildDisableThirdPartySharingPackage);
            defaultInstance.removeDisableThirdPartySharing();
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildDisableThirdPartySharingPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endI() {
        if (!toSendI()) {
            pauseSendingI();
        }
        if (updateActivityStateI(System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void foregroundTimerFiredI() {
        if (!isEnabledI()) {
            stopForegroundTimerI();
            return;
        }
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
        if (updateActivityStateI(System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gdprForgetMeI() {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten) {
                return;
            }
            activityState.isGdprForgotten = true;
            writeActivityStateI();
            ActivityPackage buildGdprPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildGdprPackage();
            this.packageHandler.addPackage(buildGdprPackage);
            SharedPreferencesManager.getDefaultInstance(getContext()).removeGdprForgetMe();
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildGdprPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
        }
    }

    public static ActivityHandler getInstance(AdjustConfig adjustConfig) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
            return null;
        }
        if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        }
        if (adjustConfig.processName != null) {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) adjustConfig.context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (!next.processName.equalsIgnoreCase(adjustConfig.processName)) {
                            AdjustFactory.getLogger().info("Skipping initialization in background process (%s)", next.processName);
                            return null;
                        }
                    }
                }
            } else {
                return null;
            }
        }
        return new ActivityHandler(adjustConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotOptOutResponseI() {
        this.activityState.isGdprForgotten = true;
        writeActivityStateI();
        this.packageHandler.flush();
        setEnabledI(false);
    }

    private boolean hasChangedStateI(boolean z10, boolean z11, String str, String str2) {
        if (z10 != z11) {
            return true;
        }
        if (z10) {
            this.logger.debug(str, new Object[0]);
        } else {
            this.logger.debug(str2, new Object[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initI() {
        String pushToken;
        Double d10;
        SESSION_INTERVAL = AdjustFactory.getSessionInterval();
        SUBSESSION_INTERVAL = AdjustFactory.getSubsessionInterval();
        FOREGROUND_TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        FOREGROUND_TIMER_START = AdjustFactory.getTimerStart();
        BACKGROUND_TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        readAttributionI(this.adjustConfig.context);
        readActivityStateI(this.adjustConfig.context);
        this.sessionParameters = new SessionParameters();
        readSessionCallbackParametersI(this.adjustConfig.context);
        readSessionPartnerParametersI(this.adjustConfig.context);
        AdjustConfig adjustConfig = this.adjustConfig;
        if (adjustConfig.startEnabled != null) {
            adjustConfig.preLaunchActions.preLaunchActionsArray.add(new a0());
        }
        if (this.internalState.hasFirstSdkStartOcurred()) {
            InternalState internalState = this.internalState;
            ActivityState activityState = this.activityState;
            internalState.enabled = activityState.enabled;
            internalState.updatePackages = activityState.updatePackages;
            internalState.firstLaunch = false;
        } else {
            this.internalState.firstLaunch = true;
        }
        readConfigFile(this.adjustConfig.context);
        AdjustConfig adjustConfig2 = this.adjustConfig;
        this.deviceInfo = new com.adjust.sdk.a(adjustConfig2.context, adjustConfig2.sdkPrefix);
        if (this.adjustConfig.eventBufferingEnabled) {
            this.logger.info("Event buffering is enabled", new Object[0]);
        }
        this.deviceInfo.b(this.adjustConfig);
        if (this.deviceInfo.a == null) {
            if (Util.canReadPlayIds(this.adjustConfig)) {
                this.logger.warn("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
            } else {
                if (this.adjustConfig.coppaCompliantEnabled) {
                    this.logger.info("Cannot read Google Play Services Advertising ID with COPPA enabled", new Object[0]);
                }
                if (this.adjustConfig.playStoreKidsAppEnabled) {
                    this.logger.info("Cannot read Google Play Services Advertising ID with play store kids app enabled", new Object[0]);
                }
            }
            if (this.deviceInfo.f2875f == null) {
                if (Util.canReadNonPlayIds(this.adjustConfig)) {
                    this.logger.error("Unable to get any Device IDs. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
                } else {
                    if (this.adjustConfig.coppaCompliantEnabled) {
                        this.logger.info("Cannot read non Play IDs with COPPA enabled", new Object[0]);
                    }
                    if (this.adjustConfig.playStoreKidsAppEnabled) {
                        this.logger.info("Cannot read non Play IDs with play store kids app enabled", new Object[0]);
                    }
                }
            }
        } else {
            this.logger.info("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        String str = this.adjustConfig.defaultTracker;
        if (str != null) {
            this.logger.info("Default tracker: '%s'", str);
        }
        String str2 = this.adjustConfig.pushToken;
        if (str2 != null) {
            this.logger.info("Push token: '%s'", str2);
            if (this.internalState.hasFirstSdkStartOcurred()) {
                setPushToken(this.adjustConfig.pushToken, false);
            } else {
                SharedPreferencesManager.getDefaultInstance(getContext()).savePushToken(this.adjustConfig.pushToken);
            }
        } else if (this.internalState.hasFirstSdkStartOcurred() && (pushToken = SharedPreferencesManager.getDefaultInstance(getContext()).getPushToken()) != null) {
            setPushToken(pushToken, true);
        }
        if (this.internalState.hasFirstSdkStartOcurred()) {
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            if (defaultInstance.getGdprForgetMe()) {
                gdprForgetMe();
            } else {
                if (defaultInstance.getDisableThirdPartySharing()) {
                    disableThirdPartySharing();
                }
                Iterator<AdjustThirdPartySharing> it = this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.iterator();
                while (it.hasNext()) {
                    trackThirdPartySharing(it.next());
                }
                Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
                if (bool != null) {
                    trackMeasurementConsent(bool.booleanValue());
                }
                this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new ArrayList();
                this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
            }
        }
        this.foregroundTimer = new TimerCycle(new b0(), FOREGROUND_TIMER_START, FOREGROUND_TIMER_INTERVAL, FOREGROUND_TIMER_NAME);
        if (this.adjustConfig.sendInBackground) {
            this.logger.info("Send in background configured", new Object[0]);
            this.backgroundTimer = new TimerOnce(new c0(), BACKGROUND_TIMER_NAME);
        }
        if (this.internalState.hasFirstSdkStartNotOcurred() && (d10 = this.adjustConfig.delayStart) != null && d10.doubleValue() > 0.0d) {
            this.logger.info("Delay start configured", new Object[0]);
            this.internalState.delayStart = true;
            this.delayStartTimer = new TimerOnce(new d0(), DELAY_START_TIMER_NAME);
        }
        UtilNetworking.setUserAgent(this.adjustConfig.userAgent);
        AdjustConfig adjustConfig3 = this.adjustConfig;
        this.packageHandler = AdjustFactory.getPackageHandler(this, this.adjustConfig.context, toSendI(false), new ActivityPackageSender(adjustConfig3.urlStrategy, adjustConfig3.basePath, adjustConfig3.gdprPath, adjustConfig3.subscriptionPath, this.deviceInfo.f2877h));
        AdjustConfig adjustConfig4 = this.adjustConfig;
        this.attributionHandler = AdjustFactory.getAttributionHandler(this, toSendI(false), new ActivityPackageSender(adjustConfig4.urlStrategy, adjustConfig4.basePath, adjustConfig4.gdprPath, adjustConfig4.subscriptionPath, this.deviceInfo.f2877h));
        AdjustConfig adjustConfig5 = this.adjustConfig;
        this.sdkClickHandler = AdjustFactory.getSdkClickHandler(this, toSendI(true), new ActivityPackageSender(adjustConfig5.urlStrategy, adjustConfig5.basePath, adjustConfig5.gdprPath, adjustConfig5.subscriptionPath, this.deviceInfo.f2877h));
        if (isToUpdatePackagesI()) {
            updatePackagesI();
        }
        this.installReferrer = new InstallReferrer(this.adjustConfig.context, new e0());
        this.installReferrerHuawei = new InstallReferrerHuawei(this.adjustConfig.context, new f0());
        preLaunchActionsI(this.adjustConfig.preLaunchActions.preLaunchActionsArray);
        sendReftagReferrerI();
    }

    private boolean isEnabledI() {
        ActivityState activityState = this.activityState;
        return activityState != null ? activityState.enabled : this.internalState.isEnabled();
    }

    private boolean isToUpdatePackagesI() {
        ActivityState activityState = this.activityState;
        return activityState != null ? activityState.updatePackages : this.internalState.itHasToUpdatePackages();
    }

    private boolean isValidReferrerDetails(ReferrerDetails referrerDetails) {
        String str;
        return (referrerDetails == null || (str = referrerDetails.installReferrer) == null || str.length() == 0) ? false : true;
    }

    private void launchAttributionListenerI(Handler handler) {
        if (this.adjustConfig.onAttributionChangedListener == null) {
            return;
        }
        handler.post(new o0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchAttributionResponseTasksI(AttributionResponseData attributionResponseData) {
        updateAdidI(attributionResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(attributionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        prepareDeeplinkI(attributionResponseData.deeplink, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchDeeplinkMain(Intent intent, Uri uri) {
        if (!(this.adjustConfig.context.getPackageManager().queryIntentActivities(intent, 0).size() > 0)) {
            this.logger.error("Unable to open deferred deep link (%s)", uri);
        } else {
            this.logger.info("Open deferred deep link (%s)", uri);
            this.adjustConfig.context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchEventResponseTasksI(EventResponseData eventResponseData) {
        Runnable l0Var;
        updateAdidI(eventResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        boolean z10 = eventResponseData.success;
        if (z10 && this.adjustConfig.onEventTrackingSucceededListener != null) {
            this.logger.debug("Launching success event tracking listener", new Object[0]);
            l0Var = new k0(eventResponseData);
        } else {
            if (z10 || this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed event tracking listener", new Object[0]);
            l0Var = new l0(eventResponseData);
        }
        handler.post(l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSdkClickResponseTasksI(SdkClickResponseData sdkClickResponseData) {
        updateAdidI(sdkClickResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sdkClickResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
    }

    private void launchSessionResponseListenerI(SessionResponseData sessionResponseData, Handler handler) {
        Runnable n0Var;
        boolean z10 = sessionResponseData.success;
        if (z10 && this.adjustConfig.onSessionTrackingSucceededListener != null) {
            this.logger.debug("Launching success session tracking listener", new Object[0]);
            n0Var = new m0(sessionResponseData);
        } else {
            if (z10 || this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed session tracking listener", new Object[0]);
            n0Var = new n0(sessionResponseData);
        }
        handler.post(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSessionResponseTasksI(SessionResponseData sessionResponseData) {
        this.logger.debug("Launching SessionResponse tasks", new Object[0]);
        updateAdidI(sessionResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sessionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (this.attribution == null && !this.activityState.askingAttribution) {
            this.attributionHandler.getAttribution();
        }
        if (sessionResponseData.success) {
            SharedPreferencesManager.getDefaultInstance(getContext()).setInstallTracked();
        }
        launchSessionResponseListenerI(sessionResponseData, handler);
        this.internalState.sessionResponseProcessed = true;
    }

    private void pauseSendingI() {
        this.attributionHandler.pauseSending();
        this.packageHandler.pauseSending();
        if (toSendI(true)) {
            this.sdkClickHandler.resumeSending();
        } else {
            this.sdkClickHandler.pauseSending();
        }
    }

    private boolean pausedI() {
        return pausedI(false);
    }

    private void preLaunchActionsI(List<IRunActivityHandler> list) {
        if (list == null) {
            return;
        }
        Iterator<IRunActivityHandler> it = list.iterator();
        while (it.hasNext()) {
            it.next().run(this);
        }
    }

    private void prepareDeeplinkI(Uri uri, Handler handler) {
        if (uri == null) {
            return;
        }
        this.logger.info("Deferred deeplink received (%s)", uri);
        handler.post(new p0(uri, createDeeplinkIntentI(uri)));
    }

    private void processCachedDeeplinkI() {
        if (checkActivityStateI(this.activityState)) {
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            String deeplinkUrl = defaultInstance.getDeeplinkUrl();
            long deeplinkClickTime = defaultInstance.getDeeplinkClickTime();
            if (deeplinkUrl == null || deeplinkClickTime == -1) {
                return;
            }
            readOpenUrl(Uri.parse(deeplinkUrl), deeplinkClickTime);
            defaultInstance.removeDeeplink();
        }
    }

    private void processCoppaComplianceI() {
        if (this.adjustConfig.coppaCompliantEnabled) {
            disableThirdPartySharingForCoppaEnabledI();
        } else {
            resetThirdPartySharingCoppaActivityStateI();
        }
    }

    private void processSessionI() {
        if (this.activityState.isGdprForgotten) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ActivityState activityState = this.activityState;
        long j3 = currentTimeMillis - activityState.lastActivity;
        if (j3 < 0) {
            this.logger.error(TIME_TRAVEL, new Object[0]);
            this.activityState.lastActivity = currentTimeMillis;
            writeActivityStateI();
            return;
        }
        if (j3 > SESSION_INTERVAL) {
            trackNewSessionI(currentTimeMillis);
            checkAfterNewStartI();
            return;
        }
        if (j3 <= SUBSESSION_INTERVAL) {
            this.logger.verbose("Time span since last activity too short for a new subsession", new Object[0]);
            return;
        }
        int i10 = activityState.subsessionCount + 1;
        activityState.subsessionCount = i10;
        activityState.sessionLength += j3;
        activityState.lastActivity = currentTimeMillis;
        this.logger.verbose("Started subsession %d of session %d", Integer.valueOf(i10), Integer.valueOf(this.activityState.sessionCount));
        writeActivityStateI();
        checkForPreinstallI();
        this.installReferrer.startConnection();
        this.installReferrerHuawei.readReferrer();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
    }

    private void readActivityStateI(Context context) {
        try {
            this.activityState = (ActivityState) Util.readObject(context, Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME, ActivityState.class);
        } catch (Exception e2) {
            this.logger.error("Failed to read %s file (%s)", ACTIVITY_STATE_NAME, e2.getMessage());
            this.activityState = null;
        }
        if (this.activityState != null) {
            this.internalState.firstSdkStart = true;
        }
    }

    private void readAttributionI(Context context) {
        try {
            this.attribution = (AdjustAttribution) Util.readObject(context, Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME, AdjustAttribution.class);
        } catch (Exception e2) {
            this.logger.error("Failed to read %s file (%s)", ATTRIBUTION_NAME, e2.getMessage());
            this.attribution = null;
        }
    }

    private void readConfigFile(Context context) {
        try {
            InputStream open = context.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            this.logger.verbose("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.adjustConfig.defaultTracker = property;
            }
        } catch (Exception e2) {
            this.logger.debug("%s file not found in this app", e2.getMessage());
        }
    }

    private void readInstallReferrerSamsung() {
        this.executor.submit(new h0());
    }

    private void readInstallReferrerVivo() {
        this.executor.submit(new j0());
    }

    private void readInstallReferrerXiaomi() {
        this.executor.submit(new i0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readOpenUrlI(Uri uri, long j3) {
        if (isEnabledI()) {
            if (!Util.isUrlFilteredOut(uri)) {
                ActivityPackage buildDeeplinkSdkClickPackage = PackageFactory.buildDeeplinkSdkClickPackage(uri, j3, this.activityState, this.adjustConfig, this.deviceInfo, this.sessionParameters);
                if (buildDeeplinkSdkClickPackage == null) {
                    return;
                }
                this.sdkClickHandler.sendSdkClick(buildDeeplinkSdkClickPackage);
                return;
            }
            this.logger.debug("Deep link (" + uri.toString() + ") processing skipped", new Object[0]);
        }
    }

    private void readSessionCallbackParametersI(Context context) {
        try {
            this.sessionParameters.callbackParameters = (Map) Util.readObject(context, Constants.SESSION_CALLBACK_PARAMETERS_FILENAME, SESSION_CALLBACK_PARAMETERS_NAME, Map.class);
        } catch (Exception e2) {
            this.logger.error("Failed to read %s file (%s)", SESSION_CALLBACK_PARAMETERS_NAME, e2.getMessage());
            this.sessionParameters.callbackParameters = null;
        }
    }

    private void readSessionPartnerParametersI(Context context) {
        try {
            this.sessionParameters.partnerParameters = (Map) Util.readObject(context, Constants.SESSION_PARTNER_PARAMETERS_FILENAME, SESSION_PARTNER_PARAMETERS_NAME, Map.class);
        } catch (Exception e2) {
            this.logger.error("Failed to read %s file (%s)", SESSION_PARTNER_PARAMETERS_NAME, e2.getMessage());
            this.sessionParameters.partnerParameters = null;
        }
    }

    private void resetThirdPartySharingCoppaActivityStateI() {
        ActivityState activityState = this.activityState;
        if (activityState != null && activityState.isThirdPartySharingDisabledForCoppa) {
            activityState.isThirdPartySharingDisabledForCoppa = false;
            writeActivityStateI();
        }
    }

    private void resumeSendingI() {
        this.attributionHandler.resumeSending();
        this.packageHandler.resumeSending();
        this.sdkClickHandler.resumeSending();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFirstPackagesI() {
        if (this.internalState.isNotInDelayedStart()) {
            this.logger.info("Start delay expired or never configured", new Object[0]);
            return;
        }
        updatePackagesI();
        this.internalState.delayStart = false;
        this.delayStartTimer.cancel();
        this.delayStartTimer = null;
        updateHandlersStatusAndSendI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInstallReferrerI(ReferrerDetails referrerDetails, String str) {
        if (isEnabledI() && isValidReferrerDetails(referrerDetails) && !Util.isEqualReferrerDetails(referrerDetails, str, this.activityState)) {
            this.sdkClickHandler.sendSdkClick(PackageFactory.buildInstallReferrerSdkClickPackage(referrerDetails, str, this.activityState, this.adjustConfig, this.deviceInfo, this.sessionParameters));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPreinstallReferrerI() {
        String preinstallReferrer;
        if (!isEnabledI() || this.internalState.hasFirstSdkStartNotOcurred() || (preinstallReferrer = SharedPreferencesManager.getDefaultInstance(getContext()).getPreinstallReferrer()) == null || preinstallReferrer.isEmpty()) {
            return;
        }
        this.sdkClickHandler.sendPreinstallPayload(preinstallReferrer, Constants.SYSTEM_INSTALLER_REFERRER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReftagReferrerI() {
        if (isEnabledI() && !this.internalState.hasFirstSdkStartNotOcurred()) {
            this.sdkClickHandler.sendReftagReferrers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAskingAttributionI(boolean z10) {
        this.activityState.askingAttribution = z10;
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledI(boolean z10) {
        ActivityState activityState;
        if (hasChangedStateI(isEnabledI(), z10, "Adjust already enabled", "Adjust already disabled")) {
            if (z10 && (activityState = this.activityState) != null && activityState.isGdprForgotten) {
                this.logger.error("Re-enabling SDK not possible for forgotten user", new Object[0]);
                return;
            }
            InternalState internalState = this.internalState;
            internalState.enabled = z10;
            if (internalState.hasFirstSdkStartNotOcurred()) {
                updateStatusI(!z10, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                return;
            }
            this.activityState.enabled = z10;
            writeActivityStateI();
            if (z10) {
                SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
                if (defaultInstance.getGdprForgetMe()) {
                    gdprForgetMeI();
                } else {
                    processCoppaComplianceI();
                    if (defaultInstance.getDisableThirdPartySharing()) {
                        disableThirdPartySharingI();
                    }
                    Iterator<AdjustThirdPartySharing> it = this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.iterator();
                    while (it.hasNext()) {
                        trackThirdPartySharingI(it.next());
                    }
                    Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
                    if (bool != null) {
                        trackMeasurementConsentI(bool.booleanValue());
                    }
                    this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new ArrayList();
                    this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
                }
                if (!defaultInstance.getInstallTracked()) {
                    this.logger.debug("Detected that install was not tracked at enable time", new Object[0]);
                    trackNewSessionI(System.currentTimeMillis());
                }
                checkAfterNewStartI(defaultInstance);
            }
            updateStatusI(!z10, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineModeI(boolean z10) {
        String str;
        String str2;
        String str3;
        if (hasChangedStateI(this.internalState.isOffline(), z10, "Adjust already in offline mode", "Adjust already in online mode")) {
            InternalState internalState = this.internalState;
            internalState.offline = z10;
            if (internalState.hasFirstSdkStartNotOcurred()) {
                str = "Handlers will still start as paused";
                str2 = "Handlers will start as active due to SDK being online";
                str3 = "Handlers will start paused due to SDK being offline";
            } else {
                str = "Handlers remain paused";
                str2 = "Resuming handlers to put SDK in online mode";
                str3 = "Pausing handlers to put SDK offline mode";
            }
            updateStatusI(z10, str3, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushTokenI(String str) {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten || str == null || str.equals(activityState.pushToken)) {
                return;
            }
            this.activityState.pushToken = str;
            writeActivityStateI();
            ActivityPackage buildInfoPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildInfoPackage(Constants.PUSH);
            this.packageHandler.addPackage(buildInfoPackage);
            SharedPreferencesManager.getDefaultInstance(getContext()).removePushToken();
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildInfoPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
        }
    }

    private boolean shouldDisableThirdPartySharingWhenCoppaEnabled() {
        if (this.activityState == null || !isEnabledI()) {
            return false;
        }
        if (this.activityState.isGdprForgotten) {
            return false;
        }
        return !r0.isThirdPartySharingDisabledForCoppa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBackgroundTimerI() {
        if (this.backgroundTimer != null && toSendI() && this.backgroundTimer.getFireIn() <= 0) {
            this.backgroundTimer.startIn(BACKGROUND_TIMER_INTERVAL);
        }
    }

    private void startFirstSessionI() {
        this.activityState = new ActivityState();
        this.internalState.firstSdkStart = true;
        updateHandlersStatusAndSendI();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
        this.activityState.pushToken = defaultInstance.getPushToken();
        if (this.internalState.isEnabled()) {
            if (defaultInstance.getGdprForgetMe()) {
                gdprForgetMeI();
            } else {
                processCoppaComplianceI();
                if (defaultInstance.getDisableThirdPartySharing()) {
                    disableThirdPartySharingI();
                }
                Iterator<AdjustThirdPartySharing> it = this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.iterator();
                while (it.hasNext()) {
                    trackThirdPartySharingI(it.next());
                }
                Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
                if (bool != null) {
                    trackMeasurementConsentI(bool.booleanValue());
                }
                this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new ArrayList();
                this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
                this.activityState.sessionCount = 1;
                transferSessionPackageI(currentTimeMillis);
                checkAfterNewStartI(defaultInstance);
            }
        }
        this.activityState.resetSessionAttributes(currentTimeMillis);
        this.activityState.enabled = this.internalState.isEnabled();
        this.activityState.updatePackages = this.internalState.itHasToUpdatePackages();
        writeActivityStateI();
        defaultInstance.removePushToken();
        defaultInstance.removeGdprForgetMe();
        defaultInstance.removeDisableThirdPartySharing();
        processCachedDeeplinkI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startForegroundTimerI() {
        if (isEnabledI()) {
            this.foregroundTimer.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startI() {
        if (this.internalState.hasFirstSdkStartNotOcurred()) {
            AdjustSigner.onResume(this.adjustConfig.logger);
            startFirstSessionI();
        } else if (this.activityState.enabled) {
            AdjustSigner.onResume(this.adjustConfig.logger);
            updateHandlersStatusAndSendI();
            processCoppaComplianceI();
            processSessionI();
            checkAttributionStateI();
            processCachedDeeplinkI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBackgroundTimerI() {
        TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce == null) {
            return;
        }
        timerOnce.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopForegroundTimerI() {
        this.foregroundTimer.suspend();
    }

    private void teardownActivityStateS() {
        synchronized (ActivityState.class) {
            if (this.activityState == null) {
                return;
            }
            this.activityState = null;
        }
    }

    private void teardownAllSessionParametersS() {
        synchronized (SessionParameters.class) {
            if (this.sessionParameters == null) {
                return;
            }
            this.sessionParameters = null;
        }
    }

    private void teardownAttributionS() {
        synchronized (AdjustAttribution.class) {
            if (this.attribution == null) {
                return;
            }
            this.attribution = null;
        }
    }

    private boolean toSendI() {
        return toSendI(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackAdRevenueI(AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkAdjustAdRevenue(adjustAdRevenue) && !this.activityState.isGdprForgotten) {
            this.packageHandler.addPackage(new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildAdRevenuePackage(adjustAdRevenue, this.internalState.isInDelayedStart()));
            this.packageHandler.sendFirstPackage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackEventI(AdjustEvent adjustEvent) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkEventI(adjustEvent) && checkOrderIdI(adjustEvent.orderId) && !this.activityState.isGdprForgotten) {
            long currentTimeMillis = System.currentTimeMillis();
            this.activityState.eventCount++;
            updateActivityStateI(currentTimeMillis);
            ActivityPackage buildEventPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, currentTimeMillis).buildEventPackage(adjustEvent, this.internalState.isInDelayedStart());
            this.packageHandler.addPackage(buildEventPackage);
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildEventPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
            if (this.adjustConfig.sendInBackground && this.internalState.isInBackground()) {
                startBackgroundTimerI();
            }
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackMeasurementConsentI(boolean z10) {
        if (!checkActivityStateI(this.activityState)) {
            this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = Boolean.valueOf(z10);
            return;
        }
        if (isEnabledI() && !this.activityState.isGdprForgotten) {
            ActivityPackage buildMeasurementConsentPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildMeasurementConsentPackage(z10);
            this.packageHandler.addPackage(buildMeasurementConsentPackage);
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildMeasurementConsentPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
        }
    }

    private void trackNewSessionI(long j3) {
        ActivityState activityState = this.activityState;
        long j10 = j3 - activityState.lastActivity;
        activityState.sessionCount++;
        activityState.lastInterval = j10;
        transferSessionPackageI(j3);
        this.activityState.resetSessionAttributes(j3);
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackSubscriptionI(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten) {
            this.packageHandler.addPackage(new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildSubscriptionPackage(adjustPlayStoreSubscription, this.internalState.isInDelayedStart()));
            this.packageHandler.sendFirstPackage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackThirdPartySharingI(AdjustThirdPartySharing adjustThirdPartySharing) {
        if (!checkActivityStateI(this.activityState)) {
            this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
            return;
        }
        if (isEnabledI() && !this.activityState.isGdprForgotten) {
            if (this.adjustConfig.coppaCompliantEnabled) {
                this.logger.warn("Calling third party sharing API not allowed when COPPA enabled", new Object[0]);
                return;
            }
            ActivityPackage buildThirdPartySharingPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildThirdPartySharingPackage(adjustThirdPartySharing);
            this.packageHandler.addPackage(buildThirdPartySharingPackage);
            if (this.adjustConfig.eventBufferingEnabled) {
                this.logger.info("Buffered event %s", buildThirdPartySharingPackage.getSuffix());
            } else {
                this.packageHandler.sendFirstPackage();
            }
        }
    }

    private void transferSessionPackageI(long j3) {
        this.packageHandler.addPackage(new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, j3).buildSessionPackage(this.internalState.isInDelayedStart()));
        this.packageHandler.sendFirstPackage();
    }

    private boolean updateActivityStateI(long j3) {
        if (!checkActivityStateI(this.activityState)) {
            return false;
        }
        ActivityState activityState = this.activityState;
        long j10 = j3 - activityState.lastActivity;
        if (j10 > SESSION_INTERVAL) {
            return false;
        }
        activityState.lastActivity = j3;
        if (j10 < 0) {
            this.logger.error(TIME_TRAVEL, new Object[0]);
            return true;
        }
        activityState.sessionLength += j10;
        activityState.timeSpent += j10;
        return true;
    }

    private void updateAdidI(String str) {
        if (str == null || str.equals(this.activityState.adid)) {
            return;
        }
        this.activityState.adid = str;
        writeActivityStateI();
    }

    private void updateHandlersStatusAndSendI() {
        if (!toSendI()) {
            pauseSendingI();
            return;
        }
        resumeSendingI();
        if (!this.adjustConfig.eventBufferingEnabled || (this.internalState.isFirstLaunch() && this.internalState.hasSessionResponseNotBeenProcessed())) {
            this.packageHandler.sendFirstPackage();
        }
    }

    private void updatePackagesI() {
        this.packageHandler.updatePackages(this.sessionParameters);
        this.internalState.updatePackages = false;
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.updatePackages = false;
            writeActivityStateI();
        }
    }

    private void updateStatusI(boolean z10, String str, String str2, String str3) {
        if (z10) {
            this.logger.info(str, new Object[0]);
        } else if (pausedI(false)) {
            if (pausedI(true)) {
                this.logger.info(str2, new Object[0]);
            } else {
                this.logger.info(eb.j.k(str2, ", except the Sdk Click Handler"), new Object[0]);
            }
        } else {
            this.logger.info(str3, new Object[0]);
        }
        updateHandlersStatusAndSendI();
    }

    private void writeActivityStateI() {
        synchronized (ActivityState.class) {
            ActivityState activityState = this.activityState;
            if (activityState == null) {
                return;
            }
            Util.writeObject(activityState, this.adjustConfig.context, Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME);
        }
    }

    private void writeAttributionI() {
        synchronized (AdjustAttribution.class) {
            AdjustAttribution adjustAttribution = this.attribution;
            if (adjustAttribution == null) {
                return;
            }
            Util.writeObject(adjustAttribution, this.adjustConfig.context, Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME);
        }
    }

    private void writeSessionCallbackParametersI() {
        synchronized (SessionParameters.class) {
            SessionParameters sessionParameters = this.sessionParameters;
            if (sessionParameters == null) {
                return;
            }
            Util.writeObject(sessionParameters.callbackParameters, this.adjustConfig.context, Constants.SESSION_CALLBACK_PARAMETERS_FILENAME, SESSION_CALLBACK_PARAMETERS_NAME);
        }
    }

    private void writeSessionPartnerParametersI() {
        synchronized (SessionParameters.class) {
            SessionParameters sessionParameters = this.sessionParameters;
            if (sessionParameters == null) {
                return;
            }
            Util.writeObject(sessionParameters.partnerParameters, this.adjustConfig.context, Constants.SESSION_PARTNER_PARAMETERS_FILENAME, SESSION_PARTNER_PARAMETERS_NAME);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addSessionCallbackParameter(String str, String str2) {
        this.executor.submit(new h(str, str2));
    }

    public void addSessionCallbackParameterI(String str, String str2) {
        if (Util.isValidParameter(str, "key", "Session Callback") && Util.isValidParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE, "Session Callback")) {
            SessionParameters sessionParameters = this.sessionParameters;
            if (sessionParameters.callbackParameters == null) {
                sessionParameters.callbackParameters = new LinkedHashMap();
            }
            String str3 = this.sessionParameters.callbackParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.sessionParameters.callbackParameters.put(str, str2);
            writeSessionCallbackParametersI();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addSessionPartnerParameter(String str, String str2) {
        this.executor.submit(new i(str, str2));
    }

    public void addSessionPartnerParameterI(String str, String str2) {
        if (Util.isValidParameter(str, "key", "Session Partner") && Util.isValidParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE, "Session Partner")) {
            SessionParameters sessionParameters = this.sessionParameters;
            if (sessionParameters.partnerParameters == null) {
                sessionParameters.partnerParameters = new LinkedHashMap();
            }
            String str3 = this.sessionParameters.partnerParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.sessionParameters.partnerParameters.put(str, str2);
            writeSessionPartnerParametersI();
        }
    }

    public void backgroundTimerFired() {
        this.executor.submit(new z());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void disableThirdPartySharing() {
        this.executor.submit(new q());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void finishedTrackingActivity(ResponseData responseData) {
        if (responseData instanceof SessionResponseData) {
            this.logger.debug("Finished tracking session", new Object[0]);
            this.attributionHandler.checkSessionResponse((SessionResponseData) responseData);
        } else if (responseData instanceof SdkClickResponseData) {
            SdkClickResponseData sdkClickResponseData = (SdkClickResponseData) responseData;
            checkForInstallReferrerInfo(sdkClickResponseData);
            this.attributionHandler.checkSdkClickResponse(sdkClickResponseData);
        } else if (responseData instanceof EventResponseData) {
            launchEventResponseTasks((EventResponseData) responseData);
        }
    }

    public void foregroundTimerFired() {
        this.executor.submit(new y());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gdprForgetMe() {
        this.executor.submit(new p());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public String getAdid() {
        ActivityState activityState = this.activityState;
        if (activityState == null) {
            return null;
        }
        return activityState.adid;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public AdjustConfig getAdjustConfig() {
        return this.adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public AdjustAttribution getAttribution() {
        return this.attribution;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public Context getContext() {
        return this.adjustConfig.context;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.a getDeviceInfo() {
        return this.deviceInfo;
    }

    public InternalState getInternalState() {
        return this.internalState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public SessionParameters getSessionParameters() {
        return this.sessionParameters;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gotOptOutResponse() {
        this.executor.submit(new x());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void init(AdjustConfig adjustConfig) {
        this.adjustConfig = adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean isEnabled() {
        return isEnabledI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchAttributionResponseTasks(AttributionResponseData attributionResponseData) {
        this.executor.submit(new f(attributionResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchEventResponseTasks(EventResponseData eventResponseData) {
        this.executor.submit(new c(eventResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSdkClickResponseTasks(SdkClickResponseData sdkClickResponseData) {
        this.executor.submit(new d(sdkClickResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSessionResponseTasks(SessionResponseData sessionResponseData) {
        this.executor.submit(new e(sessionResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onPause() {
        this.internalState.background = true;
        this.executor.submit(new g0());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onResume() {
        this.internalState.background = false;
        this.executor.submit(new v());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void readOpenUrl(Uri uri, long j3) {
        this.executor.submit(new t0(uri, j3));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeSessionCallbackParameter(String str) {
        this.executor.submit(new j(str));
    }

    public void removeSessionCallbackParameterI(String str) {
        if (Util.isValidParameter(str, "key", "Session Callback")) {
            Map<String, String> map = this.sessionParameters.callbackParameters;
            if (map == null) {
                this.logger.warn("Session Callback parameters are not set", new Object[0]);
            } else if (map.remove(str) == null) {
                this.logger.warn("Key %s does not exist", str);
            } else {
                this.logger.debug("Key %s will be removed", str);
                writeSessionCallbackParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeSessionPartnerParameter(String str) {
        this.executor.submit(new l(str));
    }

    public void removeSessionPartnerParameterI(String str) {
        if (Util.isValidParameter(str, "key", "Session Partner")) {
            Map<String, String> map = this.sessionParameters.partnerParameters;
            if (map == null) {
                this.logger.warn("Session Partner parameters are not set", new Object[0]);
            } else if (map.remove(str) == null) {
                this.logger.warn("Key %s does not exist", str);
            } else {
                this.logger.debug("Key %s will be removed", str);
                writeSessionPartnerParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void resetSessionCallbackParameters() {
        this.executor.submit(new m());
    }

    public void resetSessionCallbackParametersI() {
        if (this.sessionParameters.callbackParameters == null) {
            this.logger.warn("Session Callback parameters are not set", new Object[0]);
        }
        this.sessionParameters.callbackParameters = null;
        writeSessionCallbackParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void resetSessionPartnerParameters() {
        this.executor.submit(new n());
    }

    public void resetSessionPartnerParametersI() {
        if (this.sessionParameters.partnerParameters == null) {
            this.logger.warn("Session Partner parameters are not set", new Object[0]);
        }
        this.sessionParameters.partnerParameters = null;
        writeSessionPartnerParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendFirstPackages() {
        this.executor.submit(new g());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendInstallReferrer(ReferrerDetails referrerDetails, String str) {
        this.executor.submit(new b(referrerDetails, str));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendPreinstallReferrer() {
        this.executor.submit(new a());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendReftagReferrer() {
        this.executor.submit(new v0());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setAskingAttribution(boolean z10) {
        this.executor.submit(new u0(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setEnabled(boolean z10) {
        this.executor.submit(new r0(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setOfflineMode(boolean z10) {
        this.executor.submit(new s0(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPushToken(String str, boolean z10) {
        this.executor.submit(new o(z10, str));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void teardown() {
        TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        TimerCycle timerCycle = this.foregroundTimer;
        if (timerCycle != null) {
            timerCycle.teardown();
        }
        TimerOnce timerOnce2 = this.delayStartTimer;
        if (timerOnce2 != null) {
            timerOnce2.teardown();
        }
        ThreadExecutor threadExecutor = this.executor;
        if (threadExecutor != null) {
            threadExecutor.teardown();
        }
        IPackageHandler iPackageHandler = this.packageHandler;
        if (iPackageHandler != null) {
            iPackageHandler.teardown();
        }
        IAttributionHandler iAttributionHandler = this.attributionHandler;
        if (iAttributionHandler != null) {
            iAttributionHandler.teardown();
        }
        ISdkClickHandler iSdkClickHandler = this.sdkClickHandler;
        if (iSdkClickHandler != null) {
            iSdkClickHandler.teardown();
        }
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters != null) {
            Map<String, String> map = sessionParameters.callbackParameters;
            if (map != null) {
                map.clear();
            }
            Map<String, String> map2 = this.sessionParameters.partnerParameters;
            if (map2 != null) {
                map2.clear();
            }
        }
        teardownActivityStateS();
        teardownAttributionS();
        teardownAllSessionParametersS();
        this.packageHandler = null;
        this.logger = null;
        this.foregroundTimer = null;
        this.executor = null;
        this.backgroundTimer = null;
        this.delayStartTimer = null;
        this.internalState = null;
        this.deviceInfo = null;
        this.adjustConfig = null;
        this.attributionHandler = null;
        this.sdkClickHandler = null;
        this.sessionParameters = null;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        this.executor.submit(new u(adjustAdRevenue));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackEvent(AdjustEvent adjustEvent) {
        this.executor.submit(new q0(adjustEvent));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackMeasurementConsent(boolean z10) {
        this.executor.submit(new s(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        this.executor.submit(new w(adjustPlayStoreSubscription));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackThirdPartySharing(AdjustThirdPartySharing adjustThirdPartySharing) {
        this.executor.submit(new r(adjustThirdPartySharing));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean updateAttributionI(AdjustAttribution adjustAttribution) {
        if (adjustAttribution == null || adjustAttribution.equals(this.attribution)) {
            return false;
        }
        this.attribution = adjustAttribution;
        writeAttributionI();
        return true;
    }

    private void checkAfterNewStartI(SharedPreferencesManager sharedPreferencesManager) {
        String pushToken = sharedPreferencesManager.getPushToken();
        if (pushToken != null && !pushToken.equals(this.activityState.pushToken)) {
            setPushToken(pushToken, true);
        }
        if (sharedPreferencesManager.getRawReferrerArray() != null) {
            sendReftagReferrer();
        }
        checkForPreinstallI();
        this.installReferrer.startConnection();
        this.installReferrerHuawei.readReferrer();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
    }

    private boolean pausedI(boolean z10) {
        return z10 ? this.internalState.isOffline() || !isEnabledI() : this.internalState.isOffline() || !isEnabledI() || this.internalState.isInDelayedStart();
    }

    private boolean toSendI(boolean z10) {
        if (pausedI(z10)) {
            return false;
        }
        if (this.adjustConfig.sendInBackground) {
            return true;
        }
        return this.internalState.isInForeground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackAdRevenueI(String str, JSONObject jSONObject) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten) {
            this.packageHandler.addPackage(new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.sessionParameters, System.currentTimeMillis()).buildAdRevenuePackage(str, jSONObject));
            this.packageHandler.sendFirstPackage();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackAdRevenue(String str, JSONObject jSONObject) {
        this.executor.submit(new t(str, jSONObject));
    }
}
