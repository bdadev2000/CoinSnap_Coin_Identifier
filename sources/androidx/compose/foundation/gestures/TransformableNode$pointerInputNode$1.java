package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import d1.b;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import j0.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1", f = "Transformable.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TransformableNode$pointerInputNode$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3615a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransformableNode f3617c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", l = {Opcodes.FRETURN}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3618a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3619b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f3620c;
        public final /* synthetic */ TransformableNode d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", l = {158, Opcodes.IF_ICMPLT}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C00151 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public f0 f3621a;

            /* renamed from: b, reason: collision with root package name */
            public f0 f3622b;

            /* renamed from: c, reason: collision with root package name */
            public int f3623c;
            public /* synthetic */ Object d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ TransformableNode f3624f;

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", l = {Opcodes.IF_ACMPNE}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public final class C00161 extends i implements p {

                /* renamed from: a, reason: collision with root package name */
                public f0 f3625a;

                /* renamed from: b, reason: collision with root package name */
                public int f3626b;

                /* renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f3627c;
                public final /* synthetic */ f0 d;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ TransformableNode f3628f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00161(f0 f0Var, TransformableNode transformableNode, g gVar) {
                    super(2, gVar);
                    this.d = f0Var;
                    this.f3628f = transformableNode;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    C00161 c00161 = new C00161(this.d, this.f3628f, gVar);
                    c00161.f3627c = obj;
                    return c00161;
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00161) create((TransformScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:5:0x0054). Please report as a decompilation issue!!! */
                @Override // j0.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        i0.a r0 = i0.a.f30806a
                        int r1 = r7.f3626b
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        kotlin.jvm.internal.f0 r1 = r7.f3625a
                        java.lang.Object r3 = r7.f3627c
                        androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                        kotlin.jvm.internal.q.m(r8)
                        r4 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r7
                        goto L54
                    L17:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1f:
                        kotlin.jvm.internal.q.m(r8)
                        java.lang.Object r8 = r7.f3627c
                        androidx.compose.foundation.gestures.TransformScope r8 = (androidx.compose.foundation.gestures.TransformScope) r8
                        r3 = r8
                        r8 = r7
                    L28:
                        kotlin.jvm.internal.f0 r1 = r8.d
                        java.lang.Object r4 = r1.f30930a
                        boolean r5 = r4 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                        if (r5 != 0) goto L5a
                        boolean r5 = r4 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                        if (r5 == 0) goto L37
                        androidx.compose.foundation.gestures.TransformEvent$TransformDelta r4 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r4
                        goto L38
                    L37:
                        r4 = 0
                    L38:
                        if (r4 == 0) goto L3d
                        r3.a()
                    L3d:
                        androidx.compose.foundation.gestures.TransformableNode r4 = r8.f3628f
                        d1.b r4 = r4.f3614v
                        r8.f3627c = r3
                        r8.f3625a = r1
                        r8.f3626b = r2
                        java.lang.Object r4 = r4.g(r8)
                        if (r4 != r0) goto L4e
                        return r0
                    L4e:
                        r6 = r0
                        r0 = r8
                        r8 = r4
                        r4 = r3
                        r3 = r1
                        r1 = r6
                    L54:
                        r3.f30930a = r8
                        r8 = r0
                        r0 = r1
                        r3 = r4
                        goto L28
                    L5a:
                        d0.b0 r8 = d0.b0.f30125a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00151.C00161.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00151(TransformableNode transformableNode, g gVar) {
                super(2, gVar);
                this.f3624f = transformableNode;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                C00151 c00151 = new C00151(this.f3624f, gVar);
                c00151.d = obj;
                return c00151;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00151) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0078 -> B:10:0x0033). Please report as a decompilation issue!!! */
            @Override // j0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    i0.a r0 = i0.a.f30806a
                    int r1 = r10.f3623c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2b
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r1 = r10.d
                    b1.d0 r1 = (b1.d0) r1
                    kotlin.jvm.internal.q.m(r11)     // Catch: java.util.concurrent.CancellationException -> L13
                L13:
                    r11 = r1
                    goto L32
                L15:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1d:
                    kotlin.jvm.internal.f0 r1 = r10.f3622b
                    kotlin.jvm.internal.f0 r4 = r10.f3621a
                    java.lang.Object r5 = r10.d
                    b1.d0 r5 = (b1.d0) r5
                    kotlin.jvm.internal.q.m(r11)
                    r6 = r4
                    r4 = r10
                    goto L57
                L2b:
                    kotlin.jvm.internal.q.m(r11)
                    java.lang.Object r11 = r10.d
                    b1.d0 r11 = (b1.d0) r11
                L32:
                    r1 = r10
                L33:
                    boolean r4 = p0.a.n0(r11)
                    if (r4 == 0) goto L7b
                    kotlin.jvm.internal.f0 r4 = new kotlin.jvm.internal.f0
                    r4.<init>()
                    androidx.compose.foundation.gestures.TransformableNode r5 = r1.f3624f
                    d1.b r5 = r5.f3614v
                    r1.d = r11
                    r1.f3621a = r4
                    r1.f3622b = r4
                    r1.f3623c = r3
                    java.lang.Object r5 = r5.g(r1)
                    if (r5 != r0) goto L51
                    return r0
                L51:
                    r6 = r4
                    r4 = r1
                    r1 = r6
                    r9 = r5
                    r5 = r11
                    r11 = r9
                L57:
                    r1.f30930a = r11
                    java.lang.Object r11 = r6.f30930a
                    boolean r11 = r11 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                    if (r11 == 0) goto L78
                    androidx.compose.foundation.gestures.TransformableNode r11 = r4.f3624f     // Catch: java.util.concurrent.CancellationException -> L78
                    androidx.compose.foundation.gestures.TransformableState r1 = r11.f3609q     // Catch: java.util.concurrent.CancellationException -> L78
                    androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1 r7 = new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1     // Catch: java.util.concurrent.CancellationException -> L78
                    r8 = 0
                    r7.<init>(r6, r11, r8)     // Catch: java.util.concurrent.CancellationException -> L78
                    r4.d = r5     // Catch: java.util.concurrent.CancellationException -> L78
                    r4.f3621a = r8     // Catch: java.util.concurrent.CancellationException -> L78
                    r4.f3622b = r8     // Catch: java.util.concurrent.CancellationException -> L78
                    r4.f3623c = r2     // Catch: java.util.concurrent.CancellationException -> L78
                    java.lang.Object r11 = r1.a(r7, r4)     // Catch: java.util.concurrent.CancellationException -> L78
                    if (r11 != r0) goto L78
                    return r0
                L78:
                    r1 = r4
                    r11 = r5
                    goto L33
                L7b:
                    d0.b0 r11 = d0.b0.f30125a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00151.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", l = {Opcodes.ARETURN}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public final class AnonymousClass2 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3629a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f3630b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TransformableNode f3631c;
            public final /* synthetic */ d0 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TransformableNode transformableNode, d0 d0Var, g gVar) {
                super(gVar);
                this.f3631c = transformableNode;
                this.d = d0Var;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3631c, this.d, gVar);
                anonymousClass2.f3630b = obj;
                return anonymousClass2;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3629a;
                TransformEvent.TransformStopped transformStopped = TransformEvent.TransformStopped.f3586a;
                TransformableNode transformableNode = this.f3631c;
                try {
                    try {
                        if (i2 == 0) {
                            q.m(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f3630b;
                            boolean z2 = transformableNode.f3611s;
                            b bVar = transformableNode.f3614v;
                            l lVar = transformableNode.f3613u;
                            this.f3629a = 1;
                            if (TransformableKt.a(awaitPointerEventScope, z2, bVar, lVar, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            q.m(obj);
                        }
                    } catch (CancellationException e) {
                        if (!p0.a.n0(this.d)) {
                            throw e;
                        }
                    }
                    return b0.f30125a;
                } finally {
                    transformableNode.f3614v.b(transformStopped);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, g gVar) {
            super(2, gVar);
            this.f3620c = pointerInputScope;
            this.d = transformableNode;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3620c, this.d, gVar);
            anonymousClass1.f3619b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f3618a;
            if (i2 == 0) {
                q.m(obj);
                d0 d0Var = (d0) this.f3619b;
                TransformableNode transformableNode = this.d;
                kotlin.jvm.internal.e.v(d0Var, null, 4, new C00151(transformableNode, null), 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(transformableNode, d0Var, null);
                this.f3618a = 1;
                if (ForEachGestureKt.b(this.f3620c, anonymousClass2, this) == aVar) {
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
    public TransformableNode$pointerInputNode$1(TransformableNode transformableNode, g gVar) {
        super(2, gVar);
        this.f3617c = transformableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TransformableNode$pointerInputNode$1 transformableNode$pointerInputNode$1 = new TransformableNode$pointerInputNode$1(this.f3617c, gVar);
        transformableNode$pointerInputNode$1.f3616b = obj;
        return transformableNode$pointerInputNode$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TransformableNode$pointerInputNode$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3615a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f3616b;
            TransformableNode transformableNode = this.f3617c;
            if (!transformableNode.f3612t) {
                return b0Var;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, transformableNode, null);
            this.f3615a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}
