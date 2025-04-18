package androidx.compose.foundation.pager;

import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PagerKt$pagerSemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f5180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f5181c;

    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PagerState f5182a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f5183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagerState pagerState, d0 d0Var) {
            super(0);
            this.f5182a = pagerState;
            this.f5183b = d0Var;
        }

        @Override // q0.a
        public final Object invoke() {
            PagerState pagerState = this.f5182a;
            boolean z2 = false;
            if (pagerState.c()) {
                e.v(this.f5183b, null, 0, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3);
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PagerState f5184a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f5185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PagerState pagerState, d0 d0Var) {
            super(0);
            this.f5184a = pagerState;
            this.f5185b = d0Var;
        }

        @Override // q0.a
        public final Object invoke() {
            PagerState pagerState = this.f5184a;
            boolean z2 = false;
            if (pagerState.d()) {
                e.v(this.f5185b, null, 0, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3);
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PagerState f5186a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f5187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PagerState pagerState, d0 d0Var) {
            super(0);
            this.f5186a = pagerState;
            this.f5187b = d0Var;
        }

        @Override // q0.a
        public final Object invoke() {
            PagerState pagerState = this.f5186a;
            boolean z2 = false;
            if (pagerState.c()) {
                e.v(this.f5187b, null, 0, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3);
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass4 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PagerState f5188a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f5189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PagerState pagerState, d0 d0Var) {
            super(0);
            this.f5188a = pagerState;
            this.f5189b = d0Var;
        }

        @Override // q0.a
        public final Object invoke() {
            PagerState pagerState = this.f5188a;
            boolean z2 = false;
            if (pagerState.d()) {
                e.v(this.f5189b, null, 0, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3);
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$1(boolean z2, PagerState pagerState, d0 d0Var) {
        super(1);
        this.f5179a = z2;
        this.f5180b = pagerState;
        this.f5181c = d0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        boolean z2 = this.f5179a;
        d0 d0Var = this.f5181c;
        PagerState pagerState = this.f5180b;
        if (z2) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pagerState, d0Var);
            n[] nVarArr = SemanticsPropertiesKt.f16865a;
            semanticsPropertyReceiver.b(SemanticsActions.w, new AccessibilityAction(null, anonymousClass1));
            semanticsPropertyReceiver.b(SemanticsActions.f16813y, new AccessibilityAction(null, new AnonymousClass2(pagerState, d0Var)));
        } else {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(pagerState, d0Var);
            n[] nVarArr2 = SemanticsPropertiesKt.f16865a;
            semanticsPropertyReceiver.b(SemanticsActions.x, new AccessibilityAction(null, anonymousClass3));
            semanticsPropertyReceiver.b(SemanticsActions.f16814z, new AccessibilityAction(null, new AnonymousClass4(pagerState, d0Var)));
        }
        return b0.f30125a;
    }
}
