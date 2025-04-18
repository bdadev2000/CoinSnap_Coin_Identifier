package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class BasicTooltip_androidKt$TooltipPopup$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TooltipState f12886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f12887b;

    @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1", f = "BasicTooltip.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TooltipState f12888a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TooltipState tooltipState, g gVar) {
            super(2, gVar);
            this.f12888a = tooltipState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f12888a, gVar);
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
            this.f12888a.dismiss();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$TooltipPopup$1$1(TooltipState tooltipState, d0 d0Var) {
        super(0);
        this.f12886a = tooltipState;
        this.f12887b = d0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        TooltipState tooltipState = this.f12886a;
        if (tooltipState.isVisible()) {
            kotlin.jvm.internal.e.v(this.f12887b, null, 0, new AnonymousClass1(tooltipState, null), 3);
        }
        return b0.f30125a;
    }
}
