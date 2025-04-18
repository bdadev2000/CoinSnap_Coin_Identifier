package p;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes3.dex */
public final class i extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f31226a;

    public i(j jVar) {
        this.f31226a = jVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        j.a(this.f31226a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        j.a(this.f31226a, network, false);
    }
}
