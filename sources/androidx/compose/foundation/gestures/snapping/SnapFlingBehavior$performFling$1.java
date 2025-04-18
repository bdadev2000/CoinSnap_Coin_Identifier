package androidx.compose.foundation.gestures.snapping;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {110}, m = "performFling")
/* loaded from: classes2.dex */
public final class SnapFlingBehavior$performFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f3696b;

    /* renamed from: c, reason: collision with root package name */
    public int f3697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$performFling$1(SnapFlingBehavior snapFlingBehavior, g gVar) {
        super(gVar);
        this.f3696b = snapFlingBehavior;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3695a = obj;
        this.f3697c |= Integer.MIN_VALUE;
        return this.f3696b.b(null, 0.0f, null, this);
    }
}
