package C;

import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends g {
    public int m;

    public h(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f361e = 2;
        } else {
            this.f361e = 3;
        }
    }

    @Override // C.g
    public final void d(int i9) {
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
}
