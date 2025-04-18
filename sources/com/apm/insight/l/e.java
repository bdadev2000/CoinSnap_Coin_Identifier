package com.apm.insight.l;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class e extends PrintWriter {
    private MessageDigest a;

    /* renamed from: b, reason: collision with root package name */
    private Charset f3232b;

    /* renamed from: c, reason: collision with root package name */
    private a f3233c;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(@NonNull OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f3232b = null;
        this.a = messageDigest;
        this.f3233c = aVar;
        if (messageDigest != null) {
            this.f3232b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.a;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(@NonNull String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.a != null) {
            a aVar = this.f3233c;
            if (aVar == null || aVar.a(str)) {
                this.a.update(this.f3232b.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(@NonNull char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.a;
        if (messageDigest != null) {
            messageDigest.update(this.f3232b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
