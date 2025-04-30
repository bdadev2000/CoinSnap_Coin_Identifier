package com.google.firebase.perf.session;

import U4.RunnableC0311g;
import X4.c;
import X4.d;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import e5.C2221a;
import e5.InterfaceC2222b;
import i5.EnumC2355j;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
/* loaded from: classes2.dex */
public class SessionManager extends d {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final c appStateMonitor;
    private final Set<WeakReference<InterfaceC2222b>> clients;
    private final GaugeManager gaugeManager;
    private C2221a perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, C2221a c2221a, c cVar) {
        super(c.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = c2221a;
        this.appStateMonitor = cVar;
        registerForAppState();
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, C2221a c2221a) {
        sessionManager.lambda$setApplicationContext$0(context, c2221a);
    }

    public static SessionManager getInstance() {
        return instance;
    }

    public void lambda$setApplicationContext$0(Context context, C2221a c2221a) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (c2221a.f20111d) {
            this.gaugeManager.logGaugeMetadata(c2221a.b, EnumC2355j.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(EnumC2355j enumC2355j) {
        C2221a c2221a = this.perfSession;
        if (c2221a.f20111d) {
            this.gaugeManager.logGaugeMetadata(c2221a.b, enumC2355j);
        }
    }

    private void startOrStopCollectingGauges(EnumC2355j enumC2355j) {
        C2221a c2221a = this.perfSession;
        if (c2221a.f20111d) {
            this.gaugeManager.startCollectingGauges(c2221a, enumC2355j);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        EnumC2355j enumC2355j = EnumC2355j.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(enumC2355j);
        startOrStopCollectingGauges(enumC2355j);
    }

    @Override // X4.d, X4.b
    public void onUpdateAppState(EnumC2355j enumC2355j) {
        super.onUpdateAppState(enumC2355j);
        if (this.appStateMonitor.f3691s) {
            return;
        }
        if (enumC2355j == EnumC2355j.FOREGROUND) {
            updatePerfSession(C2221a.e(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(C2221a.e(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(enumC2355j);
        }
    }

    public final C2221a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<InterfaceC2222b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new RunnableC0311g(this, context, this.perfSession, 15));
    }

    public void setPerfSession(C2221a c2221a) {
        this.perfSession = c2221a;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<InterfaceC2222b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(C2221a c2221a) {
        if (c2221a.b == this.perfSession.b) {
            return;
        }
        this.perfSession = c2221a;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<InterfaceC2222b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    InterfaceC2222b interfaceC2222b = it.next().get();
                    if (interfaceC2222b != null) {
                        interfaceC2222b.a(c2221a);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.f3689q);
        startOrStopCollectingGauges(this.appStateMonitor.f3689q);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), C2221a.e(UUID.randomUUID().toString()), c.a());
    }
}
