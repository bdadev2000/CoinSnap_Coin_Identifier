package x;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b extends l implements Map {

    /* renamed from: j, reason: collision with root package name */
    public C2913a f24055j;

    public b(int i9) {
        if (i9 == 0) {
            this.b = e.f24067a;
            this.f24085c = e.f24068c;
        } else {
            a(i9);
        }
        this.f24086d = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f24055j == null) {
            this.f24055j = new C2913a(this, 0);
        }
        C2913a c2913a = this.f24055j;
        if (c2913a.f24051a == null) {
            c2913a.f24051a = new i(c2913a, 0);
        }
        return c2913a.f24051a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f24055j == null) {
            this.f24055j = new C2913a(this, 0);
        }
        C2913a c2913a = this.f24055j;
        if (c2913a.b == null) {
            c2913a.b = new i(c2913a, 1);
        }
        return c2913a.b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f24086d);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f24055j == null) {
            this.f24055j = new C2913a(this, 0);
        }
        C2913a c2913a = this.f24055j;
        if (c2913a.f24052c == null) {
            c2913a.f24052c = new k(c2913a);
        }
        return c2913a.f24052c;
    }
}
