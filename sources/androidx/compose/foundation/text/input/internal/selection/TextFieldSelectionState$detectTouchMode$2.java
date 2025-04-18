package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", l = {455}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TextFieldSelectionState$detectTouchMode$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6821a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTouchMode$2(TextFieldSelectionState textFieldSelectionState, g gVar) {
        super(gVar);
        this.f6823c = textFieldSelectionState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldSelectionState$detectTouchMode$2 textFieldSelectionState$detectTouchMode$2 = new TextFieldSelectionState$detectTouchMode$2(this.f6823c, gVar);
        textFieldSelectionState$detectTouchMode$2.f6822b = obj;
        return textFieldSelectionState$detectTouchMode$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionState$detectTouchMode$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:5:0x0037). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r6.f6821a
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r6.f6822b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r7)
            r3 = r1
            r1 = r0
            r0 = r6
            goto L37
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kotlin.jvm.internal.q.m(r7)
            java.lang.Object r7 = r6.f6822b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            r1 = r7
            r7 = r6
        L25:
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.f15572a
            r7.f6822b = r1
            r7.f6821a = r2
            java.lang.Object r3 = r1.L1(r3, r7)
            if (r3 != r0) goto L32
            return r0
        L32:
            r5 = r0
            r0 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L37:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            boolean r7 = androidx.compose.foundation.text.selection.SelectionGesturesKt.h(r7)
            r7 = r7 ^ r2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = r0.f6823c
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = r4.f6722k
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r4.setValue(r7)
            r7 = r0
            r0 = r1
            r1 = r3
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
