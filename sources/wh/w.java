package wh;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f27232c;
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27233b;

    static {
        Pattern pattern = g0.f27059d;
        f27232c = a0.r("application/x-www-form-urlencoded");
    }

    public w(ArrayList encodedNames, ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.a = xh.b.x(encodedNames);
        this.f27233b = xh.b.x(encodedValues);
    }

    public final long a(ki.j jVar, boolean z10) {
        ki.i y4;
        if (z10) {
            y4 = new ki.i();
        } else {
            Intrinsics.checkNotNull(jVar);
            y4 = jVar.y();
        }
        List list = this.a;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                y4.w(38);
            }
            y4.Y((String) list.get(i10));
            y4.w(61);
            y4.Y((String) this.f27233b.get(i10));
            i10 = i11;
        }
        if (z10) {
            long j3 = y4.f20994c;
            y4.d();
            return j3;
        }
        return 0L;
    }

    @Override // wh.s0
    public final long contentLength() {
        return a(null, true);
    }

    @Override // wh.s0
    public final g0 contentType() {
        return f27232c;
    }

    @Override // wh.s0
    public final void writeTo(ki.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
