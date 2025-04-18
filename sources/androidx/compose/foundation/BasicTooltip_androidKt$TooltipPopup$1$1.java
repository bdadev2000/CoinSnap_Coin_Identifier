package androidx.compose.foundation;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
final class BasicTooltip_androidKt$TooltipPopup$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f2528b;

    @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$TooltipPopup$1$1$1", f = "BasicTooltip.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$TooltipPopup$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BasicTooltipState f2529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BasicTooltipState basicTooltipState, g gVar) {
            super(2, gVar);
            this.f2529a = basicTooltipState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f2529a, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((d0) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            q.m(obj);
            this.f2529a.dismiss();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$TooltipPopup$1$1(BasicTooltipState basicTooltipState, d0 d0Var) {
        super(0);
        this.f2527a = basicTooltipState;
        this.f2528b = d0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        BasicTooltipState basicTooltipState = this.f2527a;
        if (basicTooltipState.isVisible()) {
            kotlin.jvm.internal.e.v(this.f2528b, null, 0, new AnonymousClass1(basicTooltipState, null), 3);
        }
        return b0.f30125a;
    }
}
