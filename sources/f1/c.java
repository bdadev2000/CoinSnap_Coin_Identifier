package f1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17554b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17555c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f17556d;

    public c(int i10, int i11, byte[] bArr) {
        this(-1L, bArr, i10, i11);
    }

    public static c a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(g.N);
        return new c(2, bytes.length, bytes);
    }

    public static c b(long j3, ByteOrder byteOrder) {
        long[] jArr = {j3};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.E[4] * 1]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(4, 1, wrap.array());
    }

    public static c c(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.E[5] * 1]);
        wrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        wrap.putInt((int) eVar2.a);
        wrap.putInt((int) eVar2.f17560b);
        return new c(5, 1, wrap.array());
    }

    public static c d(int i10, ByteOrder byteOrder) {
        int[] iArr = {i10};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.E[3] * 1]);
        wrap.order(byteOrder);
        wrap.putShort((short) iArr[0]);
        return new c(3, 1, wrap.array());
    }

    public final double e(ByteOrder byteOrder) {
        Object h10 = h(byteOrder);
        if (h10 != null) {
            if (h10 instanceof String) {
                return Double.parseDouble((String) h10);
            }
            if (h10 instanceof long[]) {
                if (((long[]) h10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (h10 instanceof int[]) {
                if (((int[]) h10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (h10 instanceof double[]) {
                double[] dArr = (double[]) h10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (h10 instanceof e[]) {
                e[] eVarArr = (e[]) h10;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return eVar.a / eVar.f17560b;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int f(ByteOrder byteOrder) {
        Object h10 = h(byteOrder);
        if (h10 != null) {
            if (h10 instanceof String) {
                return Integer.parseInt((String) h10);
            }
            if (h10 instanceof long[]) {
                long[] jArr = (long[]) h10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (h10 instanceof int[]) {
                int[] iArr = (int[]) h10;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String g(ByteOrder byteOrder) {
        Object h10 = h(byteOrder);
        if (h10 == null) {
            return null;
        }
        if (h10 instanceof String) {
            return (String) h10;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (h10 instanceof long[]) {
            long[] jArr = (long[]) h10;
            while (i10 < jArr.length) {
                sb2.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (h10 instanceof int[]) {
            int[] iArr = (int[]) h10;
            while (i10 < iArr.length) {
                sb2.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (h10 instanceof double[]) {
            double[] dArr = (double[]) h10;
            while (i10 < dArr.length) {
                sb2.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(h10 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) h10;
        while (i10 < eVarArr.length) {
            sb2.append(eVarArr[i10].a);
            sb2.append('/');
            sb2.append(eVarArr[i10].f17560b);
            i10++;
            if (i10 != eVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(3:91|(2:92|(1:101)(2:94|(2:97|98)(1:96)))|(1:100))|102|(2:104|(6:113|114|115|116|117|118)(3:106|(2:108|109)(2:111|112)|110))|122|115|116|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x012a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x012b, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0167: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:360), block:B:159:0x0167 */
    /* JADX WARN: Removed duplicated region for block: B:162:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [f1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [f1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable h(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.c.h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.D[this.a]);
        sb2.append(", data length:");
        return vd.e.g(sb2, this.f17556d.length, ")");
    }

    public c(long j3, byte[] bArr, int i10, int i11) {
        this.a = i10;
        this.f17554b = i11;
        this.f17555c = j3;
        this.f17556d = bArr;
    }
}
