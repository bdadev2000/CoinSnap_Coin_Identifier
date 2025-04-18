package androidx.browser.customtabs;

import a.b;
import a.c;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes2.dex */
public class CustomTabsSessionToken {

    /* renamed from: a, reason: collision with root package name */
    public final c f1361a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f1362b;

    /* renamed from: androidx.browser.customtabs.CustomTabsSessionToken$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends CustomTabsCallback {
        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void extraCallback(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onMessageChannelReady(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onNavigationEvent(int i2, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onPostMessage(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onRelationshipValidationResult(int i2, Uri uri, boolean z2, Bundle bundle) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class MockCallback extends b {
        @Override // a.c
        public final void L(int i2, Bundle bundle) {
        }

        @Override // a.c
        public final void N(String str, Bundle bundle) {
        }

        @Override // a.c
        public final void O(Bundle bundle) {
        }

        @Override // a.c
        public final void P(int i2, Uri uri, boolean z2, Bundle bundle) {
        }

        @Override // a.b, android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // a.c
        public final Bundle i(String str, Bundle bundle) {
            return null;
        }

        @Override // a.c
        public final void n(String str, Bundle bundle) {
        }
    }

    public CustomTabsSessionToken(c cVar, PendingIntent pendingIntent) {
        if (cVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f1361a = cVar;
        this.f1362b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent pendingIntent = customTabsSessionToken.f1362b;
        PendingIntent pendingIntent2 = this.f1362b;
        if ((pendingIntent2 == null) != (pendingIntent == null)) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        c cVar = this.f1361a;
        if (cVar == null) {
            throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
        }
        IBinder asBinder = cVar.asBinder();
        c cVar2 = customTabsSessionToken.f1361a;
        if (cVar2 != null) {
            return asBinder.equals(cVar2.asBinder());
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f1362b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        c cVar = this.f1361a;
        if (cVar != null) {
            return cVar.asBinder().hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
