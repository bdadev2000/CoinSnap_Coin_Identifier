package androidx.compose.foundation.text;

import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f6195a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(0);
        this.f6195a = textFieldScrollerPosition;
    }

    @Override // q0.a
    public final Object invoke() {
        return Boolean.valueOf(this.f6195a.f6198a.c() > 0.0f);
    }
}
