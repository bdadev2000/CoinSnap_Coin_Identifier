package androidx.compose.foundation.gestures.snapping;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {Opcodes.LSHR}, m = "fling")
/* loaded from: classes3.dex */
public final class SnapFlingBehavior$fling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public l f3683a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f3685c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, g gVar) {
        super(gVar);
        this.f3685c = snapFlingBehavior;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3684b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3685c.d(null, 0.0f, null, this);
    }
}
