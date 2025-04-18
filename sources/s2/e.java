package s2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.p;
import com.bumptech.glide.manager.q;
import w4.m;

/* loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24163b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.f24163b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.a) {
            case 1:
                m.e().post(new q(0, this, true));
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                p.e().b(f.f24164i, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
                f fVar = (f) this.f24163b;
                fVar.b(fVar.e());
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i10 = 0;
        byte b3 = 0;
        switch (this.a) {
            case 0:
                p.e().b(f.f24164i, "Network connection lost", new Throwable[0]);
                f fVar = (f) this.f24163b;
                fVar.b(fVar.e());
                return;
            default:
                m.e().post(new q(i10, this, b3 == true ? 1 : 0));
                return;
        }
    }
}
