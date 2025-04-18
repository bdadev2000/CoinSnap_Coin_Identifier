package androidx.compose.material3.internal;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$anchoredDraggable$1 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ d0 f12789a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f12790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12791c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {Opcodes.RETURN}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f12792a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState f12793b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f12794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState anchoredDraggableState, float f2, g gVar) {
            super(2, gVar);
            this.f12793b = anchoredDraggableState;
            this.f12794c = f2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f12793b, this.f12794c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f12792a;
            if (i2 == 0) {
                kotlin.jvm.internal.q.m(obj);
                this.f12792a = 1;
                if (this.f12793b.j(this.f12794c, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$anchoredDraggable$1(AnchoredDraggableState anchoredDraggableState, g gVar) {
        super(3, gVar);
        this.f12791c = anchoredDraggableState;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        AnchoredDraggableKt$anchoredDraggable$1 anchoredDraggableKt$anchoredDraggable$1 = new AnchoredDraggableKt$anchoredDraggable$1(this.f12791c, (g) obj3);
        anchoredDraggableKt$anchoredDraggable$1.f12789a = (d0) obj;
        anchoredDraggableKt$anchoredDraggable$1.f12790b = floatValue;
        b0 b0Var = b0.f30125a;
        anchoredDraggableKt$anchoredDraggable$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        kotlin.jvm.internal.q.m(obj);
        kotlin.jvm.internal.e.v(this.f12789a, null, 0, new AnonymousClass1(this.f12791c, this.f12790b, null), 3);
        return b0.f30125a;
    }
}
