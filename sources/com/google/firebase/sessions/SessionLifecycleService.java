package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qc.v0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "wh/a0", "qc/v0", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f12094b = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: c, reason: collision with root package name */
    public v0 f12095c;

    /* renamed from: d, reason: collision with root package name */
    public Messenger f12096d;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        Object parcelableExtra;
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            messenger = (Messenger) parcelableExtra;
        } else {
            messenger = (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        }
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            v0 v0Var = this.f12095c;
            if (v0Var != null) {
                v0Var.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.f12096d;
        if (messenger2 == null) {
            return null;
        }
        return messenger2.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f12094b;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        this.f12095c = new v0(looper);
        this.f12096d = new Messenger(this.f12095c);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f12094b.quit();
    }
}
