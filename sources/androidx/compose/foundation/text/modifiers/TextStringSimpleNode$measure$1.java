package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TextStringSimpleNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f7011a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$measure$1(Placeable placeable) {
        super(1);
        this.f7011a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f7011a, 0, 0, 0.0f);
        return b0.f30125a;
    }
}
