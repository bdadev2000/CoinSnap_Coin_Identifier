package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class vc {
    private final YFl YFl;

    public vc(YFl yFl) {
        this.YFl = yFl;
    }

    public void YFl(float[] fArr, final com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2, final com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg3) {
        FrameLayout.LayoutParams layoutParams;
        com.bytedance.sdk.openadsdk.activity.vc vcVar;
        com.bytedance.sdk.openadsdk.component.reward.view.qsH qsh;
        Arrays.toString(fArr);
        this.YFl.YI.YFl(new AdSlot.Builder().setCodeId(String.valueOf(this.YFl.Sg.kU())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build());
        YFl yFl = this.YFl;
        pDU pdu = yFl.Sco;
        if (pdu != null && (qsh = yFl.YI) != null) {
            pdu.YFl(qsh.YFl());
        }
        this.YFl.YI.YFl(new com.bytedance.sdk.openadsdk.core.qsH.pDU() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.vc.1
            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public int AlY() {
                if (vc.this.YFl.YI.tN()) {
                    return 4;
                }
                if (vc.this.YFl.YI.AlY()) {
                    return 5;
                }
                if (vc.this.YFl.VOe.wN()) {
                    return 1;
                }
                if (vc.this.YFl.VOe.Sg()) {
                    return 2;
                }
                vc.this.YFl.VOe.AlY();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public void Sg() {
                if (vc.this.YFl.lu == null || vc.this.YFl.lu.nc() == null) {
                    return;
                }
                vc.this.YFl.lu.nc().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public void YFl(boolean z10) {
                if (vc.this.YFl.iY != z10) {
                    vc.this.YFl.Sco.wN();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public long tN() {
                return vc.this.YFl.VOe.qsH();
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public void wN() {
                vc.this.YFl.hQ.YFl(sg3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public void Sg(int i10) {
                vc.this.YFl.dGX = i10;
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public void YFl() {
                vc.this.YFl.Sco.AlY();
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public void YFl(int i10) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        vc.this.YFl.VOe.YI();
                        return;
                    }
                    if (i10 == 3) {
                        vc.this.YFl.VOe.YFl(sg2);
                        return;
                    } else if (i10 == 4) {
                        vc.this.YFl.VOe.YoT();
                        return;
                    } else if (i10 != 5) {
                        return;
                    }
                }
                if (vc.this.YFl.VOe.Sg() || vc.this.YFl.VOe.AlY()) {
                    return;
                }
                sg2.YFl(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.pDU
            public void YFl(int i10, String str) {
                vc.this.YFl.VOe.YFl(i10, str);
            }
        });
        this.YFl.YI.YFl(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.vc.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (vc.this.YFl != null && vc.this.YFl.Sg != null && vc.this.YFl.Sg.ZS()) {
                    sg2.c_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                if (!vc.this.YFl.Sg.Pj()) {
                    vc.this.YFl.mn.YFl(true);
                    vc.this.YFl.mn.wN();
                }
                vc.this.YFl.YI.wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.vc.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        sg3.YFl(false, false, false, 90);
                    }
                });
                vc.this.YFl.lu.GA();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (Ne.Wwa(vc.this.YFl.Sg)) {
                    return;
                }
                if (!vc.this.YFl.Sg.Pj()) {
                    if (vc.this.YFl.YI.qsH()) {
                        sg3.YFl(true);
                        vc.this.YFl.VOe.AlY(false);
                    } else {
                        vc.this.YFl.VOe.AlY(true);
                    }
                    vc.this.YFl.lu.YFl(8);
                    vc.this.YFl.mn.YFl(true);
                    vc.this.YFl.mn.wN();
                    if (vc.this.YFl.YI.qsH()) {
                        vc.this.YFl.YI.Sg().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        sg3.YFl(vc.this.YFl.lu.vc());
                    } else if (vc.this.YFl.Sg.BPI() != null && sg3.YFl()) {
                        vc.this.YFl.Ld = true;
                    }
                }
                sg3.YI();
                if (sg3 instanceof com.bytedance.sdk.openadsdk.component.reward.Sg.wN) {
                    com.bytedance.sdk.openadsdk.component.reward.Sg.wN.YFl(vc.this.YFl.Sg, vc.this.YFl.YI.qsH(), vc.this.YFl.wN);
                    if (!vc.this.YFl.YI.qsH()) {
                        vc.this.YFl.ZU.vc();
                    }
                }
                vc.this.YFl.lu.GA();
            }
        });
        YFl yFl2 = this.YFl;
        Activity activity = yFl2.UI;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = yFl2.Sg;
        String str = yFl2.wN;
        com.bytedance.sdk.openadsdk.core.qsH.NjR njR = new com.bytedance.sdk.openadsdk.core.qsH.NjR(activity, wwa, str, Sco.YFl(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.vc.3
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
            public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        njR.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.vc.4
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view, int i10) {
                sg2.c_();
            }
        });
        HashMap hashMap = new HashMap();
        if (Ne.Wwa(this.YFl.Sg)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        YFl yFl3 = this.YFl;
        if (yFl3.uGS && (vcVar = yFl3.UT) != null) {
            hashMap.put("ad_show_order", Integer.valueOf(vcVar.NjR + 1));
        }
        njR.YFl(hashMap);
        YFl yFl4 = this.YFl;
        Activity activity2 = yFl4.UI;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa2 = yFl4.Sg;
        String str2 = yFl4.wN;
        com.bytedance.sdk.openadsdk.core.qsH.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.qsH.qsH(activity2, wwa2, str2, Sco.YFl(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.vc.5
            @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl, com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
            public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("duration", Long.valueOf(vc.this.YFl.VOe.DSW()));
                YFl(hashMap2);
                super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        qsh2.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.vc.6
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view, int i10) {
                sg2.c_();
            }
        });
        HashMap hashMap2 = new HashMap();
        if (Ne.Wwa(this.YFl.Sg)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        qsh2.YFl(hashMap2);
        this.YFl.YI.YFl(njR, qsh2);
        if (this.YFl.Sg.Pj()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else if (com.bytedance.sdk.openadsdk.core.eT.tN.YFl(this.YFl.Sg.UZM())) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.gravity = 17;
        this.YFl.lu.vc().addView(this.YFl.YI.YFl(), layoutParams);
        if (!this.YFl.YI.qsH()) {
            sg3.YFl(false);
        }
        this.YFl.YI.eT();
    }
}
