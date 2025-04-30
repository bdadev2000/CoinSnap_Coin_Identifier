package B3;

import T.AbstractC0281l0;
import T.G0;
import T.t0;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import x3.AbstractC2920a;

/* loaded from: classes2.dex */
public final class r extends AbstractC0281l0 {

    /* renamed from: c, reason: collision with root package name */
    public final View f305c;

    /* renamed from: d, reason: collision with root package name */
    public int f306d;

    /* renamed from: e, reason: collision with root package name */
    public int f307e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f308f = new int[2];

    public r(View view) {
        this.f305c = view;
    }

    @Override // T.AbstractC0281l0
    public final G0 a(G0 g02, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((t0) it.next()).f2928a.c() & 8) != 0) {
                this.f305c.setTranslationY(AbstractC2920a.c(r0.f2928a.b(), this.f307e, 0));
                break;
            }
        }
        return g02;
    }
}
