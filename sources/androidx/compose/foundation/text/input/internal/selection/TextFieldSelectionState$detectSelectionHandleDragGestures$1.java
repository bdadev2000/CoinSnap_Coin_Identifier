package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import h0.g;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {980}, m = "detectSelectionHandleDragGestures")
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public TextFieldSelectionState f6785a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f6786b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f6787c;
    public Handle d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6789g;

    /* renamed from: h, reason: collision with root package name */
    public int f6790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, g gVar) {
        super(gVar);
        this.f6789g = textFieldSelectionState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f6788f = obj;
        this.f6790h |= Integer.MIN_VALUE;
        return TextFieldSelectionState.b(this.f6789g, null, this, false);
    }
}
