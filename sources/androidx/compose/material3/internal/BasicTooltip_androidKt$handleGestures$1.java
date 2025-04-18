package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import e1.i1;
import e1.m0;
import h0.g;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", l = {Opcodes.IF_ICMPGE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BasicTooltip_androidKt$handleGestures$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f12909a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TooltipState f12911c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", l = {Opcodes.IF_ICMPGT}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f12912a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12913b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f12914c;
        public final /* synthetic */ TooltipState d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", l = {Opcodes.LOOKUPSWITCH, Opcodes.RETURN, Opcodes.MULTIANEWARRAY}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00481 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public m0 f12915a;

            /* renamed from: b, reason: collision with root package name */
            public PointerEventPass f12916b;

            /* renamed from: c, reason: collision with root package name */
            public long f12917c;
            public int d;

            /* renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f12918f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ d0 f12919g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ TooltipState f12920h;

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", l = {Opcodes.GETSTATIC}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes3.dex */
            public final class C00491 extends h implements p {

                /* renamed from: a, reason: collision with root package name */
                public int f12921a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f12922b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ PointerEventPass f12923c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00491(PointerEventPass pointerEventPass, g gVar) {
                    super(gVar);
                    this.f12923c = pointerEventPass;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    C00491 c00491 = new C00491(this.f12923c, gVar);
                    c00491.f12922b = obj;
                    return c00491;
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00491) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    i0.a aVar = i0.a.f30806a;
                    int i2 = this.f12921a;
                    if (i2 == 0) {
                        q.m(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f12922b;
                        this.f12921a = 1;
                        obj = TapGestureDetectorKt.g(awaitPointerEventScope, this.f12923c, this);
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
            @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", l = {Opcodes.INVOKEINTERFACE, Opcodes.NEW, Opcodes.NEW}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public final class AnonymousClass2 extends i implements p {

                /* renamed from: a, reason: collision with root package name */
                public Throwable f12924a;

                /* renamed from: b, reason: collision with root package name */
                public int f12925b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m0 f12926c;
                public final /* synthetic */ TooltipState d;

                /* JADX INFO: Access modifiers changed from: package-private */
                @e(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1", f = "BasicTooltip.android.kt", l = {}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes2.dex */
                public final class C00501 extends i implements p {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ boolean f12927a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TooltipState f12928b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00501(TooltipState tooltipState, g gVar) {
                        super(2, gVar);
                        this.f12928b = tooltipState;
                    }

                    @Override // j0.a
                    public final g create(Object obj, g gVar) {
                        C00501 c00501 = new C00501(this.f12928b, gVar);
                        c00501.f12927a = ((Boolean) obj).booleanValue();
                        return c00501;
                    }

                    @Override // q0.p
                    public final Object invoke(Object obj, Object obj2) {
                        C00501 c00501 = (C00501) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (g) obj2);
                        b0 b0Var = b0.f30125a;
                        c00501.invokeSuspend(b0Var);
                        return b0Var;
                    }

                    @Override // j0.a
                    public final Object invokeSuspend(Object obj) {
                        i0.a aVar = i0.a.f30806a;
                        q.m(obj);
                        if (!this.f12927a) {
                            this.f12928b.dismiss();
                        }
                        return b0.f30125a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(m0 m0Var, TooltipState tooltipState, g gVar) {
                    super(2, gVar);
                    this.f12926c = m0Var;
                    this.d = tooltipState;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    return new AnonymousClass2(this.f12926c, this.d, gVar);
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    i0.a aVar = i0.a.f30806a;
                    int i2 = this.f12925b;
                    TooltipState tooltipState = this.d;
                    m0 m0Var = this.f12926c;
                    try {
                        if (i2 == 0) {
                            q.m(obj);
                            ((i1) m0Var).h(Boolean.TRUE);
                            MutatePriority mutatePriority = MutatePriority.f2813c;
                            this.f12925b = 1;
                            if (tooltipState.b(mutatePriority, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    q.m(obj);
                                    return b0.f30125a;
                                }
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th = this.f12924a;
                                q.m(obj);
                                throw th;
                            }
                            q.m(obj);
                        }
                        C00501 c00501 = new C00501(tooltipState, null);
                        this.f12925b = 2;
                        if (p0.a.D(m0Var, c00501, this) == aVar) {
                            return aVar;
                        }
                        return b0.f30125a;
                    } catch (Throwable th2) {
                        C00501 c005012 = new C00501(tooltipState, null);
                        this.f12924a = th2;
                        this.f12925b = 3;
                        if (p0.a.D(m0Var, c005012, this) == aVar) {
                            return aVar;
                        }
                        throw th2;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00481(d0 d0Var, TooltipState tooltipState, g gVar) {
                super(gVar);
                this.f12919g = d0Var;
                this.f12920h = tooltipState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                C00481 c00481 = new C00481(this.f12919g, this.f12920h, gVar);
                c00481.f12918f = obj;
                return c00481;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00481) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x00ca A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:9:0x00c6, B:11:0x00ca), top: B:7:0x0014 }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
            /* JADX WARN: Type inference failed for: r4v5, types: [e1.m0] */
            /* JADX WARN: Type inference failed for: r8v3, types: [e1.m0] */
            @Override // j0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 223
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00481.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, g gVar) {
            super(2, gVar);
            this.f12914c = pointerInputScope;
            this.d = tooltipState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12914c, this.d, gVar);
            anonymousClass1.f12913b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f12912a;
            if (i2 == 0) {
                q.m(obj);
                C00481 c00481 = new C00481((d0) this.f12913b, this.d, null);
                this.f12912a = 1;
                if (ForEachGestureKt.b(this.f12914c, c00481, this) == aVar) {
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
    public BasicTooltip_androidKt$handleGestures$1(TooltipState tooltipState, g gVar) {
        super(2, gVar);
        this.f12911c = tooltipState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        BasicTooltip_androidKt$handleGestures$1 basicTooltip_androidKt$handleGestures$1 = new BasicTooltip_androidKt$handleGestures$1(this.f12911c, gVar);
        basicTooltip_androidKt$handleGestures$1.f12910b = obj;
        return basicTooltip_androidKt$handleGestures$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltip_androidKt$handleGestures$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12909a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f12910b, this.f12911c, null);
            this.f12909a = 1;
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
