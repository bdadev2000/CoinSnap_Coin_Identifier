package z0;

import B0.d;
import B0.f;
import G7.j;
import Q7.AbstractC0255x;
import Q7.F;
import V7.o;
import X7.e;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresPermission;
import com.vungle.ads.internal.ui.i;
import f4.c;
import w0.C2860a;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2968b {

    /* renamed from: a, reason: collision with root package name */
    public final f f24495a;

    public C2968b(f fVar) {
        this.f24495a = fVar;
    }

    public static final C2968b a(Context context) {
        int i9;
        d dVar;
        j.e(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        C2860a c2860a = C2860a.f23658a;
        int i11 = 0;
        if (i10 >= 30) {
            i9 = c2860a.a();
        } else {
            i9 = 0;
        }
        if (i9 >= 5) {
            Object systemService = context.getSystemService((Class<Object>) A0.b.A());
            j.d(systemService, "context.getSystemService…opicsManager::class.java)");
            dVar = new d(A0.b.k(systemService), 1);
        } else {
            if (i10 >= 30) {
                i11 = c2860a.a();
            }
            if (i11 == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) A0.b.A());
                j.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                dVar = new d(A0.b.k(systemService2), 0);
            } else {
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new C2968b(dVar);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public c b(B0.a aVar) {
        j.e(aVar, i.REQUEST_KEY_EXTRA);
        e eVar = F.f2529a;
        return y8.a.b(AbstractC0255x.b(AbstractC0255x.a(o.f3533a), new C2967a(this, aVar, null)));
    }
}
