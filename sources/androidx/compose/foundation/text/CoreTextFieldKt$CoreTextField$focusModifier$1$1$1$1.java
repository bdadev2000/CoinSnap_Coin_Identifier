package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {340}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequester f5888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5889c;
    public final /* synthetic */ LegacyTextFieldState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextLayoutResultProxy f5890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5891g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, TextLayoutResultProxy textLayoutResultProxy, OffsetMapping offsetMapping, g gVar) {
        super(2, gVar);
        this.f5888b = bringIntoViewRequester;
        this.f5889c = textFieldValue;
        this.d = legacyTextFieldState;
        this.f5890f = textLayoutResultProxy;
        this.f5891g = offsetMapping;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.f5888b, this.f5889c, this.d, this.f5890f, this.f5891g, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        long a2;
        Rect rect;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f5887a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            TextDelegate textDelegate = this.d.f6021a;
            TextLayoutResult textLayoutResult = this.f5890f.f6210a;
            this.f5887a = 1;
            int b2 = this.f5891g.b(TextRange.e(this.f5889c.f17362b));
            if (b2 < textLayoutResult.f17046a.f17038a.f16880a.length()) {
                rect = textLayoutResult.b(b2);
            } else if (b2 != 0) {
                rect = textLayoutResult.b(b2 - 1);
            } else {
                a2 = TextFieldDelegateKt.a(textDelegate.f6108b, textDelegate.f6111g, textDelegate.f6112h, TextFieldDelegateKt.f6131a, 1);
                rect = new Rect(0.0f, 0.0f, 1.0f, (int) (a2 & 4294967295L));
            }
            Object a3 = this.f5888b.a(rect, this);
            if (a3 != aVar) {
                a3 = b0Var;
            }
            if (a3 == aVar) {
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
