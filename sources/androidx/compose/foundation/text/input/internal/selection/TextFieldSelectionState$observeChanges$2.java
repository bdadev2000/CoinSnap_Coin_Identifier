package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.TextRange;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TextFieldSelectionState$observeChanges$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6828b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$1", f = "TextFieldSelectionState.kt", l = {424}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6829a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, g gVar) {
            super(2, gVar);
            this.f6830b = textFieldSelectionState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f6830b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r6.f30268c == r4) goto L16;
         */
        /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.internal.d0, java.lang.Object] */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r8.f6829a
                d0.b0 r2 = d0.b0.f30125a
                r3 = 1
                if (r1 == 0) goto L17
                if (r1 != r3) goto Lf
                kotlin.jvm.internal.q.m(r9)
                goto L68
            Lf:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L17:
                kotlin.jvm.internal.q.m(r9)
                r8.f6829a = r3
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r9 = r8.f6830b
                r9.getClass()
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$2 r1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$2
                r1.<init>(r9)
                e1.j r1 = androidx.compose.runtime.SnapshotStateKt.l(r1)
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 r4 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3.f6834a
                r5 = 2
                kotlin.jvm.internal.e.g(r5, r4)
                e1.m r5 = e1.m.f30304a
                boolean r6 = r1 instanceof e1.g
                if (r6 == 0) goto L42
                r6 = r1
                e1.g r6 = (e1.g) r6
                q0.l r7 = r6.f30267b
                if (r7 != r5) goto L42
                q0.p r5 = r6.f30268c
                if (r5 != r4) goto L42
                goto L48
            L42:
                e1.g r5 = new e1.g
                r5.<init>(r1, r4)
                r1 = r5
            L48:
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
                r4.<init>()
                kotlin.jvm.internal.d0 r9 = new kotlin.jvm.internal.d0
                r9.<init>()
                e1.w r5 = new e1.w
                r5.<init>(r9, r3, r4)
                java.lang.Object r9 = r1.collect(r5, r8)
                i0.a r1 = i0.a.f30806a
                if (r9 != r1) goto L60
                goto L61
            L60:
                r9 = r2
            L61:
                if (r9 != r0) goto L64
                goto L65
            L64:
                r9 = r2
            L65:
                if (r9 != r0) goto L68
                return r0
            L68:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$2", f = "TextFieldSelectionState.kt", l = {425}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6831a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6832b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, g gVar) {
            super(2, gVar);
            this.f6832b = textFieldSelectionState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f6832b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f6831a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                this.f6831a = 1;
                final TextFieldSelectionState textFieldSelectionState = this.f6832b;
                textFieldSelectionState.getClass();
                Object collect = SnapshotStateKt.l(new TextFieldSelectionState$observeTextToolbarVisibility$2(textFieldSelectionState)).collect(new e1.i() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$3
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        Rect rect = (Rect) obj2;
                        boolean g2 = p0.a.g(rect, Rect.e);
                        TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                        if (g2) {
                            textFieldSelectionState2.u();
                        } else {
                            TextToolbar textToolbar = textFieldSelectionState2.f6720i;
                            if (textToolbar != null) {
                                TransformedTextFieldState transformedTextFieldState = textFieldSelectionState2.f6714a;
                                textToolbar.a(rect, !(!TextRange.c(transformedTextFieldState.d().f6298b) && !textFieldSelectionState2.f6718g) ? null : new TextFieldSelectionState$showTextToolbar$$inlined$menuItem$1(textFieldSelectionState2, textFieldSelectionState2), !textFieldSelectionState2.d() ? null : new TextFieldSelectionState$showTextToolbar$$inlined$menuItem$2(textFieldSelectionState2, textFieldSelectionState2), (TextRange.c(transformedTextFieldState.d().f6298b) || !textFieldSelectionState2.d || textFieldSelectionState2.e || textFieldSelectionState2.f6718g) ? null : new TextFieldSelectionState$showTextToolbar$$inlined$menuItem$3(textFieldSelectionState2, textFieldSelectionState2), TextRange.d(transformedTextFieldState.d().f6298b) != transformedTextFieldState.d().f6297a.length() ? new TextFieldSelectionState$showTextToolbar$$inlined$menuItem$4(textFieldSelectionState2, textFieldSelectionState2) : null);
                            }
                        }
                        return b0.f30125a;
                    }
                }, this);
                if (collect != aVar) {
                    collect = b0Var;
                }
                if (collect == aVar) {
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
    public TextFieldSelectionState$observeChanges$2(TextFieldSelectionState textFieldSelectionState, g gVar) {
        super(2, gVar);
        this.f6828b = textFieldSelectionState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldSelectionState$observeChanges$2 textFieldSelectionState$observeChanges$2 = new TextFieldSelectionState$observeChanges$2(this.f6828b, gVar);
        textFieldSelectionState$observeChanges$2.f6827a = obj;
        return textFieldSelectionState$observeChanges$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionState$observeChanges$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f6827a;
        TextFieldSelectionState textFieldSelectionState = this.f6828b;
        kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(textFieldSelectionState, null), 3);
        return kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(textFieldSelectionState, null), 3);
    }
}
