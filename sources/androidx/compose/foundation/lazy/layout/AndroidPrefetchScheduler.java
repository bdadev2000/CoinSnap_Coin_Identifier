package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes2.dex */
public final class AndroidPrefetchScheduler implements PrefetchScheduler, RememberObserver, Runnable, Choreographer.FrameCallback {

    /* renamed from: h, reason: collision with root package name */
    public static long f4643h;

    /* renamed from: a, reason: collision with root package name */
    public final View f4644a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4646c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4647f;

    /* renamed from: g, reason: collision with root package name */
    public long f4648g;

    /* renamed from: b, reason: collision with root package name */
    public final MutableVector f4645b = new MutableVector(new PrefetchRequest[16]);
    public final Choreographer d = Choreographer.getInstance();

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {

        /* renamed from: a, reason: collision with root package name */
        public final long f4649a;

        public PrefetchRequestScopeImpl(long j2) {
            this.f4649a = j2;
        }

        public final long a() {
            return Math.max(0L, this.f4649a - System.nanoTime());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidPrefetchScheduler(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f4644a = r5
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r1 = 16
            androidx.compose.foundation.lazy.layout.PrefetchRequest[] r1 = new androidx.compose.foundation.lazy.layout.PrefetchRequest[r1]
            r0.<init>(r1)
            r4.f4645b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.d = r0
            long r0 = androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.f4643h
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r5 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.f4643h = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.<init>(android.view.View):void");
    }

    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
    public final void a(PrefetchRequest prefetchRequest) {
        this.f4645b.b(prefetchRequest);
        if (this.f4646c) {
            return;
        }
        this.f4646c = true;
        this.f4644a.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        if (this.f4647f) {
            this.f4648g = j2;
            this.f4644a.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.f4647f = false;
        this.f4644a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f4647f = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MutableVector mutableVector = this.f4645b;
        if (mutableVector.l() || !this.f4646c || !this.f4647f || this.f4644a.getWindowVisibility() != 0) {
            this.f4646c = false;
            return;
        }
        PrefetchRequestScopeImpl prefetchRequestScopeImpl = new PrefetchRequestScopeImpl(this.f4648g + f4643h);
        boolean z2 = false;
        while (mutableVector.m() && !z2) {
            if (prefetchRequestScopeImpl.a() <= 0 || ((PrefetchRequest) mutableVector.f14142a[0]).a(prefetchRequestScopeImpl)) {
                z2 = true;
            } else {
                mutableVector.o(0);
            }
        }
        if (z2) {
            this.d.postFrameCallback(this);
        } else {
            this.f4646c = false;
        }
    }
}
