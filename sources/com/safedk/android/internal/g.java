package com.safedk.android.internal;

import android.support.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class g extends OutputStream implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29967a = "SafeDKOutputStream";

    /* renamed from: b, reason: collision with root package name */
    private String f29968b;

    /* renamed from: c, reason: collision with root package name */
    private OutputStream f29969c;
    private String d;
    private ByteArrayOutputStream e = new ByteArrayOutputStream();

    /* renamed from: f, reason: collision with root package name */
    private c f29970f = this;

    public g(String str, String str2, OutputStream outputStream) {
        this.f29968b = str;
        this.d = str2;
        this.f29969c = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        this.f29969c.write(i2);
        if (i2 >= 0) {
            try {
                this.e.write(i2);
            } catch (Throwable th) {
                try {
                    Logger.e(f29967a, th.getMessage());
                } catch (Throwable th2) {
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] b2) throws IOException {
        this.f29969c.write(b2);
        a(b2, 0, b2.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] b2, int off, int len) throws IOException {
        this.f29969c.write(b2, off, len);
        a(b2, off, len);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29969c.close();
        String byteArrayOutputStream = this.e.toString();
        Logger.d(f29967a, "closing output stream");
        this.f29970f.a(this.f29968b, this.d, byteArrayOutputStream);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f29969c.flush();
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (i3 > 0) {
            try {
                this.e.write(bArr, i2, i3);
            } catch (Throwable th) {
                try {
                    Logger.e(f29967a, th.getMessage());
                } catch (Throwable th2) {
                }
            }
        }
    }

    public void a(c cVar) {
        this.f29970f = cVar;
    }

    @Override // com.safedk.android.internal.c
    public void a(String str, String str2, String str3) {
        Logger.d(f29967a, "onStreamClose " + this + " sdkPackageName: " + str);
        CreativeInfoManager.c(str, str2, str3);
    }
}
