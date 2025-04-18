package androidx.browser.customtabs;

import a.c;
import a.e;
import a.f;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class CustomTabsSession {

    /* renamed from: b, reason: collision with root package name */
    public final f f1359b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1360c;
    public final ComponentName d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1358a = new Object();
    public final PendingIntent e = null;

    /* loaded from: classes2.dex */
    public static class MockSession extends e {
        @Override // a.f
        public final boolean A(int i2, Uri uri, Bundle bundle, c cVar) {
            return false;
        }

        @Override // a.f
        public final boolean D(c cVar) {
            return false;
        }

        @Override // a.f
        public final boolean E(long j2) {
            return false;
        }

        @Override // a.f
        public final boolean G(c cVar, Bundle bundle) {
            return false;
        }

        @Override // a.f
        public final boolean K(c cVar, Uri uri, Bundle bundle, ArrayList arrayList) {
            return false;
        }

        @Override // a.f
        public final int M(c cVar, String str, Bundle bundle) {
            return 0;
        }

        @Override // a.f
        public final Bundle b() {
            return null;
        }

        @Override // a.f
        public final boolean d(c cVar, Uri uri) {
            return false;
        }

        @Override // a.f
        public final boolean q(c cVar, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // a.f
        public final boolean u(Bundle bundle, c cVar) {
            return false;
        }

        @Override // a.f
        public final boolean v(c cVar, Bundle bundle) {
            return false;
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class PendingSession {
    }

    public CustomTabsSession(f fVar, c cVar, ComponentName componentName) {
        this.f1359b = fVar;
        this.f1360c = cVar;
        this.d = componentName;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
        return bundle;
    }

    public final void b(String str) {
        Bundle a2 = a();
        synchronized (this.f1358a) {
            try {
                try {
                    this.f1359b.M(this.f1360c, str, a2);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
