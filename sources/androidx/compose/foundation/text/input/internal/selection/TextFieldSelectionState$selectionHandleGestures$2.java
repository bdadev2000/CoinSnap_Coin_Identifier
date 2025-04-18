package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import b1.d0;
import com.facebook.internal.FacebookRequestErrorClassification;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$selectionHandleGestures$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f6840c;
    public final /* synthetic */ boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", l = {391}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6841a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6842b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, g gVar) {
            super(2, gVar);
            this.f6842b = textFieldSelectionState;
            this.f6843c = pointerInputScope;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f6842b, this.f6843c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f6841a;
            if (i2 == 0) {
                q.m(obj);
                this.f6841a = 1;
                if (this.f6842b.l(this.f6843c, this) == aVar) {
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
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", l = {394}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6844a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6845b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6846c;
        public final /* synthetic */ boolean d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C00292 extends r implements q0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f6849a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00292(TextFieldSelectionState textFieldSelectionState) {
                super(0);
                this.f6849a = textFieldSelectionState;
            }

            @Override // q0.a
            public final Object invoke() {
                this.f6849a.e();
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, g gVar, boolean z2) {
            super(2, gVar);
            this.f6845b = pointerInputScope;
            this.f6846c = textFieldSelectionState;
            this.d = z2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f6846c, this.f6845b, gVar, this.d);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f6844a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                final boolean z2 = this.d;
                final TextFieldSelectionState textFieldSelectionState = this.f6846c;
                TapOnPosition tapOnPosition = new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                    @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                    public final void a() {
                        TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                        LayoutCoordinates s2 = textFieldSelectionState2.s();
                        textFieldSelectionState2.f6724m.setValue(new Offset(s2 != null ? s2.M(0L) : 9205357640488583168L));
                        boolean z3 = z2;
                        textFieldSelectionState2.C(z3 ? Handle.f5965b : Handle.f5966c, SelectionHandlesKt.a(textFieldSelectionState2.q(z3)));
                    }
                };
                C00292 c00292 = new C00292(textFieldSelectionState);
                this.f6844a = 1;
                Object b2 = ForEachGestureKt.b(this.f6845b, new PressDownGestureKt$detectPressDownGesture$2(tapOnPosition, c00292, null), this);
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
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", l = {FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6850a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6851b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6852c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, g gVar, boolean z2) {
            super(2, gVar);
            this.f6851b = textFieldSelectionState;
            this.f6852c = pointerInputScope;
            this.d = z2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass3(this.f6851b, this.f6852c, gVar, this.d);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f6850a;
            if (i2 == 0) {
                q.m(obj);
                this.f6850a = 1;
                if (TextFieldSelectionState.b(this.f6851b, this.f6852c, this, this.d) == aVar) {
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
    public TextFieldSelectionState$selectionHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, g gVar, boolean z2) {
        super(2, gVar);
        this.f6839b = textFieldSelectionState;
        this.f6840c = pointerInputScope;
        this.d = z2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldSelectionState$selectionHandleGestures$2 textFieldSelectionState$selectionHandleGestures$2 = new TextFieldSelectionState$selectionHandleGestures$2(this.f6839b, this.f6840c, gVar, this.d);
        textFieldSelectionState$selectionHandleGestures$2.f6838a = obj;
        return textFieldSelectionState$selectionHandleGestures$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionState$selectionHandleGestures$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f6838a;
        TextFieldSelectionState textFieldSelectionState = this.f6839b;
        PointerInputScope pointerInputScope = this.f6840c;
        kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass1(textFieldSelectionState, pointerInputScope, null), 1);
        boolean z2 = this.d;
        kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass2(textFieldSelectionState, pointerInputScope, null, z2), 1);
        return kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass3(textFieldSelectionState, pointerInputScope, null, z2), 1);
    }
}
