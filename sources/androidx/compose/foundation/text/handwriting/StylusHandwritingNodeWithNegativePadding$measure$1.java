package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class StylusHandwritingNodeWithNegativePadding$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f6287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingNodeWithNegativePadding$measure$1(int i2, int i3, Placeable placeable) {
        super(1);
        this.f6287a = placeable;
        this.f6288b = i2;
        this.f6289c = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f6287a, -this.f6288b, -this.f6289c, 0.0f);
        return b0.f30125a;
    }
}
