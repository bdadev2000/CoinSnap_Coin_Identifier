package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import j0.i;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3521a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f3523c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PressGestureScopeImpl f3525g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3526a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3527b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f3528c;
        public final /* synthetic */ q d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l f3529f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ PressGestureScopeImpl f3530g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00121 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3531a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3532b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00121(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3532b = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00121(this.f3532b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00121) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3531a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    this.f3531a = 1;
                    if (this.f3532b.m(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.q.m(obj);
                }
                return b0.f30125a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3533a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f3534b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3535c;
            public final /* synthetic */ PointerInputChange d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(q qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, g gVar) {
                super(2, gVar);
                this.f3534b = qVar;
                this.f3535c = pressGestureScopeImpl;
                this.d = pointerInputChange;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass2(this.f3534b, this.f3535c, this.d, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3533a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    Offset offset = new Offset(this.d.f15591c);
                    this.f3533a = 1;
                    if (this.f3534b.invoke(this.f3535c, offset, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.q.m(obj);
                }
                return b0.f30125a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass3 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3536a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3536a = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass3(this.f3536a, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((d0) obj, (g) obj2);
                b0 b0Var = b0.f30125a;
                anonymousClass3.invokeSuspend(b0Var);
                return b0Var;
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                kotlin.jvm.internal.q.m(obj);
                this.f3536a.f3399c = true;
                r0.d.f(null);
                return b0.f30125a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass4 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3537a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3537a = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass4(this.f3537a, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((d0) obj, (g) obj2);
                b0 b0Var = b0.f30125a;
                anonymousClass4.invokeSuspend(b0Var);
                return b0Var;
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                kotlin.jvm.internal.q.m(obj);
                this.f3537a.f3398b = true;
                r0.d.f(null);
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, q qVar, l lVar, PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
            super(gVar);
            this.f3528c = d0Var;
            this.d = qVar;
            this.f3529f = lVar;
            this.f3530g = pressGestureScopeImpl;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3528c, this.d, this.f3529f, this.f3530g, gVar);
            anonymousClass1.f3527b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r10.f3526a
                r2 = 0
                b1.d0 r3 = r10.f3528c
                r4 = 3
                r5 = 0
                r6 = 2
                r7 = 1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r8 = r10.f3530g
                if (r1 == 0) goto L27
                if (r1 == r7) goto L1f
                if (r1 != r6) goto L17
                kotlin.jvm.internal.q.m(r11)
                goto L62
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                java.lang.Object r1 = r10.f3527b
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.jvm.internal.q.m(r11)
                goto L42
            L27:
                kotlin.jvm.internal.q.m(r11)
                java.lang.Object r11 = r10.f3527b
                r1 = r11
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r11 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                r11.<init>(r8, r5)
                kotlin.jvm.internal.e.v(r3, r5, r2, r11, r4)
                r10.f3527b = r1
                r10.f3526a = r7
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r5, r10, r4)
                if (r11 != r0) goto L42
                return r0
            L42:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                r11.a()
                q0.q r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f3510a
                q0.q r9 = r10.d
                if (r9 == r7) goto L55
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r7 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                r7.<init>(r9, r8, r11, r5)
                kotlin.jvm.internal.e.v(r3, r5, r2, r7, r4)
            L55:
                r10.f3527b = r5
                r10.f3526a = r6
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.f15573b
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.g(r1, r11, r10)
                if (r11 != r0) goto L62
                return r0
            L62:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                if (r11 != 0) goto L6f
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r11 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                r11.<init>(r8, r5)
                kotlin.jvm.internal.e.v(r3, r5, r2, r11, r4)
                goto L88
            L6f:
                r11.a()
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                r0.<init>(r8, r5)
                kotlin.jvm.internal.e.v(r3, r5, r2, r0, r4)
                q0.l r0 = r10.f3529f
                if (r0 == 0) goto L88
                androidx.compose.ui.geometry.Offset r1 = new androidx.compose.ui.geometry.Offset
                long r2 = r11.f15591c
                r1.<init>(r2)
                r0.invoke(r1)
            L88:
                d0.b0 r11 = d0.b0.f30125a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, q qVar, l lVar, PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
        super(2, gVar);
        this.f3523c = pointerInputScope;
        this.d = qVar;
        this.f3524f = lVar;
        this.f3525g = pressGestureScopeImpl;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.f3523c, this.d, this.f3524f, this.f3525g, gVar);
        tapGestureDetectorKt$detectTapAndPress$2.f3522b = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3521a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((d0) this.f3522b, this.d, this.f3524f, this.f3525g, null);
            this.f3521a = 1;
            if (ForEachGestureKt.b(this.f3523c, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
