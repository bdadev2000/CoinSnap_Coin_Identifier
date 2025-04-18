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
/* loaded from: classes4.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f9862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SheetState f9863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f9864c;

    @e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {Opcodes.LCMP}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9865a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetState f9866b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f9867c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SheetState sheetState, float f2, g gVar) {
            super(2, gVar);
            this.f9866b = sheetState;
            this.f9867c = f2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f9866b, this.f9867c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9865a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                this.f9865a = 1;
                Object j2 = this.f9866b.f11199c.j(this.f9867c, this);
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

    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SheetState f9868a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0.a f9869b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SheetState sheetState, q0.a aVar) {
            super(1);
            this.f9868a = sheetState;
            this.f9869b = aVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            if (!this.f9868a.d()) {
                this.f9869b.invoke();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1(SheetState sheetState, q0.a aVar, d0 d0Var) {
        super(1);
        this.f9862a = d0Var;
        this.f9863b = sheetState;
        this.f9864c = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        SheetState sheetState = this.f9863b;
        kotlin.jvm.internal.e.v(this.f9862a, null, 0, new AnonymousClass1(sheetState, floatValue, null), 3).g0(new AnonymousClass2(sheetState, this.f9864c));
        return b0.f30125a;
    }
}
