package com.bytedance.sdk.component.adexpress.lMd;

import com.bytedance.sdk.component.adexpress.lMd.dT;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class vDp implements dT.zp {
    private YW KS;
    private AtomicBoolean jU = new AtomicBoolean(false);
    private List<dT> lMd;
    dQp zp;

    public vDp(List<dT> list, YW yw) {
        this.lMd = list;
        this.KS = yw;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT.zp
    public boolean KS() {
        return this.jU.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT.zp
    public boolean lMd(dT dTVar) {
        int indexOf = this.lMd.indexOf(dTVar);
        return indexOf < this.lMd.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT.zp
    public void zp() {
        this.KS.jU();
        Iterator<dT> it = this.lMd.iterator();
        while (it.hasNext() && !it.next().zp(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT.zp
    public dQp lMd() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT.zp
    public void zp(dT dTVar) {
        int indexOf = this.lMd.indexOf(dTVar);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.lMd.size()) {
                return;
            }
        } while (!this.lMd.get(indexOf).zp(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT.zp
    public void zp(dQp dqp) {
        this.zp = dqp;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT.zp
    public void zp(boolean z8) {
        this.jU.getAndSet(z8);
    }
}
