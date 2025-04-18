package androidx.compose.foundation.text.input.internal.selection;

import h0.g;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {614}, m = "detectCursorHandleDragGestures")
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectCursorHandleDragGestures$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public TextFieldSelectionState f6768a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f6769b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f6770c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6771f;

    /* renamed from: g, reason: collision with root package name */
    public int f6772g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, g gVar) {
        super(gVar);
        this.f6771f = textFieldSelectionState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f6772g |= Integer.MIN_VALUE;
        return TextFieldSelectionState.a(this.f6771f, null, this);
    }
}
