package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1085Cg {
    public static String[] A0J = {"Hx", "VutN6lGbTtI", "", "qYQ0MvWUv8Y", "S03PbS7CBB7Qa9LNqne809kWTfsCcOYT", "wkl2QKty73uWRgng3ylrY2sBCsabW7qE", "iu4lxNjBwDGgTbBIaWVT9T7j7cQi6zNN", "a5Fde8I7YqGVonU3ugZgHcMmcsmCDOtB"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public CP A07;
    public C1084Cf A08;
    public C1217Hz A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    public final long A00(int i9) {
        return this.A0F[i9] + this.A0C[i9];
    }

    public final void A01() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    public final void A02(int i9) {
        C1217Hz c1217Hz = this.A09;
        if (c1217Hz == null || c1217Hz.A07() < i9) {
            this.A09 = new C1217Hz(i9);
        }
        this.A01 = i9;
        this.A0A = true;
        this.A0B = true;
    }

    public final void A03(int i9, int i10) {
        this.A02 = i9;
        this.A00 = i10;
        int[] iArr = this.A0E;
        if (iArr == null || iArr.length < i9) {
            long[] jArr = new long[i9];
            if (A0J[2].length() == 0) {
                String[] strArr = A0J;
                strArr[4] = "ZgUWYZPBUUH4f5IflhoFXt9Z2beMZ7L4";
                strArr[5] = "VeOPEMocQkhcG8xqDUtsqj4H6GWeaBG3";
                this.A0G = jArr;
                this.A0E = new int[i9];
            }
            throw new RuntimeException();
        }
        int[] iArr2 = this.A0D;
        if (iArr2 == null || iArr2.length < i10) {
            int i11 = (i10 * 125) / 100;
            this.A0D = new int[i11];
            if (A0J[0].length() == 2) {
                A0J[1] = "QhoZMJVE40X";
                this.A0C = new int[i11];
                this.A0F = new long[i11];
                this.A0I = new boolean[i11];
                this.A0H = new boolean[i11];
                return;
            }
            throw new RuntimeException();
        }
    }

    public final void A04(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        interfaceC1075Bt.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }

    public final void A05(C1217Hz c1217Hz) {
        c1217Hz.A0c(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }
}
