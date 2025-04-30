package N7;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import u7.AbstractC2816g;
import u7.AbstractC2822m;

/* loaded from: classes3.dex */
public final class l implements Iterator, H7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f2135c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2136d;

    public l(G7.a aVar) {
        this.b = 1;
        this.f2136d = new ArrayList();
        this.f2135c = aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                return this.f2135c.hasNext();
            default:
                return this.f2135c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                return ((e) this.f2136d).b.invoke(this.f2135c.next());
            default:
                Object next = this.f2135c.next();
                View view = (View) next;
                G7.a aVar = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    aVar = new G7.a(viewGroup, 1);
                }
                ArrayList arrayList = (ArrayList) this.f2136d;
                if (aVar != null && aVar.hasNext()) {
                    arrayList.add(this.f2135c);
                    this.f2135c = aVar;
                } else {
                    while (!this.f2135c.hasNext() && (!arrayList.isEmpty())) {
                        this.f2135c = (Iterator) AbstractC2816g.P(arrayList);
                        AbstractC2822m.H(arrayList);
                    }
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(e eVar) {
        this.b = 0;
        this.f2136d = eVar;
        this.f2135c = ((f) eVar.f2129c).iterator();
    }
}
