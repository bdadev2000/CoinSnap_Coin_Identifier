package com.bytedance.sdk.openadsdk.qO;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH {
    private float Af;
    private tN AfY;
    public final String AlY;
    private String BPI;
    private int Bh;
    private int Bn;
    private long Cfr;
    private int Cqy;
    private final String DSW;
    private WeakReference<View> DjU;
    private int EAq;
    private String ECi;
    private Sg EH;
    private Runnable GA;
    private long GS;
    private long Ga;
    private Map<String, String> Gmi;
    private String Gnp;
    private int HVP;
    private int Hjb;
    private String IXB;
    private String JB;
    private String JGG;
    private int JT;
    private String Jc;
    private int JwO;
    private boolean LL;
    private int Ld;
    private int Lx;
    private boolean Ne;
    private Runnable NjR;
    private float PT;
    private boolean RX;
    private int SVa;
    private long Sco;
    public final String Sg;
    private List<JSONObject> TMt;
    private String UI;

    @Nullable
    private WebView UT;
    private String UZM;
    private String Uv;
    private int VB;
    private String VJb;
    private boolean VOe;
    private JSONObject Vmj;
    private boolean Wwa;
    private volatile boolean Xrd;
    public final String YFl;
    private long YI;
    private vc YP;
    private final Handler YoT;
    private Context ZLB;
    private float ZS;
    private String ZU;
    private String aIu;
    private boolean agS;
    private boolean bZ;
    private boolean cC;
    private String dBO;
    private int dGX;
    private JSONObject dU;
    private int dXO;

    /* renamed from: dc, reason: collision with root package name */
    private boolean f10789dc;

    /* renamed from: dd, reason: collision with root package name */
    private int f10790dd;
    private Runnable eT;
    private int ep;
    private int fIu;
    private long hQ;

    /* renamed from: hf, reason: collision with root package name */
    private volatile boolean f10791hf;
    private boolean iY;

    /* renamed from: ib, reason: collision with root package name */
    private int f10792ib;

    /* renamed from: id, reason: collision with root package name */
    private boolean f10793id;
    private int in;
    private boolean iv;
    private String jz;
    private int kA;
    private ViewTreeObserver.OnGlobalLayoutListener kU;
    private int ko;
    private int ks;
    private boolean lG;
    private long lL;
    private long lu;
    private long mB;
    private long mn;

    /* renamed from: nc, reason: collision with root package name */
    private Runnable f10794nc;

    /* renamed from: ni, reason: collision with root package name */
    private String f10795ni;

    /* renamed from: oa, reason: collision with root package name */
    private String f10796oa;
    private Runnable pDU;
    private int pm;
    private long pq;
    private Set<String> qO;

    /* renamed from: qf, reason: collision with root package name */
    private int f10797qf;
    private JSONObject qjy;
    private final Handler qsH;
    private com.bytedance.sdk.openadsdk.qO.YFl rE;
    private boolean rkt;
    private int rog;
    public final String tN;
    private int tQ;
    private boolean toy;
    private YFl uGS;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10798vc;
    public final String wN;
    private String wXo;
    private int wqc;
    private boolean ww;

    /* renamed from: xg, reason: collision with root package name */
    private String f10799xg;
    private JSONObject yn;
    private long zB;
    private String zG;
    private boolean zl;
    private long zz;

    /* loaded from: classes.dex */
    public enum YFl {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private qsH(Context context, WebView webView, tN tNVar, com.bytedance.sdk.openadsdk.qO.YFl yFl, YFl yFl2) {
        this.f10798vc = "playable_stuck_check_ping";
        this.DSW = "playable_apply_media_permission_callback";
        this.qsH = new Handler(Looper.getMainLooper());
        this.YoT = new Handler(Looper.getMainLooper());
        this.rkt = true;
        this.lG = true;
        this.Wwa = true;
        this.YFl = "PL_sdk_playable_global_viewable";
        this.Sg = "PL_sdk_page_screen_blank";
        this.tN = "PL_sdk_playable_destroy_analyze_summary";
        this.AlY = "PL_sdk_playable_hardware_dialog_cancel";
        this.wN = "PL_sdk_playable_hardware_dialog_setting";
        this.qO = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.aIu = null;
        this.wXo = "embeded_ad";
        this.Ne = true;
        this.VOe = true;
        this.bZ = false;
        this.UZM = "";
        this.YI = 10L;
        this.Ga = 10L;
        this.dXO = 700;
        this.Cfr = 0L;
        this.hQ = 0L;
        this.pq = -1L;
        this.mn = -1L;
        this.zB = -1L;
        this.Sco = -1L;
        this.GS = -1L;
        this.lu = -1L;
        this.mB = -1L;
        this.UI = "";
        this.ZU = "";
        this.BPI = "";
        this.zG = "";
        this.ko = 0;
        this.fIu = 0;
        this.iY = false;
        this.Bh = 0;
        this.dGX = -1;
        this.Ld = 0;
        this.Cqy = 0;
        this.VB = 0;
        this.Jc = null;
        this.RX = false;
        this.tQ = 0;
        this.f10792ib = 0;
        this.Hjb = 0;
        this.f10790dd = 0;
        this.lL = 0L;
        this.zz = 0L;
        this.in = -2;
        this.Bn = 0;
        this.kA = 0;
        this.SVa = 0;
        this.qjy = new JSONObject();
        this.Gmi = new HashMap();
        this.dU = new JSONObject();
        this.f10799xg = "";
        this.Af = 0.0f;
        this.ZS = 0.0f;
        this.f10789dc = false;
        this.ww = false;
        this.f10793id = false;
        this.TMt = new ArrayList();
        this.iv = true;
        this.f10791hf = true;
        this.Xrd = true;
        this.kU = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) qsH.this.DjU.get();
                    if (view != null) {
                        qsH.this.Sg(view);
                    }
                } catch (Throwable th2) {
                    DSW.YFl("PlayablePlugin", "onSizeChanged error", th2);
                }
            }
        };
        this.ks = -1;
        this.in = 0;
        this.uGS = yFl2;
        this.UT = webView;
        NjR.YFl(webView);
        YFl(webView);
        YFl(context, tNVar, yFl);
    }

    private void BPI() {
        Runnable runnable;
        Runnable runnable2;
        this.EH.YFl(System.currentTimeMillis());
        Handler handler = this.YoT;
        if (handler != null) {
            int i10 = this.in;
            if (i10 == 0 && (runnable2 = this.GA) != null) {
                handler.post(runnable2);
            } else if ((i10 == 1 || i10 == 2) && (runnable = this.pDU) != null) {
                handler.post(runnable);
            }
            this.EH.YFl(500);
        }
    }

    public static /* synthetic */ int GA(qsH qsh) {
        int i10 = qsh.fIu;
        qsh.fIu = i10 + 1;
        return i10;
    }

    private void UI() {
        this.EH = new Sg(this, this.dXO);
        this.NjR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.5
            @Override // java.lang.Runnable
            public void run() {
                if (qsH.this.Ne) {
                    qsH.this.Ne = false;
                    qsH.this.qsH.removeCallbacks(qsH.this.f10794nc);
                    qsH.this.YFl(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.f10794nc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.6
            @Override // java.lang.Runnable
            public void run() {
                if (qsH.this.Ne) {
                    qsH.this.Ne = false;
                    qsH.this.f10791hf = false;
                    qsH.this.qsH.removeCallbacks(qsH.this.NjR);
                    qsH.this.YFl(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.GA = new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (qsH.this.UT != null) {
                    qsH.this.UT.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.7.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (qsH.this.EH != null) {
                                qsH.this.EH.YFl(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (qsH.this.YoT != null) {
                    qsH.this.YoT.postDelayed(this, 500L);
                }
            }
        };
        this.pDU = new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                qsH.this.YFl("playable_stuck_check_ping", new JSONObject());
                if (qsH.this.YoT != null) {
                    qsH.this.YoT.postDelayed(this, 500L);
                }
            }
        };
        this.eT = new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.9
            @Override // java.lang.Runnable
            public void run() {
                if (qsH.this.zz > 0) {
                    if (qsH.this.zz - qsH.this.lL <= qsH.this.dXO) {
                        qsH.this.pq();
                        qsH.this.lL = 0L;
                        qsH.this.zz = 0L;
                        return;
                    }
                    qsH.this.Sg(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                qsH.this.Sg(1, "Clicking on the hot zone causes the program to freeze.");
            }
        };
    }

    public static /* synthetic */ int YoT(qsH qsh) {
        int i10 = qsh.ko;
        qsh.ko = i10 + 1;
        return i10;
    }

    private void ZU() {
        String str;
        if (this.dU == null || (str = this.ECi) == null || str.contains("/cid_")) {
            return;
        }
        String optString = this.dU.optString(BidResponsedEx.KEY_CID);
        if (!TextUtils.isEmpty(optString)) {
            String host = Uri.parse(this.ECi).getHost();
            if (TextUtils.isEmpty(host)) {
                this.ECi = a.n(new StringBuilder(), this.ECi, "/cid_", optString);
            } else {
                this.ECi = this.ECi.replace(host, a.m(host, "/cid_", optString));
            }
        }
    }

    public void Cfr() {
        int i10;
        int i11 = this.in;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (this.f10791hf) {
                this.qsH.postDelayed(this.NjR, this.YI * 1000);
            }
            if ((this.Xrd && YoT(this.ECi)) || (i10 = this.in) == 1 || i10 == 2) {
                this.qsH.postDelayed(this.f10794nc, this.Ga * 1000);
            }
        }
    }

    public JSONObject EH() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.uGS.ordinal());
            jSONObject.put("safe_area_top_height", this.Af);
            jSONObject.put("safe_area_bottom_height", this.ZS);
            jSONObject.put("playable_enter_from", this.Cqy);
            jSONObject.put("playable_retry_count", this.Ld);
            jSONObject.put("playable_card_session", this.UI);
            jSONObject.put("playable_video_session", this.ZU);
            jSONObject.put("playable_network_type", rkt());
            jSONObject.put("aweme_id", this.zG);
            return jSONObject;
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "playableInfo error", th2);
            return new JSONObject();
        }
    }

    public int GS() {
        return (this.mn == -1 || !this.zl) ? 1 : 2;
    }

    public void Ga() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.GS > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.GS);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.zB > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.zB);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            tN("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Ne() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.GS > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.GS);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.zB > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.zB;
                this.mB = currentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", currentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            tN("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Sco() {
        if (this.f10793id) {
            return;
        }
        this.f10793id = true;
        this.hQ = 0L;
        this.lG = true;
        zB();
        try {
            View view = this.DjU.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.kU);
            }
        } catch (Throwable unused) {
        }
        try {
            Sg sg2 = this.EH;
            if (sg2 != null) {
                sg2.YFl();
                this.EH = null;
            }
            Handler handler = this.YoT;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.ECi)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.ko);
                jSONObject.put("playable_hit_times", this.fIu);
                int i10 = this.ko;
                if (i10 > 0) {
                    jSONObject.put("playable_hit_ratio", this.fIu / (i10 * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                tN("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused2) {
        }
        try {
            if (!TextUtils.isEmpty(this.ECi)) {
                if (this.pq != -1) {
                    this.Cfr += System.currentTimeMillis() - this.pq;
                    this.pq = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.Cfr);
                tN("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused3) {
        }
        this.f10791hf = false;
        this.Xrd = false;
        this.qsH.removeCallbacks(this.NjR);
        this.qsH.removeCallbacks(this.f10794nc);
        this.qsH.removeCallbacksAndMessages(null);
    }

    public void UZM() {
        if (this.rE != null) {
            YFl yFl = YFl.LAND_PAGE;
        }
    }

    public void VOe() {
        this.dGX = 2;
    }

    public JSONObject Wwa() {
        if (this.qjy.isNull("width")) {
            View view = this.DjU.get();
            if (view == null) {
                return this.qjy;
            }
            Sg(view);
        }
        return this.qjy;
    }

    public void YI() {
        if (this.rE != null) {
            YFl yFl = YFl.LAND_PAGE;
        }
    }

    public JSONObject aIu() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.PT);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.pm);
            jSONObject2.put("height", this.wqc);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.f10797qf);
            jSONObject3.put("y", this.JwO);
            jSONObject3.put("width", this.HVP);
            jSONObject3.put("height", this.ep);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.EAq);
            jSONObject4.put("y", this.Lx);
            jSONObject4.put("width", this.rog);
            jSONObject4.put("height", this.JT);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "getViewport error", th2);
        }
        return jSONObject;
    }

    public void bZ() {
        this.RX = true;
    }

    public void dXO() {
        Sg sg2;
        this.zz = System.currentTimeMillis();
        int i10 = this.in;
        if ((i10 == 1 || i10 == 2) && (sg2 = this.EH) != null) {
            sg2.YFl(System.currentTimeMillis());
        }
    }

    public void hQ() {
        this.Xrd = false;
        this.qsH.removeCallbacks(this.f10794nc);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.zB > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.zB);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            tN("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public com.bytedance.sdk.openadsdk.qO.YFl lG() {
        return this.rE;
    }

    public String lu() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public int mB() {
        return this.ks;
    }

    public void mn() {
        try {
            Sg sg2 = this.EH;
            if (sg2 != null) {
                sg2.YFl();
            }
            Handler handler = this.YoT;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public JSONObject pDU() {
        boolean YFl2;
        boolean YFl3;
        try {
            boolean z10 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                YFl2 = wN.YFl(this.ZLB, "android.permission.READ_MEDIA_IMAGES");
                YFl3 = true;
            } else {
                YFl2 = wN.YFl(this.ZLB, "android.permission.READ_EXTERNAL_STORAGE");
                YFl3 = wN.YFl(this.ZLB, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", YFl2);
            jSONObject.put("isHasWrite", YFl3);
            if (!YFl2 || !YFl3) {
                z10 = false;
            }
            jSONObject.put("result", z10);
            return jSONObject;
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public void pq() {
        if (!this.VOe) {
            return;
        }
        this.lu = System.currentTimeMillis();
        if (this.uGS == YFl.FEED_AWEME) {
            if (this.zl && this.Bn == 3) {
                Sg sg2 = this.EH;
                if (sg2 != null && sg2.Sg()) {
                    BPI();
                    return;
                } else {
                    if (this.EH == null) {
                        this.EH = new Sg(this, this.dXO);
                        BPI();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.zl && this.Bn == 2) {
            Sg sg3 = this.EH;
            if (sg3 != null && sg3.Sg()) {
                BPI();
            } else if (this.EH == null) {
                this.EH = new Sg(this, this.dXO);
                BPI();
            }
        }
    }

    public JSONObject qO() {
        return this.dU;
    }

    public String rkt() {
        com.bytedance.sdk.openadsdk.qO.YFl yFl;
        if (TextUtils.isEmpty(this.BPI) && (yFl = this.rE) != null) {
            this.BPI = yFl.YFl().toString();
        }
        return this.BPI;
    }

    public void wXo() {
        com.bytedance.sdk.openadsdk.qO.YFl yFl = this.rE;
        if (yFl != null) {
            yFl.Sg();
        }
    }

    public void zB() {
        this.kA = 0;
        this.SVa = 0;
        this.PT = 0.0f;
        this.pm = 0;
        this.wqc = 0;
        this.JwO = 0;
        this.f10797qf = 0;
        this.HVP = 0;
        this.ep = 0;
        this.Lx = 0;
        this.EAq = 0;
        this.rog = 0;
        this.JT = 0;
    }

    private boolean YoT(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public String AlY() {
        return this.Gnp;
    }

    public String DSW() {
        return this.dBO;
    }

    public JSONObject GA() {
        try {
            boolean YFl2 = wN.YFl(this.ZLB, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", YFl2);
            return jSONObject;
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public boolean NjR() {
        return this.zl;
    }

    public Set<String> eT() {
        return this.YP.YFl();
    }

    public JSONObject nc() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.LL);
            return jSONObject;
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "getPlayableClickStatus error", th2);
            return new JSONObject();
        }
    }

    public boolean qsH() {
        return this.agS;
    }

    public JSONObject tN() {
        return this.yn;
    }

    public String vc() {
        return this.f10795ni;
    }

    public String wN() {
        return this.jz;
    }

    public qsH AlY(String str) {
        this.f10795ni = str;
        return this;
    }

    public qsH DSW(String str) {
        Uri parse;
        String scheme;
        int indexOf;
        String decode;
        this.f10799xg = str;
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Throwable unused) {
        }
        if (!"http".equalsIgnoreCase(scheme) && !Constants.SCHEME.equalsIgnoreCase(scheme)) {
            String host = parse.getHost();
            if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.in == -1) {
                        Sg(2);
                    } else {
                        Sg(1);
                    }
                }
                this.ECi = str;
                return this;
            }
            Sg(0);
            String queryParameter = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter) && (decode = Uri.decode(queryParameter)) != null) {
                int indexOf2 = decode.indexOf("?");
                str = indexOf2 != -1 ? decode.substring(0, indexOf2) : decode;
            }
            this.ECi = str;
            return this;
        }
        Sg(0);
        if (str != null && (indexOf = str.indexOf("?")) != -1) {
            str = str.substring(0, indexOf);
        }
        this.ECi = str;
        return this;
    }

    public void NjR(String str) {
        WebView webView;
        boolean z10 = this.Bn == -1;
        this.Bn = 2;
        if (!z10) {
            this.VJb = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.Sco = currentTimeMillis;
                long j3 = this.zB;
                jSONObject.put("playable_html_load_start_duration", j3 != -1 ? currentTimeMillis - j3 : 0L);
                jSONObject.put("playable_has_show", GS());
            } catch (Throwable th2) {
                DSW.YFl("PlayablePlugin", "reportUrlLoadFinish error", th2);
            }
            tN("PL_sdk_html_load_finish", jSONObject);
        }
        this.f10791hf = false;
        this.qsH.removeCallbacks(this.NjR);
        try {
            if (this.in == 0) {
                if (this.rkt && (webView = this.UT) != null) {
                    this.rkt = false;
                    webView.evaluateJavascript(lu(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                pq();
            }
        } catch (Throwable th3) {
            DSW.YFl("PlayablePlugin", "crashMonitor error", th3);
        }
    }

    public JSONObject YoT() {
        try {
            boolean YFl2 = wN.YFl(this.ZLB, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", YFl2);
            return jSONObject;
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public void eT(String str) {
        this.qsH.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.3
            @Override // java.lang.Runnable
            public void run() {
                qsH.GA(qsH.this);
            }
        });
    }

    public JSONObject qsH(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            jSONObject2.put("result", wN.Sg(this.ZLB, "android.permission.RECORD_AUDIO"));
        } else {
            if (optInt != 2) {
                if (optInt == 3) {
                    jSONObject2.put("result", wN.YFl(this.ZLB));
                }
                return jSONObject2;
            }
            jSONObject2.put("result", wN.Sg(this.ZLB, "android.permission.CAMERA"));
        }
        return jSONObject2;
    }

    public qsH tN(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.yn = jSONObject;
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "setPlayableStyle error", th2);
        }
        return this;
    }

    public qsH vc(String str) {
        this.wXo = str;
        return this;
    }

    public qsH wN(String str) {
        this.dBO = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.kA == view.getWidth() && this.SVa == view.getHeight()) {
                return;
            }
            this.kA = view.getWidth();
            this.SVa = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.kA);
            jSONObject.put("height", this.SVa);
            YFl("resize", jSONObject);
            this.qjy = jSONObject;
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "resetViewDataJsonByView error", th2);
        }
    }

    public qsH AlY(boolean z10) {
        this.LL = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.LL);
            YFl("change_playable_click", jSONObject);
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "setPlayableClick error", th2);
        }
        return this;
    }

    public void vc(JSONObject jSONObject) {
        Sg(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void wN(JSONObject jSONObject) {
        this.Vmj = jSONObject;
        this.VB++;
        mn();
        this.qsH.removeCallbacks(this.eT);
        if (this.VOe) {
            this.lu = System.currentTimeMillis();
            this.lL = System.currentTimeMillis();
            this.zz = 0L;
            int i10 = this.in;
            if (i10 == 0) {
                WebView webView = this.UT;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.10
                        @Override // android.webkit.ValueCallback
                        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            qsH.this.zz = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i10 == 1 || i10 == 2) {
                YFl("playable_stuck_check_ping", new JSONObject());
            }
            this.qsH.postDelayed(this.eT, this.dXO);
        }
    }

    private void YFl(Context context, tN tNVar, com.bytedance.sdk.openadsdk.qO.YFl yFl) {
        this.aIu = UUID.randomUUID().toString();
        this.ZLB = context;
        this.rE = yFl;
        this.AfY = tNVar;
        nc.YFl(yFl);
        this.YP = new vc(this);
        UI();
        if (this.UT == null) {
            this.ks = 4;
            this.qsH.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.4
                @Override // java.lang.Runnable
                public void run() {
                    qsH.this.YFl(5, "webview is null");
                }
            });
        }
    }

    public void nc(String str) {
        this.qsH.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.2
            @Override // java.lang.Runnable
            public void run() {
                qsH.YoT(qsH.this);
            }
        });
    }

    public void vc(boolean z10) {
        this.cC = z10;
    }

    public qsH tN(boolean z10) {
        if (this.ks == -1 || this.zl == z10) {
            return this;
        }
        this.zl = z10;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.zl) {
                jSONObject.put("playable_background_show_type", this.f10792ib);
            }
        } catch (JSONException unused) {
        }
        tN(this.zl ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.mn == -1 && this.zl) {
            this.mn = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", this.ks == 1 ? 1 : 2);
                int i10 = this.ks;
                if (i10 != -1) {
                    jSONObject2.put("webview_state", i10);
                }
            } catch (JSONException unused2) {
            }
            tN("PL_sdk_page_show", jSONObject2);
        }
        if (this.mn != -1 && !this.zl && !this.f10789dc) {
            this.f10789dc = true;
        }
        if (this.zl) {
            this.pq = System.currentTimeMillis();
        } else if (this.pq != -1) {
            this.Cfr += System.currentTimeMillis() - this.pq;
            this.pq = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.zl);
            YFl("viewableChange", jSONObject3);
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "setViewable error", th2);
        }
        if (this.zl) {
            pq();
        } else {
            mn();
        }
        return this;
    }

    public void AlY(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.Jc = jSONObject.optString("section");
        }
    }

    public void qsH(String str) {
        this.Bn = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zB = currentTimeMillis;
            long j3 = this.mn;
            jSONObject.put("playable_page_show_duration", j3 != -1 ? currentTimeMillis - j3 : 0L);
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "reportUrlLoadStart error", th2);
        }
        tN("PL_sdk_html_load_start", jSONObject);
        this.f10791hf = true;
        this.Xrd = true;
        if (this.iv) {
            Cfr();
            this.f10791hf = false;
            this.Xrd = false;
        }
        if (this.lG) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (wN.YFl(this.ZLB, wN.YoT)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (wN.Sg(this.ZLB, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (wN.YFl(this.ZLB, wN.eT)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (wN.YFl(this.ZLB, wN.f10801nc)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (wN.YFl(this.ZLB, wN.NjR)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (wN.YFl(this.ZLB, wN.qsH)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (wN.Sg(this.ZLB, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (wN.YFl(this.ZLB, wN.DSW)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (wN.YFl(this.ZLB)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                tN("PL_sdk_hardware_detect", jSONObject2);
                this.lG = false;
            } catch (Throwable th3) {
                DSW.YFl("PlayablePlugin", "Hardware detect error", th3);
            }
        }
    }

    private String AlY(String str, String str2) {
        String format = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.ECi = format;
        return format;
    }

    public JSONObject AlY(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (DSW.YFl() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject YFl2 = this.YP.YFl(str, jSONObject);
        if (DSW.YFl()) {
            System.currentTimeMillis();
            if (YFl2 != null) {
                YFl2.toString();
            }
        }
        return YFl2;
    }

    public Map<String, String> Sg() {
        return this.Gmi;
    }

    public qsH Sg(String str) {
        this.Gnp = str;
        return this;
    }

    public qsH Sg(boolean z10) {
        this.toy = z10;
        return this;
    }

    public void YFl(View view) {
        if (view == null) {
            return;
        }
        try {
            this.DjU = new WeakReference<>(view);
            Sg(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.kU);
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "setViewForScreenSize error", th2);
        }
    }

    public qsH Sg(long j3) {
        if (j3 <= 0) {
            this.Ga = 10L;
        } else {
            this.Ga = j3;
        }
        return this;
    }

    private void wN(String str, JSONObject jSONObject) {
        try {
            int i10 = this.in;
            if (i10 == 0) {
                if (this.uGS != YFl.LAND_PAGE && !YoT(this.ECi)) {
                    ZU();
                }
                jSONObject.put("playable_url", this.ECi);
            } else {
                if (i10 != 3 && i10 != 4) {
                    if (i10 == 1 || i10 == 2) {
                        jSONObject.put("playable_url", tN(this.JB, this.Uv));
                    }
                }
                jSONObject.put("playable_url", AlY(this.JGG, this.f10796oa));
            }
            jSONObject.put("playable_render_type", this.in);
            if (this.rE != null) {
                if (this.in == 0 && (this.uGS != YFl.LAND_PAGE || YoT(this.ECi))) {
                    this.rE.YFl(jSONObject);
                } else if (this.in != 0) {
                    this.rE.YFl(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void Sg(JSONObject jSONObject) {
        if (this.rE != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context YFl() {
        return this.ZLB;
    }

    public void Sg(String str, String str2) {
        Bitmap YFl2;
        if (TextUtils.isEmpty(str2) || (YFl2 = wN.YFl(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.ZLB.getContentResolver(), YFl2, str, "");
    }

    public qsH YFl(String str, String str2) {
        this.Gmi.put(str, str2);
        return this;
    }

    public void NjR(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("success", true);
            if (optBoolean) {
                this.Bn = 3;
                pq();
            } else {
                this.Bn = -2;
            }
            if (optBoolean || !this.Ne) {
                return;
            }
            this.Ne = false;
            this.f10791hf = false;
            this.Xrd = false;
            this.qsH.removeCallbacks(this.NjR);
            this.qsH.removeCallbacks(this.f10794nc);
            YFl(4, "CaseRenderFail");
        }
    }

    public qsH YFl(String str) {
        this.jz = str;
        return this;
    }

    public qsH YFl(boolean z10) {
        this.agS = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.agS);
            YFl("volumeChange", jSONObject);
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "setIsMute error", th2);
        }
        return this;
    }

    public JSONObject DSW(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            return YoT();
        }
        if (optInt != 2) {
            return optInt != 3 ? jSONObject2 : pDU();
        }
        return GA();
    }

    public qsH Sg(int i10) {
        this.in = i10;
        return this;
    }

    public void Sg(int i10, String str) {
        this.dGX = i10;
        if (this.Vmj == null) {
            this.Vmj = new JSONObject();
        }
        try {
            this.Vmj.put("playable_stuck_type", i10);
            this.Vmj.put("playable_stuck_reason", str);
            if (this.lu > 0) {
                this.Vmj.put("playable_stuck_duration", System.currentTimeMillis() - this.lu);
            } else {
                this.Vmj.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        tN("PL_sdk_page_stuck", this.Vmj);
        mn();
        if (this.rE == null || i10 != 2) {
            return;
        }
        this.Vmj = new JSONObject();
    }

    public qsH YFl(long j3) {
        if (j3 <= 0) {
            this.YI = 10L;
        } else {
            this.YI = j3;
        }
        return this;
    }

    public void YFl(int i10) {
        this.ks = i10;
    }

    public qsH wN(boolean z10) {
        this.iv = z10;
        return this;
    }

    public void YFl(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.qO.YFl yFl = this.rE;
        if (yFl == null || yFl.Sg(jSONObject) || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("resource_type", -1);
        String optString2 = jSONObject.optString("resource_name", "playable_media");
        if (optInt == 1) {
            Sg(optString2, optString);
        }
    }

    public qsH tN(JSONObject jSONObject) {
        this.dU = jSONObject;
        return this;
    }

    private void tN(int i10, String str) {
        com.bytedance.sdk.openadsdk.qO.YFl yFl = this.rE;
        if (yFl != null) {
            yFl.YFl(i10, str);
        }
    }

    public void Sg(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        wN(str, jSONObject);
    }

    public void YFl(String str, JSONObject jSONObject) {
        if (DSW.YFl() && jSONObject != null) {
            jSONObject.toString();
        }
        tN tNVar = this.AfY;
        if (tNVar != null) {
            tNVar.YFl(str, jSONObject);
        }
    }

    private String tN(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.IXB) && !TextUtils.isEmpty(this.f10799xg)) {
            Uri parse = Uri.parse(this.f10799xg);
            String host = parse.getHost();
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter = parse.getQueryParameter("surl");
                queryParameter2 = parse.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
                queryParameter2 = "";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(parse.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                appendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.IXB = appendQueryParameter.toString();
        }
        return this.IXB;
    }

    public qsH YFl(float f10) {
        this.PT = f10;
        return this;
    }

    public void YFl(int i10, String str) {
        mn();
        tN(i10, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "reportRenderFatal error", th2);
        }
        tN("PL_sdk_global_faild", jSONObject);
    }

    public void YFl(int i10, String str, String str2) {
        this.Bn = -1;
        this.VJb = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", GS());
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "onWebReceivedError error", th2);
        }
        tN("PL_sdk_html_load_error", jSONObject);
        if (this.Ne) {
            this.Ne = false;
            this.f10791hf = false;
            this.Xrd = false;
            this.qsH.removeCallbacks(this.NjR);
            this.qsH.removeCallbacks(this.f10794nc);
            YFl(1, "ContainerLoadFail");
        }
    }

    public void tN(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.iY && this.fIu > 0) {
                this.iY = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.cC ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.zl);
            jSONObject.put("playable_session_id", this.aIu);
            int i10 = this.in;
            if (i10 == 0) {
                if (this.uGS != YFl.LAND_PAGE && !YoT(this.ECi)) {
                    ZU();
                }
                jSONObject.put("playable_url", this.ECi);
            } else {
                if (i10 != 3 && i10 != 4) {
                    if (i10 == 1 || i10 == 2) {
                        jSONObject.put("playable_url", tN(this.JB, this.Uv));
                    }
                }
                jSONObject.put("playable_url", AlY(this.JGG, this.f10796oa));
            }
            jSONObject.put("playable_full_url", this.f10799xg);
            jSONObject.put("playable_replay_count", this.Bh);
            jSONObject.put("playable_is_prerender", this.toy);
            jSONObject.put("playable_is_preload", this.iY);
            jSONObject.put("playable_render_type", this.in);
            jSONObject.put("playable_scenes_type", this.uGS.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.JB) ? "" : this.JB);
            if (!TextUtils.isEmpty(this.Uv)) {
                str2 = this.Uv;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.JGG);
            jSONObject.put("playable_minigamelite_schema", this.f10796oa);
            jSONObject.put("playable_is_debug", this.ww);
            jSONObject.put("playable_retry_count", this.Ld);
            jSONObject.put("playable_enter_from", this.Cqy);
            jSONObject.put("playable_sequence", this.VB);
            jSONObject.put("playable_current_section", this.Jc);
            jSONObject.put("is_playable_finish", this.RX);
            jSONObject.put("playable_card_session", this.UI);
            jSONObject.put("playable_video_session", this.ZU);
            jSONObject.put("playable_network_type", rkt());
            jSONObject.put("playable_lynx_version", this.UZM);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.wXo);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.dU.opt(BidResponsedEx.KEY_CID));
            jSONObject2.put("log_extra", this.dU.opt("log_extra"));
            int i11 = this.in;
            if (i11 != -1 && i11 != -2) {
                if (this.rE != null) {
                    List<JSONObject> list = this.TMt;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.TMt.iterator();
                        while (it.hasNext()) {
                            JSONObject optJSONObject = it.next().optJSONObject("ad_extra_data");
                            if (optJSONObject != null) {
                                optJSONObject.put("playable_render_type", this.in);
                                optJSONObject.put("playable_url", this.ECi);
                            }
                            this.rE.YFl(optJSONObject);
                        }
                        this.TMt.clear();
                    }
                    if (this.in == 0 && (this.uGS != YFl.LAND_PAGE || YoT(this.ECi))) {
                        this.rE.YFl(jSONObject);
                        return;
                    } else {
                        if (this.in != 0) {
                            this.rE.YFl(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.TMt == null) {
                this.TMt = new ArrayList();
            }
            this.TMt.add(jSONObject2);
        } catch (Throwable th2) {
            DSW.YFl("PlayablePlugin", "reportEvent error", th2);
        }
    }

    public void YFl(boolean z10, String str, int i10) {
        if (z10) {
            this.Bn = -1;
            this.VJb = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i10);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", GS());
            } catch (Throwable th2) {
                DSW.YFl("PlayablePlugin", "onWebReceivedHttpError error", th2);
            }
            tN("PL_sdk_html_load_error", jSONObject);
            if (this.Ne) {
                this.Ne = false;
                this.f10791hf = false;
                this.Xrd = false;
                this.qsH.removeCallbacks(this.NjR);
                this.qsH.removeCallbacks(this.f10794nc);
                YFl(1, "ContainerLoadFail");
            }
        }
    }

    private qsH(Context context, int i10, tN tNVar, com.bytedance.sdk.openadsdk.qO.YFl yFl) {
        this.f10798vc = "playable_stuck_check_ping";
        this.DSW = "playable_apply_media_permission_callback";
        this.qsH = new Handler(Looper.getMainLooper());
        this.YoT = new Handler(Looper.getMainLooper());
        this.rkt = true;
        this.lG = true;
        this.Wwa = true;
        this.YFl = "PL_sdk_playable_global_viewable";
        this.Sg = "PL_sdk_page_screen_blank";
        this.tN = "PL_sdk_playable_destroy_analyze_summary";
        this.AlY = "PL_sdk_playable_hardware_dialog_cancel";
        this.wN = "PL_sdk_playable_hardware_dialog_setting";
        this.qO = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.aIu = null;
        this.wXo = "embeded_ad";
        this.Ne = true;
        this.VOe = true;
        this.bZ = false;
        this.UZM = "";
        this.YI = 10L;
        this.Ga = 10L;
        this.dXO = 700;
        this.Cfr = 0L;
        this.hQ = 0L;
        this.pq = -1L;
        this.mn = -1L;
        this.zB = -1L;
        this.Sco = -1L;
        this.GS = -1L;
        this.lu = -1L;
        this.mB = -1L;
        this.UI = "";
        this.ZU = "";
        this.BPI = "";
        this.zG = "";
        this.ko = 0;
        this.fIu = 0;
        this.iY = false;
        this.Bh = 0;
        this.dGX = -1;
        this.Ld = 0;
        this.Cqy = 0;
        this.VB = 0;
        this.Jc = null;
        this.RX = false;
        this.tQ = 0;
        this.f10792ib = 0;
        this.Hjb = 0;
        this.f10790dd = 0;
        this.lL = 0L;
        this.zz = 0L;
        this.in = -2;
        this.Bn = 0;
        this.kA = 0;
        this.SVa = 0;
        this.qjy = new JSONObject();
        this.Gmi = new HashMap();
        this.dU = new JSONObject();
        this.f10799xg = "";
        this.Af = 0.0f;
        this.ZS = 0.0f;
        this.f10789dc = false;
        this.ww = false;
        this.f10793id = false;
        this.TMt = new ArrayList();
        this.iv = true;
        this.f10791hf = true;
        this.Xrd = true;
        this.kU = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.qO.qsH.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) qsH.this.DjU.get();
                    if (view != null) {
                        qsH.this.Sg(view);
                    }
                } catch (Throwable th2) {
                    DSW.YFl("PlayablePlugin", "onSizeChanged error", th2);
                }
            }
        };
        this.ks = -1;
        this.in = i10;
        this.uGS = YFl.LAND_PAGE;
        YFl(context, tNVar, yFl);
    }

    public static qsH YFl(Context context, @Nullable WebView webView, tN tNVar, com.bytedance.sdk.openadsdk.qO.YFl yFl) {
        if (tNVar == null || yFl == null) {
            return null;
        }
        if (webView == null) {
            return new qsH(context, 0, tNVar, yFl);
        }
        return new qsH(context, webView, tNVar, yFl, YFl.LAND_PAGE);
    }
}
