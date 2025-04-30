package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.component.zp;
import com.bytedance.adsdk.ugeno.core.HWF;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT {
    private tG COT;
    private KVG HWF;
    private com.bytedance.adsdk.ugeno.component.lMd<View> KS;
    private rV QR;
    private YW YW;
    private JSONObject dT;
    private QR jU;
    private HWF ku;
    private JSONObject lMd;
    private Context zp;
    private boolean Bj = true;
    private boolean vDp = false;

    public dT(Context context) {
        this.zp = context;
    }

    public void lMd(JSONObject jSONObject) {
        KVG kvg = this.HWF;
        if (kvg != null) {
            kvg.KS();
        }
        this.lMd = jSONObject;
        zp(this.KS, jSONObject);
        zp(this.KS);
        if (this.HWF != null) {
            dQp dqp = new dQp();
            dqp.zp(0);
            dqp.zp(this.KS);
            this.HWF.zp(dqp);
        }
    }

    public com.bytedance.adsdk.ugeno.component.lMd<View> zp(JSONObject jSONObject) {
        KVG kvg = this.HWF;
        if (kvg != null) {
            kvg.zp();
        }
        HWF hwf = new HWF(jSONObject, this.lMd);
        this.ku = hwf;
        tG tGVar = this.COT;
        if (tGVar instanceof com.bytedance.adsdk.ugeno.core.zp.zp) {
            ((com.bytedance.adsdk.ugeno.core.zp.zp) tGVar).zp(hwf.lMd());
        }
        this.KS = zp(this.ku.zp(), (com.bytedance.adsdk.ugeno.component.lMd<View>) null);
        KVG kvg2 = this.HWF;
        if (kvg2 != null) {
            kvg2.lMd();
            this.KS.zp(this.HWF);
        }
        return this.KS;
    }

    public com.bytedance.adsdk.ugeno.component.lMd<View> zp(HWF.zp zpVar, com.bytedance.adsdk.ugeno.component.lMd<View> lmd) {
        List<HWF.zp> KS;
        zp.C0066zp c0066zp = null;
        if (!HWF.zp(zpVar)) {
            return null;
        }
        String KS2 = zpVar.KS();
        lMd zp = jU.zp(KS2);
        if (zp == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(KS2)));
            return null;
        }
        com.bytedance.adsdk.ugeno.component.lMd zp2 = zp.zp(this.zp);
        if (zp2 == null) {
            return null;
        }
        zp2.KS(com.bytedance.adsdk.ugeno.zp.KS.zp(zpVar.zp(), this.lMd));
        zp2.jU(KS2);
        zp2.lMd(zpVar.jU());
        zp2.zp(zpVar);
        zp2.zp(this.YW);
        if (lmd instanceof com.bytedance.adsdk.ugeno.component.zp) {
            com.bytedance.adsdk.ugeno.component.zp zpVar2 = (com.bytedance.adsdk.ugeno.component.zp) lmd;
            zp2.zp(zpVar2);
            c0066zp = zpVar2.ku();
        }
        Iterator<String> keys = zpVar.jU().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String zp3 = com.bytedance.adsdk.ugeno.zp.KS.zp(zpVar.jU().optString(next), this.lMd);
            zp2.zp(next, zp3);
            if (c0066zp != null) {
                c0066zp.zp(this.zp, next, zp3);
            }
        }
        if (zp2 instanceof com.bytedance.adsdk.ugeno.component.zp) {
            List<HWF.zp> COT = zpVar.COT();
            if (COT != null && COT.size() > 0) {
                if (TextUtils.equals(zp2.rV(), "Swiper") && COT.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                Iterator<HWF.zp> it = COT.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.component.lMd<View> zp4 = zp(it.next(), (com.bytedance.adsdk.ugeno.component.lMd<View>) zp2);
                    if (zp4 != null && zp4.woN()) {
                        ((com.bytedance.adsdk.ugeno.component.zp) zp2).zp(zp4);
                    }
                }
            } else {
                if (TextUtils.equals(zp2.rV(), "RecyclerLayout") && (KS = this.ku.KS()) != null && KS.size() > 0) {
                    Iterator<HWF.zp> it2 = KS.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.component.lMd<View> zp5 = zp(it2.next(), (com.bytedance.adsdk.ugeno.component.lMd<View>) zp2);
                        if (zp5 != null && zp5.woN()) {
                            ((com.bytedance.adsdk.ugeno.component.zp) zp2).zp(zp5);
                        }
                    }
                }
                return zp2;
            }
        }
        if (c0066zp != null) {
            zp2.zp(c0066zp.zp());
        }
        this.KS = zp2;
        return zp2;
    }

    public void zp(com.bytedance.adsdk.ugeno.component.lMd lmd, JSONObject jSONObject) {
        if (lmd == null) {
            return;
        }
        if (lmd instanceof com.bytedance.adsdk.ugeno.component.zp) {
            lmd.zp(jSONObject);
            List<com.bytedance.adsdk.ugeno.component.lMd<View>> zp = ((com.bytedance.adsdk.ugeno.component.zp) lmd).zp();
            if (zp == null || zp.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.component.lMd<View>> it = zp.iterator();
            while (it.hasNext()) {
                zp(it.next(), jSONObject);
            }
            return;
        }
        lmd.zp(jSONObject);
    }

    private void zp(com.bytedance.adsdk.ugeno.component.lMd<View> lmd) {
        List<com.bytedance.adsdk.ugeno.component.lMd<View>> zp;
        if (lmd == null) {
            return;
        }
        JSONObject Bj = lmd.Bj();
        Iterator<String> keys = Bj.keys();
        com.bytedance.adsdk.ugeno.component.zp vDp = lmd.vDp();
        zp.C0066zp ku = vDp != null ? vDp.ku() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String zp2 = com.bytedance.adsdk.ugeno.zp.KS.zp(Bj.optString(next), this.lMd);
            lmd.zp(next, zp2);
            lmd.zp(this.jU);
            lmd.zp(this.COT);
            lmd.zp(this.QR);
            if (ku != null) {
                ku.zp(this.zp, next, zp2);
            }
        }
        if ((lmd instanceof com.bytedance.adsdk.ugeno.component.zp) && (zp = ((com.bytedance.adsdk.ugeno.component.zp) lmd).zp()) != null && zp.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.component.lMd<View>> it = zp.iterator();
            while (it.hasNext()) {
                zp(it.next());
            }
        }
        if (ku != null) {
            lmd.zp(ku.zp());
        }
        lmd.lMd();
    }

    public void zp(tG tGVar) {
        com.bytedance.adsdk.ugeno.core.zp.zp zpVar = new com.bytedance.adsdk.ugeno.core.zp.zp(tGVar);
        zpVar.zp(this.dT);
        zpVar.zp(this.Bj);
        zpVar.lMd(this.vDp);
        HWF hwf = this.ku;
        if (hwf != null) {
            zpVar.zp(hwf.lMd());
        }
        this.COT = zpVar;
    }

    public void zp(rV rVVar) {
        this.QR = rVVar;
    }
}
