package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import b1.h1;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import h0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class SessionLifecycleClient {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int MAX_QUEUED_MESSAGES = 20;

    @NotNull
    public static final String TAG = "SessionLifecycleClient";

    @NotNull
    private final l backgroundDispatcher;

    @NotNull
    private final LinkedBlockingDeque<Message> queuedMessages;

    @Nullable
    private Messenger service;
    private boolean serviceBound;

    @NotNull
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection;

    /* loaded from: classes.dex */
    public static final class ClientUpdateHandler extends Handler {

        @NotNull
        private final l backgroundDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(@NotNull l lVar) {
            super(Looper.getMainLooper());
            p0.a.s(lVar, "backgroundDispatcher");
            this.backgroundDispatcher = lVar;
        }

        private final void handleSessionUpdate(String str) {
            Log.d(SessionLifecycleClient.TAG, "Session update received: " + str);
            e.v(p0.a.c(this.backgroundDispatcher), null, 0, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, null), 3);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            String str;
            p0.a.s(message, SDKConstants.PARAM_DEBUG_MESSAGE);
            if (message.what != 3) {
                Log.w(SessionLifecycleClient.TAG, "Received unexpected event from the SessionLifecycleService: " + message);
                super.handleMessage(message);
                return;
            }
            Bundle data = message.getData();
            if (data == null || (str = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) {
                str = "";
            }
            handleSessionUpdate(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(@NotNull l lVar) {
        p0.a.s(lVar, "backgroundDispatcher");
        this.backgroundDispatcher = lVar;
        this.queuedMessages = new LinkedBlockingDeque<>(20);
        this.serviceConnection = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
                LinkedBlockingDeque linkedBlockingDeque;
                List drainQueue;
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                linkedBlockingDeque = SessionLifecycleClient.this.queuedMessages;
                sb.append(linkedBlockingDeque.size());
                Log.d(SessionLifecycleClient.TAG, sb.toString());
                SessionLifecycleClient.this.service = new Messenger(iBinder);
                SessionLifecycleClient.this.serviceBound = true;
                SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                drainQueue = sessionLifecycleClient.drainQueue();
                sessionLifecycleClient.sendLifecycleEvents(drainQueue);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName componentName) {
                Log.d(SessionLifecycleClient.TAG, "Disconnected from SessionLifecycleService");
                SessionLifecycleClient.this.service = null;
                SessionLifecycleClient.this.serviceBound = false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> drainQueue() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message getLatestByCode(List<Message> list, int i2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i2) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void queueMessage(Message message) {
        if (!this.queuedMessages.offer(message)) {
            Log.d(TAG, "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d(TAG, "Queued message " + message.what + ". Queue size " + this.queuedMessages.size());
    }

    private final void sendLifecycleEvent(int i2) {
        List<Message> drainQueue = drainQueue();
        Message obtain = Message.obtain(null, i2, 0, 0);
        p0.a.r(obtain, "obtain(null, messageCode, 0, 0)");
        drainQueue.add(obtain);
        sendLifecycleEvents(drainQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public final h1 sendLifecycleEvents(List<Message> list) {
        return e.v(p0.a.c(this.backgroundDispatcher), null, 0, new SessionLifecycleClient$sendLifecycleEvents$1(this, list, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessageToServer(Message message) {
        if (this.service == null) {
            queueMessage(message);
            return;
        }
        try {
            Log.d(TAG, "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.service;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e) {
            Log.w(TAG, "Unable to deliver message: " + message.what, e);
            queueMessage(message);
        }
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    public final void bindToService(@NotNull SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        p0.a.s(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.bindToService(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }
}
