package J2;

import G7.j;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* loaded from: classes.dex */
public final class a implements NsdManager.RegistrationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1568a;
    public final /* synthetic */ String b;

    public a(String str, String str2) {
        this.f1568a = str;
        this.b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i9) {
        j.e(nsdServiceInfo, "serviceInfo");
        b bVar = b.f1569a;
        b.a(this.b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        j.e(nsdServiceInfo, "NsdServiceInfo");
        if (!j.a(this.f1568a, nsdServiceInfo.getServiceName())) {
            b bVar = b.f1569a;
            b.a(this.b);
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        j.e(nsdServiceInfo, "serviceInfo");
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i9) {
        j.e(nsdServiceInfo, "serviceInfo");
    }
}
