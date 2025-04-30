package com.bytedance.sdk.component.zp;

import com.bytedance.component.sdk.annotation.CallSuper;

/* loaded from: classes.dex */
public abstract class jU<P, R> extends com.bytedance.sdk.component.zp.lMd<P, R> {
    private HWF KS;
    private zp lMd;
    private boolean zp = true;

    /* loaded from: classes.dex */
    public interface lMd {
        jU zp();
    }

    /* loaded from: classes.dex */
    public interface zp {
        void zp(Object obj);

        void zp(Throwable th);
    }

    private boolean HWF() {
        if (!this.zp) {
            YW.zp(new IllegalStateException("Jsb async call already finished: " + zp() + ", hashcode: " + hashCode()));
            return false;
        }
        return true;
    }

    public void COT() {
        jU();
    }

    public final void KS() {
        zp((Throwable) null);
    }

    @CallSuper
    public void jU() {
        this.zp = false;
        this.KS = null;
    }

    @Override // com.bytedance.sdk.component.zp.lMd
    public /* bridge */ /* synthetic */ String zp() {
        return super.zp();
    }

    public abstract void zp(P p2, HWF hwf) throws Exception;

    public final void zp(R r9) {
        if (HWF()) {
            this.lMd.zp(r9);
            jU();
        }
    }

    public final void zp(Throwable th) {
        if (HWF()) {
            this.lMd.zp(th);
            jU();
        }
    }

    public void zp(P p2, HWF hwf, zp zpVar) throws Exception {
        this.KS = hwf;
        this.lMd = zpVar;
        zp(p2, hwf);
    }
}
