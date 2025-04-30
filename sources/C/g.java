package C;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g implements e {

    /* renamed from: d, reason: collision with root package name */
    public final p f360d;

    /* renamed from: f, reason: collision with root package name */
    public int f362f;

    /* renamed from: g, reason: collision with root package name */
    public int f363g;

    /* renamed from: a, reason: collision with root package name */
    public p f358a = null;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f359c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f361e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f364h = 1;

    /* renamed from: i, reason: collision with root package name */
    public h f365i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f366j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f367k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public g(p pVar) {
        this.f360d = pVar;
    }

    @Override // C.e
    public final void a(e eVar) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).f366j) {
                return;
            }
        }
        this.f359c = true;
        p pVar = this.f358a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.b) {
            this.f360d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        g gVar = null;
        int i9 = 0;
        while (it2.hasNext()) {
            g gVar2 = (g) it2.next();
            if (!(gVar2 instanceof h)) {
                i9++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i9 == 1 && gVar.f366j) {
            h hVar = this.f365i;
            if (hVar != null) {
                if (hVar.f366j) {
                    this.f362f = this.f364h * hVar.f363g;
                } else {
                    return;
                }
            }
            d(gVar.f363g + this.f362f);
        }
        p pVar2 = this.f358a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(e eVar) {
        this.f367k.add(eVar);
        if (this.f366j) {
            eVar.a(eVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.f367k.clear();
        this.f366j = false;
        this.f363g = 0;
        this.f359c = false;
        this.b = false;
    }

    public void d(int i9) {
        if (this.f366j) {
            return;
        }
        this.f366j = true;
        this.f363g = i9;
        Iterator it = this.f367k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.a(eVar);
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f360d.b.f149h0);
        sb.append(":");
        switch (this.f361e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.f366j) {
            obj = Integer.valueOf(this.f363g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.f367k.size());
        sb.append(">");
        return sb.toString();
    }
}
