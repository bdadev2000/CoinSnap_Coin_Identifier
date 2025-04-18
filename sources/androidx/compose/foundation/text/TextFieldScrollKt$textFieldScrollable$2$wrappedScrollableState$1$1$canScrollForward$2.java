package androidx.compose.foundation.text;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f6196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(0);
        this.f6196a = textFieldScrollerPosition;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldScrollerPosition textFieldScrollerPosition = this.f6196a;
        return Boolean.valueOf(textFieldScrollerPosition.f6198a.c() < textFieldScrollerPosition.f6199b.c());
    }
}
