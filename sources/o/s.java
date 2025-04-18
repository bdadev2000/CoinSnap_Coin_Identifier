package o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public final b.e f22950b;

    /* renamed from: c, reason: collision with root package name */
    public final b.b f22951c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f22952d;
    public final Object a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f22953e = null;

    public s(b.e eVar, g gVar, ComponentName componentName) {
        this.f22950b = eVar;
        this.f22951c = gVar;
        this.f22952d = componentName;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        PendingIntent pendingIntent = this.f22953e;
        if (pendingIntent != null) {
            bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        return bundle2;
    }

    public final void b(String str) {
        Bundle a = a(null);
        synchronized (this.a) {
            try {
                try {
                    ((b.c) this.f22950b).g(this.f22951c, str, a);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(t tVar, Bundle bundle) {
        Bundle a = a(bundle);
        r rVar = new r(tVar);
        try {
            return ((b.c) this.f22950b).j(this.f22951c, rVar, a);
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }
}
