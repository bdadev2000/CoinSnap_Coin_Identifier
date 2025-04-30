package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.tG;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.lMd.lMd;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RCv implements com.bytedance.sdk.component.adexpress.COT.lMd, RCv.zp, com.bytedance.sdk.openadsdk.QR.lMd {
    private static final Map<String, Boolean> ku;
    private com.bytedance.sdk.openadsdk.core.widget.zp.zp BO;
    private WeakReference<View> Bj;
    private zp DY;
    private JSONObject FP;
    private com.bytedance.sdk.openadsdk.core.lMd.jU Gzh;
    private String HWF;
    private com.bytedance.sdk.openadsdk.YW.HWF Iv;
    private JSONObject Lij;
    private String Pxi;
    private com.bytedance.sdk.openadsdk.core.widget.lMd QR;
    private com.bytedance.sdk.openadsdk.YW.YW QUv;
    private com.bytedance.sdk.openadsdk.YW.jU RCv;
    private boolean Rg;
    private HashMap<String, YW> WNy;
    private com.bytedance.sdk.openadsdk.QR.KS YW;
    private List<com.bytedance.sdk.openadsdk.core.model.woN> YhE;
    private boolean aax;
    private com.bytedance.sdk.openadsdk.core.nativeexpress.vDp cz;
    private int dQp;
    private String dT;
    private com.bytedance.sdk.component.zp.woN eWG;
    private com.bytedance.sdk.openadsdk.lMd.KS.COT ffE;
    private com.bytedance.sdk.openadsdk.YW.lMd irS;
    private WeakReference<SSWebView> jU;
    boolean lMd;
    private com.bytedance.sdk.openadsdk.QR.jU ot;
    private com.bytedance.sdk.openadsdk.YW.COT ox;
    private com.bytedance.sdk.component.adexpress.lMd.Bj pvr;
    private String rV;
    private Context si;
    private int tG;
    private String vDp;
    private JSONObject vwr;
    private com.bytedance.sdk.openadsdk.core.model.woN woN;
    private com.bytedance.sdk.openadsdk.YW.zp yRU;
    protected Map<String, Object> zp;
    private boolean KVG = true;
    private boolean cW = true;
    private boolean UPs = false;
    private boolean fRl = false;
    boolean KS = false;
    private boolean oKZ = false;
    private final com.bytedance.sdk.component.utils.RCv COT = new com.bytedance.sdk.component.utils.RCv(Looper.getMainLooper(), this);

    /* loaded from: classes.dex */
    public static class lMd {
        public int COT;
        public String KS;
        public JSONObject jU;
        public String lMd;
        public String zp;
    }

    /* loaded from: classes.dex */
    public interface zp {
        void zp();
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ku = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public RCv(Context context) {
        this.si = context;
    }

    private boolean Bj(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.vDp vdp = this.cz;
        if (vdp != null && jSONObject != null) {
            double KS = vdp.KS();
            int jU = this.cz.jU();
            try {
                jSONObject.put("currentTime", KS / 1000.0d);
                jSONObject.put("state", jU);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:6:0x000c, B:8:0x0011, B:9:0x0017, B:11:0x001b, B:12:0x0021, B:14:0x004e, B:22:0x0067, B:23:0x0080, B:25:0x009a, B:28:0x00a2, B:30:0x00ab, B:31:0x00af, B:35:0x0074), top: B:5:0x000c }] */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject FP() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.settings.COT r1 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            com.bytedance.sdk.openadsdk.core.model.woN r1 = r10.woN     // Catch: java.lang.Exception -> Lb7
            r2 = 0
            if (r1 == 0) goto L16
            int r1 = r1.FGx()     // Catch: java.lang.Exception -> Lb7
            goto L17
        L16:
            r1 = r2
        L17:
            com.bytedance.sdk.openadsdk.core.model.woN r3 = r10.woN     // Catch: java.lang.Exception -> Lb7
            if (r3 == 0) goto L20
            int r3 = r3.Dp()     // Catch: java.lang.Exception -> Lb7
            goto L21
        L20:
            r3 = r2
        L21:
            com.bytedance.sdk.openadsdk.core.settings.COT r4 = com.bytedance.sdk.openadsdk.core.KVG.jU()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lb7
            int r4 = r4.dT(r5)     // Catch: java.lang.Exception -> Lb7
            com.bytedance.sdk.openadsdk.core.settings.COT r5 = com.bytedance.sdk.openadsdk.core.KVG.jU()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lb7
            int r5 = r5.vwr(r6)     // Catch: java.lang.Exception -> Lb7
            com.bytedance.sdk.openadsdk.core.settings.COT r6 = com.bytedance.sdk.openadsdk.core.KVG.jU()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lb7
            boolean r6 = r6.HWF(r7)     // Catch: java.lang.Exception -> Lb7
            com.bytedance.sdk.openadsdk.core.model.woN r7 = r10.woN     // Catch: java.lang.Exception -> Lb7
            boolean r7 = com.bytedance.sdk.openadsdk.core.model.woN.COT(r7)     // Catch: java.lang.Exception -> Lb7
            r8 = 1
            if (r7 != 0) goto L5e
            com.bytedance.sdk.openadsdk.core.settings.COT r7 = com.bytedance.sdk.openadsdk.core.KVG.jU()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lb7
            int r7 = r7.vDp(r9)     // Catch: java.lang.Exception -> Lb7
            if (r7 != r8) goto L5e
            r7 = r8
            goto L5f
        L5e:
            r7 = r2
        L5f:
            r9 = 7
            if (r3 == r9) goto L74
            r9 = 8
            if (r3 != r9) goto L67
            goto L74
        L67:
            com.bytedance.sdk.openadsdk.core.settings.COT r3 = com.bytedance.sdk.openadsdk.core.KVG.jU()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lb7
            boolean r1 = r3.KS(r1)     // Catch: java.lang.Exception -> Lb7
            goto L80
        L74:
            com.bytedance.sdk.openadsdk.core.settings.COT r3 = com.bytedance.sdk.openadsdk.core.KVG.jU()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lb7
            boolean r1 = r3.KVG(r1)     // Catch: java.lang.Exception -> Lb7
        L80:
            java.lang.String r3 = "voice_control"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "rv_skip_time"
            r0.put(r1, r4)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "fv_skip_show"
            r0.put(r1, r6)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "iv_skip_time"
            r0.put(r1, r5)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "show_dislike"
            com.bytedance.sdk.openadsdk.core.model.woN r3 = r10.woN     // Catch: java.lang.Exception -> Lb7
            if (r3 == 0) goto La1
            boolean r3 = r3.bQm()     // Catch: java.lang.Exception -> Lb7
            if (r3 == 0) goto La1
            goto La2
        La1:
            r8 = r2
        La2:
            r0.put(r1, r8)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "video_adaptation"
            com.bytedance.sdk.openadsdk.core.model.woN r3 = r10.woN     // Catch: java.lang.Exception -> Lb7
            if (r3 == 0) goto Laf
            int r2 = r3.Lij()     // Catch: java.lang.Exception -> Lb7
        Laf:
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "skip_change_to_close"
            r0.put(r1, r7)     // Catch: java.lang.Exception -> Lb7
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.RCv.FP():org.json.JSONObject");
    }

    private void HWF(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.cz.jU(this.woN))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.cz.jU(this.woN));
    }

    private Context KVG() {
        WeakReference<SSWebView> weakReference = this.jU;
        Activity zp2 = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.lMd.zp(this.jU.get());
        return zp2 == null ? this.si : zp2;
    }

    private void QR(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot;
        if (jSONObject == null || (cot = this.ffE) == null) {
            return;
        }
        cot.lMd(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YW(JSONObject jSONObject) {
        if (this.cz != null && jSONObject != null) {
            try {
                this.cz.zp(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false));
            } catch (Exception unused) {
            }
        }
    }

    private void cz() {
        if (this.si == null || TextUtils.isEmpty(KVG.jU().eWG())) {
            return;
        }
        TTWebsiteActivity.zp(this.si, this.woN, this.Pxi);
    }

    private List<String> dQp() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dT(JSONObject jSONObject) {
        if (this.cz != null && jSONObject != null) {
            try {
                this.cz.zp(jSONObject.optInt("stateType", -1));
            } catch (Exception unused) {
            }
        }
    }

    private void ku(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.YW.lMd lmd = this.irS;
        if (lmd == null || jSONObject == null) {
            return;
        }
        lmd.zp(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    private boolean ot() {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.woN;
        if (won == null || won.REM() == null || com.bytedance.sdk.openadsdk.core.model.cz.lMd(this.woN) || this.UPs || this.woN.REM().optInt("parent_type") != 2) {
            return false;
        }
        int Dp = this.woN.Dp();
        if (Dp != 8 && Dp != 7) {
            return false;
        }
        this.UPs = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvr() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.vDp vdp = this.cz;
        if (vdp != null) {
            vdp.zp();
        }
    }

    @JProtect
    private JSONObject rV() {
        View view;
        SSWebView sSWebView;
        try {
            view = this.Bj.get();
            sSWebView = this.jU.get();
        } catch (Throwable unused) {
        }
        if (view == null || sSWebView == null) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
            return null;
        }
        int[] lMd2 = WNy.lMd(view);
        int[] lMd3 = WNy.lMd((View) sSWebView);
        if (lMd2 != null && lMd3 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", WNy.KS(KVG.zp(), lMd2[0] - lMd3[0]));
            jSONObject.put("y", WNy.KS(KVG.zp(), lMd2[1] - lMd3[1]));
            jSONObject.put("w", WNy.KS(KVG.zp(), view.getWidth()));
            jSONObject.put("h", WNy.KS(KVG.zp(), view.getHeight()));
            jSONObject.put("isExist", true);
            return jSONObject;
        }
        com.bytedance.sdk.component.utils.tG.zp("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
        return null;
    }

    private WebView tG() {
        SSWebView sSWebView;
        WeakReference<SSWebView> weakReference = this.jU;
        if (weakReference == null || (sSWebView = weakReference.get()) == null) {
            return null;
        }
        return sSWebView.getWebView();
    }

    @JProtect
    private void vDp(JSONObject jSONObject) {
        int i9;
        double d2;
        double d9;
        boolean z8;
        double d10;
        com.bytedance.sdk.openadsdk.YW.HWF hwf;
        RCv rCv = this;
        if (rCv.pvr == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.lMd.rV rVVar = new com.bytedance.sdk.component.adexpress.lMd.rV();
        rVVar.zp(1);
        try {
            boolean optBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject optJSONObject = jSONObject.optJSONObject("AdSize");
            if (optJSONObject != null) {
                d2 = optJSONObject.optDouble("width");
                d9 = optJSONObject.optDouble("height");
            } else {
                d2 = 0.0d;
                d9 = 0.0d;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (optJSONObject2 != null) {
                try {
                    double optDouble = optJSONObject2.optDouble("x");
                    double optDouble2 = optJSONObject2.optDouble("y");
                    z8 = optBoolean;
                    double optDouble3 = optJSONObject2.optDouble("width");
                    double optDouble4 = optJSONObject2.optDouble("height");
                    if (rCv.tG(optJSONObject2)) {
                        d10 = d9;
                        rVVar.zp((float) optJSONObject2.optDouble("borderRadiusTopLeft"));
                        rVVar.lMd((float) optJSONObject2.optDouble("borderRadiusTopRight"));
                        rVVar.KS((float) optJSONObject2.optDouble("borderRadiusBottomLeft"));
                        rVVar.jU((float) optJSONObject2.optDouble("borderRadiusBottomRight"));
                    } else {
                        d10 = d9;
                    }
                    rVVar.KS(optDouble);
                    rVVar.jU(optDouble2);
                    rVVar.COT(optDouble3);
                    rVVar.HWF(optDouble4);
                } catch (Exception unused) {
                    i9 = 101;
                    rCv = this;
                    rVVar.lMd(i9);
                    rVVar.zp(QR.zp(i9));
                    rCv.pvr.zp(rVVar);
                }
            } else {
                z8 = optBoolean;
                d10 = d9;
            }
            try {
                String optString = jSONObject.optString("message", QR.zp(101));
                int optInt = jSONObject.optInt("code", 101);
                try {
                    rVVar.zp(z8);
                    rVVar.zp(d2);
                    rVVar.lMd(d10);
                    rVVar.zp(optString);
                    rVVar.lMd(optInt);
                    rCv = this;
                    rCv.pvr.zp(rVVar);
                    if (optJSONObject2 == null || (hwf = rCv.Iv) == null) {
                        return;
                    }
                    hwf.zp(rVVar);
                } catch (Exception unused2) {
                    rCv = this;
                    i9 = 101;
                    rVVar.lMd(i9);
                    rVVar.zp(QR.zp(i9));
                    rCv.pvr.zp(rVVar);
                }
            } catch (Exception unused3) {
                rCv = this;
                i9 = 101;
                rVVar.lMd(i9);
                rVVar.zp(QR.zp(i9));
                rCv.pvr.zp(rVVar);
            }
        } catch (Exception unused4) {
        }
    }

    private void vwr() {
        com.bytedance.sdk.openadsdk.YW.YW yw = this.QUv;
        if (yw == null) {
            return;
        }
        yw.lMd();
    }

    private void woN() {
        com.bytedance.sdk.openadsdk.YW.YW yw = this.QUv;
        if (yw == null) {
            return;
        }
        yw.zp();
    }

    private void yRU() {
        if (this.YW == null) {
            this.YW = com.bytedance.sdk.openadsdk.QR.zp.zp(this, this.woN);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            COT(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            zp(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.RCv.4
                @Override // java.lang.Runnable
                public void run() {
                    RCv.this.dT(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public void chooseAdResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("video_choose");
            long optLong = jSONObject.optLong("video_choose_duration");
            com.bytedance.sdk.openadsdk.YW.HWF hwf = this.Iv;
            if (hwf != null) {
                hwf.zp(optInt, optLong);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.RCv.5
                @Override // java.lang.Runnable
                public void run() {
                    RCv.this.KS(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            rV(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        Bj(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public String getTemplateInfo() {
        zp("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.FP;
            if (jSONObject != null) {
                jSONObject.put("setting", FP());
                com.bytedance.sdk.openadsdk.core.model.woN won = this.woN;
                if (won != null) {
                    this.FP.put("extension", won.RRQ());
                }
            }
            zp("getTemplateInfo", false);
            return this.FP.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public void initRenderFinish() {
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.RCv.7
            @Override // java.lang.Runnable
            public void run() {
                if (RCv.this.BO != null) {
                    RCv.this.BO.zp();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.RCv.3
                @Override // java.lang.Runnable
                public void run() {
                    RCv.this.YW(jSONObject);
                }
            });
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            vDp(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    @JavascriptInterface
    public void skipVideo() {
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.RCv.6
            @Override // java.lang.Runnable
            public void run() {
                RCv.this.pvr();
            }
        });
    }

    private void dQp(JSONObject jSONObject) {
        if (jSONObject == null || this.ot == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.ot.zp(true, optJSONArray);
            } else {
                this.ot.zp(false, null);
            }
        } catch (Exception unused) {
            this.ot.zp(false, null);
        }
    }

    public RCv COT(String str) {
        this.rV = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject vwr(JSONObject jSONObject) {
        if (this.zp != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString("ad_extra_data", null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry<String, Object> entry : this.zp.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.lMd(e4.toString());
            }
        }
        return jSONObject;
    }

    private void woN(JSONObject jSONObject) {
        WebView tG;
        if (jSONObject == null || (tG = tG()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.vDp.zp(tG, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    public boolean COT() {
        return this.KS;
    }

    public void HWF() {
        com.bytedance.sdk.openadsdk.YW.lMd lmd;
        if (this.Rg && (lmd = this.irS) != null) {
            lmd.zp();
            return;
        }
        Context context = this.si;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.vwr.zp((Activity) context)) {
            ((Activity) this.si).finish();
        }
    }

    public RCv KS(String str) {
        this.dT = str;
        return this;
    }

    public void QR() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.vDp vdp = this.cz;
        if (vdp != null) {
            vdp.lMd();
        }
    }

    public boolean jU() {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.woN;
        return won != null && won.FP();
    }

    public boolean ku() {
        return this.oKZ;
    }

    private void COT(JSONObject jSONObject) throws Exception {
        if (this.aax) {
            com.bytedance.sdk.openadsdk.core.model.woN won = this.woN;
            if ((won instanceof com.bytedance.sdk.openadsdk.core.model.vwr) && ((com.bytedance.sdk.openadsdk.core.model.vwr) won).THm()) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("adInfos", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.woN won2 : ((com.bytedance.sdk.openadsdk.core.model.vwr) this.woN).xHP()) {
                    JSONObject jSONObject2 = new JSONObject();
                    zp(jSONObject2, won2);
                    jSONArray.put(jSONObject2);
                }
                return;
            }
        }
        zp(jSONObject, this.woN);
    }

    private boolean KVG(JSONObject jSONObject) {
        try {
            jSONObject.put("creatives", lMd(this.YhE));
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ku(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return YW();
        }
        return true;
    }

    private boolean tG(@NonNull JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    public com.bytedance.sdk.openadsdk.core.model.woN KS() {
        return this.woN;
    }

    public boolean YW() {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.woN;
        return won != null && won.ffE() == 1;
    }

    public void dT() {
        ot();
    }

    public RCv jU(String str) {
        this.vDp = str;
        return this;
    }

    public RCv lMd(String str) {
        this.HWF = str;
        return this;
    }

    private void QR(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                lMd lmd = new lMd();
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                    if (optJSONObject != null) {
                        lmd.zp = optJSONObject.optString("__msg_type", null);
                        lmd.lMd = optJSONObject.optString("__callback_id", null);
                        lmd.KS = optJSONObject.optString("func");
                        lmd.jU = optJSONObject.optJSONObject("params");
                        lmd.COT = optJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(lmd.zp) && !TextUtils.isEmpty(lmd.KS)) {
                    Message obtainMessage = this.COT.obtainMessage(11);
                    obtainMessage.obj = lmd;
                    this.COT.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public void KS(JSONObject jSONObject) {
        String str;
        double d2;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.pvr.zp("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String optString = jSONObject.optString("adId");
            int optInt = jSONObject.optInt("areaType", 1);
            String optString2 = jSONObject.optString("clickAreaType");
            JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
            double d17 = 0.0d;
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("down_x", 0.0d);
                d10 = optJSONObject.optDouble("down_y", 0.0d);
                double optDouble2 = optJSONObject.optDouble("up_x", 0.0d);
                double optDouble3 = optJSONObject.optDouble("up_y", 0.0d);
                double optDouble4 = optJSONObject.optDouble("down_time", 0.0d);
                double optDouble5 = optJSONObject.optDouble("up_time", 0.0d);
                double optDouble6 = optJSONObject.optDouble("button_x", 0.0d);
                double optDouble7 = optJSONObject.optDouble("button_y", 0.0d);
                double optDouble8 = optJSONObject.optDouble("button_width", 0.0d);
                double optDouble9 = optJSONObject.optDouble("button_height", 0.0d);
                jSONObject2 = optJSONObject.optJSONObject("rectInfo");
                d16 = optDouble9;
                d17 = optDouble;
                d9 = optDouble2;
                d11 = optDouble4;
                d12 = optDouble5;
                d13 = optDouble6;
                d14 = optDouble7;
                d15 = optDouble8;
                str = optString;
                d2 = optDouble3;
            } else {
                str = optString;
                d2 = 0.0d;
                d9 = 0.0d;
                d10 = 0.0d;
                d11 = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                d14 = 0.0d;
                d15 = 0.0d;
                d16 = 0.0d;
                jSONObject2 = null;
            }
            com.bytedance.sdk.openadsdk.core.model.tG zp2 = new tG.zp().jU((float) d17).KS((float) d10).lMd((float) d9).zp((float) d2).lMd((long) d11).zp((long) d12).KS((int) d13).jU((int) d14).COT((int) d15).HWF((int) d16).zp(optString2).zp((SparseArray<KS.zp>) null).zp(true).lMd(optInt).zp(jSONObject2).zp(jSONObject.optInt("clickAreaCategory", -1)).zp();
            com.bytedance.sdk.component.adexpress.lMd.Bj bj = this.pvr;
            if (bj != null) {
                bj.zp(null, optInt, zp2);
            }
            zp(str, optInt, zp2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.lMd.Bj bj2 = this.pvr;
            if (bj2 != null) {
                bj2.zp(null, -1, null);
            }
        }
    }

    public void jU(boolean z8) {
        this.aax = z8;
    }

    public RCv lMd(SSWebView sSWebView) {
        this.jU = new WeakReference<>(sSWebView);
        return this;
    }

    private void YW(String str) {
        int indexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView tG = tG();
                    if (tG != null) {
                        com.bytedance.sdk.component.utils.vDp.zp(tG, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (!str.startsWith("bytedance://private/setresult/") || (indexOf = str.indexOf(38, 30)) <= 0) {
                    return;
                }
                String substring = str.substring(30, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (!substring.equals("SCENE_FETCHQUEUE") || substring2.length() <= 0) {
                    return;
                }
                QR(substring2);
            } catch (Exception unused) {
            }
        }
    }

    public void Bj() {
        com.bytedance.sdk.openadsdk.QR.KS ks = this.YW;
        if (ks != null) {
            ks.zp();
        }
        this.si = null;
    }

    public void jU(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.woN zp2 = com.bytedance.sdk.openadsdk.core.lMd.zp(jSONObject);
        if (zp2 != null) {
            boolean jU = com.bytedance.sdk.openadsdk.core.model.dQp.jU(this.woN);
            String lMd2 = jU ? YhE.lMd(this.tG) : this.Pxi;
            com.bytedance.sdk.openadsdk.core.lMd.zp zpVar = new com.bytedance.sdk.openadsdk.core.lMd.zp(KVG.zp(), zp2, lMd2, this.tG);
            zpVar.zp(com.com.bytedance.overseas.sdk.zp.jU.zp(KVG.zp(), zp2, lMd2));
            if (jU) {
                zpVar.zp(false);
            }
            zpVar.onClick(null);
        }
    }

    public RCv lMd(boolean z8) {
        this.fRl = z8;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.core.widget.zp.zp zpVar) {
        this.BO = zpVar;
        return this;
    }

    public void HWF(String str) {
        this.Pxi = str;
    }

    public void lMd() {
        com.bytedance.sdk.component.zp.woN won = this.eWG;
        if (won == null) {
            return;
        }
        won.zp();
        this.eWG = null;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.core.widget.lMd lmd) {
        this.QR = lmd;
        return this;
    }

    public RCv zp(SSWebView sSWebView) {
        WebView webView = sSWebView.getWebView();
        if (webView == null) {
            return this;
        }
        try {
            com.bytedance.sdk.component.zp.woN lMd2 = com.bytedance.sdk.component.zp.woN.zp(webView).zp(new com.bytedance.sdk.openadsdk.ku.zp()).zp("ToutiaoJSBridge").zp(new com.bytedance.sdk.component.zp.vDp() { // from class: com.bytedance.sdk.openadsdk.core.RCv.1
                @Override // com.bytedance.sdk.component.zp.vDp
                @NonNull
                public <T> T zp(@NonNull String str, @NonNull Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.zp.vDp
                @NonNull
                public <T> String zp(@NonNull T t9) {
                    return null;
                }
            }).zp(ku.lMd().woN()).lMd(true).zp().lMd();
            this.eWG = lMd2;
            com.bytedance.sdk.openadsdk.ku.zp.COT.zp(lMd2, this);
            com.bytedance.sdk.openadsdk.ku.zp.zp.zp(this.eWG, this);
            com.bytedance.sdk.openadsdk.ku.zp.lMd.zp(this.eWG, this);
            com.bytedance.sdk.openadsdk.ku.zp.KS.zp(this.eWG, this);
            com.bytedance.sdk.openadsdk.ku.zp.jU.zp(this.eWG, this);
            com.bytedance.sdk.openadsdk.ku.zp.HWF.zp(this.eWG, this);
            com.bytedance.sdk.openadsdk.ku.zp.ku.zp(this.eWG, this);
            com.bytedance.sdk.openadsdk.ku.zp.QR.zp(this.eWG, sSWebView);
        } catch (Exception unused) {
        }
        return this;
    }

    public RCv lMd(int i9) {
        this.tG = i9;
        return this;
    }

    public void lMd(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("landingStyle");
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("fallback_url");
        try {
            jSONObject.put("is_activity", this.si instanceof Activity);
        } catch (JSONException unused) {
        }
        boolean z8 = true;
        com.bytedance.sdk.openadsdk.lMd.KS.zp(this.woN, this.Pxi, 1, jSONObject);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        if (optInt == 0) {
            WebView tG = tG();
            if (tG != null) {
                tG.loadUrl(optString);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(this.woN, this.Pxi, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.lMd.KS.zp(this.woN, this.Pxi, -1, (JSONObject) null);
            }
        } else if (optInt == 1 || optInt == 8) {
            com.bytedance.sdk.openadsdk.dT.zp.zp zpVar = new com.bytedance.sdk.openadsdk.dT.zp.zp();
            zpVar.zp(lMd.zp.lMd);
            zpVar.zp(this.woN);
            zpVar.lMd(this.Pxi);
            zpVar.zp(-1);
            zpVar.zp(false);
            zpVar.lMd(this.woN.oKZ());
            com.bytedance.sdk.openadsdk.lMd.KS.zp(zpVar);
            com.bytedance.sdk.openadsdk.utils.vwr.zp(KVG(), optString, this.woN, lMd.zp.lMd);
        } else if (optInt == 2) {
            Context KVG = KVG();
            if (!com.bytedance.sdk.openadsdk.utils.vwr.lMd(KVG, optString, this.woN, this.Pxi)) {
                com.bytedance.sdk.openadsdk.dT.zp.zp zpVar2 = new com.bytedance.sdk.openadsdk.dT.zp.zp();
                zpVar2.zp(lMd.zp.lMd);
                zpVar2.zp(this.woN);
                zpVar2.lMd(this.Pxi);
                zpVar2.zp(-1);
                zpVar2.zp(false);
                zpVar2.lMd(this.woN.oKZ());
                com.bytedance.sdk.openadsdk.lMd.KS.zp(zpVar2);
                HashMap hashMap = new HashMap();
                hashMap.put("deeplink_url", optString);
                hashMap.put("fallback_url", optString2);
                hashMap.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(this.woN, this.Pxi, "open_fallback_url", hashMap);
                com.bytedance.sdk.openadsdk.utils.vwr.zp(KVG, optString2, this.woN, lMd.zp.lMd);
            }
        } else if (optInt != 3) {
            z8 = false;
        } else if (Gzh.lMd(KVG(), optString, this.woN, this.tG, this.Pxi, false)) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.woN, this.Pxi, 3, (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.woN, this.Pxi, -2, (JSONObject) null);
        }
        com.bytedance.sdk.openadsdk.core.widget.lMd lmd = this.QR;
        if (lmd == null || !z8) {
            return;
        }
        lmd.zp();
    }

    public void COT(boolean z8) {
        this.Rg = z8;
    }

    private void rV(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.dQp.zp(parse, this);
            }
        } catch (Exception unused) {
        }
    }

    public com.bytedance.sdk.component.zp.woN zp() {
        return this.eWG;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.lMd.KS.COT cot) {
        this.ffE = cot;
        return this;
    }

    public RCv zp(boolean z8) {
        this.lMd = z8;
        return this;
    }

    public RCv zp(View view) {
        this.Bj = new WeakReference<>(view);
        return this;
    }

    public RCv zp(int i9) {
        this.dQp = i9;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        this.woN = won;
        if (won != null) {
            this.vwr = won.REM();
        }
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.YW.lMd lmd) {
        this.irS = lmd;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.YW.YW yw) {
        this.QUv = yw;
        return this;
    }

    public RCv zp(Map<String, Object> map) {
        this.zp = map;
        return this;
    }

    public RCv zp(com.bytedance.sdk.component.adexpress.lMd.Bj bj) {
        this.pvr = bj;
        return this;
    }

    public void vDp() {
        zp zpVar = this.DY;
        if (zpVar != null) {
            zpVar.zp();
        }
    }

    public RCv zp(com.bytedance.sdk.openadsdk.core.nativeexpress.vDp vdp) {
        this.cz = vdp;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.QR.jU jUVar) {
        this.ot = jUVar;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.core.lMd.jU jUVar) {
        this.Gzh = jUVar;
        return this;
    }

    public RCv zp(JSONObject jSONObject) {
        this.FP = jSONObject;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.YW.zp zpVar) {
        this.yRU = zpVar;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.YW.COT cot) {
        this.ox = cot;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.YW.jU jUVar) {
        this.RCv = jUVar;
        return this;
    }

    public RCv zp(List<com.bytedance.sdk.openadsdk.core.model.woN> list) {
        this.YhE = list;
        return this;
    }

    public RCv zp(com.bytedance.sdk.openadsdk.YW.HWF hwf) {
        this.Iv = hwf;
        return this;
    }

    @JProtect
    private void zp(JSONObject jSONObject, int i9) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = dQp().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.zp.zp());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.zp.COT());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.zp.lMd());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.zp.KS());
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.common.zp.jU());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.zp.HWF());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.zp.zp(KVG.zp()));
        if (DeviceUtils.lMd(KVG.zp())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    public void KS(boolean z8) {
        this.KS = z8;
    }

    private void KS(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            woN(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void KS(int i9) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.vDp vdp = this.cz;
        if (vdp != null) {
            vdp.lMd(i9);
        }
    }

    public static JSONArray lMd(List<com.bytedance.sdk.openadsdk.core.model.woN> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            jSONArray.put(list.get(i9).Eg());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            woN(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private static void zp(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.woN won) throws Exception {
        String fgJ = won.fgJ();
        if (!TextUtils.isEmpty(fgJ)) {
            jSONObject.put(BidResponsedEx.KEY_CID, fgJ);
        }
        String GP = won.GP();
        if (!TextUtils.isEmpty(GP)) {
            jSONObject.put("log_extra", GP);
        }
        String dm = won.dm();
        if (!TextUtils.isEmpty(dm)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, dm);
        }
        jSONObject.put("dc", TextUtils.isEmpty(KVG.jU().BO()) ? KVG.jU().BO() : "SG");
        jSONObject.put("language", Bj.zp());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.dQp.etV().YcG());
    }

    public void lMd(@NonNull final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    YW(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.lMd.KS.zp(new com.bytedance.sdk.component.ku.ku("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.RCv.2
                @Override // java.lang.Runnable
                public void run() {
                    long j7;
                    String str;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    RCv.this.Pxi = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (!RCv.this.ku(queryParameter3)) {
                        return;
                    }
                    long j9 = 0;
                    try {
                        j7 = Long.parseLong(uri.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    } catch (Exception unused) {
                        j7 = 0;
                    }
                    try {
                        j9 = Long.parseLong(uri.getQueryParameter("ext_value"));
                    } catch (Exception unused2) {
                    }
                    long j10 = j9;
                    String queryParameter4 = uri.getQueryParameter("extra");
                    JSONObject jSONObject = null;
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(queryParameter4);
                            try {
                                jSONObject2.putOpt("ua_policy", Integer.valueOf(RCv.this.dQp));
                            } catch (Exception unused3) {
                            }
                            jSONObject = jSONObject2;
                        } catch (Exception unused4) {
                        }
                    }
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(queryParameter3)) {
                        jSONObject = RCv.this.vwr(jSONObject);
                    }
                    if (!"landing_perf_error".equals(queryParameter3) && !"landing_perf_stats".equals(queryParameter3)) {
                        str = RCv.this.zp(queryParameter2, queryParameter3);
                    } else {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            for (String str2 : uri.getQueryParameterNames()) {
                                try {
                                    if ("extra".equals(str2)) {
                                        jSONObject3.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str2)).optString("ad_extra_data"));
                                    } else {
                                        jSONObject3.put(str2, uri.getQueryParameter(str2));
                                    }
                                } catch (Exception unused5) {
                                }
                            }
                            str = RCv.this.HWF;
                            jSONObject = jSONObject3;
                        } catch (Exception unused6) {
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.lMd.KS.zp(RCv.this.woN, queryParameter, str, queryParameter3, j7, j10, jSONObject, com.bytedance.sdk.openadsdk.core.model.dQp.jU(RCv.this.woN));
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0344, code lost:
    
        if (r3 != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0346, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x038a, code lost:
    
        if (r3 != null) goto L207;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject zp(com.bytedance.sdk.openadsdk.core.RCv.lMd r23, int r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.RCv.zp(com.bytedance.sdk.openadsdk.core.RCv$lMd, int):org.json.JSONObject");
    }

    private void zp(JSONObject jSONObject, boolean z8, String str) {
        com.bytedance.sdk.openadsdk.core.widget.lMd lmd;
        if (z8) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString) || new JSONObject(optString).optInt("agg_request_type", -1) != 1 || !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) || (lmd = this.QR) == null) {
                    return;
                }
                lmd.zp();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean zp(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        int i9;
        String str2;
        if (jSONObject != null) {
            i9 = jSONObject.optInt("landingStyle");
            str = jSONObject.optString("url");
            str2 = jSONObject.optString("fallback_url");
        } else {
            str = null;
            i9 = -1;
            str2 = null;
        }
        boolean z8 = false;
        if (i9 == 1) {
            if (!com.bytedance.sdk.component.utils.KVG.zp(str)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e4) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.AndroidObject", "handleUrl, EX1->: ", e4);
                }
                return z8;
            }
        } else if (i9 == 2) {
            try {
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    jSONObject2.put("empty_url", 1);
                } else if (!com.bytedance.sdk.component.utils.KVG.zp(str2)) {
                    jSONObject2.put("invalid_url", 1);
                }
            } catch (JSONException e9) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.AndroidObject", "handleUrl, EX2->: ", e9);
            }
            return z8;
        }
        z8 = true;
        return z8;
    }

    private void zp(String str, boolean z8) {
        if (this.ffE == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z8) {
            this.ffE.zp(str);
        } else {
            this.ffE.lMd(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.lMd
    public void zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("time");
            String optString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.nativeexpress.vDp vdp = this.cz;
            if (vdp != null) {
                vdp.zp(optInt, optString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    private void zp(final lMd lmd, final JSONObject jSONObject) {
        if (lmd == null) {
            return;
        }
        try {
            zp(lmd.jU, new com.bytedance.sdk.openadsdk.YW.KS() { // from class: com.bytedance.sdk.openadsdk.core.RCv.8
                @Override // com.bytedance.sdk.openadsdk.YW.KS
                public void zp(boolean z8, List<com.bytedance.sdk.openadsdk.core.model.woN> list) {
                    if (z8) {
                        try {
                            jSONObject.put("creatives", RCv.lMd(list));
                            RCv.this.lMd(lmd.lMd, jSONObject);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    RCv.this.lMd(lmd.lMd, jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @JProtect
    private boolean zp(String str, int i9, com.bytedance.sdk.openadsdk.core.model.tG tGVar) {
        HashMap<String, YW> hashMap;
        if (TextUtils.isEmpty(str) || (hashMap = this.WNy) == null || hashMap.get(str) == null) {
            return false;
        }
        throw null;
    }

    @JProtect
    public void zp(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.YW.KS ks) {
        if (ks == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.YW.KS ks2 = new com.bytedance.sdk.openadsdk.YW.KS() { // from class: com.bytedance.sdk.openadsdk.core.RCv.9
                @Override // com.bytedance.sdk.openadsdk.YW.KS
                public void zp(final boolean z8, final List<com.bytedance.sdk.openadsdk.core.model.woN> list) {
                    QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.RCv.9.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ks.zp(z8, list);
                        }
                    });
                }
            };
            if (this.woN != null && !TextUtils.isEmpty(this.vDp)) {
                int Dp = this.woN.Dp();
                AdSlot QUv = this.woN.QUv();
                com.bytedance.sdk.openadsdk.core.model.pvr pvrVar = new com.bytedance.sdk.openadsdk.core.model.pvr();
                pvrVar.HWF = true;
                if (this.woN.fRl() != null) {
                    pvrVar.ku = 2;
                }
                JSONObject jSONObject2 = this.vwr;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                pvrVar.QR = jSONObject2;
                KVG.KS().zp(QUv, pvrVar, Dp, new woN.zp() { // from class: com.bytedance.sdk.openadsdk.core.RCv.10
                    @Override // com.bytedance.sdk.openadsdk.core.woN.zp
                    public void zp(int i9, String str) {
                        ks2.zp(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.woN.zp
                    public void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
                        if (zpVar.KS() != null && !zpVar.KS().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.woN won = zpVar.KS().get(0);
                            if (won != null) {
                                RCv.this.vwr = won.REM();
                            }
                            ks2.zp(true, zpVar.KS());
                            return;
                        }
                        ks2.zp(false, null);
                        lmd.zp(-3);
                        com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                    }
                });
                return;
            }
            ks2.zp(false, null);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.AndroidObject", "get ads error", e4);
        }
    }

    public boolean zp(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return ku.containsKey(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String zp(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.dQp.jU(this.woN)) {
            if ("show".equals(str2)) {
                return YhE.zp(this.tG);
            }
            return "aggregate_page";
        }
        if (this.irS != null) {
            return YhE.zp(this.tG);
        }
        return this.pvr == null ? YhE.lMd(this.tG) : str;
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof lMd) {
                try {
                    zp((lMd) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.QR.lMd
    public void zp(String str, JSONObject jSONObject) {
        KS(str, jSONObject);
    }

    public void zp(zp zpVar) {
        this.DY = zpVar;
    }
}
