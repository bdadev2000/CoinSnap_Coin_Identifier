package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EH {
    private volatile long DSW;
    private com.bytedance.adsdk.ugeno.Sg.Sg GA;
    private String NjR;
    private final YFl Sg;
    final com.bytedance.sdk.openadsdk.core.model.Wwa YFl;
    private boolean lG;
    private com.bytedance.adsdk.ugeno.Sg.Sg pDU;
    private volatile long qsH;
    private FrameLayout tN;

    /* renamed from: vc, reason: collision with root package name */
    private volatile long f10581vc;
    private final AtomicBoolean AlY = new AtomicBoolean(false);
    private final AtomicBoolean wN = new AtomicBoolean(false);

    /* renamed from: nc, reason: collision with root package name */
    private final AtomicBoolean f10580nc = new AtomicBoolean(false);
    private long eT = 0;
    private long YoT = 0;
    private String EH = null;
    private boolean rkt = false;

    public EH(YFl yFl) {
        this.Sg = yFl;
        this.YFl = yFl.Sg;
        this.NjR = yFl.wN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pDU() {
        com.bytedance.sdk.openadsdk.core.eT.vc.YFl CR;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl;
        if (wwa == null || (CR = wwa.CR()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.eT.tN.Sg sg2 = new com.bytedance.sdk.openadsdk.core.eT.tN.Sg(this.Sg.UI, this.YFl, CR, this.NjR, new com.bytedance.sdk.openadsdk.core.eT.wN.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.EH.3
            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
            public void Sg(String str) {
                EH eh2 = EH.this;
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(eh2.YFl, true, eh2.NjR, "success", SystemClock.elapsedRealtime() - EH.this.YoT, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.Sg
            public void YFl() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
            public void YFl(String str) {
                EH.this.YoT = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
            public void YFl(int i10, String str, String str2) {
                EH.this.wN.set(false);
                EH eh2 = EH.this;
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(eh2.YFl, true, eh2.NjR, "fail", SystemClock.elapsedRealtime() - EH.this.YoT, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.Sg
            public void YFl(int i10, String str) {
                EH.this.wN.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.Sg
            public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg<View> sg3) {
                EH.this.pDU = sg3;
                EH.this.wN.set(true);
            }
        });
        sg2.YFl(new com.bytedance.sdk.openadsdk.core.eT.wN.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.EH.4
            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.YFl
            public void Sg() {
                EH.this.rkt = true;
                EH.this.Sg.lu.nc().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.YFl
            public String YFl() {
                return "overlay";
            }
        });
        sg2.YFl();
        sg2.YFl(this.Sg.lu.nc());
    }

    public boolean GA() {
        return this.wN.get();
    }

    public boolean YoT() {
        return this.AlY.get();
    }

    public void eT() {
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(SystemClock.elapsedRealtime() - this.qsH, this.YFl, this.NjR);
    }

    public void nc() {
        com.bytedance.sdk.openadsdk.AlY.tN.tN(this.YFl, this.NjR);
    }

    public boolean AlY() {
        return this.rkt;
    }

    public void DSW() {
        nc();
        NjR();
        com.bytedance.adsdk.ugeno.Sg.Sg sg2 = this.GA;
        if (sg2 != null) {
            this.tN.addView(sg2.NjR(), new FrameLayout.LayoutParams(this.GA.pq(), this.GA.mn()));
        }
    }

    public void NjR() {
        if (this.qsH <= 0 || this.DSW <= 0 || this.f10580nc.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.DSW - this.qsH, this.YFl, this.NjR, this.EH);
    }

    public void qsH() {
        com.bytedance.adsdk.ugeno.Sg.Sg sg2 = this.pDU;
        if (sg2 != null) {
            this.tN.addView(sg2.NjR(), new FrameLayout.LayoutParams(this.pDU.pq(), this.pDU.mn()));
        }
    }

    public void vc() {
        this.qsH = SystemClock.elapsedRealtime();
    }

    public void wN() {
        this.f10581vc = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.YFl, this.NjR);
    }

    public void tN() {
        com.bytedance.sdk.openadsdk.core.eT.vc.YFl HaH;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl;
        if (wwa == null || (HaH = wwa.HaH()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.eT.tN.Sg sg2 = new com.bytedance.sdk.openadsdk.core.eT.tN.Sg(this.Sg.UI, this.YFl, HaH, this.NjR, new com.bytedance.sdk.openadsdk.core.eT.wN.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.EH.1
            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
            public void Sg(String str) {
                EH.this.EH = str;
                EH eh2 = EH.this;
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(eh2.YFl, false, eh2.NjR, "success", SystemClock.elapsedRealtime() - EH.this.eT, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
            public void YFl(String str) {
                EH.this.eT = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.tN
            public void YFl(int i10, String str, String str2) {
                EH.this.EH = str2;
                EH.this.AlY.set(false);
                EH eh2 = EH.this;
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(eh2.YFl, false, eh2.NjR, "fail", SystemClock.elapsedRealtime() - EH.this.eT, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.Sg
            public void YFl() {
                EH.this.wN();
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.Sg
            public void YFl(int i10, String str) {
                EH.this.AlY.set(false);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                EH eh2 = EH.this;
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(eh2.YFl, eh2.NjR, elapsedRealtime - EH.this.f10581vc, i10, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.eT.wN.Sg
            public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg<View> sg3) {
                EH.this.GA = sg3;
                EH.this.AlY.set(true);
                EH.this.DSW = SystemClock.elapsedRealtime();
                if (EH.this.Sg.mn.YI()) {
                    View nc2 = EH.this.Sg.lu.nc();
                    if (nc2 instanceof com.bytedance.sdk.openadsdk.core.wN.AlY) {
                        ((com.bytedance.sdk.openadsdk.core.wN.AlY) nc2).setImageResource(com.bytedance.sdk.component.utils.qO.AlY(EH.this.Sg.BPI, "tt_skip_btn"));
                    }
                }
                EH.this.pDU();
                EH.this.NjR();
                EH eh2 = EH.this;
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(eh2.YFl, eh2.NjR, EH.this.DSW - EH.this.f10581vc);
            }
        });
        if (this.YFl.CR() != null) {
            sg2.YFl(new com.bytedance.sdk.openadsdk.core.eT.wN.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.EH.2
                @Override // com.bytedance.sdk.openadsdk.core.eT.wN.YFl
                public void Sg() {
                }

                @Override // com.bytedance.sdk.openadsdk.core.eT.wN.YFl
                public String YFl() {
                    return Constants.NORMAL;
                }
            });
        }
        sg2.YFl();
        sg2.YFl(this.Sg.lu.nc());
    }

    public void Sg() {
        this.tN = (FrameLayout) this.Sg.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.EH);
    }

    public void YFl() {
        if (this.lG) {
            return;
        }
        this.lG = true;
        Sg();
    }

    public void YFl(int i10) {
        GS.YFl((View) this.tN, i10);
    }
}
