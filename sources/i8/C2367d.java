package i8;

import java.util.regex.Pattern;

/* renamed from: i8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2367d extends M {
    public final k8.f b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20811c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20812d;

    /* renamed from: f, reason: collision with root package name */
    public final w8.t f20813f;

    public C2367d(k8.f fVar, String str, String str2) {
        this.b = fVar;
        this.f20811c = str;
        this.f20812d = str2;
        this.f20813f = r8.k.f(new C2366c((w8.y) fVar.f21513d.get(1), this));
    }

    @Override // i8.M
    public final long contentLength() {
        String str = this.f20812d;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = j8.b.f21214a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // i8.M
    public final x contentType() {
        String str = this.f20811c;
        if (str == null) {
            return null;
        }
        Pattern pattern = x.f20893c;
        return r8.k.u(str);
    }

    @Override // i8.M
    public final w8.h source() {
        return this.f20813f;
    }
}
