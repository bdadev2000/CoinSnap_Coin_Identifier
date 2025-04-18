package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextAnnotatedStringNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f6986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnotatedStringNode$measure$1(Placeable placeable) {
        super(1);
        this.f6986a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f6986a, 0, 0, 0.0f);
        return b0.f30125a;
    }
}
