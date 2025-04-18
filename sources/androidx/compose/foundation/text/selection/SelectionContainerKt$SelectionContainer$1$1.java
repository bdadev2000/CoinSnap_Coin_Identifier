package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SelectionContainerKt$SelectionContainer$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f7103a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$1$1(MutableState mutableState) {
        super(1);
        this.f7103a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f7103a.setValue((Selection) obj);
        return b0.f30125a;
    }
}
