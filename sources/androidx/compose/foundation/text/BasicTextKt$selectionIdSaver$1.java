package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class BasicTextKt$selectionIdSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionRegistrar f5725a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(SelectionRegistrar selectionRegistrar) {
        super(2);
        this.f5725a = selectionRegistrar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj2).longValue();
        if (SelectionRegistrarKt.a(this.f5725a, longValue)) {
            return Long.valueOf(longValue);
        }
        return null;
    }
}
