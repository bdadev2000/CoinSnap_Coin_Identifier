package C5;

/* loaded from: classes3.dex */
public final class a extends g {

    /* renamed from: c, reason: collision with root package name */
    public final short f558c;

    /* renamed from: d, reason: collision with root package name */
    public final short f559d;

    public a(g gVar, int i9, int i10) {
        super(gVar);
        this.f558c = (short) i9;
        this.f559d = (short) i10;
    }

    @Override // C5.g
    public final void a(D5.a aVar, byte[] bArr) {
        int i9 = 0;
        while (true) {
            short s5 = this.f559d;
            if (i9 < s5) {
                if (i9 == 0 || (i9 == 31 && s5 <= 62)) {
                    aVar.b(31, 5);
                    if (s5 > 62) {
                        aVar.b(s5 - 31, 16);
                    } else if (i9 == 0) {
                        aVar.b(Math.min((int) s5, 31), 5);
                    } else {
                        aVar.b(s5 - 31, 5);
                    }
                }
                aVar.b(bArr[this.f558c + i9], 8);
                i9++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f558c);
        sb.append("::");
        sb.append((r1 + this.f559d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
