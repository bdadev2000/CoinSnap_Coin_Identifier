package l9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public Map f21246b;

    public n(String str) {
        this.f21246b = null;
        this.a = str;
    }

    public final vb.c a() {
        Map unmodifiableMap;
        if (this.f21246b == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f21246b));
        }
        return new vb.c(this.a, unmodifiableMap);
    }

    public final void b(yb.a aVar) {
        if (this.f21246b == null) {
            this.f21246b = new HashMap();
        }
        this.f21246b.put(yb.e.class, aVar);
    }

    public n(String str, Map map) {
        this.a = str;
        this.f21246b = map;
    }
}
