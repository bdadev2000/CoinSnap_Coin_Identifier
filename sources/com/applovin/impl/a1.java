package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a1 extends dk {
    @Override // com.applovin.impl.dk
    public bf a(ef efVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new ah(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static bf a(ah ahVar) {
        ahVar.d(12);
        int d = (ahVar.d() + ahVar.a(12)) - 4;
        ahVar.d(44);
        ahVar.e(ahVar.a(12));
        ahVar.d(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (ahVar.d() >= d) {
                break;
            }
            ahVar.d(48);
            int a2 = ahVar.a(8);
            ahVar.d(4);
            int d2 = ahVar.d() + ahVar.a(12);
            String str2 = null;
            while (ahVar.d() < d2) {
                int a3 = ahVar.a(8);
                int a4 = ahVar.a(8);
                int d3 = ahVar.d() + a4;
                if (a3 == 2) {
                    int a5 = ahVar.a(16);
                    ahVar.d(8);
                    if (a5 != 3) {
                    }
                    while (ahVar.d() < d3) {
                        str = ahVar.a(ahVar.a(8), Charsets.US_ASCII);
                        int a6 = ahVar.a(8);
                        for (int i2 = 0; i2 < a6; i2++) {
                            ahVar.e(ahVar.a(8));
                        }
                    }
                } else if (a3 == 21) {
                    str2 = ahVar.a(a4, Charsets.US_ASCII);
                }
                ahVar.c(d3 * 8);
            }
            ahVar.c(d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new z0(a2, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new bf(arrayList);
    }
}
