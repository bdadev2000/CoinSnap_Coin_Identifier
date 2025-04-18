package androidx.browser.trusted;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import b.c;

/* loaded from: classes2.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends c {
        @Override // b.d
        public final int H() {
            throw null;
        }

        @Override // b.d
        public final Bundle I() {
            throw null;
        }

        @Override // b.d
        public final Bundle b() {
            throw null;
        }

        @Override // b.d
        public final void k() {
            throw null;
        }

        @Override // b.d
        public final Bundle m() {
            throw null;
        }

        @Override // b.d
        public final Bundle r() {
            throw null;
        }

        @Override // b.d
        public final Bundle y() {
            throw null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
