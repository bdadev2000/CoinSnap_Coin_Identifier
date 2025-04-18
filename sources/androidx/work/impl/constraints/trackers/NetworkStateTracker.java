package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo
/* loaded from: classes4.dex */
public class NetworkStateTracker extends ConstraintTracker<NetworkState> {

    /* renamed from: i, reason: collision with root package name */
    public static final String f22090i = Logger.e("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f22091g;

    /* renamed from: h, reason: collision with root package name */
    public final NetworkStateCallback f22092h;

    /* loaded from: classes4.dex */
    public class NetworkStateBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            Logger.c().a(NetworkStateTracker.f22090i, "Network broadcast received", new Throwable[0]);
            throw null;
        }
    }

    @RequiresApi
    /* loaded from: classes4.dex */
    public class NetworkStateCallback extends ConnectivityManager.NetworkCallback {
        public NetworkStateCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Logger.c().a(NetworkStateTracker.f22090i, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.c(networkStateTracker.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Logger.c().a(NetworkStateTracker.f22090i, "Network connection lost", new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.c(networkStateTracker.f());
        }
    }

    public NetworkStateTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.f22091g = (ConnectivityManager) this.f22086b.getSystemService("connectivity");
        this.f22092h = new NetworkStateCallback();
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final Object a() {
        return f();
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void d() {
        String str = f22090i;
        try {
            Logger.c().a(str, "Registering network callback", new Throwable[0]);
            this.f22091g.registerDefaultNetworkCallback(this.f22092h);
        } catch (IllegalArgumentException | SecurityException e) {
            Logger.c().b(str, "Received exception while registering network callback", e);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void e() {
        String str = f22090i;
        try {
            Logger.c().a(str, "Unregistering network callback", new Throwable[0]);
            this.f22091g.unregisterNetworkCallback(this.f22092h);
        } catch (IllegalArgumentException | SecurityException e) {
            Logger.c().b(str, "Received exception while unregistering network callback", e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.NetworkState, java.lang.Object] */
    public final NetworkState f() {
        boolean z2;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f22091g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = false;
        boolean z4 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            Logger.c().b(f22090i, "Unable to validate active network", e);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z2 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z3 = true;
                }
                ?? obj = new Object();
                obj.f22070a = z4;
                obj.f22071b = z2;
                obj.f22072c = isActiveNetworkMetered;
                obj.d = z3;
                return obj;
            }
        }
        z2 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z3 = true;
        }
        ?? obj2 = new Object();
        obj2.f22070a = z4;
        obj2.f22071b = z2;
        obj2.f22072c = isActiveNetworkMetered2;
        obj2.d = z3;
        return obj2;
    }
}
