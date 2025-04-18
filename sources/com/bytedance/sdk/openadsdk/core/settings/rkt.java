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
import androidx.core.app.f1;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.AlY.YFl.pDU;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.EH;
import com.bytedance.sdk.openadsdk.core.settings.TTSdkSettings;
import com.bytedance.sdk.openadsdk.core.settings.pDU;
import com.bytedance.sdk.openadsdk.core.settings.wN;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
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
public class rkt implements pDU.YFl, vc {
    public static String AlY;
    private static final ConcurrentLinkedQueue<EH.YFl> Ne;
    private static final String NjR;
    public static final String Sg;
    public static final String YFl;
    private static boolean YoT;
    private static final eT bZ;
    private static final com.bytedance.sdk.component.qsH.qsH eT;
    public static final String tN;

    /* renamed from: vc, reason: collision with root package name */
    static final ConcurrentHashMap<String, Integer> f10747vc;
    public static String wN;
    private final wN.Sg<Set<String>> Cfr;
    final wN.Sg<ConcurrentHashMap<String, Integer>> DSW;
    private final GA EH;
    private final nc GA;
    private final wN.Sg<Map<String, Integer>> Ga;
    private final BroadcastReceiver UZM;
    private NjR VOe;
    private boolean Wwa;
    private final Runnable YI;
    private int aIu;
    private final Set<String> dXO;
    private wN.Sg<JSONObject> hQ;
    private volatile boolean lG;

    /* renamed from: nc, reason: collision with root package name */
    private Set<String> f10748nc;
    private final com.bytedance.sdk.openadsdk.core.settings.YFl pDU;
    private int qO;
    wN.Sg<com.bytedance.sdk.openadsdk.AlY.YFl.pDU> qsH;
    private final AtomicBoolean rkt;
    private boolean wXo;

    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.rkt$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass11 extends BroadcastReceiver {
        private final Runnable Sg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.11.1
            @Override // java.lang.Runnable
            public void run() {
                mn.Sg(new com.bytedance.sdk.component.qsH.qsH("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.11.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            rkt.this.Sg();
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
            mn.Sg(new com.bytedance.sdk.component.qsH.qsH("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.11.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        rkt.this.YFl(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.DSW.YFl().removeCallbacks(AnonymousClass11.this.Sg);
                        com.bytedance.sdk.component.utils.DSW.YFl().postDelayed(AnonymousClass11.this.Sg, 10000L);
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static final class YFl {
        static final rkt YFl = new rkt();
    }

    static {
        CharSequence[] charSequenceArr = {"bus_con_collect", Sco.wXo()};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr[0]);
        sb2.append((CharSequence) "_");
        sb2.append(charSequenceArr[1]);
        YFl = sb2.toString();
        CharSequence[] charSequenceArr2 = {"bus_con", Sco.wXo(), Sco.aIu(), "timeout"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr2[0]);
        for (int i10 = 1; i10 < 4; i10++) {
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr2[i10]);
        }
        Sg = sb3.toString();
        CharSequence[] charSequenceArr3 = {"bus_con", Sco.wXo(), Sco.aIu(), "alpha"};
        StringBuilder sb4 = new StringBuilder();
        sb4.append(charSequenceArr3[0]);
        for (int i11 = 1; i11 < 4; i11++) {
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr3[i11]);
        }
        tN = sb4.toString();
        NjR = Sco.pDU();
        eT = new com.bytedance.sdk.component.qsH.qsH("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.YFl.Sg.wN.Sg().NjR();
                com.bytedance.sdk.component.adexpress.YFl.Sg.wN.Sg().Sg(false);
                com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.Sg();
                com.bytedance.sdk.component.adexpress.YFl.Sg.wN.Sg().tN();
            }
        };
        AlY = "";
        wN = "IABTCF_TCString";
        YoT = false;
        Ne = new ConcurrentLinkedQueue<>();
        bZ = new eT();
        f10747vc = new ConcurrentHashMap<>();
    }

    @Nullable
    private static SharedPreferences AlY(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    private String EAq() {
        return this.EH.YFl("force_language", "");
    }

    public static boolean HVP() {
        return YoT;
    }

    private long JT() {
        long YFl2 = this.EH.YFl("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (YFl2 < 0 || YFl2 > j.TWENTY_FOUR_HOURS_MILLIS) ? TTAdConstant.AD_MAX_EVENT_TIME : YFl2;
    }

    public static vc JwO() {
        if (lG.YFl() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("context is null");
            Log.e("Pangle", "context is null", illegalStateException);
            ApmHelper.reportCustomError("context is null", "context is null", illegalStateException);
            return bZ;
        }
        return YFl.YFl;
    }

    private Set<String> agS() {
        return (Set) this.EH.YFl("perf_con_applog_send", this.dXO, this.Cfr);
    }

    private long dBO() {
        return this.EH.YFl("last_req_time", 0L);
    }

    private int rog() {
        return this.EH.YFl("coppa", -99);
    }

    private static int tN(boolean z10) {
        return z10 ? 20 : 5;
    }

    public static void wqc() {
        Context YFl2;
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN() && (YFl2 = lG.YFl()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(YFl2.getPackageName());
                intent.setAction("_dataChanged");
                YFl2.sendBroadcast(intent);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.SdkSettings", "", th2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Af() {
        return this.EH.YFl("perf_con_close_button_delay_check_time", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String AfY() {
        return this.EH.YFl("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean BPI() {
        int YFl2 = this.EH.YFl("privacy_ad_enable", Integer.MAX_VALUE);
        if (YFl2 == 1) {
            return true;
        }
        if (YFl2 == 0) {
            return false;
        }
        int rkt = Sco.rkt();
        if (rkt == 1 || rkt == 2 || rkt == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean Bh() {
        return this.EH.YFl("privacy_debug_unlock", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Bn() {
        return this.EH.YFl("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Cfr(String str) {
        Integer num;
        Map map = (Map) this.EH.YFl("perf_con_applog_rate", null, this.Ga);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean Cqy() {
        return this.EH.YFl("read_video_from_cache", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void DSW() {
        this.EH.YFl().YFl("tt_sdk_settings").YFl("ab_test_param").YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean DjU() {
        return this.EH.YFl("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int ECi() {
        return this.EH.YFl(Sg, 10000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int EH() {
        agS();
        return this.qO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public Set<String> GA() {
        return agS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int GS() {
        return this.EH.YFl("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Ga() {
        int YFl2 = this.EH.YFl("fetch_tpl_timeout_ctrl", 3000);
        if (YFl2 <= 0) {
            return 3000;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public JSONObject Gmi() {
        return (JSONObject) this.EH.YFl("perf_con_thread_pool_config", new JSONObject(), this.hQ);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public com.bytedance.sdk.openadsdk.AlY.YFl.pDU Gnp() {
        return (com.bytedance.sdk.openadsdk.AlY.YFl.pDU) this.EH.YFl("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.AlY.YFl.pDU.YFl, this.qsH);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Hjb() {
        return this.EH.YFl("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean IXB() {
        return this.EH.YFl("bus_con_rewardedfull_link", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Jc() {
        int YFl2 = this.EH.YFl("perf_con_webview_cache_count_v3", 0);
        if (YFl2 < 0) {
            return 0;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean Ld() {
        return this.EH.YFl("global_rate", 1.0f) == 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean Ne() {
        return this.EH.YFl("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean NjR() {
        return !(this.EH.YFl("support_tnc", 1) == 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean PT() {
        return this.EH.YFl("bus_con_video_keep_screen_on", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int RX() {
        int YFl2 = this.EH.YFl("perf_con_webview_preload_cache", 0);
        if (YFl2 < 0) {
            return 0;
        }
        if (YFl2 > 5) {
            return 5;
        }
        int VB = VB();
        if (YFl2 > VB) {
            return VB;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean SVa() {
        return this.EH.YFl("perf_con_use_new_thread_pool", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String Sco() {
        return this.EH.YFl("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int UI() {
        return this.EH.YFl("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean UT() {
        return this.EH.YFl("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public DSW UZM() {
        return (DSW) this.EH.YFl("insert_js_config", DSW.YFl, new wN.Sg<DSW>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public DSW Sg(String str) {
                return new DSW(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int VB() {
        int YFl2 = this.EH.YFl("perf_con_webview_cache_count", 0);
        if (YFl2 < 0) {
            return 0;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public float VJb() {
        return this.EH.YFl(tN, 1.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public long VOe() {
        return this.EH.YFl("duration", 10000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Vmj() {
        return this.EH.YFl("bus_con_send_log_type", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean Wwa() {
        return this.EH.YFl("ad_revenue_enable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String YI() {
        return this.EH.YFl("playableLoadH5Url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public long YP() {
        long YFl2 = this.EH.YFl("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME);
        if (YFl2 < 10000) {
            return 10000L;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int YoT() {
        return this.EH.YFl("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public long ZLB() {
        return this.EH.YFl("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean ZS() {
        return this.EH.YFl("perf_con_is_new_net_thread", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int ZU() {
        return this.EH.YFl("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String aIu() {
        return this.EH.YFl("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int bZ() {
        return this.EH.YFl(AppLovinMediationProvider.MAX, 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean dGX() {
        return this.lG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean dU() {
        return this.EH.YFl(YFl, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int dXO() {
        int YFl2 = this.EH.YFl("fetch_tpl_second", 0);
        if (YFl2 <= 0) {
            return 0;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public JSONObject dd() {
        return (JSONObject) this.EH.YFl("video_cache_config", null, wN.YFl);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int eT() {
        return this.EH.YFl("load_callback_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean fIu() {
        return this.EH.YFl("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean hQ() {
        return this.EH.Sg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean iY() {
        return this.EH.YFl("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String[] ib() {
        Set<String> set;
        try {
            set = this.f10748nc;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.EH.YFl("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.f10748nc.add(jSONArray.getString(i10));
                }
            }
            Set<String> YFl2 = GA.YFl(this.f10748nc);
            this.f10748nc = YFl2;
            if (YFl2 != null) {
                if (YFl2.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.f10748nc.toArray(new String[0]);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean in() {
        return this.EH.YFl("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int jz() {
        int YFl2 = this.EH.YFl("bus_con_auto_click_delay", 3000);
        if (YFl2 <= 0) {
            return 3000;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int kA() {
        return this.EH.YFl("bus_con_behavior_count", 300);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean ko() {
        int YFl2 = this.pDU.YFl("perf_con_apm", 100);
        if (YFl2 == 0) {
            return false;
        }
        if (YFl2 >= 0 && YFl2 < 100 && YFl2 <= ((int) (Math.random() * 100.0d))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean lG() {
        return this.EH.YFl("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void lL() {
        this.Wwa = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String lu() {
        return this.EH.YFl("dyn_draw_engine_url", NjR);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String mB() {
        return this.EH.YFl("dc", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String mn() {
        return this.EH.YFl("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String nc() {
        return this.EH.YFl("ab_test_version", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int ni() {
        return this.EH.YFl("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int pDU() {
        agS();
        return this.aIu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public Set<String> pm() {
        return (Set) this.EH.YFl("perf_con_drop2rt_skip_label_list", Collections.emptySet(), wN.Sg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String pq() {
        return this.EH.YFl("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int qO() {
        return this.EH.YFl("loadedCallbackOpportunity", 0);
    }

    public void qf() {
        if (!pDU.YFl()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.pDU.Sg().removeCallbacks(this.YI);
        com.bytedance.sdk.openadsdk.core.pDU.Sg().postDelayed(this.YI, JT());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String qjy() {
        return this.EH.YFl("dual_event_url", (String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean qsH() {
        return this.EH.YFl("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int rE() {
        int YFl2 = this.EH.YFl("bus_con_token_thread_count", 4);
        if (YFl2 <= 0 || YFl2 > 30) {
            return 4;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean rkt() {
        return this.EH.YFl("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int tQ() {
        int YFl2 = this.EH.YFl("perf_con_webview_preload_cache_v3", 0);
        if (YFl2 < 0) {
            return 0;
        }
        if (YFl2 > 5) {
            return 5;
        }
        int Jc = Jc();
        if (YFl2 > Jc) {
            return Jc;
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean uGS() {
        return this.EH.YFl("bus_con_adshow_check_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public long vc() {
        return this.EH.YFl("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    @Nullable
    public JSONObject wN() {
        return (JSONObject) this.EH.YFl("digest", null, wN.YFl);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    @NonNull
    public NjR wXo() {
        NjR njR = this.VOe;
        if (njR != null) {
            return njR;
        }
        NjR njR2 = (NjR) this.GA.YFl("mediation_init_conf", NjR.YFl, new wN.Sg<NjR>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public NjR Sg(String str) {
                return new NjR(str);
            }
        });
        this.VOe = njR2;
        return njR2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String xg() {
        return this.EH.YFl("bus_con_check_clz", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean yn() {
        return this.EH.YFl("bus_con_url_check", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String zB() {
        return this.pDU.YFl("apm_url", "pangolin16.sgsnssdk.com");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int zG() {
        int YFl2 = this.EH.YFl("privacy_personalized_ad", Integer.MAX_VALUE);
        if (YFl2 != Integer.MAX_VALUE) {
            return YFl2;
        }
        int rkt = Sco.rkt();
        if (rkt == 1 || rkt == 2) {
            return 2;
        }
        if (rkt == 3) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean zz() {
        if (!com.bytedance.sdk.component.adexpress.AlY.Sg.YFl(lG.YFl())) {
            return false;
        }
        return this.EH.YFl("support_rtl", false);
    }

    private rkt() {
        this.f10748nc = Collections.synchronizedSet(new HashSet());
        this.GA = new nc();
        this.pDU = new com.bytedance.sdk.openadsdk.core.settings.YFl();
        this.EH = new GA(new EH.YFl() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.6
            @Override // com.bytedance.sdk.openadsdk.core.settings.EH.YFl
            public void Sg() {
                if (rkt.Ne != null && !rkt.Ne.isEmpty()) {
                    Iterator it = rkt.Ne.iterator();
                    while (it.hasNext()) {
                        ((EH.YFl) it.next()).Sg();
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.EH.YFl
            public void YFl() {
                EH.YFl[] yFlArr;
                boolean unused = rkt.YoT = true;
                if (rkt.Ne != null && rkt.Ne.size() != 0 && (yFlArr = (EH.YFl[]) rkt.Ne.toArray()) != null) {
                    for (EH.YFl yFl : yFlArr) {
                        yFl.YFl();
                    }
                }
            }
        });
        this.rkt = new AtomicBoolean(false);
        this.lG = false;
        this.Wwa = false;
        this.qO = 5000;
        this.aIu = 10;
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.UZM = anonymousClass11;
        this.YI = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.12
            @Override // java.lang.Runnable
            public void run() {
                rkt.this.AlY(2);
                rkt.this.qf();
            }
        };
        this.DSW = new wN.Sg<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.13
            @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> Sg(String str) {
                if (TextUtils.isEmpty(str)) {
                    return rkt.f10747vc;
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
                } catch (JSONException e2) {
                    Log.i("TTAD.SdkSettings", e2.getMessage());
                }
                return concurrentHashMap;
            }
        };
        this.Ga = new wN.Sg<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> Sg(String str) {
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
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.Sg("get applog rate from sp failed:" + e2.getMessage());
                    return null;
                }
            }
        };
        this.dXO = new HashSet();
        this.Cfr = new wN.Sg<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public Set<String> Sg(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("applog_count");
                        if (optInt >= 2 && optInt <= 100) {
                            rkt.this.aIu = optInt;
                        }
                        int optInt2 = jSONObject.optInt("applog_interval");
                        if (optInt2 >= 100 && optInt2 <= 30000) {
                            rkt.this.qO = optInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                String string = jSONArray.getString(i10);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e2) {
                        Log.i("TTAD.SdkSettings", e2.getMessage());
                    }
                }
                if (hashSet.size() == 0) {
                    return new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "show", "insight_log", "mrc_show"));
                }
                return hashSet;
            }
        };
        this.hQ = new wN.Sg<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public JSONObject Sg(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.SdkSettings", th2.getMessage());
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return new JSONObject();
                }
                return jSONObject;
            }
        };
        this.qsH = new wN.Sg<com.bytedance.sdk.openadsdk.AlY.YFl.pDU>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.wN.Sg
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.AlY.YFl.pDU Sg(String str) {
                com.bytedance.sdk.openadsdk.AlY.YFl.pDU pdu = new com.bytedance.sdk.openadsdk.AlY.YFl.pDU();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    pdu.YFl(jSONObject.optInt("enable_strategy", 0) == 1);
                    pdu.YFl(YFl(jSONObject.optJSONObject("default")));
                    JSONObject optJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            pdu.YFl(next, YFl(optJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return pdu;
            }

            private pDU.YFl YFl(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new pDU.YFl(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context YFl2 = lG.YFl();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                f1.w(YFl2, anonymousClass11, intentFilter);
            } else {
                YFl2.registerReceiver(anonymousClass11, intentFilter);
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.SdkSettings", "", e2);
        }
    }

    public static String tN(Context context) {
        SharedPreferences AlY2;
        return (context == null || (AlY2 = AlY(context)) == null) ? "" : AlY2.getString(wN, "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int AlY() {
        return this.EH.YFl("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int DSW(String str) {
        return Ga(str).Wwa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int GA(String str) {
        return Ga(String.valueOf(str)).qsH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    @NonNull
    public Sg Ga(String str) {
        return tN.YFl(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Ne(String str) {
        return Ga(str).Ga;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int NjR(String str) {
        if (str == null) {
            return 1500;
        }
        return Ga(str).rkt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int UZM(String str) {
        return Ga(str).mn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int VOe(String str) {
        return Ga(str).dXO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public JSONObject Wwa(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(this.EH.YFl("core_settings", ""));
        } catch (JSONException e2) {
            e = e2;
        }
        try {
            jSONObject.put("ad_slot_setting", Ga(str).iY);
            return jSONObject;
        } catch (JSONException e10) {
            e = e10;
            jSONObject2 = jSONObject;
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
            return jSONObject2;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean YI(String str) {
        return lG.AlY().Ga(str).EH == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean YoT(String str) {
        try {
            return Ga(str).VOe != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean aIu(String str) {
        return Ga(str).wXo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean bZ(String str) {
        return Ga(str).pq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean dXO(@NonNull String str) {
        Set set = (Set) this.EH.YFl("privacy_fields_allowed", Collections.emptySet(), wN.Sg);
        if (set.isEmpty()) {
            int rkt = Sco.rkt();
            if (rkt != 1) {
                if (rkt != 2 && rkt != 3) {
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

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int eT(String str) {
        return Ga(str).YoT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean lG(String str) {
        return str == null || DeviceUtils.qsH(lG.YFl()) == 0 || Ga(str).GA == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int nc(String str) {
        return Ga(str).eT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int qO(String str) {
        return Ga(str).aIu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean qsH(String str) {
        return str == null || Ga(str).pDU == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean rkt(String str) {
        return Ga(str).Ne == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean vc(String str) {
        return Ga(str).DSW == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean wN(String str) {
        int i10 = Ga(str).wN;
        if (i10 != 1) {
            return i10 == 2 && com.bytedance.sdk.component.utils.EH.tN(lG.YFl()) != 0;
        }
        return com.bytedance.sdk.component.utils.EH.AlY(lG.YFl());
    }

    private static void Sg(int i10, boolean z10) {
        Context YFl2 = lG.YFl();
        if (YFl2 != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(YFl2.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z10);
                intent.putExtra("_source", i10);
                YFl2.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean AlY(String str) {
        return Ga(str).Cfr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int EH(String str) {
        return Ga(str).f10744nc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void YFl() {
        try {
            tN.YFl();
            this.EH.tN();
            this.GA.tN();
            this.pDU.tN();
            Context YFl2 = lG.YFl();
            File file = new File(new File(YFl2.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                YFl2.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean pDU(String str) {
        return GA(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int wXo(String str) {
        return Ga(str).YI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public String tN() {
        return this.EH.YFl("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void AlY(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10) {
        YFl(i10, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void Cfr() {
        String EAq = EAq();
        if (TextUtils.isEmpty(EAq)) {
            return;
        }
        if (EAq.equals("zh-Hant")) {
            com.bytedance.sdk.component.utils.NjR.YFl(lG.YFl(), "zh", "tw");
        } else {
            com.bytedance.sdk.component.utils.NjR.YFl(lG.YFl(), EAq, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.SdkSettings", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean tN(String str) {
        return Ga(str).tN == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int tN(int i10) {
        return Ga(String.valueOf(i10)).NjR;
    }

    public static int Sg(Context context) {
        SharedPreferences AlY2;
        if (context == null || (AlY2 = AlY(context)) == null) {
            return -2;
        }
        if ((AlY2.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE) == Integer.MIN_VALUE && AlY2.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE) == Integer.MIN_VALUE) ? false : true) {
            return AlY2.getInt("IABTCF_gdprApplies", -1);
        }
        return -2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public synchronized void Sg() {
        SystemClock.elapsedRealtime();
        boolean z10 = !this.lG;
        this.GA.YFl(this.lG);
        this.pDU.YFl(this.lG);
        this.EH.YFl(this.lG);
        tN.YFl(z10);
        com.bytedance.sdk.openadsdk.core.NjR.Sg().AlY(rog());
        this.lG = true;
        SystemClock.elapsedRealtime();
        if (z10) {
            com.bytedance.sdk.openadsdk.core.pDU.Sg().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.7
                @Override // java.lang.Runnable
                public void run() {
                    if (pDU.YFl()) {
                        rkt.this.AlY(1);
                        rkt.this.qf();
                    } else {
                        com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl().Sg();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void YFl(JSONObject jSONObject, wN.YFl yFl) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        GA ga2 = this.EH;
        String str = NjR;
        String YFl2 = ga2.YFl("dyn_draw_engine_url", str);
        final String optString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(YFl2) && !TextUtils.isEmpty(optString) && !optString.equals(YFl2)) {
            com.bytedance.sdk.openadsdk.core.pDU.Sg().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rkt.8
                @Override // java.lang.Runnable
                public void run() {
                    if (!TextUtils.equals(rkt.this.EH.YFl("dyn_draw_engine_url", rkt.NjR), optString)) {
                        return;
                    }
                    com.bytedance.sdk.component.adexpress.YFl.Sg.wN.Sg().tN();
                }
            }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
        yFl.YFl("dyn_draw_engine_url", optString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int YFl(String str) {
        if (str == null) {
            return 0;
        }
        return lG.AlY().Ga(str).qO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int YFl(String str, boolean z10) {
        if (str == null) {
            return tN(z10);
        }
        int i10 = Ga(str).UZM;
        return i10 != -1 ? i10 : tN(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void Sg(JSONObject jSONObject, wN.YFl yFl) {
        if (jSONObject.has("is_gdpr_user")) {
            int optInt = jSONObject.optInt("is_gdpr_user", -1);
            yFl.YFl("isGdprUser", (optInt == -1 || optInt == 1 || optInt == 0) ? optInt : -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int YFl(int i10) {
        return Ga(String.valueOf(i10)).zB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void YFl(long j3) {
        this.EH.YFl().YFl("last_req_time", j3).YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Sg(String str) {
        Integer num;
        Map map = (Map) this.EH.YFl("perf_con_stats_rate", f10747vc, this.DSW);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void YFl(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10, boolean z10) {
        if (!com.bytedance.sdk.openadsdk.core.pDU.wN() && i10 != 1 && i10 != 2) {
            if (z10) {
                this.wXo = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.NjR.Sg().AlY())) {
                return;
            }
            if (this.wXo) {
                this.wXo = false;
                if (!z10) {
                    z10 = true;
                }
            }
            long dBO = dBO();
            long currentTimeMillis = System.currentTimeMillis();
            long JT = JT();
            long j3 = currentTimeMillis - dBO;
            if (!z10 && j3 < JT) {
                com.bytedance.sdk.openadsdk.core.nc.YFl.YFl();
                return;
            }
            if (!pDU.YFl()) {
                Sg(i10, z10);
            } else if (this.rkt.compareAndSet(false, true)) {
                mn.Sg((com.bytedance.sdk.component.qsH.qsH) new pDU(this, this.EH, this.GA, this.pDU));
                com.bytedance.sdk.openadsdk.core.pDU.Sg().removeCallbacks(this.YI);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public int Sg(int i10) {
        return Ga(String.valueOf(i10)).Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.pDU.YFl
    public void YFl(boolean z10) {
        this.rkt.set(false);
        qf();
        if (z10) {
            wqc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public void YFl(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                f1.w(context, this.UZM, intentFilter);
            } else {
                context.registerReceiver(this.UZM, intentFilter);
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.SdkSettings", "", e2);
        }
        if (dGX()) {
            AlY(1);
            qf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vc
    public boolean YFl(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        if (cryptDataScene != PangleEncryptConstant.CryptDataScene.GET_ADS && cryptDataScene != PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN) {
            if (cryptDataScene == PangleEncryptConstant.CryptDataScene.APP_LOG) {
                return this.EH.YFl("perf_con_crypt_V4_applog", false);
            }
            return this.EH.YFl("perf_con_crypt_V4", false);
        }
        return this.EH.YFl("perf_con_crypt_V4_get_ad", false);
    }

    public static void YFl(EH.YFl yFl) {
        ConcurrentLinkedQueue<EH.YFl> concurrentLinkedQueue = Ne;
        if (concurrentLinkedQueue.contains(yFl)) {
            return;
        }
        concurrentLinkedQueue.add(yFl);
    }
}
