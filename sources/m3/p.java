package m3;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f21579c;

    public /* synthetic */ p(x xVar, int i10) {
        this.f21578b = i10;
        this.f21579c = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21578b;
        x xVar = this.f21579c;
        switch (i10) {
            case 0:
                Semaphore semaphore = xVar.M;
                u3.c cVar = xVar.f21606q;
                if (cVar != null) {
                    try {
                        semaphore.acquire();
                        cVar.q(xVar.f21593c.d());
                        if (x.S && xVar.K) {
                            if (xVar.N == null) {
                                xVar.N = new Handler(Looper.getMainLooper());
                                xVar.O = new p(xVar, 1);
                            }
                            xVar.N.post(xVar.O);
                        }
                    } catch (InterruptedException unused) {
                    } catch (Throwable th2) {
                        semaphore.release();
                        throw th2;
                    }
                    semaphore.release();
                    return;
                }
                return;
            default:
                Drawable.Callback callback = xVar.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(xVar);
                    return;
                }
                return;
        }
    }
}
