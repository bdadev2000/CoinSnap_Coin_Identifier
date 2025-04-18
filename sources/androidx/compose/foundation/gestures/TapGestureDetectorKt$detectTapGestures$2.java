package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.f0;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {Opcodes.DADD}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TapGestureDetectorKt$detectTapGestures$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3538a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f3540c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f3542g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f3543h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, Opcodes.FREM, Opcodes.LOR, Opcodes.F2D, 156, Opcodes.GETSTATIC}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f3544a;

        /* renamed from: b, reason: collision with root package name */
        public Object f3545b;

        /* renamed from: c, reason: collision with root package name */
        public f0 f3546c;
        public long d;

        /* renamed from: f, reason: collision with root package name */
        public int f3547f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f3548g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ d0 f3549h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ q f3550i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ l f3551j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ l f3552k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f3553l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PressGestureScopeImpl f3554m;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {103}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C00131 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3555a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3556b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00131(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3556b = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00131(this.f3556b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00131) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3555a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    this.f3555a = 1;
                    if (this.f3556b.m(this) == aVar) {
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
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass10 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3557a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3557a = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass10(this.f3557a, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass10 anonymousClass10 = (AnonymousClass10) create((d0) obj, (g) obj2);
                b0 b0Var = b0.f30125a;
                anonymousClass10.invokeSuspend(b0Var);
                return b0Var;
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                kotlin.jvm.internal.q.m(obj);
                this.f3557a.f3398b = true;
                r0.d.f(null);
                return b0.f30125a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {106}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass2 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3558a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f3559b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3560c;
            public final /* synthetic */ PointerInputChange d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(q qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, g gVar) {
                super(2, gVar);
                this.f3559b = qVar;
                this.f3560c = pressGestureScopeImpl;
                this.d = pointerInputChange;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass2(this.f3559b, this.f3560c, this.d, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3558a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    Offset offset = new Offset(this.d.f15591c);
                    this.f3558a = 1;
                    if (this.f3559b.invoke(this.f3560c, offset, this) == aVar) {
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
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {Opcodes.DREM}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass3 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3561a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f3562b;

            /* JADX WARN: Type inference failed for: r0v0, types: [j0.h, h0.g, androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3] */
            @Override // j0.a
            public final g create(Object obj, g gVar) {
                ?? hVar = new h(gVar);
                hVar.f3562b = obj;
                return hVar;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3561a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f3562b;
                    this.f3561a = 1;
                    obj = TapGestureDetectorKt.g(awaitPointerEventScope, PointerEventPass.f15573b, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.q.m(obj);
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass4 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3563a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3563a = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass4(this.f3563a, gVar);
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
                this.f3563a.f3399c = true;
                r0.d.f(null);
                return b0.f30125a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass5 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3564a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3564a = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass5(this.f3564a, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) create((d0) obj, (g) obj2);
                b0 b0Var = b0.f30125a;
                anonymousClass5.invokeSuspend(b0Var);
                return b0Var;
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                kotlin.jvm.internal.q.m(obj);
                this.f3564a.f3398b = true;
                r0.d.f(null);
                return b0.f30125a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass6 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3565a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3565a = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass6(this.f3565a, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass6 anonymousClass6 = (AnonymousClass6) create((d0) obj, (g) obj2);
                b0 b0Var = b0.f30125a;
                anonymousClass6.invokeSuspend(b0Var);
                return b0Var;
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                kotlin.jvm.internal.q.m(obj);
                this.f3565a.f3398b = true;
                r0.d.f(null);
                return b0.f30125a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {Opcodes.LCMP}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass7 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3566a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3567b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(2, gVar);
                this.f3567b = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass7(this.f3567b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass7) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3566a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    this.f3566a = 1;
                    if (this.f3567b.m(this) == aVar) {
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
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {Opcodes.DCMPL}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass8 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3568a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f3569b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3570c;
            public final /* synthetic */ PointerInputChange d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(q qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, g gVar) {
                super(2, gVar);
                this.f3569b = qVar;
                this.f3570c = pressGestureScopeImpl;
                this.d = pointerInputChange;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass8(this.f3569b, this.f3570c, this.d, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass8) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3568a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    Offset offset = new Offset(this.d.f15591c);
                    this.f3568a = 1;
                    if (this.f3569b.invoke(this.f3570c, offset, this) == aVar) {
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
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass9 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3571a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f3572b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d0 f3573c;
            public final /* synthetic */ l d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ l f3574f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ f0 f3575g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f3576h;

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes3.dex */
            public final class C00141 extends i implements p {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ PressGestureScopeImpl f3577a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00141(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                    super(2, gVar);
                    this.f3577a = pressGestureScopeImpl;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    return new C00141(this.f3577a, gVar);
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    C00141 c00141 = (C00141) create((d0) obj, (g) obj2);
                    b0 b0Var = b0.f30125a;
                    c00141.invokeSuspend(b0Var);
                    return b0Var;
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f30806a;
                    kotlin.jvm.internal.q.m(obj);
                    this.f3577a.f3398b = true;
                    r0.d.f(null);
                    return b0.f30125a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public final class AnonymousClass2 extends i implements p {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ PressGestureScopeImpl f3578a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                    super(2, gVar);
                    this.f3578a = pressGestureScopeImpl;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    return new AnonymousClass2(this.f3578a, gVar);
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((d0) obj, (g) obj2);
                    b0 b0Var = b0.f30125a;
                    anonymousClass2.invokeSuspend(b0Var);
                    return b0Var;
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f30806a;
                    kotlin.jvm.internal.q.m(obj);
                    this.f3578a.f3399c = true;
                    r0.d.f(null);
                    return b0.f30125a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(d0 d0Var, l lVar, l lVar2, f0 f0Var, PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
                super(gVar);
                this.f3573c = d0Var;
                this.d = lVar;
                this.f3574f = lVar2;
                this.f3575g = f0Var;
                this.f3576h = pressGestureScopeImpl;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.f3573c, this.d, this.f3574f, this.f3575g, this.f3576h, gVar);
                anonymousClass9.f3572b = obj;
                return anonymousClass9;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass9) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f3571a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f3572b;
                    this.f3571a = 1;
                    obj = TapGestureDetectorKt.g(awaitPointerEventScope, PointerEventPass.f15573b, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.q.m(obj);
                }
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                b0 b0Var = b0.f30125a;
                d0 d0Var = this.f3573c;
                PressGestureScopeImpl pressGestureScopeImpl = this.f3576h;
                if (pointerInputChange != null) {
                    pointerInputChange.a();
                    kotlin.jvm.internal.e.v(d0Var, null, 0, new C00141(pressGestureScopeImpl, null), 3);
                    this.d.invoke(new Offset(pointerInputChange.f15591c));
                    return b0Var;
                }
                kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(pressGestureScopeImpl, null), 3);
                l lVar = this.f3574f;
                if (lVar == null) {
                    return null;
                }
                lVar.invoke(new Offset(((PointerInputChange) this.f3575g.f30930a).f15591c));
                return b0Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, q qVar, l lVar, l lVar2, l lVar3, PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
            super(gVar);
            this.f3549h = d0Var;
            this.f3550i = qVar;
            this.f3551j = lVar;
            this.f3552k = lVar2;
            this.f3553l = lVar3;
            this.f3554m = pressGestureScopeImpl;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3549h, this.f3550i, this.f3551j, this.f3552k, this.f3553l, this.f3554m, gVar);
            anonymousClass1.f3548g = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x01e8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e0 A[Catch: PointerEventTimeoutCancellationException -> 0x006f, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x006f, blocks: (B:50:0x0068, B:52:0x00da, B:54:0x00e0, B:55:0x00ea), top: B:49:0x0068 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ea A[Catch: PointerEventTimeoutCancellationException -> 0x006f, TRY_LEAVE, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x006f, blocks: (B:50:0x0068, B:52:0x00da, B:54:0x00e0, B:55:0x00ea), top: B:49:0x0068 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0117 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00b6  */
        /* JADX WARN: Type inference failed for: r13v0, types: [j0.h, q0.p] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.jvm.internal.f0] */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 520
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, g gVar, l lVar, l lVar2, l lVar3, q qVar) {
        super(2, gVar);
        this.f3540c = pointerInputScope;
        this.d = qVar;
        this.f3541f = lVar;
        this.f3542g = lVar2;
        this.f3543h = lVar3;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.f3540c, gVar, this.f3541f, this.f3542g, this.f3543h, this.d);
        tapGestureDetectorKt$detectTapGestures$2.f3539b = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3538a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            d0 d0Var = (d0) this.f3539b;
            PointerInputScope pointerInputScope = this.f3540c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(d0Var, this.d, this.f3541f, this.f3542g, this.f3543h, new PressGestureScopeImpl(pointerInputScope), null);
            this.f3538a = 1;
            if (ForEachGestureKt.b(pointerInputScope, anonymousClass1, this) == aVar) {
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
