package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z0 extends ak {
    @Override // com.applovin.impl.ak
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new xg(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static we a(xg xgVar) {
        xgVar.d(12);
        int d10 = (xgVar.d() + xgVar.a(12)) - 4;
        xgVar.d(44);
        xgVar.e(xgVar.a(12));
        xgVar.d(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xgVar.d() >= d10) {
                break;
            }
            xgVar.d(48);
            int a = xgVar.a(8);
            xgVar.d(4);
            int d11 = xgVar.d() + xgVar.a(12);
            String str2 = null;
            while (xgVar.d() < d11) {
                int a10 = xgVar.a(8);
                int a11 = xgVar.a(8);
                int d12 = xgVar.d() + a11;
                if (a10 == 2) {
                    int a12 = xgVar.a(16);
                    xgVar.d(8);
                    if (a12 != 3) {
                    }
                    while (xgVar.d() < d12) {
                        str = xgVar.a(xgVar.a(8), Charsets.US_ASCII);
                        int a13 = xgVar.a(8);
                        for (int i10 = 0; i10 < a13; i10++) {
                            xgVar.e(xgVar.a(8));
                        }
                    }
                } else if (a10 == 21) {
                    str2 = xgVar.a(a11, Charsets.US_ASCII);
                }
                xgVar.c(d12 * 8);
            }
            xgVar.c(d11 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new y0(a, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }
}
