package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import b1.z;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher extends z {

    /* renamed from: n, reason: collision with root package name */
    public static final d0.p f16372n = f0.t(AndroidUiDispatcher$Companion$Main$2.f16383a);

    /* renamed from: o, reason: collision with root package name */
    public static final AndroidUiDispatcher$Companion$currentThread$1 f16373o = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer f16374c;
    public final Handler d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16379j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16380k;

    /* renamed from: m, reason: collision with root package name */
    public final AndroidUiFrameClock f16382m;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16375f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final e0.n f16376g = new e0.n();

    /* renamed from: h, reason: collision with root package name */
    public List f16377h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public List f16378i = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final AndroidUiDispatcher$dispatchCallback$1 f16381l = new AndroidUiDispatcher$dispatchCallback$1(this);

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f16374c = choreographer;
        this.d = handler;
        this.f16382m = new AndroidUiFrameClock(choreographer, this);
    }

    public static final void l0(AndroidUiDispatcher androidUiDispatcher) {
        Runnable runnable;
        boolean z2;
        do {
            synchronized (androidUiDispatcher.f16375f) {
                e0.n nVar = androidUiDispatcher.f16376g;
                runnable = (Runnable) (nVar.isEmpty() ? null : nVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (androidUiDispatcher.f16375f) {
                    e0.n nVar2 = androidUiDispatcher.f16376g;
                    runnable = (Runnable) (nVar2.isEmpty() ? null : nVar2.removeFirst());
                }
            }
            synchronized (androidUiDispatcher.f16375f) {
                if (androidUiDispatcher.f16376g.isEmpty()) {
                    z2 = false;
                    androidUiDispatcher.f16379j = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    @Override // b1.z
    public final void h0(h0.l lVar, Runnable runnable) {
        synchronized (this.f16375f) {
            this.f16376g.addLast(runnable);
            if (!this.f16379j) {
                this.f16379j = true;
                this.d.post(this.f16381l);
                if (!this.f16380k) {
                    this.f16380k = true;
                    this.f16374c.postFrameCallback(this.f16381l);
                }
            }
        }
    }
}
