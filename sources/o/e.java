package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import e0.e0;
import e0.x;
import f.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q.n;
import q.q;
import q.r;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f.i f31171a;

    /* renamed from: b, reason: collision with root package name */
    public final q f31172b;

    public e(f.i iVar, q qVar) {
        this.f31171a = iVar;
        this.f31172b = qVar;
    }

    public static r c(l.l lVar, q.j jVar, c cVar, d dVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jVar.f31291a.getResources(), dVar.f31169a);
        h.g gVar = h.g.f30668a;
        Map map = dVar.f31170b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = v.g.f31378a;
        return new r(bitmapDrawable, jVar, gVar, cVar, str, booleanValue, (lVar instanceof l.l) && lVar.f31009g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r7 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (p0.a.g(r2, r20.toString()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        if (java.lang.Math.abs(r3 - (r10 * r4)) > 1.0d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        if (r12 != 1.0d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        if (r1 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
    
        if (r12 <= 1.0d) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        if (r7 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ef, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        if (java.lang.Math.abs(r3 - r4) > 1) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.d a(q.j r18, o.c r19, r.g r20, r.f r21) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.a(q.j, o.c, r.g, r.f):o.d");
    }

    public final c b(q.j jVar, Object obj, n nVar, f.e eVar) {
        String str;
        Map linkedHashMap;
        c cVar = jVar.e;
        if (cVar != null) {
            return cVar;
        }
        List list = ((o) this.f31171a).f30412f.f30382c;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str = null;
                break;
            }
            d0.k kVar = (d0.k) list.get(i2);
            m.b bVar = (m.b) kVar.f30134a;
            if (((Class) kVar.f30135b).isAssignableFrom(obj.getClass())) {
                p0.a.q(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                str = bVar.a(obj, nVar);
                if (str != null) {
                    break;
                }
            }
            i2++;
        }
        if (str == null) {
            return null;
        }
        Map map = jVar.D.f31328a;
        boolean isEmpty = map.isEmpty();
        x xVar = x.f30219a;
        if (isEmpty) {
            linkedHashMap = xVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                android.support.v4.media.d.C(((Map.Entry) it.next()).getValue());
                throw null;
            }
        }
        List list2 = jVar.f31300l;
        if (list2.isEmpty() && linkedHashMap.isEmpty()) {
            return new c(str, xVar);
        }
        LinkedHashMap z2 = e0.z(linkedHashMap);
        if (!list2.isEmpty()) {
            if (list2.size() > 0) {
                android.support.v4.media.d.C(list2.get(0));
                throw null;
            }
            z2.put("coil#transformation_size", nVar.d.toString());
        }
        return new c(str, z2);
    }
}
