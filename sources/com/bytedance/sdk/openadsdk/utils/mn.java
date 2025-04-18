package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.qsH.tN.vc;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
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
public class mn {
    private static volatile com.bytedance.sdk.component.qsH.tN.vc AlY;
    private static volatile com.bytedance.sdk.component.qsH.tN.vc DSW;
    private static volatile com.bytedance.sdk.component.qsH.tN.vc NjR;
    private static volatile boolean Sg;
    private static volatile ThreadPoolExecutor YFl;
    private static volatile com.bytedance.sdk.component.qsH.tN.vc eT;

    /* renamed from: nc, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.qsH.tN.vc f10835nc;
    private static volatile com.bytedance.sdk.component.qsH.tN.vc qsH;
    private static volatile com.bytedance.sdk.component.qsH.tN.vc tN;

    /* renamed from: vc, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.qsH.tN.vc f10836vc;
    private static volatile com.bytedance.sdk.component.qsH.tN.vc wN;

    static {
        com.bytedance.sdk.component.qsH.tN.tN.YFl(new com.bytedance.sdk.component.qsH.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.utils.mn.1
            @Override // com.bytedance.sdk.component.qsH.tN.YFl
            public void YFl(com.bytedance.sdk.component.qsH.tN.vc vcVar, com.bytedance.sdk.component.qsH.tN.Sg sg2) {
                sg2.Sg();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.qsH.tN.tN.YFl(new com.bytedance.sdk.component.qsH.tN.wN() { // from class: com.bytedance.sdk.openadsdk.utils.mn.3
            @Override // com.bytedance.sdk.component.qsH.tN.wN
            public void YFl(final com.bytedance.sdk.component.qsH.tN.vc vcVar) {
                if (!Cfr.YFl && vcVar != null) {
                    try {
                        LinkedHashMap<String, com.bytedance.sdk.component.qsH.tN.YFl.YFl> YFl2 = vcVar.YFl();
                        if (YFl2 != null && YFl2.size() > 0) {
                            Iterator<Map.Entry<String, com.bytedance.sdk.component.qsH.tN.YFl.YFl>> it = YFl2.entrySet().iterator();
                            while (it.hasNext()) {
                                final com.bytedance.sdk.component.qsH.tN.YFl.YFl value = it.next().getValue();
                                if (value != null) {
                                    com.bytedance.sdk.openadsdk.pDU.tN.YFl();
                                    com.bytedance.sdk.openadsdk.pDU.tN.YFl("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.utils.mn.3.1
                                        @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                                        public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                                            int Sg2;
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("name", value.YFl());
                                                jSONObject.put("times", value.Sg());
                                                jSONObject.put("runMaxTime", value.vc());
                                                jSONObject.put("waitMaxTime", value.wN());
                                                if (value.Sg() == 0) {
                                                    Sg2 = 1;
                                                } else {
                                                    Sg2 = value.Sg();
                                                }
                                                long j3 = Sg2;
                                                jSONObject.put("avgRunTime", value.AlY() / j3);
                                                jSONObject.put("avgWaitTime", value.tN() / j3);
                                                jSONObject.put("poolType", vcVar.Sg());
                                            } catch (Exception e2) {
                                                com.bytedance.sdk.component.utils.YoT.YFl("ThreadUtils", "run: ", e2);
                                            }
                                            return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("pag_thread_pool_state").Sg(jSONObject.toString());
                                        }
                                    });
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
            }
        });
        YFl = null;
        Sg = false;
    }

    public static ExecutorService AlY() {
        if (eT()) {
            return pDU();
        }
        return com.bytedance.sdk.component.qsH.vc.Sg();
    }

    public static ExecutorService DSW() {
        if (eT()) {
            return Wwa();
        }
        return com.bytedance.sdk.component.qsH.vc.tN();
    }

    private static com.bytedance.sdk.component.qsH.tN.vc EH() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = AlY;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(AlY)) {
                    try {
                        AlY = YFl("log", AlY);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = AlY;
            }
            return vcVar;
        }
        return vcVar2;
    }

    private static ThreadPoolExecutor GA() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = tN;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(tN)) {
                    try {
                        tN = YFl("ad", tN);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = tN;
            }
            return vcVar;
        }
        return vcVar2;
    }

    public static com.bytedance.sdk.component.qsH.tN.vc NjR() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = eT;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(eT)) {
                    try {
                        eT = YFl("monitor", eT);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = eT;
            }
            return vcVar;
        }
        return vcVar2;
    }

    public static ExecutorService Sg() {
        if (eT()) {
            return lG();
        }
        return com.bytedance.sdk.component.qsH.vc.nc();
    }

    private static com.bytedance.sdk.component.qsH.tN.vc Wwa() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = DSW;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(DSW)) {
                    try {
                        DSW = YFl("io", DSW);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = DSW;
            }
            return vcVar;
        }
        return vcVar2;
    }

    public static ScheduledExecutorService YFl() {
        return com.bytedance.sdk.component.qsH.vc.vc();
    }

    private static ThreadPoolExecutor YoT() {
        int i10;
        if (YFl == null) {
            synchronized (mn.class) {
                if (YFl == null) {
                    if (com.bytedance.sdk.openadsdk.core.settings.rkt.HVP()) {
                        i10 = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().rE();
                        Sg = true;
                    } else {
                        i10 = 4;
                    }
                    YFl = new ThreadPoolExecutor(i10, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                }
            }
        }
        return YFl;
    }

    public static boolean eT() {
        if (com.bytedance.sdk.openadsdk.core.settings.rkt.HVP()) {
            return com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().SVa();
        }
        return true;
    }

    private static com.bytedance.sdk.component.qsH.tN.vc lG() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = qsH;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(qsH)) {
                    try {
                        qsH = YFl("image", qsH);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = qsH;
            }
            return vcVar;
        }
        return vcVar2;
    }

    public static com.bytedance.sdk.component.qsH.tN.vc nc() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = f10835nc;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(f10835nc)) {
                    try {
                        f10835nc = YFl("net", f10835nc);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = f10835nc;
            }
            return vcVar;
        }
        return vcVar2;
    }

    private static com.bytedance.sdk.component.qsH.tN.vc pDU() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = f10836vc;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(f10836vc)) {
                    try {
                        f10836vc = YFl("cache", f10836vc);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = f10836vc;
            }
            return vcVar;
        }
        return vcVar2;
    }

    public static com.bytedance.sdk.component.qsH.tN.vc qsH() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = NjR;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(NjR)) {
                    try {
                        NjR = YFl("express", NjR);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = NjR;
            }
            return vcVar;
        }
        return vcVar2;
    }

    private static com.bytedance.sdk.component.qsH.tN.vc rkt() {
        com.bytedance.sdk.component.qsH.tN.vc vcVar;
        com.bytedance.sdk.component.qsH.tN.vc vcVar2 = wN;
        if (YFl(vcVar2)) {
            synchronized (mn.class) {
                if (YFl(wN)) {
                    try {
                        wN = YFl("aidl", wN);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                vcVar = wN;
            }
            return vcVar;
        }
        return vcVar2;
    }

    public static ExecutorService tN() {
        if (eT()) {
            return EH();
        }
        return com.bytedance.sdk.component.qsH.vc.AlY();
    }

    public static boolean vc() {
        String str;
        if (eT()) {
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

    public static boolean wN() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void YFl(Runnable runnable) {
        if (runnable == null || Cfr.YFl) {
            return;
        }
        if (wN()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.pDU.tN().post(runnable);
        }
    }

    public static void wN(final com.bytedance.sdk.component.qsH.qsH qsh) {
        if (Cfr.YFl) {
            return;
        }
        if (eT()) {
            GA().execute(new com.bytedance.sdk.component.qsH.tN.Sg(qsh.getName(), qsh) { // from class: com.bytedance.sdk.openadsdk.utils.mn.2
                @Override // java.lang.Runnable
                public void run() {
                    qsh.run();
                }
            });
            return;
        }
        ThreadPoolExecutor YoT = YoT();
        YoT.execute(qsh);
        if (Sg || !com.bytedance.sdk.openadsdk.core.settings.rkt.HVP()) {
            return;
        }
        Sg = true;
        YoT.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().rE());
    }

    public static void AlY(final com.bytedance.sdk.component.qsH.qsH qsh) {
        if (qsh == null || Cfr.YFl) {
            return;
        }
        if (eT()) {
            GA().execute(new com.bytedance.sdk.component.qsH.tN.Sg(qsh.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.mn.9
                @Override // java.lang.Runnable
                public void run() {
                    qsh.run();
                }
            });
        } else {
            com.bytedance.sdk.component.qsH.vc.wN(qsh);
        }
    }

    public static void Sg(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.pDU.tN().removeCallbacks(runnable);
    }

    public static void tN(final com.bytedance.sdk.component.qsH.qsH qsh) {
        if (qsh == null || Cfr.YFl) {
            return;
        }
        if (eT()) {
            EH().execute(new com.bytedance.sdk.component.qsH.tN.Sg(qsh.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.mn.7
                @Override // java.lang.Runnable
                public void run() {
                    qsh.run();
                }
            });
        } else {
            com.bytedance.sdk.component.qsH.vc.tN(qsh);
        }
    }

    public static void Sg(final com.bytedance.sdk.component.qsH.qsH qsh) {
        if (Cfr.YFl) {
            return;
        }
        if (eT()) {
            Wwa().execute(new com.bytedance.sdk.component.qsH.tN.Sg(qsh.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.mn.5
                @Override // java.lang.Runnable
                public void run() {
                    qsh.run();
                }
            });
        } else {
            com.bytedance.sdk.component.qsH.vc.Sg(qsh);
        }
    }

    public static void YFl(final com.bytedance.sdk.component.qsH.qsH qsh) {
        if (Cfr.YFl) {
            return;
        }
        if (eT()) {
            pDU().execute(new com.bytedance.sdk.component.qsH.tN.Sg(qsh.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.mn.4
                @Override // java.lang.Runnable
                public void run() {
                    qsh.run();
                }
            });
        } else {
            com.bytedance.sdk.component.qsH.vc.YFl(qsh);
        }
    }

    public static void tN(final com.bytedance.sdk.component.qsH.qsH qsh, int i10) {
        if (qsh == null || Cfr.YFl) {
            return;
        }
        if (eT()) {
            rkt().execute(new com.bytedance.sdk.component.qsH.tN.Sg(qsh.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.mn.10
                @Override // java.lang.Runnable
                public void run() {
                    qsh.run();
                }
            });
        } else {
            com.bytedance.sdk.component.qsH.vc.tN(qsh, i10);
        }
    }

    public static void Sg(final com.bytedance.sdk.component.qsH.qsH qsh, int i10) {
        if (qsh == null || Cfr.YFl) {
            return;
        }
        if (eT()) {
            com.bytedance.sdk.component.qsH.tN.Sg sg2 = new com.bytedance.sdk.component.qsH.tN.Sg(qsh.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.mn.8
                @Override // java.lang.Runnable
                public void run() {
                    qsh.run();
                }
            };
            sg2.YFl(i10);
            EH().execute(sg2);
            return;
        }
        com.bytedance.sdk.component.qsH.vc.Sg(qsh, i10);
    }

    public static void YFl(final com.bytedance.sdk.component.qsH.qsH qsh, int i10) {
        if (qsh == null || Cfr.YFl) {
            return;
        }
        if (eT()) {
            com.bytedance.sdk.component.qsH.tN.Sg sg2 = new com.bytedance.sdk.component.qsH.tN.Sg(qsh.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.mn.6
                @Override // java.lang.Runnable
                public void run() {
                    qsh.run();
                }
            };
            sg2.YFl(i10);
            Wwa().execute(sg2);
            return;
        }
        com.bytedance.sdk.component.qsH.vc.YFl(qsh, 5, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static vc.YFl Sg(String str) {
        char c10;
        if (TextUtils.isEmpty(str)) {
            str = AppLovinMediationProvider.UNKNOWN;
        }
        vc.YFl yFl = new vc.YFl();
        str.getClass();
        switch (str.hashCode()) {
            case -1308979344:
                if (str.equals("express")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3107:
                if (str.equals("ad")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3366:
                if (str.equals("io")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 107332:
                if (str.equals("log")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 108957:
                if (str.equals("net")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 94416770:
                if (str.equals("cache")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1236319578:
                if (str.equals("monitor")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return yFl.YFl(str).YFl(2).Sg(4).tN(0).YFl(10000L).YFl(true).wN(-1).AlY(10).Sg(false);
            case 1:
                return yFl.YFl(str).YFl(4).Sg(4).tN(0).YFl(20000L).YFl(true).wN(-1).AlY(10).Sg(false);
            case 2:
                return yFl.YFl(str).YFl(4).Sg(10).tN(0).YFl(20000L).YFl(true).wN(-1).AlY(10).Sg(false);
            case 3:
                return yFl.YFl(str).YFl(4).Sg(6).tN(2).YFl(20000L).YFl(true).wN(-1).AlY(10).Sg(false);
            case 4:
                return yFl.YFl(str).YFl(10).Sg(10).tN(0).YFl(10000L).YFl(true).wN(-1).AlY(10).Sg(false);
            case 5:
                return yFl.YFl(str).YFl(2).Sg(4).tN(0).YFl(10000L).YFl(true).wN(-1).AlY(10).Sg(false);
            case 6:
                return yFl.YFl(str).YFl(0).Sg(0).tN(0).YFl(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS).YFl(true).wN(-1).AlY(20).Sg(false);
            case 7:
                return yFl.YFl(str).YFl(3).Sg(3).tN(0).YFl(20000L).YFl(true).wN(-1).AlY(10).Sg(false);
            case '\b':
                return yFl.YFl(str).YFl(2).Sg(2).tN(0).YFl(10000L).YFl(true).wN(-1).AlY(10).Sg(false);
            default:
                return yFl.YFl(str).YFl(8).Sg(16).tN(2).YFl(20000L).YFl(true).wN(-1).AlY(10).Sg(false);
        }
    }

    public static void YFl(com.bytedance.sdk.component.qsH.tN.Sg sg2) {
        nc().execute(sg2);
    }

    private static boolean YFl(com.bytedance.sdk.component.qsH.tN.vc vcVar) {
        if (vcVar != null) {
            return !vcVar.tN() && com.bytedance.sdk.openadsdk.core.settings.rkt.HVP();
        }
        return true;
    }

    private static com.bytedance.sdk.component.qsH.tN.vc YFl(String str, com.bytedance.sdk.component.qsH.tN.vc vcVar) {
        vc.YFl YFl2 = YFl(str);
        if (vcVar == null) {
            return YFl2.YFl();
        }
        vcVar.YFl(YFl2);
        return vcVar;
    }

    private static vc.YFl YFl(String str) {
        vc.YFl Sg2 = Sg(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.rkt.HVP()) {
                Sg2.Sg(true);
                JSONObject Gmi = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().Gmi();
                JSONObject optJSONObject = Gmi != null ? Gmi.optJSONObject(str) : null;
                if (optJSONObject != null) {
                    Sg2.Sg(true);
                    if (optJSONObject.has("coreSize")) {
                        Sg2.YFl(optJSONObject.optInt("coreSize"));
                    }
                    if (optJSONObject.has("maxSize")) {
                        Sg2.Sg(optJSONObject.optInt("maxSize"));
                    }
                    if (optJSONObject.has("createSize")) {
                        Sg2.tN(optJSONObject.optInt("createSize"));
                    }
                    if (optJSONObject.has("keepAlive")) {
                        Sg2.YFl(optJSONObject.optInt("keepAlive"));
                    }
                    if (optJSONObject.has("allowCoreTimeOut")) {
                        Sg2.YFl(optJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (optJSONObject.has("reportLogThreshold")) {
                        Sg2.wN(optJSONObject.optInt("reportLogThreshold"));
                    }
                    if (optJSONObject.has("logTaskCount")) {
                        Sg2.AlY(optJSONObject.optInt("logTaskCount"));
                    }
                }
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return Sg2;
    }
}
