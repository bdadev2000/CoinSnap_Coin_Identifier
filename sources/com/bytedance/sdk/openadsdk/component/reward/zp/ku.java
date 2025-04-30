package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.R;
import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.zp.jU;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.YW;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.vwr;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku {
    private final com.bytedance.sdk.openadsdk.core.lMd.COT KS;
    private final View.OnClickListener lMd;
    private final zp zp;

    @DungeonFlag
    public ku(zp zpVar) {
        int i9;
        int i10;
        this.zp = zpVar;
        TTBaseVideoActivity tTBaseVideoActivity = zpVar.oB;
        woN won = zpVar.zp;
        String str = zpVar.QR;
        if (zpVar.HWF) {
            i9 = 7;
        } else {
            i9 = 5;
        }
        this.KS = new com.bytedance.sdk.openadsdk.core.lMd.COT(tTBaseVideoActivity, won, str, i9) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.ku.1
            @Override // com.bytedance.sdk.openadsdk.core.lMd.COT
            public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, int i11, int i12, int i13, boolean z8) {
                if (ku.this.zp.zp.Fm() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        zp((String) tag);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("duration", Long.valueOf(ku.this.zp.UPs.QR()));
                if (ku.this.zp.FP.get()) {
                    hashMap.put("click_scence", 2);
                } else if (cz.Bj(ku.this.zp.zp)) {
                    hashMap.put("click_scence", 3);
                } else {
                    hashMap.put("click_scence", 1);
                }
                zp(hashMap);
                ku.this.zp.oB.vwr();
                if (view.getId() == com.bytedance.sdk.openadsdk.utils.vDp.ea && cz.Bj(ku.this.zp.zp)) {
                    JSONObject jSONObject = new JSONObject();
                    if (ku.this.zp.zp.eWG() != null) {
                        try {
                            jSONObject.put("playable_url", ku.this.zp.zp.eWG().vDp());
                        } catch (JSONException e4) {
                            com.bytedance.sdk.component.utils.tG.zp("TTAD.RFReportManager", "onRewardBarClick json error", e4);
                        }
                    }
                    com.bytedance.sdk.openadsdk.lMd.KS.lMd(ku.this.zp.zp, ku.this.zp.QR, "click_playable_download_button_loading", jSONObject);
                }
                ku.this.zp.fRl.zp(view, f9, f10, f11, f12, sparseArray, i11, i12, i13, new jU.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.ku.1.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.zp.jU.zp
                    public void zp(String str2, JSONObject jSONObject2) {
                        ku.this.zp(str2, jSONObject2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.zp.jU.zp
                    public void zp(View view2, float f13, float f14, float f15, float f16, SparseArray<KS.zp> sparseArray2, int i14, int i15, int i16) {
                        ku.this.zp(view2, f13, f14, f15, f16, sparseArray2, i14, i15, i16);
                    }
                });
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(ku.this.zp.zp, 9);
            }
        };
        TTBaseVideoActivity tTBaseVideoActivity2 = zpVar.oB;
        woN won2 = zpVar.zp;
        String str2 = zpVar.QR;
        if (zpVar.HWF) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        this.lMd = new com.bytedance.sdk.openadsdk.core.lMd.lMd(tTBaseVideoActivity2, won2, str2, i10) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.ku.2
            @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
            public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
                try {
                    ku.this.zp(view, f9, f10, f11, f12, sparseArray, this.irS, this.Lij, this.Gzh);
                } catch (Exception e4) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.RFReportManager", "onClickReport error :" + e4.getMessage());
                }
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(ku.this.zp.zp, 9);
            }
        };
    }

    private JSONObject YW() {
        try {
            long KVG = this.zp.UPs.KVG();
            int woN = this.zp.UPs.woN();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", KVG);
                jSONObject.put("percent", woN);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private boolean ku() {
        woN won = this.zp.zp;
        if (won == null || won.ffE() != 1) {
            return false;
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.lMd.COT COT() {
        return this.KS;
    }

    public void HWF() {
        JSONObject jSONObject = new JSONObject();
        if (cz.Bj(this.zp.zp)) {
            this.zp.ffE.zp(jSONObject);
        }
        int i9 = 1;
        try {
            if (this.zp.FP.get()) {
                if (!this.zp.si.KS()) {
                    if (this.zp.si.jU()) {
                        i9 = 2;
                    } else {
                        i9 = 0;
                    }
                }
                jSONObject.put("endcard_content", i9);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        zp zpVar = this.zp;
        com.bytedance.sdk.openadsdk.lMd.KS.lMd(zpVar.zp, zpVar.oB.zp, "click_close", jSONObject);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public com.bytedance.sdk.openadsdk.core.lMd.COT KS() {
        this.KS.zp(this.zp.oB.findViewById(R.id.content));
        this.KS.lMd(this.zp.oB.findViewById(520093713));
        if (this.zp.fRl.KS() != null) {
            this.KS.zp(this.zp.fRl.KS());
        }
        this.zp.ffE.zp(this.KS);
        this.KS.zp(new zp.InterfaceC0109zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.ku.4
            @Override // com.bytedance.sdk.openadsdk.core.lMd.zp.InterfaceC0109zp
            public long getVideoProgress() {
                return ku.this.zp.UPs.QR();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.COT cot = this.zp.rCC;
        com.bytedance.sdk.openadsdk.core.lMd.COT cot2 = this.KS;
        cot.zp(cot2, cot2, this.lMd);
        this.zp.gH.zp(this.KS);
        return this.KS;
    }

    public void QR() {
        JSONObject jSONObject = new JSONObject();
        woN won = this.zp.zp;
        if ((won instanceof vwr) && ((vwr) won).HI()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.RFReportManager", "reportShow json error", e4);
            }
        }
        com.bytedance.sdk.openadsdk.lMd.KS.KS(won, this.zp.QR, jSONObject);
    }

    public View.OnClickListener jU() {
        return this.lMd;
    }

    @DungeonFlag
    public void lMd() {
        boolean z8;
        com.bytedance.sdk.openadsdk.component.reward.view.KS ks;
        if (this.zp.ox.get()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.zp.oB.KVG() || (ks = this.zp.eWG) == null) {
                z8 = false;
            } else {
                jSONObject.put("dynamic_show_type", ks.YW());
                this.zp.eWG.zp(jSONObject);
                z8 = true;
            }
            woN won = this.zp.zp;
            if ((won instanceof vwr) && ((vwr) won).HI()) {
                jSONObject.put("choose_one_ad_real_show", true);
            }
            View findViewById = this.zp.oB.findViewById(R.id.content);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("width", findViewById.getWidth());
                jSONObject2.put("height", findViewById.getHeight());
                jSONObject2.put("alpha", findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            if (this.zp.ox.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.lMd.KS.zp(won, this.zp.QR, jSONObject);
                TTBaseVideoActivity tTBaseVideoActivity = this.zp.oB;
                if (tTBaseVideoActivity instanceof com.bytedance.sdk.openadsdk.core.video.KS.lMd) {
                    tTBaseVideoActivity.QR();
                }
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this.zp.oB.findViewById(R.id.content), won, z8 ? this.zp.eWG.YW() : -1);
            }
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e4);
        }
    }

    @DungeonFlag
    public void zp() {
        if (this.zp.ox.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        woN won = this.zp.zp;
        if ((won instanceof vwr) && ((vwr) won).HI()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.RFReportManager", "reportShow json error", e4);
            }
        }
        if (this.zp.ox.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, this.zp.QR, jSONObject);
            TTBaseVideoActivity tTBaseVideoActivity = this.zp.oB;
            if (tTBaseVideoActivity instanceof com.bytedance.sdk.openadsdk.core.video.KS.lMd) {
                tTBaseVideoActivity.QR();
            }
            com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this.zp.oB.findViewById(R.id.content), won, -1);
        }
    }

    public void KS(boolean z8) {
        zp zpVar = this.zp;
        if (zpVar != null && z8 && zpVar.zp.IhO() && !this.zp.zp.Oza()) {
            this.zp.zp.QR(true);
            zp zpVar2 = this.zp;
            woN won = zpVar2.zp;
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, zpVar2.QR, won.ITK());
        }
    }

    @DungeonFlag
    public void zp(final Map<String, Object> map) {
        if (this.zp.ox.get()) {
            return;
        }
        this.zp.ox.set(true);
        final View findViewById = this.zp.oB.findViewById(R.id.content);
        if (findViewById == null) {
            findViewById = this.zp.oB.getWindow().getDecorView();
        }
        findViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.ku.3
            @Override // java.lang.Runnable
            public void run() {
                int i9;
                Map map2;
                JSONObject jSONObject;
                boolean z8 = false;
                if (!ku.this.zp.RCv.compareAndSet(false, true)) {
                    return;
                }
                woN won = ku.this.zp.zp;
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
                    if ((won instanceof vwr) && ((vwr) won).HI()) {
                        jSONObject2.put("choose_one_ad_real_show", true);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.RFReportManager", "run: ", th);
                }
                com.bytedance.sdk.openadsdk.lMd.KS.zp(won, ku.this.zp.QR, jSONObject2);
                if (ku.this.zp.oB instanceof com.bytedance.sdk.openadsdk.core.video.KS.lMd) {
                    ku.this.zp.oB.QR();
                }
                if (ku.this.zp.eWG != null && (map2 = map) != null && map2.containsKey("dynamic_show_type")) {
                    z8 = true;
                }
                View findViewById2 = ku.this.zp.oB.findViewById(R.id.content);
                if (z8) {
                    i9 = ku.this.zp.eWG.YW();
                } else {
                    i9 = -1;
                }
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(findViewById2, won, i9);
            }
        });
    }

    public void zp(boolean z8) {
        woN won = this.zp.zp;
        if (won == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dT.zp.KS COT = com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp(z8 ? 7 : 8).KS(String.valueOf(won.FGx())).COT(this.zp.zp.Gor());
        COT.lMd(this.zp.si.cz()).HWF(this.zp.si.FP());
        COT.QR(this.zp.zp.GP()).jU(this.zp.zp.fgJ());
        com.bytedance.sdk.openadsdk.dT.KS.zp().lMd(COT);
    }

    @DungeonFlag
    public void lMd(boolean z8) {
        zp zpVar = this.zp;
        if (zpVar == null) {
            return;
        }
        if (!z8 && zpVar.ox.get() && this.zp.vwr > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.zp.vwr);
            zp zpVar2 = this.zp;
            com.bytedance.sdk.openadsdk.lMd.KS.zp(valueOf, zpVar2.zp, zpVar2.oB.zp, zpVar2.UPs.zp());
            this.zp.vwr = 0L;
        } else {
            this.zp.vwr = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this.zp.zp, z8 ? 4 : 8);
    }

    private void lMd(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, int i9, int i10, int i11) {
        if (!ku() || this.zp.zp == null || view == null) {
            return;
        }
        int id = view.getId();
        if (id == com.bytedance.sdk.openadsdk.utils.vDp.COT || id == com.bytedance.sdk.openadsdk.utils.vDp.jU || id == com.bytedance.sdk.openadsdk.utils.vDp.KS || id == com.bytedance.sdk.openadsdk.utils.vDp.lMd || id == com.bytedance.sdk.openadsdk.utils.vDp.vDp || id == com.bytedance.sdk.openadsdk.utils.vDp.eyb || id == com.bytedance.sdk.openadsdk.utils.vDp.woN || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.vDp.Bj || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.vDp.QR) {
            int QR = WNy.QR(KVG.zp());
            com.bytedance.sdk.openadsdk.core.model.YW zp = new YW.zp().HWF(f9).COT(f10).jU(f11).KS(f12).lMd(System.currentTimeMillis()).zp(0L).lMd(WNy.zp(this.zp.rCC.Bj())).zp(WNy.zp((View) null)).KS(WNy.KS(this.zp.rCC.Bj())).jU(WNy.KS((View) null)).jU(i10).COT(i11).HWF(i9).zp(sparseArray).lMd(com.bytedance.sdk.openadsdk.core.ku.lMd().zp() ? 1 : 2).KS(QR).zp(WNy.COT(KVG.zp())).lMd(WNy.HWF(KVG.zp())).zp();
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(this.zp.UPs.QR()));
            zp zpVar = this.zp;
            com.bytedance.sdk.openadsdk.lMd.KS.zp("click_other", zpVar.zp, zp, zpVar.QR, true, (Map<String, Object>) hashMap, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DungeonFlag
    public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, int i9, int i10, int i11) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.vDp.COT) {
            zp("click_play_star_level", null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.vDp.jU && view.getId() != com.bytedance.sdk.openadsdk.utils.vDp.QR) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.vDp.KS) {
                zp("click_play_source", null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.vDp.lMd) {
                zp("click_play_logo", null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.vDp.vDp && view.getId() != com.bytedance.sdk.openadsdk.utils.vDp.eyb && view.getId() != com.bytedance.sdk.openadsdk.utils.vDp.woN) {
                if (view.getId() == 520093705) {
                    zp("click_start_play", YW());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.vDp.Bj) {
                    zp("click_video", YW());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.vDp.ku) {
                    zp("fallback_endcard_click", YW());
                }
            } else {
                zp("click_start_play_bar", YW());
            }
        } else {
            zp("click_play_star_nums", null);
        }
        lMd(view, f9, f10, f11, f12, sparseArray, i9, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str, JSONObject jSONObject) {
        zp zpVar = this.zp;
        woN won = zpVar.zp;
        String str2 = zpVar.QR;
        if (!zpVar.HWF) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str2, str, jSONObject);
    }
}
