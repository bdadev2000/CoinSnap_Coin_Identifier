package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class SdkClickHandler implements ISdkClickHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final String SCHEDULED_EXECUTOR_SOURCE = "SdkClickHandler";
    private static final String SOURCE_INSTALL_REFERRER = "install_referrer";
    private static final String SOURCE_REFTAG = "reftag";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private BackoffStrategy backoffStrategy;
    private ILogger logger;
    private List<ActivityPackage> packageQueue;
    private boolean paused;
    private ThreadScheduler scheduler;

    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f251a;

        public a(ActivityPackage activityPackage) {
            this.f251a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SdkClickHandler.this.packageQueue.add(this.f251a);
            SdkClickHandler.this.logger.debug("Added sdk_click %d", Integer.valueOf(SdkClickHandler.this.packageQueue.size()));
            SdkClickHandler.this.logger.verbose("%s", this.f251a.getExtendedString());
            SdkClickHandler.this.sendNextSdkClick();
        }
    }

    /* loaded from: classes7.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IActivityHandler iActivityHandler = (IActivityHandler) SdkClickHandler.this.activityHandlerWeakRef.get();
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
            try {
                JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
                boolean z = false;
                for (int i = 0; i < rawReferrerArray.length(); i++) {
                    JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                    if (jSONArray.optInt(2, -1) == 0) {
                        String optString = jSONArray.optString(0, null);
                        z = true;
                        long optLong = jSONArray.optLong(1, -1L);
                        jSONArray.put(2, 1);
                        SdkClickHandler.this.sendSdkClick(PackageFactory.buildReftagSdkClickPackage(optString, optLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getSessionParameters()));
                    }
                }
                if (z) {
                    defaultInstance.saveRawReferrerArray(rawReferrerArray);
                }
            } catch (JSONException e) {
                SdkClickHandler.this.logger.error("Send saved raw referrers error (%s)", e.getMessage());
            }
        }
    }

    /* loaded from: classes7.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f253a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f253a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IActivityHandler iActivityHandler = (IActivityHandler) SdkClickHandler.this.activityHandlerWeakRef.get();
            if (iActivityHandler == null) {
                return;
            }
            SdkClickHandler.this.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage(this.f253a, this.b, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getSessionParameters()));
        }
    }

    /* loaded from: classes7.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SdkClickHandler.this.sendNextSdkClickI();
        }
    }

    /* loaded from: classes7.dex */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f255a;

        public e(ActivityPackage activityPackage) {
            this.f255a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SdkClickHandler.this.sendSdkClickI(this.f255a);
            SdkClickHandler.this.sendNextSdkClick();
        }
    }

    public SdkClickHandler(IActivityHandler iActivityHandler, boolean z, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z, iActivityPackageSender);
        this.logger = AdjustFactory.getLogger();
        this.backoffStrategy = AdjustFactory.getSdkClickBackoffStrategy();
        this.scheduler = new SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);
    }

    private Map<String, String> generateSendingParametersI() {
        HashMap hashMap = new HashMap();
        PackageBuilder.addString(hashMap, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            PackageBuilder.addLong(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    private void logErrorMessageI(ActivityPackage activityPackage, String str, Throwable th) {
        this.logger.error(Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th)), new Object[0]);
    }

    private void retrySendingI(ActivityPackage activityPackage) {
        this.logger.error("Retrying sdk_click package for the %d time", Integer.valueOf(activityPackage.increaseRetries()));
        sendSdkClick(activityPackage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClick() {
        this.scheduler.submit(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClickI() {
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || iActivityHandler.getActivityState().isGdprForgotten || this.paused || this.packageQueue.isEmpty()) {
            return;
        }
        ActivityPackage remove = this.packageQueue.remove(0);
        int retries = remove.getRetries();
        e eVar = new e(remove);
        if (retries <= 0) {
            eVar.run();
            return;
        }
        long waitingTime = Util.getWaitingTime(retries, this.backoffStrategy);
        this.logger.verbose("Waiting for %s seconds before retrying sdk_click for the %d time", Util.SecondsDisplayFormat.format(waitingTime / 1000.0d), Integer.valueOf(retries));
        this.scheduler.schedule(eVar, waitingTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSdkClickI(ActivityPackage activityPackage) {
        String str;
        long j;
        long j2;
        long j3;
        long j4;
        String str2;
        String str3;
        Boolean bool;
        long j5;
        String str4;
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        String str5 = activityPackage.getParameters().get("source");
        boolean z = str5 != null && str5.equals("reftag");
        String str6 = activityPackage.getParameters().get("raw_referrer");
        if (z && SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).getRawReferrer(str6, activityPackage.getClickTimeInMilliseconds()) == null) {
            return;
        }
        boolean z2 = str5 != null && str5.equals("install_referrer");
        if (z2) {
            j = activityPackage.getClickTimeInSeconds();
            j3 = activityPackage.getInstallBeginTimeInSeconds();
            str = activityPackage.getParameters().get(Constants.REFERRER);
            j4 = activityPackage.getClickTimeServerInSeconds();
            long installBeginTimeServerInSeconds = activityPackage.getInstallBeginTimeServerInSeconds();
            String installVersion = activityPackage.getInstallVersion();
            bool = activityPackage.getGooglePlayInstant();
            str3 = activityPackage.getParameters().get("referrer_api");
            j2 = installBeginTimeServerInSeconds;
            str2 = installVersion;
        } else {
            str = null;
            j = -1;
            j2 = -1;
            j3 = -1;
            j4 = -1;
            str2 = null;
            str3 = null;
            bool = null;
        }
        String str7 = str2;
        boolean z3 = str5 != null && str5.equals(Constants.PREINSTALL);
        ResponseData sendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, generateSendingParametersI());
        if (sendActivityPackageSync instanceof SdkClickResponseData) {
            SdkClickResponseData sdkClickResponseData = (SdkClickResponseData) sendActivityPackageSync;
            if (sdkClickResponseData.willRetry) {
                retrySendingI(activityPackage);
                return;
            }
            if (iActivityHandler == null) {
                return;
            }
            if (sdkClickResponseData.trackingState == TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
                return;
            }
            if (z) {
                j5 = j2;
                SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).removeRawReferrer(str6, activityPackage.getClickTimeInMilliseconds());
            } else {
                j5 = j2;
            }
            if (z2) {
                sdkClickResponseData.clickTime = j;
                sdkClickResponseData.installBegin = j3;
                sdkClickResponseData.installReferrer = str;
                sdkClickResponseData.clickTimeServer = j4;
                sdkClickResponseData.installBeginServer = j5;
                sdkClickResponseData.installVersion = str7;
                sdkClickResponseData.googlePlayInstant = bool;
                sdkClickResponseData.referrerApi = str3;
                sdkClickResponseData.isInstallReferrer = true;
            }
            if (z3 && (str4 = activityPackage.getParameters().get("found_location")) != null && !str4.isEmpty()) {
                SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
                if (Constants.SYSTEM_INSTALLER_REFERRER.equalsIgnoreCase(str4)) {
                    defaultInstance.removePreinstallReferrer();
                } else {
                    defaultInstance.setPreinstallPayloadReadStatus(PreinstallUtil.markAsRead(str4, defaultInstance.getPreinstallPayloadReadStatus()));
                }
            }
            iActivityHandler.finishedTrackingActivity(sdkClickResponseData);
        }
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void init(IActivityHandler iActivityHandler, boolean z, IActivityPackageSender iActivityPackageSender) {
        this.paused = !z;
        this.packageQueue = new ArrayList();
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void resumeSending() {
        this.paused = false;
        sendNextSdkClick();
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendPreinstallPayload(String str, String str2) {
        this.scheduler.submit(new c(str, str2));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendReftagReferrers() {
        this.scheduler.submit(new b());
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendSdkClick(ActivityPackage activityPackage) {
        this.scheduler.submit(new a(activityPackage));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void teardown() {
        this.logger.verbose("SdkClickHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.logger = null;
        this.packageQueue = null;
        this.backoffStrategy = null;
        this.scheduler = null;
    }
}
