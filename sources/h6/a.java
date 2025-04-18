package h6;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements NsdManager.RegistrationListener {
    public final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18777b;

    public a(String str, String str2) {
        this.a = str;
        this.f18777b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        b bVar = b.a;
        b.a(this.f18777b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
        Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
        if (!Intrinsics.areEqual(this.a, NsdServiceInfo.getServiceName())) {
            b bVar = b.a;
            b.a(this.f18777b);
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
    }
}
