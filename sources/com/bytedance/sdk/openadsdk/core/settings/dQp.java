package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.TTSdkSettings;
import com.bytedance.sdk.openadsdk.core.settings.jU;
import com.bytedance.sdk.openadsdk.core.settings.rV;
import com.bytedance.sdk.openadsdk.core.settings.tG;
import com.bytedance.sdk.openadsdk.lMd.zp.rV;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.vungle.ads.internal.signals.j;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dQp implements COT, tG.zp {
    private final vDp Bj;
    jU.lMd<com.bytedance.sdk.openadsdk.lMd.zp.rV> COT;
    private final BroadcastReceiver FP;
    private int KVG;
    private jU.lMd<JSONObject> Lij;
    private Set<String> QR;
    private final jU.lMd<Set<String>> RCv;
    private int dQp;
    private final YW dT;
    final jU.lMd<ConcurrentHashMap<String, Integer>> jU;
    private final Runnable ot;
    private final Set<String> ox;
    private ku pvr;
    private boolean rV;
    private volatile boolean tG;
    private final AtomicBoolean vDp;
    private final ConcurrentLinkedQueue<rV.zp> vwr;
    private boolean woN;
    private final jU.lMd<Map<String, Integer>> yRU;
    private static final String HWF = YhE.rV();
    private static final com.bytedance.sdk.component.ku.ku ku = new com.bytedance.sdk.component.ku.ku("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.adexpress.zp.lMd.COT.lMd().YW();
            com.bytedance.sdk.component.adexpress.zp.lMd.COT.lMd().lMd(false);
            com.bytedance.sdk.component.adexpress.zp.lMd.lMd.lMd();
            com.bytedance.sdk.component.adexpress.zp.lMd.COT.lMd().KS();
        }
    };
    public static String zp = "";
    public static String lMd = "IABTCF_TCString";
    private static boolean YW = false;
    private static final dT cz = new dT();
    static final ConcurrentHashMap<String, Integer> KS = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.dQp$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass11 extends BroadcastReceiver {
        private final Runnable lMd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.11.1
            @Override // java.lang.Runnable
            public void run() {
                QUv.lMd(new com.bytedance.sdk.component.ku.ku("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.11.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            dQp.this.lMd();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        public AnonymousClass11() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            QUv.lMd(new com.bytedance.sdk.component.ku.ku("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.11.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        dQp.this.zp(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.ku.zp().removeCallbacks(AnonymousClass11.this.lMd);
                        com.bytedance.sdk.component.utils.ku.zp().postDelayed(AnonymousClass11.this.lMd, 10000L);
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static final class zp {
        static final dQp zp = new dQp();
    }

    private int Iok() {
        return this.Bj.zp("coppa", -99);
    }

    private static int KS(boolean z8) {
        return z8 ? 20 : 5;
    }

    public static COT etV() {
        if (KVG.zp() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("context is null");
            Log.e("Pangle", "context is null", illegalStateException);
            ApmHelper.reportCustomError("context is null", "context is null", illegalStateException);
            return cz;
        }
        return zp.zp;
    }

    private long fw() {
        long zp2 = this.Bj.zp("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        if (zp2 < 0 || zp2 > j.TWENTY_FOUR_HOURS_MILLIS) {
            return TTAdConstant.AD_MAX_EVENT_TIME;
        }
        return zp2;
    }

    public static void hRp() {
        Context zp2;
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS() && (zp2 = KVG.zp()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(zp2.getPackageName());
                intent.setAction("_dataChanged");
                zp2.sendBroadcast(intent);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.SdkSettings", "", th);
            }
        }
    }

    private Set<String> hl() {
        return (Set) this.Bj.zp("perf_con_applog_send", this.ox, this.RCv);
    }

    @Nullable
    private static SharedPreferences jU(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean ny() {
        return YW;
    }

    private long pdH() {
        return this.Bj.zp("last_req_time", 0L);
    }

    private String rOJ() {
        return this.Bj.zp("force_language", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String BO() {
        return this.Bj.zp("dc", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int Bj() {
        return this.Bj.zp("load_callback_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    @Nullable
    public JSONObject COT() {
        return (JSONObject) this.Bj.zp("digest", null, jU.zp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean CZ() {
        return this.Bj.zp("bus_con_adshow_check_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean DY() {
        int zp2 = this.Bj.zp("perf_con_apm", 100);
        if (zp2 == 0) {
            return false;
        }
        if (zp2 >= 0 && zp2 < 100 && zp2 <= ((int) (Math.random() * 100.0d))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean Eg() {
        if (this.Bj.zp("perf_con_adlog_turn_off_retry_stats", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String FP() {
        return this.Bj.zp("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public com.bytedance.sdk.openadsdk.lMd.zp.rV Fm() {
        return (com.bytedance.sdk.openadsdk.lMd.zp.rV) this.Bj.zp("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.lMd.zp.rV.zp, this.COT);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int GP() {
        int zp2 = this.Bj.zp("perf_con_webview_preload_cache_v3", 0);
        if (zp2 < 0) {
            return 0;
        }
        if (zp2 > 5) {
            return 5;
        }
        int Vjb = Vjb();
        if (zp2 > Vjb) {
            return Vjb;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String Gzh() {
        return this.Bj.zp("playableLoadH5Url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public long HWF() {
        return this.Bj.zp("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String HaA() {
        return this.Bj.zp("bus_con_check_clz", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int Iv() {
        return this.Bj.zp("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int KVG() {
        hl();
        return this.dQp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public HWF Lij() {
        return (HWF) this.Bj.zp("insert_js_config", HWF.zp, new jU.lMd<HWF>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public HWF lMd(String str) {
                return new HWF(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean MBR() {
        return this.tG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String Ml() {
        return this.Bj.zp("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void Np() {
        this.rV = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int PI() {
        return this.Bj.zp("perf_con_close_button_delay_check_time", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int Pxi() {
        return this.Bj.zp("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void QR() {
        this.Bj.zp().zp("tt_sdk_settings").zp("ab_test_param").zp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int QUv(String str) {
        Integer num;
        Map map = (Map) this.Bj.zp("perf_con_applog_rate", null, this.yRU);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int RCv() {
        return this.Bj.zp(AppLovinMediationProvider.MAX, 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean REM() {
        if (this.Bj.zp("perf_con_apm_native", Integer.MAX_VALUE) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean RRQ() {
        if (this.Bj.zp("perf_con_is_new_net_thread", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int Rea() {
        int zp2 = this.Bj.zp("bus_con_token_thread_count", 4);
        if (zp2 <= 0 || zp2 > 30) {
            return 4;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean Rg() {
        int zp2 = this.Bj.zp("privacy_ad_enable", Integer.MAX_VALUE);
        if (zp2 == 1) {
            return true;
        }
        if (zp2 == 0) {
            return false;
        }
        int KVG = YhE.KVG();
        if (KVG == 1 || KVG == 2 || KVG == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean Rh() {
        if (this.Bj.zp("bus_con_sec_type", Integer.MAX_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public void Sr() {
        if (!tG.zp()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.tG.lMd().removeCallbacks(this.ot);
        com.bytedance.sdk.openadsdk.core.tG.lMd().postDelayed(this.ot, fw());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public long TS() {
        long zp2 = this.Bj.zp("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME);
        if (zp2 < 10000) {
            return 10000L;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String UPs() {
        return this.Bj.zp("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int Vjb() {
        int zp2 = this.Bj.zp("perf_con_webview_cache_count_v3", 0);
        if (zp2 < 0) {
            return 0;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int VuU() {
        int zp2 = this.Bj.zp("bus_con_auto_click_delay", 3000);
        if (zp2 <= 0) {
            return 3000;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean WNy() {
        return this.Bj.lMd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean YW() {
        return this.Bj.zp("support_tnc", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean YcG() {
        if (!com.bytedance.sdk.component.adexpress.jU.lMd.zp(KVG.zp())) {
            return false;
        }
        return this.Bj.zp("support_rtl", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int YhE() {
        return this.Bj.zp("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int aax() {
        return this.Bj.zp("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean bQm() {
        if (this.Bj.zp("perf_con_adlog_turn_off_retry_ad", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int bX() {
        return this.Bj.zp("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void cW() {
        String rOJ = rOJ();
        if (!TextUtils.isEmpty(rOJ)) {
            if (rOJ.equals("zh-Hant")) {
                com.bytedance.sdk.component.utils.dT.zp(KVG.zp(), "zh", "tw");
            } else {
                com.bytedance.sdk.component.utils.dT.zp(KVG.zp(), rOJ, null);
            }
            try {
                TTAdDislikeToast.zp();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.SdkSettings", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int cz() {
        return this.Bj.zp("loadedCallbackOpportunity", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int dQp() {
        hl();
        return this.KVG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String dT() {
        return this.Bj.zp("ab_test_version", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String eWG() {
        return this.Bj.zp("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String eyb() {
        return this.Bj.zp("dual_event_url", (String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String fRl() {
        return this.Bj.zp("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public JSONObject fVt() {
        return (JSONObject) this.Bj.zp("video_cache_config", null, jU.zp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String ffE() {
        return this.Bj.zp("apm_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean fgJ() {
        if (this.Bj.zp("read_video_from_cache", 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int fs() {
        int zp2 = this.Bj.zp("perf_con_webview_preload_cache", 0);
        if (zp2 < 0) {
            return 0;
        }
        if (zp2 > 5) {
            return 5;
        }
        int qtv = qtv();
        if (zp2 > qtv) {
            return qtv;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean gH() {
        return this.Bj.zp("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean iOI() {
        if (this.Bj.zp("perf_con_use_new_thread_pool", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int irS() {
        int zp2 = this.Bj.zp("fetch_tpl_timeout_ctrl", 3000);
        if (zp2 <= 0) {
            return 3000;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean ku() {
        return this.Bj.zp("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String[] mW() {
        Set<String> set;
        try {
            set = this.QR;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.Bj.zp("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    this.QR.add(jSONArray.getString(i9));
                }
            }
            Set<String> zp2 = vDp.zp(this.QR);
            this.QR = zp2;
            if (zp2 != null) {
                if (zp2.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.QR.toArray(new String[0]);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean oB() {
        if (this.Bj.zp("global_rate", 1.0f) == 1.0f) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String oKZ() {
        return this.Bj.zp("dyn_draw_engine_url", HWF);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    @NonNull
    public ku ot() {
        ku kuVar = this.pvr;
        if (kuVar != null) {
            return kuVar;
        }
        ku kuVar2 = (ku) this.dT.zp("mediation_init_conf", ku.zp, new jU.lMd<ku>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public ku lMd(String str) {
                return new ku(str);
            }
        });
        this.pvr = kuVar2;
        return kuVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public long ox() {
        return this.Bj.zp("duration", 10000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean pvr() {
        return this.Bj.zp("ad_revenue_enable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int qtv() {
        int zp2 = this.Bj.zp("perf_con_webview_cache_count", 0);
        if (zp2 < 0) {
            return 0;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean rCC() {
        if (this.Bj.zp("privacy_debug_unlock", 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public Set<String> rV() {
        return hl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int si() {
        int zp2 = this.Bj.zp("privacy_personalized_ad", Integer.MAX_VALUE);
        if (zp2 != Integer.MAX_VALUE) {
            return zp2;
        }
        int KVG = YhE.KVG();
        if (KVG == 1 || KVG == 2) {
            return 2;
        }
        if (KVG == 3) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int sqt() {
        return this.Bj.zp("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean tG() {
        return this.Bj.zp("support_mem_dynamic", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean tyQ() {
        if (this.Bj.zp("bus_con_video_keep_screen_on", 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int vDp() {
        return this.Bj.zp("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public long vLi() {
        return this.Bj.zp("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean vwr() {
        return this.Bj.zp("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean woN() {
        return this.Bj.zp("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int xg() {
        return this.Bj.zp("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean yRU() {
        return this.Bj.zp("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public JSONObject zR() {
        return (JSONObject) this.Bj.zp("perf_con_thread_pool_config", new JSONObject(), this.Lij);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int zpV() {
        return this.Bj.zp("bus_con_send_log_type", 1);
    }

    private dQp() {
        this.QR = Collections.synchronizedSet(new HashSet());
        this.dT = new YW();
        this.Bj = new vDp(new rV.zp() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.6
            @Override // com.bytedance.sdk.openadsdk.core.settings.rV.zp
            public void zp() {
                rV.zp[] zpVarArr;
                boolean unused = dQp.YW = true;
                if (dQp.this.vwr != null && dQp.this.vwr.size() != 0 && (zpVarArr = (rV.zp[]) dQp.this.vwr.toArray()) != null) {
                    for (rV.zp zpVar : zpVarArr) {
                        zpVar.zp();
                    }
                }
            }
        });
        this.vDp = new AtomicBoolean(false);
        this.tG = false;
        this.rV = false;
        this.dQp = 5000;
        this.KVG = 10;
        this.vwr = new ConcurrentLinkedQueue<>();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.FP = anonymousClass11;
        this.ot = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.12
            @Override // java.lang.Runnable
            public void run() {
                dQp.this.jU(2);
                dQp.this.Sr();
            }
        };
        this.jU = new jU.lMd<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.13
            @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> lMd(String str) {
                if (TextUtils.isEmpty(str)) {
                    return dQp.KS;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int optInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && optInt >= 0 && optInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(optInt));
                        }
                    }
                } catch (JSONException e4) {
                    Log.i("TTAD.SdkSettings", e4.getMessage());
                }
                return concurrentHashMap;
            }
        };
        this.yRU = new jU.lMd<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> lMd(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap hashMap = new HashMap(jSONObject.length());
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int optInt = jSONObject.optInt(next, 100);
                            if (optInt >= 0 && optInt <= 100) {
                                hashMap.put(next, Integer.valueOf(optInt));
                            } else {
                                hashMap.put(next, 100);
                            }
                        }
                    }
                    return hashMap;
                } catch (Exception e4) {
                    com.bytedance.sdk.component.utils.tG.lMd("get applog rate from sp failed:" + e4.getMessage());
                    return null;
                }
            }
        };
        this.ox = new HashSet();
        this.RCv = new jU.lMd<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public Set<String> lMd(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("applog_count");
                        if (optInt >= 2 && optInt <= 100) {
                            dQp.this.KVG = optInt;
                        }
                        int optInt2 = jSONObject.optInt("applog_interval");
                        if (optInt2 >= 100 && optInt2 <= 30000) {
                            dQp.this.dQp = optInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                String string = jSONArray.getString(i9);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e4) {
                        Log.i("TTAD.SdkSettings", e4.getMessage());
                    }
                }
                if (hashSet.size() == 0) {
                    return new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "show", "insight_log", "mrc_show"));
                }
                return hashSet;
            }
        };
        this.Lij = new jU.lMd<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public JSONObject lMd(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return new JSONObject();
                }
                return jSONObject;
            }
        };
        this.COT = new jU.lMd<com.bytedance.sdk.openadsdk.lMd.zp.rV>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.jU.lMd
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.lMd.zp.rV lMd(String str) {
                com.bytedance.sdk.openadsdk.lMd.zp.rV rVVar = new com.bytedance.sdk.openadsdk.lMd.zp.rV();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    rVVar.zp(jSONObject.optInt("enable_strategy", 0) == 1);
                    rVVar.zp(zp(jSONObject.optJSONObject("default")));
                    JSONObject optJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            rVVar.zp(next, zp(optJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return rVVar;
            }

            private rV.zp zp(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new rV.zp(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS() && !tG.zp()) {
                Context zp2 = KVG.zp();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("_dataChanged");
                if (Build.VERSION.SDK_INT >= 33) {
                    zp2.registerReceiver(anonymousClass11, intentFilter, 4);
                } else {
                    zp2.registerReceiver(anonymousClass11, intentFilter);
                }
            }
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.SdkSettings", "", e4);
        }
    }

    public static String KS(Context context) {
        SharedPreferences jU;
        return (context == null || (jU = jU(context)) == null) ? "" : jU.getString(lMd, "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean Bj(String str) {
        try {
            return Gzh(str).ot != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean COT(String str) {
        int i9 = Gzh(str).COT;
        if (i9 != 1) {
            return i9 == 2 && com.bytedance.sdk.component.utils.KVG.KS(KVG.zp()) != 0;
        }
        return com.bytedance.sdk.component.utils.KVG.jU(KVG.zp());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int FP(String str) {
        return Gzh(str).Lij;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    @NonNull
    public com.bytedance.sdk.openadsdk.core.settings.zp Gzh(String str) {
        return lMd.zp(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean HWF(String str) {
        return Gzh(str).QR == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean Lij(String str) {
        return KVG.jU().Gzh(str).rV == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int QR(String str) {
        return Gzh(str).woN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int RCv(String str) {
        return Gzh(str).YhE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int YW(String str) {
        if (str == null) {
            return 1500;
        }
        return Gzh(str).dQp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int cz(String str) {
        return Gzh(str).RCv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int dT(String str) {
        return Gzh(str).Bj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean irS(@NonNull String str) {
        Set set = (Set) this.Bj.zp("privacy_fields_allowed", Collections.emptySet(), jU.lMd);
        if (set.isEmpty()) {
            int KVG = YhE.KVG();
            if (KVG != 1) {
                if (KVG != 2 && KVG != 3) {
                    return false;
                }
                if (!"mcc".equals(str) && !"mnc".equals(str)) {
                    return false;
                }
            }
            return true;
        }
        return set.contains(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int jU() {
        return this.Bj.zp("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean ku(String str) {
        return str == null || Gzh(str).tG == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean ox(String str) {
        return Gzh(str).cW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean pvr(String str) {
        return Gzh(str).cz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int rV(String str) {
        return Gzh(str).dT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean tG(String str) {
        return vDp(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int vDp(String str) {
        return Gzh(String.valueOf(str)).ku;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int vwr(String str) {
        return Gzh(str).pvr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public JSONObject woN(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(this.Bj.zp("core_settings", ""));
        } catch (JSONException e4) {
            e = e4;
        }
        try {
            jSONObject.put("ad_slot_setting", Gzh(str).si);
            return jSONObject;
        } catch (JSONException e9) {
            e = e9;
            jSONObject2 = jSONObject;
            com.bytedance.sdk.component.utils.tG.zp("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
            return jSONObject2;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean yRU(String str) {
        return Gzh(str).QUv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean KVG(String str) {
        return str == null || DeviceUtils.ku(KVG.zp()) == 0 || Gzh(str).vDp == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean dQp(String str) {
        return Gzh(str).FP == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean jU(String str) {
        return Gzh(str).irS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int ot(String str) {
        return Gzh(str).Gzh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void zp() {
        try {
            lMd.zp();
            this.Bj.KS();
            this.dT.KS();
            Context zp2 = KVG.zp();
            File file = new File(new File(zp2.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                zp2.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    private static void lMd(int i9, boolean z8) {
        Context zp2 = KVG.zp();
        if (zp2 != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(zp2.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z8);
                intent.putExtra("_source", i9);
                zp2.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public String KS() {
        return this.Bj.zp("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int QUv() {
        int zp2 = this.Bj.zp("fetch_tpl_second", 0);
        if (zp2 <= 0) {
            return 0;
        }
        return zp2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void jU(@TTSdkSettings.FETCH_REQUEST_SOURCE int i9) {
        zp(i9, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public boolean KS(String str) {
        return Gzh(str).KS == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int KS(int i9) {
        return Gzh(String.valueOf(i9)).YW;
    }

    public static int lMd(Context context) {
        SharedPreferences jU;
        if (context == null || (jU = jU(context)) == null) {
            return -2;
        }
        int i9 = jU.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
        int i10 = jU.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
        if (i9 == Integer.MIN_VALUE && i10 == Integer.MIN_VALUE) {
            return -2;
        }
        return jU.getInt("IABTCF_gdprApplies", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void zp(JSONObject jSONObject, jU.zp zpVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        vDp vdp = this.Bj;
        String str = HWF;
        String zp2 = vdp.zp("dyn_draw_engine_url", str);
        final String optString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(zp2) && !TextUtils.isEmpty(optString) && !optString.equals(zp2)) {
            com.bytedance.sdk.openadsdk.core.tG.lMd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.8
                @Override // java.lang.Runnable
                public void run() {
                    if (!TextUtils.equals(dQp.this.Bj.zp("dyn_draw_engine_url", dQp.HWF), optString)) {
                        return;
                    }
                    com.bytedance.sdk.component.adexpress.zp.lMd.COT.lMd().KS();
                }
            }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
        zpVar.zp("dyn_draw_engine_url", optString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public synchronized void lMd() {
        SystemClock.elapsedRealtime();
        boolean z8 = !this.tG;
        this.dT.zp(this.tG);
        this.Bj.zp(this.tG);
        lMd.zp(z8);
        com.bytedance.sdk.openadsdk.core.ku.lMd().jU(Iok());
        this.tG = true;
        SystemClock.elapsedRealtime();
        if (z8) {
            com.bytedance.sdk.openadsdk.core.tG.lMd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dQp.7
                @Override // java.lang.Runnable
                public void run() {
                    if (tG.zp()) {
                        dQp.this.jU(1);
                        dQp.this.Sr();
                    } else {
                        com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp().lMd();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int zp(String str) {
        if (str == null) {
            return 0;
        }
        return KVG.jU().Gzh(str).vwr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int zp(String str, boolean z8) {
        if (str == null) {
            return KS(z8);
        }
        int i9 = Gzh(str).ox;
        return i9 != -1 ? i9 : KS(z8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int zp(int i9) {
        return Gzh(String.valueOf(i9)).WNy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void lMd(JSONObject jSONObject, jU.zp zpVar) {
        if (jSONObject.has("is_gdpr_user")) {
            int optInt = jSONObject.optInt("is_gdpr_user", -1);
            zpVar.zp("isGdprUser", (optInt == -1 || optInt == 1 || optInt == 0) ? optInt : -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void zp(long j7) {
        this.Bj.zp().zp("last_req_time", j7).zp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void zp(@TTSdkSettings.FETCH_REQUEST_SOURCE int i9, boolean z8) {
        if (!com.bytedance.sdk.openadsdk.core.tG.COT() && i9 != 1 && i9 != 2) {
            if (z8) {
                this.woN = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ku.lMd().jU())) {
                return;
            }
            if (this.woN) {
                this.woN = false;
                if (!z8) {
                    z8 = true;
                }
            }
            long pdH = pdH();
            long currentTimeMillis = System.currentTimeMillis();
            long fw = fw();
            long j7 = currentTimeMillis - pdH;
            if (!z8 && j7 < fw) {
                com.bytedance.sdk.openadsdk.core.HWF.zp.zp();
                return;
            }
            if (!tG.zp()) {
                lMd(i9, z8);
            } else if (this.vDp.compareAndSet(false, true)) {
                QUv.lMd(new tG(this, this.Bj, this.dT));
                com.bytedance.sdk.openadsdk.core.tG.lMd().removeCallbacks(this.ot);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int lMd(String str) {
        Integer num;
        Map map = (Map) this.Bj.zp("perf_con_stats_rate", KS, this.jU);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public int lMd(int i9) {
        return Gzh(String.valueOf(i9)).lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.tG.zp
    public void zp(boolean z8) {
        this.vDp.set(false);
        Sr();
        if (z8) {
            hRp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.COT
    public void zp(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.FP, intentFilter, 4);
            } else {
                context.registerReceiver(this.FP, intentFilter);
            }
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.SdkSettings", "", e4);
        }
        if (MBR()) {
            jU(1);
            Sr();
        }
    }
}
