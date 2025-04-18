package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.VOe;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;

/* loaded from: classes.dex */
public class AlY extends YFl {

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10527vc;
    int wN;

    public AlY(Sg sg2, Wwa wwa, int i10) {
        super(sg2, wwa, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY(int i10) {
        int qO = lG.AlY().qO(String.valueOf(this.tN.f10591vc));
        if (lG.AlY().vc(String.valueOf(this.tN.f10591vc)) && (Wwa.wN(this.tN.Sg) || this.tN.tN)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
            if (!yFl.f10589ib) {
                yFl.YFl(true);
            }
            if (i10 <= qO) {
                wN(qO - i10);
                this.tN.Sco.wN(false);
                return;
            } else {
                Sg();
                return;
            }
        }
        if (i10 >= qO) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.tN;
            if (!yFl2.f10589ib) {
                yFl2.YFl(true);
            }
            Sg();
        }
    }

    private void wN(int i10) {
        this.tN.Sco.YFl(null, new SpannableStringBuilder(String.format(qO.YFl(lG.YFl(), "tt_skip_ad_time_text"), Integer.valueOf(i10))));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl
    public void DSW() {
        Ga();
        if (this.qsH.YFl()) {
            this.tN.YI.nc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl
    public void Sg() {
        if (!Wwa.wN(this.tN.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
            if (!yFl.tN) {
                yFl.Sco.YFl(null, "X");
                this.tN.Sco.wN(true);
            }
        }
        this.tN.Sco.YFl(null, TTAdDislikeToast.getSkipText());
        this.tN.Sco.wN(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public boolean a_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public String b_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void c_() {
        if (this.tN.Sg.qjy() != 100.0f) {
            this.f10527vc = true;
        }
        dXO();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl, com.bytedance.sdk.openadsdk.activity.vc
    public void tN(Activity activity) {
        super.tN(activity);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        if (yFl == null || !Sg(yFl.Sg) || YFl(this.tN.Sg)) {
            return;
        }
        if (this.f10527vc) {
            this.f10527vc = false;
            UZM();
        } else if (this.tN.mn.zB()) {
            UZM();
        }
    }

    private boolean YFl(Wwa wwa) {
        return wwa == null || wwa.qjy() == 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean YFl(long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.AlY.YFl(long, boolean):boolean");
    }

    private boolean Sg(Wwa wwa) {
        if (wwa == null) {
            return false;
        }
        return lG.AlY().aIu(String.valueOf(this.tN.f10591vc));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.YFl
    public void tN() {
        final View nc2 = this.tN.lu.nc();
        if (nc2 != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.AlY.1
                /* JADX WARN: Removed duplicated region for block: B:21:0x00d7 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instructions count: 249
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.AlY.AnonymousClass1.onClick(android.view.View):void");
                }
            };
            nc2.setOnClickListener(onClickListener);
            nc2.setTag(nc2.getId(), onClickListener);
        }
        this.tN.Sco.YFl(new com.bytedance.sdk.openadsdk.component.reward.top.Sg() { // from class: com.bytedance.sdk.openadsdk.activity.AlY.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void AlY(View view) {
                View view2 = nc2;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void Sg(View view) {
                AlY alY = AlY.this;
                alY.tN.iY = !r0.iY;
                com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = alY.Sg;
                if (sg2 != null && sg2.AlY() != null) {
                    AlY.this.Sg.AlY().YFl(AlY.this.tN.iY);
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = AlY.this.tN;
                yFl.VOe.Sg(yFl.iY);
                if (Ne.qO(AlY.this.tN.Sg) && !AlY.this.tN.f10590nc.get()) {
                    return;
                }
                if (Ne.DSW(AlY.this.tN.Sg)) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = AlY.this.tN;
                    yFl2.pq.YFl(yFl2.iY, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = AlY.this.tN;
                yFl3.mn.AlY(yFl3.iY);
                Wwa wwa = AlY.this.tN.Sg;
                if (wwa != null && wwa.Af() != null && AlY.this.tN.Sg.Af().YFl() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = AlY.this.tN;
                    if (yFl4.VOe != null) {
                        if (yFl4.iY) {
                            yFl4.Sg.Af().YFl().qsH(AlY.this.tN.VOe.DSW());
                        } else {
                            yFl4.Sg.Af().YFl().NjR(AlY.this.tN.VOe.DSW());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void YFl(View view) {
                if (Ne.qsH(AlY.this.tN.Sg) && (Ne.Wwa(AlY.this.tN.Sg) || AlY.this.tN.f10590nc.get())) {
                    if (AlY.this.tN.UZM.YFl()) {
                        AlY.this.tN.UZM.YFl(5);
                        return;
                    } else {
                        AlY.this.tN.mn.qsH();
                        return;
                    }
                }
                if (!Ne.Wwa(AlY.this.tN.Sg) && (!rkt.YFl(AlY.this.tN.Sg) || AlY.this.tN.rkt.get())) {
                    if (AlY.this.tN.Sg.fcp()) {
                        if (AlY.this.tN.lu.eT() != null) {
                            AlY.this.tN.Sg.zB(2);
                            AlY.this.tN.lu.lG();
                            return;
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = AlY.this.tN;
                    if (!yFl.tN && yFl.Sg.pE() && !AlY.this.tN.Sg.yn()) {
                        AlY.this.tN.Sg.zB(13);
                        try {
                            AlY.this.tN.lu.lG();
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    EH.YFl yFl2 = new EH.YFl();
                    yFl2.YFl(AlY.this.tN.VOe.DSW());
                    yFl2.tN(AlY.this.tN.VOe.qO());
                    yFl2.Sg(AlY.this.tN.VOe.eT());
                    yFl2.tN(3);
                    yFl2.AlY(AlY.this.tN.VOe.Wwa());
                    com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(AlY.this.tN.VOe.tN(), yFl2, AlY.this.tN.VOe.YFl());
                    VOe.tN(AlY.this.tN.f10591vc);
                    AlY.this.tN.VOe.YFl("skip", false);
                    AlY.this.tN.Sco.AlY(false);
                    AlY alY = AlY.this;
                    if (alY.tN.tN) {
                        alY.YFl(true, 4);
                    } else {
                        alY.UZM();
                    }
                    Wwa wwa = AlY.this.tN.Sg;
                    if (wwa != null && wwa.Af() != null) {
                        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = AlY.this.tN;
                        if (yFl3.VOe != null) {
                            yFl3.Sg.Af().YFl().vc(AlY.this.tN.VOe.DSW());
                            AlY.this.tN.Sg.Af().YFl().wN(AlY.this.tN.VOe.DSW());
                        }
                    }
                    com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(AlY.this.tN.Sg, 5);
                    return;
                }
                if (!Ne.qsH(AlY.this.tN.Sg) && AlY.this.tN.UZM.YFl()) {
                    AlY.this.tN.UZM.YFl(4);
                }
                AlY.this.UZM();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void tN(View view) {
                AlY alY = AlY.this;
                alY.tN.hQ.YFl(alY.Sg);
            }
        });
    }
}
