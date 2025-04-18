package androidx.compose.runtime;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {Opcodes.V18, 63}, m = "withFrameNanos")
/* loaded from: classes2.dex */
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends c {

    /* renamed from: a, reason: collision with root package name */
    public PausableMonotonicFrameClock f13846a;

    /* renamed from: b, reason: collision with root package name */
    public l f13847b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13848c;
    public final /* synthetic */ PausableMonotonicFrameClock d;

    /* renamed from: f, reason: collision with root package name */
    public int f13849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, g gVar) {
        super(gVar);
        this.d = pausableMonotonicFrameClock;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f13848c = obj;
        this.f13849f |= Integer.MIN_VALUE;
        return this.d.b0(null, this);
    }
}
