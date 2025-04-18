package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$cursorHandleGestures$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f6757c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", l = {368}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6758a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6759b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, g gVar) {
            super(2, gVar);
            this.f6759b = textFieldSelectionState;
            this.f6760c = pointerInputScope;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f6759b, this.f6760c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f6758a;
            if (i2 == 0) {
                q.m(obj);
                this.f6758a = 1;
                if (this.f6759b.l(this.f6760c, this) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", l = {371}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6761a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6762b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, g gVar) {
            super(2, gVar);
            this.f6762b = textFieldSelectionState;
            this.f6763c = pointerInputScope;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f6762b, this.f6763c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f6761a;
            if (i2 == 0) {
                q.m(obj);
                this.f6761a = 1;
                if (TextFieldSelectionState.a(this.f6762b, this.f6763c, this) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", l = {374}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass3 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6764a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6765b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6766c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 extends r implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f6767a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState) {
                super(1);
                this.f6767a = textFieldSelectionState;
            }

            @Override // q0.l
            public final Object invoke(Object obj) {
                long j2 = ((Offset) obj).f14913a;
                TextFieldSelectionState textFieldSelectionState = this.f6767a;
                TextToolbarState t2 = textFieldSelectionState.t();
                TextToolbarState textToolbarState = TextToolbarState.f6864b;
                if (t2 == textToolbarState) {
                    textToolbarState = TextToolbarState.f6863a;
                }
                textFieldSelectionState.A(textToolbarState);
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, g gVar) {
            super(2, gVar);
            this.f6765b = pointerInputScope;
            this.f6766c = textFieldSelectionState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass3(this.f6766c, this.f6765b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f6764a;
            if (i2 == 0) {
                q.m(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6766c);
                this.f6764a = 1;
                if (TapGestureDetectorKt.f(this.f6765b, null, anonymousClass1, this, 7) == aVar) {
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
    public TextFieldSelectionState$cursorHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, g gVar) {
        super(2, gVar);
        this.f6756b = textFieldSelectionState;
        this.f6757c = pointerInputScope;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldSelectionState$cursorHandleGestures$2 textFieldSelectionState$cursorHandleGestures$2 = new TextFieldSelectionState$cursorHandleGestures$2(this.f6756b, this.f6757c, gVar);
        textFieldSelectionState$cursorHandleGestures$2.f6755a = obj;
        return textFieldSelectionState$cursorHandleGestures$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionState$cursorHandleGestures$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f6755a;
        TextFieldSelectionState textFieldSelectionState = this.f6756b;
        PointerInputScope pointerInputScope = this.f6757c;
        kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass1(textFieldSelectionState, pointerInputScope, null), 1);
        kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass2(textFieldSelectionState, pointerInputScope, null), 1);
        return kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass3(textFieldSelectionState, pointerInputScope, null), 1);
    }
}
