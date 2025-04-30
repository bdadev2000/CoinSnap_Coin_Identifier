package com.google.firebase.sessions;

import G7.j;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import p5.S;

/* loaded from: classes2.dex */
public final class SessionLifecycleService extends Service {
    public final HandlerThread b = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: c, reason: collision with root package name */
    public S f14380c;

    /* renamed from: d, reason: collision with root package name */
    public Messenger f14381d;

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
            S s5 = this.f14380c;
            if (s5 != null) {
                s5.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.f14381d;
        if (messenger2 == null) {
            return null;
        }
        return messenger2.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        j.d(looper, "handlerThread.looper");
        this.f14380c = new S(looper);
        this.f14381d = new Messenger(this.f14380c);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.quit();
    }
}
