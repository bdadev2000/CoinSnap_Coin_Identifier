package h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import java.io.File;

/* loaded from: classes.dex */
public abstract class d0 implements k4.z {

    /* renamed from: b, reason: collision with root package name */
    public Object f18531b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18532c;

    public d0(Context context, Class cls) {
        this.f18531b = context;
        this.f18532c = cls;
    }

    public final void a() {
        Object obj = this.f18531b;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((g0) this.f18532c).f18581m.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f18531b = null;
        }
    }

    public abstract IntentFilter b();

    @Override // k4.z
    public final k4.y c(k4.d0 d0Var) {
        Context context = (Context) this.f18531b;
        Class cls = (Class) this.f18532c;
        return new l4.d(context, d0Var.b(File.class, cls), d0Var.b(Uri.class, cls), cls);
    }

    public abstract int d();

    public abstract void e();

    public final void f() {
        a();
        IntentFilter b3 = b();
        if (b3 != null && b3.countActions() != 0) {
            if (((BroadcastReceiver) this.f18531b) == null) {
                this.f18531b = new c0(this, 0);
            }
            ((g0) this.f18532c).f18581m.registerReceiver((BroadcastReceiver) this.f18531b, b3);
        }
    }

    public d0(g0 g0Var) {
        this.f18532c = g0Var;
    }
}
