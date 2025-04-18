package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTooltip_androidKt$anchorSemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f12903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TooltipState f12904c;

    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f12905a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TooltipState f12906b;

        @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1", f = "BasicTooltip.android.kt", l = {241}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C00471 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f12907a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TooltipState f12908b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00471(TooltipState tooltipState, g gVar) {
                super(2, gVar);
                this.f12908b = tooltipState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00471(this.f12908b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00471) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f12907a;
                if (i2 == 0) {
                    q.m(obj);
                    this.f12907a = 1;
                    if (this.f12908b.b(MutatePriority.f2811a, this) == aVar) {
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
        public AnonymousClass1(TooltipState tooltipState, d0 d0Var) {
            super(0);
            this.f12905a = d0Var;
            this.f12906b = tooltipState;
        }

        @Override // q0.a
        public final Object invoke() {
            kotlin.jvm.internal.e.v(this.f12905a, null, 0, new C00471(this.f12906b, null), 3);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$anchorSemantics$1(String str, d0 d0Var, TooltipState tooltipState) {
        super(1);
        this.f12902a = str;
        this.f12903b = d0Var;
        this.f12904c = tooltipState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.j((SemanticsPropertyReceiver) obj, this.f12902a, new AnonymousClass1(this.f12904c, this.f12903b));
        return b0.f30125a;
    }
}
