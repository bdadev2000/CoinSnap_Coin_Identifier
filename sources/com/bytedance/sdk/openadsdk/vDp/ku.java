package com.bytedance.sdk.openadsdk.vDp;

import Q7.n0;
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
import com.adjust.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.o;
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
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku {
    private boolean Ay;
    private Runnable Bj;
    private WebView CZ;
    private boolean Dp;
    private com.bytedance.sdk.openadsdk.vDp.zp Eg;
    private String Fm;
    private String HaA;
    private int Iok;
    private int KVS;
    private boolean NJ;
    private JSONObject Np;
    private String PI;
    private zp REM;
    private String RRQ;
    private KS TS;
    private String VuU;
    private boolean WJ;
    private Runnable YW;
    private int YcG;
    private HWF bQm;
    private Context bX;
    private lMd dQp;
    private Runnable dT;
    private String eyb;
    private int fw;
    private JSONObject hRp;
    private int hl;
    private int jQ;
    private int jyq;
    private String lT;
    private String led;
    private float ny;
    private int pdH;
    private int qJZ;
    private int rOJ;
    private Runnable rV;
    private int sm;
    private Runnable tG;
    private String uOT;
    private String uVa;
    private WeakReference<View> vLi;
    private String yI;
    private final String HWF = "playable_stuck_check_ping";
    private final String QR = "playable_apply_media_permission_callback";
    private final Handler ku = new Handler(Looper.getMainLooper());
    private final Handler vDp = new Handler(Looper.getMainLooper());
    private boolean KVG = true;
    private boolean woN = true;
    private boolean vwr = true;
    public final String zp = "PL_sdk_playable_global_viewable";
    public final String lMd = "PL_sdk_page_screen_blank";
    public final String KS = "PL_sdk_playable_destroy_analyze_summary";
    public final String jU = "PL_sdk_playable_hardware_dialog_cancel";
    public final String COT = "PL_sdk_playable_hardware_dialog_setting";
    private Set<String> pvr = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
    private String cz = null;
    private String FP = "embeded_ad";
    private boolean ot = true;
    private boolean yRU = true;
    private boolean ox = false;
    private String RCv = "";
    private long Lij = 10;
    private long Gzh = 10;
    private int irS = 700;
    private long QUv = 0;
    private long cW = 0;
    private long YhE = -1;
    private long WNy = -1;
    private long UPs = -1;
    private long fRl = -1;
    private long ffE = -1;
    private long eWG = -1;
    private long Pxi = -1;
    private String oKZ = "";
    private String BO = "";
    private String Iv = "";
    private String aax = "";
    private int Rg = 0;
    private int si = 0;
    private boolean DY = false;
    private int Rh = 0;
    private int gH = -1;
    private int rCC = 0;
    private int MBR = 0;
    private int oB = 0;
    private String fgJ = null;
    private boolean qtv = false;
    private int Vjb = 0;
    private int fs = 0;
    private int GP = 0;
    private int mW = 0;
    private long sqt = 0;
    private long fVt = 0;
    private int zpV = 0;
    private int Rea = 0;
    private int Ml = 0;
    private JSONObject iOI = new JSONObject();
    private Map<String, String> xg = new HashMap();
    private JSONObject zR = new JSONObject();
    private String tyQ = "";
    private float etV = 0.0f;
    private float Sr = 0.0f;
    private boolean WLq = false;
    private boolean LU = false;
    private boolean KL = false;
    private List<JSONObject> FGx = new ArrayList();
    private boolean Sx = true;
    private volatile boolean dm = true;
    private volatile boolean Gor = true;
    private ViewTreeObserver.OnGlobalLayoutListener slc = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                View view = (View) ku.this.vLi.get();
                if (view != null) {
                    ku.this.lMd(view);
                }
            } catch (Throwable th) {
                QR.zp("PlayablePlugin", "onSizeChanged error", th);
            }
        }
    };

    /* loaded from: classes.dex */
    public enum zp {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private ku(Context context, WebView webView, KS ks, com.bytedance.sdk.openadsdk.vDp.zp zpVar, zp zpVar2) {
        this.YcG = -2;
        this.YcG = 0;
        this.REM = zpVar2;
        this.CZ = webView;
        YW.zp(webView);
        zp(webView);
        zp(context, ks, zpVar);
    }

    private void Pxi() {
        String str;
        if (this.zR == null || (str = this.HaA) == null || str.contains("/cid_")) {
            return;
        }
        String optString = this.zR.optString(BidResponsedEx.KEY_CID);
        if (!TextUtils.isEmpty(optString)) {
            String host = Uri.parse(this.HaA).getHost();
            if (TextUtils.isEmpty(host)) {
                this.HaA = n0.l(new StringBuilder(), this.HaA, "/cid_", optString);
            } else {
                this.HaA = this.HaA.replace(host, o.k(host, "/cid_", optString));
            }
        }
    }

    private void eWG() {
        this.dQp = new lMd(this, this.irS);
        this.YW = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.3
            @Override // java.lang.Runnable
            public void run() {
                if (ku.this.ot) {
                    ku.this.ot = false;
                    ku.this.ku.removeCallbacks(ku.this.dT);
                    ku.this.zp(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.dT = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.4
            @Override // java.lang.Runnable
            public void run() {
                if (ku.this.ot) {
                    ku.this.ot = false;
                    ku.this.dm = false;
                    ku.this.ku.removeCallbacks(ku.this.YW);
                    ku.this.zp(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.tG = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.5
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (ku.this.CZ != null) {
                    ku.this.CZ.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.5.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (ku.this.dQp != null) {
                                ku.this.dQp.zp(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (ku.this.vDp != null) {
                    ku.this.vDp.postDelayed(this, 500L);
                }
            }
        };
        this.rV = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.6
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                ku.this.zp("playable_stuck_check_ping", new JSONObject());
                if (ku.this.vDp != null) {
                    ku.this.vDp.postDelayed(this, 500L);
                }
            }
        };
        this.Bj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.7
            @Override // java.lang.Runnable
            public void run() {
                if (ku.this.fVt > 0) {
                    if (ku.this.fVt - ku.this.sqt <= ku.this.irS) {
                        ku.this.YhE();
                        ku.this.sqt = 0L;
                        ku.this.fVt = 0L;
                        return;
                    }
                    ku.this.lMd(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                ku.this.lMd(1, "Clicking on the hot zone causes the program to freeze.");
            }
        };
    }

    private void oKZ() {
        Runnable runnable;
        Runnable runnable2;
        this.dQp.zp(System.currentTimeMillis());
        Handler handler = this.vDp;
        if (handler != null) {
            int i9 = this.YcG;
            if (i9 == 0 && (runnable2 = this.tG) != null) {
                handler.post(runnable2);
            } else if ((i9 == 1 || i9 == 2) && (runnable = this.rV) != null) {
                handler.post(runnable);
            }
            this.dQp.zp(500);
        }
    }

    public static /* synthetic */ int tG(ku kuVar) {
        int i9 = kuVar.si;
        kuVar.si = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int vDp(ku kuVar) {
        int i9 = kuVar.Rg;
        kuVar.Rg = i9 + 1;
        return i9;
    }

    public void FP() {
        com.bytedance.sdk.openadsdk.vDp.zp zpVar = this.Eg;
        if (zpVar != null) {
            zpVar.lMd();
        }
    }

    public void Gzh() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.ffE > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.ffE);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.UPs > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.UPs);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            KS("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public String KVG() {
        com.bytedance.sdk.openadsdk.vDp.zp zpVar;
        if (TextUtils.isEmpty(this.Iv) && (zpVar = this.Eg) != null) {
            this.Iv = zpVar.zp().toString();
        }
        return this.Iv;
    }

    public void Lij() {
        if (this.Eg != null) {
            zp zpVar = zp.LAND_PAGE;
        }
    }

    public void QUv() {
        int i9;
        int i10 = this.YcG;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (this.dm) {
                this.ku.postDelayed(this.YW, this.Lij * 1000);
            }
            if ((this.Gor && Bj(this.HaA)) || (i9 = this.YcG) == 1 || i9 == 2) {
                this.ku.postDelayed(this.dT, this.Gzh * 1000);
            }
        }
    }

    public void RCv() {
        if (this.Eg != null) {
            zp zpVar = zp.LAND_PAGE;
        }
    }

    public void UPs() {
        this.Rea = 0;
        this.Ml = 0;
        this.ny = 0.0f;
        this.sm = 0;
        this.rOJ = 0;
        this.Iok = 0;
        this.fw = 0;
        this.pdH = 0;
        this.hl = 0;
        this.jyq = 0;
        this.jQ = 0;
        this.qJZ = 0;
        this.KVS = 0;
    }

    public void WNy() {
        try {
            lMd lmd = this.dQp;
            if (lmd != null) {
                lmd.zp();
            }
            Handler handler = this.vDp;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public void YhE() {
        if (!this.yRU) {
            return;
        }
        this.eWG = System.currentTimeMillis();
        if (this.REM == zp.FEED_AWEME) {
            if (this.NJ && this.zpV == 3) {
                lMd lmd = this.dQp;
                if (lmd != null && lmd.lMd()) {
                    oKZ();
                    return;
                } else {
                    if (this.dQp == null) {
                        this.dQp = new lMd(this, this.irS);
                        oKZ();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.NJ && this.zpV == 2) {
            lMd lmd2 = this.dQp;
            if (lmd2 != null && lmd2.lMd()) {
                oKZ();
            } else if (this.dQp == null) {
                this.dQp = new lMd(this, this.irS);
                oKZ();
            }
        }
    }

    public void cW() {
        this.dm = false;
        this.Gor = false;
        this.ku.removeCallbacks(this.YW);
        this.ku.removeCallbacks(this.dT);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.UPs > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.UPs);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            KS("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public JSONObject cz() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.ny);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.sm);
            jSONObject2.put("height", this.rOJ);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.fw);
            jSONObject3.put("y", this.Iok);
            jSONObject3.put("width", this.pdH);
            jSONObject3.put("height", this.hl);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.jQ);
            jSONObject4.put("y", this.jyq);
            jSONObject4.put("width", this.qJZ);
            jSONObject4.put("height", this.KVS);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public JSONObject dQp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.REM.ordinal());
            jSONObject.put("safe_area_top_height", this.etV);
            jSONObject.put("safe_area_bottom_height", this.Sr);
            jSONObject.put("playable_enter_from", this.MBR);
            jSONObject.put("playable_retry_count", this.rCC);
            jSONObject.put("playable_card_session", this.oKZ);
            jSONObject.put("playable_video_session", this.BO);
            jSONObject.put("playable_network_type", KVG());
            jSONObject.put("aweme_id", this.aax);
            return jSONObject;
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void fRl() {
        if (this.KL) {
            return;
        }
        this.KL = true;
        this.cW = 0L;
        this.woN = true;
        UPs();
        try {
            View view = this.vLi.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.slc);
            }
        } catch (Throwable unused) {
        }
        try {
            this.bQm.lMd();
        } catch (Throwable unused2) {
        }
        try {
            lMd lmd = this.dQp;
            if (lmd != null) {
                lmd.zp();
                this.dQp = null;
            }
            Handler handler = this.vDp;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.HaA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.Rg);
                jSONObject.put("playable_hit_times", this.si);
                int i9 = this.Rg;
                if (i9 > 0) {
                    jSONObject.put("playable_hit_ratio", this.si / (i9 * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                KS("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.HaA)) {
                if (this.YhE != -1) {
                    this.QUv += System.currentTimeMillis() - this.YhE;
                    this.YhE = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.QUv);
                KS("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.dm = false;
        this.Gor = false;
        this.ku.removeCallbacks(this.YW);
        this.ku.removeCallbacks(this.dT);
        this.ku.removeCallbacksAndMessages(null);
    }

    public String ffE() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public void irS() {
        lMd lmd;
        this.fVt = System.currentTimeMillis();
        int i9 = this.YcG;
        if ((i9 == 1 || i9 == 2) && (lmd = this.dQp) != null) {
            lmd.zp(System.currentTimeMillis());
        }
    }

    public void ot() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.ffE > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.ffE);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.UPs > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.UPs;
                this.Pxi = currentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", currentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            KS("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void ox() {
        this.qtv = true;
    }

    public JSONObject pvr() {
        return this.zR;
    }

    public JSONObject rV() {
        boolean zp2;
        boolean zp3;
        try {
            boolean z8 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zp2 = COT.zp(this.bX, "android.permission.READ_MEDIA_IMAGES");
                zp3 = true;
            } else {
                zp2 = COT.zp(this.bX, "android.permission.READ_EXTERNAL_STORAGE");
                zp3 = COT.zp(this.bX, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zp2);
            jSONObject.put("isHasWrite", zp3);
            if (!zp2 || !zp3) {
                z8 = false;
            }
            jSONObject.put("result", z8);
            return jSONObject;
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject vwr() {
        if (this.iOI.isNull("width")) {
            View view = this.vLi.get();
            if (view == null) {
                return this.iOI;
            }
            lMd(view);
        }
        return this.iOI;
    }

    public com.bytedance.sdk.openadsdk.vDp.zp woN() {
        return this.Eg;
    }

    public void yRU() {
        this.gH = 2;
    }

    private boolean Bj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public String COT() {
        return this.eyb;
    }

    public String HWF() {
        return this.Fm;
    }

    public JSONObject KS() {
        return this.hRp;
    }

    public String QR() {
        return this.uVa;
    }

    public boolean YW() {
        return this.NJ;
    }

    public JSONObject dT() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.Dp);
            return jSONObject;
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public String jU() {
        return this.VuU;
    }

    public boolean ku() {
        return this.Ay;
    }

    public JSONObject tG() {
        try {
            boolean zp2 = COT.zp(this.bX, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zp2);
            return jSONObject;
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject vDp() {
        try {
            boolean zp2 = COT.zp(this.bX, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zp2);
            return jSONObject;
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public Set<String> Bj() {
        return this.bQm.zp();
    }

    public ku COT(String str) {
        this.uVa = str;
        return this;
    }

    public ku HWF(String str) {
        Uri parse;
        String scheme;
        int indexOf;
        String decode;
        this.tyQ = str;
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Throwable unused) {
        }
        if (!"http".equalsIgnoreCase(scheme) && !Constants.SCHEME.equalsIgnoreCase(scheme)) {
            String host = parse.getHost();
            if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.YcG == -1) {
                        zp(2);
                    } else {
                        zp(1);
                    }
                }
                this.HaA = str;
                return this;
            }
            zp(0);
            String queryParameter = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter) && (decode = Uri.decode(queryParameter)) != null) {
                int indexOf2 = decode.indexOf("?");
                str = indexOf2 != -1 ? decode.substring(0, indexOf2) : decode;
            }
            this.HaA = str;
            return this;
        }
        zp(0);
        if (str != null && (indexOf = str.indexOf("?")) != -1) {
            str = str.substring(0, indexOf);
        }
        this.HaA = str;
        return this;
    }

    public ku KS(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.hRp = jSONObject;
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public JSONObject QR(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            return vDp();
        }
        if (optInt != 2) {
            return optInt != 3 ? jSONObject2 : rV();
        }
        return tG();
    }

    public void YW(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("success", true);
            if (optBoolean) {
                this.zpV = 3;
                YhE();
            } else {
                this.zpV = -2;
            }
            if (optBoolean || !this.ot) {
                return;
            }
            this.ot = false;
            this.dm = false;
            this.Gor = false;
            this.ku.removeCallbacks(this.YW);
            this.ku.removeCallbacks(this.dT);
            zp(4, "CaseRenderFail");
        }
    }

    public ku jU(String str) {
        this.Fm = str;
        return this;
    }

    public JSONObject ku(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            jSONObject2.put("result", COT.lMd(this.bX, "android.permission.RECORD_AUDIO"));
        } else {
            if (optInt != 2) {
                if (optInt == 3) {
                    jSONObject2.put("result", COT.zp(this.bX));
                }
                return jSONObject2;
            }
            jSONObject2.put("result", COT.lMd(this.bX, "android.permission.CAMERA"));
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.Rea == view.getWidth() && this.Ml == view.getHeight()) {
                return;
            }
            this.Rea = view.getWidth();
            this.Ml = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.Rea);
            jSONObject.put("height", this.Ml);
            zp("resize", jSONObject);
            this.iOI = jSONObject;
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public void COT(JSONObject jSONObject) {
        this.Np = jSONObject;
        this.oB++;
        WNy();
        this.ku.removeCallbacks(this.Bj);
        if (this.yRU) {
            this.eWG = System.currentTimeMillis();
            this.sqt = System.currentTimeMillis();
            this.fVt = 0L;
            int i9 = this.YcG;
            if (i9 == 0) {
                WebView webView = this.CZ;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.8
                        @Override // android.webkit.ValueCallback
                        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            ku.this.fVt = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i9 == 1 || i9 == 2) {
                zp("playable_stuck_check_ping", new JSONObject());
            }
            this.ku.postDelayed(this.Bj, this.irS);
        }
    }

    public void jU(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.fgJ = jSONObject.optString("section");
        }
    }

    private String jU(String str, String str2) {
        String format = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.HaA = format;
        return format;
    }

    private void zp(Context context, KS ks, com.bytedance.sdk.openadsdk.vDp.zp zpVar) {
        this.cz = UUID.randomUUID().toString();
        this.bX = context;
        this.Eg = zpVar;
        this.TS = ks;
        dT.zp(zpVar);
        this.bQm = new HWF(this);
        eWG();
    }

    public void dT(String str) {
        this.ku.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.2
            @Override // java.lang.Runnable
            public void run() {
                ku.tG(ku.this);
            }
        });
    }

    public JSONObject jU(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (QR.zp() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject zp2 = this.bQm.zp(str, jSONObject);
        if (QR.zp()) {
            System.currentTimeMillis();
            if (zp2 != null) {
                zp2.toString();
            }
        }
        return zp2;
    }

    public ku KS(boolean z8) {
        this.Dp = z8;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.Dp);
            zp("change_playable_click", jSONObject);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public void QR(String str) {
        this.zpV = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.UPs = currentTimeMillis;
            long j7 = this.WNy;
            jSONObject.put("playable_page_show_duration", j7 != -1 ? currentTimeMillis - j7 : 0L);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        KS("PL_sdk_html_load_start", jSONObject);
        this.dm = true;
        this.Gor = true;
        if (this.Sx) {
            QUv();
            this.dm = false;
            this.Gor = false;
        }
        if (this.woN) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (COT.zp(this.bX, COT.vDp)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (COT.lMd(this.bX, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (COT.zp(this.bX, COT.Bj)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (COT.zp(this.bX, COT.dT)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (COT.zp(this.bX, COT.YW)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (COT.zp(this.bX, COT.ku)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (COT.lMd(this.bX, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (COT.zp(this.bX, COT.QR)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (COT.zp(this.bX)) {
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
                KS("PL_sdk_hardware_detect", jSONObject2);
                this.woN = false;
            } catch (Throwable th2) {
                QR.zp("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public void ku(String str) {
        WebView webView;
        this.zpV = 2;
        this.PI = str;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.fRl = currentTimeMillis;
            long j7 = this.UPs;
            jSONObject.put("playable_html_load_start_duration", j7 != -1 ? currentTimeMillis - j7 : 0L);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "reportUrlLoadFinish error", th);
        }
        KS("PL_sdk_html_load_finish", jSONObject);
        this.dm = false;
        this.ku.removeCallbacks(this.YW);
        try {
            if (this.YcG == 0) {
                if (this.KVG && (webView = this.CZ) != null) {
                    this.KVG = false;
                    webView.evaluateJavascript(ffE(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.9
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                YhE();
            }
        } catch (Throwable th2) {
            QR.zp("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public ku KS(JSONObject jSONObject) {
        this.zR = jSONObject;
        return this;
    }

    public ku jU(boolean z8) {
        this.Sx = z8;
        return this;
    }

    public void zp(View view) {
        if (view == null) {
            return;
        }
        try {
            this.vLi = new WeakReference<>(view);
            lMd(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.slc);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    private void KS(int i9, String str) {
        com.bytedance.sdk.openadsdk.vDp.zp zpVar = this.Eg;
        if (zpVar != null) {
            zpVar.zp(i9, str);
        }
    }

    public Map<String, String> lMd() {
        return this.xg;
    }

    public void YW(String str) {
        this.ku.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vDp.ku.10
            @Override // java.lang.Runnable
            public void run() {
                ku.vDp(ku.this);
            }
        });
    }

    public ku lMd(String str) {
        this.VuU = str;
        return this;
    }

    private String KS(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.RRQ) && !TextUtils.isEmpty(this.tyQ)) {
            Uri parse = Uri.parse(this.tyQ);
            String host = parse.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = parse.getQueryParameter("surl");
                queryParameter2 = parse.getQueryParameter("playable_hash");
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(parse.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                appendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.RRQ = appendQueryParameter.toString();
        }
        return this.RRQ;
    }

    public ku lMd(long j7) {
        if (j7 <= 0) {
            this.Gzh = 10L;
        } else {
            this.Gzh = j7;
        }
        return this;
    }

    public Context zp() {
        return this.bX;
    }

    private void COT(String str, JSONObject jSONObject) {
        try {
            int i9 = this.YcG;
            if (i9 == 0) {
                if (this.REM != zp.LAND_PAGE && !Bj(this.HaA)) {
                    Pxi();
                }
                jSONObject.put("playable_url", this.HaA);
            } else {
                if (i9 != 3 && i9 != 4) {
                    if (i9 == 1 || i9 == 2) {
                        jSONObject.put("playable_url", KS(this.led, this.uOT));
                    }
                }
                jSONObject.put("playable_url", jU(this.lT, this.yI));
            }
            jSONObject.put("playable_render_type", this.YcG);
            if (this.Eg != null) {
                if (this.YcG == 0 && (this.REM != zp.LAND_PAGE || Bj(this.HaA))) {
                    this.Eg.zp(jSONObject);
                } else if (this.YcG != 0) {
                    this.Eg.zp(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public ku lMd(boolean z8) {
        if (this.NJ == z8) {
            return this;
        }
        this.NJ = z8;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.NJ) {
                jSONObject.put("playable_background_show_type", this.fs);
            }
        } catch (JSONException unused) {
        }
        KS(this.NJ ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.WNy == -1 && this.NJ) {
            this.WNy = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", 1);
            } catch (JSONException unused2) {
            }
            KS("PL_sdk_page_show", jSONObject2);
        }
        if (this.WNy != -1 && !this.NJ && !this.WLq) {
            this.WLq = true;
        }
        if (this.NJ) {
            this.YhE = System.currentTimeMillis();
        } else if (this.YhE != -1) {
            this.QUv += System.currentTimeMillis() - this.YhE;
            this.YhE = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.NJ);
            zp("viewableChange", jSONObject3);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "setViewable error", th);
        }
        if (this.NJ) {
            YhE();
        } else {
            WNy();
        }
        return this;
    }

    public ku zp(String str, String str2) {
        this.xg.put(str, str2);
        return this;
    }

    public ku zp(String str) {
        this.eyb = str;
        return this;
    }

    public ku zp(boolean z8) {
        this.Ay = z8;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.Ay);
            zp("volumeChange", jSONObject);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public void HWF(JSONObject jSONObject) {
        lMd(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public ku zp(long j7) {
        if (j7 <= 0) {
            this.Lij = 10L;
        } else {
            this.Lij = j7;
        }
        return this;
    }

    public void zp(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.vDp.zp zpVar = this.Eg;
        if (zpVar == null || zpVar.lMd(jSONObject) || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("resource_type", -1);
        String optString2 = jSONObject.optString("resource_name", "playable_media");
        if (optInt == 1) {
            lMd(optString2, optString);
        }
    }

    public void KS(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.DY && this.si > 0) {
                this.DY = true;
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.NJ);
            jSONObject.put("playable_session_id", this.cz);
            int i9 = this.YcG;
            if (i9 == 0) {
                if (this.REM != zp.LAND_PAGE && !Bj(this.HaA)) {
                    Pxi();
                }
                jSONObject.put("playable_url", this.HaA);
            } else {
                if (i9 != 3 && i9 != 4) {
                    if (i9 == 1 || i9 == 2) {
                        jSONObject.put("playable_url", KS(this.led, this.uOT));
                    }
                }
                jSONObject.put("playable_url", jU(this.lT, this.yI));
            }
            jSONObject.put("playable_full_url", this.tyQ);
            jSONObject.put("playable_replay_count", this.Rh);
            jSONObject.put("playable_is_prerender", this.WJ);
            jSONObject.put("playable_is_preload", this.DY);
            jSONObject.put("playable_render_type", this.YcG);
            jSONObject.put("playable_scenes_type", this.REM.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.led) ? "" : this.led);
            if (!TextUtils.isEmpty(this.uOT)) {
                str2 = this.uOT;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.lT);
            jSONObject.put("playable_minigamelite_schema", this.yI);
            jSONObject.put("playable_is_debug", this.LU);
            jSONObject.put("playable_retry_count", this.rCC);
            jSONObject.put("playable_enter_from", this.MBR);
            jSONObject.put("playable_sequence", this.oB);
            jSONObject.put("playable_current_section", this.fgJ);
            jSONObject.put("is_playable_finish", this.qtv);
            jSONObject.put("playable_card_session", this.oKZ);
            jSONObject.put("playable_video_session", this.BO);
            jSONObject.put("playable_network_type", KVG());
            jSONObject.put("playable_lynx_version", this.RCv);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.FP);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.zR.opt(BidResponsedEx.KEY_CID));
            jSONObject2.put("log_extra", this.zR.opt("log_extra"));
            int i10 = this.YcG;
            if (i10 != -1 && i10 != -2) {
                if (this.Eg != null) {
                    List<JSONObject> list = this.FGx;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.FGx.iterator();
                        while (it.hasNext()) {
                            JSONObject optJSONObject = it.next().optJSONObject("ad_extra_data");
                            if (optJSONObject != null) {
                                optJSONObject.put("playable_render_type", this.YcG);
                                optJSONObject.put("playable_url", this.HaA);
                            }
                            this.Eg.zp(optJSONObject);
                        }
                        this.FGx.clear();
                    }
                    if (this.YcG == 0 && (this.REM != zp.LAND_PAGE || Bj(this.HaA))) {
                        this.Eg.zp(jSONObject);
                        return;
                    } else {
                        if (this.YcG != 0) {
                            this.Eg.zp(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.FGx == null) {
                this.FGx = new ArrayList();
            }
            this.FGx.add(jSONObject2);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void zp(String str, JSONObject jSONObject) {
        if (QR.zp() && jSONObject != null) {
            jSONObject.toString();
        }
        KS ks = this.TS;
        if (ks != null) {
            ks.zp(str, jSONObject);
        }
    }

    public ku zp(int i9) {
        this.YcG = i9;
        return this;
    }

    public void zp(int i9, String str) {
        WNy();
        KS(i9, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i9);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "reportRenderFatal error", th);
        }
        KS("PL_sdk_global_faild", jSONObject);
    }

    public void lMd(JSONObject jSONObject) {
        if (this.Eg != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public void lMd(String str, String str2) {
        Bitmap zp2;
        if (TextUtils.isEmpty(str2) || (zp2 = COT.zp(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.bX.getContentResolver(), zp2, str, "");
    }

    public void zp(int i9, String str, String str2) {
        this.zpV = -1;
        this.PI = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i9);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
        } catch (Throwable th) {
            QR.zp("PlayablePlugin", "onWebReceivedError error", th);
        }
        KS("PL_sdk_html_load_error", jSONObject);
        if (this.ot) {
            this.ot = false;
            this.dm = false;
            this.Gor = false;
            this.ku.removeCallbacks(this.YW);
            this.ku.removeCallbacks(this.dT);
            zp(1, "ContainerLoadFail");
        }
    }

    public void lMd(int i9, String str) {
        this.gH = i9;
        if (this.Np == null) {
            this.Np = new JSONObject();
        }
        try {
            this.Np.put("playable_stuck_type", i9);
            this.Np.put("playable_stuck_reason", str);
            if (this.eWG > 0) {
                this.Np.put("playable_stuck_duration", System.currentTimeMillis() - this.eWG);
            } else {
                this.Np.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        KS("PL_sdk_page_stuck", this.Np);
        WNy();
        if (this.Eg == null || i9 != 2) {
            return;
        }
        this.Np = new JSONObject();
    }

    public void zp(boolean z8, String str, int i9) {
        if (z8) {
            this.zpV = -1;
            this.PI = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i9);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
            } catch (Throwable th) {
                QR.zp("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            KS("PL_sdk_html_load_error", jSONObject);
            if (this.ot) {
                this.ot = false;
                this.dm = false;
                this.Gor = false;
                this.ku.removeCallbacks(this.YW);
                this.ku.removeCallbacks(this.dT);
                zp(1, "ContainerLoadFail");
            }
        }
    }

    public void lMd(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        COT(str, jSONObject);
    }

    public static ku zp(Context context, WebView webView, KS ks, com.bytedance.sdk.openadsdk.vDp.zp zpVar) {
        if (webView == null || ks == null || zpVar == null) {
            return null;
        }
        return new ku(context, webView, ks, zpVar, zp.LAND_PAGE);
    }
}
