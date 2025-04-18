package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: classes4.dex */
public abstract class IntFloatMap {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1426a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1427b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f1428c;
    public int d;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        r5 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (((r2 & ((~r2) << 6)) & (-9187201950435737472L)) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r24 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.f1427b;
        float[] fArr = this.f1428c;
        long[] jArr = this.f1426a;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            i4 += Float.hashCode(fArr[i7]) ^ Integer.hashCode(i8);
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        return i4;
                    }
                }
                if (i3 == length) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final String toString() {
        return JsonUtils.EMPTY_JSON;
    }
}
