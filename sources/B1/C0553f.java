package b1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.o;
import g1.InterfaceC2286a;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553f extends AbstractC0551d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f5265i = o.g("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f5266g;

    /* renamed from: h, reason: collision with root package name */
    public final C0552e f5267h;

    public C0553f(Context context, InterfaceC2286a interfaceC2286a) {
        super(context, interfaceC2286a);
        this.f5266g = (ConnectivityManager) this.b.getSystemService("connectivity");
        this.f5267h = new C0552e(this, 0);
    }

    @Override // b1.AbstractC0551d
    public final Object a() {
        return f();
    }

    @Override // b1.AbstractC0551d
    public final void d() {
        String str = f5265i;
        try {
            o.e().b(str, "Registering network callback", new Throwable[0]);
            this.f5266g.registerDefaultNetworkCallback(this.f5267h);
        } catch (IllegalArgumentException | SecurityException e4) {
            o.e().d(str, "Received exception while registering network callback", e4);
        }
    }

    @Override // b1.AbstractC0551d
    public final void e() {
        String str = f5265i;
        try {
            o.e().b(str, "Unregistering network callback", new Throwable[0]);
            this.f5266g.unregisterNetworkCallback(this.f5267h);
        } catch (IllegalArgumentException | SecurityException e4) {
            o.e().d(str, "Received exception while unregistering network callback", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Z0.a, java.lang.Object] */
    public final Z0.a f() {
        boolean z8;
        boolean z9;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f5266g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z8 = true;
        } else {
            z8 = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e4) {
            o.e().d(f5265i, "Unable to validate active network", e4);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z9 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z10 = true;
                }
                ?? obj = new Object();
                obj.f3872a = z8;
                obj.b = z9;
                obj.f3873c = isActiveNetworkMetered;
                obj.f3874d = z10;
                return obj;
            }
        }
        z9 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z10 = true;
        }
        ?? obj2 = new Object();
        obj2.f3872a = z8;
        obj2.b = z9;
        obj2.f3873c = isActiveNetworkMetered2;
        obj2.f3874d = z10;
        return obj2;
    }
}
