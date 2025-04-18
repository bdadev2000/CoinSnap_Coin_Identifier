package ei;

import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final ki.l f17390d;

    /* renamed from: e, reason: collision with root package name */
    public static final ki.l f17391e;

    /* renamed from: f, reason: collision with root package name */
    public static final ki.l f17392f;

    /* renamed from: g, reason: collision with root package name */
    public static final ki.l f17393g;

    /* renamed from: h, reason: collision with root package name */
    public static final ki.l f17394h;

    /* renamed from: i, reason: collision with root package name */
    public static final ki.l f17395i;
    public final ki.l a;

    /* renamed from: b, reason: collision with root package name */
    public final ki.l f17396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17397c;

    static {
        ki.l lVar = ki.l.f20996f;
        f17390d = wh.a0.p(":");
        f17391e = wh.a0.p(Header.RESPONSE_STATUS_UTF8);
        f17392f = wh.a0.p(Header.TARGET_METHOD_UTF8);
        f17393g = wh.a0.p(Header.TARGET_PATH_UTF8);
        f17394h = wh.a0.p(Header.TARGET_SCHEME_UTF8);
        f17395i = wh.a0.p(Header.TARGET_AUTHORITY_UTF8);
    }

    public c(ki.l name, ki.l value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a = name;
        this.f17396b = value;
        this.f17397c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.f17396b, cVar.f17396b);
    }

    public final int hashCode() {
        return this.f17396b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.q() + ": " + this.f17396b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String name, String value) {
        this(wh.a0.p(name), wh.a0.p(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ki.l lVar = ki.l.f20996f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ki.l name, String value) {
        this(name, wh.a0.p(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ki.l lVar = ki.l.f20996f;
    }
}
