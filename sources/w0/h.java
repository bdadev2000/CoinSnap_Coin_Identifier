package w0;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class h implements Iterable, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f31412a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31413b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31414c;

    public h(long j2, long j3) {
        this.f31412a = j2;
        if (j2 < j3) {
            long j4 = j3 % 1;
            long j5 = j2 % 1;
            long j6 = ((j4 < 0 ? j4 + 1 : j4) - (j5 < 0 ? j5 + 1 : j5)) % 1;
            j3 -= j6 < 0 ? j6 + 1 : j6;
        }
        this.f31413b = j3;
        this.f31414c = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i(this.f31412a, this.f31413b, this.f31414c);
    }
}
