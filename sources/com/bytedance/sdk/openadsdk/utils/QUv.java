package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.ku.KS.HWF;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class QUv {
    private static volatile com.bytedance.sdk.component.ku.KS.HWF COT;
    private static volatile com.bytedance.sdk.component.ku.KS.HWF HWF;
    private static volatile com.bytedance.sdk.component.ku.KS.HWF KS;
    private static volatile com.bytedance.sdk.component.ku.KS.HWF QR;
    private static volatile com.bytedance.sdk.component.ku.KS.HWF YW;
    private static volatile com.bytedance.sdk.component.ku.KS.HWF dT;
    private static volatile com.bytedance.sdk.component.ku.KS.HWF jU;
    private static volatile com.bytedance.sdk.component.ku.KS.HWF ku;
    private static volatile boolean lMd;
    private static volatile ThreadPoolExecutor zp;

    static {
        com.bytedance.sdk.component.ku.KS.KS.zp(new com.bytedance.sdk.component.ku.KS.zp() { // from class: com.bytedance.sdk.openadsdk.utils.QUv.1
            @Override // com.bytedance.sdk.component.ku.KS.zp
            public void zp(com.bytedance.sdk.component.ku.KS.HWF hwf, com.bytedance.sdk.component.ku.KS.lMd lmd) {
                lmd.lMd();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.ku.KS.KS.zp(new com.bytedance.sdk.component.ku.KS.COT() { // from class: com.bytedance.sdk.openadsdk.utils.QUv.3
            @Override // com.bytedance.sdk.component.ku.KS.COT
            public void zp(final com.bytedance.sdk.component.ku.KS.HWF hwf) {
                if (!Lij.zp && hwf != null) {
                    try {
                        LinkedHashMap<String, com.bytedance.sdk.component.ku.KS.zp.zp> zp2 = hwf.zp();
                        if (zp2 != null && zp2.size() > 0) {
                            Iterator<Map.Entry<String, com.bytedance.sdk.component.ku.KS.zp.zp>> it = zp2.entrySet().iterator();
                            while (it.hasNext()) {
                                final com.bytedance.sdk.component.ku.KS.zp.zp value = it.next().getValue();
                                if (value != null) {
                                    com.bytedance.sdk.openadsdk.dT.KS.zp();
                                    com.bytedance.sdk.openadsdk.dT.KS.zp("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.utils.QUv.3.1
                                        @Override // com.bytedance.sdk.openadsdk.dT.lMd
                                        public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                                            int lMd2;
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("name", value.zp());
                                                jSONObject.put("times", value.lMd());
                                                jSONObject.put("runMaxTime", value.HWF());
                                                jSONObject.put("waitMaxTime", value.COT());
                                                if (value.lMd() == 0) {
                                                    lMd2 = 1;
                                                } else {
                                                    lMd2 = value.lMd();
                                                }
                                                long j7 = lMd2;
                                                jSONObject.put("avgRunTime", value.jU() / j7);
                                                jSONObject.put("avgWaitTime", value.KS() / j7);
                                                jSONObject.put("poolType", hwf.lMd());
                                            } catch (Exception e4) {
                                                com.bytedance.sdk.component.utils.tG.zp("ThreadUtils", "run: ", e4);
                                            }
                                            return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("pag_thread_pool_state").lMd(jSONObject.toString());
                                        }
                                    });
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }
        });
        zp = null;
        lMd = false;
    }

    private static ThreadPoolExecutor Bj() {
        int i9;
        if (zp == null) {
            synchronized (QUv.class) {
                try {
                    if (zp == null) {
                        if (com.bytedance.sdk.openadsdk.core.settings.dQp.ny()) {
                            i9 = com.bytedance.sdk.openadsdk.core.settings.dQp.etV().Rea();
                            lMd = true;
                        } else {
                            i9 = 4;
                        }
                        zp = new ThreadPoolExecutor(i9, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public static boolean COT() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean HWF() {
        String str;
        if (dT()) {
            str = "pag_log";
        } else {
            str = "csj_log";
        }
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    public static ExecutorService KS() {
        if (dT()) {
            return rV();
        }
        return com.bytedance.sdk.component.ku.HWF.jU();
    }

    private static com.bytedance.sdk.component.ku.KS.HWF KVG() {
        com.bytedance.sdk.component.ku.KS.HWF hwf;
        com.bytedance.sdk.component.ku.KS.HWF hwf2 = ku;
        if (zp(hwf2)) {
            synchronized (QUv.class) {
                try {
                    if (zp(ku)) {
                        try {
                            ku = zp("image", ku);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    hwf = ku;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hwf;
        }
        return hwf2;
    }

    public static ExecutorService QR() {
        if (dT()) {
            return woN();
        }
        return com.bytedance.sdk.component.ku.HWF.KS();
    }

    public static com.bytedance.sdk.component.ku.KS.HWF YW() {
        com.bytedance.sdk.component.ku.KS.HWF hwf;
        com.bytedance.sdk.component.ku.KS.HWF hwf2 = dT;
        if (zp(hwf2)) {
            synchronized (QUv.class) {
                try {
                    if (zp(dT)) {
                        try {
                            dT = zp("net", dT);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    hwf = dT;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hwf;
        }
        return hwf2;
    }

    private static com.bytedance.sdk.component.ku.KS.HWF dQp() {
        com.bytedance.sdk.component.ku.KS.HWF hwf;
        com.bytedance.sdk.component.ku.KS.HWF hwf2 = COT;
        if (zp(hwf2)) {
            synchronized (QUv.class) {
                try {
                    if (zp(COT)) {
                        try {
                            COT = zp("aidl", COT);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    hwf = COT;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hwf;
        }
        return hwf2;
    }

    public static boolean dT() {
        if (com.bytedance.sdk.openadsdk.core.settings.dQp.ny()) {
            return com.bytedance.sdk.openadsdk.core.settings.dQp.etV().iOI();
        }
        return false;
    }

    public static ExecutorService jU() {
        if (dT()) {
            return tG();
        }
        return com.bytedance.sdk.component.ku.HWF.lMd();
    }

    public static com.bytedance.sdk.component.ku.KS.HWF ku() {
        com.bytedance.sdk.component.ku.KS.HWF hwf;
        com.bytedance.sdk.component.ku.KS.HWF hwf2 = YW;
        if (zp(hwf2)) {
            synchronized (QUv.class) {
                try {
                    if (zp(YW)) {
                        try {
                            YW = zp("express", YW);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    hwf = YW;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hwf;
        }
        return hwf2;
    }

    public static ExecutorService lMd() {
        if (dT()) {
            return KVG();
        }
        return com.bytedance.sdk.component.ku.HWF.dT();
    }

    private static com.bytedance.sdk.component.ku.KS.HWF rV() {
        com.bytedance.sdk.component.ku.KS.HWF hwf;
        com.bytedance.sdk.component.ku.KS.HWF hwf2 = jU;
        if (zp(hwf2)) {
            synchronized (QUv.class) {
                try {
                    if (zp(jU)) {
                        try {
                            jU = zp("log", jU);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    hwf = jU;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hwf;
        }
        return hwf2;
    }

    private static com.bytedance.sdk.component.ku.KS.HWF tG() {
        com.bytedance.sdk.component.ku.KS.HWF hwf;
        com.bytedance.sdk.component.ku.KS.HWF hwf2 = HWF;
        if (zp(hwf2)) {
            synchronized (QUv.class) {
                try {
                    if (zp(HWF)) {
                        try {
                            HWF = zp("cache", HWF);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    hwf = HWF;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hwf;
        }
        return hwf2;
    }

    private static ThreadPoolExecutor vDp() {
        com.bytedance.sdk.component.ku.KS.HWF hwf;
        com.bytedance.sdk.component.ku.KS.HWF hwf2 = KS;
        if (zp(hwf2)) {
            synchronized (QUv.class) {
                try {
                    if (zp(KS)) {
                        try {
                            KS = zp("ad", KS);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    hwf = KS;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hwf;
        }
        return hwf2;
    }

    private static com.bytedance.sdk.component.ku.KS.HWF woN() {
        com.bytedance.sdk.component.ku.KS.HWF hwf;
        com.bytedance.sdk.component.ku.KS.HWF hwf2 = QR;
        if (zp(hwf2)) {
            synchronized (QUv.class) {
                try {
                    if (zp(QR)) {
                        try {
                            QR = zp("io", QR);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    hwf = QR;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hwf;
        }
        return hwf2;
    }

    public static ScheduledExecutorService zp() {
        return com.bytedance.sdk.component.ku.HWF.HWF();
    }

    public static void COT(final com.bytedance.sdk.component.ku.ku kuVar) {
        if (Lij.zp) {
            return;
        }
        if (dT()) {
            vDp().execute(new com.bytedance.sdk.component.ku.KS.lMd(kuVar.getName(), kuVar) { // from class: com.bytedance.sdk.openadsdk.utils.QUv.2
                @Override // java.lang.Runnable
                public void run() {
                    kuVar.run();
                }
            });
            return;
        }
        ThreadPoolExecutor Bj = Bj();
        Bj.execute(kuVar);
        if (lMd || !com.bytedance.sdk.openadsdk.core.settings.dQp.ny()) {
            return;
        }
        lMd = true;
        Bj.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.dQp.etV().Rea());
    }

    public static void zp(Runnable runnable) {
        if (runnable == null || Lij.zp) {
            return;
        }
        if (COT()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.tG.KS().post(runnable);
        }
    }

    public static void KS(final com.bytedance.sdk.component.ku.ku kuVar) {
        if (kuVar == null || Lij.zp) {
            return;
        }
        if (dT()) {
            rV().execute(new com.bytedance.sdk.component.ku.KS.lMd(kuVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.QUv.7
                @Override // java.lang.Runnable
                public void run() {
                    kuVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.ku.HWF.KS(kuVar);
        }
    }

    public static void jU(final com.bytedance.sdk.component.ku.ku kuVar) {
        if (kuVar == null || Lij.zp) {
            return;
        }
        if (dT()) {
            vDp().execute(new com.bytedance.sdk.component.ku.KS.lMd(kuVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.QUv.9
                @Override // java.lang.Runnable
                public void run() {
                    kuVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.ku.HWF.COT(kuVar);
        }
    }

    public static void lMd(final com.bytedance.sdk.component.ku.ku kuVar) {
        if (Lij.zp) {
            return;
        }
        if (dT()) {
            woN().execute(new com.bytedance.sdk.component.ku.KS.lMd(kuVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.QUv.5
                @Override // java.lang.Runnable
                public void run() {
                    kuVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.ku.HWF.lMd(kuVar);
        }
    }

    public static void zp(final com.bytedance.sdk.component.ku.ku kuVar) {
        if (Lij.zp) {
            return;
        }
        if (dT()) {
            tG().execute(new com.bytedance.sdk.component.ku.KS.lMd(kuVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.QUv.4
                @Override // java.lang.Runnable
                public void run() {
                    kuVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.ku.HWF.zp(kuVar);
        }
    }

    public static void KS(final com.bytedance.sdk.component.ku.ku kuVar, int i9) {
        if (kuVar == null || Lij.zp) {
            return;
        }
        if (dT()) {
            dQp().execute(new com.bytedance.sdk.component.ku.KS.lMd(kuVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.QUv.10
                @Override // java.lang.Runnable
                public void run() {
                    kuVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.ku.HWF.KS(kuVar, i9);
        }
    }

    public static void lMd(final com.bytedance.sdk.component.ku.ku kuVar, int i9) {
        if (kuVar == null || Lij.zp) {
            return;
        }
        if (dT()) {
            com.bytedance.sdk.component.ku.KS.lMd lmd = new com.bytedance.sdk.component.ku.KS.lMd(kuVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.QUv.8
                @Override // java.lang.Runnable
                public void run() {
                    kuVar.run();
                }
            };
            lmd.zp(i9);
            rV().execute(lmd);
            return;
        }
        com.bytedance.sdk.component.ku.HWF.lMd(kuVar, i9);
    }

    public static void zp(final com.bytedance.sdk.component.ku.ku kuVar, int i9) {
        if (kuVar == null || Lij.zp) {
            return;
        }
        if (dT()) {
            com.bytedance.sdk.component.ku.KS.lMd lmd = new com.bytedance.sdk.component.ku.KS.lMd(kuVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.QUv.6
                @Override // java.lang.Runnable
                public void run() {
                    kuVar.run();
                }
            };
            lmd.zp(i9);
            woN().execute(lmd);
            return;
        }
        com.bytedance.sdk.component.ku.HWF.zp(kuVar, 5, i9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static HWF.zp lMd(String str) {
        char c9;
        if (TextUtils.isEmpty(str)) {
            str = AppLovinMediationProvider.UNKNOWN;
        }
        HWF.zp zpVar = new HWF.zp();
        str.getClass();
        switch (str.hashCode()) {
            case -1308979344:
                if (str.equals("express")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 3107:
                if (str.equals("ad")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 3366:
                if (str.equals("io")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 107332:
                if (str.equals("log")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 108957:
                if (str.equals("net")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 94416770:
                if (str.equals("cache")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return zpVar.zp(str).zp(2).lMd(4).KS(0).zp(20000L).zp(true).COT(-1).jU(10).lMd(false);
            case 1:
                return zpVar.zp(str).zp(4).lMd(8).KS(0).zp(20000L).zp(true).COT(-1).jU(10).lMd(false);
            case 2:
                return zpVar.zp(str).zp(4).lMd(16).KS(0).zp(20000L).zp(true).COT(-1).jU(10).lMd(false);
            case 3:
                return zpVar.zp(str).zp(8).lMd(16).KS(2).zp(20000L).zp(true).COT(-1).jU(10).lMd(false);
            case 4:
                return zpVar.zp(str).zp(32).lMd(32).KS(0).zp(10000L).zp(true).COT(-1).jU(10).lMd(false);
            case 5:
                return zpVar.zp(str).zp(4).lMd(4).KS(0).zp(20000L).zp(true).COT(-1).jU(10).lMd(false);
            case 6:
                return zpVar.zp(str).zp(0).lMd(0).KS(0).zp(10000L).zp(true).COT(-1).jU(20).lMd(false);
            case 7:
                return zpVar.zp(str).zp(3).lMd(3).KS(0).zp(20000L).zp(true).COT(-1).jU(10).lMd(false);
            default:
                return zpVar.zp(str).zp(8).lMd(16).KS(2).zp(20000L).zp(true).COT(10).jU(10).lMd(false);
        }
    }

    public static void zp(com.bytedance.sdk.component.ku.KS.lMd lmd) {
        YW().execute(lmd);
    }

    private static boolean zp(com.bytedance.sdk.component.ku.KS.HWF hwf) {
        if (hwf != null) {
            return !hwf.KS() && com.bytedance.sdk.openadsdk.core.settings.dQp.ny();
        }
        return true;
    }

    private static com.bytedance.sdk.component.ku.KS.HWF zp(String str, com.bytedance.sdk.component.ku.KS.HWF hwf) {
        HWF.zp zp2 = zp(str);
        if (hwf == null) {
            return zp2.zp();
        }
        hwf.zp(zp2);
        return hwf;
    }

    private static HWF.zp zp(String str) {
        HWF.zp lMd2 = lMd(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.dQp.ny()) {
                lMd2.lMd(true);
                JSONObject zR = com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zR();
                JSONObject optJSONObject = zR != null ? zR.optJSONObject(str) : null;
                if (optJSONObject != null) {
                    lMd2.lMd(true);
                    if (optJSONObject.has("coreSize")) {
                        lMd2.zp(optJSONObject.optInt("coreSize"));
                    }
                    if (optJSONObject.has("maxSize")) {
                        lMd2.lMd(optJSONObject.optInt("maxSize"));
                    }
                    if (optJSONObject.has("createSize")) {
                        lMd2.KS(optJSONObject.optInt("createSize"));
                    }
                    if (optJSONObject.has("keepAlive")) {
                        lMd2.zp(optJSONObject.optInt("keepAlive"));
                    }
                    if (optJSONObject.has("allowCoreTimeOut")) {
                        lMd2.zp(optJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (optJSONObject.has("reportLogThreshold")) {
                        lMd2.COT(optJSONObject.optInt("reportLogThreshold"));
                    }
                    if (optJSONObject.has("logTaskCount")) {
                        lMd2.jU(optJSONObject.optInt("logTaskCount"));
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return lMd2;
    }
}
