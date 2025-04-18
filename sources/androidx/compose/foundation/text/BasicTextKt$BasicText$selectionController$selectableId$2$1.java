package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class BasicTextKt$BasicText$selectionController$selectableId$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionRegistrar f5699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$selectionController$selectableId$2$1(SelectionRegistrar selectionRegistrar) {
        super(0);
        this.f5699a = selectionRegistrar;
    }

    @Override // q0.a
    public final Object invoke() {
        return Long.valueOf(this.f5699a.a());
    }
}
