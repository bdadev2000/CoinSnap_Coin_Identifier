package U1;

import T1.A;
import T1.u;
import T1.v;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import com.facebook.internal.C1835d;
import java.io.File;
import k.w;
import p.s;
import x.l;

/* loaded from: classes.dex */
public abstract class b implements v {
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3114c;

    public b(Context context) {
        this.b = context;
    }

    public void c() {
        C1835d c1835d = (C1835d) this.b;
        if (c1835d != null) {
            try {
                ((w) this.f3114c).m.unregisterReceiver(c1835d);
            } catch (IllegalArgumentException unused) {
            }
            this.b = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof N.a) {
            N.a aVar = (N.a) menuItem;
            if (((l) this.f3114c) == null) {
                this.f3114c = new l();
            }
            MenuItem menuItem2 = (MenuItem) ((l) this.f3114c).getOrDefault(aVar, null);
            if (menuItem2 == null) {
                s sVar = new s((Context) this.b, aVar);
                ((l) this.f3114c).put(aVar, sVar);
                return sVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter d2 = d();
        if (d2.countActions() == 0) {
            return;
        }
        if (((C1835d) this.b) == null) {
            this.b = new C1835d(this, 7);
        }
        ((w) this.f3114c).m.registerReceiver((C1835d) this.b, d2);
    }

    @Override // T1.v
    public u i(A a6) {
        Class cls = (Class) this.f3114c;
        return new e((Context) this.b, a6.b(File.class, cls), a6.b(Uri.class, cls), cls);
    }

    public b(Context context, Class cls) {
        this.b = context;
        this.f3114c = cls;
    }

    public b(w wVar) {
        this.f3114c = wVar;
    }
}
