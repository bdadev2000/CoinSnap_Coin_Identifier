package e0;

import Q7.AbstractC0255x;
import Q7.C0245m;
import Q7.C0247o;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class q extends G7.k implements F7.p {
    public static final q b = new G7.k(2);

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        Object U8;
        o oVar = (o) obj;
        Throwable th = (Throwable) obj2;
        G7.j.e(oVar, NotificationCompat.CATEGORY_MESSAGE);
        if (oVar instanceof n) {
            n nVar = (n) oVar;
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            C0245m c0245m = (C0245m) nVar.b;
            c0245m.getClass();
            C0247o c0247o = new C0247o(false, th);
            do {
                U8 = c0245m.U(c0245m.F(), c0247o);
                if (U8 == AbstractC0255x.f2590c || U8 == AbstractC0255x.f2591d) {
                    break;
                }
            } while (U8 == AbstractC0255x.f2592e);
        }
        return t7.y.f23029a;
    }
}
