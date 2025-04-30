package g8;

import a5.C0398b;

/* loaded from: classes3.dex */
public final class b extends com.bumptech.glide.d {
    public final C0398b l;
    public final /* synthetic */ n m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f20495n;

    public b(n nVar, String str) {
        this.m = nVar;
        this.f20495n = str;
        this.l = nVar.b.b;
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void B(long j7) {
        String str;
        if (j7 == 0) {
            str = "0";
        } else if (j7 > 0) {
            str = Long.toString(j7, 10);
        } else {
            char[] cArr = new char[64];
            long j9 = (j7 >>> 1) / 5;
            long j10 = 10;
            int i9 = 63;
            cArr[63] = Character.forDigit((int) (j7 - (j9 * j10)), 10);
            while (j9 > 0) {
                i9--;
                cArr[i9] = Character.forDigit((int) (j9 % j10), 10);
                j9 /= j10;
            }
            str = new String(cArr, i9, 64 - i9);
        }
        b0(str);
    }

    @Override // d8.d
    public final C0398b a() {
        return this.l;
    }

    public final void b0(String str) {
        G7.j.e(str, "s");
        this.m.O(new f8.q(str, false), this.f20495n);
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void i(short s5) {
        b0(String.valueOf(s5 & 65535));
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void j(byte b) {
        b0(String.valueOf(b & 255));
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void y(int i9) {
        b0(Long.toString(i9 & 4294967295L, 10));
    }
}
