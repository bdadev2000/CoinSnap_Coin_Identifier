package p;

import android.graphics.Bitmap;
import b1.f0;
import okhttp3.Headers;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import z0.m;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d0.h f31211a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.h f31212b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31213c;
    public final long d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers f31214f;

    public c(BufferedSource bufferedSource) {
        d0.i iVar = d0.i.f30133c;
        this.f31211a = f0.s(iVar, new a(this));
        this.f31212b = f0.s(iVar, new b(this));
        this.f31213c = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.d = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.e = Integer.parseInt(bufferedSource.readUtf8LineStrict()) > 0;
        int parseInt = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < parseInt; i2++) {
            String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
            Bitmap.Config[] configArr = v.g.f31378a;
            int W0 = m.W0(readUtf8LineStrict, ':', 0, false, 6);
            if (W0 != -1) {
                String substring = readUtf8LineStrict.substring(0, W0);
                p0.a.r(substring, "substring(...)");
                String obj = m.y1(substring).toString();
                String substring2 = readUtf8LineStrict.substring(W0 + 1);
                p0.a.r(substring2, "substring(...)");
                builder.addUnsafeNonAscii(obj, substring2);
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(readUtf8LineStrict).toString());
            }
        }
        this.f31214f = builder.build();
    }

    public final void a(BufferedSink bufferedSink) {
        bufferedSink.writeDecimalLong(this.f31213c).writeByte(10);
        bufferedSink.writeDecimalLong(this.d).writeByte(10);
        bufferedSink.writeDecimalLong(this.e ? 1L : 0L).writeByte(10);
        Headers headers = this.f31214f;
        bufferedSink.writeDecimalLong(headers.size()).writeByte(10);
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            bufferedSink.writeUtf8(headers.name(i2)).writeUtf8(": ").writeUtf8(headers.value(i2)).writeByte(10);
        }
    }

    public c(Response response) {
        d0.i iVar = d0.i.f30133c;
        this.f31211a = f0.s(iVar, new a(this));
        this.f31212b = f0.s(iVar, new b(this));
        this.f31213c = response.sentRequestAtMillis();
        this.d = response.receivedResponseAtMillis();
        this.e = response.handshake() != null;
        this.f31214f = response.headers();
    }
}
