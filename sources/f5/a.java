package f5;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p5.c;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap f17676g = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final h5.a f17677b;

    /* renamed from: c, reason: collision with root package name */
    public long f17678c = -2147483648L;

    /* renamed from: d, reason: collision with root package name */
    public final Context f17679d;

    /* renamed from: f, reason: collision with root package name */
    public final c f17680f;

    public a(Context context, c cVar) {
        this.f17679d = context;
        this.f17680f = cVar;
        this.f17677b = new h5.a(cVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17680f.GA();
        h5.a aVar = this.f17677b;
        if (aVar != null) {
            try {
                if (!aVar.f18773f) {
                    aVar.f18775h.close();
                }
                File file = aVar.f18770c;
                if (file != null) {
                    file.setLastModified(System.currentTimeMillis());
                }
                File file2 = aVar.f18771d;
                if (file2 != null) {
                    file2.setLastModified(System.currentTimeMillis());
                }
            } catch (Throwable unused) {
            }
            aVar.f18773f = true;
        }
        f17676g.remove(this.f17680f.pDU());
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        if (this.f17678c == -2147483648L) {
            long j3 = -1;
            if (this.f17679d == null || TextUtils.isEmpty(this.f17680f.GA())) {
                return -1L;
            }
            h5.a aVar = this.f17677b;
            if (aVar.f18771d.exists()) {
                aVar.a = aVar.f18771d.length();
            } else {
                synchronized (aVar.f18769b) {
                    int i10 = 0;
                    do {
                        if (aVar.a == -2147483648L) {
                            i10 += 15;
                            try {
                                aVar.f18769b.wait(5L);
                            } catch (InterruptedException unused) {
                                throw new IOException("total length InterruptException");
                            }
                        }
                    } while (i10 <= 20000);
                }
                this.f17678c = j3;
            }
            j3 = aVar.a;
            this.f17678c = j3;
        }
        return this.f17678c;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i10, int i11) {
        int i12;
        long length;
        h5.a aVar = this.f17677b;
        aVar.getClass();
        try {
            if (j3 != aVar.a) {
                int i13 = 0;
                i12 = 0;
                while (!aVar.f18773f) {
                    synchronized (aVar.f18769b) {
                        if (aVar.f18771d.exists()) {
                            length = aVar.f18771d.length();
                        } else {
                            length = aVar.f18770c.length();
                        }
                        if (j3 < length) {
                            aVar.f18775h.seek(j3);
                            i12 = aVar.f18775h.read(bArr, i10, i11);
                        } else {
                            i13 += 33;
                            aVar.f18769b.wait(33L);
                        }
                    }
                    if (i12 > 0) {
                        break;
                    }
                    if (i13 >= 20000) {
                        throw new SocketTimeoutException();
                    }
                }
            }
            i12 = -1;
            int length2 = bArr.length;
            Objects.toString(Thread.currentThread());
            return i12;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }
}
