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
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
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
public class hQ implements com.bytedance.sdk.component.adexpress.wN.Sg, bZ.YFl, com.bytedance.sdk.openadsdk.nc.Sg {
    private static final Map<String, Boolean> qsH;
    private WeakReference<com.bytedance.sdk.component.NjR.AlY> AlY;
    private com.bytedance.sdk.openadsdk.YoT.vc BPI;
    private YFl Bh;
    private com.bytedance.sdk.openadsdk.YoT.NjR Cfr;
    private com.bytedance.sdk.openadsdk.core.widget.vc DSW;
    private int EH;
    private int GA;
    private com.bytedance.sdk.openadsdk.AlY.AlY.wN GS;
    private com.bytedance.sdk.openadsdk.core.Sg.AlY Ga;
    private com.bytedance.sdk.openadsdk.nc.AlY Ne;
    private com.bytedance.sdk.openadsdk.nc.tN NjR;
    boolean Sg;
    private com.bytedance.sdk.openadsdk.YoT.AlY UZM;
    private com.bytedance.sdk.openadsdk.YoT.YFl VOe;
    private JSONObject Wwa;
    protected Map<String, Object> YFl;
    private JSONObject YI;
    private String YoT;
    private com.bytedance.sdk.openadsdk.core.widget.YFl.YFl ZU;
    private com.bytedance.sdk.openadsdk.core.qsH.pDU aIu;
    private com.bytedance.sdk.openadsdk.YoT.wN bZ;
    private tN dGX;
    private com.bytedance.sdk.openadsdk.YoT.Sg dXO;
    private WeakReference<View> eT;
    private Context fIu;
    private com.bytedance.sdk.openadsdk.core.GA.AlY.Sg iY;
    private boolean ko;
    private com.bytedance.sdk.openadsdk.core.model.Wwa lG;
    private com.bytedance.sdk.component.YFl.lG lu;
    private String mB;
    private HashMap<String, nc> mn;

    /* renamed from: nc, reason: collision with root package name */
    private String f10679nc;
    private String pDU;
    private List<com.bytedance.sdk.openadsdk.core.model.Wwa> pq;
    private com.bytedance.sdk.component.adexpress.Sg.eT qO;

    /* renamed from: vc, reason: collision with root package name */
    private String f10680vc;
    private JSONObject wXo;
    private boolean zG;
    private boolean rkt = true;
    private boolean hQ = true;
    private boolean zB = false;
    private boolean Sco = false;
    boolean tN = false;
    private boolean UI = false;
    private final com.bytedance.sdk.component.utils.bZ wN = new com.bytedance.sdk.component.utils.bZ(Looper.getMainLooper(), this);

    /* loaded from: classes.dex */
    public static class Sg {
        public JSONObject AlY;
        public String Sg;
        public String YFl;
        public String tN;
        public int wN;
    }

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl();
    }

    /* loaded from: classes.dex */
    public static class tN implements Runnable {
        private final JSONObject Sg;
        private final com.bytedance.sdk.openadsdk.core.qsH.pDU YFl;

        public tN(com.bytedance.sdk.openadsdk.core.qsH.pDU pdu, JSONObject jSONObject) {
            this.YFl = pdu;
            this.Sg = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            hQ.Sg(this.YFl, this.Sg);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        qsH = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public hQ(Context context) {
        this.fIu = context;
    }

    private static List<String> EH() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    private WebView GA() {
        com.bytedance.sdk.component.NjR.AlY alY;
        WeakReference<com.bytedance.sdk.component.NjR.AlY> weakReference = this.AlY;
        if (weakReference == null || (alY = weakReference.get()) == null) {
            return null;
        }
        return alY.getWebView();
    }

    private boolean Ne() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.lG;
        if (wwa == null || wwa.kA() == null || com.bytedance.sdk.openadsdk.core.model.Ne.Sg(this.lG) || this.zB || this.lG.kA().optInt("parent_type") != 2) {
            return false;
        }
        int Uv = this.lG.Uv();
        if (Uv != 8 && Uv != 7) {
            return false;
        }
        this.zB = true;
        return true;
    }

    private void NjR(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.Ne.eT(this.lG))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.Ne.eT(this.lG));
    }

    private void VOe() {
        if (this.NjR == null) {
            this.NjR = com.bytedance.sdk.openadsdk.nc.YFl.YFl(this, this.lG);
        }
    }

    private void Wwa() {
        com.bytedance.sdk.openadsdk.YoT.NjR njR = this.Cfr;
        if (njR == null) {
            return;
        }
        njR.Sg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YoT(JSONObject jSONObject) {
        if (this.aIu != null && jSONObject != null) {
            try {
                this.aIu.YFl(jSONObject.optInt("stateType", -1));
            } catch (Exception unused) {
            }
        }
    }

    private void aIu() {
        if (this.fIu == null || TextUtils.isEmpty(lG.AlY().Sco())) {
            return;
        }
        TTWebsiteActivity.YFl(this.fIu, this.lG, this.mB);
    }

    private void eT(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.YoT.Sg sg2 = this.dXO;
        if (sg2 == null || jSONObject == null) {
            return;
        }
        sg2.YFl(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    private void lG() {
        com.bytedance.sdk.openadsdk.YoT.NjR njR = this.Cfr;
        if (njR == null) {
            return;
        }
        njR.YFl();
    }

    private void nc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar;
        if (jSONObject == null || (wNVar = this.GS) == null) {
            return;
        }
        wNVar.Sg(jSONObject);
    }

    @JProtect
    private JSONObject pDU() {
        View view;
        com.bytedance.sdk.component.NjR.AlY alY;
        try {
            view = this.eT.get();
            alY = this.AlY.get();
        } catch (Throwable unused) {
        }
        if (view != null && alY != null) {
            int[] Sg2 = GS.Sg(view);
            int[] Sg3 = GS.Sg((View) alY);
            if (Sg2 != null && Sg3 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", GS.AlY(lG.YFl(), Sg2[0] - Sg3[0]));
                jSONObject.put("y", GS.AlY(lG.YFl(), Sg2[1] - Sg3[1]));
                jSONObject.put("w", GS.AlY(lG.YFl(), view.getWidth()));
                jSONObject.put("h", GS.AlY(lG.YFl(), view.getHeight()));
                jSONObject.put("isExist", true);
                return jSONObject;
            }
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
            return null;
        }
        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qO() {
        com.bytedance.sdk.openadsdk.core.qsH.pDU pdu = this.aIu;
        if (pdu != null) {
            pdu.YFl();
        }
    }

    private void qsH(JSONObject jSONObject) throws Exception {
        if (this.zG) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.lG;
            if ((wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) && ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).Wm()) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("adInfos", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.Wwa wwa2 : ((com.bytedance.sdk.openadsdk.core.model.qO) this.lG).OIY()) {
                    JSONObject jSONObject2 = new JSONObject();
                    YFl(jSONObject2, wwa2);
                    jSONArray.put(jSONObject2);
                }
                return;
            }
        }
        YFl(jSONObject, this.lG);
    }

    private Context rkt() {
        WeakReference<com.bytedance.sdk.component.NjR.AlY> weakReference = this.AlY;
        Activity YFl2 = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.Sg.YFl(this.AlY.get());
        return YFl2 == null ? this.fIu : YFl2;
    }

    @JProtect
    private JSONObject wXo() {
        return Sg(this.lG);
    }

    public void DSW() {
        com.bytedance.sdk.openadsdk.core.qsH.pDU pdu = this.aIu;
        if (pdu != null) {
            pdu.Sg();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            qsH(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            Sg(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hQ.2
                @Override // java.lang.Runnable
                public void run() {
                    hQ.this.YoT(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public void chooseAdResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("video_choose");
            long optLong = jSONObject.optLong("video_choose_duration");
            com.bytedance.sdk.openadsdk.YoT.vc vcVar = this.BPI;
            if (vcVar != null) {
                vcVar.YFl(optInt, optLong);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hQ.3
                @Override // java.lang.Runnable
                public void run() {
                    hQ.this.AlY(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            rkt(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        GA(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.wXo.toString();
        }
        try {
            JSONObject YFl2 = com.bytedance.sdk.openadsdk.core.qsH.YFl.Sg.YFl(this.wXo, new JSONObject(str));
            if (YFl2 == null) {
                return this.wXo.toString();
            }
            return YFl2.toString();
        } catch (Exception unused) {
            return this.wXo.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public String getTemplateInfo() {
        YFl("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.wXo;
            if (jSONObject != null) {
                jSONObject.put("setting", wXo());
                com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.lG;
                if (wwa != null) {
                    this.wXo.put("extension", wwa.wqc());
                }
            }
            YFl("getTemplateInfo", false);
            return this.wXo.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hQ.5
            @Override // java.lang.Runnable
            public void run() {
                if (hQ.this.ZU != null) {
                    hQ.this.ZU.YFl();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            tN tNVar = this.dGX;
            if (tNVar != null) {
                com.bytedance.sdk.openadsdk.utils.mn.Sg(tNVar);
            }
            tN tNVar2 = new tN(this.aIu, jSONObject);
            this.dGX = tNVar2;
            com.bytedance.sdk.openadsdk.utils.mn.YFl(tNVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            pDU(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hQ.4
            @Override // java.lang.Runnable
            public void run() {
                hQ.this.qO();
            }
        });
    }

    public void vc() {
        com.bytedance.sdk.openadsdk.YoT.Sg sg2;
        if (this.ko && (sg2 = this.dXO) != null) {
            sg2.YFl();
            return;
        }
        Context context = this.fIu;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.qO.YFl((Activity) context)) {
            ((Activity) this.fIu).finish();
        }
    }

    private boolean EH(@NonNull JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    public boolean AlY() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.lG;
        return wwa != null && wwa.VOe();
    }

    public hQ wN(String str) {
        this.pDU = str;
        return this;
    }

    private void DSW(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Sg sg2 = new Sg();
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        sg2.YFl = optJSONObject.optString("__msg_type", null);
                        sg2.Sg = optJSONObject.optString("__callback_id", null);
                        sg2.tN = optJSONObject.optString("func");
                        sg2.AlY = optJSONObject.optJSONObject("params");
                        sg2.wN = optJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(sg2.YFl) && !TextUtils.isEmpty(sg2.tN)) {
                    Message obtainMessage = this.wN.obtainMessage(11);
                    obtainMessage.obj = sg2;
                    this.wN.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private boolean Wwa(JSONObject jSONObject) {
        try {
            jSONObject.put("creatives", Sg(this.pq));
        } catch (Exception unused) {
        }
        return true;
    }

    private void lG(JSONObject jSONObject) {
        if (jSONObject == null || this.Ne == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.Ne.YFl(true, optJSONArray);
            } else {
                this.Ne.YFl(false, null);
            }
        } catch (Exception unused) {
            this.Ne.YFl(false, null);
        }
    }

    private void qO(JSONObject jSONObject) {
        WebView GA;
        if (jSONObject == null || (GA = GA()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.eT.YFl(GA, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    public hQ AlY(String str) {
        this.YoT = str;
        return this;
    }

    public boolean NjR() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.lG;
        return wwa != null && wwa.ZU() == 1;
    }

    public void eT() {
        com.bytedance.sdk.openadsdk.nc.tN tNVar = this.NjR;
        if (tNVar != null) {
            tNVar.YFl();
        }
        tN tNVar2 = this.dGX;
        if (tNVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.mn.Sg(tNVar2);
            this.dGX = null;
        }
        this.fIu = null;
        this.iY = null;
    }

    public void nc() {
        Ne();
    }

    public hQ tN(String str) {
        this.f10679nc = str;
        return this;
    }

    public boolean wN() {
        return this.tN;
    }

    private boolean GA(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.qsH.pDU pdu = this.aIu;
        if (pdu != null && jSONObject != null) {
            double tN2 = pdu.tN();
            int AlY = this.aIu.AlY();
            try {
                jSONObject.put("currentTime", tN2 / 1000.0d);
                jSONObject.put("state", AlY);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject aIu(JSONObject jSONObject) {
        if (this.YFl != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString("ad_extra_data", null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry<String, Object> entry : this.YFl.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.Sg(e2.toString());
            }
        }
        return jSONObject;
    }

    private void rkt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.rkt.YFl(parse, this);
            }
        } catch (Exception unused) {
        }
    }

    public void AlY(JSONObject jSONObject) {
        String str;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.aIu.YFl("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String optString = jSONObject.optString("adId");
            int optInt = jSONObject.optInt("areaType", 1);
            String optString2 = jSONObject.optString("clickAreaType");
            JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
            double d19 = 0.0d;
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("down_x", 0.0d);
                d12 = optJSONObject.optDouble("down_y", 0.0d);
                double optDouble2 = optJSONObject.optDouble("up_x", 0.0d);
                double optDouble3 = optJSONObject.optDouble("up_y", 0.0d);
                double optDouble4 = optJSONObject.optDouble("down_time", 0.0d);
                double optDouble5 = optJSONObject.optDouble("up_time", 0.0d);
                double optDouble6 = optJSONObject.optDouble("button_x", 0.0d);
                double optDouble7 = optJSONObject.optDouble("button_y", 0.0d);
                double optDouble8 = optJSONObject.optDouble("button_width", 0.0d);
                double optDouble9 = optJSONObject.optDouble("button_height", 0.0d);
                jSONObject2 = optJSONObject.optJSONObject("rectInfo");
                d18 = optDouble9;
                d19 = optDouble;
                d11 = optDouble2;
                d13 = optDouble4;
                d14 = optDouble5;
                d15 = optDouble6;
                d16 = optDouble7;
                d17 = optDouble8;
                str = optString;
                d10 = optDouble3;
            } else {
                str = optString;
                d10 = 0.0d;
                d11 = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                d14 = 0.0d;
                d15 = 0.0d;
                d16 = 0.0d;
                d17 = 0.0d;
                d18 = 0.0d;
                jSONObject2 = null;
            }
            com.bytedance.sdk.openadsdk.core.model.pDU YFl2 = new pDU.YFl().AlY((float) d19).tN((float) d12).Sg((float) d11).YFl((float) d10).Sg((long) d13).YFl((long) d14).tN((int) d15).AlY((int) d16).wN((int) d17).vc((int) d18).YFl(optString2).YFl((SparseArray<tN.YFl>) null).YFl(true).Sg(optInt).YFl(jSONObject2).YFl(jSONObject.optInt("clickAreaCategory", -1)).Sg(optJSONObject).YFl();
            com.bytedance.sdk.component.adexpress.Sg.eT eTVar = this.qO;
            if (eTVar != null) {
                eTVar.YFl(null, optInt, YFl2);
            }
            YFl(str, optInt, YFl2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.Sg.eT eTVar2 = this.qO;
            if (eTVar2 != null) {
                eTVar2.YFl(null, -1, null);
            }
        }
    }

    public hQ Sg(String str) {
        this.f10680vc = str;
        return this;
    }

    public void YoT() {
        YFl yFl = this.Bh;
        if (yFl != null) {
            yFl.YFl();
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.Wwa tN() {
        return this.lG;
    }

    public void wN(boolean z10) {
        this.ko = z10;
    }

    private void NjR(String str) {
        int indexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView GA = GA();
                    if (GA != null) {
                        com.bytedance.sdk.component.utils.eT.YFl(GA, "javascript:ToutiaoJSBridge._fetchQueue()");
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
                DSW(substring2);
            } catch (Exception unused) {
            }
        }
    }

    public hQ Sg(com.bytedance.sdk.component.NjR.AlY alY) {
        this.AlY = new WeakReference<>(alY);
        return this;
    }

    public void tN(JSONObject jSONObject) {
        Wwa.YFl(rkt(), this.fIu instanceof Activity, jSONObject, this.lG, this.mB, this.GA, GA(), this.DSW);
    }

    public void vc(String str) {
        this.mB = str;
    }

    public void wN(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.Wwa YFl2 = com.bytedance.sdk.openadsdk.core.Sg.YFl(jSONObject);
        if (YFl2 != null) {
            boolean AlY = com.bytedance.sdk.openadsdk.core.model.rkt.AlY(this.lG);
            YFl(YFl2, AlY ? Sco.Sg(this.GA) : this.mB, !AlY);
        }
    }

    public hQ Sg(boolean z10) {
        this.Sco = z10;
        return this;
    }

    public JSONObject vc(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.lG;
            if (wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) {
                List<com.bytedance.sdk.openadsdk.core.model.Wwa> tN2 = ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).rQ().tN();
                for (int i10 = 0; i10 < tN2.size(); i10++) {
                    jSONArray.put(tN(tN2.get(i10)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void Sg() {
        com.bytedance.sdk.component.YFl.lG lGVar = this.lu;
        if (lGVar == null) {
            return;
        }
        lGVar.YFl();
        this.lu = null;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.core.widget.YFl.YFl yFl) {
        this.ZU = yFl;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.core.widget.vc vcVar) {
        this.DSW = vcVar;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        WebView webView = alY.getWebView();
        if (webView == null) {
            return this;
        }
        try {
            com.bytedance.sdk.component.YFl.lG Sg2 = com.bytedance.sdk.component.YFl.lG.YFl(webView).YFl(new com.bytedance.sdk.openadsdk.eT.YFl()).YFl("ToutiaoJSBridge").YFl(new com.bytedance.sdk.component.YFl.YoT() { // from class: com.bytedance.sdk.openadsdk.core.hQ.1
                @Override // com.bytedance.sdk.component.YFl.YoT
                @NonNull
                public <T> T YFl(@NonNull String str, @NonNull Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.YFl.YoT
                @NonNull
                public <T> String YFl(@NonNull T t5) {
                    return null;
                }
            }).YFl(NjR.Sg().lG()).Sg(true).YFl().Sg();
            this.lu = Sg2;
            com.bytedance.sdk.openadsdk.eT.YFl.vc.YFl(Sg2, this);
            com.bytedance.sdk.openadsdk.eT.YFl.YFl.YFl(this.lu, this);
            com.bytedance.sdk.openadsdk.eT.YFl.Sg.YFl(this.lu, this);
            com.bytedance.sdk.openadsdk.eT.YFl.tN.YFl(this.lu, this);
            com.bytedance.sdk.openadsdk.eT.YFl.wN.YFl(this.lu, this);
            com.bytedance.sdk.openadsdk.eT.YFl.qsH.YFl(this.lu, this);
            com.bytedance.sdk.openadsdk.eT.YFl.nc.YFl(this.lu, this);
            com.bytedance.sdk.openadsdk.eT.YFl.NjR.YFl(this.lu, alY);
            com.bytedance.sdk.openadsdk.eT.YFl.DSW.YFl(this.lu, this);
            com.bytedance.sdk.openadsdk.eT.YFl.AlY.YFl(this.lu, this.wXo);
        } catch (Exception unused) {
        }
        return this;
    }

    public boolean qsH() {
        return this.UI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qsH(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return NjR();
        }
        return true;
    }

    public hQ Sg(int i10) {
        this.GA = i10;
        return this;
    }

    public void tN(boolean z10) {
        this.tN = z10;
    }

    @JProtect
    public static void Sg(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = EH().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.YFl.YFl());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.YFl.wN());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.YFl.Sg());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.YFl.tN());
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.common.YFl.AlY());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.YFl.vc());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.YFl.YFl(lG.YFl()));
        if (DeviceUtils.Sg(lG.YFl())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    private void tN(String str, JSONObject jSONObject) {
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
            qO(jSONObject2);
        } catch (Exception unused) {
        }
    }

    @JProtect
    private void pDU(JSONObject jSONObject) {
        int i10;
        double d10;
        double d11;
        boolean z10;
        double d12;
        String optString;
        int optInt;
        com.bytedance.sdk.openadsdk.YoT.vc vcVar;
        hQ hQVar = this;
        if (hQVar.qO == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = hQVar.GS;
        if (wNVar != null) {
            wNVar.rkt();
        }
        com.bytedance.sdk.component.adexpress.Sg.pDU pdu = new com.bytedance.sdk.component.adexpress.Sg.pDU();
        pdu.YFl(1);
        try {
            boolean optBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject optJSONObject = jSONObject.optJSONObject("AdSize");
            if (optJSONObject != null) {
                d10 = optJSONObject.optDouble("width");
                d11 = optJSONObject.optDouble("height");
            } else {
                d10 = 0.0d;
                d11 = 0.0d;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (optJSONObject2 != null) {
                try {
                    double optDouble = optJSONObject2.optDouble("x");
                    double optDouble2 = optJSONObject2.optDouble("y");
                    z10 = optBoolean;
                    double optDouble3 = optJSONObject2.optDouble("width");
                    double optDouble4 = optJSONObject2.optDouble("height");
                    if (hQVar.EH(optJSONObject2)) {
                        d12 = d11;
                        pdu.YFl((float) optJSONObject2.optDouble("borderRadiusTopLeft"));
                        pdu.Sg((float) optJSONObject2.optDouble("borderRadiusTopRight"));
                        pdu.tN((float) optJSONObject2.optDouble("borderRadiusBottomLeft"));
                        pdu.AlY((float) optJSONObject2.optDouble("borderRadiusBottomRight"));
                    } else {
                        d12 = d11;
                    }
                    pdu.tN(optDouble);
                    pdu.AlY(optDouble2);
                    pdu.wN(optDouble3);
                    pdu.vc(optDouble4);
                } catch (Exception unused) {
                    i10 = 101;
                    hQVar = this;
                    pdu.Sg(i10);
                    pdu.YFl(qsH.YFl(i10));
                    hQVar.qO.YFl(pdu);
                }
            } else {
                z10 = optBoolean;
                d12 = d11;
            }
            try {
                optString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, qsH.YFl(101));
                optInt = jSONObject.optInt("code", 101);
            } catch (Exception unused2) {
                hQVar = this;
                i10 = 101;
                pdu.Sg(i10);
                pdu.YFl(qsH.YFl(i10));
                hQVar.qO.YFl(pdu);
            }
            try {
                pdu.YFl(z10);
                pdu.YFl(d10);
                pdu.Sg(d12);
                pdu.YFl(optString);
                pdu.Sg(optInt);
                hQVar = this;
                hQVar.qO.YFl(pdu);
                if (optJSONObject2 == null || (vcVar = hQVar.BPI) == null) {
                    return;
                }
                vcVar.YFl(pdu);
            } catch (Exception unused3) {
                hQVar = this;
                i10 = 101;
                pdu.Sg(i10);
                pdu.YFl(qsH.YFl(i10));
                hQVar.qO.YFl(pdu);
            }
        } catch (Exception unused4) {
        }
    }

    public void DSW(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.YFl rQ;
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.lG;
        if (!(wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) || (rQ = ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).rQ()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.Wwa> tN2 = rQ.tN();
        if (optInt < 0 || optInt >= tN2.size()) {
            return;
        }
        YFl(tN2.get(optInt), this.mB, false);
        com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2 = this.iY;
        if (sg2 != null) {
            sg2.AlY();
        }
    }

    public void tN(int i10) {
        com.bytedance.sdk.openadsdk.core.qsH.pDU pdu = this.aIu;
        if (pdu != null) {
            pdu.Sg(i10);
        }
    }

    private JSONObject tN(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put(BidResponsedEx.KEY_CID, wwa.kYz());
        jSONObject2.put("req_id", wwa.ivp());
        jSONObject2.put("ad_id", wwa.zz());
        jSONObject2.put("log_extra", wwa.uGS());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().zz());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", wwa.bT());
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(com.bytedance.sdk.openadsdk.core.qsH.pDU pdu, JSONObject jSONObject) {
        if (pdu != null && jSONObject != null) {
            try {
                pdu.YFl(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false));
            } catch (Exception unused) {
            }
        }
    }

    public com.bytedance.sdk.component.YFl.lG YFl() {
        return this.lu;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:42:0x000f, B:9:0x0017, B:10:0x001d, B:18:0x005b, B:19:0x0074, B:21:0x008c, B:24:0x0095, B:26:0x009c, B:27:0x00a2, B:29:0x00b2, B:32:0x00bd, B:38:0x0068), top: B:41:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject Sg(com.bytedance.sdk.openadsdk.core.model.Wwa r10) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.settings.vc r1 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            r1 = 0
            if (r10 == 0) goto L14
            int r2 = r10.kU()     // Catch: java.lang.Exception -> Lc0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r10 == 0) goto L1c
            int r3 = r10.Uv()     // Catch: java.lang.Exception -> Lc0
            goto L1d
        L1c:
            r3 = r1
        L1d:
            com.bytedance.sdk.openadsdk.core.settings.vc r4 = com.bytedance.sdk.openadsdk.core.lG.AlY()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lc0
            int r4 = r4.nc(r5)     // Catch: java.lang.Exception -> Lc0
            com.bytedance.sdk.openadsdk.core.settings.vc r5 = com.bytedance.sdk.openadsdk.core.lG.AlY()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lc0
            int r5 = r5.qO(r6)     // Catch: java.lang.Exception -> Lc0
            com.bytedance.sdk.openadsdk.core.settings.vc r6 = com.bytedance.sdk.openadsdk.core.lG.AlY()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lc0
            boolean r6 = r6.vc(r7)     // Catch: java.lang.Exception -> Lc0
            com.bytedance.sdk.openadsdk.core.settings.vc r7 = com.bytedance.sdk.openadsdk.core.lG.AlY()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lc0
            int r7 = r7.GA(r8)     // Catch: java.lang.Exception -> Lc0
            r8 = 1
            if (r7 != r8) goto L52
            r7 = r8
            goto L53
        L52:
            r7 = r1
        L53:
            r9 = 7
            if (r3 == r9) goto L68
            r9 = 8
            if (r3 != r9) goto L5b
            goto L68
        L5b:
            com.bytedance.sdk.openadsdk.core.settings.vc r3 = com.bytedance.sdk.openadsdk.core.lG.AlY()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lc0
            boolean r2 = r3.tN(r2)     // Catch: java.lang.Exception -> Lc0
            goto L74
        L68:
            com.bytedance.sdk.openadsdk.core.settings.vc r3 = com.bytedance.sdk.openadsdk.core.lG.AlY()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lc0
            boolean r2 = r3.lG(r2)     // Catch: java.lang.Exception -> Lc0
        L74:
            java.lang.String r3 = "voice_control"
            r0.put(r3, r2)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = "rv_skip_time"
            r0.put(r2, r4)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = "fv_skip_show"
            r0.put(r2, r6)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = "iv_skip_time"
            r0.put(r2, r5)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = "show_dislike"
            if (r10 == 0) goto L94
            boolean r3 = r10.Gnp()     // Catch: java.lang.Exception -> Lc0
            if (r3 == 0) goto L94
            r3 = r8
            goto L95
        L94:
            r3 = r1
        L95:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = "video_adaptation"
            if (r10 == 0) goto La1
            int r3 = r10.dXO()     // Catch: java.lang.Exception -> Lc0
            goto La2
        La1:
            r3 = r1
        La2:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = "skip_change_to_close"
            r0.put(r2, r7)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = "bar_render_platform"
            boolean r10 = r10.blt()     // Catch: java.lang.Exception -> Lc0
            if (r10 == 0) goto Lbd
            com.bytedance.sdk.openadsdk.core.settings.vc r10 = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO()     // Catch: java.lang.Exception -> Lc0
            boolean r10 = r10.IXB()     // Catch: java.lang.Exception -> Lc0
            if (r10 == 0) goto Lbd
            r1 = r8
        Lbd:
            r0.put(r2, r1)     // Catch: java.lang.Exception -> Lc0
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.hQ.Sg(com.bytedance.sdk.openadsdk.core.model.Wwa):org.json.JSONObject");
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar) {
        this.GS = wNVar;
        return this;
    }

    public hQ YFl(boolean z10) {
        this.Sg = z10;
        return this;
    }

    public hQ YFl(View view) {
        this.eT = new WeakReference<>(view);
        return this;
    }

    public hQ YFl(int i10) {
        this.EH = i10;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        this.lG = wwa;
        if (wwa != null) {
            this.Wwa = wwa.kA();
        }
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.YoT.Sg sg2) {
        this.dXO = sg2;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.YoT.NjR njR) {
        this.Cfr = njR;
        return this;
    }

    public hQ YFl(Map<String, Object> map) {
        this.YFl = map;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.component.adexpress.Sg.eT eTVar) {
        this.qO = eTVar;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.core.qsH.pDU pdu) {
        this.aIu = pdu;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.core.Sg.AlY alY) {
        this.Ga = alY;
        return this;
    }

    public hQ YFl(JSONObject jSONObject) {
        this.wXo = jSONObject;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.YoT.YFl yFl) {
        this.VOe = yFl;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.YoT.wN wNVar) {
        this.bZ = wNVar;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.YoT.AlY alY) {
        this.UZM = alY;
        return this;
    }

    public void AlY(boolean z10) {
        this.zG = z10;
    }

    public hQ YFl(List<com.bytedance.sdk.openadsdk.core.model.Wwa> list) {
        this.pq = list;
        return this;
    }

    public hQ YFl(com.bytedance.sdk.openadsdk.YoT.vc vcVar) {
        this.BPI = vcVar;
        return this;
    }

    public static JSONArray Sg(List<com.bytedance.sdk.openadsdk.core.model.Wwa> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(list.get(i10).ni());
        }
        return jSONArray;
    }

    public static void YFl(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) throws Exception {
        String zz = wwa.zz();
        if (!TextUtils.isEmpty(zz)) {
            jSONObject.put(BidResponsedEx.KEY_CID, zz);
        }
        String uGS = wwa.uGS();
        if (!TextUtils.isEmpty(uGS)) {
            jSONObject.put("log_extra", uGS);
        }
        String cC = wwa.cC();
        if (!TextUtils.isEmpty(cC)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, cC);
        }
        jSONObject.put("dc", TextUtils.isEmpty(lG.AlY().mB()) ? lG.AlY().mB() : "SG");
        jSONObject.put("language", YoT.YFl());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().zz());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            qO(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void Sg(@NonNull final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    NjR(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(new com.bytedance.sdk.component.qsH.qsH("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.hQ.9
                @Override // java.lang.Runnable
                public void run() {
                    long j3;
                    String str;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    hQ.this.mB = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (!hQ.this.qsH(queryParameter3)) {
                        return;
                    }
                    long j10 = 0;
                    try {
                        j3 = Long.parseLong(uri.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    } catch (Exception unused) {
                        j3 = 0;
                    }
                    try {
                        j10 = Long.parseLong(uri.getQueryParameter("ext_value"));
                    } catch (Exception unused2) {
                    }
                    long j11 = j10;
                    String queryParameter4 = uri.getQueryParameter("extra");
                    JSONObject jSONObject = null;
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(queryParameter4);
                            try {
                                jSONObject2.putOpt("ua_policy", Integer.valueOf(hQ.this.EH));
                            } catch (Exception unused3) {
                            }
                            jSONObject = jSONObject2;
                        } catch (Exception unused4) {
                        }
                    }
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(queryParameter3)) {
                        jSONObject = hQ.this.aIu(jSONObject);
                    }
                    if (!"landing_perf_error".equals(queryParameter3) && !"landing_perf_stats".equals(queryParameter3)) {
                        str = hQ.this.YFl(queryParameter2, queryParameter3);
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
                            str = hQ.this.f10680vc;
                            jSONObject = jSONObject3;
                        } catch (Exception unused6) {
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(hQ.this.lG, queryParameter, str, queryParameter3, j3, j11, jSONObject, com.bytedance.sdk.openadsdk.core.model.rkt.AlY(hQ.this.lG));
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x034a, code lost:
    
        if (r4 != null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0397, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0395, code lost:
    
        if (r4 != null) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject YFl(com.bytedance.sdk.openadsdk.core.hQ.Sg r23, int r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.hQ.YFl(com.bytedance.sdk.openadsdk.core.hQ$Sg, int):org.json.JSONObject");
    }

    private void YFl(JSONObject jSONObject, boolean z10, String str) {
        com.bytedance.sdk.openadsdk.core.widget.vc vcVar;
        if (z10) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString) || new JSONObject(optString).optInt("agg_request_type", -1) != 1 || !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) || (vcVar = this.DSW) == null) {
                    return;
                }
                vcVar.YFl();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AndroidObject", "callAggClickListener faile", th2);
            }
        }
    }

    private boolean YFl(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        int i10;
        String str2;
        if (jSONObject != null) {
            i10 = jSONObject.optInt("landingStyle");
            str = jSONObject.optString("url");
            str2 = jSONObject.optString("fallback_url");
        } else {
            str = null;
            i10 = -1;
            str2 = null;
        }
        boolean z10 = false;
        if (i10 == 1) {
            if (!com.bytedance.sdk.component.utils.EH.YFl(str)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AndroidObject", "handleUrl, EX1->: ", e2);
                }
                return z10;
            }
        } else if (i10 == 2) {
            try {
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    jSONObject2.put("empty_url", 1);
                } else if (!com.bytedance.sdk.component.utils.EH.YFl(str2)) {
                    jSONObject2.put("invalid_url", 1);
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AndroidObject", "handleUrl, EX2->: ", e10);
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    private void YFl(String str, boolean z10) {
        if (this.GS == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            this.GS.YFl(str);
        } else {
            this.GS.Sg(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.Sg
    public void YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("time");
            String optString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.qsH.pDU pdu = this.aIu;
            if (pdu != null) {
                pdu.YFl(optInt, optString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    private void YFl(final Sg sg2, final JSONObject jSONObject) {
        if (sg2 == null) {
            return;
        }
        try {
            YFl(sg2.AlY, new com.bytedance.sdk.openadsdk.YoT.tN() { // from class: com.bytedance.sdk.openadsdk.core.hQ.6
                @Override // com.bytedance.sdk.openadsdk.YoT.tN
                public void YFl(boolean z10, List<com.bytedance.sdk.openadsdk.core.model.Wwa> list) {
                    if (z10) {
                        try {
                            jSONObject.put("creatives", hQ.Sg(list));
                            hQ.this.Sg(sg2.Sg, jSONObject);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    hQ.this.Sg(sg2.Sg, jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @JProtect
    private boolean YFl(String str, int i10, com.bytedance.sdk.openadsdk.core.model.pDU pdu) {
        HashMap<String, nc> hashMap;
        if (TextUtils.isEmpty(str) || (hashMap = this.mn) == null || hashMap.get(str) == null) {
            return false;
        }
        throw null;
    }

    @JProtect
    public void YFl(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.YoT.tN tNVar) {
        if (tNVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.YoT.tN tNVar2 = new com.bytedance.sdk.openadsdk.YoT.tN() { // from class: com.bytedance.sdk.openadsdk.core.hQ.7
                @Override // com.bytedance.sdk.openadsdk.YoT.tN
                public void YFl(final boolean z10, final List<com.bytedance.sdk.openadsdk.core.model.Wwa> list) {
                    com.bytedance.sdk.openadsdk.utils.mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hQ.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            tNVar.YFl(z10, list);
                        }
                    });
                }
            };
            if (this.lG != null && !TextUtils.isEmpty(this.YoT)) {
                int Uv = this.lG.Uv();
                AdSlot pq = this.lG.pq();
                com.bytedance.sdk.openadsdk.core.model.aIu aiu = new com.bytedance.sdk.openadsdk.core.model.aIu();
                aiu.f10702vc = true;
                if (this.lG.lu() != null || this.lG.UI() != null) {
                    aiu.qsH = 2;
                }
                JSONObject jSONObject2 = this.Wwa;
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
                aiu.DSW = jSONObject2;
                lG.tN().YFl(pq, aiu, Uv, new qO.YFl() { // from class: com.bytedance.sdk.openadsdk.core.hQ.8
                    @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
                    public void YFl(int i10, String str) {
                        tNVar2.YFl(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
                    public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
                        if (yFl.tN() != null && !yFl.tN().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = yFl.tN().get(0);
                            if (wwa != null) {
                                hQ.this.Wwa = wwa.kA();
                            }
                            tNVar2.YFl(true, yFl.tN());
                            return;
                        }
                        tNVar2.YFl(false, null);
                        sg2.YFl(-3);
                        com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                    }
                });
                return;
            }
            tNVar2.YFl(false, null);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AndroidObject", "get ads error", e2);
        }
    }

    public boolean YFl(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return qsH.containsKey(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String YFl(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.rkt.AlY(this.lG)) {
            return "show".equals(str2) ? Sco.YFl(this.GA) : "aggregate_page";
        }
        if (this.dXO != null) {
            return Sco.YFl(this.GA);
        }
        return this.qO == null ? Sco.Sg(this.GA) : str;
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof Sg) {
                try {
                    YFl((Sg) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.nc.Sg
    public void YFl(String str, JSONObject jSONObject) {
        tN(str, jSONObject);
    }

    private void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.core.Sg.YFl(lG.YFl(), wwa, str, this.GA);
        yFl.YFl(com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(lG.YFl(), wwa, str));
        if (!z10) {
            yFl.YFl(false);
        }
        yFl.onClick(null);
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2) {
        this.iY = sg2;
    }

    public void YFl(YFl yFl) {
        this.Bh = yFl;
    }
}
