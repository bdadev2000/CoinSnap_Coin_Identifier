package com.bytedance.sdk.openadsdk.api.init;

import Y.a;
import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.component.QR.KS.zp;
import com.bytedance.sdk.component.ku.COT;
import com.bytedance.sdk.component.ku.HWF;
import com.bytedance.sdk.component.ku.YW;
import com.bytedance.sdk.component.ku.dT;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.lMd;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.widget.PangleWebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.core.rV;
import com.bytedance.sdk.openadsdk.core.settings.Bj;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.core.yRU;
import com.bytedance.sdk.openadsdk.lMd.zp.jU;
import com.bytedance.sdk.openadsdk.multipro.KS;
import com.bytedance.sdk.openadsdk.rV.zp.QR;
import com.bytedance.sdk.openadsdk.tG.zp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.KVG;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long zp;

    /* loaded from: classes.dex */
    public interface PAGInitCallback {
        void fail(int i9, String str);

        void success();
    }

    static {
        lMd.zp(new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // com.bytedance.sdk.component.lMd.zp
            public ExecutorService getExecutorService() {
                return QUv.jU();
            }
        });
        QUv.zp(new ku("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
            @Override // java.lang.Runnable
            public void run() {
                PAGInitHelper.initMemoryData();
            }
        });
        tG.zp(System.currentTimeMillis());
        tG.lMd();
        SSWebView.setWebViewProvider(new SSWebView.KS() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
            @Override // com.bytedance.sdk.component.widget.SSWebView.KS
            public WebView createWebView(Context context, AttributeSet attributeSet, int i9) {
                if (!(context instanceof MutableContextWrapper)) {
                    context = context.getApplicationContext();
                }
                try {
                    if (i9 == 0) {
                        return new PangleWebView(context, attributeSet);
                    }
                    return new PangleWebView(context, attributeSet, i9);
                } catch (Exception unused) {
                    if (i9 == 0) {
                        return new PangleWebView(context, attributeSet);
                    }
                    return new PangleWebView(context, attributeSet, i9);
                }
            }
        });
        zp = 0L;
    }

    private static void COT(Context context, InitConfig initConfig) {
        if (!Bj.zp()) {
            return;
        }
        HWF.KS(-1);
        COT.zp(new dT() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
            @Override // com.bytedance.sdk.component.ku.dT
            public YW createThreadFactory(int i9, String str) {
                return new YW(i9, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                    @Override // com.bytedance.sdk.component.ku.YW, java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        int bX = dQp.etV().bX();
                        if (bX >= -524288 && bX < 0) {
                            Thread thread = new Thread(this.zp, runnable, this.lMd, bX);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i10 = this.KS;
                            if (i10 > 10 || i10 <= 0) {
                                this.KS = 5;
                            }
                            thread.setPriority(this.KS);
                            return thread;
                        }
                        return super.newThread(runnable);
                    }
                };
            }
        });
        KS.zp(context);
        zp.zp(new com.bytedance.sdk.component.QR.KS.KS() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
            @Override // com.bytedance.sdk.component.QR.KS.KS
            public ExecutorService getThreadPool() {
                return QUv.jU();
            }
        });
        com.bytedance.sdk.openadsdk.jU.lMd.KS();
        tG.lMd.set(true);
        try {
            com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().zp(new com.bytedance.sdk.openadsdk.HWF.zp());
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.PAGSdk", e4.getMessage());
        }
        KS(initConfig);
        KS(context, initConfig);
        com.bykv.vk.openvk.component.video.api.KS.zp(context, null);
        com.bykv.vk.openvk.component.video.api.KS.zp(2);
        com.bykv.vk.openvk.component.video.api.KS.zp(initConfig.isSupportMultiProcess());
        com.bykv.vk.openvk.component.video.api.KS.zp(com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().COT());
    }

    private static void HWF(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        QUv.zp(new ku("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // java.lang.Runnable
            public void run() {
                new vDp();
                com.bytedance.sdk.component.adexpress.zp.lMd.HWF.zp(KVG.zp() * 10);
                jU.zp(context, initConfig.isSupportMultiProcess());
                rV.zp().lMd();
                com.bytedance.sdk.openadsdk.core.COT.KS.zp();
                com.bytedance.sdk.openadsdk.tG.zp.zp(new zp.InterfaceC0126zp() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9.1
                    public void onGdprChanged(int i9) {
                        PAGConfig.setGDPRConsent(i9);
                    }
                });
                dQp.zp = dQp.KS(context);
                QR.lMd();
                com.bykv.vk.openvk.component.video.zp.zp.zp(com.bytedance.sdk.openadsdk.core.KVG.jU().fVt());
                com.bykv.vk.openvk.component.video.zp.zp.zp(CacheDirFactory.getICacheDir(0));
                com.bytedance.sdk.openadsdk.core.settings.COT jU = com.bytedance.sdk.openadsdk.core.KVG.jU();
                if (!jU.MBR()) {
                    synchronized (jU) {
                        try {
                            if (!jU.MBR()) {
                                jU.lMd();
                                jU.cW();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                DeviceUtils.dT();
                PAGInitHelper.maybeAsyncInitTask(context);
                PAGSdk.getBiddingToken();
                HWF.zp(true);
                HWF.zp(new com.bytedance.sdk.openadsdk.dT.lMd.zp());
                DeviceUtils.zp(context);
                DeviceUtils.dT(context);
                DeviceUtils.Bj(context);
                com.com.bytedance.overseas.sdk.zp.lMd.zp(context);
                com.bytedance.sdk.openadsdk.dT.zp.zp();
                com.bytedance.sdk.openadsdk.core.settings.KS.zp();
                com.bytedance.sdk.openadsdk.dT.KS.KS();
                YhE.tG(context);
                com.bytedance.sdk.openadsdk.lMd.KS.zp();
                PAGSdk.KS();
                com.bytedance.sdk.openadsdk.core.COT.KS.lMd();
            }
        });
    }

    private static void KS(Context context, InitConfig initConfig) {
        tG.zp = true;
        yRU.zp().zp(initConfig.getAppId()).lMd(initConfig.getCoppa()).KS(initConfig.getGdpr()).jU(initConfig.getCcpa()).HWF(initConfig.getAppIconId()).zp(initConfig.getTitleBarTheme());
        com.bytedance.sdk.openadsdk.core.ku.yRU();
        if (initConfig instanceof PAGConfig) {
            yRU.zp().COT(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (lMd(initConfig)) {
                yRU.zp().zp();
                com.bytedance.sdk.openadsdk.utils.rV.zp();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.ku.zp();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback == null || tG.jU() != 0) {
            return;
        }
        PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
    }

    public static void closeMultiWebViewFileLock() {
        KS.zp();
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
        if (com.bytedance.sdk.openadsdk.common.lMd.zp()) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.KVG.zp(context);
        return getBiddingToken(str);
    }

    public static String getSDKVersion() {
        if (yRU.zp() != null) {
            return yRU.zp().jU();
        }
        return "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
            @Override // java.lang.Runnable
            public void run() {
                PAGSdk.lMd(context, pAGConfig, pAGInitCallback);
            }
        });
    }

    public static boolean isInitSuccess() {
        if (tG.jU() == 1) {
            return true;
        }
        return false;
    }

    private static void jU(Context context, InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getPackageName())) {
            cz.zp(initConfig.getPackageName());
        } else {
            cz.zp((String) null);
        }
        com.bytedance.sdk.openadsdk.core.KVG.zp(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.lMd.zp();
        } else {
            com.bytedance.sdk.openadsdk.multipro.lMd.lMd();
        }
        com.bytedance.sdk.openadsdk.core.nativeexpress.dT.zp();
        com.bytedance.sdk.openadsdk.core.ugen.lMd.zp(context);
    }

    public static boolean onlyVerityPlayable(String str, int i9, String str2, String str3, String str4) {
        if (yRU.zp() != null) {
            return yRU.zp().zp(str, i9, str2, str3, str4);
        }
        return false;
    }

    public static void setAabPackageName(String str) {
        if (!TextUtils.isEmpty(str)) {
            cz.zp(str);
        }
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && com.bytedance.sdk.openadsdk.core.KVG.jU().pvr() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.dT.KS.zp().zp(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z8) {
        com.bytedance.sdk.openadsdk.common.lMd.zp(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(final Context context, final InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        zp = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.KVG.zp(context);
        if (pAGInitCallback != null) {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (tG.jU() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.lMd.zp()) {
            lMd(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (isInitSuccess()) {
            jU();
            return;
        }
        tG.zp(3);
        if (context == null) {
            lMd(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        if (initConfig == null) {
            lMd(4000, "PAGConfig is null, please check.");
            return;
        }
        jU(context, initConfig);
        ApmHelper.initApm(context, initConfig);
        try {
            com.bytedance.sdk.openadsdk.core.ku.zp(new com.bytedance.sdk.openadsdk.core.vDp() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                @Override // com.bytedance.sdk.openadsdk.core.vDp
                public void fail(int i9, String str) {
                    PAGSdk.lMd(i9, str);
                }

                public void success() {
                    PAGSdk.jU();
                }
            });
            try {
                cz.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), "tt_ad_logo_txt");
                if (cz.jU(context, "tt_ad_logo") == 0) {
                    zp(initConfig, pAGInitCallback);
                    return;
                }
                if (isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        jU();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.KS.zp zpVar = new com.bytedance.sdk.openadsdk.KS.zp();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return com.bytedance.sdk.openadsdk.KS.zp.this;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    lMd(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp().zp(new com.bytedance.sdk.openadsdk.multipro.aidl.lMd() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.lMd
                        public void onServiceConnected() {
                            tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    PAGSdk.lMd(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp().KS();
                }
            } catch (Throwable unused) {
                zp(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            lMd(4000, "Internal Error, setting exception. ");
        }
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.lMd.zp()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            QUv.COT(new ku("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.12
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                }
            });
        }
    }

    private static void zp(InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        tG.zp(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                lMd(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                lMd(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.lMd.zp()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            QUv.COT(new ku("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.13
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                }
            });
        }
    }

    public static String getBiddingToken(String str) {
        if (com.bytedance.sdk.openadsdk.common.lMd.zp()) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.core.KVG.zp() == null || yRU.zp() == null) ? "" : yRU.zp().KS(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jU() {
        tG.zp(1);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                try {
                    Iterator<PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
        }
    }

    private static void zp(final Context context, final boolean z8, final InitConfig initConfig, final long j7, final long j9) {
        com.bytedance.sdk.openadsdk.dT.KS.zp();
        com.bytedance.sdk.openadsdk.dT.KS.zp("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean KS = com.bytedance.sdk.openadsdk.core.ku.lMd().KS();
                    jSONObject.put("duration", j7);
                    jSONObject.put("sdk_init_time", j9);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", PAGSdk.lMd(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", KS);
                    jSONObject.put("minSdkVersion", YhE.Bj(context));
                    jSONObject.put("targetSdkVersion", YhE.dT(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z8);
                    com.bytedance.sdk.openadsdk.core.ku.lMd().lMd(false);
                } catch (Exception e4) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.PAGSdk", "run: ", e4);
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("pangle_sdk_init").lMd(jSONObject.toString());
            }
        });
    }

    public static String getBiddingToken(Context context) {
        if (com.bytedance.sdk.openadsdk.common.lMd.zp()) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.KVG.zp(context);
        return getBiddingToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void KS() {
        ShortcutManager a6;
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context zp2 = com.bytedance.sdk.openadsdk.core.KVG.zp();
                if (zp2 == null || (a6 = a.a(zp2.getSystemService(a.b()))) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ku lMd = com.bytedance.sdk.openadsdk.core.ku.lMd();
                isRequestPinShortcutSupported = a6.isRequestPinShortcutSupported();
                lMd.zp(isRequestPinShortcutSupported);
            } catch (Throwable unused) {
            }
        }
    }

    public static String getBiddingToken() {
        if (com.bytedance.sdk.openadsdk.common.lMd.zp()) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.core.KVG.zp() == null || yRU.zp() == null) ? "" : yRU.zp().COT();
    }

    private static void KS(InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getData())) {
            com.bytedance.sdk.openadsdk.core.ku.lMd().lMd(initConfig.getData());
        }
        com.bytedance.sdk.openadsdk.core.ku.lMd().KS(lMd(initConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(Context context, InitConfig initConfig) {
        long j7;
        try {
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.utils.tG.zp("TTAD.PAGSdk", th.getMessage());
            long elapsedRealtime = SystemClock.elapsedRealtime() - zp;
            lMd(4000, th.getMessage());
            j7 = elapsedRealtime;
        }
        if (isInitSuccess()) {
            jU();
            return;
        }
        COT(context, initConfig);
        dQp.etV().ot();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - zp;
        jU();
        HWF(context, initConfig);
        j7 = elapsedRealtime2;
        zp(context, isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - zp, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lMd(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(int i9, String str) {
        tG.zp(2);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                try {
                    Iterator<PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i9, str);
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
        }
    }
}
