package androidx.compose.material3;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f9855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f9857c;

    @e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {Opcodes.L2D}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9858a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetState f9859b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SheetState sheetState, g gVar) {
            super(2, gVar);
            this.f9859b = sheetState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f9859b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9858a;
            if (i2 == 0) {
                q.m(obj);
                this.f9858a = 1;
                if (this.f9859b.c(this) == aVar) {
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

    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SheetState f9860a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0.a f9861b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SheetState sheetState, q0.a aVar) {
            super(1);
            this.f9860a = sheetState;
            this.f9861b = aVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            if (!this.f9860a.d()) {
                this.f9861b.invoke();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1(SheetState sheetState, q0.a aVar, d0 d0Var) {
        super(0);
        this.f9855a = sheetState;
        this.f9856b = d0Var;
        this.f9857c = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        SheetState sheetState = this.f9855a;
        if (((Boolean) sheetState.f11199c.d.invoke(SheetValue.f11206a)).booleanValue()) {
            kotlin.jvm.internal.e.v(this.f9856b, null, 0, new AnonymousClass1(sheetState, null), 3).g0(new AnonymousClass2(sheetState, this.f9857c));
        }
        return b0.f30125a;
    }
}
