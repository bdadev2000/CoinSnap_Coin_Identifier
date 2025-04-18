package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class TooltipKt$TooltipBox$wrappedContent$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f12553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$wrappedContent$1$1$1(MutableState mutableState) {
        super(1);
        this.f12553a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f12553a.setValue((LayoutCoordinates) obj);
        return b0.f30125a;
    }
}
