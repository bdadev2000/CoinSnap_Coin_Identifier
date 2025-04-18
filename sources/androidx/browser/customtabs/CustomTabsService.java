package androidx.browser.customtabs;

import a.c;
import a.e;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends e {
        public static PendingIntent R(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        @Override // a.f
        public final boolean A(int i2, Uri uri, Bundle bundle, c cVar) {
            new CustomTabsSessionToken(cVar, R(bundle));
            throw null;
        }

        @Override // a.f
        public final boolean D(c cVar) {
            new CustomTabsSessionToken(cVar, null);
            throw null;
        }

        @Override // a.f
        public final boolean E(long j2) {
            throw null;
        }

        @Override // a.f
        public final boolean G(c cVar, Bundle bundle) {
            new CustomTabsSessionToken(cVar, R(bundle));
            throw null;
        }

        @Override // a.f
        public final boolean K(c cVar, Uri uri, Bundle bundle, ArrayList arrayList) {
            new CustomTabsSessionToken(cVar, R(bundle));
            throw null;
        }

        @Override // a.f
        public final int M(c cVar, String str, Bundle bundle) {
            new CustomTabsSessionToken(cVar, R(bundle));
            throw null;
        }

        @Override // a.f
        public final Bundle b() {
            throw null;
        }

        @Override // a.f
        public final boolean d(c cVar, Uri uri) {
            new CustomTabsSessionToken(cVar, null);
            throw null;
        }

        @Override // a.f
        public final boolean q(c cVar, Uri uri, Bundle bundle) {
            new CustomTabsSessionToken(cVar, R(bundle));
            throw null;
        }

        @Override // a.f
        public final boolean u(Bundle bundle, c cVar) {
            new CustomTabsSessionToken(cVar, R(bundle));
            throw null;
        }

        @Override // a.f
        public final boolean v(c cVar, Bundle bundle) {
            new CustomTabsSessionToken(cVar, R(bundle));
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Result {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
