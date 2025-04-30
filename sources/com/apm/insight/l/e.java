package com.apm.insight.l;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class e extends PrintWriter {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f5925a;
    private Charset b;

    /* renamed from: c, reason: collision with root package name */
    private a f5926c;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(@NonNull OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.b = null;
        this.f5925a = messageDigest;
        this.f5926c = aVar;
        if (messageDigest != null) {
            this.b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i9) {
        super.write(i9);
        MessageDigest messageDigest = this.f5925a;
        if (messageDigest != null) {
            messageDigest.update((byte) i9);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(@NonNull String str, int i9, int i10) {
        super.write(str, i9, i10);
        if (this.f5925a != null) {
            a aVar = this.f5926c;
            if (aVar == null || aVar.a(str)) {
                this.f5925a.update(this.b.encode(CharBuffer.wrap(str, i9, i10 + i9)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(@NonNull char[] cArr, int i9, int i10) {
        super.write(cArr, i9, i10);
        MessageDigest messageDigest = this.f5925a;
        if (messageDigest != null) {
            messageDigest.update(this.b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
