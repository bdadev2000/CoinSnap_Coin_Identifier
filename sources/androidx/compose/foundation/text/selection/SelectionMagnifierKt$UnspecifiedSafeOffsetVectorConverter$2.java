package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 f7202a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return new Offset(OffsetKt.a(animationVector2D.f2040a, animationVector2D.f2041b));
    }
}
