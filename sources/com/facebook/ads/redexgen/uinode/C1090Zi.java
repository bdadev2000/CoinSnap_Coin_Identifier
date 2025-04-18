package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1090Zi implements AnonymousClass48 {
    public static byte[] A01;
    public static String[] A02 = {"46YXIWmMPzvDd0obWRnJ4BqqVPRLtWBw", "gh8OkU42ZlKkobP3JZNpp9ULZO5A8ZhR", "pYzKTcWKS", "s80LPKQojprV6sWgUGQ2HgvoHgQNhHA6", "mXkvahQSLAFHEVEVhsUobK6", "jBm2h6b3G4Mz5Atqbj4RgeaplM7i81Ud", "dS7v9a2czFlDs6aC1vqF8J", "Ti7FTP9Lv4Lzv8sgvsknxkrAm3hOTwvH"};
    public final /* synthetic */ C0553Eb A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 124;
            if (A02[6].length() != 22) {
                throw new RuntimeException();
            }
            A02[2] = "fZFgh8O1A";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{48, 58, 49};
    }

    static {
        A01();
    }

    public C1090Zi(C0553Eb c0553Eb) {
        this.A00 = c0553Eb;
    }

    private final void A02(AnonymousClass49 anonymousClass49) {
        throw new NullPointerException(A00(0, 3, 81));
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass48
    public final void ABK(AnonymousClass49 anonymousClass49) {
        A02(anonymousClass49);
        throw null;
    }
}
