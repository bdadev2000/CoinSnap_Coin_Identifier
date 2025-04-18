package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.OffsetKt;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class ScrollableNode$setScrollSemanticsActions$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollableNode f3473a;

    @e(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {522}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3474a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScrollableNode f3475b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f3476c;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ScrollableNode scrollableNode, float f2, float f3, g gVar) {
            super(2, gVar);
            this.f3475b = scrollableNode;
            this.f3476c = f2;
            this.d = f3;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f3475b, this.f3476c, this.d, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f3474a;
            if (i2 == 0) {
                q.m(obj);
                ScrollingLogic scrollingLogic = this.f3475b.D;
                long a2 = OffsetKt.a(this.f3476c, this.d);
                this.f3474a = 1;
                if (ScrollableKt.a(scrollingLogic, a2, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$1(ScrollableNode scrollableNode) {
        super(2);
        this.f3473a = scrollableNode;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        ScrollableNode scrollableNode = this.f3473a;
        kotlin.jvm.internal.e.v(scrollableNode.S1(), null, 0, new AnonymousClass1(scrollableNode, floatValue, floatValue2, null), 3);
        return Boolean.TRUE;
    }
}
