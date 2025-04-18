package r2;

import android.content.Context;
import androidx.work.p;
import androidx.work.q;
import s2.f;
import s2.h;
import u2.j;

/* loaded from: classes.dex */
public final class e extends c {
    static {
        p.g("NetworkNotRoamingCtrlr");
    }

    public e(Context context, x2.a aVar) {
        super((f) h.o(context, aVar).f24171d);
    }

    @Override // r2.c
    public final boolean a(j jVar) {
        if (jVar.f25460j.a == q.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // r2.c
    public final boolean b(Object obj) {
        q2.a aVar = (q2.a) obj;
        if (aVar.a && aVar.f23676d) {
            return false;
        }
        return true;
    }
}
