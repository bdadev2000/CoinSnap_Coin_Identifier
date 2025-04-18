package ci;

import a6.k;
import com.mbridge.msdk.foundation.download.Command;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import wh.d0;
import wh.e0;
import wh.f0;
import wh.g0;
import wh.n0;
import wh.o0;
import wh.s;
import wh.s0;
import wh.t;
import wh.t0;
import wh.u0;
import wh.w0;
import wh.y0;
import wh.z;

/* loaded from: classes5.dex */
public final class a implements f0 {
    public final t a;

    public a(t cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.a = cookieJar;
    }

    @Override // wh.f0
    public final u0 intercept(e0 chain) {
        a aVar;
        boolean z10;
        boolean equals;
        y0 y0Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        f fVar = (f) chain;
        o0 request = fVar.f2805e;
        request.getClass();
        n0 n0Var = new n0(request);
        s0 s0Var = request.f27153d;
        if (s0Var != null) {
            g0 contentType = s0Var.contentType();
            if (contentType != null) {
                n0Var.c("Content-Type", contentType.a);
            }
            long contentLength = s0Var.contentLength();
            if (contentLength != -1) {
                n0Var.c("Content-Length", String.valueOf(contentLength));
                n0Var.g("Transfer-Encoding");
            } else {
                n0Var.c("Transfer-Encoding", "chunked");
                n0Var.g("Content-Length");
            }
        }
        String a = request.a("Host");
        int i10 = 0;
        d0 url = request.a;
        if (a == null) {
            n0Var.c("Host", xh.b.w(url, false));
        }
        if (request.a("Connection") == null) {
            n0Var.c("Connection", "Keep-Alive");
        }
        if (request.a("Accept-Encoding") == null && request.a(Command.HTTP_HEADER_RANGE) == null) {
            n0Var.c("Accept-Encoding", "gzip");
            aVar = this;
            z10 = true;
        } else {
            aVar = this;
            z10 = false;
        }
        t tVar = aVar.a;
        ((v5.b) tVar).getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        List emptyList = CollectionsKt.emptyList();
        if (true ^ emptyList.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : emptyList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                s sVar = (s) obj;
                if (i10 > 0) {
                    sb2.append("; ");
                }
                sb2.append(sVar.a);
                sb2.append('=');
                sb2.append(sVar.f27192b);
                i10 = i11;
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            n0Var.c("Cookie", sb3);
        }
        if (request.a(Command.HTTP_HEADER_USER_AGENT) == null) {
            n0Var.c(Command.HTTP_HEADER_USER_AGENT, "okhttp/4.10.0");
        }
        u0 b3 = fVar.b(n0Var.b());
        z zVar = b3.f27218h;
        e.d(tVar, url, zVar);
        t0 t0Var = new t0(b3);
        Intrinsics.checkNotNullParameter(request, "request");
        t0Var.a = request;
        if (z10) {
            equals = StringsKt__StringsJVMKt.equals("gzip", u0.g(b3, "Content-Encoding"), true);
            if (equals && e.a(b3) && (y0Var = b3.f27219i) != null) {
                ki.t tVar2 = new ki.t(y0Var.source());
                a4.s c10 = zVar.c();
                c10.f("Content-Encoding");
                c10.f("Content-Length");
                t0Var.c(c10.d());
                t0Var.f27205g = new w0(u0.g(b3, "Content-Type"), -1L, k.f(tVar2));
            }
        }
        return t0Var.a();
    }
}
