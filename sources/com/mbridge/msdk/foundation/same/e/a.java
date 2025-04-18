package com.mbridge.msdk.foundation.same.e;

/* loaded from: classes4.dex */
public abstract class a implements Runnable {

    /* renamed from: id, reason: collision with root package name */
    public static long f13345id;
    public InterfaceC0172a mListener;
    public b mState = b.READY;

    /* renamed from: com.mbridge.msdk.foundation.same.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0172a {
        void a(b bVar);
    }

    /* loaded from: classes4.dex */
    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public a() {
        f13345id++;
    }

    private void setState(b bVar) {
        this.mState = bVar;
        InterfaceC0172a interfaceC0172a = this.mListener;
        if (interfaceC0172a != null) {
            interfaceC0172a.a(bVar);
        }
    }

    public final void cancel() {
        b bVar = this.mState;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            setState(bVar2);
            cancelTask();
        }
    }

    public abstract void cancelTask();

    public final long getId() {
        return f13345id;
    }

    public b getState() {
        return this.mState;
    }

    public abstract void pauseTask(boolean z10);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mState == b.READY) {
                setState(b.RUNNING);
                runTask();
                setState(b.FINISH);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public abstract void runTask();

    public void setOnStateChangeListener(InterfaceC0172a interfaceC0172a) {
        this.mListener = interfaceC0172a;
    }

    public final void setPause(boolean z10) {
        b bVar = this.mState;
        b bVar2 = b.PAUSE;
        if (bVar != bVar2 && bVar != b.CANCEL && bVar != b.FINISH) {
            if (z10) {
                setState(bVar2);
            } else {
                setState(b.RUNNING);
            }
            pauseTask(z10);
        }
    }
}
