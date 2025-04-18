package androidx.compose.foundation.text;

import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTextKt$LayoutWithLinksAndInlineContent$4$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5703a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$4$1(TextLinkScope textLinkScope) {
        super(0);
        this.f5703a = textLinkScope;
    }

    @Override // q0.a
    public final Object invoke() {
        TextLinkScope textLinkScope = this.f5703a;
        return Boolean.valueOf(textLinkScope != null ? ((Boolean) new TextLinkScope$shouldMeasureLinks$1(textLinkScope).invoke()).booleanValue() : false);
    }
}
