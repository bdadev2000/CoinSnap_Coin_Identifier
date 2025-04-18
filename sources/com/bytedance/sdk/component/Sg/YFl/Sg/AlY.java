package com.bytedance.sdk.component.Sg.YFl.Sg;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.mediation.ads.e;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
public class AlY implements Serializable, Comparable<AlY> {
    final byte[] AlY;

    /* renamed from: vc, reason: collision with root package name */
    transient String f10332vc;
    transient int wN;
    static final char[] YFl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset Sg = Charset.forName("UTF-8");
    public static final AlY tN = YFl(new byte[0]);

    public AlY(byte[] bArr) {
        this.AlY = bArr;
    }

    public static AlY YFl(byte... bArr) {
        if (bArr != null) {
            return new AlY((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public byte[] AlY() {
        return (byte[]) this.AlY.clone();
    }

    public String Sg() {
        byte[] bArr = this.AlY;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b3 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = YFl;
            cArr[i10] = cArr2[(b3 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b3 & Ascii.SI];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlY) {
            AlY alY = (AlY) obj;
            int tN2 = alY.tN();
            byte[] bArr = this.AlY;
            if (tN2 == bArr.length && alY.YFl(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.wN;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.AlY);
        this.wN = hashCode;
        return hashCode;
    }

    public int tN() {
        return this.AlY.length;
    }

    public String toString() {
        if (this.AlY.length == 0) {
            return "[size=0]";
        }
        String YFl2 = YFl();
        int YFl3 = YFl(YFl2, 64);
        if (YFl3 == -1) {
            if (this.AlY.length <= 64) {
                return "[hex=" + Sg() + "]";
            }
            return "[size=" + this.AlY.length + " hex=" + YFl(0, 64).Sg() + "…]";
        }
        String replace = YFl2.substring(0, YFl3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (YFl3 < YFl2.length()) {
            return "[size=" + this.AlY.length + " text=" + replace + "…]";
        }
        return e.f("[text=", replace, "]");
    }

    public String YFl() {
        String str = this.f10332vc;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.AlY, Sg);
        this.f10332vc = str2;
        return str2;
    }

    public AlY YFl(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.AlY;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException(vd.e.g(new StringBuilder("endIndex > length("), this.AlY.length, ")"));
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new AlY(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte YFl(int i10) {
        return this.AlY[i10];
    }

    public boolean YFl(int i10, AlY alY, int i11, int i12) {
        return alY.YFl(i11, this.AlY, i10, i12);
    }

    public boolean YFl(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.AlY;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && NjR.YFl(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public int compareTo(AlY alY) {
        int tN2 = tN();
        int tN3 = alY.tN();
        int min = Math.min(tN2, tN3);
        for (int i10 = 0; i10 < min; i10++) {
            int YFl2 = YFl(i10) & UByte.MAX_VALUE;
            int YFl3 = alY.YFl(i10) & UByte.MAX_VALUE;
            if (YFl2 != YFl3) {
                return YFl2 < YFl3 ? -1 : 1;
            }
        }
        if (tN2 == tN3) {
            return 0;
        }
        return tN2 < tN3 ? -1 : 1;
    }

    public static int YFl(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
