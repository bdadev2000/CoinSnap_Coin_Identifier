package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class TextFieldTextLayoutModifierNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f6643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldTextLayoutModifierNode$measure$1(Placeable placeable) {
        super(1);
        this.f6643a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f6643a, 0, 0, 0.0f);
        return b0.f30125a;
    }
}
