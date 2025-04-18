package com.bytedance.sdk.component.wN.tN;

import android.content.Context;
import com.bytedance.sdk.component.wN.GA;
import com.bytedance.sdk.component.wN.Wwa;
import com.bytedance.sdk.component.wN.YoT;
import com.bytedance.sdk.component.wN.lG;
import com.bytedance.sdk.component.wN.qO;
import com.bytedance.sdk.component.wN.wXo;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class wN implements GA {
    private Wwa AlY;
    private lG DSW;
    private wXo NjR;
    private ExecutorService Sg;
    private YoT YFl;
    private com.bytedance.sdk.component.wN.Sg qsH;
    private com.bytedance.sdk.component.wN.AlY tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.wN.tN f10484vc;
    private qO wN;

    /* loaded from: classes.dex */
    public static class YFl {
        private Wwa AlY;
        private lG DSW;
        private wXo NjR;
        private ExecutorService Sg;
        private YoT YFl;
        private com.bytedance.sdk.component.wN.Sg qsH;
        private com.bytedance.sdk.component.wN.AlY tN;

        /* renamed from: vc, reason: collision with root package name */
        private com.bytedance.sdk.component.wN.tN f10485vc;
        private qO wN;

        public YFl YFl(com.bytedance.sdk.component.wN.Sg sg2) {
            this.qsH = sg2;
            return this;
        }

        public YFl YFl(wXo wxo) {
            this.NjR = wxo;
            return this;
        }

        public YFl YFl(com.bytedance.sdk.component.wN.AlY alY) {
            this.tN = alY;
            return this;
        }

        public wN YFl() {
            return new wN(this);
        }
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public com.bytedance.sdk.component.wN.AlY AlY() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public com.bytedance.sdk.component.wN.tN DSW() {
        return this.f10484vc;
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public com.bytedance.sdk.component.wN.Sg NjR() {
        return this.qsH;
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public ExecutorService Sg() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public YoT YFl() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public lG qsH() {
        return this.DSW;
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public wXo tN() {
        return this.NjR;
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public qO vc() {
        return this.wN;
    }

    @Override // com.bytedance.sdk.component.wN.GA
    public Wwa wN() {
        return this.AlY;
    }

    private wN(YFl yFl) {
        this.YFl = yFl.YFl;
        this.Sg = yFl.Sg;
        this.tN = yFl.tN;
        this.AlY = yFl.AlY;
        this.wN = yFl.wN;
        this.f10484vc = yFl.f10485vc;
        this.qsH = yFl.qsH;
        this.DSW = yFl.DSW;
        this.NjR = yFl.NjR;
    }

    public static wN YFl(Context context) {
        return new YFl().YFl();
    }
}
