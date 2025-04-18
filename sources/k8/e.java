package k8;

import a4.g0;
import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f20298g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f20299h = new Object();
    public final MediaCodec a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f20300b;

    /* renamed from: c, reason: collision with root package name */
    public h.f f20301c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f20302d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f20303e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20304f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        g0 g0Var = new g0(3);
        this.a = mediaCodec;
        this.f20300b = handlerThread;
        this.f20303e = g0Var;
        this.f20302d = new AtomicReference();
    }

    public final void a() {
        if (this.f20304f) {
            try {
                h.f fVar = this.f20301c;
                fVar.getClass();
                fVar.removeCallbacksAndMessages(null);
                g0 g0Var = this.f20303e;
                synchronized (g0Var) {
                    g0Var.a = false;
                }
                h.f fVar2 = this.f20301c;
                fVar2.getClass();
                fVar2.obtainMessage(2).sendToTarget();
                synchronized (g0Var) {
                    while (!g0Var.a) {
                        g0Var.wait();
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.f20302d.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }
}
