package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: classes4.dex */
public abstract class FloatLongMap {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1413a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f1414b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f1415c;
    public int d;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        r5 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        if (((r2 & ((~r2) << 6)) & (-9187201950435737472L)) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        r25 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatLongMap.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        float[] fArr = this.f1414b;
        long[] jArr = this.f1415c;
        long[] jArr2 = this.f1413a;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i4 += Float.hashCode(fArr[i7]) ^ Long.hashCode(jArr[i7]);
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
