package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.component.reward.YFl.AlY;
import com.bytedance.sdk.openadsdk.core.Sg.YFl;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.nc;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT {
    private final com.bytedance.sdk.openadsdk.core.Sg.Sg Sg;
    private final YFl YFl;
    private final com.bytedance.sdk.openadsdk.core.Sg.wN tN;

    @DungeonFlag
    public eT(YFl yFl) {
        int i10;
        this.YFl = yFl;
        this.tN = YFl(yFl, yFl.Sg);
        Activity activity = yFl.UI;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = yFl.Sg;
        String str = yFl.wN;
        if (yFl.AlY) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        this.Sg = new com.bytedance.sdk.openadsdk.core.Sg.Sg(activity, wwa, str, i10) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.eT.1
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
            public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                try {
                    eT.this.YFl(view, f10, f11, f12, f13, sparseArray, this.Cfr, this.Ga, this.dXO);
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFReportManager", "onClickReport error :" + e2.getMessage());
                }
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(eT.this.YFl.Sg, 9);
                eT.this.YFl.VOe.mn();
            }
        };
    }

    private JSONObject NjR() {
        try {
            long rkt = this.YFl.VOe.rkt();
            int lG = this.YFl.VOe.lG();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", rkt);
                jSONObject.put("percent", lG);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private boolean qsH() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl.Sg;
        if (wwa == null || wwa.ZU() != 1) {
            return false;
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.Sg.Sg AlY() {
        return this.Sg;
    }

    public void DSW() {
        JSONObject jSONObject = new JSONObject();
        YFl(jSONObject);
        YFl yFl = this.YFl;
        com.bytedance.sdk.openadsdk.AlY.tN.wN(yFl.Sg, yFl.wN, jSONObject);
    }

    @DungeonFlag
    public void Sg() {
        boolean z10;
        com.bytedance.sdk.openadsdk.activity.vc vcVar;
        com.bytedance.sdk.openadsdk.component.reward.view.qsH qsh;
        if (this.YFl.GA.get()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.YFl.Sg.YFl() || (qsh = this.YFl.YI) == null) {
                z10 = false;
            } else {
                jSONObject.put("dynamic_show_type", qsh.NjR());
                this.YFl.YI.YFl(jSONObject);
                z10 = true;
            }
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl.Sg;
            YFl(jSONObject);
            View findViewById = this.YFl.UI.findViewById(R.id.content);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("width", findViewById.getWidth());
                jSONObject2.put("height", findViewById.getHeight());
                jSONObject2.put("alpha", findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            if (this.YFl.GA.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, this.YFl.wN, jSONObject);
                this.YFl.ZU.vc();
                wN.YFl yFl = new wN.YFl(z10 ? this.YFl.YI.NjR() : -1);
                YFl yFl2 = this.YFl;
                if (yFl2.uGS && (vcVar = yFl2.UT) != null) {
                    yFl.Sg = vcVar.NjR;
                }
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(yFl2.UI.findViewById(R.id.content), wwa, yFl);
            }
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e2);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public com.bytedance.sdk.openadsdk.core.Sg.wN tN() {
        this.tN.YFl(this.YFl.UI.findViewById(R.id.content));
        this.tN.Sg(this.YFl.mB.findViewById(520093713));
        if (this.YFl.bZ.tN() != null) {
            this.tN.YFl(this.YFl.bZ.tN());
        }
        this.YFl.UZM.YFl(this.tN);
        this.tN.YFl(new YFl.InterfaceC0116YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.eT.3
            @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl.InterfaceC0116YFl
            public long getVideoProgress() {
                return eT.this.YFl.VOe.DSW();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.nc ncVar = this.YFl.lu;
        com.bytedance.sdk.openadsdk.core.Sg.wN wNVar = this.tN;
        ncVar.YFl(wNVar, wNVar, this.Sg);
        this.YFl.GS.YFl(this.tN);
        return this.tN;
    }

    public void vc() {
        JSONObject jSONObject = new JSONObject();
        if (Ne.Wwa(this.YFl.Sg)) {
            this.YFl.UZM.YFl(jSONObject);
        }
        int i10 = 1;
        try {
            if (this.YFl.f10590nc.get()) {
                if (!this.YFl.mn.tN()) {
                    if (this.YFl.zB.AlY()) {
                        i10 = 3;
                    } else if (this.YFl.mn.AlY()) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                }
                jSONObject.put("endcard_content", i10);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        YFl yFl = this.YFl;
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(yFl.Sg, yFl.wN, "click_close", jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.Sg.wN wN() {
        return this.tN;
    }

    @DungeonFlag
    public void YFl() {
        com.bytedance.sdk.openadsdk.activity.vc vcVar;
        if (this.YFl.GA.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl.Sg;
        YFl(jSONObject);
        if (this.YFl.GA.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, this.YFl.wN, jSONObject);
            this.YFl.ZU.vc();
            wN.YFl yFl = new wN.YFl(-1);
            YFl yFl2 = this.YFl;
            if (yFl2.uGS && (vcVar = yFl2.UT) != null) {
                yFl.Sg = vcVar.NjR;
            }
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(yFl2.UI.findViewById(R.id.content), wwa, yFl);
        }
    }

    public void tN(boolean z10) {
        YFl yFl = this.YFl;
        if (yFl != null && z10 && yFl.Sg.xSx() && !this.YFl.Sg.VRF()) {
            this.YFl.Sg.DSW(true);
            YFl yFl2 = this.YFl;
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = yFl2.Sg;
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, yFl2.wN, wwa.EQ());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.activity.vc vcVar;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl.Sg;
        if ((wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) && ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).utE()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFReportManager", "reportShow json error", e2);
            }
        }
        YFl yFl = this.YFl;
        if (!yFl.uGS || (vcVar = yFl.UT) == null) {
            return;
        }
        try {
            jSONObject.put("ad_show_order", vcVar.NjR + 1);
        } catch (JSONException unused) {
        }
    }

    @DungeonFlag
    public void Sg(boolean z10) {
        YFl yFl = this.YFl;
        if (yFl == null) {
            return;
        }
        if (!z10 && yFl.GA.get() && this.YFl.f10588dd > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.YFl.f10588dd);
            YFl yFl2 = this.YFl;
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(valueOf, yFl2.Sg, yFl2.wN, yFl2.VOe.YFl());
            this.YFl.f10588dd = 0L;
        } else {
            this.YFl.f10588dd = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(this.YFl.Sg, z10 ? 4 : 8);
    }

    @DungeonFlag
    public void YFl(final Map<String, Object> map) {
        if (this.YFl.GA.get()) {
            return;
        }
        this.YFl.GA.set(true);
        final View findViewById = this.YFl.UI.findViewById(R.id.content);
        if (findViewById == null) {
            findViewById = this.YFl.UI.getWindow().getDecorView();
        }
        findViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.eT.2
            @Override // java.lang.Runnable
            public void run() {
                int i10;
                Map map2;
                JSONObject jSONObject;
                boolean z10 = false;
                if (!eT.this.YFl.pDU.compareAndSet(false, true)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.Wwa wwa = eT.this.YFl.Sg;
                JSONObject jSONObject2 = null;
                try {
                    if (map != null) {
                        jSONObject = new JSONObject(map);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    jSONObject2 = jSONObject;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", findViewById.getWidth());
                    jSONObject3.put("height", findViewById.getHeight());
                    jSONObject3.put("alpha", findViewById.getAlpha());
                    jSONObject2.put("root_view", jSONObject3.toString());
                    eT.this.YFl(jSONObject2);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFReportManager", "run: ", th2);
                }
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, eT.this.YFl.wN, jSONObject2);
                eT.this.YFl.ZU.vc();
                if (eT.this.YFl.YI != null && (map2 = map) != null && map2.containsKey("dynamic_show_type")) {
                    z10 = true;
                }
                if (z10) {
                    i10 = eT.this.YFl.YI.NjR();
                } else {
                    i10 = -1;
                }
                wN.YFl yFl = new wN.YFl(i10);
                if (eT.this.YFl.uGS && eT.this.YFl.UT != null) {
                    yFl.Sg = eT.this.YFl.UT.NjR;
                }
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(eT.this.YFl.UI.findViewById(R.id.content), wwa, yFl);
            }
        });
    }

    public void YFl(boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl.Sg;
        if (wwa == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.pDU.YFl.AlY wN = com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl(z10 ? 7 : 8).tN(String.valueOf(wwa.kU())).wN(this.YFl.Sg.ivp());
        wN.Sg(this.YFl.mn.VOe()).vc(this.YFl.mn.bZ());
        wN.DSW(this.YFl.Sg.uGS()).AlY(this.YFl.Sg.zz());
        com.bytedance.sdk.openadsdk.pDU.tN.YFl().Sg(wN);
    }

    private void Sg(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, int i10, int i11, int i12) {
        if (!qsH() || this.YFl.Sg == null || view == null) {
            return;
        }
        int id2 = view.getId();
        if (id2 == com.bytedance.sdk.openadsdk.utils.GA.wN || id2 == com.bytedance.sdk.openadsdk.utils.GA.AlY || id2 == com.bytedance.sdk.openadsdk.utils.GA.tN || id2 == com.bytedance.sdk.openadsdk.utils.GA.Sg || id2 == com.bytedance.sdk.openadsdk.utils.GA.YoT || id2 == com.bytedance.sdk.openadsdk.utils.GA.jz || id2 == com.bytedance.sdk.openadsdk.utils.GA.lG || id2 == 520093705 || id2 == com.bytedance.sdk.openadsdk.utils.GA.eT || id2 == 520093707 || id2 == com.bytedance.sdk.openadsdk.utils.GA.DSW) {
            int DSW = GS.DSW(com.bytedance.sdk.openadsdk.core.lG.YFl());
            com.bytedance.sdk.openadsdk.core.model.nc YFl = new nc.YFl().vc(f10).wN(f11).AlY(f12).tN(f13).Sg(System.currentTimeMillis()).YFl(0L).Sg(GS.YFl(this.YFl.lu.eT())).YFl(GS.YFl((View) null)).tN(GS.tN(this.YFl.lu.eT())).AlY(GS.tN((View) null)).AlY(i11).wN(i12).vc(i10).YFl(sparseArray).Sg(com.bytedance.sdk.openadsdk.core.NjR.Sg().YFl() ? 1 : 2).tN(DSW).YFl(GS.wN(com.bytedance.sdk.openadsdk.core.lG.YFl())).Sg(GS.vc(com.bytedance.sdk.openadsdk.core.lG.YFl())).YFl();
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(this.YFl.VOe.DSW()));
            YFl yFl = this.YFl;
            com.bytedance.sdk.openadsdk.AlY.tN.YFl("click_other", yFl.Sg, YFl, yFl.wN, true, (Map<String, Object>) hashMap, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DungeonFlag
    public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, int i10, int i11, int i12) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.GA.wN) {
            YFl("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.GA.AlY && view.getId() != com.bytedance.sdk.openadsdk.utils.GA.DSW) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.GA.tN) {
                YFl("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.GA.Sg) {
                YFl("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.GA.YoT && view.getId() != com.bytedance.sdk.openadsdk.utils.GA.jz && view.getId() != com.bytedance.sdk.openadsdk.utils.GA.lG) {
                if (view.getId() == 520093705) {
                    YFl("click_start_play", NjR());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.GA.eT) {
                    YFl("click_video", NjR());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.GA.qsH) {
                    YFl("fallback_endcard_click", NjR());
                }
            } else {
                YFl("click_start_play_bar", NjR());
            }
        } else {
            YFl("click_play_star_nums", (JSONObject) null);
        }
        Sg(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str, JSONObject jSONObject) {
        YFl yFl = this.YFl;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = yFl.Sg;
        String str2 = yFl.wN;
        if (!yFl.AlY) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.Sg.wN YFl(final YFl yFl, final com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        return new com.bytedance.sdk.openadsdk.core.Sg.wN(yFl.UI, wwa, yFl.wN, yFl.AlY ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.eT.4
            @Override // com.bytedance.sdk.openadsdk.core.Sg.wN
            public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, int i10, int i11, int i12, boolean z10) {
                if (wwa.yn() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        YFl((String) tag);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("duration", Long.valueOf(yFl.VOe.DSW()));
                if (yFl.f10590nc.get()) {
                    hashMap.put("click_scence", 2);
                } else if (Ne.Wwa(wwa)) {
                    hashMap.put("click_scence", 3);
                } else {
                    hashMap.put("click_scence", 1);
                }
                YFl(hashMap);
                yFl.ZU.c_();
                if (view.getId() == com.bytedance.sdk.openadsdk.utils.GA.cC && Ne.Wwa(wwa)) {
                    JSONObject jSONObject = new JSONObject();
                    if (wwa.BPI() != null) {
                        try {
                            jSONObject.put("playable_url", wwa.BPI().f23463h);
                        } catch (JSONException e2) {
                            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFReportManager", "onRewardBarClick json error", e2);
                        }
                    }
                    com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, yFl.wN, "click_playable_download_button_loading", jSONObject);
                }
                yFl.bZ.YFl(view, f10, f11, f12, f13, sparseArray, i10, i11, i12, new AlY.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.eT.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.AlY.YFl
                    public void YFl(String str, JSONObject jSONObject2) {
                        eT.this.YFl(str, jSONObject2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.AlY.YFl
                    public void YFl(View view2, float f14, float f15, float f16, float f17, SparseArray<tN.YFl> sparseArray2, int i13, int i14, int i15) {
                        eT.this.YFl(view2, f14, f15, f16, f17, sparseArray2, i13, i14, i15);
                    }
                });
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(wwa, 9);
                yFl.VOe.mn();
            }
        };
    }
}
