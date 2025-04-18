package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Wd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0955Wd implements JJ {
    public static byte[] A04;
    public static String[] A05 = {"HMqNF3eSIzlMBYXVNU3nP1NvWYo5", "x1o785RKTr7Jq0RcU0BPUyycJ3fBjUeE", "GBfmO3K", "Po", "VaaklUluHJvo1XkXnH3kavV5L6d7gpHG", "rG9SvJ3uZ6", "s9MPDvRc6n", "AU4sbnw7bsTTRuLyXll9UaPcK28fS"};
    public static final String A06;
    public ViewOnAttachStateChangeListenerC0956We A00;
    public Cdo<C0613It, C0618Iy> A01;
    public final C1044Zr A02;
    public final C0612Is A03 = C0612Is.A01();

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[1].length() == 18) {
                throw new RuntimeException();
            }
            A05[1] = "YaUcq3PJYQGMSsmKTTLasxzUL6lFeW7O";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ Opcodes.LSHL);
            i5++;
        }
    }

    public static void A02() {
        A04 = new byte[]{79, 115, 126, 59, 118, 126, Byte.MAX_VALUE, 114, 122, 59, 120, 105, 126, 122, 111, 114, 109, 126, 59, 109, 114, 126, 108, 59, 114, 104, 59, 117, 110, 119, 119, 53, 121, 66, 94, 73, 75, 69, 95, 88, 73, 94, 69, 66, 75, 12, 77, 12, 66, 89, 64, 64, 12, 79, 94, 73, 77, 88, 69, 90, 73, 12, 90, 69, 73, 91, 13, 83, 108, 96, 114, 117, 106, 108, 107, 113, 65, 100, 113, 100, 37, 108, 118, 37, 107, 112, 105, 105, 36, 25, 15, 9, 5, 4, 14, 53, 9, 2, 11, 4, 4, 15, 6};
    }

    static {
        A02();
        A06 = C0955Wd.class.getSimpleName();
    }

    public C0955Wd(C1044Zr c1044Zr) {
        this.A02 = c1044Zr;
    }

    private void A01() {
        this.A02.A07().AA0(A00(89, 14, 19), 3600, new C8F(A00(67, 22, 124)));
    }

    @Override // com.instagram.common.viewpoint.core.JJ
    public final void ABh() {
        if (this.A01 != null) {
            this.A01.A04.A00();
        } else {
            A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.JJ
    public final void AE9() {
        if (this.A01 != null) {
            this.A01.A04.A03();
        } else {
            A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.JJ
    public final void AHC(View view) {
        if (this.A01 == null) {
            this.A02.A07().AA0(A00(89, 14, 19), 3600, new C8F(A00(32, 35, 85)));
            return;
        }
        this.A03.A08(view);
    }

    @Override // com.instagram.common.viewpoint.core.JJ
    public final void AHO(View view, String str, boolean z2) {
        AHP(view, str, z2, false);
    }

    @Override // com.instagram.common.viewpoint.core.JJ
    public final void AHP(View view, String str, boolean z2, boolean z3) {
        AHQ(view, str, z2, z3, false);
    }

    @Override // com.instagram.common.viewpoint.core.JJ
    public final void AHQ(View view, String str, boolean z2, boolean z3, boolean z4) {
        if (view != null) {
            this.A00 = new ViewOnAttachStateChangeListenerC0956We(view);
            this.A03.A0A(this.A00, view);
            if (z3) {
                this.A00.A03();
            }
            this.A01 = Cdo.A00(new C0613It(this.A02, view, str, z2, z4), new C0618Iy(), A06).A05(new C0957Wf(new C0954Wc())).A06();
            this.A03.A09(view, this.A01);
            return;
        }
        this.A02.A07().AA0(A00(89, 14, 19), 3600, new C8F(A00(0, 32, 98)));
    }
}
