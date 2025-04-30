package S0;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2771a = new ArrayList();

    @Override // S0.l
    public final void a(View view, float f9) {
        Iterator it = this.f2771a.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(view, f9);
        }
    }
}
