package androidx.compose.material3;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f8006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SheetState f8007b;

    @e(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1", f = "BottomSheetScaffold.kt", l = {320}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f8008a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetState f8009b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SheetState sheetState, g gVar) {
            super(2, gVar);
            this.f8009b = sheetState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f8009b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f8008a;
            if (i2 == 0) {
                q.m(obj);
                this.f8008a = 1;
                if (this.f8009b.e(this) == aVar) {
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
    public BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2(SheetState sheetState, d0 d0Var) {
        super(0);
        this.f8006a = d0Var;
        this.f8007b = sheetState;
    }

    @Override // q0.a
    public final Object invoke() {
        kotlin.jvm.internal.e.v(this.f8006a, null, 0, new AnonymousClass1(this.f8007b, null), 3);
        return Boolean.TRUE;
    }
}
