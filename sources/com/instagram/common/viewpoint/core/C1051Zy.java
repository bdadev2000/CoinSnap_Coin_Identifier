package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1051Zy extends KY {
    public static byte[] A02;
    public final /* synthetic */ C1050Zx A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{14, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C1051Zy(C1050Zx c1050Zx, AtomicBoolean atomicBoolean) {
        this.A00 = c1050Zx;
        this.A01 = atomicBoolean;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C7j c7j;
        long j2;
        C7j c7j2;
        long j3;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(JE.A0H);
                c7j2 = this.A00.A02.A04;
                C6Y c6y = this.A00.A01;
                int i2 = C03256i.A00;
                j3 = this.A00.A02.A00;
                C03256i.A02(c7j2, c6y, i2, A00(11, 14, 1), j3);
                this.A00.A02.A0T();
                this.A00.A00.ABc();
                return;
            }
            this.A00.A02.A0I(JE.A0G);
            c7j = this.A00.A02.A04;
            C6Y c6y2 = this.A00.A01;
            int i3 = C03256i.A04;
            j2 = this.A00.A02.A00;
            C03256i.A02(c7j, c6y2, i3, A00(0, 11, Opcodes.LUSHR), j2);
            this.A00.A02.A0U();
            this.A00.A00.ABT();
        }
    }
}
