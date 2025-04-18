package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLayoutResult;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTextKt$LayoutWithLinksAndInlineContent$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$2$1(TextLinkScope textLinkScope, l lVar) {
        super(1);
        this.f5700a = textLinkScope;
        this.f5701b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        TextLinkScope textLinkScope = this.f5700a;
        if (textLinkScope != null) {
            textLinkScope.f6214b.setValue(textLayoutResult);
        }
        l lVar = this.f5701b;
        if (lVar != null) {
            lVar.invoke(textLayoutResult);
        }
        return b0.f30125a;
    }
}
