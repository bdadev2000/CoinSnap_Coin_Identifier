package com.bytedance.sdk.openadsdk.core.ugen.lMd;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.rV;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.Gzh;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.ugen.jU.KS;
import com.bytedance.sdk.openadsdk.core.ugen.lMd.zp;
import com.bytedance.sdk.openadsdk.core.ugen.zp.lMd;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.com.bytedance.overseas.sdk.zp.jU;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd implements rV, zp.InterfaceC0116zp {
    protected static int zp = 8;
    private View Bj;
    private woN COT;
    private String HWF;
    private final Activity KS;
    private long KVG;
    private String QR;
    private final com.bytedance.sdk.openadsdk.core.ugen.jU.zp YW;
    private float dQp;
    private String dT;
    private final JSONObject jU;
    private String ku;
    private zp lMd;
    private float rV;
    private float tG;
    private float vDp;
    private boolean vwr = true;
    private long woN;

    public lMd(Activity activity, JSONObject jSONObject, woN won, String str, com.bytedance.sdk.openadsdk.core.ugen.jU.zp zpVar) {
        this.KS = activity;
        this.jU = jSONObject;
        this.dT = str;
        this.COT = won;
        this.YW = zpVar;
    }

    private void lMd() {
        int oKZ = this.COT.oKZ();
        if (oKZ != 2 && oKZ != 3) {
            if (oKZ == 4) {
                jU.zp(this.KS, this.COT, this.dT).jU();
                return;
            } else {
                if (oKZ != 5) {
                    return;
                }
                YhE.KS(this.KS, this.COT.si());
                return;
            }
        }
        if (oKZ == 3) {
            String aax = this.COT.aax();
            if (!TextUtils.isEmpty(aax) && aax.contains("play.google.com/store")) {
                if (com.com.bytedance.overseas.sdk.zp.lMd.zp(this.KS, aax, aax.substring(aax.indexOf("?id=") + 4), this.dT, this.COT)) {
                    return;
                }
            }
        }
        Activity activity = this.KS;
        woN won = this.COT;
        int zp2 = YhE.zp(this.dT);
        String str = this.dT;
        Gzh.zp((Context) activity, won, zp2, (PAGNativeAd) null, (PangleAd) null, str, jU.zp(this.KS, this.COT, str), true, 0);
    }

    public void zp() {
        this.lMd = new zp(this.KS);
        woN won = this.COT;
        if (won != null && won.YC() != null) {
            this.ku = this.COT.YC().KS();
            this.HWF = this.COT.YC().zp();
            this.QR = this.COT.YC().lMd();
        }
        this.YW.zp();
        com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp().zp(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.ku, this.HWF, this.QR, "", new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.lMd.1
            @Override // com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp
            public void zp(JSONObject jSONObject, String str) {
                lMd lmd = lMd.this;
                lmd.zp(jSONObject, lmd.jU);
                lMd.this.YW.zp(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp
            public void zp(int i9, String str, String str2) {
                lMd.this.YW.zp(i9, str, str2);
            }
        });
    }

    public void zp(View view) {
        this.Bj = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(JSONObject jSONObject, JSONObject jSONObject2) {
        this.lMd.zp((zp.InterfaceC0116zp) this);
        this.lMd.zp((rV) this);
        this.YW.lMd();
        this.lMd.zp(jSONObject, jSONObject2, new KS() { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.lMd.2
            @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.KS
            public void zp(int i9, String str) {
                if (lMd.this.YW != null) {
                    lMd.this.YW.zp(i9, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.jU.KS
            public void zp(com.bytedance.adsdk.ugeno.component.lMd<View> lmd) {
                if (lMd.this.YW != null) {
                    lMd.this.YW.zp(lmd);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.lMd.zp.InterfaceC0116zp
    public void zp(Bj bj) {
        String optString = bj.KS().optString("type");
        optString.getClass();
        if (!optString.equals("privacy")) {
            if (!optString.equals("creative") || this.KS == null || this.COT == null) {
                return;
            }
            lMd();
            ComponentCallbacks2 componentCallbacks2 = this.KS;
            if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.video.KS.lMd) {
                ((com.bytedance.sdk.openadsdk.core.video.KS.lMd) componentCallbacks2).pvr();
            }
            zp(bj, this.COT);
            return;
        }
        if (this.KS == null || TextUtils.isEmpty(KVG.jU().eWG())) {
            return;
        }
        TTWebsiteActivity.zp(this.KS, this.COT, this.dT);
    }

    private void zp(Bj bj, woN won) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.vDp);
            jSONObject.put("down_y", this.tG);
            jSONObject.put("down_time", this.KVG);
            jSONObject.put("up_x", this.rV);
            jSONObject.put("up_y", this.dQp);
            jSONObject.put("up_time", this.woN);
            View YW = bj.zp().YW();
            int i9 = 1;
            if (YW != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = YW.getWidth();
                float height = YW.getHeight();
                YW.getLocationOnScreen(iArr);
                float f9 = iArr[0];
                float f10 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(TtmlNode.LEFT, f9);
                jSONObject2.put("top", f10);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.Bj;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.Bj.getWidth());
                jSONObject.put("button_height", this.Bj.getHeight());
            }
            View findViewById = this.KS.findViewById(R.id.content);
            if (findViewById != null) {
                int[] iArr3 = new int[2];
                findViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", findViewById.getWidth());
                jSONObject.put("height", findViewById.getHeight());
            }
            jSONObject.put("click_area_type", bj.zp().rV());
            jSONObject.put("brickId", bj.zp().tG());
            jSONObject.put("endcard_id", this.HWF);
            jSONObject.put("click_scence", 2);
            if (!this.vwr) {
                i9 = 2;
            }
            jSONObject.put("user_behavior_type", i9);
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, this.dT, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.rV
    public void zp(com.bytedance.adsdk.ugeno.component.lMd lmd, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.KVG = System.currentTimeMillis();
            this.vDp = motionEvent.getRawX();
            this.tG = motionEvent.getRawY();
            this.vwr = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.vDp) >= zp || Math.abs(motionEvent.getRawY() - this.tG) >= zp) {
                this.vwr = false;
                return;
            }
            return;
        }
        this.rV = motionEvent.getRawX();
        this.dQp = motionEvent.getRawY();
        if (Math.abs(this.rV - this.vDp) >= zp || Math.abs(this.dQp - this.tG) >= zp) {
            this.vwr = false;
        }
        this.woN = System.currentTimeMillis();
    }
}
