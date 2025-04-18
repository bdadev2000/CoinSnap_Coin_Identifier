package bd;

import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public final short f2417c;

    /* renamed from: d, reason: collision with root package name */
    public final short f2418d;

    public c(e eVar, int i10, int i11) {
        super(eVar);
        this.f2417c = (short) i10;
        this.f2418d = (short) i11;
    }

    @Override // bd.e
    public final void a(cd.a aVar, byte[] bArr) {
        aVar.b(this.f2417c, this.f2418d);
    }

    public final String toString() {
        short s5 = this.f2418d;
        return "<" + Integer.toBinaryString((1 << s5) | (((1 << s5) - 1) & this.f2417c) | (1 << s5)).substring(1) + Typography.greater;
    }
}
