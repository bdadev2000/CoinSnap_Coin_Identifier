package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.SnapshotStateKt;
import b1.d0;
import d0.b0;
import e1.j;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", l = {371}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MarqueeModifierNode$runAnimation$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarqueeModifierNode f2803b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MarqueeModifierNode f2804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MarqueeModifierNode marqueeModifierNode) {
            super(0);
            this.f2804a = marqueeModifierNode;
        }

        @Override // q0.a
        public final Object invoke() {
            MarqueeModifierNode marqueeModifierNode = this.f2804a;
            if (marqueeModifierNode.f2791s.g() <= marqueeModifierNode.f2792t.g()) {
                return null;
            }
            if (((MarqueeAnimationMode) marqueeModifierNode.x.getValue()).f2786a != 1 || ((Boolean) marqueeModifierNode.f2793u.getValue()).booleanValue()) {
                return Float.valueOf(marqueeModifierNode.f2791s.g() + marqueeModifierNode.f2());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", l = {384, 386, 390, 390}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public AnimationSpec f2805a;

        /* renamed from: b, reason: collision with root package name */
        public int f2806b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f2807c;
        public final /* synthetic */ MarqueeModifierNode d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MarqueeModifierNode marqueeModifierNode, g gVar) {
            super(2, gVar);
            this.d = marqueeModifierNode;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, gVar);
            anonymousClass2.f2807c = obj;
            return anonymousClass2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((Float) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00da A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, g gVar) {
        super(2, gVar);
        this.f2803b = marqueeModifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new MarqueeModifierNode$runAnimation$2(this.f2803b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((MarqueeModifierNode$runAnimation$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f2802a;
        if (i2 == 0) {
            q.m(obj);
            MarqueeModifierNode marqueeModifierNode = this.f2803b;
            j l2 = SnapshotStateKt.l(new AnonymousClass1(marqueeModifierNode));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(marqueeModifierNode, null);
            this.f2802a = 1;
            if (p0.a.D(l2, anonymousClass2, this) == aVar) {
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
