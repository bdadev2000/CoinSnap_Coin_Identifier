package androidx.compose.foundation.gestures;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {101, Opcodes.I2S}, m = "animateToZero")
/* loaded from: classes4.dex */
public final class UpdatableAnimationState$animateToZero$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public UpdatableAnimationState f3661a;

    /* renamed from: b, reason: collision with root package name */
    public d0.c f3662b;

    /* renamed from: c, reason: collision with root package name */
    public a f3663c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UpdatableAnimationState f3665g;

    /* renamed from: h, reason: collision with root package name */
    public int f3666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, g gVar) {
        super(gVar);
        this.f3665g = updatableAnimationState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3664f = obj;
        this.f3666h |= Integer.MIN_VALUE;
        return this.f3665g.a(null, null, this);
    }
}
