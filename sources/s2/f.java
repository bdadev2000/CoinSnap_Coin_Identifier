package s2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.p;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f24164i = p.g("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f24165g;

    /* renamed from: h, reason: collision with root package name */
    public final e f24166h;

    public f(Context context, x2.a aVar) {
        super(context, aVar);
        this.f24165g = (ConnectivityManager) this.f24159b.getSystemService("connectivity");
        this.f24166h = new e(this, 0);
    }

    @Override // s2.d
    public final Object a() {
        return e();
    }

    @Override // s2.d
    public final void c() {
        String str = f24164i;
        try {
            p.e().b(str, "Registering network callback", new Throwable[0]);
            this.f24165g.registerDefaultNetworkCallback(this.f24166h);
        } catch (IllegalArgumentException | SecurityException e2) {
            p.e().c(str, "Received exception while registering network callback", e2);
        }
    }

    @Override // s2.d
    public final void d() {
        String str = f24164i;
        try {
            p.e().b(str, "Unregistering network callback", new Throwable[0]);
            this.f24165g.unregisterNetworkCallback(this.f24166h);
        } catch (IllegalArgumentException | SecurityException e2) {
            p.e().c(str, "Received exception while unregistering network callback", e2);
        }
    }

    public final q2.a e() {
        boolean z10;
        boolean z11;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f24165g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e2) {
            p.e().c(f24164i, "Unable to validate active network", e2);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z11 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z12 = false;
                }
                return new q2.a(z10, z11, isActiveNetworkMetered, z12);
            }
        }
        z11 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
        }
        z12 = false;
        return new q2.a(z10, z11, isActiveNetworkMetered2, z12);
    }
}
