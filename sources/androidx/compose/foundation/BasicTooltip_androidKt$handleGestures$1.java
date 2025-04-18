package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", l = {Opcodes.DCMPG}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BasicTooltip_androidKt$handleGestures$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2550a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2552c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", l = {153}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f2553a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2554b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f2555c;
        public final /* synthetic */ BasicTooltipState d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", l = {158, Opcodes.IF_ICMPLE, Opcodes.IRETURN}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00051 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public PointerEventPass f2556a;

            /* renamed from: b, reason: collision with root package name */
            public long f2557b;

            /* renamed from: c, reason: collision with root package name */
            public int f2558c;
            public /* synthetic */ Object d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d0 f2559f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ BasicTooltipState f2560g;

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", l = {Opcodes.IF_ACMPEQ}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C00061 extends h implements p {

                /* renamed from: a, reason: collision with root package name */
                public int f2561a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f2562b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ PointerEventPass f2563c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00061(PointerEventPass pointerEventPass, g gVar) {
                    super(gVar);
                    this.f2563c = pointerEventPass;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    C00061 c00061 = new C00061(this.f2563c, gVar);
                    c00061.f2562b = obj;
                    return c00061;
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00061) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f30806a;
                    int i2 = this.f2561a;
                    if (i2 == 0) {
                        q.m(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f2562b;
                        this.f2561a = 1;
                        obj = TapGestureDetectorKt.g(awaitPointerEventScope, this.f2563c, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q.m(obj);
                    }
                    return obj;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", l = {Opcodes.RET}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public final class AnonymousClass2 extends i implements p {

                /* renamed from: a, reason: collision with root package name */
                public int f2564a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BasicTooltipState f2565b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BasicTooltipState basicTooltipState, g gVar) {
                    super(2, gVar);
                    this.f2565b = basicTooltipState;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    return new AnonymousClass2(this.f2565b, gVar);
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f30806a;
                    int i2 = this.f2564a;
                    if (i2 == 0) {
                        q.m(obj);
                        this.f2564a = 1;
                        if (this.f2565b.show() == aVar) {
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
            public C00051(d0 d0Var, BasicTooltipState basicTooltipState, g gVar) {
                super(gVar);
                this.f2559f = d0Var;
                this.f2560g = basicTooltipState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                C00051 c00051 = new C00051(this.f2559f, this.f2560g, gVar);
                c00051.d = obj;
                return c00051;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00051) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x009e A[LOOP:0: B:8:0x009c->B:9:0x009e, LOOP_END] */
            @Override // j0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    i0.a r0 = i0.a.f30806a
                    int r1 = r11.f2558c
                    r2 = 0
                    r3 = 0
                    r4 = 3
                    r5 = 1
                    r6 = 2
                    if (r1 == 0) goto L35
                    if (r1 == r5) goto L29
                    if (r1 == r6) goto L1e
                    if (r1 != r4) goto L16
                    kotlin.jvm.internal.q.m(r12)
                    goto L94
                L16:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1e:
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r11.f2556a
                    java.lang.Object r5 = r11.d
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                    kotlin.jvm.internal.q.m(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L7b
                    goto Laa
                L29:
                    long r7 = r11.f2557b
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r11.f2556a
                    java.lang.Object r9 = r11.d
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
                    kotlin.jvm.internal.q.m(r12)
                    goto L58
                L35:
                    kotlin.jvm.internal.q.m(r12)
                    java.lang.Object r12 = r11.d
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
                    androidx.compose.ui.platform.ViewConfiguration r1 = r12.getViewConfiguration()
                    long r7 = r1.c()
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.f15572a
                    r11.d = r12
                    r11.f2556a = r1
                    r11.f2557b = r7
                    r11.f2558c = r5
                    java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r12, r1, r11, r5)
                    if (r9 != r0) goto L55
                    return r0
                L55:
                    r10 = r9
                    r9 = r12
                    r12 = r10
                L58:
                    androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                    int r12 = r12.f15595i
                    boolean r5 = androidx.compose.ui.input.pointer.PointerType.a(r12, r5)
                    if (r5 != 0) goto L68
                    boolean r12 = androidx.compose.ui.input.pointer.PointerType.a(r12, r4)
                    if (r12 == 0) goto Laa
                L68:
                    androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1 r12 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L7a
                    r12.<init>(r1, r3)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L7a
                    r11.d = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L7a
                    r11.f2556a = r1     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L7a
                    r11.f2558c = r6     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L7a
                    java.lang.Object r12 = r9.f1(r7, r12, r11)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L7a
                    if (r12 != r0) goto Laa
                    return r0
                L7a:
                    r5 = r9
                L7b:
                    androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2 r12 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2
                    androidx.compose.foundation.BasicTooltipState r6 = r11.f2560g
                    r12.<init>(r6, r3)
                    b1.d0 r6 = r11.f2559f
                    kotlin.jvm.internal.e.v(r6, r3, r2, r12, r4)
                    r11.d = r3
                    r11.f2556a = r3
                    r11.f2558c = r4
                    java.lang.Object r12 = r5.L1(r1, r11)
                    if (r12 != r0) goto L94
                    return r0
                L94:
                    androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
                    java.util.List r12 = r12.f15569a
                    int r0 = r12.size()
                L9c:
                    if (r2 >= r0) goto Laa
                    java.lang.Object r1 = r12.get(r2)
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                    r1.a()
                    int r2 = r2 + 1
                    goto L9c
                Laa:
                    d0.b0 r12 = d0.b0.f30125a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00051.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, g gVar) {
            super(2, gVar);
            this.f2555c = pointerInputScope;
            this.d = basicTooltipState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2555c, this.d, gVar);
            anonymousClass1.f2554b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f2553a;
            if (i2 == 0) {
                q.m(obj);
                C00051 c00051 = new C00051((d0) this.f2554b, this.d, null);
                this.f2553a = 1;
                if (ForEachGestureKt.b(this.f2555c, c00051, this) == aVar) {
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
    public BasicTooltip_androidKt$handleGestures$1(BasicTooltipState basicTooltipState, g gVar) {
        super(2, gVar);
        this.f2552c = basicTooltipState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        BasicTooltip_androidKt$handleGestures$1 basicTooltip_androidKt$handleGestures$1 = new BasicTooltip_androidKt$handleGestures$1(this.f2552c, gVar);
        basicTooltip_androidKt$handleGestures$1.f2551b = obj;
        return basicTooltip_androidKt$handleGestures$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltip_androidKt$handleGestures$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2550a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f2551b, this.f2552c, null);
            this.f2550a = 1;
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
