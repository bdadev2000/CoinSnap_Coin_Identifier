package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class am implements FastKV.a<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    static final am f16025a = new am();

    private am() {
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
        int i9 = 0;
        int i10 = 0;
        for (String str : set2) {
            if (str == null) {
                i9 += 5;
                iArr[i10] = -1;
            } else {
                int a6 = p.a(str);
                strArr[i10] = str;
                iArr[i10] = a6;
                i9 = ((a6 >> 7) == 0 ? 1 : (a6 >> 14) == 0 ? 2 : (a6 >> 21) == 0 ? 3 : (a6 >> 28) == 0 ? 4 : 5) + a6 + i9;
            }
            i10++;
        }
        p pVar = new p(i9);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            int i13 = pVar.b;
            int i14 = i12;
            while ((i14 & (-128)) != 0) {
                pVar.f16073a[i13] = (byte) ((i14 & 127) | 128);
                i14 >>>= 7;
                i13++;
            }
            pVar.f16073a[i13] = (byte) i14;
            pVar.b = i13 + 1;
            if (i12 >= 0) {
                pVar.b(strArr[i11]);
            }
        }
        return pVar.f16073a;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final String a() {
        return "StringSet";
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final /* synthetic */ Set<String> a(byte[] bArr, int i9, int i10) {
        int i11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i10 > 0) {
            p pVar = new p(bArr, i9);
            int i12 = i9 + i10;
            while (true) {
                i11 = pVar.b;
                if (i11 >= i12) {
                    break;
                }
                byte[] bArr2 = pVar.f16073a;
                int i13 = i11 + 1;
                pVar.b = i13;
                int i14 = bArr2[i11];
                if ((i14 >> 7) != 0) {
                    int i15 = i11 + 2;
                    pVar.b = i15;
                    i14 = (i14 & 127) | (bArr2[i13] << 7);
                    if ((i14 >> 14) != 0) {
                        int i16 = i14 & 16383;
                        int i17 = i11 + 3;
                        pVar.b = i17;
                        int i18 = i16 | (bArr2[i15] << 14);
                        if ((i18 >> 21) == 0) {
                            i14 = i18;
                        } else {
                            int i19 = i11 + 4;
                            pVar.b = i19;
                            i14 = (bArr2[i17] << 21) | (i18 & 2097151);
                            if ((i14 >> 28) != 0) {
                                pVar.b = i11 + 5;
                                i14 = (268435455 & i14) | (bArr2[i19] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(pVar.a(i14));
            }
            if (i11 != i12) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}
