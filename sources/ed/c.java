package ed;

import java.nio.charset.StandardCharsets;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public f f17306b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f17307c;

    /* renamed from: d, reason: collision with root package name */
    public int f17308d;

    /* renamed from: e, reason: collision with root package name */
    public int f17309e;

    /* renamed from: f, reason: collision with root package name */
    public e f17310f;

    /* renamed from: g, reason: collision with root package name */
    public int f17311g;

    public c(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & UByte.MAX_VALUE);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.a = sb2.toString();
        this.f17306b = f.FORCE_NONE;
        this.f17307c = new StringBuilder(str.length());
        this.f17309e = -1;
    }

    public final int a() {
        return this.f17307c.length();
    }

    public final char b() {
        return this.a.charAt(this.f17308d);
    }

    public final boolean c() {
        if (this.f17308d < this.a.length() - this.f17311g) {
            return true;
        }
        return false;
    }

    public final void d(int i10) {
        e eVar = this.f17310f;
        if (eVar == null || i10 > eVar.f17316b) {
            this.f17310f = e.e(i10, this.f17306b);
        }
    }

    public final void e(char c10) {
        this.f17307c.append(c10);
    }
}
