package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class HWF {
    private final zp zp;

    public HWF(zp zpVar) {
        this.zp = zpVar;
    }

    public void zp(float[] fArr, final com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd, final com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd2) {
        FrameLayout.LayoutParams layoutParams;
        com.bytedance.sdk.openadsdk.component.reward.view.KS ks;
        Arrays.toString(fArr);
        this.zp.eWG.zp(new AdSlot.Builder().setCodeId(String.valueOf(this.zp.zp.FGx())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build());
        zp zpVar = this.zp;
        dT dTVar = zpVar.Rh;
        if (dTVar != null && (ks = zpVar.eWG) != null) {
            dTVar.zp(ks.zp());
        }
        this.zp.eWG.zp(new com.bytedance.sdk.openadsdk.core.nativeexpress.vDp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.HWF.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public void COT() {
                HWF.this.zp.Iv.zp(lmd2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public long KS() {
                return HWF.this.zp.UPs.ku();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public int jU() {
                if (HWF.this.zp.eWG.KS()) {
                    return 4;
                }
                if (HWF.this.zp.eWG.jU()) {
                    return 5;
                }
                if (HWF.this.zp.UPs.COT()) {
                    return 1;
                }
                if (HWF.this.zp.UPs.lMd()) {
                    return 2;
                }
                HWF.this.zp.UPs.jU();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public void lMd() {
                if (HWF.this.zp.rCC == null || HWF.this.zp.rCC.dT() == null) {
                    return;
                }
                HWF.this.zp.rCC.dT().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public void zp(boolean z8) {
                if (HWF.this.zp.jU != z8) {
                    HWF.this.zp.Rh.COT();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public void lMd(int i9) {
                HWF.this.zp.ku = i9;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public void zp() {
                HWF.this.zp.Rh.jU();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public void zp(int i9) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        HWF.this.zp.UPs.RCv();
                        return;
                    }
                    if (i9 == 3) {
                        HWF.this.zp.UPs.zp(lmd);
                        return;
                    } else if (i9 == 4) {
                        HWF.this.zp.UPs.vDp();
                        return;
                    } else if (i9 != 5) {
                        return;
                    }
                }
                if (HWF.this.zp.UPs.lMd() || HWF.this.zp.UPs.jU()) {
                    return;
                }
                lmd.zp(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
            public void zp(int i9, String str) {
                HWF.this.zp.UPs.zp(i9, str);
            }
        });
        this.zp.eWG.zp(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.HWF.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (HWF.this.zp != null && HWF.this.zp.zp != null && HWF.this.zp.zp.zR()) {
                    lmd.vwr();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i9) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i9) {
                if (!HWF.this.zp.zp.slc()) {
                    HWF.this.zp.si.zp(true);
                    HWF.this.zp.si.COT();
                }
                HWF.this.zp.eWG.COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.HWF.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lmd2.zp(false, false, false, 90);
                    }
                });
                HWF.this.zp.rCC.tG();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f9, float f10) {
                if (cz.Bj(HWF.this.zp.zp)) {
                    return;
                }
                if (!HWF.this.zp.zp.slc()) {
                    if (HWF.this.zp.eWG.ku()) {
                        lmd2.zp(true);
                        HWF.this.zp.UPs.COT(false);
                    } else {
                        HWF.this.zp.UPs.COT(true);
                    }
                    HWF.this.zp.rCC.lMd(8);
                    HWF.this.zp.si.zp(true);
                    HWF.this.zp.si.COT();
                    if (HWF.this.zp.eWG.ku()) {
                        HWF.this.zp.eWG.lMd().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        lmd2.zp(HWF.this.zp.rCC.HWF());
                    } else if (HWF.this.zp.zp.eWG() != null && lmd2.zp()) {
                        HWF.this.zp.YW = true;
                    }
                }
                lmd2.Gzh();
                if (lmd2 instanceof com.bytedance.sdk.openadsdk.component.reward.lMd.COT) {
                    com.bytedance.sdk.openadsdk.component.reward.lMd.COT.zp(HWF.this.zp.zp, HWF.this.zp.eWG.ku(), HWF.this.zp.QR);
                    if (!HWF.this.zp.eWG.ku()) {
                        HWF.this.zp.oB.QR();
                    }
                }
                HWF.this.zp.rCC.tG();
            }
        });
        zp zpVar2 = this.zp;
        TTBaseVideoActivity tTBaseVideoActivity = zpVar2.oB;
        woN won = zpVar2.zp;
        String str = zpVar2.QR;
        com.bytedance.sdk.openadsdk.core.nativeexpress.QR qr = new com.bytedance.sdk.openadsdk.core.nativeexpress.QR(tTBaseVideoActivity, won, str, YhE.zp(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.HWF.3
            @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
            public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
                super.zp(view, f9, f10, f11, f12, sparseArray, z8);
                lmd.vwr();
            }
        };
        HashMap hashMap = new HashMap();
        if (cz.Bj(this.zp.zp)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        qr.zp(hashMap);
        zp zpVar3 = this.zp;
        TTBaseVideoActivity tTBaseVideoActivity2 = zpVar3.oB;
        woN won2 = zpVar3.zp;
        String str2 = zpVar3.QR;
        com.bytedance.sdk.openadsdk.core.nativeexpress.HWF hwf = new com.bytedance.sdk.openadsdk.core.nativeexpress.HWF(tTBaseVideoActivity2, won2, str2, YhE.zp(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.HWF.4
            @Override // com.bytedance.sdk.openadsdk.core.lMd.zp, com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
            public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("duration", Long.valueOf(HWF.this.zp.UPs.QR()));
                zp(hashMap2);
                super.zp(view, f9, f10, f11, f12, sparseArray, z8);
                if (!zp(view, z8)) {
                    return;
                }
                lmd.vwr();
            }
        };
        HashMap hashMap2 = new HashMap();
        if (cz.Bj(this.zp.zp)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        hwf.zp(hashMap2);
        this.zp.eWG.zp(qr, hwf);
        if (this.zp.zp.slc()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.gravity = 17;
        this.zp.rCC.HWF().addView(this.zp.eWG.zp(), layoutParams);
        if (!this.zp.eWG.ku()) {
            lmd2.zp(false);
        }
        this.zp.eWG.Bj();
    }
}
