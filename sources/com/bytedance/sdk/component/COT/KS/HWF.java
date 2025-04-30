package com.bytedance.sdk.component.COT.KS;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.COT.FP;
import com.bytedance.sdk.component.COT.pvr;
import com.bytedance.sdk.component.COT.tG;
import com.bytedance.sdk.component.COT.vDp;
import com.bytedance.sdk.component.COT.vwr;
import com.bytedance.sdk.component.COT.woN;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class HWF {
    private com.bytedance.sdk.component.COT.jU HWF;
    private vDp QR;
    private woN YW;
    private ExecutorService ku;
    private final tG lMd;
    private Map<String, List<KS>> zp = new ConcurrentHashMap();
    private Map<String, vwr> KS = new HashMap();
    private Map<String, pvr> jU = new HashMap();
    private Map<String, com.bytedance.sdk.component.COT.KS> COT = new HashMap();

    public HWF(Context context, tG tGVar) {
        this.lMd = (tG) ku.zp(tGVar);
        com.bytedance.sdk.component.COT.KS.zp.zp.zp(context, tGVar.YW());
    }

    private ExecutorService Bj() {
        ExecutorService lMd = this.lMd.lMd();
        if (lMd != null) {
            return lMd;
        }
        return com.bytedance.sdk.component.COT.zp.KS.zp();
    }

    private pvr COT(com.bytedance.sdk.component.COT.lMd lmd) {
        pvr HWF = this.lMd.HWF();
        return HWF != null ? HWF : com.bytedance.sdk.component.COT.KS.zp.lMd.COT.zp(lmd.lMd());
    }

    private com.bytedance.sdk.component.COT.KS HWF(com.bytedance.sdk.component.COT.lMd lmd) {
        com.bytedance.sdk.component.COT.KS QR = this.lMd.QR();
        return QR != null ? QR : new com.bytedance.sdk.component.COT.KS.zp.zp.lMd(lmd.COT(), lmd.zp(), HWF());
    }

    private com.bytedance.sdk.component.COT.jU YW() {
        com.bytedance.sdk.component.COT.jU jU = this.lMd.jU();
        if (jU == null) {
            return com.bytedance.sdk.component.COT.lMd.lMd.zp();
        }
        return jU;
    }

    private vDp dT() {
        vDp zp = this.lMd.zp();
        if (zp != null) {
            return zp;
        }
        return com.bytedance.sdk.component.COT.zp.lMd.zp();
    }

    private vwr jU(com.bytedance.sdk.component.COT.lMd lmd) {
        vwr COT = this.lMd.COT();
        if (COT != null) {
            return com.bytedance.sdk.component.COT.KS.zp.lMd.zp.zp(COT);
        }
        return com.bytedance.sdk.component.COT.KS.zp.lMd.zp.zp(lmd.lMd());
    }

    private woN vDp() {
        woN ku = this.lMd.ku();
        if (ku == null) {
            return new QR();
        }
        return ku;
    }

    public Collection<com.bytedance.sdk.component.COT.KS> KS() {
        return this.COT.values();
    }

    public Map<String, List<KS>> QR() {
        return this.zp;
    }

    public woN ku() {
        if (this.YW == null) {
            this.YW = vDp();
        }
        return this.YW;
    }

    public Collection<pvr> lMd() {
        return this.jU.values();
    }

    public Collection<vwr> zp() {
        return this.KS.values();
    }

    public com.bytedance.sdk.component.COT.KS KS(com.bytedance.sdk.component.COT.lMd lmd) {
        if (lmd == null) {
            lmd = com.bytedance.sdk.component.COT.KS.zp.zp.QR();
        }
        String file = lmd.COT().toString();
        com.bytedance.sdk.component.COT.KS ks = this.COT.get(file);
        if (ks != null) {
            return ks;
        }
        com.bytedance.sdk.component.COT.KS HWF = HWF(lmd);
        this.COT.put(file, HWF);
        return HWF;
    }

    public pvr lMd(com.bytedance.sdk.component.COT.lMd lmd) {
        if (lmd == null) {
            lmd = com.bytedance.sdk.component.COT.KS.zp.zp.QR();
        }
        String file = lmd.COT().toString();
        pvr pvrVar = this.jU.get(file);
        if (pvrVar != null) {
            return pvrVar;
        }
        pvr COT = COT(lmd);
        this.jU.put(file, COT);
        return COT;
    }

    public vwr zp(com.bytedance.sdk.component.COT.lMd lmd) {
        if (lmd == null) {
            lmd = com.bytedance.sdk.component.COT.KS.zp.zp.QR();
        }
        String file = lmd.COT().toString();
        vwr vwrVar = this.KS.get(file);
        if (vwrVar != null) {
            return vwrVar;
        }
        vwr jU = jU(lmd);
        this.KS.put(file, jU);
        return jU;
    }

    public vDp COT() {
        if (this.QR == null) {
            this.QR = dT();
        }
        return this.QR;
    }

    public ExecutorService HWF() {
        ExecutorService zp;
        FP KS = this.lMd.KS();
        if (KS != null && (zp = KS.zp()) != null) {
            return zp;
        }
        if (this.ku == null) {
            this.ku = Bj();
        }
        return this.ku;
    }

    public com.bytedance.sdk.component.COT.jU jU() {
        if (this.HWF == null) {
            this.HWF = YW();
        }
        return this.HWF;
    }

    public com.bytedance.sdk.component.COT.KS zp(String str) {
        return KS(com.bytedance.sdk.component.COT.KS.zp.zp.zp(new File(str)));
    }

    public com.bytedance.sdk.component.COT.KS.lMd.zp zp(KS ks) {
        ImageView.ScaleType jU = ks.jU();
        if (jU == null) {
            jU = com.bytedance.sdk.component.COT.KS.lMd.zp.zp;
        }
        ImageView.ScaleType scaleType = jU;
        Bitmap.Config Bj = ks.Bj();
        if (Bj == null) {
            Bj = com.bytedance.sdk.component.COT.KS.lMd.zp.lMd;
        }
        return new com.bytedance.sdk.component.COT.KS.lMd.zp(ks.lMd(), ks.KS(), scaleType, Bj, ks.QR(), ks.ku());
    }
}
