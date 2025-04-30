package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1510Tn implements L8 {
    public static byte[] A0B;
    public static String[] A0C = {"yjxjfYdrUuNcQdEaAwocONv5EWPutnE0", "dRlwVer0DvGhJUYrc6Uo0NmXUudA179W", "0RnVmJRwwZudZEhL6bHsgo2zllxyZ4rb", "m0b7Xk04EuyV6HvP3aQ0qivYD5xsobzk", "0t24jhYDd0ZYm7OB5Pi8K72QIL3VEz", "lOzGJRW4wb6yqjR22F", "IF7HB2KmjMtnMILVYc8NomcIB26UEqSU", "4w4SFr7wcyEc7Fy4rwfiYpUJCop0r4V7"};
    public int A00;
    public int A01;
    public int A02;
    public MB A03;
    public String A04;
    public String A05;
    public ViewOnClickListenerC1508Tl A06;
    public boolean A0A = false;
    public boolean A09 = false;
    public boolean A08 = false;
    public Integer A07 = null;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-69, -45, -59, -61, -45, -67, -18, 2, 1, -4, -16, -7, -10, -16, -8};
        if (A0C[5].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[7] = "4rqaLE5ZbqFcULNB9c87AdfXRmFVNOuy";
        strArr[0] = "UmGixQziu9kcJVx2wygXDh2bknYXJmsp";
        A0B = bArr;
    }

    static {
        A01();
    }

    public C1510Tn(int i9, int i10, int i11, String str, String str2, MB mb, ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl) {
        this.A01 = i9;
        this.A00 = i10;
        this.A02 = i11;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = mb;
        this.A06 = viewOnClickListenerC1508Tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (this.A08) {
            A04();
        }
    }

    public final synchronized void A04() {
        MB mb;
        if (this.A09) {
            return;
        }
        this.A09 = true;
        if (this.A01 == 1 && (mb = this.A03) != null) {
            mb.setProgressImage(null);
            this.A03.setProgressClickListener(null);
            this.A03.setToolbarActionMessage(A00(0, 0, 115));
            this.A03.A04();
            Integer num = this.A07;
            if (num != null) {
                this.A03.setToolbarActionMode(num.intValue());
            }
            if (this.A06.getColorInfo() != null) {
                this.A03.A06(this.A06.getColorInfo(), false);
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final synchronized void ABA() {
        if (!this.A09) {
            this.A06.A09(A00(6, 9, 97));
        }
        A04();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final synchronized void ACm(float f9) {
        MB mb;
        if (!this.A09 && (mb = this.A03) != null) {
            if (this.A01 == 1) {
                if (!this.A0A) {
                    this.A07 = Integer.valueOf(mb.getToolbarActionMode());
                    this.A03.setProgressClickListener(new ViewOnClickListenerC1356Np(this));
                    this.A03.A05();
                    this.A03.setToolbarListener(new C1511To(this));
                    this.A0A = true;
                    Integer num = this.A07;
                    if (num == null || num.intValue() == 4) {
                        this.A03.setToolbarActionMode(5);
                    } else {
                        this.A03.setToolbarActionMode(6);
                    }
                }
                if (f9 <= this.A02) {
                    if (!this.A08) {
                        this.A08 = true;
                        Integer num2 = this.A07;
                        if (num2 == null || num2.intValue() == 4) {
                            this.A03.setToolbarActionMode(7);
                        } else {
                            this.A03.setProgressImage(EnumC1311Lw.CROSS);
                            this.A03.setToolbarActionMode(6);
                        }
                    }
                    this.A03.setToolbarActionMessage(this.A04.replace(A00(0, 6, 52), String.valueOf((int) Math.ceil(f9))));
                } else {
                    this.A03.setToolbarActionMessage(this.A05);
                }
            }
        }
    }
}
