package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.Sg.YFl;
import com.bytedance.adsdk.ugeno.core.wN;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NjR {
    private vc AlY;
    private GA DSW;
    private String NjR;
    private JSONObject Sg;
    private Context YFl;
    private JSONObject eT;

    /* renamed from: nc, reason: collision with root package name */
    private qsH f10267nc;
    private wN qsH;
    private com.bytedance.adsdk.ugeno.Sg.Sg<View> tN;

    /* renamed from: vc, reason: collision with root package name */
    private EH f10268vc;
    private YoT wN;
    private boolean YoT = true;
    private boolean GA = false;

    public NjR(Context context) {
        this.YFl = context;
    }

    public com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg(wN.YFl yFl, com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2) {
        List<wN.YFl> tN;
        YFl.C0064YFl c0064YFl = null;
        if (!wN.YFl(yFl)) {
            return null;
        }
        String tN2 = yFl.tN();
        Sg YFl = AlY.YFl(tN2);
        if (YFl == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(tN2)));
            return null;
        }
        com.bytedance.adsdk.ugeno.Sg.Sg YFl2 = YFl.YFl(this.YFl);
        if (YFl2 == null) {
            return null;
        }
        YFl2.tN(com.bytedance.adsdk.ugeno.tN.Sg.YFl(yFl.YFl(), this.Sg));
        YFl2.AlY(tN2);
        YFl2.Sg(yFl.AlY());
        YFl2.YFl(yFl);
        YFl2.YFl(this.f10267nc);
        if (sg2 instanceof com.bytedance.adsdk.ugeno.Sg.YFl) {
            com.bytedance.adsdk.ugeno.Sg.YFl yFl2 = (com.bytedance.adsdk.ugeno.Sg.YFl) sg2;
            YFl2.YFl(yFl2);
            c0064YFl = yFl2.tN();
        }
        Iterator<String> keys = yFl.AlY().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String YFl3 = com.bytedance.adsdk.ugeno.tN.Sg.YFl(yFl.AlY().optString(next), this.Sg);
            YFl2.YFl(next, YFl3);
            if (c0064YFl != null) {
                c0064YFl.YFl(this.YFl, next, YFl3);
            }
        }
        if (YFl2 instanceof com.bytedance.adsdk.ugeno.Sg.YFl) {
            List<wN.YFl> wN = yFl.wN();
            if (wN != null && wN.size() > 0) {
                if (TextUtils.equals(YFl2.hQ(), "Swiper") && wN.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                Iterator<wN.YFl> it = wN.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg = Sg(it.next(), YFl2);
                    if (Sg != null && Sg.zB()) {
                        ((com.bytedance.adsdk.ugeno.Sg.YFl) YFl2).YFl(Sg);
                    }
                }
            } else {
                if (TextUtils.equals(YFl2.hQ(), "RecyclerLayout") && (tN = this.qsH.tN()) != null && tN.size() > 0) {
                    Iterator<wN.YFl> it2 = tN.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg2 = Sg(it2.next(), YFl2);
                        if (Sg2 != null && Sg2.zB()) {
                            ((com.bytedance.adsdk.ugeno.Sg.YFl) YFl2).YFl(Sg2);
                        }
                    }
                }
                return YFl2;
            }
        }
        if (c0064YFl != null) {
            YFl2.YFl(c0064YFl.YFl());
        }
        this.tN = YFl2;
        return YFl2;
    }

    public void YFl(String str, qsH qsh) {
        this.f10267nc = qsh;
        this.NjR = str;
        if (qsh != null) {
            this.Sg = qsh.YFl();
        }
    }

    public com.bytedance.adsdk.ugeno.Sg.Sg<View> YFl(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.Sg = jSONObject2;
        EH eh2 = this.f10268vc;
        if (eh2 != null) {
            eh2.YFl();
        }
        wN wNVar = new wN(jSONObject, jSONObject2, jSONObject3);
        this.qsH = wNVar;
        YoT yoT = this.wN;
        if (yoT instanceof com.bytedance.adsdk.ugeno.core.YFl.YFl) {
            ((com.bytedance.adsdk.ugeno.core.YFl.YFl) yoT).YFl(wNVar.Sg());
        }
        this.tN = YFl(this.qsH.YFl(), (com.bytedance.adsdk.ugeno.Sg.Sg<View>) null);
        EH eh3 = this.f10268vc;
        if (eh3 != null) {
            eh3.Sg();
            this.tN.YFl(this.f10268vc);
        }
        YFl(this.tN);
        return this.tN;
    }

    public com.bytedance.adsdk.ugeno.Sg.Sg<View> YFl(wN.YFl yFl, com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2) {
        List<wN.YFl> tN;
        YFl.C0064YFl c0064YFl = null;
        if (!wN.YFl(yFl)) {
            return null;
        }
        String tN2 = yFl.tN();
        Sg YFl = AlY.YFl(tN2);
        if (YFl == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(tN2)));
            return null;
        }
        com.bytedance.adsdk.ugeno.Sg.Sg YFl2 = YFl.YFl(this.YFl);
        if (YFl2 == null) {
            return null;
        }
        JSONObject AlY = yFl.AlY();
        YFl2.tN(com.bytedance.adsdk.ugeno.tN.Sg.YFl(yFl.YFl(), this.Sg));
        YFl2.AlY(tN2);
        YFl2.Sg(AlY);
        YFl2.YFl(yFl);
        YFl2.YFl(this.qsH.AlY());
        YFl2.YFl(this.f10267nc);
        Iterator<String> keys = AlY.keys();
        if (sg2 instanceof com.bytedance.adsdk.ugeno.Sg.YFl) {
            com.bytedance.adsdk.ugeno.Sg.YFl yFl2 = (com.bytedance.adsdk.ugeno.Sg.YFl) sg2;
            c0064YFl = yFl2.tN();
            YFl2.YFl(yFl2);
        }
        while (keys.hasNext()) {
            String next = keys.next();
            String YFl3 = com.bytedance.adsdk.ugeno.tN.Sg.YFl(AlY.optString(next), this.Sg);
            YFl2.YFl(next, YFl3);
            if (c0064YFl != null) {
                c0064YFl.YFl(this.YFl, next, YFl3);
            }
        }
        if (c0064YFl != null) {
            YFl2.YFl(c0064YFl.YFl());
        }
        if (YFl2 instanceof com.bytedance.adsdk.ugeno.Sg.YFl) {
            List<wN.YFl> wN = yFl.wN();
            if (wN != null && wN.size() > 0) {
                if (TextUtils.equals(YFl2.hQ(), "Swiper") && wN.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                Iterator<wN.YFl> it = wN.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.Sg.Sg<View> YFl4 = YFl(it.next(), (com.bytedance.adsdk.ugeno.Sg.Sg<View>) YFl2);
                    if (YFl4 != null && YFl4.zB()) {
                        ((com.bytedance.adsdk.ugeno.Sg.YFl) YFl2).YFl(YFl4, YFl4.UZM());
                    }
                }
            } else {
                if (TextUtils.equals(YFl2.hQ(), "RecyclerLayout") && (tN = this.qsH.tN()) != null && tN.size() > 0) {
                    Iterator<wN.YFl> it2 = tN.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.Sg.Sg<View> YFl5 = YFl(it2.next(), (com.bytedance.adsdk.ugeno.Sg.Sg<View>) YFl2);
                        if (YFl5 != null && YFl5.zB()) {
                            ((com.bytedance.adsdk.ugeno.Sg.YFl) YFl2).YFl(YFl5);
                        }
                    }
                }
                return YFl2;
            }
        }
        this.tN = YFl2;
        return YFl2;
    }

    public void Sg(JSONObject jSONObject) {
        EH eh2 = this.f10268vc;
        if (eh2 != null) {
            eh2.tN();
        }
        this.Sg = jSONObject;
        YFl(this.tN, jSONObject);
        YFl(this.tN);
        if (this.f10268vc != null) {
            pDU pdu = new pDU();
            pdu.YFl(0);
            pdu.YFl(this.tN);
            this.f10268vc.YFl(pdu);
        }
    }

    public com.bytedance.adsdk.ugeno.Sg.Sg<View> YFl(JSONObject jSONObject) {
        EH eh2 = this.f10268vc;
        if (eh2 != null) {
            eh2.YFl();
        }
        wN wNVar = new wN(jSONObject, this.Sg);
        this.qsH = wNVar;
        YoT yoT = this.wN;
        if (yoT instanceof com.bytedance.adsdk.ugeno.core.YFl.YFl) {
            ((com.bytedance.adsdk.ugeno.core.YFl.YFl) yoT).YFl(wNVar.Sg());
        }
        this.tN = Sg(this.qsH.YFl(), null);
        EH eh3 = this.f10268vc;
        if (eh3 != null) {
            eh3.Sg();
            this.tN.YFl(this.f10268vc);
        }
        return this.tN;
    }

    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, JSONObject jSONObject) {
        if (sg2 == null) {
            return;
        }
        if (sg2 instanceof com.bytedance.adsdk.ugeno.Sg.YFl) {
            sg2.YFl(jSONObject);
            List<com.bytedance.adsdk.ugeno.Sg.Sg<View>> YFl = ((com.bytedance.adsdk.ugeno.Sg.YFl) sg2).YFl();
            if (YFl == null || YFl.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.Sg.Sg<View>> it = YFl.iterator();
            while (it.hasNext()) {
                YFl(it.next(), jSONObject);
            }
            return;
        }
        sg2.YFl(jSONObject);
    }

    private void YFl(com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2) {
        List<com.bytedance.adsdk.ugeno.Sg.Sg<View>> YFl;
        if (sg2 == null) {
            return;
        }
        JSONObject Ne = sg2.Ne();
        Iterator<String> keys = Ne.keys();
        com.bytedance.adsdk.ugeno.Sg.YFl dXO = sg2.dXO();
        YFl.C0064YFl tN = dXO != null ? dXO.tN() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String YFl2 = com.bytedance.adsdk.ugeno.tN.Sg.YFl(Ne.optString(next), this.Sg);
            sg2.YFl(next, YFl2);
            if (tN != null) {
                tN.YFl(this.YFl, next, YFl2);
            }
        }
        sg2.YFl(this.AlY);
        sg2.YFl(this.wN);
        sg2.YFl(this.DSW);
        if ((sg2 instanceof com.bytedance.adsdk.ugeno.Sg.YFl) && (YFl = ((com.bytedance.adsdk.ugeno.Sg.YFl) sg2).YFl()) != null && YFl.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.Sg.Sg<View>> it = YFl.iterator();
            while (it.hasNext()) {
                YFl(it.next());
            }
        }
        if (tN != null) {
            sg2.YFl(tN.YFl());
        }
        sg2.Sg();
    }

    public void YFl(YoT yoT) {
        com.bytedance.adsdk.ugeno.core.YFl.YFl yFl = new com.bytedance.adsdk.ugeno.core.YFl.YFl(yoT);
        yFl.YFl(this.eT);
        yFl.YFl(this.YoT);
        yFl.Sg(this.GA);
        wN wNVar = this.qsH;
        if (wNVar != null) {
            yFl.YFl(wNVar.Sg());
        }
        this.wN = yFl;
    }

    public void YFl(GA ga2) {
        this.DSW = ga2;
    }
}
