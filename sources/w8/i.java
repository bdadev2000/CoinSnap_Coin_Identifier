package w8;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public class i implements Serializable, Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final i f24015f = new i(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f24016c;

    /* renamed from: d, reason: collision with root package name */
    public transient String f24017d;

    public i(byte[] bArr) {
        G7.j.e(bArr, DataSchemeDataSource.SCHEME_DATA);
        this.b = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i9 = 0;
            while (i9 < readInt) {
                int read = objectInputStream.read(bArr, i9, readInt - i9);
                if (read != -1) {
                    i9 += read;
                } else {
                    throw new EOFException();
                }
            }
            i iVar = new i(bArr);
            Field declaredField = i.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            declaredField.setAccessible(true);
            declaredField.set(this, iVar.b);
            return;
        }
        throw new IllegalArgumentException(G7.j.j(Integer.valueOf(readInt), "byteCount < 0: ").toString());
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public String a() {
        byte[] bArr = this.b;
        byte[] bArr2 = B.f24002a;
        G7.j.e(bArr, "<this>");
        G7.j.e(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            byte b = bArr[i9];
            int i11 = i9 + 2;
            byte b8 = bArr[i9 + 1];
            i9 += 3;
            byte b9 = bArr[i11];
            bArr3[i10] = bArr2[(b & 255) >> 2];
            bArr3[i10 + 1] = bArr2[((b & 3) << 4) | ((b8 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr3[i10 + 2] = bArr2[((b8 & Ascii.SI) << 2) | ((b9 & 255) >> 6)];
            i10 += 4;
            bArr3[i12] = bArr2[b9 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i13 = i9 + 1;
                byte b10 = bArr[i9];
                byte b11 = bArr[i13];
                bArr3[i10] = bArr2[(b10 & 255) >> 2];
                bArr3[i10 + 1] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
                bArr3[i10 + 2] = bArr2[(b11 & Ascii.SI) << 2];
                bArr3[i10 + 3] = (byte) 61;
            }
        } else {
            byte b12 = bArr[i9];
            bArr3[i10] = bArr2[(b12 & 255) >> 2];
            bArr3[i10 + 1] = bArr2[(b12 & 3) << 4];
            byte b13 = (byte) 61;
            bArr3[i10 + 2] = b13;
            bArr3[i10 + 3] = b13;
        }
        return new String(bArr3, O7.a.f2244a);
    }

    public i b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.b, 0, c());
        byte[] digest = messageDigest.digest();
        G7.j.d(digest, "digestBytes");
        return new i(digest);
    }

    public int c() {
        return this.b.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            w8.i r10 = (w8.i) r10
            java.lang.String r0 = "other"
            G7.j.e(r10, r0)
            int r0 = r9.c()
            int r1 = r10.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L30
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2a
            int r4 = r4 + 1
            goto L15
        L2a:
            if (r7 >= r8) goto L2e
        L2c:
            r3 = r6
            goto L36
        L2e:
            r3 = r5
            goto L36
        L30:
            if (r0 != r1) goto L33
            goto L36
        L33:
            if (r0 >= r1) goto L2e
            goto L2c
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.i.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.b;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            byte b = bArr[i9];
            i9++;
            int i11 = i10 + 1;
            char[] cArr2 = x8.b.f24250a;
            cArr[i10] = cArr2[(b >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int c9 = iVar.c();
            byte[] bArr = this.b;
            if (c9 == bArr.length && iVar.g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i9) {
        return this.b[i9];
    }

    public boolean g(int i9, byte[] bArr, int i10, int i11) {
        G7.j.e(bArr, "other");
        if (i9 >= 0) {
            byte[] bArr2 = this.b;
            if (i9 <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && AbstractC2947c.a(bArr2, i9, bArr, i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(i iVar, int i9) {
        G7.j.e(iVar, "other");
        return iVar.g(0, this.b, 0, i9);
    }

    public int hashCode() {
        int i9 = this.f24016c;
        if (i9 == 0) {
            int hashCode = Arrays.hashCode(this.b);
            this.f24016c = hashCode;
            return hashCode;
        }
        return i9;
    }

    public i i() {
        byte b;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i9 < bArr.length) {
                byte b8 = bArr[i9];
                byte b9 = (byte) 65;
                if (b8 >= b9 && b8 <= (b = (byte) 90)) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    G7.j.d(copyOf, "java.util.Arrays.copyOf(this, size)");
                    copyOf[i9] = (byte) (b8 + 32);
                    for (int i10 = i9 + 1; i10 < copyOf.length; i10++) {
                        byte b10 = copyOf[i10];
                        if (b10 >= b9 && b10 <= b) {
                            copyOf[i10] = (byte) (b10 + 32);
                        }
                    }
                    return new i(copyOf);
                }
                i9++;
            } else {
                return this;
            }
        }
    }

    public final String j() {
        String str = this.f24017d;
        if (str == null) {
            byte[] e4 = e();
            G7.j.e(e4, "<this>");
            String str2 = new String(e4, O7.a.f2244a);
            this.f24017d = str2;
            return str2;
        }
        return str;
    }

    public void k(f fVar, int i9) {
        G7.j.e(fVar, "buffer");
        fVar.m(this.b, 0, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0120, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0163, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x015c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x019e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a1, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.i.toString():java.lang.String");
    }
}
