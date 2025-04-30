package u;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import c.C0578b;
import c.InterfaceC0577a;
import c.InterfaceC0580d;

/* renamed from: u.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2744m {
    public final InterfaceC0580d b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0577a f23054c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f23055d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f23053a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f23056e = null;

    public C2744m(InterfaceC0580d interfaceC0580d, BinderC2735d binderC2735d, ComponentName componentName) {
        this.b = interfaceC0580d;
        this.f23054c = binderC2735d;
        this.f23055d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.f23056e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        synchronized (this.f23053a) {
            try {
                try {
                    ((C0578b) this.b).e((BinderC2735d) this.f23054c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(InterfaceC2745n interfaceC2745n, Bundle bundle) {
        BinderC2743l binderC2743l = new BinderC2743l(interfaceC2745n);
        try {
            return ((C0578b) this.b).h(this.f23054c, binderC2743l, bundle);
        } catch (SecurityException e4) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e4);
        }
    }
}
