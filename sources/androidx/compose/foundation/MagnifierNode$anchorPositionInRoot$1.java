package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MagnifierNode$anchorPositionInRoot$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MagnifierNode f2779a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$anchorPositionInRoot$1(MagnifierNode magnifierNode) {
        super(0);
        this.f2779a = magnifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f2779a.B.getValue();
        return new Offset(layoutCoordinates != null ? layoutCoordinates.e0(0L) : 9205357640488583168L);
    }
}
