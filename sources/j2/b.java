package j2;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements n {
    public final ArrayList a = new ArrayList();

    @Override // j2.n
    public final void a(View view, float f10) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(view, f10);
        }
    }

    public final void b(n nVar) {
        this.a.add(nVar);
    }
}
