package com.bytedance.sdk.component.QR;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.component.QR.KS.QR;
import com.bytedance.sdk.component.QR.jU.KS;
import com.bytedance.sdk.component.QR.lMd.jU;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.ku;
import com.bytedance.sdk.component.utils.vwr;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class zp {
    private int KS;
    private QR lMd;
    private Bj zp;

    /* renamed from: com.bytedance.sdk.component.QR.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0077zp {
        private Set<String> HWF;
        private Bundle QR;
        boolean jU = true;
        final List<ku> COT = new ArrayList();
        int zp = 10000;
        int lMd = 10000;
        int KS = 10000;

        public C0077zp KS(long j7, TimeUnit timeUnit) {
            this.KS = zp("timeout", j7, timeUnit);
            return this;
        }

        public C0077zp lMd(long j7, TimeUnit timeUnit) {
            this.lMd = zp("timeout", j7, timeUnit);
            return this;
        }

        public C0077zp zp(long j7, TimeUnit timeUnit) {
            this.zp = zp("timeout", j7, timeUnit);
            return this;
        }

        public C0077zp zp(boolean z8) {
            this.jU = z8;
            return this;
        }

        private static int zp(String str, long j7, TimeUnit timeUnit) {
            if (j7 < 0) {
                throw new IllegalArgumentException(o.j(str, " < 0"));
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j7);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(o.j(str, " too large."));
                }
                if (millis != 0 || j7 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(o.j(str, " too small."));
            }
            throw new NullPointerException("unit == null");
        }

        public zp zp() {
            return new zp(this);
        }
    }

    public Bj COT() {
        return this.zp;
    }

    public com.bytedance.sdk.component.QR.lMd.lMd KS() {
        return new com.bytedance.sdk.component.QR.lMd.lMd(this.zp);
    }

    public com.bytedance.sdk.component.QR.lMd.zp jU() {
        return new com.bytedance.sdk.component.QR.lMd.zp(this.zp);
    }

    public jU lMd() {
        return new jU(this.zp);
    }

    public void zp(Context context, boolean z8, com.bytedance.sdk.component.QR.KS.lMd lmd) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (lmd != null) {
            int zp = lmd.zp();
            this.KS = zp;
            QR qr = this.lMd;
            if (qr != null) {
                qr.zp(zp);
            }
            com.bytedance.sdk.component.QR.KS.ku.zp().zp(this.KS).zp(z8);
            com.bytedance.sdk.component.QR.KS.ku.zp().zp(this.KS).zp(lmd);
            com.bytedance.sdk.component.QR.KS.ku.zp().zp(this.KS).zp(context, vwr.zp(context));
            return;
        }
        throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
    }

    private zp(C0077zp c0077zp) {
        Bj.zp zpVar = new Bj.zp();
        long j7 = c0077zp.zp;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Bj.zp lMd = zpVar.zp(j7, timeUnit).KS(c0077zp.KS, timeUnit).lMd(c0077zp.lMd, timeUnit);
        if (c0077zp.jU) {
            QR qr = new QR();
            this.lMd = qr;
            lMd.zp(qr);
        }
        List<ku> list = c0077zp.COT;
        if (list != null && list.size() > 0) {
            Iterator<ku> it = c0077zp.COT.iterator();
            while (it.hasNext()) {
                lMd.zp(it.next());
            }
        }
        if (c0077zp.QR != null) {
            Bundle unused = c0077zp.QR;
        }
        Set unused2 = c0077zp.HWF;
        this.zp = lMd.zp();
    }

    public void zp(Context context, boolean z8) {
        com.bytedance.sdk.component.QR.KS.zp.lMd(true);
        if (zp(context) || (!vwr.zp(context) && z8)) {
            com.bytedance.sdk.component.QR.KS.ku.zp().zp(this.KS, context).jU();
            com.bytedance.sdk.component.QR.KS.ku.zp().zp(this.KS, context).zp();
        }
        if (vwr.zp(context)) {
            com.bytedance.sdk.component.QR.KS.ku.zp().zp(this.KS, context).jU();
            com.bytedance.sdk.component.QR.KS.ku.zp().zp(this.KS, context).zp();
        }
    }

    public static void zp() {
        KS.zp(KS.zp.DEBUG);
    }

    private static boolean zp(Context context) {
        String lMd = vwr.lMd(context);
        if (lMd != null) {
            return lMd.endsWith(":push") || lMd.endsWith(":pushservice");
        }
        return false;
    }
}
