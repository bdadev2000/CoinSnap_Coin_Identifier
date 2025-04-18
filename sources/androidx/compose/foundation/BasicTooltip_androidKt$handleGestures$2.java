package androidx.compose.foundation;

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
@e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", l = {Opcodes.GETFIELD}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BasicTooltip_androidKt$handleGestures$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2566a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2568c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", l = {Opcodes.PUTFIELD}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f2569a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2570b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f2571c;
        public final /* synthetic */ BasicTooltipState d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", l = {Opcodes.INVOKEINTERFACE}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C00071 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public PointerEventPass f2572a;

            /* renamed from: b, reason: collision with root package name */
            public int f2573b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f2574c;
            public final /* synthetic */ d0 d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ BasicTooltipState f2575f;

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public final class C00081 extends i implements p {

                /* renamed from: a, reason: collision with root package name */
                public int f2576a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BasicTooltipState f2577b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00081(BasicTooltipState basicTooltipState, g gVar) {
                    super(2, gVar);
                    this.f2577b = basicTooltipState;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    return new C00081(this.f2577b, gVar);
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00081) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f30806a;
                    int i2 = this.f2576a;
                    if (i2 == 0) {
                        q.m(obj);
                        this.f2576a = 1;
                        if (this.f2577b.show() == aVar) {
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
            public C00071(d0 d0Var, BasicTooltipState basicTooltipState, g gVar) {
                super(gVar);
                this.d = d0Var;
                this.f2575f = basicTooltipState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                C00071 c00071 = new C00071(this.d, this.f2575f, gVar);
                c00071.f2574c = obj;
                return c00071;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00071) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
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
                    int r1 = r10.f2573b
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r10.f2572a
                    java.lang.Object r3 = r10.f2574c
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
                    java.lang.Object r11 = r10.f2574c
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.f15573b
                    r3 = r11
                    r11 = r10
                L2a:
                    r11.f2574c = r3
                    r11.f2572a = r1
                    r11.f2573b = r2
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
                    androidx.compose.foundation.BasicTooltipState r7 = r0.f2575f
                    if (r5 == 0) goto L69
                    androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1 r11 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2.AnonymousClass1.C00071.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, g gVar) {
            super(2, gVar);
            this.f2571c = pointerInputScope;
            this.d = basicTooltipState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2571c, this.d, gVar);
            anonymousClass1.f2570b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f2569a;
            if (i2 == 0) {
                q.m(obj);
                C00071 c00071 = new C00071((d0) this.f2570b, this.d, null);
                this.f2569a = 1;
                if (this.f2571c.K1(c00071, this) == aVar) {
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
    public BasicTooltip_androidKt$handleGestures$2(BasicTooltipState basicTooltipState, g gVar) {
        super(2, gVar);
        this.f2568c = basicTooltipState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        BasicTooltip_androidKt$handleGestures$2 basicTooltip_androidKt$handleGestures$2 = new BasicTooltip_androidKt$handleGestures$2(this.f2568c, gVar);
        basicTooltip_androidKt$handleGestures$2.f2567b = obj;
        return basicTooltip_androidKt$handleGestures$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltip_androidKt$handleGestures$2) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2566a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f2567b, this.f2568c, null);
            this.f2566a = 1;
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
