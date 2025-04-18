package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ClickableTextKt$ClickableText$5$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f5740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5741b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$5$1(MutableState mutableState, l lVar) {
        super(1);
        this.f5740a = mutableState;
        this.f5741b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        this.f5740a.setValue(textLayoutResult);
        this.f5741b.invoke(textLayoutResult);
        return b0.f30125a;
    }
}
