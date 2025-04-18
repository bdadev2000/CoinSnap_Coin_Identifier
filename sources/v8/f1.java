package v8;

import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class f1 implements m9.k0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f26109b = p.f26222b.getAndIncrement();

    /* renamed from: c, reason: collision with root package name */
    public final m9.p f26110c;

    /* renamed from: d, reason: collision with root package name */
    public final m9.v0 f26111d;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f26112f;

    public f1(m9.l lVar, m9.p pVar) {
        this.f26110c = pVar;
        this.f26111d = new m9.v0(lVar);
    }

    @Override // m9.k0
    public final void cancelLoad() {
    }

    @Override // m9.k0
    public final void load() {
        m9.v0 v0Var = this.f26111d;
        v0Var.f21777b = 0L;
        try {
            v0Var.a(this.f26110c);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) v0Var.f21777b;
                byte[] bArr = this.f26112f;
                if (bArr == null) {
                    this.f26112f = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                } else if (i11 == bArr.length) {
                    this.f26112f = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f26112f;
                i10 = v0Var.read(bArr2, i11, bArr2.length - i11);
            }
        } finally {
            u0.q(v0Var);
        }
    }
}
