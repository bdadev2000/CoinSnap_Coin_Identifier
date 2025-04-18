package o3;

import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {
    public final ArrayList a;

    public c(int i10) {
        if (i10 != 1) {
            this.a = new ArrayList();
        } else {
            this.a = new ArrayList();
        }
    }

    public final void a(Path path) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                u uVar = (u) arrayList.get(size);
                y3.g gVar = y3.h.a;
                if (uVar != null && !uVar.a) {
                    y3.h.a(path, uVar.f23127d.l() / 100.0f, uVar.f23128e.l() / 100.0f, uVar.f23129f.l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    public final synchronized e4.p b(Class cls) {
        int size = this.a.size();
        for (int i10 = 0; i10 < size; i10++) {
            r4.e eVar = (r4.e) this.a.get(i10);
            if (eVar.a.isAssignableFrom(cls)) {
                return eVar.f24003b;
            }
        }
        return null;
    }
}
