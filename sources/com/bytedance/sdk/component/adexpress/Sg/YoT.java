package com.bytedance.sdk.component.adexpress.Sg;

import com.bytedance.sdk.component.adexpress.Sg.nc;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class YoT implements nc.YFl {
    private AtomicBoolean AlY = new AtomicBoolean(false);
    private List<nc> Sg;
    EH YFl;
    private NjR tN;

    public YoT(List<nc> list, NjR njR) {
        this.Sg = list;
        this.tN = njR;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc.YFl
    public boolean Sg(nc ncVar) {
        int indexOf = this.Sg.indexOf(ncVar);
        return indexOf < this.Sg.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc.YFl
    public void YFl() {
        this.tN.AlY();
        Iterator<nc> it = this.Sg.iterator();
        while (it.hasNext() && !it.next().YFl(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc.YFl
    public boolean tN() {
        return this.AlY.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc.YFl
    public EH Sg() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc.YFl
    public void YFl(nc ncVar) {
        int indexOf = this.Sg.indexOf(ncVar);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.Sg.size()) {
                return;
            }
        } while (!this.Sg.get(indexOf).YFl(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc.YFl
    public void YFl(EH eh2) {
        this.YFl = eh2;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc.YFl
    public void YFl(boolean z10) {
        this.AlY.getAndSet(z10);
    }
}
