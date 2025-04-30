package X4;

import i5.EnumC2355j;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class d implements b {
    private final c appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private EnumC2355j currentAppState = EnumC2355j.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<b> appStateCallback = new WeakReference<>(this);

    public d(c cVar) {
        this.appStateMonitor = cVar;
    }

    public EnumC2355j getAppState() {
        return this.currentAppState;
    }

    public WeakReference<b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i9) {
        this.appStateMonitor.f3684j.addAndGet(i9);
    }

    @Override // X4.b
    public void onUpdateAppState(EnumC2355j enumC2355j) {
        EnumC2355j enumC2355j2 = this.currentAppState;
        EnumC2355j enumC2355j3 = EnumC2355j.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC2355j2 == enumC2355j3) {
            this.currentAppState = enumC2355j;
        } else if (enumC2355j2 != enumC2355j && enumC2355j != enumC2355j3) {
            this.currentAppState = EnumC2355j.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        c cVar = this.appStateMonitor;
        this.currentAppState = cVar.f3689q;
        WeakReference<b> weakReference = this.appStateCallback;
        synchronized (cVar.f3682h) {
            cVar.f3682h.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        c cVar = this.appStateMonitor;
        WeakReference<b> weakReference = this.appStateCallback;
        synchronized (cVar.f3682h) {
            cVar.f3682h.remove(weakReference);
        }
        this.isRegisteredForAppState = false;
    }
}
