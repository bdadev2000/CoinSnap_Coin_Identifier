package wh;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class o0 {
    public final d0 a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27151b;

    /* renamed from: c, reason: collision with root package name */
    public final z f27152c;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f27153d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f27154e;

    /* renamed from: f, reason: collision with root package name */
    public i f27155f;

    public o0(d0 url, String method, z headers, s0 s0Var, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.a = url;
        this.f27151b = method;
        this.f27152c = headers;
        this.f27153d = s0Var;
        this.f27154e = tags;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f27152c.a(name);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f27151b);
        sb2.append(", url=");
        sb2.append(this.a);
        z zVar = this.f27152c;
        if (zVar.f27243b.length / 2 != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : zVar) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        Map map = this.f27154e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
