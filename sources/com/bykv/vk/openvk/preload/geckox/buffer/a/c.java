package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private long f13219a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f13220c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f13221d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private File f13222e;

    public c(long j7, File file) throws IOException {
        this.f13219a = j7;
        this.f13222e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f13220c = randomAccessFile;
            randomAccessFile.setLength(j7);
        } catch (Exception e4) {
            CloseableUtils.close(this.f13220c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e4.getMessage(), e4);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f13221d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f13219a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (!this.f13221d.get()) {
            return this.b;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.f13221d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f13220c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f13222e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r4 > r0) goto L6;
     */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r4) throws java.io.IOException {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f13221d
            boolean r0 = r0.get()
            if (r0 != 0) goto L1f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
        Le:
            r4 = r0
            goto L17
        L10:
            long r0 = r3.f13219a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto Le
        L17:
            r3.b = r4
            java.io.RandomAccessFile r0 = r3.f13220c
            r0.seek(r4)
            return
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "released!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.buffer.a.c.b(long):void");
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
        int skipBytes;
        if (this.f13221d.get()) {
            throw new IOException("released!");
        }
        int i9 = (int) j7;
        if (i9 == j7) {
            skipBytes = this.f13220c.skipBytes(i9);
            this.b = this.f13220c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j7)));
        }
        return skipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i9, int i10) throws IOException {
        if (!this.f13221d.get()) {
            if (bArr == null || i10 <= 0 || i9 < 0 || i9 >= bArr.length) {
                return 0;
            }
            if (i9 + i10 > bArr.length) {
                i10 = bArr.length - i9;
            }
            synchronized (this) {
                try {
                    long j7 = this.b;
                    long j9 = this.f13219a;
                    if (j7 == j9) {
                        return -1;
                    }
                    if (i10 + j7 > j9) {
                        i10 = (int) (j9 - j7);
                    }
                    int read = this.f13220c.read(bArr, i9, i10);
                    if (read == -1) {
                        return -1;
                    }
                    this.b += read;
                    return read;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i9, int i10) throws IOException {
        if (!this.f13221d.get()) {
            if (bArr == null || bArr.length == 0 || i10 <= 0 || i9 < 0 || i9 >= bArr.length) {
                return 0;
            }
            if (i9 + i10 > bArr.length) {
                i10 = bArr.length - i9;
            }
            synchronized (this) {
                try {
                    long j7 = this.b;
                    long j9 = this.f13219a;
                    if (j7 == j9) {
                        return 0;
                    }
                    if (i10 + j7 > j9) {
                        i10 = (int) (j9 - j7);
                    }
                    this.f13220c.write(bArr, i9, i10);
                    this.b += i10;
                    return i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }
}
