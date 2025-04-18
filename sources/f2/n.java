package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.u1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n extends u1 {
    @Override // androidx.fragment.app.u1
    public final void a(View view, Object obj) {
        ((t) obj).b(view);
    }

    @Override // androidx.fragment.app.u1
    public final void b(Object obj, ArrayList arrayList) {
        boolean z10;
        t tVar;
        t tVar2 = (t) obj;
        if (tVar2 == null) {
            return;
        }
        int i10 = 0;
        if (tVar2 instanceof z) {
            z zVar = (z) tVar2;
            int size = zVar.D.size();
            while (i10 < size) {
                if (i10 >= 0 && i10 < zVar.D.size()) {
                    tVar = (t) zVar.D.get(i10);
                } else {
                    tVar = null;
                }
                b(tVar, arrayList);
                i10++;
            }
            return;
        }
        if (u1.h(tVar2.f17642g) && u1.h(null) && u1.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && u1.h(tVar2.f17643h)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                tVar2.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.u1
    public final void c(ViewGroup viewGroup, Object obj) {
        x.a(viewGroup, (t) obj);
    }

    @Override // androidx.fragment.app.u1
    public final boolean e(Object obj) {
        return obj instanceof t;
    }

    @Override // androidx.fragment.app.u1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((t) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.u1
    public final Object i(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        t tVar3 = (t) obj3;
        if (tVar != null && tVar2 != null) {
            z zVar = new z();
            zVar.L(tVar);
            zVar.L(tVar2);
            zVar.E = false;
            tVar = zVar;
        } else if (tVar == null) {
            if (tVar2 != null) {
                tVar = tVar2;
            } else {
                tVar = null;
            }
        }
        if (tVar3 != null) {
            z zVar2 = new z();
            if (tVar != null) {
                zVar2.L(tVar);
            }
            zVar2.L(tVar3);
            return zVar2;
        }
        return tVar;
    }

    @Override // androidx.fragment.app.u1
    public final Object j(Object obj, Object obj2) {
        z zVar = new z();
        if (obj != null) {
            zVar.L((t) obj);
        }
        zVar.L((t) obj2);
        return zVar;
    }

    @Override // androidx.fragment.app.u1
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((t) obj).a(new k(view, arrayList));
    }

    @Override // androidx.fragment.app.u1
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((t) obj).a(new l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.u1
    public final void m(View view, Object obj) {
        if (view != null) {
            u1.g(view, new Rect());
            ((t) obj).E(new j());
        }
    }

    @Override // androidx.fragment.app.u1
    public final void n(Object obj, Rect rect) {
        ((t) obj).E(new j());
    }

    @Override // androidx.fragment.app.u1
    public final void o(Object obj, j0.e eVar, h.o0 o0Var) {
        t tVar = (t) obj;
        eVar.a(new i(tVar, o0Var));
        tVar.a(new m(o0Var));
    }

    @Override // androidx.fragment.app.u1
    public final void p(Object obj, View view, ArrayList arrayList) {
        z zVar = (z) obj;
        ArrayList arrayList2 = zVar.f17643h;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            u1.d((View) arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(zVar, arrayList);
    }

    @Override // androidx.fragment.app.u1
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        z zVar = (z) obj;
        if (zVar != null) {
            ArrayList arrayList3 = zVar.f17643h;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(zVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.u1
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        z zVar = new z();
        zVar.L((t) obj);
        return zVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        boolean z10;
        int size;
        t tVar;
        t tVar2 = (t) obj;
        int i10 = 0;
        if (tVar2 instanceof z) {
            z zVar = (z) tVar2;
            int size2 = zVar.D.size();
            while (i10 < size2) {
                if (i10 >= 0 && i10 < zVar.D.size()) {
                    tVar = (t) zVar.D.get(i10);
                } else {
                    tVar = null;
                }
                s(tVar, arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (u1.h(tVar2.f17642g) && u1.h(null) && u1.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ArrayList arrayList3 = tVar2.f17643h;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    tVar2.b((View) arrayList2.get(i10));
                    i10++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        tVar2.A((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
