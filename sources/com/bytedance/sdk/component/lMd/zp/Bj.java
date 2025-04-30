package com.bytedance.sdk.component.lMd.zp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class Bj implements Cloneable {
    public TimeUnit COT;
    public long HWF;
    public TimeUnit KS;
    public TimeUnit QR;
    public long jU;
    public long lMd;
    public List<ku> zp;

    public Bj(zp zpVar) {
        this.lMd = zpVar.lMd;
        this.jU = zpVar.jU;
        this.HWF = zpVar.HWF;
        List<ku> list = zpVar.zp;
        this.KS = zpVar.KS;
        this.COT = zpVar.COT;
        this.QR = zpVar.QR;
        this.zp = list;
    }

    public zp lMd() {
        return new zp(this);
    }

    public abstract jU zp();

    public abstract lMd zp(tG tGVar);

    /* loaded from: classes.dex */
    public static final class zp {
        public TimeUnit COT;
        public long HWF;
        public TimeUnit KS;
        public TimeUnit QR;
        public long jU;
        public long lMd;
        public final List<ku> zp;

        public zp() {
            this.zp = new ArrayList();
            this.lMd = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.KS = timeUnit;
            this.jU = 10000L;
            this.COT = timeUnit;
            this.HWF = 10000L;
            this.QR = timeUnit;
        }

        public zp KS(long j7, TimeUnit timeUnit) {
            this.HWF = j7;
            this.QR = timeUnit;
            return this;
        }

        public zp lMd(long j7, TimeUnit timeUnit) {
            this.jU = j7;
            this.COT = timeUnit;
            return this;
        }

        public zp zp(long j7, TimeUnit timeUnit) {
            this.lMd = j7;
            this.KS = timeUnit;
            return this;
        }

        public zp zp(ku kuVar) {
            this.zp.add(kuVar);
            return this;
        }

        public Bj zp() {
            return com.bytedance.sdk.component.lMd.zp.zp.zp.zp(this);
        }

        public zp(String str) {
            this.zp = new ArrayList();
            this.lMd = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.KS = timeUnit;
            this.jU = 10000L;
            this.COT = timeUnit;
            this.HWF = 10000L;
            this.QR = timeUnit;
        }

        public zp(Bj bj) {
            this.zp = new ArrayList();
            this.lMd = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.KS = timeUnit;
            this.jU = 10000L;
            this.COT = timeUnit;
            this.HWF = 10000L;
            this.QR = timeUnit;
            this.lMd = bj.lMd;
            this.KS = bj.KS;
            this.jU = bj.jU;
            this.COT = bj.COT;
            this.HWF = bj.HWF;
            this.QR = bj.QR;
        }
    }
}
