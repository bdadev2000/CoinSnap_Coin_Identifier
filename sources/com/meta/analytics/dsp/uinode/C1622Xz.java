package com.meta.analytics.dsp.uinode;

import android.os.SystemClock;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1622Xz implements InterfaceC1048As {
    public static byte[] A01;
    public static String[] A02 = {"uFnK", "23brwyJGPu3ZknDoMNdw3hVXVLFEULQy", "FtMR8ROvDO4Zz8SuhvbrIDHAZ1hbcqSx", "4tDbtxEkY45WyXaQwFKWRvOHK17MthWz", "P3L0", "jQPyzSgXTRUrKPul", "L4bq6z2eevSU7Qg95t0o6YCr4fHdh5", "Io3idew6HPzrUVEIzO8xEfp6xkmYSMtW"};
    public final /* synthetic */ C1621Xy A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() == 27) {
                throw new RuntimeException();
            }
            A02[5] = "3SKjhf7gYf6c2NzhB";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 109);
            i12++;
        }
    }

    public static void A01() {
        A01 = new byte[]{109, 97, 92, 104, 121, 116, 114, 73, 111, 124, 126, 118, Ascii.DC2, 60, 53, 52, 41, 50, 53, 60, 123, 50, 54, 43, 52, 40, 40, 50, 57, 55, 34, 123, 55, 58, 41, 60, 62, 123, 58, 46, 63, 50, 52, 123, 55, 58, 47, 62, 53, 56, 34, 97, 123, 35, 0, 5, 2, Ascii.EM, Ascii.US, 5, 3, 80, 17, 5, Ascii.DC4, Ascii.EM, Ascii.US, 80, 4, Ascii.EM, Ascii.GS, Ascii.NAK, 3, 4, 17, Ascii.GS, 0, 80, 88, Ascii.SYN, 2, 17, Ascii.GS, Ascii.NAK, 80, 0, Ascii.US, 3, Ascii.EM, 4, Ascii.EM, Ascii.US, Ascii.RS, 80, Ascii.GS, Ascii.EM, 3, Ascii.GS, 17, 4, 19, Ascii.CAN, 89, 74, 80, 79, 108, 105, 110, 117, 115, 105, 111, 60, 125, 105, 120, 117, 115, 60, 104, 117, 113, 121, 111, 104, 125, 113, 108, 60, 52, 111, 101, 111, 104, 121, 113, 60, Ascii.DEL, 112, 115, Ascii.DEL, 119, 60, 113, 117, 111, 113, 125, 104, Ascii.DEL, 116, 53, 38, 60};
    }

    static {
        A01();
    }

    public C1622Xz(C1621Xy c1621Xy) {
        this.A00 = c1621Xy;
    }

    public /* synthetic */ C1622Xz(C1621Xy c1621Xy, C1051Av c1051Av) {
        this(c1621Xy);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1048As
    public final void ABv(long j7) {
        Log.w(A00(2, 10, 112), A00(12, 41, 54) + j7);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1048As
    public final void ACi(long j7, long j9, long j10, long j11) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(53, 52, 29)).append(j7);
        String A00 = A00(0, 2, 44);
        StringBuilder append2 = append.append(A00).append(j9).append(A00).append(j10).append(A00).append(j11).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb = append3.append(A04).toString();
        if (!C1621Xy.A0q) {
            String message = A00(2, 10, 112);
            Log.w(message, sb);
            return;
        }
        throw new C1054Ay(sb, null);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1048As
    public final void ADH(long j7, long j9, long j10, long j11) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(105, 50, 113)).append(j7);
        String A00 = A00(0, 2, 44);
        StringBuilder append2 = append.append(A00).append(j9).append(A00).append(j10).append(A00).append(j11).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb = append3.append(A04).toString();
        if (C1621Xy.A0q) {
            throw new C1054Ay(sb, null);
        }
        String[] strArr = A02;
        String str = strArr[4];
        String message = strArr[0];
        if (str.length() != message.length()) {
            throw new RuntimeException();
        }
        A02[3] = "q4b4TTgkvPPQBYTsQFxk23ASltXkXf65";
        String message2 = A00(2, 10, 112);
        Log.w(message2, sb);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1048As
    public final void ADQ(int i9, long j7) {
        InterfaceC1042Am interfaceC1042Am;
        long j9;
        InterfaceC1042Am interfaceC1042Am2;
        interfaceC1042Am = this.A00.A0R;
        if (interfaceC1042Am != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j9 = this.A00.A0E;
            long j10 = elapsedRealtime - j9;
            interfaceC1042Am2 = this.A00.A0R;
            interfaceC1042Am2.ADR(i9, j7, j10);
        }
    }
}
