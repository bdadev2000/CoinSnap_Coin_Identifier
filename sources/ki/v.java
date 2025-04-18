package ki;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21029b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21030c;

    /* renamed from: d, reason: collision with root package name */
    public int f21031d;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f21032f;

    /* renamed from: g, reason: collision with root package name */
    public final RandomAccessFile f21033g;

    public v(boolean z10, RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f21029b = z10;
        this.f21032f = new ReentrantLock();
        this.f21033g = randomAccessFile;
    }

    public static m g(v vVar) {
        if (vVar.f21029b) {
            ReentrantLock reentrantLock = vVar.f21032f;
            reentrantLock.lock();
            try {
                if (!vVar.f21030c) {
                    vVar.f21031d++;
                    reentrantLock.unlock();
                    return new m(vVar, 0L);
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void close() {
        ReentrantLock reentrantLock = this.f21032f;
        reentrantLock.lock();
        try {
            if (this.f21030c) {
                return;
            }
            this.f21030c = true;
            if (this.f21031d != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                this.f21033g.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.f21029b) {
            ReentrantLock reentrantLock = this.f21032f;
            reentrantLock.lock();
            try {
                if (!this.f21030c) {
                    Unit unit = Unit.INSTANCE;
                    synchronized (this) {
                        this.f21033g.getFD().sync();
                    }
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final long j() {
        long length;
        ReentrantLock reentrantLock = this.f21032f;
        reentrantLock.lock();
        try {
            if (!this.f21030c) {
                Unit unit = Unit.INSTANCE;
                synchronized (this) {
                    length = this.f21033g.length();
                }
                return length;
            }
            throw new IllegalStateException("closed".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final n k(long j3) {
        ReentrantLock reentrantLock = this.f21032f;
        reentrantLock.lock();
        try {
            if (!this.f21030c) {
                this.f21031d++;
                reentrantLock.unlock();
                return new n(this, j3);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
