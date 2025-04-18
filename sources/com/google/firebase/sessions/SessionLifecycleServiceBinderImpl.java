package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import d0.b0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "LifecycleServiceBinder";

    @NotNull
    private final FirebaseApp firebaseApp;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public SessionLifecycleServiceBinderImpl(@NotNull FirebaseApp firebaseApp) {
        p0.a.s(firebaseApp, "firebaseApp");
        this.firebaseApp = firebaseApp;
    }

    private final Object unbindServiceSafely(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return b0.f30125a;
        } catch (IllegalArgumentException e) {
            return Integer.valueOf(Log.w(TAG, "Session lifecycle service binding failed.", e));
        }
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void bindToService(@NotNull Messenger messenger, @NotNull ServiceConnection serviceConnection) {
        p0.a.s(messenger, "callback");
        p0.a.s(serviceConnection, "serviceConnection");
        Context applicationContext = this.firebaseApp.getApplicationContext().getApplicationContext();
        p0.a.r(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d(TAG, "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(SessionLifecycleService.CLIENT_CALLBACK_MESSENGER, messenger);
        intent.setPackage(applicationContext.getPackageName());
        try {
            if (applicationContext.bindService(intent, serviceConnection, 65)) {
                return;
            }
        } catch (SecurityException e) {
            Log.w(TAG, "Failed to bind session lifecycle service to application.", e);
        }
        unbindServiceSafely(applicationContext, serviceConnection);
        Log.i(TAG, "Session lifecycle service binding failed.");
    }
}
