package com.bykv.vk.openvk.component.video.zp.jU;

import com.bykv.vk.openvk.component.video.zp.jU.KS;

/* loaded from: classes.dex */
public abstract class zp implements KS {
    private KS.HWF COT;
    private KS.QR HWF;
    private KS.lMd KS;
    private KS.InterfaceC0052KS QR;
    private KS.zp jU;
    private KS.jU ku;
    private KS.COT lMd;
    protected boolean zp = false;

    public final void KS() {
        try {
            KS.lMd lmd = this.KS;
            if (lmd != null) {
                lmd.zp(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void jU() {
        try {
            KS.HWF hwf = this.COT;
            if (hwf != null) {
                hwf.KS(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void lMd() {
        try {
            KS.COT cot = this.lMd;
            if (cot != null) {
                cot.lMd(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public final void zp(KS.COT cot) {
        this.lMd = cot;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public final void zp(KS.lMd lmd) {
        this.KS = lmd;
    }

    public final boolean lMd(int i9, int i10) {
        try {
            KS.jU jUVar = this.ku;
            if (jUVar != null) {
                if (jUVar.lMd(this, i9, i10)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public final void zp(KS.zp zpVar) {
        this.jU = zpVar;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public final void zp(KS.HWF hwf) {
        this.COT = hwf;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public final void zp(KS.InterfaceC0052KS interfaceC0052KS) {
        this.QR = interfaceC0052KS;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public final void zp(KS.jU jUVar) {
        this.ku = jUVar;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public final void zp(KS.QR qr) {
        this.HWF = qr;
    }

    public void zp() {
        this.lMd = null;
        this.jU = null;
        this.KS = null;
        this.COT = null;
        this.HWF = null;
        this.QR = null;
        this.ku = null;
    }

    public final void zp(int i9) {
        try {
            KS.zp zpVar = this.jU;
            if (zpVar != null) {
                zpVar.zp(this, i9);
            }
        } catch (Throwable unused) {
        }
    }

    public final void zp(int i9, int i10, int i11, int i12) {
        try {
            KS.QR qr = this.HWF;
            if (qr != null) {
                qr.zp(this, i9, i10, i11, i12);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean zp(int i9, int i10) {
        try {
            KS.InterfaceC0052KS interfaceC0052KS = this.QR;
            if (interfaceC0052KS != null) {
                if (interfaceC0052KS.zp(this, i9, i10)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void zp(boolean z8) {
        this.zp = z8;
    }
}
