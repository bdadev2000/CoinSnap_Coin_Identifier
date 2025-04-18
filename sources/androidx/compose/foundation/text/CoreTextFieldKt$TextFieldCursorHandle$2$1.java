package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
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
@e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1", f = "CoreTextField.kt", l = {1198}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoreTextFieldKt$TextFieldCursorHandle$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5943a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f5945c;
    public final /* synthetic */ TextFieldSelectionManager d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f5946a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f5947b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f5948c;
        public final /* synthetic */ TextFieldSelectionManager d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1202}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00231 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f5949a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f5950b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TextDragObserver f5951c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00231(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, g gVar) {
                super(2, gVar);
                this.f5950b = pointerInputScope;
                this.f5951c = textDragObserver;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00231(this.f5950b, this.f5951c, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00231) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f5949a;
                if (i2 == 0) {
                    q.m(obj);
                    this.f5949a = 1;
                    if (LongPressTextDragObserverKt.a(this.f5950b, this.f5951c, this) == aVar) {
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
        @e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1205}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f5952a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f5953b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionManager f5954c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C00241 extends r implements l {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionManager f5955a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00241(TextFieldSelectionManager textFieldSelectionManager) {
                    super(1);
                    this.f5955a = textFieldSelectionManager;
                }

                @Override // q0.l
                public final Object invoke(Object obj) {
                    long j2 = ((Offset) obj).f14913a;
                    this.f5955a.s();
                    return b0.f30125a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, g gVar) {
                super(2, gVar);
                this.f5953b = pointerInputScope;
                this.f5954c = textFieldSelectionManager;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass2(this.f5953b, this.f5954c, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f5952a;
                if (i2 == 0) {
                    q.m(obj);
                    C00241 c00241 = new C00241(this.f5954c);
                    this.f5952a = 1;
                    if (TapGestureDetectorKt.f(this.f5953b, null, c00241, this, 7) == aVar) {
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
        public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, g gVar) {
            super(2, gVar);
            this.f5947b = pointerInputScope;
            this.f5948c = textDragObserver;
            this.d = textFieldSelectionManager;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5947b, this.f5948c, this.d, gVar);
            anonymousClass1.f5946a = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((d0) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            q.m(obj);
            d0 d0Var = (d0) this.f5946a;
            PointerInputScope pointerInputScope = this.f5947b;
            kotlin.jvm.internal.e.v(d0Var, null, 4, new C00231(pointerInputScope, this.f5948c, null), 1);
            kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass2(pointerInputScope, this.d, null), 1);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$2$1(TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, g gVar) {
        super(2, gVar);
        this.f5945c = textDragObserver;
        this.d = textFieldSelectionManager;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        CoreTextFieldKt$TextFieldCursorHandle$2$1 coreTextFieldKt$TextFieldCursorHandle$2$1 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(this.f5945c, this.d, gVar);
        coreTextFieldKt$TextFieldCursorHandle$2$1.f5944b = obj;
        return coreTextFieldKt$TextFieldCursorHandle$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$2$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f5943a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f5944b, this.f5945c, this.d, null);
            this.f5943a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
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
