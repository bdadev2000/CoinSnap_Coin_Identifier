package m0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import x0.AbstractC2914a;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2454c {

    /* renamed from: a, reason: collision with root package name */
    public final int f21661a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21662c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f21663d;

    public C2454c(int i9, int i10, byte[] bArr) {
        this(-1L, bArr, i9, i10);
    }

    public static C2454c a(long j7, ByteOrder byteOrder) {
        long[] jArr = {j7};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C2458g.f21672E[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C2454c(4, 1, wrap.array());
    }

    public static C2454c b(C2456e c2456e, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C2458g.f21672E[5]]);
        wrap.order(byteOrder);
        C2456e c2456e2 = new C2456e[]{c2456e}[0];
        wrap.putInt((int) c2456e2.f21667a);
        wrap.putInt((int) c2456e2.b);
        return new C2454c(5, 1, wrap.array());
    }

    public static C2454c c(int i9, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C2458g.f21672E[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i9}[0]);
        return new C2454c(3, 1, wrap.array());
    }

    public final double d(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 != null) {
            if (g9 instanceof String) {
                return Double.parseDouble((String) g9);
            }
            if (g9 instanceof long[]) {
                if (((long[]) g9).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g9 instanceof int[]) {
                if (((int[]) g9).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g9 instanceof double[]) {
                double[] dArr = (double[]) g9;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g9 instanceof C2456e[]) {
                C2456e[] c2456eArr = (C2456e[]) g9;
                if (c2456eArr.length == 1) {
                    C2456e c2456e = c2456eArr[0];
                    return c2456e.f21667a / c2456e.b;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 != null) {
            if (g9 instanceof String) {
                return Integer.parseInt((String) g9);
            }
            if (g9 instanceof long[]) {
                long[] jArr = (long[]) g9;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g9 instanceof int[]) {
                int[] iArr = (int[]) g9;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 == null) {
            return null;
        }
        if (g9 instanceof String) {
            return (String) g9;
        }
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        if (g9 instanceof long[]) {
            long[] jArr = (long[]) g9;
            while (i9 < jArr.length) {
                sb.append(jArr[i9]);
                i9++;
                if (i9 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g9 instanceof int[]) {
            int[] iArr = (int[]) g9;
            while (i9 < iArr.length) {
                sb.append(iArr[i9]);
                i9++;
                if (i9 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g9 instanceof double[]) {
            double[] dArr = (double[]) g9;
            while (i9 < dArr.length) {
                sb.append(dArr[i9]);
                i9++;
                if (i9 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g9 instanceof C2456e[])) {
            return null;
        }
        C2456e[] c2456eArr = (C2456e[]) g9;
        while (i9 < c2456eArr.length) {
            sb.append(c2456eArr[i9].f21667a);
            sb.append('/');
            sb.append(c2456eArr[i9].b);
            i9++;
            if (i9 != c2456eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0129, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:51), block:B:158:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [m0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [m0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable g(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C2454c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C2458g.f21671D[this.f21661a]);
        sb.append(", data length:");
        return AbstractC2914a.g(sb, this.f21663d.length, ")");
    }

    public C2454c(long j7, byte[] bArr, int i9, int i10) {
        this.f21661a = i9;
        this.b = i10;
        this.f21662c = j7;
        this.f21663d = bArr;
    }
}
