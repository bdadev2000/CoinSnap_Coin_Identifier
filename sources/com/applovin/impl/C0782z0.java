package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.applovin.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782z0 extends ak {
    @Override // com.applovin.impl.ak
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new xg(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static we a(xg xgVar) {
        xgVar.d(12);
        int d2 = (xgVar.d() + xgVar.a(12)) - 4;
        xgVar.d(44);
        xgVar.e(xgVar.a(12));
        xgVar.d(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xgVar.d() >= d2) {
                break;
            }
            xgVar.d(48);
            int a6 = xgVar.a(8);
            xgVar.d(4);
            int d9 = xgVar.d() + xgVar.a(12);
            String str2 = null;
            while (xgVar.d() < d9) {
                int a9 = xgVar.a(8);
                int a10 = xgVar.a(8);
                int d10 = xgVar.d() + a10;
                if (a9 == 2) {
                    int a11 = xgVar.a(16);
                    xgVar.d(8);
                    if (a11 != 3) {
                    }
                    while (xgVar.d() < d10) {
                        str = xgVar.a(xgVar.a(8), Charsets.US_ASCII);
                        int a12 = xgVar.a(8);
                        for (int i9 = 0; i9 < a12; i9++) {
                            xgVar.e(xgVar.a(8));
                        }
                    }
                } else if (a9 == 21) {
                    str2 = xgVar.a(a10, Charsets.US_ASCII);
                }
                xgVar.c(d10 * 8);
            }
            xgVar.c(d9 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new C0778y0(a6, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }
}
