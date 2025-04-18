package androidx.compose.foundation.lazy.layout;

import android.support.v4.media.d;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f4857a;

    @e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {205}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f4858a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutSemanticsModifierNode f4859b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4860c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i2, g gVar) {
            super(2, gVar);
            this.f4859b = lazyLayoutSemanticsModifierNode;
            this.f4860c = i2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f4859b, this.f4860c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f4858a;
            if (i2 == 0) {
                q.m(obj);
                LazyLayoutSemanticState lazyLayoutSemanticState = this.f4859b.f4846p;
                this.f4858a = 1;
                if (lazyLayoutSemanticState.f(this.f4860c, this) == aVar) {
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
    public LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        super(1);
        this.f4857a = lazyLayoutSemanticsModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.f4857a;
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutSemanticsModifierNode.f4845o.invoke();
        if (intValue >= 0 && intValue < lazyLayoutItemProvider.getItemCount()) {
            kotlin.jvm.internal.e.v(lazyLayoutSemanticsModifierNode.S1(), null, 0, new AnonymousClass2(lazyLayoutSemanticsModifierNode, intValue, null), 3);
            return Boolean.TRUE;
        }
        StringBuilder t2 = d.t("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
        t2.append(lazyLayoutItemProvider.getItemCount());
        t2.append(')');
        throw new IllegalArgumentException(t2.toString().toString());
    }
}
