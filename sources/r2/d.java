package r2;

import android.content.Context;
import android.os.Build;
import androidx.work.p;
import androidx.work.q;
import s2.f;
import s2.h;
import u2.j;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f23968e = p.g("NetworkMeteredCtrlr");

    public d(Context context, x2.a aVar) {
        super((f) h.o(context, aVar).f24171d);
    }

    @Override // r2.c
    public final boolean a(j jVar) {
        if (jVar.f25460j.a == q.METERED) {
            return true;
        }
        return false;
    }

    @Override // r2.c
    public final boolean b(Object obj) {
        q2.a aVar = (q2.a) obj;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            p.e().b(f23968e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !aVar.a;
        }
        if (aVar.a && aVar.f23675c) {
            z10 = false;
        }
        return z10;
    }
}
