package com.bytedance.sdk.openadsdk.core.eT.tN;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.GA;
import com.bytedance.adsdk.ugeno.core.nc;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.AlY;
import com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.eT.YFl.Sg;
import com.bytedance.sdk.openadsdk.core.eT.tN.YFl;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.mn;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg implements GA, YFl.InterfaceC0127YFl {
    protected static int YFl = 8;
    private final Wwa AlY;
    private String DSW;
    private float EH;
    private View GA;
    private JSONObject NjR;
    private YFl Sg;
    private long Wwa;
    private String YoT;
    private boolean aIu = true;
    private com.bytedance.sdk.openadsdk.core.eT.wN.YFl eT;
    private float lG;

    /* renamed from: nc, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.eT.wN.Sg f10677nc;
    private float pDU;
    private long qO;
    private String qsH;
    private float rkt;
    private final Activity tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10678vc;
    private final com.bytedance.sdk.openadsdk.core.eT.vc.YFl wN;

    public Sg(Activity activity, Wwa wwa, com.bytedance.sdk.openadsdk.core.eT.vc.YFl yFl, String str, com.bytedance.sdk.openadsdk.core.eT.wN.Sg sg2) {
        this.tN = activity;
        this.YoT = str;
        this.AlY = wwa;
        this.f10677nc = sg2;
        this.wN = yFl;
    }

    private void Sg() {
        int ko = this.AlY.ko();
        if (ko != 2 && ko != 3) {
            if (ko == 4) {
                DSW.YFl(this.tN, this.AlY, this.YoT).AlY();
                return;
            } else {
                if (ko != 5) {
                    return;
                }
                Sco.tN(this.tN, this.AlY.Jc());
                return;
            }
        }
        if (ko == 3) {
            String Cqy = this.AlY.Cqy();
            if (!TextUtils.isEmpty(Cqy) && Cqy.contains("play.google.com/store")) {
                if (AlY.YFl(this.tN, Cqy, Cqy.substring(Cqy.indexOf("?id=") + 4), this.YoT, this.AlY)) {
                    return;
                }
            }
        }
        Activity activity = this.tN;
        Wwa wwa = this.AlY;
        int YFl2 = Sco.YFl(this.YoT);
        String str = this.YoT;
        mn.YFl((Context) activity, wwa, YFl2, (PAGNativeAd) null, (PangleAd) null, str, DSW.YFl(this.tN, this.AlY, str), true, 0);
    }

    public void YFl() {
        if (this.AlY == null) {
            this.f10677nc.YFl(1, "material is null", "net");
            return;
        }
        if (this.wN == null) {
            this.f10677nc.YFl(1, "material ugen template is null", "net");
            return;
        }
        this.Sg = new YFl(this.tN);
        this.qsH = this.wN.tN();
        this.f10678vc = this.wN.YFl();
        this.DSW = this.wN.Sg();
        this.NjR = this.AlY.ni();
        this.f10677nc.YFl(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl().YFl(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.qsH, this.f10678vc, this.DSW, "", new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.core.eT.tN.Sg.1
            @Override // com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl
            public void YFl(JSONObject jSONObject, String str) {
                Sg sg2 = Sg.this;
                sg2.YFl(jSONObject, sg2.NjR);
                Sg.this.f10677nc.Sg(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl
            public void YFl(int i10, String str, String str2) {
                Sg.this.f10677nc.YFl(i10, str, str2);
            }
        });
    }

    public void YFl(View view) {
        this.GA = view;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.eT.wN.YFl yFl) {
        this.eT = yFl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(JSONObject jSONObject, JSONObject jSONObject2) {
        this.Sg.YFl((YFl.InterfaceC0127YFl) this);
        this.Sg.YFl((GA) this);
        this.f10677nc.YFl();
        this.Sg.YFl(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.eT.wN.AlY() { // from class: com.bytedance.sdk.openadsdk.core.eT.tN.Sg.2
            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.AlY
            public void YFl(int i10, String str) {
                if (Sg.this.f10677nc != null) {
                    Sg.this.f10677nc.YFl(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.AlY
            public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2) {
                if (Sg.this.f10677nc != null) {
                    Sg.this.f10677nc.YFl(sg2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.tN.YFl.InterfaceC0127YFl
    public void YFl(nc ncVar) {
        String optString = ncVar.tN().optString("type");
        optString.getClass();
        char c10 = 65535;
        switch (optString.hashCode()) {
            case -314498168:
                if (optString.equals("privacy")) {
                    c10 = 0;
                    break;
                }
                break;
            case 94756344:
                if (optString.equals("close")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1820422063:
                if (optString.equals("creative")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (this.tN == null || TextUtils.isEmpty(lG.AlY().Sco())) {
                    return;
                }
                TTWebsiteActivity.YFl(this.tN, this.AlY, this.YoT);
                return;
            case 1:
                com.bytedance.sdk.openadsdk.core.eT.wN.YFl yFl = this.eT;
                if (yFl != null) {
                    yFl.Sg();
                    return;
                }
                return;
            case 2:
                if (this.tN == null || this.AlY == null) {
                    return;
                }
                Sg();
                ComponentCallbacks2 componentCallbacks2 = this.tN;
                if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.Sg) {
                    ((com.bytedance.sdk.openadsdk.core.GA.AlY.Sg) componentCallbacks2).AlY();
                }
                YFl(ncVar, this.AlY);
                return;
            default:
                return;
        }
    }

    private void YFl(nc ncVar, Wwa wwa) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.pDU);
            jSONObject.put("down_y", this.EH);
            jSONObject.put("down_time", this.Wwa);
            jSONObject.put("up_x", this.rkt);
            jSONObject.put("up_y", this.lG);
            jSONObject.put("up_time", this.qO);
            View NjR = ncVar.YFl().NjR();
            int i10 = 1;
            if (NjR != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = NjR.getWidth();
                float height = NjR.getHeight();
                NjR.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(TtmlNode.LEFT, f10);
                jSONObject2.put("top", f11);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.GA;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.GA.getWidth());
                jSONObject.put("button_height", this.GA.getHeight());
            }
            View findViewById = this.tN.findViewById(R.id.content);
            if (findViewById != null) {
                int[] iArr3 = new int[2];
                findViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", findViewById.getWidth());
                jSONObject.put("height", findViewById.getHeight());
            }
            jSONObject.put("click_area_type", ncVar.YFl().hQ());
            jSONObject.put("brick_id", ncVar.YFl().Cfr());
            jSONObject.put("endcard_id", this.f10678vc);
            jSONObject.put("click_scence", 2);
            if (!this.aIu) {
                i10 = 2;
            }
            jSONObject.put("user_behavior_type", i10);
            com.bytedance.sdk.openadsdk.core.eT.wN.YFl yFl = this.eT;
            if (yFl != null) {
                jSONObject.put("endcard_type", yFl.YFl());
            }
            tN.YFl(wwa, this.YoT, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.GA
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Wwa = System.currentTimeMillis();
            this.pDU = motionEvent.getRawX();
            this.EH = motionEvent.getRawY();
            this.aIu = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.pDU) >= YFl || Math.abs(motionEvent.getRawY() - this.EH) >= YFl) {
                this.aIu = false;
                return;
            }
            return;
        }
        this.rkt = motionEvent.getRawX();
        this.lG = motionEvent.getRawY();
        if (Math.abs(this.rkt - this.pDU) >= YFl || Math.abs(this.lG - this.EH) >= YFl) {
            this.aIu = false;
        }
        this.qO = System.currentTimeMillis();
    }
}
