package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 f7201a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        return OffsetKt.c(j2) ? new AnimationVector2D(Offset.g(j2), Offset.h(j2)) : SelectionMagnifierKt.f7198a;
    }
}
