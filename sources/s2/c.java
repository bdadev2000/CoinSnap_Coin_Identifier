package s2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.p;
import h.c0;

/* loaded from: classes.dex */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f24156h = p.g("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final c0 f24157g;

    public c(Context context, x2.a aVar) {
        super(context, aVar);
        this.f24157g = new c0(this, 1);
    }

    @Override // s2.d
    public final void c() {
        p.e().b(f24156h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f24159b.registerReceiver(this.f24157g, e());
    }

    @Override // s2.d
    public final void d() {
        p.e().b(f24156h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f24159b.unregisterReceiver(this.f24157g);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
