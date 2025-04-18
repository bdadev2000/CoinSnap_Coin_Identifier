package androidx.compose.material3;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f9898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9899b;

    @e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", l = {330}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9900a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetState f9901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SheetState sheetState, g gVar) {
            super(2, gVar);
            this.f9901b = sheetState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f9901b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9900a;
            if (i2 == 0) {
                q.m(obj);
                this.f9900a = 1;
                if (this.f9901b.e(this) == aVar) {
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
    public ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3(SheetState sheetState, d0 d0Var) {
        super(0);
        this.f9898a = sheetState;
        this.f9899b = d0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        SheetState sheetState = this.f9898a;
        if (((Boolean) sheetState.f11199c.d.invoke(SheetValue.f11208c)).booleanValue()) {
            kotlin.jvm.internal.e.v(this.f9899b, null, 0, new AnonymousClass1(sheetState, null), 3);
        }
        return Boolean.TRUE;
    }
}
