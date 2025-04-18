package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
final class am implements FastKV.a<Set<String>> {
    static final am a = new am();

    private am() {
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final String a() {
        return "StringSet";
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final /* synthetic */ byte[] a(Set<String> set) {
        Set<String> set2 = set;
        if (set2.isEmpty()) {
            return new byte[0];
        }
        int size = set2.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (String str : set2) {
            if (str == null) {
                i10 += 5;
                iArr[i11] = -1;
            } else {
                int a10 = p.a(str);
                strArr[i11] = str;
                iArr[i11] = a10;
                i10 = ((a10 >> 7) == 0 ? 1 : (a10 >> 14) == 0 ? 2 : (a10 >> 21) == 0 ? 3 : (a10 >> 28) == 0 ? 4 : 5) + a10 + i10;
            }
            i11++;
        }
        p pVar = new p(i10);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            int i14 = pVar.f13633b;
            int i15 = i13;
            while ((i15 & (-128)) != 0) {
                pVar.a[i14] = (byte) ((i15 & 127) | 128);
                i15 >>>= 7;
                i14++;
            }
            pVar.a[i14] = (byte) i15;
            pVar.f13633b = i14 + 1;
            if (i13 >= 0) {
                pVar.b(strArr[i12]);
            }
        }
        return pVar.a;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final /* synthetic */ Set<String> a(byte[] bArr, int i10, int i11) {
        int i12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i11 > 0) {
            p pVar = new p(bArr, i10);
            int i13 = i10 + i11;
            while (true) {
                i12 = pVar.f13633b;
                if (i12 >= i13) {
                    break;
                }
                byte[] bArr2 = pVar.a;
                int i14 = i12 + 1;
                pVar.f13633b = i14;
                int i15 = bArr2[i12];
                if ((i15 >> 7) != 0) {
                    int i16 = i14 + 1;
                    pVar.f13633b = i16;
                    i15 = (i15 & 127) | (bArr2[i14] << 7);
                    if ((i15 >> 14) != 0) {
                        int i17 = i16 + 1;
                        pVar.f13633b = i17;
                        i15 = (i15 & 16383) | (bArr2[i16] << 14);
                        if ((i15 >> 21) != 0) {
                            int i18 = i17 + 1;
                            pVar.f13633b = i18;
                            i15 = (i15 & 2097151) | (bArr2[i17] << 21);
                            if ((i15 >> 28) != 0) {
                                pVar.f13633b = i18 + 1;
                                i15 = (i15 & 268435455) | (bArr2[i18] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(pVar.a(i15));
            }
            if (i12 != i13) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}
