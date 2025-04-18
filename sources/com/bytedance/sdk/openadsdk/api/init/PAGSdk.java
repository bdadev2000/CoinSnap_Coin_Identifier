package com.bytedance.sdk.openadsdk.api.init;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.app.f1;
import c6.k;
import com.bytedance.sdk.component.NjR.AlY;
import com.bytedance.sdk.component.NjR.tN;
import com.bytedance.sdk.component.Sg;
import com.bytedance.sdk.component.adexpress.YFl.Sg.vc;
import com.bytedance.sdk.component.qsH.nc;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.qsH.wN;
import com.bytedance.sdk.component.utils.DSW;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.Ne.YFl;
import com.bytedance.sdk.openadsdk.aIu.YFl;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.dXO;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.qsH.YoT;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.EH;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k5.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long YFl;

    /* loaded from: classes.dex */
    public interface PAGInitCallback {
        void fail(int i10, String str);

        void success();
    }

    static {
        try {
            Sg.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
                @Override // com.bytedance.sdk.component.Sg.YFl
                public ExecutorService getExecutorService() {
                    return mn.AlY();
                }
            });
            mn.YFl(new qsH("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInitHelper.initAPM();
                    PAGInitHelper.initMemoryData();
                }
            });
            pDU.YFl(System.currentTimeMillis());
            pDU.Sg();
            AlY.setWebViewProvider(new AlY.tN() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // com.bytedance.sdk.component.NjR.AlY.tN
                public WebView createWebView(Context context, AttributeSet attributeSet, int i10) {
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        if (i10 == 0) {
                            return new tN(context, attributeSet);
                        }
                        return new tN(context, attributeSet, i10);
                    } catch (Exception unused) {
                        if (i10 == 0) {
                            return new tN(context, attributeSet);
                        }
                        return new tN(context, attributeSet, i10);
                    }
                }
            });
        } catch (Throwable th2) {
            Log.i("TTAD.PAGSdk", th2.getMessage());
        }
        YFl = 0L;
    }

    private static void AlY(Context context, InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getPackageName())) {
            qO.YFl(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.DSW.AlY.YFl(initConfig.getPackageName());
        } else {
            qO.YFl((String) null);
            com.bytedance.adsdk.ugeno.DSW.AlY.YFl((String) null);
        }
        lG.Sg(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.Sg.YFl();
        } else {
            com.bytedance.sdk.openadsdk.multipro.Sg.Sg();
        }
        YoT.YFl();
        com.bytedance.sdk.openadsdk.core.eT.Sg.YFl(context);
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback == null || pDU.AlY() != 0) {
            return;
        }
        PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.multipro.tN.YFl();
    }

    public static String getApplicationName(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getBiddingToken(Context context, String str) {
        if (com.bytedance.sdk.openadsdk.common.AlY.YFl()) {
            return null;
        }
        lG.Sg(context);
        return getBiddingToken(str);
    }

    public static String getSDKVersion() {
        if (dXO.YFl() != null) {
            return dXO.YFl().AlY();
        }
        return "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.13
            @Override // java.lang.Runnable
            public void run() {
                PAGSdk.Sg(context, pAGConfig, pAGInitCallback);
            }
        });
        pDU.DSW();
    }

    public static boolean isInitSuccess() {
        return pDU.AlY() == 1;
    }

    public static boolean onlyVerityPlayable(String str, int i10, String str2, String str3, String str4) {
        if (dXO.YFl() != null) {
            return dXO.YFl().YFl(str, i10, str2, str3, str4);
        }
        return false;
    }

    public static void setAabPackageName(String str) {
        if (!TextUtils.isEmpty(str)) {
            qO.YFl(str);
            com.bytedance.adsdk.ugeno.DSW.AlY.YFl(str);
        }
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && lG.AlY().Wwa() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z10) {
        com.bytedance.sdk.openadsdk.common.AlY.YFl(z10);
    }

    private static void tN(Context context, InitConfig initConfig) {
        pDU.YFl = true;
        dXO.YFl().YFl(initConfig.getAppId()).Sg(initConfig.getCoppa()).tN(initConfig.getGdpr()).AlY(initConfig.getCcpa()).vc(initConfig.getAppIconId()).YFl(initConfig.getTitleBarTheme());
        NjR.VOe();
        if (initConfig instanceof PAGConfig) {
            dXO.YFl().wN(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (Sg(initConfig)) {
                dXO.YFl().YFl();
                EH.YFl();
            }
        } catch (Throwable unused) {
        }
        DSW.YFl();
    }

    private static void vc(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        mn.YFl(new qsH("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // java.lang.Runnable
            public void run() {
                pDU.YFl(initConfig.getData());
                YFl.YFl(context, initConfig.getAppId());
                YFl.YFl();
                com.bytedance.sdk.openadsdk.rkt.tN.YFl();
                com.bytedance.sdk.openadsdk.rkt.tN.Sg();
                new GA();
                vc.YFl(com.bytedance.sdk.openadsdk.utils.lG.YFl() * 10);
                com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(context, initConfig.isSupportMultiProcess());
                com.bytedance.sdk.openadsdk.core.EH.YFl().Sg();
                com.bytedance.sdk.openadsdk.core.NjR.tN.YFl();
                com.bytedance.sdk.openadsdk.Ne.YFl.YFl(new YFl.InterfaceC0102YFl() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9.1
                    public void onGdprChanged(int i10) {
                        PAGConfig.setGDPRConsent(i10);
                    }
                });
                rkt.AlY = rkt.tN(context);
                com.bytedance.sdk.openadsdk.VOe.YFl.DSW.Sg();
                JSONObject dd2 = lG.AlY().dd();
                if (dd2 != null) {
                    try {
                        k.f2655o = dd2.optInt("splash", 10);
                        k.f2656p = dd2.optInt("reward", 10);
                        k.f2657q = dd2.optInt("brand", 10);
                        int optInt = dd2.optInt("other", 10);
                        k.f2658r = optInt;
                        if (k.f2655o < 0) {
                            k.f2655o = 10;
                        }
                        if (k.f2656p < 0) {
                            k.f2656p = 10;
                        }
                        if (k.f2657q < 0) {
                            k.f2657q = 10;
                        }
                        if (optInt < 0) {
                            k.f2658r = 10;
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                k.f2654n = CacheDirFactory.getICacheDir(0);
                com.bytedance.sdk.openadsdk.core.settings.vc AlY = lG.AlY();
                if (!AlY.dGX()) {
                    synchronized (AlY) {
                        if (!AlY.dGX()) {
                            AlY.Sg();
                            AlY.Cfr();
                        }
                    }
                }
                DeviceUtils.nc();
                PAGInitHelper.maybeAsyncInitTask(context);
                PAGSdk.getBiddingToken();
                com.bytedance.sdk.component.qsH.vc.YFl(true);
                com.bytedance.sdk.component.qsH.vc.YFl(new com.bytedance.sdk.openadsdk.pDU.Sg.YFl());
                DeviceUtils.YFl(context);
                DeviceUtils.nc(context);
                DeviceUtils.eT(context);
                com.bytedance.sdk.openadsdk.pDU.YFl.YFl();
                com.bytedance.sdk.openadsdk.core.settings.AlY.YFl();
                com.bytedance.sdk.openadsdk.pDU.tN.AlY();
                Sco.GA(context);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl();
                PAGSdk.tN();
                com.bytedance.sdk.openadsdk.core.NjR.tN.Sg();
                com.bytedance.sdk.openadsdk.core.AlY.YFl.YFl().Sg();
                com.bytedance.sdk.component.qsH.tN.tN.YFl(pDU.Sg());
            }
        });
    }

    private static void wN(Context context, InitConfig initConfig) {
        if (!com.bytedance.sdk.openadsdk.core.settings.YoT.YFl()) {
            return;
        }
        com.bytedance.sdk.component.qsH.vc.tN(-1);
        wN.YFl(new nc() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
            @Override // com.bytedance.sdk.component.qsH.nc
            public com.bytedance.sdk.component.qsH.NjR createThreadFactory(int i10, String str) {
                return new com.bytedance.sdk.component.qsH.NjR(i10, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                    @Override // com.bytedance.sdk.component.qsH.NjR, java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        int Bn = rkt.JwO().Bn();
                        if (Bn >= -524288 && Bn < 0) {
                            Thread thread = new Thread(this.YFl, runnable, this.Sg, Bn);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i11 = this.tN;
                            if (i11 > 10 || i11 <= 0) {
                                this.tN = 5;
                            }
                            thread.setPriority(this.tN);
                            return thread;
                        }
                        return super.newThread(runnable);
                    }
                };
            }
        });
        com.bytedance.sdk.openadsdk.multipro.tN.YFl(context);
        com.bytedance.sdk.component.DSW.tN.YFl.YFl(new com.bytedance.sdk.component.DSW.tN.tN() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
            @Override // com.bytedance.sdk.component.DSW.tN.tN
            public ExecutorService getThreadPool() {
                return mn.AlY();
            }
        });
        com.bytedance.sdk.openadsdk.DSW.Sg.tN();
        pDU.Sg.set(true);
        try {
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().YFl(new com.bytedance.sdk.openadsdk.NjR.YFl());
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.PAGSdk", e2.getMessage());
        }
        tN(initConfig);
        tN(context, initConfig);
        d.a = context;
        d.f20272b = null;
        d.f20275e = 2;
        d.f20273c = initConfig.isSupportMultiProcess();
        d.f20274d = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().wN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(final Context context, final InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        YFl = SystemClock.elapsedRealtime();
        lG.Sg(context);
        if (pAGInitCallback != null) {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (pDU.AlY() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.AlY.YFl()) {
            Sg(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (isInitSuccess()) {
            AlY();
            return;
        }
        pDU.YFl(3);
        if (context == null) {
            Sg(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        if (initConfig == null) {
            Sg(4000, "PAGConfig is null, please check.");
            return;
        }
        AlY(context, initConfig);
        ApmHelper.initApm(context, initConfig);
        try {
            NjR.YFl(new com.bytedance.sdk.openadsdk.core.GA() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                @Override // com.bytedance.sdk.openadsdk.core.GA
                public void fail(int i10, String str) {
                    PAGSdk.Sg(i10, str);
                }

                public void success() {
                    PAGSdk.AlY();
                }
            });
            try {
                qO.YFl(lG.YFl(), "tt_ad_logo_txt");
                if (qO.AlY(context, "tt_ad_logo") == 0) {
                    YFl(initConfig, pAGInitCallback);
                    return;
                }
                if (isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        AlY();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.wN.YFl yFl = new com.bytedance.sdk.openadsdk.wN.YFl();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return com.bytedance.sdk.openadsdk.wN.YFl.this;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    Sg(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl().YFl(new com.bytedance.sdk.openadsdk.multipro.aidl.Sg() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Sg
                        public void onServiceConnected() {
                            pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    PAGSdk.Sg(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl().tN();
                }
            } catch (Throwable unused) {
                YFl(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            Sg(4000, "Internal Error, setting exception. ");
        }
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.AlY.YFl()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            mn.wN(new qsH("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.14
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                }
            });
        }
    }

    private static void YFl(InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        pDU.YFl(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                Sg(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                Sg(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.AlY.YFl()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            mn.wN(new qsH("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.15
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                }
            });
        }
    }

    private static void YFl(final Context context, final boolean z10, final InitConfig initConfig, final long j3, final long j10) {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl();
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean tN = NjR.Sg().tN();
                    jSONObject.put("duration", j3);
                    jSONObject.put("sdk_init_time", j10);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", PAGSdk.Sg(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", tN);
                    jSONObject.put("minSdkVersion", Sco.eT(context));
                    jSONObject.put("targetSdkVersion", Sco.nc(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z10);
                    NjR.Sg().Sg(false);
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.PAGSdk", "run: ", e2);
                }
                return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("pangle_sdk_init").Sg(jSONObject.toString());
            }
        });
    }

    public static String getBiddingToken(String str) {
        if (com.bytedance.sdk.openadsdk.common.AlY.YFl()) {
            return null;
        }
        return (lG.YFl() == null || dXO.YFl() == null) ? "" : dXO.YFl().tN(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AlY() {
        pDU.YFl(1);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                Iterator<PAGInitCallback> it = list.iterator();
                while (it.hasNext()) {
                    PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.success();
                    }
                }
            }
            com.bytedance.sdk.openadsdk.rkt.tN.Sg(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
                @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                    com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                    yFl.Sg("init");
                    return yFl;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
        }
    }

    public static String getBiddingToken(Context context) {
        if (com.bytedance.sdk.openadsdk.common.AlY.YFl()) {
            return null;
        }
        lG.Sg(context);
        return getBiddingToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tN() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context YFl2 = lG.YFl();
                if (YFl2 == null || (shortcutManager = (ShortcutManager) YFl2.getSystemService(ShortcutManager.class)) == null) {
                    return;
                }
                NjR.Sg().YFl(f1.A(shortcutManager));
            } catch (Throwable unused) {
            }
        }
    }

    public static String getBiddingToken() {
        if (com.bytedance.sdk.openadsdk.common.AlY.YFl()) {
            return null;
        }
        return (lG.YFl() == null || dXO.YFl() == null) ? "" : dXO.YFl().wN();
    }

    private static void tN(InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getData())) {
            NjR.Sg().tN(initConfig.getData());
        }
        NjR.Sg().tN(Sg(initConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(Context context, InitConfig initConfig) {
        long j3;
        try {
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.PAGSdk", th2.getMessage());
            long elapsedRealtime = SystemClock.elapsedRealtime() - YFl;
            Sg(4000, th2.getMessage());
            j3 = elapsedRealtime;
        }
        if (isInitSuccess()) {
            AlY();
            return;
        }
        wN(context, initConfig);
        rkt.JwO().wXo();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - YFl;
        AlY();
        vc(context, initConfig);
        j3 = elapsedRealtime2;
        YFl(context, isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - YFl, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Sg(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(int i10, String str) {
        pDU.YFl(2);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                Iterator<PAGInitCallback> it = list.iterator();
                while (it.hasNext()) {
                    PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.fail(i10, str);
                    }
                }
                com.bytedance.sdk.openadsdk.rkt.tN.tN(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.12
                    @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                    public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                        com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                        yFl.Sg("init");
                        return yFl;
                    }
                });
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
        }
    }
}
