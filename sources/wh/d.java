package wh;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final zh.h f27028b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27029c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27030d;

    /* renamed from: f, reason: collision with root package name */
    public final ki.e0 f27031f;

    public d(zh.h snapshot, String str, String str2) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f27028b = snapshot;
        this.f27029c = str;
        this.f27030d = str2;
        this.f27031f = a6.k.f(new c((ki.k0) snapshot.f28798d.get(1), this));
    }

    @Override // wh.y0
    public final long contentLength() {
        String str = this.f27030d;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = xh.b.a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // wh.y0
    public final g0 contentType() {
        String str = this.f27029c;
        if (str == null) {
            return null;
        }
        Pattern pattern = g0.f27059d;
        return a0.E(str);
    }

    @Override // wh.y0
    public final ki.k source() {
        return this.f27031f;
    }
}
