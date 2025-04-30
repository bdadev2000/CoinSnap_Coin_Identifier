package com.bytedance.sdk.openadsdk.component.ku;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;

/* loaded from: classes.dex */
public class KS implements zp.InterfaceC0109zp {
    private woN KS;
    private lMd jU;
    private FrameLayout lMd;
    private Context zp;

    public KS(Context context) {
        this.zp = context.getApplicationContext();
    }

    public void COT() {
        lMd lmd = this.jU;
        if (lmd != null) {
            lmd.lMd();
        }
    }

    public void HWF() {
        lMd lmd = this.jU;
        if (lmd == null) {
            return;
        }
        this.zp = null;
        lmd.KS();
        this.jU = null;
    }

    public boolean KS() {
        lMd lmd = this.jU;
        if (lmd != null && lmd.vDp() != null && this.jU.vDp().QR()) {
            return true;
        }
        return false;
    }

    public long QR() {
        lMd lmd = this.jU;
        if (lmd != null) {
            return lmd.COT();
        }
        return 0L;
    }

    public long YW() {
        lMd lmd = this.jU;
        if (lmd != null) {
            return this.jU.HWF() + lmd.ku();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.zp.InterfaceC0109zp
    public long getVideoProgress() {
        return QR();
    }

    public void jU() {
        try {
            if (lMd()) {
                this.jU.zp();
            }
        } catch (Throwable th) {
            tG.zp("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public long ku() {
        lMd lmd = this.jU;
        if (lmd != null) {
            return lmd.HWF();
        }
        return 0L;
    }

    public boolean lMd() {
        lMd lmd = this.jU;
        if (lmd != null && lmd.vDp() != null && this.jU.vDp().HWF()) {
            return true;
        }
        return false;
    }

    public void zp(FrameLayout frameLayout, woN won) {
        this.lMd = frameLayout;
        this.KS = won;
        this.jU = new lMd(this.zp, frameLayout, won);
    }

    public boolean zp() {
        com.bytedance.sdk.openadsdk.core.video.zp.lMd zp = woN.zp(CacheDirFactory.getICacheDir(0).lMd(), this.KS);
        zp.lMd(this.KS.fgJ());
        zp.zp(this.lMd.getWidth());
        zp.lMd(this.lMd.getHeight());
        zp.KS(this.KS.GP());
        zp.zp(0L);
        zp.zp(true);
        return this.jU.zp(zp);
    }

    public void zp(KS.zp zpVar) {
        lMd lmd = this.jU;
        if (lmd != null) {
            lmd.zp(zpVar);
        }
    }

    public void zp(int i9) {
        if (this.jU != null) {
            dQp.zp zpVar = new dQp.zp();
            zpVar.zp(QR());
            zpVar.KS(YW());
            zpVar.lMd(ku());
            zpVar.KS(i9);
            zpVar.jU(this.jU.QR());
            this.jU.zp(zpVar);
        }
    }
}
