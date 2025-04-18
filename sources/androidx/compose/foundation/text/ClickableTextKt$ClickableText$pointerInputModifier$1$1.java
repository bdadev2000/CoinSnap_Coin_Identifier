package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", f = "ClickableText.kt", l = {Opcodes.INVOKESTATIC}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ClickableTextKt$ClickableText$pointerInputModifier$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5752a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f5754c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableState f5755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f5756g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1$1", f = "ClickableText.kt", l = {Opcodes.DRETURN}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f5757a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f5758b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f5759c;
        public final /* synthetic */ MutableState d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00211 extends r implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f0 f5760a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f5761b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MutableState f5762c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00211(f0 f0Var, l lVar, MutableState mutableState) {
                super(1);
                this.f5760a = f0Var;
                this.f5761b = lVar;
                this.f5762c = mutableState;
            }

            @Override // q0.l
            public final Object invoke(Object obj) {
                Integer a2 = ClickableTextKt.a(this.f5762c, ((Offset) obj).f14913a);
                f0 f0Var = this.f5760a;
                if (!p0.a.g(f0Var.f30930a, a2)) {
                    f0Var.f30930a = a2;
                    this.f5761b.invoke(a2);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, l lVar, MutableState mutableState, g gVar) {
            super(2, gVar);
            this.f5758b = pointerInputScope;
            this.f5759c = lVar;
            this.d = mutableState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f5758b, this.f5759c, this.d, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f5757a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                ?? obj2 = new Object();
                PointerEventPass pointerEventPass = PointerEventPass.f15573b;
                C00211 c00211 = new C00211(obj2, this.f5759c, this.d);
                this.f5757a = 1;
                Object J = p0.a.J(new PointerMoveDetectorKt$detectMoves$2(this.f5758b, pointerEventPass, c00211, null), this);
                if (J != aVar) {
                    J = b0Var;
                }
                if (J == aVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f5763a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState f5764b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState mutableState, l lVar) {
            super(1);
            this.f5763a = lVar;
            this.f5764b = mutableState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Integer a2 = ClickableTextKt.a(this.f5764b, ((Offset) obj).f14913a);
            if (a2 != null) {
                this.f5763a.invoke(a2);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$pointerInputModifier$1$1(d0 d0Var, l lVar, MutableState mutableState, l lVar2, g gVar) {
        super(2, gVar);
        this.f5754c = d0Var;
        this.d = lVar;
        this.f5755f = mutableState;
        this.f5756g = lVar2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ClickableTextKt$ClickableText$pointerInputModifier$1$1 clickableTextKt$ClickableText$pointerInputModifier$1$1 = new ClickableTextKt$ClickableText$pointerInputModifier$1$1(this.f5754c, this.d, this.f5755f, this.f5756g, gVar);
        clickableTextKt$ClickableText$pointerInputModifier$1$1.f5753b = obj;
        return clickableTextKt$ClickableText$pointerInputModifier$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ClickableTextKt$ClickableText$pointerInputModifier$1$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f5752a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f5753b;
            l lVar = this.d;
            MutableState mutableState = this.f5755f;
            kotlin.jvm.internal.e.v(this.f5754c, null, 0, new AnonymousClass1(pointerInputScope, lVar, mutableState, null), 3);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(mutableState, this.f5756g);
            this.f5752a = 1;
            if (TapGestureDetectorKt.f(pointerInputScope, null, anonymousClass2, this, 7) == aVar) {
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
