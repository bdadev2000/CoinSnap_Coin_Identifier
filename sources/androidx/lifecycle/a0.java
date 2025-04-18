package androidx.lifecycle;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveData f1783b;

    public a0(LiveData liveData) {
        this.f1783b = liveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f1783b.mDataLock) {
            obj = this.f1783b.mPendingData;
            this.f1783b.mPendingData = LiveData.NOT_SET;
        }
        this.f1783b.setValue(obj);
    }
}
