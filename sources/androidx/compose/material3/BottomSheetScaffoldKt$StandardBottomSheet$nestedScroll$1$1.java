package androidx.compose.material3;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f8026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SheetState f8027b;

    @e(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1", f = "BottomSheetScaffold.kt", l = {236}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f8028a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetState f8029b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f8030c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SheetState sheetState, float f2, g gVar) {
            super(2, gVar);
            this.f8029b = sheetState;
            this.f8030c = f2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f8029b, this.f8030c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f8028a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                this.f8028a = 1;
                Object j2 = this.f8029b.f11199c.j(this.f8030c, this);
                if (j2 != aVar) {
                    j2 = b0Var;
                }
                if (j2 == aVar) {
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
    public BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1(SheetState sheetState, d0 d0Var) {
        super(1);
        this.f8026a = d0Var;
        this.f8027b = sheetState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        kotlin.jvm.internal.e.v(this.f8026a, null, 0, new AnonymousClass1(this.f8027b, ((Number) obj).floatValue(), null), 3);
        return b0.f30125a;
    }
}
