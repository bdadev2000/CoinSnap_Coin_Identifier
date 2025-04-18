package com.bytedance.sdk.component.YFl;

import com.bytedance.component.sdk.annotation.CallSuper;

/* loaded from: classes.dex */
public abstract class AlY<P, R> extends com.bytedance.sdk.component.YFl.Sg<P, R> {
    private YFl Sg;
    private boolean YFl = true;
    private vc tN;

    /* loaded from: classes.dex */
    public interface Sg {
        AlY YFl();
    }

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(Object obj);

        void YFl(Throwable th2);
    }

    private boolean vc() {
        if (!this.YFl) {
            NjR.YFl(new IllegalStateException("Jsb async call already finished: " + YFl() + ", hashcode: " + hashCode()));
            return false;
        }
        return true;
    }

    @CallSuper
    public void AlY() {
        this.YFl = false;
        this.tN = null;
    }

    @Override // com.bytedance.sdk.component.YFl.Sg
    public /* bridge */ /* synthetic */ String YFl() {
        return super.YFl();
    }

    public abstract void YFl(P p10, vc vcVar) throws Exception;

    public final void tN() {
        YFl((Throwable) null);
    }

    public void wN() {
        AlY();
    }

    public final void YFl(R r6) {
        if (vc()) {
            this.Sg.YFl(r6);
            AlY();
        }
    }

    public final void YFl(Throwable th2) {
        if (vc()) {
            this.Sg.YFl(th2);
            AlY();
        }
    }

    public void YFl(P p10, vc vcVar, YFl yFl) throws Exception {
        this.tN = vcVar;
        this.Sg = yFl;
        YFl(p10, vcVar);
    }
}
