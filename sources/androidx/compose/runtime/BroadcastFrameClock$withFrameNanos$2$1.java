package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class BroadcastFrameClock$withFrameNanos$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BroadcastFrameClock f13683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BroadcastFrameClock.FrameAwaiter f13684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, BroadcastFrameClock.FrameAwaiter frameAwaiter) {
        super(1);
        this.f13683a = broadcastFrameClock;
        this.f13684b = frameAwaiter;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        BroadcastFrameClock broadcastFrameClock = this.f13683a;
        Object obj2 = broadcastFrameClock.f13677b;
        BroadcastFrameClock.FrameAwaiter frameAwaiter = this.f13684b;
        synchronized (obj2) {
            broadcastFrameClock.d.remove(frameAwaiter);
            if (broadcastFrameClock.d.isEmpty()) {
                broadcastFrameClock.f13680g.set(0);
            }
        }
        return b0.f30125a;
    }
}
