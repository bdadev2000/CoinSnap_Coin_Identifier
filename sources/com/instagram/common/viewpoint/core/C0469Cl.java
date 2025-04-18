package com.instagram.common.viewpoint.core;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Cl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0469Cl {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public CU A07;
    public C0468Ck A08;
    public I4 A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    public final long A00(int i2) {
        return this.A0F[i2] + this.A0C[i2];
    }

    public final void A01() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    public final void A02(int i2) {
        if (this.A09 == null || this.A09.A07() < i2) {
            this.A09 = new I4(i2);
        }
        this.A01 = i2;
        this.A0A = true;
        this.A0B = true;
    }

    public final void A03(int i2, int i3) {
        this.A02 = i2;
        this.A00 = i3;
        if (this.A0E == null || this.A0E.length < i2) {
            this.A0G = new long[i2];
            this.A0E = new int[i2];
        }
        if (this.A0D == null || this.A0D.length < i3) {
            int i4 = (i3 * Opcodes.LUSHR) / 100;
            this.A0D = new int[i4];
            this.A0C = new int[i4];
            this.A0F = new long[i4];
            this.A0I = new boolean[i4];
            this.A0H = new boolean[i4];
        }
    }

    public final void A04(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        interfaceC0456By.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }

    public final void A05(I4 i4) {
        i4.A0c(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }
}
