package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f13217a;
    private AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private File f13218c;

    public b(File file) throws IOException {
        this.f13218c = file;
        file.getParentFile().mkdirs();
        try {
            this.f13217a = new RandomAccessFile(file, "rw");
        } catch (Exception e4) {
            CloseableUtils.close(this.f13217a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e4.getMessage(), e4);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws IOException {
        return this.f13217a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (!this.b.get()) {
            return this.f13217a.getFilePointer();
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
        if (this.b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f13217a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f13218c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j7) throws IOException {
        if (!this.b.get()) {
            if (j7 < 0) {
                j7 = 0;
            }
            this.f13217a.seek(j7);
            return;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i9) throws IOException {
        a(new byte[]{(byte) i9});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j7) throws IOException {
        if (this.b.get()) {
            throw new IOException("released!");
        }
        if (((int) j7) == j7) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j7)));
        }
        return this.f13217a.skipBytes(r0);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i9, int i10) throws IOException {
        int read;
        if (!this.b.get()) {
            if (bArr == null || i10 <= 0 || i9 < 0 || i9 >= bArr.length) {
                return 0;
            }
            if (i9 + i10 > bArr.length) {
                i10 = bArr.length - i9;
            }
            synchronized (this) {
                read = this.f13217a.read(bArr, i9, i10);
            }
            return read;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i9, int i10) throws IOException {
        if (!this.b.get()) {
            if (bArr == null || bArr.length == 0 || i10 <= 0 || i9 < 0 || i9 >= bArr.length) {
                return 0;
            }
            if (i9 + i10 > bArr.length) {
                i10 = bArr.length - i9;
            }
            synchronized (this) {
                this.f13217a.write(bArr, i9, i10);
            }
            return i10;
        }
        throw new IOException("released!");
    }
}
