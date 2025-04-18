package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f8002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SheetState f8003b;

    @e(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1", f = "BottomSheetScaffold.kt", l = {311}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f8004a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetState f8005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SheetState sheetState, g gVar) {
            super(2, gVar);
            this.f8005b = sheetState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f8005b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f8004a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                this.f8004a = 1;
                SheetValue sheetValue = SheetValue.f11207b;
                AnchoredDraggableState anchoredDraggableState = this.f8005b.f11199c;
                Object d = AnchoredDraggableKt.d(anchoredDraggableState, sheetValue, anchoredDraggableState.f12829l.c(), this);
                if (d != aVar) {
                    d = b0Var;
                }
                if (d == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1(SheetState sheetState, d0 d0Var) {
        super(0);
        this.f8002a = d0Var;
        this.f8003b = sheetState;
    }

    @Override // q0.a
    public final Object invoke() {
        kotlin.jvm.internal.e.v(this.f8002a, null, 0, new AnonymousClass1(this.f8003b, null), 3);
        return Boolean.TRUE;
    }
}
