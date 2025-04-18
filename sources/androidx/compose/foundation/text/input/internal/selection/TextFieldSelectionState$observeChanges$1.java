package androidx.compose.foundation.text.input.internal.selection;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {423}, m = "observeChanges")
/* loaded from: classes2.dex */
public final class TextFieldSelectionState$observeChanges$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public TextFieldSelectionState f6824a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6826c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$observeChanges$1(TextFieldSelectionState textFieldSelectionState, g gVar) {
        super(gVar);
        this.f6826c = textFieldSelectionState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f6825b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f6826c.v(this);
    }
}
