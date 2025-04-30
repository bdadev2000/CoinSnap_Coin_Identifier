package b1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import c2.o;
import j2.n;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552e extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5264a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0552e(Object obj, int i9) {
        this.f5264a = i9;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f5264a) {
            case 1:
                n.f().post(new o(this, true));
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f5264a) {
            case 0:
                androidx.work.o.e().b(C0553f.f5265i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                C0553f c0553f = (C0553f) this.b;
                c0553f.c(c0553f.f());
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f5264a) {
            case 0:
                androidx.work.o.e().b(C0553f.f5265i, "Network connection lost", new Throwable[0]);
                C0553f c0553f = (C0553f) this.b;
                c0553f.c(c0553f.f());
                return;
            default:
                n.f().post(new o(this, false));
                return;
        }
    }
}
