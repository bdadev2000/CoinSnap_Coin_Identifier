package u7;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import com.google.common.collect.c2;
import com.google.common.collect.d2;
import com.google.common.collect.e2;
import com.google.common.collect.q2;

/* loaded from: classes3.dex */
public abstract class g {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static com.google.common.collect.r0 a() {
        com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
        com.google.common.collect.m0 m0Var = new com.google.common.collect.m0();
        e2 e2Var = h.f25560e;
        c2 c2Var = e2Var.f12039c;
        if (c2Var == null) {
            c2 c2Var2 = new c2(e2Var, new d2(e2Var.f11938g, 0, e2Var.f11939h));
            e2Var.f12039c = c2Var2;
            c2Var = c2Var2;
        }
        q2 it = c2Var.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (n9.h0.a >= 34 || intValue != 30) {
                if (ba.a.v(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), a)) {
                    m0Var.u(Integer.valueOf(intValue));
                }
            }
        }
        m0Var.u(2);
        return m0Var.y();
    }

    public static int b(int i10, int i11) {
        for (int i12 = 10; i12 > 0; i12--) {
            if (ba.a.v(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(n9.h0.m(i12)).build(), a)) {
                return i12;
            }
        }
        return 0;
    }
}
