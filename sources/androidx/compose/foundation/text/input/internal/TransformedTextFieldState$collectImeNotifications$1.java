package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldState;
import h0.g;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", l = {679}, m = "collectImeNotifications")
/* loaded from: classes.dex */
public final class TransformedTextFieldState$collectImeNotifications$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public TextFieldState.NotifyImeListener f6661a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6663c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$1(TransformedTextFieldState transformedTextFieldState, g gVar) {
        super(gVar);
        this.f6663c = transformedTextFieldState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f6662b = obj;
        this.d |= Integer.MIN_VALUE;
        this.f6663c.b(null, this);
        return i0.a.f30806a;
    }
}
