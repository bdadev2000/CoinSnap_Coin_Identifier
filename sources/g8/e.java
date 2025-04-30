package g8;

/* loaded from: classes3.dex */
public final class e extends B3.e {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20500c;

    public e(B3.g gVar, boolean z8) {
        super(gVar);
        this.f20500c = z8;
    }

    @Override // B3.e
    public final void h(byte b) {
        if (this.f20500c) {
            n(String.valueOf(b & 255));
        } else {
            l(String.valueOf(b & 255));
        }
    }

    @Override // B3.e
    public final void j(int i9) {
        if (this.f20500c) {
            n(Long.toString(4294967295L & i9, 10));
        } else {
            l(Long.toString(4294967295L & i9, 10));
        }
    }

    @Override // B3.e
    public final void k(long j7) {
        int i9 = 63;
        String str = "0";
        if (this.f20500c) {
            if (j7 != 0) {
                if (j7 > 0) {
                    str = Long.toString(j7, 10);
                } else {
                    char[] cArr = new char[64];
                    long j9 = (j7 >>> 1) / 5;
                    long j10 = 10;
                    cArr[63] = Character.forDigit((int) (j7 - (j9 * j10)), 10);
                    while (j9 > 0) {
                        i9--;
                        cArr[i9] = Character.forDigit((int) (j9 % j10), 10);
                        j9 /= j10;
                    }
                    str = new String(cArr, i9, 64 - i9);
                }
            }
            n(str);
            return;
        }
        if (j7 != 0) {
            if (j7 > 0) {
                str = Long.toString(j7, 10);
            } else {
                char[] cArr2 = new char[64];
                long j11 = (j7 >>> 1) / 5;
                long j12 = 10;
                cArr2[63] = Character.forDigit((int) (j7 - (j11 * j12)), 10);
                while (j11 > 0) {
                    i9--;
                    cArr2[i9] = Character.forDigit((int) (j11 % j12), 10);
                    j11 /= j12;
                }
                str = new String(cArr2, i9, 64 - i9);
            }
        }
        l(str);
    }

    @Override // B3.e
    public final void m(short s5) {
        if (this.f20500c) {
            n(String.valueOf(s5 & 65535));
        } else {
            l(String.valueOf(s5 & 65535));
        }
    }
}
