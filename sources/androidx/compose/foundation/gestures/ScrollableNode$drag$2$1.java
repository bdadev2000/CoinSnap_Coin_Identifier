package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {344}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ScrollableNode$drag$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3455a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3457c;
    public final /* synthetic */ ScrollingLogic d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$drag$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NestedScrollScope f3458a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScrollingLogic f3459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NestedScrollScope nestedScrollScope, ScrollingLogic scrollingLogic) {
            super(1);
            this.f3458a = nestedScrollScope;
            this.f3459b = scrollingLogic;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((DragEvent.DragDelta) obj).f3171a;
            this.f3458a.b(1, this.f3459b.d == Orientation.f3395b ? Offset.b(j2, 0.0f, 1) : Offset.b(j2, 0.0f, 2));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(ScrollingLogic scrollingLogic, g gVar, p pVar) {
        super(2, gVar);
        this.f3457c = pVar;
        this.d = scrollingLogic;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.d, gVar, this.f3457c);
        scrollableNode$drag$2$1.f3456b = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$drag$2$1) create((NestedScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3455a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((NestedScrollScope) this.f3456b, this.d);
            this.f3455a = 1;
            if (this.f3457c.invoke(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
