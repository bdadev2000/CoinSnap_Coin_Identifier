package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BasicTooltip_androidKt$handleGestures$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f12929a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TooltipState f12931c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f12932a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12933b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f12934c;
        public final /* synthetic */ TooltipState d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", l = {212}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C00511 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public PointerEventPass f12935a;

            /* renamed from: b, reason: collision with root package name */
            public int f12936b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f12937c;
            public final /* synthetic */ d0 d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ TooltipState f12938f;

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", l = {217}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public final class C00521 extends i implements p {

                /* renamed from: a, reason: collision with root package name */
                public int f12939a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TooltipState f12940b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00521(TooltipState tooltipState, g gVar) {
                    super(2, gVar);
                    this.f12940b = tooltipState;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    return new C00521(this.f12940b, gVar);
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00521) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    i0.a aVar = i0.a.f30806a;
                    int i2 = this.f12939a;
                    if (i2 == 0) {
                        q.m(obj);
                        MutatePriority mutatePriority = MutatePriority.f2812b;
                        this.f12939a = 1;
                        if (this.f12940b.b(mutatePriority, this) == aVar) {
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
            public C00511(d0 d0Var, TooltipState tooltipState, g gVar) {
                super(gVar);
                this.d = d0Var;
                this.f12938f = tooltipState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                C00511 c00511 = new C00511(this.d, this.f12938f, gVar);
                c00511.f12937c = obj;
                return c00511;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00511) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0037 -> B:5:0x003d). Please report as a decompilation issue!!! */
            @Override // j0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    i0.a r0 = i0.a.f30806a
                    int r1 = r10.f12936b
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r10.f12935a
                    java.lang.Object r3 = r10.f12937c
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.jvm.internal.q.m(r11)
                    r4 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    goto L3d
                L17:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1f:
                    kotlin.jvm.internal.q.m(r11)
                    java.lang.Object r11 = r10.f12937c
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.f15573b
                    r3 = r11
                    r11 = r10
                L2a:
                    r11.f12937c = r3
                    r11.f12935a = r1
                    r11.f12936b = r2
                    java.lang.Object r4 = r3.L1(r1, r11)
                    if (r4 != r0) goto L37
                    return r0
                L37:
                    r9 = r0
                    r0 = r11
                    r11 = r4
                    r4 = r3
                    r3 = r1
                    r1 = r9
                L3d:
                    androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
                    java.util.List r5 = r11.f15569a
                    r6 = 0
                    java.lang.Object r5 = r5.get(r6)
                    androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
                    int r5 = r5.f15595i
                    r7 = 2
                    boolean r5 = androidx.compose.ui.input.pointer.PointerType.a(r5, r7)
                    if (r5 == 0) goto L73
                    int r11 = r11.d
                    r5 = 4
                    boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.a(r11, r5)
                    androidx.compose.material3.TooltipState r7 = r0.f12938f
                    if (r5 == 0) goto L69
                    androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1 r11 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1
                    r5 = 0
                    r11.<init>(r7, r5)
                    r7 = 3
                    b1.d0 r8 = r0.d
                    kotlin.jvm.internal.e.v(r8, r5, r6, r11, r7)
                    goto L73
                L69:
                    r5 = 5
                    boolean r11 = androidx.compose.ui.input.pointer.PointerEventType.a(r11, r5)
                    if (r11 == 0) goto L73
                    r7.dismiss()
                L73:
                    r11 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L2a
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2.AnonymousClass1.C00511.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, g gVar) {
            super(2, gVar);
            this.f12934c = pointerInputScope;
            this.d = tooltipState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12934c, this.d, gVar);
            anonymousClass1.f12933b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f12932a;
            if (i2 == 0) {
                q.m(obj);
                C00511 c00511 = new C00511((d0) this.f12933b, this.d, null);
                this.f12932a = 1;
                if (this.f12934c.K1(c00511, this) == aVar) {
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
    public BasicTooltip_androidKt$handleGestures$2(TooltipState tooltipState, g gVar) {
        super(2, gVar);
        this.f12931c = tooltipState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        BasicTooltip_androidKt$handleGestures$2 basicTooltip_androidKt$handleGestures$2 = new BasicTooltip_androidKt$handleGestures$2(this.f12931c, gVar);
        basicTooltip_androidKt$handleGestures$2.f12930b = obj;
        return basicTooltip_androidKt$handleGestures$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltip_androidKt$handleGestures$2) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12929a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f12930b, this.f12931c, null);
            this.f12929a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
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
