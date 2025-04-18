package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.Sg;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.qsH;
import com.bytedance.sdk.openadsdk.core.aIu;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.core.widget.Sg;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.eT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import l5.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN extends YFl {
    private static String EH;
    private static String GA;
    private static String lG;
    private static String pDU;
    private static String rkt;
    int DSW;
    private String Wwa;
    private int aIu;
    private String qO;

    /* renamed from: vc, reason: collision with root package name */
    protected int f10553vc;
    protected int wN;

    public wN(Sg sg2, Wwa wwa, int i10) {
        super(sg2, wwa, i10);
        this.aIu = -1;
    }

    private JSONObject Cfr() {
        JSONObject jSONObject = new JSONObject();
        int aIu = (int) this.tN.VOe.aIu();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.tN.Sg.aIu());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.tN.Sg.wXo());
            jSONObject.put("network", EH.tN(this.tN.BPI));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int GS = this.tN.Sg.GS();
            String str = "unKnow";
            if (GS == 2) {
                str = Sco.Sg();
            } else if (GS == 1) {
                str = Sco.tN();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.tN.Sg.JB());
            jSONObject.put("media_extra", this.qO);
            jSONObject.put("video_duration", this.tN.Sg.BPI().f23459d);
            jSONObject.put("play_start_ts", this.f10553vc);
            jSONObject.put("play_end_ts", this.wN);
            jSONObject.put("duration", aIu);
            jSONObject.put("user_id", this.Wwa);
            jSONObject.put("trans_id", Ne.YFl().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            YoT.YFl("TTAD.RewardAdScene", "", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0076, code lost:
    
        if (r3.tN.rkt.get() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void hQ() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH$YFl r0 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH$YFl
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            long r1 = r1.DSW()
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            long r1 = r1.qO()
            r0.tN(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            long r1 = r1.eT()
            r0.Sg(r1)
            r1 = 3
            r0.tN(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            int r1 = r1.Wwa()
            r0.AlY(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            n5.a r1 = r1.tN()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r2 = r3.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r2 = r2.VOe
            com.bytedance.sdk.openadsdk.AlY.DSW r2 = r2.YFl()
            com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.tN
            int r0 = r0.f10591vc
            com.bytedance.sdk.openadsdk.core.VOe.tN(r0)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r0 = r0.VOe
            java.lang.String r1 = "skip"
            r2 = 0
            r0.YFl(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.tN
            boolean r0 = r0.tN
            if (r0 == 0) goto L78
            r0 = 1
            r1 = 4
            r3.YFl(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.tN
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.rkt.YFl(r0)
            if (r0 == 0) goto L7b
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.tN
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.rkt
            boolean r0 = r0.get()
            if (r0 != 0) goto L7b
        L78:
            r3.UZM()
        L7b:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.tN
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            com.bytedance.sdk.openadsdk.core.YoT.YFl r0 = r0.Af()
            if (r0 == 0) goto L97
            com.bytedance.sdk.openadsdk.core.YoT.AlY r0 = r0.YFl()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            long r1 = r1.DSW()
            r0.vc(r1)
            r0.wN(r1)
        L97:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.tN
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            r1 = 5
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.wN.hQ():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl
    public void DSW() {
        Ga();
        if (this.qsH.YFl()) {
            this.tN.YI.nc();
        }
    }

    public void Ne() {
        if (!VOe().NjR().getBoolean("reward_verify", false) && !VOe().GA()) {
            VOe().NjR().putBoolean("reward_verify", true);
            if (lG.AlY().rkt(String.valueOf(this.tN.f10591vc))) {
                YFl(true, this.tN.Sg.wXo(), this.tN.Sg.aIu(), 0, "");
            } else {
                lG.tN().YFl(Cfr(), new qO.Sg() { // from class: com.bytedance.sdk.openadsdk.activity.wN.6
                    @Override // com.bytedance.sdk.openadsdk.core.qO.Sg
                    public void YFl(int i10, String str) {
                        wN.this.YFl(false, 0, "", i10, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.qO.Sg
                    public void YFl(aIu.Sg sg2) {
                        boolean z10 = sg2.Sg;
                        wN.this.YFl(sg2.Sg, sg2.tN.YFl(), sg2.tN.Sg(), 0, "");
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl
    public void Sg() {
        this.tN.Sco.YFl(null, TTAdDislikeToast.getSkipText());
        this.tN.Sco.wN(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YoT() {
        Ne();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public boolean a_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public String b_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void c_() {
        dXO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (((1.0d - (r8.DSW / r8.tN.VOe.dXO())) * 100.0d) >= r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        r2 = true;
     */
    @Override // com.bytedance.sdk.openadsdk.activity.YFl, com.bytedance.sdk.openadsdk.activity.vc, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void pDU() {
        /*
            r8 = this;
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r8.qsH
            boolean r0 = r0.TMt()
            if (r0 != 0) goto L9
            return
        L9:
            com.bytedance.sdk.openadsdk.core.settings.vc r0 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.tN
            int r1 = r1.f10591vc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.settings.Sg r0 = r0.Ga(r1)
            int r0 = r0.f10745vc
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.tN
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r1.Sg
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.Ne.qO(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L40
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            double r4 = r1.dXO()
            int r1 = r8.DSW
            double r6 = (double) r1
            double r6 = r6 / r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            double r0 = (double) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L91
        L3e:
            r2 = r3
            goto L91
        L40:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.tN
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r1.Sg
            int r1 = r1.VJb()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r4 = r8.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.qsH r4 = r4.UZM
            float r4 = r4.Sg()
            float r1 = (float) r1
            float r4 = r4 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r4
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L5f
            r0 = r3
            goto L60
        L5f:
            r0 = r2
        L60:
            com.bytedance.sdk.openadsdk.core.settings.vc r1 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r4 = r8.tN
            int r4 = r4.f10591vc
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.YFl(r4)
            if (r1 != 0) goto L8e
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa r1 = r1.mn
            com.bytedance.sdk.openadsdk.core.hQ r1 = r1.YoT()
            boolean r1 = r1.wN()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r4 = r8.tN
            com.bytedance.sdk.openadsdk.component.reward.YFl.qsH r4 = r4.UZM
            boolean r4 = r4.tN()
            if (r4 == 0) goto L89
            r1 = r3
        L89:
            if (r0 == 0) goto L91
            if (r1 == 0) goto L91
            goto L3e
        L8e:
            if (r1 != r3) goto L91
            r2 = r0
        L91:
            if (r2 == 0) goto L96
            r8.Ne()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.wN.pDU():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl
    public void tN() {
        final View nc2 = this.tN.lu.nc();
        if (nc2 != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.wN.1
                /* JADX WARN: Removed duplicated region for block: B:21:0x00d8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instructions count: 268
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.wN.AnonymousClass1.onClick(android.view.View):void");
                }
            };
            nc2.setOnClickListener(onClickListener);
            nc2.setTag(nc2.getId(), onClickListener);
        }
        this.tN.Sco.YFl(new com.bytedance.sdk.openadsdk.component.reward.top.Sg() { // from class: com.bytedance.sdk.openadsdk.activity.wN.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void AlY(View view) {
                View view2 = nc2;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void Sg(View view) {
                com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = wN.this.Sg;
                if (sg2 != null && sg2.AlY() != null) {
                    wN.this.Sg.AlY().YFl(wN.this.tN.iY);
                }
                wN.this.tN.iY = !r3.iY;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(wN.this.tN.iY);
                sb2.append(" mLastVolume=");
                sb2.append(wN.this.tN.pq.YFl());
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = wN.this.tN;
                yFl.VOe.Sg(yFl.iY);
                if (com.bytedance.sdk.openadsdk.core.model.Ne.qO(wN.this.tN.Sg) && !wN.this.tN.f10590nc.get()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.Ne.DSW(wN.this.tN.Sg)) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = wN.this.tN;
                    yFl2.pq.YFl(yFl2.iY, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = wN.this.tN;
                yFl3.mn.AlY(yFl3.iY);
                Wwa wwa = wN.this.tN.Sg;
                if (wwa != null && wwa.Af() != null && wN.this.tN.Sg.Af().YFl() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = wN.this.tN;
                    if (yFl4.VOe != null) {
                        if (yFl4.iY) {
                            yFl4.Sg.Af().YFl().qsH(wN.this.tN.VOe.DSW());
                        } else {
                            yFl4.Sg.Af().YFl().NjR(wN.this.tN.VOe.DSW());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void YFl(View view) {
                if (wN.this.tN.Sg.fcp()) {
                    if (wN.this.tN.lu.eT() != null) {
                        wN.this.tN.Sg.zB(2);
                        wN.this.tN.lu.lG();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = wN.this.tN;
                if (!yFl.tN && yFl.Sg.pE() && !wN.this.tN.Sg.yn()) {
                    wN.this.tN.Sg.zB(13);
                    try {
                        wN.this.tN.lu.lG();
                        return;
                    } catch (Exception unused) {
                    }
                }
                wN wNVar = wN.this;
                wNVar.YFl(com.bytedance.sdk.openadsdk.core.model.Ne.tN(wNVar.tN.Sg), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void tN(View view) {
                wN wNVar = wN.this;
                wNVar.tN.hQ.YFl(wNVar.Sg);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl, com.bytedance.sdk.openadsdk.activity.vc
    public void YFl(Activity activity, Sg.wN wNVar) {
        super.YFl(activity, wNVar);
        if (activity.isFinishing()) {
            return;
        }
        Intent intent = activity.getIntent();
        this.qO = intent.getStringExtra("media_extra");
        this.Wwa = intent.getStringExtra("user_id");
        try {
            if (rkt == null) {
                rkt = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_reward_msg");
                GA = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_msgPlayable");
                EH = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_negtiveBtnBtnText");
                lG = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_postiveBtnText");
                pDU = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            YoT.YFl("TTAD.RewardAdScene", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(int i10) {
        if (i10 == 10000) {
            Ne();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public boolean YFl(long j3, boolean z10) {
        DSW dsw;
        if (this.qsH.YFl()) {
            qsH qsh = this.tN.YI;
            if (qsh != null && qsh.YFl() != null) {
                dsw = this.tN.YI.YFl().getAdShowTime();
            } else {
                dsw = new DSW();
            }
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
            yFl.VOe.YFl(yFl.YI.Sg(), dsw);
            HashMap hashMap = new HashMap();
            qsH qsh2 = this.tN.YI;
            if (qsh2 != null) {
                hashMap.put("dynamic_show_type", Integer.valueOf(qsh2.NjR()));
                JSONObject YFl = this.tN.YI.YFl((JSONObject) null);
                if (YFl != null) {
                    Iterator<String> keys = YFl.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            hashMap.put(next, YFl.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            this.tN.VOe.YFl(new e() { // from class: com.bytedance.sdk.openadsdk.activity.wN.3
                boolean YFl;

                @Override // l5.e
                public void Sg(long j10, int i10) {
                    ((YFl) wN.this).YFl.removeMessages(300);
                    if (wN.this.tN.VOe.Sg()) {
                        wN.this.wN();
                        return;
                    }
                    wN.this.Ne();
                    wN.this.tN.VOe.GA();
                    wN.this.tN.YI.YFl(true);
                    Sg VOe = wN.this.VOe();
                    wN wNVar = wN.this;
                    VOe.YFl(wNVar, wNVar.Sg(3));
                }

                @Override // l5.e
                public void YFl(long j10, int i10) {
                    if (this.YFl) {
                        return;
                    }
                    this.YFl = true;
                    ((YFl) wN.this).YFl.removeMessages(300);
                    wN.this.GA();
                    wN.this.tN.VOe.YFl(j10, j10);
                    wN.this.tN.YI.Sg(true);
                    if (wN.this.tN.Sg.rkt() == 36) {
                        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = wN.this.tN;
                        if (yFl2.tN) {
                            yFl2.bZ.tN().AlY();
                            com.bytedance.sdk.openadsdk.utils.YoT.Sg();
                        }
                    }
                    if (wN.this.tN.Sg.rkt() == 21 && !wN.this.tN.Sg.AlY()) {
                        wN.this.tN.Sg.Sg(true);
                        wN.this.tN.lu.lG();
                    }
                    wN wNVar = wN.this;
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = wNVar.tN;
                    if (yFl3.uGS) {
                        Sg VOe = wNVar.VOe();
                        wN wNVar2 = wN.this;
                        VOe.YFl(wNVar2, wNVar2.Sg(5));
                    } else if (yFl3.tN) {
                        if (yFl3.Sg.Xns()) {
                            if (wN.this.tN.YI.NjR() == 1) {
                                wN.this.tN.Sco.tN();
                            }
                        } else {
                            wN.this.YFl(false, 5);
                            if (!Wwa.wN(wN.this.tN.Sg)) {
                                wN.this.tN.VOe.YFl("skip", true);
                            }
                        }
                    } else if (yFl3.Sg.Xns()) {
                        if (wN.this.tN.YI.NjR() == 1) {
                            wN.this.tN.Sco.tN();
                        }
                    } else {
                        if (!Wwa.wN(wN.this.tN.Sg)) {
                            wN.this.tN.VOe.YFl("skip", true);
                        }
                        wN.this.UZM();
                    }
                    wN.this.wN = (int) (System.currentTimeMillis() / 1000);
                    wN wNVar3 = wN.this;
                    if (wNVar3.tN.uGS) {
                        return;
                    }
                    wNVar3.Ne();
                }

                @Override // l5.e
                public void YFl() {
                    ((YFl) wN.this).YFl.removeMessages(300);
                    wN.this.GA();
                    wN.this.Ne();
                    Sg VOe = wN.this.VOe();
                    wN wNVar = wN.this;
                    VOe.YFl(wNVar, wNVar.Sg(6));
                }

                @Override // l5.e
                public void YFl(long j10, long j11) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = wN.this.tN;
                    if (!yFl2.Bh && yFl2.VOe.Sg()) {
                        wN.this.tN.VOe.EH();
                    }
                    if (wN.this.tN.f10590nc.get()) {
                        return;
                    }
                    ((YFl) wN.this).YFl.removeMessages(300);
                    if (j10 != wN.this.tN.VOe.qsH()) {
                        wN.this.GA();
                    }
                    if (wN.this.tN.VOe.Sg()) {
                        wN.this.tN.VOe.YFl(j10, j11);
                        int nc2 = lG.AlY().nc(String.valueOf(wN.this.tN.f10591vc));
                        boolean z11 = wN.this.tN.YI.qsH() && nc2 != -1 && nc2 >= 0;
                        wN wNVar = wN.this;
                        long j12 = j10 / 1000;
                        wNVar.DSW = (int) (wNVar.tN.VOe.dXO() - j12);
                        int i10 = (int) j12;
                        if ((wN.this.tN.aIu.get() || wN.this.tN.eT.get()) && wN.this.tN.VOe.Sg()) {
                            wN.this.tN.VOe.EH();
                        }
                        wN wNVar2 = wN.this;
                        int i11 = wNVar2.DSW;
                        if (i11 >= 0) {
                            wNVar2.tN.Sco.YFl(String.valueOf(i11), null);
                        }
                        wN.this.tN.lu.AlY(i10);
                        wN.this.YFl(j10, j11);
                        qsH qsh3 = wN.this.tN.YI;
                        if (qsh3 != null && qsh3.YFl() != null) {
                            wN.this.tN.YI.YFl().setTime(String.valueOf(wN.this.DSW), i10, 0, false);
                        }
                        wN.this.YFl((((float) j10) * 1.0f) / ((float) j11));
                        wN wNVar3 = wN.this;
                        if (wNVar3.DSW > 0) {
                            if (z11 && i10 >= nc2 && wNVar3.tN.Sg.rkt() != 5) {
                                wN.this.tN.YFl(true);
                                wN wNVar4 = wN.this;
                                wNVar4.tN.Sco.YFl(String.valueOf(wNVar4.DSW), TTAdDislikeToast.getSkipText());
                                wN.this.tN.Sco.wN(true);
                                return;
                            }
                            wN wNVar5 = wN.this;
                            wNVar5.tN.Sco.YFl(String.valueOf(wNVar5.DSW), null);
                        }
                    }
                }
            });
            boolean YFl2 = this.tN.VOe.YFl(j3, z10, hashMap, this.Sg);
            if (YFl2 && !z10) {
                this.f10553vc = (int) (System.currentTimeMillis() / 1000);
            }
            return YFl2;
        }
        DSW dsw2 = new DSW();
        dsw2.YFl(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.tN;
        yFl2.VOe.YFl(yFl2.lu.vc(), dsw2);
        e eVar = new e() { // from class: com.bytedance.sdk.openadsdk.activity.wN.4
            boolean YFl;

            @Override // l5.e
            public void Sg(long j10, int i10) {
                ((YFl) wN.this).YFl.removeMessages(300);
                if (wN.this.tN.VOe.Sg()) {
                    wN.this.wN();
                    return;
                }
                wN.this.tN.VOe.GA();
                wN.this.Ne();
                Sg VOe = wN.this.VOe();
                wN wNVar = wN.this;
                VOe.YFl(wNVar, wNVar.Sg(3));
            }

            @Override // l5.e
            public void YFl(long j10, int i10) {
                eT eTVar;
                if (this.YFl) {
                    return;
                }
                this.YFl = true;
                ((YFl) wN.this).YFl.removeMessages(300);
                wN.this.GA();
                wN wNVar = wN.this;
                if (!wNVar.tN.uGS) {
                    wNVar.Ne();
                }
                wN.this.tN.VOe.YFl(j10, j10);
                wN.this.tN.qO.set(true);
                if (wN.this.tN.Sg.QGo()) {
                    wN.this.tN.Sg.zB(1);
                    wN.this.tN.lu.lG();
                }
                if (wN.this.tN.Sg.rkt() == 21 && !wN.this.tN.Sg.AlY()) {
                    wN.this.tN.Sg.Sg(true);
                    wN.this.tN.lu.lG();
                }
                wN.this.wN = (int) (System.currentTimeMillis() / 1000);
                wN wNVar2 = wN.this;
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = wNVar2.tN;
                if (yFl3.uGS) {
                    Sg.wN Sg = wNVar2.Sg(5);
                    Sg.AlY = true;
                    wN.this.VOe().YFl(wN.this, Sg);
                    return;
                }
                if (!rkt.tN(yFl3.Sg) && !rkt.Sg(wN.this.tN.Sg) && !rkt.AlY(wN.this.tN.Sg)) {
                    if (rkt.YFl(wN.this.tN.Sg) && !wN.this.tN.rkt.get()) {
                        wN.this.tN.YFl(true);
                        wN.this.tN.Sco.wN(true);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = wN.this.tN;
                    if (yFl4.tN) {
                        if (yFl4.Sg.Xns()) {
                            wN.this.tN.Sco.tN();
                            return;
                        }
                        wN.this.YFl(false, 5);
                        if (Wwa.wN(wN.this.tN.Sg)) {
                            return;
                        }
                        wN.this.tN.VOe.YFl("skip", true);
                        return;
                    }
                    if (yFl4.Sg.Xns()) {
                        wN.this.tN.Sco.tN();
                        return;
                    }
                    if (!Wwa.wN(wN.this.tN.Sg)) {
                        wN.this.tN.VOe.YFl("skip", true);
                    }
                    wN.this.UZM();
                    return;
                }
                wN.this.YFl(false, 5);
                if (!rkt.Sg(wN.this.tN.Sg) || (eTVar = wN.this.tN.Bn) == null) {
                    return;
                }
                eTVar.YFl(0L);
            }

            @Override // l5.e
            public void YFl() {
                ((YFl) wN.this).YFl.removeMessages(300);
                wN.this.GA();
                wN.this.Ne();
                Sg VOe = wN.this.VOe();
                wN wNVar = wN.this;
                VOe.YFl(wNVar, wNVar.Sg(6));
            }

            @Override // l5.e
            public void YFl(long j10, long j11) {
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = wN.this.tN;
                if (!yFl3.Bh && yFl3.VOe.Sg()) {
                    wN.this.tN.VOe.EH();
                }
                if (wN.this.tN.f10590nc.get()) {
                    return;
                }
                ((YFl) wN.this).YFl.removeMessages(300);
                if (j10 != wN.this.tN.VOe.qsH()) {
                    wN.this.GA();
                }
                wN.this.tN.VOe.YFl(j10, j11);
                wN wNVar = wN.this;
                long j12 = j10 / 1000;
                double d10 = j12;
                wNVar.DSW = (int) (wNVar.tN.VOe.dXO() - d10);
                wN wNVar2 = wN.this;
                int i10 = wNVar2.DSW;
                if (i10 >= 0) {
                    wNVar2.tN.Sco.YFl(String.valueOf(i10), null);
                }
                wN wNVar3 = wN.this;
                wNVar3.DSW = (int) (wNVar3.tN.VOe.dXO() - d10);
                int i11 = (int) j12;
                int nc2 = lG.AlY().nc(String.valueOf(wN.this.tN.f10591vc));
                boolean z11 = nc2 >= 0;
                if ((wN.this.tN.aIu.get() || wN.this.tN.eT.get()) && wN.this.tN.VOe.Sg()) {
                    wN.this.tN.VOe.EH();
                }
                wN.this.tN.lu.AlY(i11);
                wN.this.YFl(j10, j11);
                wN.this.YFl((((float) j10) * 1.0f) / ((float) j11));
                wN wNVar4 = wN.this;
                if (wNVar4.DSW > 0) {
                    wNVar4.tN.Sco.AlY(true);
                    if (z11 && i11 >= nc2) {
                        wN.this.tN.YFl(true);
                        wN wNVar5 = wN.this;
                        wNVar5.tN.Sco.YFl(String.valueOf(wNVar5.DSW), TTAdDislikeToast.getSkipText());
                        wN.this.tN.Sco.wN(true);
                        return;
                    }
                    wN wNVar6 = wN.this;
                    wNVar6.tN.Sco.YFl(String.valueOf(wNVar6.DSW), null);
                }
            }
        };
        this.tN.VOe.YFl(eVar);
        rkt rktVar = this.tN.lu.EH;
        if (rktVar != null) {
            rktVar.YFl(eVar);
        }
        boolean YFl3 = this.tN.VOe.YFl(j3, z10, null, this.Sg);
        if (YFl3 && !z10) {
            this.f10553vc = (int) (System.currentTimeMillis() / 1000);
        }
        return YFl3;
    }

    public void YFl(long j3, long j10) {
        if (this.tN.uGS) {
            return;
        }
        long j11 = (r0.dGX * 1000) + j3;
        if (this.aIu == -1) {
            this.aIu = lG.AlY().Ga(String.valueOf(this.tN.f10591vc)).f10745vc;
        }
        if (j10 <= 0) {
            return;
        }
        if (j10 >= 30000 && j11 >= 27000) {
            Ne();
        } else if (((float) (j11 * 100)) / ((float) j10) >= this.aIu) {
            Ne();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final boolean z10, boolean z11) {
        if (!z11 && VOe().NjR().getBoolean("user_has_give_up_reward", false) && com.bytedance.sdk.openadsdk.core.model.Ne.qsH(this.tN.Sg)) {
            hQ();
            return;
        }
        if (!lG.AlY().qsH(String.valueOf(this.tN.f10591vc))) {
            if (z10) {
                UZM();
                return;
            } else {
                hQ();
                return;
            }
        }
        if (VOe().NjR().getBoolean("reward_verify", false)) {
            if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(this.tN.Sg)) {
                hQ();
                return;
            } else if (z10) {
                UZM();
                return;
            } else {
                hQ();
                return;
            }
        }
        this.tN.aIu.set(true);
        this.tN.VOe.EH();
        if (z10) {
            this.tN.UZM.pDU();
        }
        final com.bytedance.sdk.openadsdk.core.widget.Sg sg2 = new com.bytedance.sdk.openadsdk.core.widget.Sg(bZ());
        this.Sg.GA = sg2;
        if (z10) {
            sg2.YFl(GA).Sg(pDU).tN(EH);
        } else {
            sg2.YFl(rkt).Sg(lG).tN(EH);
        }
        this.Sg.GA.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.wN.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.Sg.YFl
            public void Sg() {
                sg2.dismiss();
                wN.this.VOe().NjR().putBoolean("user_has_give_up_reward", true);
                wN.this.tN.aIu.set(false);
                wN.this.tN.UZM.vc(Integer.MAX_VALUE);
                if (!z10) {
                    wN.this.hQ();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(wN.this.tN.Sg)) {
                    if (!wN.this.tN.UZM.YFl()) {
                        wN.this.hQ();
                        return;
                    } else {
                        wN.this.tN.UZM.YFl(5);
                        return;
                    }
                }
                wN.this.tN.dXO.vc();
                if (wN.this.tN.UZM.YFl()) {
                    wN.this.tN.UZM.YFl(4);
                }
                wN.this.UZM();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Sg.YFl
            public void YFl() {
                wN.this.tN.VOe.pDU();
                if (z10) {
                    wN.this.tN.UZM.wN(1000);
                }
                sg2.dismiss();
                wN.this.tN.aIu.set(false);
            }
        }).show();
    }
}
