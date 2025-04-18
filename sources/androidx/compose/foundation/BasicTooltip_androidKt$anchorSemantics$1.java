package androidx.compose.foundation;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTooltip_androidKt$anchorSemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f2544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2545c;

    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$anchorSemantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f2546a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BasicTooltipState f2547b;

        @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$anchorSemantics$1$1$1", f = "BasicTooltip.android.kt", l = {216}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C00041 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f2548a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BasicTooltipState f2549b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(BasicTooltipState basicTooltipState, g gVar) {
                super(2, gVar);
                this.f2549b = basicTooltipState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00041(this.f2549b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00041) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f2548a;
                if (i2 == 0) {
                    q.m(obj);
                    this.f2548a = 1;
                    if (this.f2549b.show() == aVar) {
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
        public AnonymousClass1(BasicTooltipState basicTooltipState, d0 d0Var) {
            super(0);
            this.f2546a = d0Var;
            this.f2547b = basicTooltipState;
        }

        @Override // q0.a
        public final Object invoke() {
            kotlin.jvm.internal.e.v(this.f2546a, null, 0, new C00041(this.f2547b, null), 3);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$anchorSemantics$1(String str, d0 d0Var, BasicTooltipState basicTooltipState) {
        super(1);
        this.f2543a = str;
        this.f2544b = d0Var;
        this.f2545c = basicTooltipState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.j((SemanticsPropertyReceiver) obj, this.f2543a, new AnonymousClass1(this.f2545c, this.f2544b));
        return b0.f30125a;
    }
}
