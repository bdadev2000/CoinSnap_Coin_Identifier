package androidx.core.os;

@Deprecated
/* loaded from: classes3.dex */
public final class CancellationSignal {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18607a;

    /* renamed from: b, reason: collision with root package name */
    public OnCancelListener f18608b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18609c;

    /* loaded from: classes3.dex */
    public interface OnCancelListener {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f18607a) {
                    return;
                }
                this.f18607a = true;
                this.f18609c = true;
                OnCancelListener onCancelListener = this.f18608b;
                if (onCancelListener != null) {
                    try {
                        onCancelListener.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f18609c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.f18609c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(OnCancelListener onCancelListener) {
        synchronized (this) {
            while (this.f18609c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f18608b == onCancelListener) {
                return;
            }
            this.f18608b = onCancelListener;
            if (this.f18607a) {
                onCancelListener.onCancel();
            }
        }
    }
}
