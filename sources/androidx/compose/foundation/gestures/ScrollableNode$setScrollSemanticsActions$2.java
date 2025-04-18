package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {527}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ScrollableNode$setScrollSemanticsActions$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3477a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f3478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollableNode f3479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(ScrollableNode scrollableNode, g gVar) {
        super(2, gVar);
        this.f3479c = scrollableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.f3479c, gVar);
        scrollableNode$setScrollSemanticsActions$2.f3478b = ((Offset) obj).f14913a;
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$setScrollSemanticsActions$2) create(new Offset(((Offset) obj).f14913a), (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3477a;
        if (i2 == 0) {
            q.m(obj);
            long j2 = this.f3478b;
            ScrollingLogic scrollingLogic = this.f3479c.D;
            this.f3477a = 1;
            obj = ScrollableKt.a(scrollingLogic, j2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
