package ki;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public class l implements Serializable, Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final l f20996f;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20997b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f20998c;

    /* renamed from: d, reason: collision with root package name */
    public transient String f20999d;

    static {
        new wh.a0(23, 0);
        f20996f = new l(new byte[0]);
    }

    public l(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f20997b = data;
    }

    public static int g(l lVar, l other) {
        lVar.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return lVar.f(other.f20997b, 0);
    }

    public static int k(l lVar, l other) {
        lVar.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return lVar.j(other.f20997b, -1234567890);
    }

    public static /* synthetic */ l o(l lVar, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return lVar.n(i10, i11);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        boolean z10;
        int readInt = objectInputStream.readInt();
        Intrinsics.checkNotNullParameter(objectInputStream, "<this>");
        int i10 = 0;
        if (readInt >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            byte[] bArr = new byte[readInt];
            while (i10 < readInt) {
                int read = objectInputStream.read(bArr, i10, readInt - i10);
                if (read != -1) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
            l lVar = new l(bArr);
            Field declaredField = l.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            declaredField.setAccessible(true);
            declaredField.set(this, lVar.f20997b);
            return;
        }
        throw new IllegalArgumentException(eb.j.i("byteCount < 0: ", readInt).toString());
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f20997b.length);
        objectOutputStream.write(this.f20997b);
    }

    public String a() {
        byte[] bArr = this.f20997b;
        byte[] map = a.a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b3 = bArr[i10];
            int i13 = i12 + 1;
            byte b10 = bArr[i12];
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            int i15 = i11 + 1;
            bArr2[i11] = map[(b3 & UByte.MAX_VALUE) >> 2];
            int i16 = i15 + 1;
            bArr2[i15] = map[((b3 & 3) << 4) | ((b10 & UByte.MAX_VALUE) >> 4)];
            int i17 = i16 + 1;
            bArr2[i16] = map[((b10 & Ascii.SI) << 2) | ((b11 & UByte.MAX_VALUE) >> 6)];
            i11 = i17 + 1;
            bArr2[i17] = map[b11 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i18 = i10 + 1;
                byte b12 = bArr[i10];
                byte b13 = bArr[i18];
                int i19 = i11 + 1;
                bArr2[i11] = map[(b12 & UByte.MAX_VALUE) >> 2];
                int i20 = i19 + 1;
                bArr2[i19] = map[((b12 & 3) << 4) | ((b13 & UByte.MAX_VALUE) >> 4)];
                bArr2[i20] = map[(b13 & Ascii.SI) << 2];
                bArr2[i20 + 1] = Base64.padSymbol;
            }
        } else {
            byte b14 = bArr[i10];
            int i21 = i11 + 1;
            bArr2[i11] = map[(b14 & UByte.MAX_VALUE) >> 2];
            int i22 = i21 + 1;
            bArr2[i21] = map[(b14 & 3) << 4];
            bArr2[i22] = Base64.padSymbol;
            bArr2[i22 + 1] = Base64.padSymbol;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(ki.l r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.l.compareTo(ki.l):int");
    }

    public l c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f20997b, 0, d());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new l(digestBytes);
    }

    public int d() {
        return this.f20997b.length;
    }

    public String e() {
        byte[] bArr = this.f20997b;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b3 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = li.b.a;
            cArr[i10] = cArr2[(b3 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b3 & Ascii.SI];
        }
        return StringsKt.concatToString(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            int d10 = lVar.d();
            byte[] bArr = this.f20997b;
            if (d10 == bArr.length && lVar.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.f20997b.length - other.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (!mi.a.a(this.f20997b, max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.f20997b;
    }

    public int hashCode() {
        int i10 = this.f20998c;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f20997b);
            this.f20998c = hashCode;
            return hashCode;
        }
        return i10;
    }

    public byte i(int i10) {
        return this.f20997b[i10];
    }

    public int j(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int min = Math.min(mi.a.o(this, i10), this.f20997b.length - other.length); -1 < min; min--) {
            if (mi.a.a(this.f20997b, min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i10, l other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.m(0, this.f20997b, i10, i11);
    }

    public boolean m(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 >= 0) {
            byte[] bArr = this.f20997b;
            if (i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && mi.a.a(bArr, i10, other, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public l n(int i10, int i11) {
        boolean z10;
        boolean z11;
        int o10 = mi.a.o(this, i11);
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            byte[] bArr = this.f20997b;
            if (o10 <= bArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (o10 - i10 < 0) {
                    z12 = false;
                }
                if (z12) {
                    if (i10 == 0 && o10 == bArr.length) {
                        return this;
                    }
                    return new l(ArraysKt.copyOfRange(bArr, i10, o10));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(a4.j.i(new StringBuilder("endIndex > length("), this.f20997b.length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public l p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f20997b;
            if (i10 < bArr.length) {
                byte b3 = bArr[i10];
                if (b3 >= 65 && b3 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                    copyOf[i10] = (byte) (b3 + 32);
                    for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                        byte b10 = copyOf[i11];
                        if (b10 >= 65 && b10 <= 90) {
                            copyOf[i11] = (byte) (b10 + 32);
                        }
                    }
                    return new l(copyOf);
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public final String q() {
        String str = this.f20999d;
        if (str == null) {
            byte[] h10 = h();
            Intrinsics.checkNotNullParameter(h10, "<this>");
            String str2 = new String(h10, Charsets.UTF_8);
            this.f20999d = str2;
            return str2;
        }
        return str;
    }

    public void r(i buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.u(0, i10, this.f20997b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e0, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d9, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cc, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b6, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a7, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0196, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0185, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0221, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x013b, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x012e, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x011c, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x010d, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00fc, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x00b2, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x00a7, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0098, code lost:
    
        if (r3 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0224, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224 A[EDGE_INSN: B:163:0x0224->B:62:0x0224 BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0224 A[EDGE_INSN: B:213:0x0224->B:62:0x0224 BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0224 A[EDGE_INSN: B:249:0x0224->B:62:0x0224 BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0224 A[EDGE_INSN: B:275:0x0224->B:62:0x0224 BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012, LOOP_LABEL: LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0224 A[EDGE_INSN: B:61:0x0224->B:62:0x0224 BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.l.toString():java.lang.String");
    }
}
