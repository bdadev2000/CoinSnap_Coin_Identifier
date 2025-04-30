package v1;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f23519c;

    public /* synthetic */ s(v vVar, int i9) {
        this.b = i9;
        this.f23519c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Drawable drawable = this.f23519c;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                v vVar = this.f23519c;
                Semaphore semaphore = vVar.f23536M;
                D1.c cVar = vVar.f23552q;
                if (cVar != null) {
                    try {
                        semaphore.acquire();
                        cVar.s(vVar.f23541c.a());
                        if (v.f23521S && vVar.f23534K) {
                            if (vVar.f23537N == null) {
                                vVar.f23537N = new Handler(Looper.getMainLooper());
                                vVar.O = new s(vVar, 0);
                            }
                            vVar.f23537N.post(vVar.O);
                        }
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        semaphore.release();
                        throw th;
                    }
                    semaphore.release();
                    return;
                }
                return;
        }
    }
}
