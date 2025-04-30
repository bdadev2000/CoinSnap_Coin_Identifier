package i8;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class J extends Reader {
    public final w8.h b;

    /* renamed from: c, reason: collision with root package name */
    public final Charset f20785c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20786d;

    /* renamed from: f, reason: collision with root package name */
    public InputStreamReader f20787f;

    public J(w8.h hVar, Charset charset) {
        G7.j.e(hVar, "source");
        G7.j.e(charset, "charset");
        this.b = hVar;
        this.f20785c = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t7.y yVar;
        this.f20786d = true;
        InputStreamReader inputStreamReader = this.f20787f;
        if (inputStreamReader == null) {
            yVar = null;
        } else {
            inputStreamReader.close();
            yVar = t7.y.f23029a;
        }
        if (yVar == null) {
            this.b.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i9, int i10) {
        G7.j.e(cArr, "cbuf");
        if (!this.f20786d) {
            InputStreamReader inputStreamReader = this.f20787f;
            if (inputStreamReader == null) {
                w8.h hVar = this.b;
                inputStreamReader = new InputStreamReader(hVar.inputStream(), j8.b.r(hVar, this.f20785c));
                this.f20787f = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i9, i10);
        }
        throw new IOException("Stream closed");
    }
}
