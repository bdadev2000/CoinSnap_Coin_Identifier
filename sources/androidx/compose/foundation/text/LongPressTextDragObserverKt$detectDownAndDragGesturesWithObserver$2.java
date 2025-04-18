package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f6049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f6050c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {Opcodes.AASTORE}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6051a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6052b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f6053c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, g gVar) {
            super(2, gVar);
            this.f6052b = pointerInputScope;
            this.f6053c = textDragObserver;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f6052b, this.f6053c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f6051a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                this.f6051a = 1;
                Object b2 = ForEachGestureKt.b(this.f6052b, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.f6053c, null), this);
                if (b2 != aVar) {
                    b2 = b0Var;
                }
                if (b2 == aVar) {
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
    @e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {Opcodes.SASTORE}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6054a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6055b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f6056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, g gVar) {
            super(2, gVar);
            this.f6055b = pointerInputScope;
            this.f6056c = textDragObserver;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f6055b, this.f6056c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f6054a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                PointerInputScope pointerInputScope = this.f6055b;
                this.f6054a = 1;
                TextDragObserver textDragObserver = this.f6056c;
                Object f2 = DragGestureDetectorKt.f(pointerInputScope, new LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(textDragObserver), this);
                if (f2 != aVar) {
                    f2 = b0Var;
                }
                if (f2 == aVar) {
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
    public LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, g gVar) {
        super(2, gVar);
        this.f6049b = pointerInputScope;
        this.f6050c = textDragObserver;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(this.f6049b, this.f6050c, gVar);
        longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2.f6048a = obj;
        return longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f6048a;
        PointerInputScope pointerInputScope = this.f6049b;
        TextDragObserver textDragObserver = this.f6050c;
        kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass1(pointerInputScope, textDragObserver, null), 1);
        return kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass2(pointerInputScope, textDragObserver, null), 1);
    }
}
