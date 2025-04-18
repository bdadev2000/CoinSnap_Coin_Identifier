package zh;

import com.mbridge.msdk.foundation.download.Command;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import wh.o0;
import wh.u0;
import wh.z;

/* loaded from: classes5.dex */
public final class d {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f28772b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f28773c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f28774d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28775e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f28776f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28777g;

    /* renamed from: h, reason: collision with root package name */
    public final Date f28778h;

    /* renamed from: i, reason: collision with root package name */
    public final long f28779i;

    /* renamed from: j, reason: collision with root package name */
    public final long f28780j;

    /* renamed from: k, reason: collision with root package name */
    public final String f28781k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28782l;

    public d(long j3, o0 request, u0 u0Var) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = j3;
        this.f28772b = request;
        this.f28773c = u0Var;
        this.f28782l = -1;
        if (u0Var != null) {
            this.f28779i = u0Var.f27223m;
            this.f28780j = u0Var.f27224n;
            z zVar = u0Var.f27218h;
            int length = zVar.f27243b.length / 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                String b3 = zVar.b(i10);
                String d10 = zVar.d(i10);
                equals = StringsKt__StringsJVMKt.equals(b3, "Date", true);
                if (equals) {
                    this.f28774d = ci.c.a(d10);
                    this.f28775e = d10;
                } else {
                    equals2 = StringsKt__StringsJVMKt.equals(b3, "Expires", true);
                    if (equals2) {
                        this.f28778h = ci.c.a(d10);
                    } else {
                        equals3 = StringsKt__StringsJVMKt.equals(b3, "Last-Modified", true);
                        if (equals3) {
                            this.f28776f = ci.c.a(d10);
                            this.f28777g = d10;
                        } else {
                            equals4 = StringsKt__StringsJVMKt.equals(b3, Command.HTTP_HEADER_ETAG, true);
                            if (equals4) {
                                this.f28781k = d10;
                            } else {
                                equals5 = StringsKt__StringsJVMKt.equals(b3, "Age", true);
                                if (equals5) {
                                    this.f28782l = xh.b.y(-1, d10);
                                }
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
    }
}
