package p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import d0.b0;
import f.o;
import v.n;

/* loaded from: classes3.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f31227a;

    /* renamed from: b, reason: collision with root package name */
    public final g f31228b;

    /* renamed from: c, reason: collision with root package name */
    public final i f31229c;

    public j(ConnectivityManager connectivityManager, g gVar) {
        this.f31227a = connectivityManager;
        this.f31228b = gVar;
        i iVar = new i(this);
        this.f31229c = iVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), iVar);
    }

    public static final void a(j jVar, Network network, boolean z2) {
        b0 b0Var;
        boolean z3 = false;
        for (Network network2 : jVar.f31227a.getAllNetworks()) {
            if (!p0.a.g(network2, network)) {
                NetworkCapabilities networkCapabilities = jVar.f31227a.getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z3 = true;
                    break;
                }
            } else {
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        n nVar = (n) jVar.f31228b;
        synchronized (nVar) {
            try {
                if (((o) nVar.f31392a.get()) != null) {
                    nVar.f31395f = z3;
                    b0Var = b0.f30125a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    nVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.h
    public final boolean d() {
        ConnectivityManager connectivityManager = this.f31227a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.h
    public final void shutdown() {
        this.f31227a.unregisterNetworkCallback(this.f31229c);
    }
}
