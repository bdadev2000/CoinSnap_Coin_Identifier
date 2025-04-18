package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f5721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1(MutableState mutableState) {
        super(1);
        this.f5721a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        MutableState mutableState = this.f5721a;
        if (mutableState != null) {
            mutableState.setValue(list);
        }
        return b0.f30125a;
    }
}
