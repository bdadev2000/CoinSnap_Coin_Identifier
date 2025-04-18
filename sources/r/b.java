package r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b extends k implements Map {

    /* renamed from: j, reason: collision with root package name */
    public a f23918j;

    public b() {
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i10 = 0;
        if (this.f23918j == null) {
            this.f23918j = new a(this, i10);
        }
        a aVar = this.f23918j;
        if (((h) aVar.a) == null) {
            aVar.a = new h(aVar, i10);
        }
        return (h) aVar.a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f23918j == null) {
            this.f23918j = new a(this, 0);
        }
        a aVar = this.f23918j;
        if (((h) aVar.f20054b) == null) {
            aVar.f20054b = new h(aVar, 1);
        }
        return (h) aVar.f20054b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f23955d);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f23918j == null) {
            this.f23918j = new a(this, 0);
        }
        a aVar = this.f23918j;
        if (((j) aVar.f20055c) == null) {
            aVar.f20055c = new j(aVar);
        }
        return (j) aVar.f20055c;
    }

    public b(int i10) {
        super(i10);
    }

    public b(b bVar) {
        super(bVar);
    }
}
