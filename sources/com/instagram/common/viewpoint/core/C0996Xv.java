package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Xv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0996Xv implements DB {
    public static String[] A02 = {"P6LxKoX3hqiFMmAIVR7OeJXIbWgxygGh", "pjME3bsyRopZ", "UEFZUDYTuEaf1GJh0Avn4lO8zugM0IPU", "QWMZsQufQnd6YIT4vE0", "2ZdVdRUPEYe784hkDnclgg", "W0NJjabFUAVEfXxfEuVWrnE41t6CnKuf", "UPQ2VibD02RiukY0QWB9ET1KfDzYUrsx", "MLswwOzvsn6Vmil0MDYnNWAJpg07qpL1"};
    public final I3 A00 = new I3(new byte[4]);
    public final /* synthetic */ C0994Xt A01;

    public C0996Xv(C0994Xt c0994Xt) {
        this.A01 = c0994Xt;
    }

    @Override // com.instagram.common.viewpoint.core.DB
    public final void A4n(I4 i4) {
        int programCount;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int tableId = i4.A0E();
        if (tableId != 0) {
            return;
        }
        i4.A0Z(7);
        int A04 = i4.A04();
        if (A02[5].charAt(15) == 'T') {
            throw new RuntimeException();
        }
        A02[5] = "xK6ZRV35PXGEsGGPsJooK7TgqadUik0x";
        int i2 = A04 / 4;
        for (int i3 = 0; i3 < i2; i3++) {
            i4.A0a(this.A00, 4);
            int i5 = this.A00.A04(16);
            this.A00.A08(3);
            if (i5 == 0) {
                this.A00.A08(13);
            } else {
                int A042 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(A042, new C0999Xy(new C0995Xu(this.A01, A042)));
                C0994Xt.A01(this.A01);
            }
        }
        programCount = this.A01.A05;
        if (programCount != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.DB
    public final void A9F(IG ig, InterfaceC0457Bz interfaceC0457Bz, DH dh) {
    }
}
