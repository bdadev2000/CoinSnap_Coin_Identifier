package ki;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final v f21006b;

    /* renamed from: c, reason: collision with root package name */
    public long f21007c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21008d;

    public n(v fileHandle, long j3) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f21006b = fileHandle;
        this.f21007c = j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21008d) {
            return;
        }
        this.f21008d = true;
        v vVar = this.f21006b;
        ReentrantLock reentrantLock = vVar.f21032f;
        reentrantLock.lock();
        try {
            int i10 = vVar.f21031d - 1;
            vVar.f21031d = i10;
            if (i10 == 0 && vVar.f21030c) {
                Unit unit = Unit.INSTANCE;
                synchronized (vVar) {
                    vVar.f21033g.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ki.k0
    public final long read(i sink, long j3) {
        boolean z10;
        long j10;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i12 = 1;
        if (!this.f21008d) {
            v vVar = this.f21006b;
            long j11 = this.f21007c;
            vVar.getClass();
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long j12 = j3 + j11;
                long j13 = j11;
                while (true) {
                    if (j13 >= j12) {
                        break;
                    }
                    f0 t5 = sink.t(i12);
                    byte[] array = t5.a;
                    int i13 = t5.f20980c;
                    int min = (int) Math.min(j12 - j13, 8192 - i13);
                    synchronized (vVar) {
                        Intrinsics.checkNotNullParameter(array, "array");
                        vVar.f21033g.seek(j13);
                        i10 = 0;
                        while (true) {
                            if (i10 >= min) {
                                break;
                            }
                            int read = vVar.f21033g.read(array, i13, min - i10);
                            if (read == -1) {
                                if (i10 == 0) {
                                    i11 = -1;
                                    i10 = -1;
                                }
                            } else {
                                i10 += read;
                            }
                        }
                        i11 = -1;
                    }
                    if (i10 == i11) {
                        if (t5.f20979b == t5.f20980c) {
                            sink.f20993b = t5.a();
                            g0.a(t5);
                        }
                        if (j11 == j13) {
                            j10 = -1;
                        }
                    } else {
                        t5.f20980c += i10;
                        long j14 = i10;
                        j13 += j14;
                        sink.f20994c += j14;
                        i12 = 1;
                    }
                }
                j10 = j13 - j11;
                if (j10 != -1) {
                    this.f21007c += j10;
                }
                return j10;
            }
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount < 0: ", j3).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.k0
    public final m0 timeout() {
        return m0.f21003d;
    }
}
