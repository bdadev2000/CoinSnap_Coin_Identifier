package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
final class ModalBottomSheetKt$ModalBottomSheet$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f9813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Animatable f9815c;
    public final /* synthetic */ q0.a d;

    @e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", l = {Opcodes.IF_ICMPLT}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9816a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animatable f9817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Animatable animatable, g gVar) {
            super(2, gVar);
            this.f9817b = animatable;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f9817b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9816a;
            if (i2 == 0) {
                q.m(obj);
                Animatable animatable = this.f9817b;
                Float f2 = new Float(0.0f);
                this.f9816a = 1;
                if (Animatable.c(animatable, f2, null, null, null, this, 14) == aVar) {
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

    @e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", l = {Opcodes.IF_ICMPGE}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9818a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetState f9819b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SheetState sheetState, g gVar) {
            super(2, gVar);
            this.f9819b = sheetState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f9819b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9818a;
            if (i2 == 0) {
                q.m(obj);
                this.f9818a = 1;
                if (this.f9819b.e(this) == aVar) {
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

    @e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", l = {Opcodes.IF_ICMPLE}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9820a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetState f9821b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SheetState sheetState, g gVar) {
            super(2, gVar);
            this.f9821b = sheetState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass3(this.f9821b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9820a;
            if (i2 == 0) {
                q.m(obj);
                this.f9820a = 1;
                if (this.f9821b.c(this) == aVar) {
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

    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass4 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f9822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(q0.a aVar) {
            super(1);
            this.f9822a = aVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            this.f9822a.invoke();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$2$1(SheetState sheetState, d0 d0Var, Animatable animatable, q0.a aVar) {
        super(0);
        this.f9813a = sheetState;
        this.f9814b = d0Var;
        this.f9815c = animatable;
        this.d = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        SheetState sheetState = this.f9813a;
        SheetValue b2 = sheetState.b();
        SheetValue sheetValue = SheetValue.f11207b;
        d0 d0Var = this.f9814b;
        if (b2 == sheetValue && sheetState.f11199c.e().c(SheetValue.f11208c)) {
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(this.f9815c, null), 3);
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(sheetState, null), 3);
        } else {
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass3(sheetState, null), 3).g0(new AnonymousClass4(this.d));
        }
        return b0.f30125a;
    }
}
