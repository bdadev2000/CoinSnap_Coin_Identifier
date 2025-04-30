package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P f4609a;

    static {
        s0 s0Var;
        if (r0.f4602f && r0.f4601e && !AbstractC0428c.a()) {
            s0Var = new s0(1);
        } else {
            s0Var = new s0(0);
        }
        f4609a = s0Var;
    }

    public static int a(byte[] bArr, int i9, int i10) {
        byte b = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return d(b, bArr[i9], bArr[i9 + 1]);
                }
                throw new AssertionError();
            }
            return c(b, bArr[i9]);
        }
        if (b > -12) {
            b = -1;
        }
        return b;
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i9 += (127 - charAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new t0(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int c(int i9, int i10) {
        if (i9 > -12 || i10 > -65) {
            return -1;
        }
        return i9 ^ (i10 << 8);
    }

    public static int d(int i9, int i10, int i11) {
        if (i9 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i9 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
