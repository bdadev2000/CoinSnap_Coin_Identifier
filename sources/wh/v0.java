package wh;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 extends Reader {

    /* renamed from: b, reason: collision with root package name */
    public final ki.k f27228b;

    /* renamed from: c, reason: collision with root package name */
    public final Charset f27229c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27230d;

    /* renamed from: f, reason: collision with root package name */
    public InputStreamReader f27231f;

    public v0(ki.k source, Charset charset) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f27228b = source;
        this.f27229c = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Unit unit;
        this.f27230d = true;
        InputStreamReader inputStreamReader = this.f27231f;
        if (inputStreamReader == null) {
            unit = null;
        } else {
            inputStreamReader.close();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f27228b.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cbuf, "cbuf");
        if (!this.f27230d) {
            InputStreamReader inputStreamReader = this.f27231f;
            if (inputStreamReader == null) {
                ki.k kVar = this.f27228b;
                inputStreamReader = new InputStreamReader(kVar.inputStream(), xh.b.r(kVar, this.f27229c));
                this.f27231f = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
        throw new IOException("Stream closed");
    }
}
