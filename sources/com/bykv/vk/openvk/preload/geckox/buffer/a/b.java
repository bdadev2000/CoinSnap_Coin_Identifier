package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {
    private RandomAccessFile a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f10046b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private File f10047c;

    public b(File file) throws IOException {
        this.f10047c = file;
        file.getParentFile().mkdirs();
        try {
            this.a = new RandomAccessFile(file, "rw");
        } catch (Exception e2) {
            CloseableUtils.close(this.a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f10046b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws IOException {
        return this.a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (!this.f10046b.get()) {
            return this.a.getFilePointer();
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.f10046b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f10047c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j3) throws IOException {
        if (!this.f10046b.get()) {
            if (j3 < 0) {
                j3 = 0;
            }
            this.a.seek(j3);
            return;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i10) throws IOException {
        a(new byte[]{(byte) i10});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j3) throws IOException {
        if (this.f10046b.get()) {
            throw new IOException("released!");
        }
        if (((int) j3) == j3) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j3)));
        }
        return this.a.skipBytes(r0);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        int read;
        if (!this.f10046b.get()) {
            if (bArr == null || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                read = this.a.read(bArr, i10, i11);
            }
            return read;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f10046b.get()) {
            if (bArr == null || bArr.length == 0 || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                this.a.write(bArr, i10, i11);
            }
            return i11;
        }
        throw new IOException("released!");
    }
}
