package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class BasicTextKt$LayoutWithLinksAndInlineContent$5$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f5704a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$5$1(MutableState mutableState) {
        super(0);
        this.f5704a = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        MutableState mutableState = this.f5704a;
        if (mutableState != null) {
            return (List) mutableState.getValue();
        }
        return null;
    }
}
