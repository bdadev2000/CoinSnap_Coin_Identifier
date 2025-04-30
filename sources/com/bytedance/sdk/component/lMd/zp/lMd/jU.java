package com.bytedance.sdk.component.lMd.zp.lMd;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class jU implements Serializable, Comparable<jU> {
    transient int COT;
    transient String HWF;
    final byte[] jU;
    static final char[] zp = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset lMd = Charset.forName("UTF-8");
    public static final jU KS = zp(new byte[0]);

    public jU(byte[] bArr) {
        this.jU = bArr;
    }

    public static jU zp(byte... bArr) {
        if (bArr != null) {
            return new jU((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public int KS() {
        return this.jU.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jU) {
            jU jUVar = (jU) obj;
            int KS2 = jUVar.KS();
            byte[] bArr = this.jU;
            if (KS2 == bArr.length && jUVar.zp(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i9 = this.COT;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = Arrays.hashCode(this.jU);
        this.COT = hashCode;
        return hashCode;
    }

    public byte[] jU() {
        return (byte[]) this.jU.clone();
    }

    public String lMd() {
        byte[] bArr = this.jU;
        char[] cArr = new char[bArr.length * 2];
        int i9 = 0;
        for (byte b : bArr) {
            int i10 = i9 + 1;
            char[] cArr2 = zp;
            cArr[i9] = cArr2[(b >> 4) & 15];
            i9 += 2;
            cArr[i10] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public String toString() {
        if (this.jU.length == 0) {
            return "[size=0]";
        }
        String zp2 = zp();
        int zp3 = zp(zp2, 64);
        if (zp3 == -1) {
            if (this.jU.length <= 64) {
                return "[hex=" + lMd() + "]";
            }
            return "[size=" + this.jU.length + " hex=" + zp(0, 64).lMd() + "…]";
        }
        String replace = zp2.substring(0, zp3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (zp3 < zp2.length()) {
            return "[size=" + this.jU.length + " text=" + replace + "…]";
        }
        return AbstractC2914a.e("[text=", replace, "]");
    }

    public String zp() {
        String str = this.HWF;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.jU, lMd);
        this.HWF = str2;
        return str2;
    }

    public jU zp(int i9, int i10) {
        if (i9 >= 0) {
            byte[] bArr = this.jU;
            if (i10 > bArr.length) {
                throw new IllegalArgumentException(AbstractC2914a.g(new StringBuilder("endIndex > length("), this.jU.length, ")"));
            }
            int i11 = i10 - i9;
            if (i11 >= 0) {
                if (i9 == 0 && i10 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i9, bArr2, 0, i11);
                return new jU(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte zp(int i9) {
        return this.jU[i9];
    }

    public boolean zp(int i9, jU jUVar, int i10, int i11) {
        return jUVar.zp(i10, this.jU, i9, i11);
    }

    public boolean zp(int i9, byte[] bArr, int i10, int i11) {
        if (i9 < 0) {
            return false;
        }
        byte[] bArr2 = this.jU;
        return i9 <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && YW.zp(bArr2, i9, bArr, i10, i11);
    }

    @Override // java.lang.Comparable
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public int compareTo(jU jUVar) {
        int KS2 = KS();
        int KS3 = jUVar.KS();
        int min = Math.min(KS2, KS3);
        for (int i9 = 0; i9 < min; i9++) {
            int zp2 = zp(i9) & 255;
            int zp3 = jUVar.zp(i9) & 255;
            if (zp2 != zp3) {
                return zp2 < zp3 ? -1 : 1;
            }
        }
        if (KS2 == KS3) {
            return 0;
        }
        return KS2 < KS3 ? -1 : 1;
    }

    public static int zp(String str, int i9) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            if (i11 == i9) {
                return i10;
            }
            int codePointAt = str.codePointAt(i10);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i11++;
            i10 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
