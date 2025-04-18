package com.bytedance.sdk.component.DSW;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.component.DSW.AlY.tN;
import com.bytedance.sdk.component.DSW.Sg.AlY;
import com.bytedance.sdk.component.DSW.tN.DSW;
import com.bytedance.sdk.component.Sg.YFl.eT;
import com.bytedance.sdk.component.Sg.YFl.qsH;
import com.bytedance.sdk.component.utils.lG;
import eb.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class YFl {
    private DSW Sg;
    private eT YFl;
    private int tN;

    /* renamed from: com.bytedance.sdk.component.DSW.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0075YFl {
        private Bundle DSW;

        /* renamed from: vc, reason: collision with root package name */
        private Set<String> f10313vc;
        boolean AlY = true;
        final List<qsH> wN = new ArrayList();
        int YFl = 10000;
        int Sg = 10000;
        int tN = 10000;

        public C0075YFl tN(long j3, TimeUnit timeUnit) {
            this.tN = YFl("timeout", j3, timeUnit);
            return this;
        }

        public C0075YFl Sg(long j3, TimeUnit timeUnit) {
            this.Sg = YFl("timeout", j3, timeUnit);
            return this;
        }

        public C0075YFl YFl(long j3, TimeUnit timeUnit) {
            this.YFl = YFl("timeout", j3, timeUnit);
            return this;
        }

        public C0075YFl YFl(boolean z10) {
            this.AlY = z10;
            return this;
        }

        private static int YFl(String str, long j3, TimeUnit timeUnit) {
            if (j3 < 0) {
                throw new IllegalArgumentException(j.k(str, " < 0"));
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j3);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(j.k(str, " too large."));
                }
                if (millis != 0 || j3 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(j.k(str, " too small."));
            }
            throw new NullPointerException("unit == null");
        }

        public YFl YFl() {
            return new YFl(this);
        }
    }

    public com.bytedance.sdk.component.DSW.Sg.YFl AlY() {
        return new com.bytedance.sdk.component.DSW.Sg.YFl(this.YFl);
    }

    public AlY Sg() {
        return new AlY(this.YFl);
    }

    public void YFl(Context context, boolean z10, com.bytedance.sdk.component.DSW.tN.Sg sg2) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (sg2 != null) {
            int YFl = sg2.YFl();
            this.tN = YFl;
            DSW dsw = this.Sg;
            if (dsw != null) {
                dsw.YFl(YFl);
            }
            com.bytedance.sdk.component.DSW.tN.qsH.YFl().YFl(this.tN).YFl(z10);
            com.bytedance.sdk.component.DSW.tN.qsH.YFl().YFl(this.tN).YFl(sg2);
            com.bytedance.sdk.component.DSW.tN.qsH.YFl().YFl(this.tN).YFl(context, lG.YFl(context));
            return;
        }
        throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
    }

    public com.bytedance.sdk.component.DSW.Sg.Sg tN() {
        return new com.bytedance.sdk.component.DSW.Sg.Sg(this.YFl);
    }

    public eT wN() {
        return this.YFl;
    }

    private YFl(C0075YFl c0075YFl) {
        eT.YFl yFl = new eT.YFl();
        long j3 = c0075YFl.YFl;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        eT.YFl Sg = yFl.YFl(j3, timeUnit).tN(c0075YFl.tN, timeUnit).Sg(c0075YFl.Sg, timeUnit);
        if (c0075YFl.AlY) {
            DSW dsw = new DSW();
            this.Sg = dsw;
            Sg.YFl(dsw);
        }
        List<qsH> list = c0075YFl.wN;
        if (list != null && list.size() > 0) {
            Iterator<qsH> it = c0075YFl.wN.iterator();
            while (it.hasNext()) {
                Sg.YFl(it.next());
            }
        }
        if (c0075YFl.DSW != null) {
            Bundle unused = c0075YFl.DSW;
        }
        Set unused2 = c0075YFl.f10313vc;
        this.YFl = Sg.YFl();
    }

    public void YFl(Context context, boolean z10) {
        com.bytedance.sdk.component.DSW.tN.YFl.Sg(true);
        if (YFl(context) || (!lG.YFl(context) && z10)) {
            com.bytedance.sdk.component.DSW.tN.qsH.YFl().YFl(this.tN, context).AlY();
            com.bytedance.sdk.component.DSW.tN.qsH.YFl().YFl(this.tN, context).YFl();
        }
        if (lG.YFl(context)) {
            com.bytedance.sdk.component.DSW.tN.qsH.YFl().YFl(this.tN, context).AlY();
            com.bytedance.sdk.component.DSW.tN.qsH.YFl().YFl(this.tN, context).YFl();
        }
    }

    public static void YFl() {
        tN.YFl(tN.YFl.DEBUG);
    }

    private static boolean YFl(Context context) {
        String Sg = lG.Sg(context);
        if (Sg != null) {
            return Sg.endsWith(":push") || Sg.endsWith(":pushservice");
        }
        return false;
    }
}
