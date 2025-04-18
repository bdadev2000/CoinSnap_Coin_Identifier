package v9;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import n0.c2;
import n0.r2;
import n0.u1;

/* loaded from: classes3.dex */
public final class i extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final View f26370c;

    /* renamed from: d, reason: collision with root package name */
    public int f26371d;

    /* renamed from: e, reason: collision with root package name */
    public int f26372e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f26373f = new int[2];

    public i(View view) {
        this.f26370c = view;
    }

    @Override // n0.u1
    public final r2 a(r2 r2Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((c2) it.next()).a.c() & 8) != 0) {
                this.f26370c.setTranslationY(s9.a.b(r0.a.b(), this.f26372e, 0));
                break;
            }
        }
        return r2Var;
    }
}
