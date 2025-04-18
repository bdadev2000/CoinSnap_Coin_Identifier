package x;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final o f27267d;

    /* renamed from: f, reason: collision with root package name */
    public int f27269f;

    /* renamed from: g, reason: collision with root package name */
    public int f27270g;
    public o a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27265b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27266c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f27268e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f27271h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f27272i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27273j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f27274k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f27275l = new ArrayList();

    public f(o oVar) {
        this.f27267d = oVar;
    }

    @Override // x.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f27275l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f27273j) {
                return;
            }
        }
        this.f27266c = true;
        o oVar = this.a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f27265b) {
            this.f27267d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f27273j) {
            g gVar = this.f27272i;
            if (gVar != null) {
                if (gVar.f27273j) {
                    this.f27269f = this.f27271h * gVar.f27270g;
                } else {
                    return;
                }
            }
            d(fVar.f27270g + this.f27269f);
        }
        o oVar2 = this.a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f27274k.add(dVar);
        if (this.f27273j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f27275l.clear();
        this.f27274k.clear();
        this.f27273j = false;
        this.f27270g = 0;
        this.f27266c = false;
        this.f27265b = false;
    }

    public void d(int i10) {
        if (this.f27273j) {
            return;
        }
        this.f27273j = true;
        this.f27270g = i10;
        Iterator it = this.f27274k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27267d.f27293b.f26594h0);
        sb2.append(":");
        sb2.append(vd.e.i(this.f27268e));
        sb2.append("(");
        if (this.f27273j) {
            obj = Integer.valueOf(this.f27270g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f27275l.size());
        sb2.append(":d=");
        sb2.append(this.f27274k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
