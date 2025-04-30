package com.pgl.ssdk;

import Q7.n0;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import y.AbstractC2933a;

/* renamed from: com.pgl.ssdk.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2056j implements InterfaceC2059m {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f19582a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19583c;

    public C2056j(FileChannel fileChannel, long j7, long j9) {
        if (j7 >= 0) {
            if (j9 >= 0) {
                this.f19582a = fileChannel;
                this.b = j7;
                this.f19583c = j9;
                return;
            }
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j9)));
        }
        throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j9)));
    }

    public long a() {
        long j7 = this.f19583c;
        if (j7 != -1) {
            return j7;
        }
        try {
            return this.f19582a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public InterfaceC2059m a(long j7, long j9) {
        long a6 = a();
        a(j7, j9, a6);
        return (j7 == 0 && j9 == a6) ? this : new C2056j(this.f19582a, this.b + j7, j9);
    }

    public ByteBuffer a(long j7, int i9) throws IOException {
        int read;
        if (i9 >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i9);
            a(j7, i9, a());
            if (i9 != 0) {
                if (i9 <= allocate.remaining()) {
                    long j9 = this.b + j7;
                    int limit = allocate.limit();
                    try {
                        allocate.limit(allocate.position() + i9);
                        while (i9 > 0) {
                            synchronized (this.f19582a) {
                                this.f19582a.position(j9);
                                read = this.f19582a.read(allocate);
                            }
                            j9 += read;
                            i9 -= read;
                        }
                    } finally {
                        allocate.limit(limit);
                    }
                } else {
                    throw new BufferOverflowException();
                }
            }
            allocate.flip();
            return allocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i9)));
    }

    private static void a(long j7, long j9, long j10) {
        if (j7 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j7)));
        }
        if (j9 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j9)));
        }
        if (j7 > j10) {
            throw new IndexOutOfBoundsException(n0.k(AbstractC2933a.a("offset (", j7, ") > source size ("), j10, ")"));
        }
        long j11 = j7 + j9;
        if (j11 < j7) {
            throw new IndexOutOfBoundsException(n0.k(AbstractC2933a.a("offset (", j7, ") + size ("), j9, ") overflow"));
        }
        if (j11 <= j10) {
            return;
        }
        StringBuilder a6 = AbstractC2933a.a("offset (", j7, ") + size (");
        a6.append(j9);
        a6.append(") > source size (");
        a6.append(j10);
        a6.append(")");
        throw new IndexOutOfBoundsException(a6.toString());
    }
}
