package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f10048b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f10049c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f10050d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private File f10051e;

    public c(long j3, File file) throws IOException {
        this.a = j3;
        this.f10051e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f10049c = randomAccessFile;
            randomAccessFile.setLength(j3);
        } catch (Exception e2) {
            CloseableUtils.close(this.f10049c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f10050d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (!this.f10050d.get()) {
            return this.f10048b;
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
        if (this.f10050d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f10049c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f10051e;
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
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f10050d
            boolean r0 = r0.get()
            if (r0 != 0) goto L1f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
        Le:
            r4 = r0
            goto L17
        L10:
            long r0 = r3.a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto Le
        L17:
            r3.f10048b = r4
            java.io.RandomAccessFile r0 = r3.f10049c
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
    public final void a(int i10) throws IOException {
        a(new byte[]{(byte) i10});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j3) throws IOException {
        int skipBytes;
        if (this.f10050d.get()) {
            throw new IOException("released!");
        }
        int i10 = (int) j3;
        if (i10 == j3) {
            skipBytes = this.f10049c.skipBytes(i10);
            this.f10048b = this.f10049c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j3)));
        }
        return skipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f10050d.get()) {
            if (bArr == null || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                long j3 = this.f10048b;
                long j10 = this.a;
                if (j3 == j10) {
                    return -1;
                }
                if (i11 + j3 > j10) {
                    i11 = (int) (j10 - j3);
                }
                int read = this.f10049c.read(bArr, i10, i11);
                if (read == -1) {
                    return -1;
                }
                this.f10048b += read;
                return read;
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f10050d.get()) {
            if (bArr == null || bArr.length == 0 || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                long j3 = this.f10048b;
                long j10 = this.a;
                if (j3 == j10) {
                    return 0;
                }
                if (i11 + j3 > j10) {
                    i11 = (int) (j10 - j3);
                }
                this.f10049c.write(bArr, i10, i11);
                this.f10048b += i11;
                return i11;
            }
        }
        throw new IOException("released!");
    }
}
