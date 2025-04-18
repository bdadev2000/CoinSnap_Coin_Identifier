package androidx.browser.customtabs;

import a.c;
import a.g;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes4.dex */
public class PostMessageService extends Service {

    /* renamed from: androidx.browser.customtabs.PostMessageService$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends g {
        @Override // a.h
        public final void h(c cVar, String str, Bundle bundle) {
            cVar.N(str, bundle);
        }

        @Override // a.h
        public final void x(c cVar, Bundle bundle) {
            cVar.O(bundle);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
