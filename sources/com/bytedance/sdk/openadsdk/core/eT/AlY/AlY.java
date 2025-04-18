package com.bytedance.sdk.openadsdk.core.eT.AlY;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.nc;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.vc;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY {
    private com.bytedance.adsdk.ugeno.Sg.Sg AlY;
    private final Context DSW;
    private boolean EH;
    private boolean GA;
    private final String NjR;
    private final JSONObject YoT;
    private JSONObject eT;

    /* renamed from: nc, reason: collision with root package name */
    private vc f10670nc;
    private boolean pDU;
    private final Wwa qsH;
    private JSONArray rkt;
    private com.bytedance.adsdk.ugeno.Sg.Sg tN;
    private com.bytedance.adsdk.ugeno.Sg.Sg wN;
    private int YFl = -1;
    private int Sg = -1;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10671vc = "UGenSwiperEvent";

    public AlY(Context context, Wwa wwa, String str, JSONObject jSONObject) {
        this.DSW = context;
        this.qsH = wwa;
        this.NjR = str;
        this.YoT = jSONObject;
    }

    public JSONObject AlY() {
        return this.eT;
    }

    public void Sg() {
        int i10;
        com.bytedance.adsdk.ugeno.Sg.Sg sg2 = this.wN;
        if (!(sg2 instanceof com.bytedance.adsdk.ugeno.Sg) || (i10 = this.YFl) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.Sg) sg2).YFl(i10 - 1);
    }

    public void tN() {
        int i10;
        com.bytedance.adsdk.ugeno.Sg.Sg sg2 = this.wN;
        if (!(sg2 instanceof com.bytedance.adsdk.ugeno.Sg) || (i10 = this.YFl) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.Sg) sg2).YFl(i10 + 1);
    }

    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2) {
        com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg = sg2.Sg("swiperLayout");
        this.wN = Sg;
        if (Sg instanceof com.bytedance.adsdk.ugeno.Sg) {
            this.rkt = this.YoT.optJSONArray("dpa_data");
            this.tN = sg2.Sg("swiperLeftArrow");
            this.AlY = sg2.Sg("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.Sg) this.wN).YFl(new com.bytedance.adsdk.ugeno.vc.tN() { // from class: com.bytedance.sdk.openadsdk.core.eT.AlY.AlY.1
                @Override // com.bytedance.adsdk.ugeno.vc.tN
                public void YFl(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                    AlY.this.Sg = i10;
                    AlY.this.YFl = i11;
                    AlY.this.GA = z10;
                    AlY.this.pDU = z11;
                    AlY.this.EH = z12;
                    AlY.this.YFl(z10, z11, z12);
                    AlY.this.YFl(i10);
                }
            });
        }
    }

    public void YFl() {
        YFl(this.GA, this.pDU, this.EH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(boolean z10, boolean z11, boolean z12) {
        com.bytedance.adsdk.ugeno.Sg.Sg sg2 = this.tN;
        if (sg2 == null || this.AlY == null) {
            return;
        }
        View NjR = sg2.NjR();
        View NjR2 = this.AlY.NjR();
        JSONArray jSONArray = this.rkt;
        if (jSONArray != null && jSONArray.length() == 1) {
            NjR.setVisibility(8);
            NjR2.setVisibility(8);
            return;
        }
        if (z10) {
            return;
        }
        if (z11) {
            if (NjR instanceof TextView) {
                YFl((TextView) NjR, 90);
            }
            if (NjR2 instanceof TextView) {
                YFl((TextView) NjR2, 255);
                return;
            }
            return;
        }
        if (z12) {
            if (NjR instanceof TextView) {
                YFl((TextView) NjR, 255);
            }
            if (NjR2 instanceof TextView) {
                YFl((TextView) NjR2, 90);
                return;
            }
            return;
        }
        if (NjR instanceof TextView) {
            YFl((TextView) NjR, 255);
        }
        if (NjR2 instanceof TextView) {
            YFl((TextView) NjR2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i10);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.qsH, this.NjR, "carousel_show", jSONObject);
    }

    private void YFl(TextView textView, int i10) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i10, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void YFl(vc vcVar) {
        this.f10670nc = vcVar;
    }

    public boolean YFl(nc ncVar) {
        JSONObject optJSONObject;
        this.eT = null;
        int i10 = this.Sg;
        if (i10 != -1 && i10 != 0) {
            try {
                JSONObject tN = ncVar.tN();
                if (tN != null && (optJSONObject = tN.optJSONObject("related_dpa_click")) != null) {
                    boolean optBoolean = optJSONObject.optBoolean("enableOpenExternalUrl");
                    int optInt = optJSONObject.optInt("landingStyle");
                    if (optBoolean && optInt != -1) {
                        if (this.rkt != null) {
                            String YFl = com.bytedance.adsdk.ugeno.tN.Sg.YFl(optJSONObject.optString("url"), this.rkt.optJSONObject(this.Sg));
                            String YFl2 = com.bytedance.adsdk.ugeno.tN.Sg.YFl(optJSONObject.optString("fallback_url"), this.rkt.optJSONObject(this.Sg));
                            optJSONObject.put("url", YFl);
                            optJSONObject.put("fallback_url", YFl2);
                            YFl(optJSONObject, this.rkt.optJSONObject(this.Sg));
                        }
                        YFl(optJSONObject, ncVar.YFl().NjR());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th2) {
                YoT.YFl("UGenSwiperEvent", th2.getMessage());
            }
        }
        return false;
    }

    private void YFl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
        this.eT = optJSONObject;
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.eT.putOpt(next, com.bytedance.adsdk.ugeno.tN.Sg.YFl((String) this.eT.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.eT);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r4 != 3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean YFl(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            goto L27
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.EH.YFl(r6)
            if (r4 != 0) goto L26
            goto L27
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.EH.YFl(r5)
            if (r4 != 0) goto L26
            goto L27
        L26:
            r0 = r1
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.eT.AlY.AlY.YFl(int, java.lang.String, java.lang.String):boolean");
    }

    private void YFl(JSONObject jSONObject, View view) {
        if (YFl(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            com.bytedance.sdk.openadsdk.core.Wwa.YFl(YFl(view), this.DSW instanceof Activity, jSONObject, this.qsH, this.NjR, Sco.YFl(this.NjR), null, this.f10670nc);
        }
    }

    private Context YFl(View view) {
        Activity YFl = view != null ? com.bytedance.sdk.component.utils.Sg.YFl(view) : null;
        return YFl == null ? this.DSW : YFl;
    }
}
