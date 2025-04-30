package w8;

import androidx.fragment.app.FragmentTransaction;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import u7.AbstractC2815f;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24041a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f24042c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24043d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24044e;

    /* renamed from: f, reason: collision with root package name */
    public u f24045f;

    /* renamed from: g, reason: collision with root package name */
    public u f24046g;

    public u() {
        this.f24041a = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        this.f24044e = true;
        this.f24043d = false;
    }

    public final u a() {
        u uVar = this.f24045f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.f24046g;
        G7.j.b(uVar2);
        uVar2.f24045f = this.f24045f;
        u uVar3 = this.f24045f;
        G7.j.b(uVar3);
        uVar3.f24046g = this.f24046g;
        this.f24045f = null;
        this.f24046g = null;
        return uVar;
    }

    public final void b(u uVar) {
        G7.j.e(uVar, "segment");
        uVar.f24046g = this;
        uVar.f24045f = this.f24045f;
        u uVar2 = this.f24045f;
        G7.j.b(uVar2);
        uVar2.f24046g = uVar;
        this.f24045f = uVar;
    }

    public final u c() {
        this.f24043d = true;
        return new u(this.f24041a, this.b, this.f24042c, true);
    }

    public final void d(u uVar, int i9) {
        G7.j.e(uVar, "sink");
        if (uVar.f24044e) {
            int i10 = uVar.f24042c;
            int i11 = i10 + i9;
            byte[] bArr = uVar.f24041a;
            if (i11 > 8192) {
                if (!uVar.f24043d) {
                    int i12 = uVar.b;
                    if (i11 - i12 <= 8192) {
                        AbstractC2815f.v(bArr, 0, i12, bArr, i10);
                        uVar.f24042c -= uVar.b;
                        uVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i13 = uVar.f24042c;
            int i14 = this.b;
            AbstractC2815f.v(this.f24041a, i13, i14, bArr, i14 + i9);
            uVar.f24042c += i9;
            this.b += i9;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public u(byte[] bArr, int i9, int i10, boolean z8) {
        G7.j.e(bArr, DataSchemeDataSource.SCHEME_DATA);
        this.f24041a = bArr;
        this.b = i9;
        this.f24042c = i10;
        this.f24043d = z8;
        this.f24044e = false;
    }
}
