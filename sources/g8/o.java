package g8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e8.W;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import u7.AbstractC2822m;
import u7.AbstractC2829t;
import u7.C2826q;

/* loaded from: classes3.dex */
public class o extends a {

    /* renamed from: e, reason: collision with root package name */
    public final f8.v f20514e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20515f;

    /* renamed from: g, reason: collision with root package name */
    public final c8.g f20516g;

    /* renamed from: h, reason: collision with root package name */
    public int f20517h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20518i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f8.b bVar, f8.v vVar, String str, c8.g gVar) {
        super(bVar);
        G7.j.e(bVar, "json");
        G7.j.e(vVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f20514e = vVar;
        this.f20515f = str;
        this.f20516g = gVar;
    }

    @Override // g8.a
    public f8.j G(String str) {
        G7.j.e(str, "tag");
        return (f8.j) AbstractC2829t.W(T(), str);
    }

    @Override // g8.a
    public String Q(c8.g gVar, int i9) {
        Object obj;
        G7.j.e(gVar, CampaignEx.JSON_KEY_DESC);
        String g9 = gVar.g(i9);
        if (!this.f20494d.l) {
            return g9;
        }
        if (T().b.keySet().contains(g9)) {
            return g9;
        }
        f8.b bVar = this.f20493c;
        G7.j.e(bVar, "<this>");
        K2.b bVar2 = bVar.f20371c;
        bVar2.getClass();
        l lVar = k.f20506a;
        Object a6 = bVar2.a(gVar);
        if (a6 == null) {
            a6 = k.e(gVar);
            ConcurrentHashMap concurrentHashMap = bVar2.f1645a;
            Object obj2 = concurrentHashMap.get(gVar);
            if (obj2 == null) {
                obj2 = new ConcurrentHashMap(1);
                concurrentHashMap.put(gVar, obj2);
            }
            ((Map) obj2).put(lVar, a6);
        }
        Map map = (Map) a6;
        Iterator it = T().b.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i9) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return g9;
    }

    @Override // g8.a
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public f8.v T() {
        return this.f20514e;
    }

    @Override // g8.a, d8.c
    public final d8.a b(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        if (gVar == this.f20516g) {
            return this;
        }
        return super.b(gVar);
    }

    @Override // g8.a, d8.a
    public void c(c8.g gVar) {
        Set set;
        int size;
        Set set2;
        G7.j.e(gVar, "descriptor");
        f8.h hVar = this.f20494d;
        if (!hVar.b && !(gVar.getKind() instanceof c8.d)) {
            if (!hVar.l) {
                set2 = W.b(gVar);
            } else {
                Set b = W.b(gVar);
                f8.b bVar = this.f20493c;
                G7.j.e(bVar, "<this>");
                Map map = (Map) bVar.f20371c.a(gVar);
                Integer num = null;
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = C2826q.b;
                }
                Set set3 = set;
                G7.j.e(b, "<this>");
                if (set3 instanceof Collection) {
                    num = Integer.valueOf(set3.size());
                }
                if (num != null) {
                    size = b.size() + num.intValue();
                } else {
                    size = b.size() * 2;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2829t.Y(size));
                linkedHashSet.addAll(b);
                AbstractC2822m.G(set3, linkedHashSet);
                set2 = linkedHashSet;
            }
            for (String str : T().b.keySet()) {
                if (!set2.contains(str) && !G7.j.a(str, this.f20515f)) {
                    String vVar = T().toString();
                    G7.j.e(str, "key");
                    StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Encountered unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                    n2.append((Object) k.l(vVar, -1));
                    throw k.c(-1, n2.toString());
                }
            }
        }
    }

    @Override // d8.a
    public int h(c8.g gVar) {
        f8.y yVar;
        G7.j.e(gVar, "descriptor");
        while (this.f20517h < gVar.f()) {
            int i9 = this.f20517h;
            this.f20517h = i9 + 1;
            String S8 = S(gVar, i9);
            boolean z8 = true;
            int i10 = this.f20517h - 1;
            this.f20518i = false;
            boolean containsKey = T().containsKey(S8);
            f8.b bVar = this.f20493c;
            if (!containsKey) {
                if (bVar.f20370a.f20389f || gVar.k(i10) || !gVar.j(i10).c()) {
                    z8 = false;
                }
                this.f20518i = z8;
                if (!z8) {
                    continue;
                }
            }
            if (this.f20494d.f20391h) {
                c8.g j7 = gVar.j(i10);
                if (j7.c() || !(G(S8) instanceof f8.t)) {
                    if (G7.j.a(j7.getKind(), c8.k.f5452e)) {
                        f8.j G3 = G(S8);
                        String str = null;
                        if (G3 instanceof f8.y) {
                            yVar = (f8.y) G3;
                        } else {
                            yVar = null;
                        }
                        if (yVar != null && !(yVar instanceof f8.t)) {
                            str = yVar.b();
                        }
                        if (str != null && k.j(j7, bVar, str) == -3) {
                        }
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // g8.a, d8.c
    public final boolean v() {
        if (!this.f20518i && super.v()) {
            return true;
        }
        return false;
    }
}
