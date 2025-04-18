package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0519Cg {
    public static String[] A0J = {"Hx", "VutN6lGbTtI", "", "qYQ0MvWUv8Y", "S03PbS7CBB7Qa9LNqne809kWTfsCcOYT", "wkl2QKty73uWRgng3ylrY2sBCsabW7qE", "iu4lxNjBwDGgTbBIaWVT9T7j7cQi6zNN", "a5Fde8I7YqGVonU3ugZgHcMmcsmCDOtB"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public CP A07;
    public C0518Cf A08;
    public C0651Hz A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    public final long A00(int i10) {
        return this.A0F[i10] + this.A0C[i10];
    }

    public final void A01() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    public final void A02(int i10) {
        C0651Hz c0651Hz = this.A09;
        if (c0651Hz == null || c0651Hz.A07() < i10) {
            this.A09 = new C0651Hz(i10);
        }
        this.A01 = i10;
        this.A0A = true;
        this.A0B = true;
    }

    public final void A03(int i10, int i11) {
        this.A02 = i10;
        this.A00 = i11;
        int[] iArr = this.A0E;
        if (iArr == null || iArr.length < i10) {
            long[] jArr = new long[i10];
            if (A0J[2].length() == 0) {
                String[] strArr = A0J;
                strArr[4] = "ZgUWYZPBUUH4f5IflhoFXt9Z2beMZ7L4";
                strArr[5] = "VeOPEMocQkhcG8xqDUtsqj4H6GWeaBG3";
                this.A0G = jArr;
                this.A0E = new int[i10];
            }
            throw new RuntimeException();
        }
        int[] iArr2 = this.A0D;
        if (iArr2 == null || iArr2.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.A0D = new int[i12];
            if (A0J[0].length() == 2) {
                A0J[1] = "QhoZMJVE40X";
                this.A0C = new int[i12];
                this.A0F = new long[i12];
                this.A0I = new boolean[i12];
                this.A0H = new boolean[i12];
                return;
            }
            throw new RuntimeException();
        }
    }

    public final void A04(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        interfaceC0509Bt.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }

    public final void A05(C0651Hz c0651Hz) {
        c0651Hz.A0c(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }
}
