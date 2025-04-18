package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import com.bytedance.adsdk.ugeno.core.NjR;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg extends com.bytedance.adsdk.ugeno.Sg.YFl<com.bytedance.adsdk.ugeno.vc.Sg> {
    private float Af;
    private float ECi;
    private boolean Gmi;
    private String Gnp;
    private boolean IXB;
    private float JwO;
    private com.bytedance.adsdk.ugeno.Sg.Sg PT;
    private String VJb;
    private JSONArray ZS;
    private float dU;

    /* renamed from: ni, reason: collision with root package name */
    private boolean f10246ni;
    private float pm;
    private float wqc;

    /* renamed from: xg, reason: collision with root package name */
    private int f10247xg;
    private int yn;

    public Sg(Context context) {
        super(context);
        this.f10246ni = true;
        this.Gmi = true;
        this.dU = 0.0f;
        this.ECi = 2000.0f;
        this.VJb = Constants.NORMAL;
        this.IXB = true;
        this.f10247xg = Color.parseColor("#666666");
        this.yn = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public View AlY() {
        com.bytedance.adsdk.ugeno.vc.Sg sg2 = new com.bytedance.adsdk.ugeno.vc.Sg(this.Sg);
        this.wN = sg2;
        sg2.YFl((tN) this);
        return this.wN;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl, com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
        JSONArray jSONArray = this.ZS;
        if (jSONArray != null && jSONArray.length() > 0) {
            ((com.bytedance.adsdk.ugeno.vc.Sg) this.wN).AlY((int) this.pm).wN((int) this.wqc).vc((int) this.JwO).Sg(this.IXB).Sg(this.yn).tN(this.f10247xg).YFl(this.VJb).tN(this.f10246ni).YFl(this.Af).YFl(this.Gmi).YFl((int) this.ECi).Sg(this.IXB);
            for (int i10 = 0; i10 < this.ZS.length(); i10++) {
                NjR njR = new NjR(this.Sg);
                njR.YFl(this.AfY);
                com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg = njR.Sg(this.PT.YI(), null);
                njR.Sg(this.ZS.optJSONObject(i10));
                ((com.bytedance.adsdk.ugeno.vc.Sg) this.wN).YFl((com.bytedance.adsdk.ugeno.vc.Sg) Sg);
            }
            if (this.Gmi) {
                ((com.bytedance.adsdk.ugeno.vc.Sg) this.wN).YFl();
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(JSONObject jSONObject) {
    }

    public void YFl(com.bytedance.adsdk.ugeno.vc.tN tNVar) {
        T t5 = this.wN;
        if (t5 != 0) {
            ((com.bytedance.adsdk.ugeno.vc.Sg) t5).setOnPageChangeListener(tNVar);
        }
    }

    public void YFl(int i10) {
        T t5 = this.wN;
        if (t5 != 0) {
            ((com.bytedance.adsdk.ugeno.vc.Sg) t5).NjR(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        this.PT = sg2;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
        super.YFl(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1657957217:
                if (str.equals("delayStart")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1575751020:
                if (str.equals("indicatorColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1453344127:
                if (str.equals("nextMargin")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    c10 = 3;
                    break;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    c10 = 4;
                    break;
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    c10 = 5;
                    break;
                }
                break;
            case -202057851:
                if (str.equals("previousMargin")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    c10 = 7;
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 857882560:
                if (str.equals("pageCount")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1196931001:
                if (str.equals("indicatorSelectedColor")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1788817256:
                if (str.equals("dataList")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.dU = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                return;
            case 1:
                this.f10247xg = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                return;
            case 2:
                this.JwO = qsH.YFl(this.Sg, com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f));
                return;
            case 3:
                this.VJb = str2;
                return;
            case 4:
                this.Gnp = str2;
                return;
            case 5:
                this.IXB = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, true);
                return;
            case 6:
                this.wqc = qsH.YFl(this.Sg, com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f));
                return;
            case 7:
                this.f10246ni = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, true);
                return;
            case '\b':
                this.ECi = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 500.0f);
                return;
            case '\t':
                this.Af = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 1.0f);
                return;
            case '\n':
                this.pm = qsH.YFl(this.Sg, com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f));
                return;
            case 11:
                this.yn = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                return;
            case '\f':
                this.Gmi = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, true);
                return;
            case '\r':
                this.ZS = com.bytedance.adsdk.ugeno.DSW.Sg.YFl(str2, (JSONArray) null);
                return;
            default:
                return;
        }
    }
}
