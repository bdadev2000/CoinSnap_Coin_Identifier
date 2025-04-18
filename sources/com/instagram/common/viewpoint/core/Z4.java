package com.instagram.common.viewpoint.core;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Z4 implements InterfaceC0431Ax {
    public static byte[] A01;
    public final /* synthetic */ Z3 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 9);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, 44, -97, -45, -62, -57, -51, -78, -48, -65, -63, -55, -90, -60, -53, -52, -49, -58, -53, -60, 125, -58, -54, -51, -52, -48, -48, -58, -65, -55, -42, 125, -55, -66, -49, -60, -62, 125, -66, -46, -63, -58, -52, 125, -55, -66, -47, -62, -53, -64, -42, -105, 125, -92, -63, -58, -61, -70, -64, -58, -60, 113, -78, -58, -75, -70, -64, 113, -59, -70, -66, -74, -60, -59, -78, -66, -63, 113, 121, -73, -61, -78, -66, -74, 113, -63, -64, -60, -70, -59, -70, -64, -65, 113, -66, -70, -60, -66, -78, -59, -76, -71, 122, -117, 113, 118, -109, -104, -107, -116, -110, -104, -106, 67, -124, -104, -121, -116, -110, 67, -105, -116, -112, -120, -106, -105, -124, -112, -109, 67, 75, -106, -100, -106, -105, -120, -112, 67, -122, -113, -110, -122, -114, 67, -112, -116, -106, -112, -124, -105, -122, -117, 76, 93, 67};
    }

    public Z4(Z3 z3) {
        this.A00 = z3;
    }

    public /* synthetic */ Z4(Z3 z3, B0 b02) {
        this(z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0431Ax
    public final void ACM(long j2) {
        Log.w(A00(2, 10, 85), A00(12, 41, 84) + j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0431Ax
    public final void ADB(long j2, long j3, long j4, long j5) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(53, 52, 72)).append(j2);
        String A00 = A00(0, 2, 3);
        StringBuilder append2 = append.append(A00).append(j3).append(A00).append(j4).append(A00).append(j5).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb = append3.append(A04).toString();
        if (!Z3.A0q) {
            String message = A00(2, 10, 85);
            Log.w(message, sb);
            return;
        }
        throw new B3(sb, null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0431Ax
    public final void ADk(long j2, long j3, long j4, long j5) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(105, 50, 26)).append(j2);
        String A00 = A00(0, 2, 3);
        StringBuilder append2 = append.append(A00).append(j3).append(A00).append(j4).append(A00).append(j5).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb = append3.append(A04).toString();
        if (!Z3.A0q) {
            String message = A00(2, 10, 85);
            Log.w(message, sb);
            return;
        }
        throw new B3(sb, null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0431Ax
    public final void ADt(int i2, long j2) {
        InterfaceC0425Ar interfaceC0425Ar;
        long j3;
        InterfaceC0425Ar interfaceC0425Ar2;
        interfaceC0425Ar = this.A00.A0R;
        if (interfaceC0425Ar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j3 = this.A00.A0E;
            long j4 = elapsedRealtime - j3;
            interfaceC0425Ar2 = this.A00.A0R;
            interfaceC0425Ar2.ADu(i2, j2, j4);
        }
    }
}
