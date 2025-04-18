package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.pgl.ssdk.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1268k implements InterfaceC1271n {
    private final FileChannel a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16559b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16560c;

    public C1268k(FileChannel fileChannel, long j3, long j10) {
        if (j3 >= 0) {
            if (j10 >= 0) {
                this.a = fileChannel;
                this.f16559b = j3;
                this.f16560c = j10;
                return;
            }
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j10)));
        }
        throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j10)));
    }

    public long a() {
        long j3 = this.f16560c;
        if (j3 != -1) {
            return j3;
        }
        try {
            return this.a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public InterfaceC1271n a(long j3, long j10) {
        long a = a();
        a(j3, j10, a);
        return (j3 == 0 && j10 == a) ? this : new C1268k(this.a, this.f16559b + j3, j10);
    }

    public ByteBuffer a(long j3, int i10) throws IOException {
        int read;
        if (i10 >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            a(j3, i10, a());
            if (i10 != 0) {
                if (i10 <= allocate.remaining()) {
                    long j10 = this.f16559b + j3;
                    int limit = allocate.limit();
                    try {
                        allocate.limit(allocate.position() + i10);
                        while (i10 > 0) {
                            synchronized (this.a) {
                                this.a.position(j10);
                                read = this.a.read(allocate);
                            }
                            j10 += read;
                            i10 -= read;
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
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i10)));
    }

    private static void a(long j3, long j10, long j11) {
        if (j3 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j3)));
        }
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j10)));
        }
        if (j3 > j11) {
            throw new IndexOutOfBoundsException(a4.j.j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("offset (", j3, ") > source size ("), j11, ")"));
        }
        long j12 = j3 + j10;
        if (j12 < j3) {
            throw new IndexOutOfBoundsException(a4.j.j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("offset (", j3, ") + size ("), j10, ") overflow"));
        }
        if (j12 <= j11) {
            return;
        }
        StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("offset (", j3, ") + size (");
        o10.append(j10);
        o10.append(") > source size (");
        o10.append(j11);
        o10.append(")");
        throw new IndexOutOfBoundsException(o10.toString());
    }
}
