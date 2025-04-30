package w7;

import F7.p;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import t7.y;

/* loaded from: classes3.dex */
public final class e implements k, Serializable {
    public final k b;

    /* renamed from: c, reason: collision with root package name */
    public final i f23998c;

    public e(k kVar, i iVar) {
        G7.j.e(kVar, TtmlNode.LEFT);
        G7.j.e(iVar, "element");
        this.b = kVar;
        this.f23998c = iVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [G7.q, java.lang.Object] */
    private final Object writeReplace() {
        int d2 = d();
        k[] kVarArr = new k[d2];
        ?? obj = new Object();
        b(y.f23029a, new d(kVarArr, obj));
        if (obj.b == d2) {
            return new b(kVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // w7.k
    public final Object b(Object obj, p pVar) {
        return pVar.g(this.b.b(obj, pVar), this.f23998c);
    }

    public final int d() {
        int i9 = 2;
        e eVar = this;
        while (true) {
            k kVar = eVar.b;
            if (kVar instanceof e) {
                eVar = (e) kVar;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                return i9;
            }
            i9++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z8;
        if (this != obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.d() != d()) {
                return false;
            }
            e eVar2 = this;
            while (true) {
                i iVar = eVar2.f23998c;
                if (!G7.j.a(eVar.h(iVar.getKey()), iVar)) {
                    z8 = false;
                    break;
                }
                k kVar = eVar2.b;
                if (kVar instanceof e) {
                    eVar2 = (e) kVar;
                } else {
                    G7.j.c(kVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    i iVar2 = (i) kVar;
                    z8 = G7.j.a(eVar.h(iVar2.getKey()), iVar2);
                    break;
                }
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    @Override // w7.k
    public final i h(j jVar) {
        G7.j.e(jVar, "key");
        e eVar = this;
        while (true) {
            i h6 = eVar.f23998c.h(jVar);
            if (h6 != null) {
                return h6;
            }
            k kVar = eVar.b;
            if (kVar instanceof e) {
                eVar = (e) kVar;
            } else {
                return kVar.h(jVar);
            }
        }
    }

    public final int hashCode() {
        return this.f23998c.hashCode() + this.b.hashCode();
    }

    @Override // w7.k
    public final k i(j jVar) {
        G7.j.e(jVar, "key");
        i iVar = this.f23998c;
        i h6 = iVar.h(jVar);
        k kVar = this.b;
        if (h6 != null) {
            return kVar;
        }
        k i9 = kVar.i(jVar);
        if (i9 == kVar) {
            return this;
        }
        if (i9 != l.b) {
            return new e(i9, iVar);
        }
        return iVar;
    }

    @Override // w7.k
    public final k n(k kVar) {
        G7.j.e(kVar, "context");
        if (kVar == l.b) {
            return this;
        }
        return (k) kVar.b(this, c.f23996d);
    }

    public final String toString() {
        return L.k(new StringBuilder("["), (String) b("", c.f23995c), ']');
    }
}
