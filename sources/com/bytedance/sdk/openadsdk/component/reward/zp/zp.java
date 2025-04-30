package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.HWF;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class zp {
    public final HWF BO;
    public float Bj;
    public final Bj DY;
    public final boolean HWF;
    public final KS Iv;
    public String KS;
    public boolean KVG;
    public final RewardFullBaseLayout MBR;
    public final YW Pxi;
    public final String QR;
    public com.bytedance.sdk.openadsdk.common.QR Rg;

    @NonNull
    public final dT Rh;

    @NonNull
    public final tG UPs;
    public com.bytedance.sdk.openadsdk.component.reward.lMd.lMd Vjb;
    public boolean YW;
    public final com.bytedance.sdk.openadsdk.YW.ku aax;
    public final int dQp;
    public final com.bytedance.sdk.openadsdk.component.reward.view.KS eWG;
    public final jU fRl;
    public final QR ffE;
    public final Context fgJ;
    public com.bytedance.sdk.openadsdk.utils.Bj fs;
    public final COT gH;
    public boolean jU;
    public int ku;
    public final boolean lMd;

    @NonNull
    public final TTBaseVideoActivity oB;
    public final ku oKZ;
    public final boolean pvr;
    public final RCv qtv;
    public final com.bytedance.sdk.openadsdk.component.reward.view.COT rCC;
    public boolean rV;
    public final rV si;
    public int tG;
    public int vDp;
    public boolean woN;
    public final woN zp;
    public boolean COT = false;
    public int dT = 1;
    public long vwr = 0;
    public int cz = 0;
    public final AtomicBoolean FP = new AtomicBoolean(false);
    public final AtomicBoolean ot = new AtomicBoolean(false);
    public final AtomicBoolean yRU = new AtomicBoolean(false);
    public final AtomicBoolean ox = new AtomicBoolean(false);
    public final AtomicBoolean RCv = new AtomicBoolean(false);
    public final AtomicBoolean Lij = new AtomicBoolean(false);
    public final AtomicBoolean Gzh = new AtomicBoolean(false);
    public final AtomicBoolean irS = new AtomicBoolean(false);
    public final AtomicBoolean QUv = new AtomicBoolean(false);
    public final AtomicBoolean cW = new AtomicBoolean(false);
    public final AtomicBoolean YhE = new AtomicBoolean(false);
    public final AtomicBoolean WNy = new AtomicBoolean(false);

    public zp(@NonNull TTBaseVideoActivity tTBaseVideoActivity, RCv rCv, @NonNull woN won) {
        com.bytedance.sdk.openadsdk.component.reward.view.COT jUVar;
        this.oB = tTBaseVideoActivity;
        Context applicationContext = tTBaseVideoActivity.getApplicationContext();
        this.fgJ = applicationContext;
        this.zp = won;
        this.QR = tTBaseVideoActivity.zp;
        this.qtv = rCv;
        this.HWF = tTBaseVideoActivity.dQp();
        this.pvr = com.bytedance.sdk.openadsdk.core.model.dQp.YW(won);
        int FGx = won.FGx();
        this.dQp = FGx;
        this.jU = KVG.jU().KVG(String.valueOf(FGx));
        this.lMd = com.bytedance.sdk.openadsdk.core.settings.dQp.etV().tG(String.valueOf(FGx));
        this.Pxi = new YW(this);
        if (tTBaseVideoActivity.KVG()) {
            jUVar = new com.bytedance.sdk.openadsdk.component.reward.view.COT(this);
        } else {
            jUVar = new com.bytedance.sdk.openadsdk.component.reward.view.jU(this);
        }
        this.rCC = jUVar;
        this.MBR = new RewardFullBaseLayout(tTBaseVideoActivity);
        this.UPs = new tG(this);
        this.fRl = new jU(this);
        this.ffE = new QR(this);
        this.eWG = new com.bytedance.sdk.openadsdk.component.reward.view.KS(this);
        this.si = new rV(this);
        this.DY = new Bj(this);
        this.Rh = new dT(this);
        this.gH = new COT(this);
        this.oKZ = new ku(this);
        this.BO = new HWF(this);
        this.Iv = new KS(this);
        this.aax = new com.bytedance.sdk.openadsdk.YW.ku(applicationContext);
        this.fs = com.bytedance.sdk.openadsdk.utils.HWF.zp(tTBaseVideoActivity, new HWF.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.zp.1
            @Override // com.bytedance.sdk.openadsdk.utils.HWF.zp
            public void lMd() {
                dT dTVar = zp.this.Rh;
                if (dTVar != null) {
                    dTVar.HWF();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.HWF.zp
            public View zp() {
                com.bytedance.sdk.openadsdk.component.reward.view.COT cot = zp.this.rCC;
                if (cot != null) {
                    return cot.dT();
                }
                return null;
            }
        });
    }

    public void zp(boolean z8) {
        this.KVG = z8;
        this.Rh.jU(z8);
    }
}
