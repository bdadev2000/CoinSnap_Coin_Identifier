package androidx.compose.foundation.gestures.snapping;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {Opcodes.NEW}, m = "tryApproach")
/* loaded from: classes3.dex */
public final class SnapFlingBehavior$tryApproach$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f3699b;

    /* renamed from: c, reason: collision with root package name */
    public int f3700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$tryApproach$1(SnapFlingBehavior snapFlingBehavior, g gVar) {
        super(gVar);
        this.f3699b = snapFlingBehavior;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3698a = obj;
        this.f3700c |= Integer.MIN_VALUE;
        return SnapFlingBehavior.c(this.f3699b, null, 0.0f, 0.0f, null, this);
    }
}
