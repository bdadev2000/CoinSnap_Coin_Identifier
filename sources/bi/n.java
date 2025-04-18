package bi;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wh.d0;
import y7.u;

/* loaded from: classes5.dex */
public final class n {
    public final wh.a a;

    /* renamed from: b, reason: collision with root package name */
    public final u f2507b;

    /* renamed from: c, reason: collision with root package name */
    public final wh.k f2508c;

    /* renamed from: d, reason: collision with root package name */
    public final y5.f f2509d;

    /* renamed from: e, reason: collision with root package name */
    public List f2510e;

    /* renamed from: f, reason: collision with root package name */
    public int f2511f;

    /* renamed from: g, reason: collision with root package name */
    public List f2512g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2513h;

    public n(wh.a address, u routeDatabase, i call, y5.f eventListener) {
        boolean z10;
        List proxies;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.a = address;
        this.f2507b = routeDatabase;
        this.f2508c = call;
        this.f2509d = eventListener;
        this.f2510e = CollectionsKt.emptyList();
        this.f2512g = CollectionsKt.emptyList();
        this.f2513h = new ArrayList();
        d0 url = address.f27007i;
        eventListener.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Proxy proxy = address.f27005g;
        if (proxy != null) {
            proxies = CollectionsKt.listOf(proxy);
        } else {
            URI h10 = url.h();
            if (h10.getHost() == null) {
                proxies = xh.b.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.f27006h.select(h10);
                List<Proxy> list = proxiesOrNull;
                if (list != null && !list.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    proxies = xh.b.k(Proxy.NO_PROXY);
                } else {
                    Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                    proxies = xh.b.x(proxiesOrNull);
                }
            }
        }
        this.f2510e = proxies;
        this.f2511f = 0;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public final boolean a() {
        boolean z10;
        if (this.f2511f < this.f2510e.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (!this.f2513h.isEmpty())) {
            return true;
        }
        return false;
    }
}
