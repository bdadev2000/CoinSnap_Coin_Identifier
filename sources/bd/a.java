package bd;

import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public final short f2411c;

    /* renamed from: d, reason: collision with root package name */
    public final short f2412d;

    public a(e eVar, int i10, int i11) {
        super(eVar);
        this.f2411c = (short) i10;
        this.f2412d = (short) i11;
    }

    @Override // bd.e
    public final void a(cd.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s5 = this.f2412d;
            if (i10 < s5) {
                if (i10 == 0 || (i10 == 31 && s5 <= 62)) {
                    aVar.b(31, 5);
                    if (s5 > 62) {
                        aVar.b(s5 - 31, 16);
                    } else if (i10 == 0) {
                        aVar.b(Math.min((int) s5, 31), 5);
                    } else {
                        aVar.b(s5 - 31, 5);
                    }
                }
                aVar.b(bArr[this.f2411c + i10], 8);
                i10++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f2411c);
        sb2.append("::");
        sb2.append((r1 + this.f2412d) - 1);
        sb2.append(Typography.greater);
        return sb2.toString();
    }
}
