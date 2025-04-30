package b1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.o;
import com.facebook.internal.C1835d;
import g1.InterfaceC2286a;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0550c extends AbstractC0551d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f5257h = o.g("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final C1835d f5258g;

    public AbstractC0550c(Context context, InterfaceC2286a interfaceC2286a) {
        super(context, interfaceC2286a);
        this.f5258g = new C1835d(this, 3);
    }

    @Override // b1.AbstractC0551d
    public final void d() {
        o.e().b(f5257h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.b.registerReceiver(this.f5258g, f());
    }

    @Override // b1.AbstractC0551d
    public final void e() {
        o.e().b(f5257h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.b.unregisterReceiver(this.f5258g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
