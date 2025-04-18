package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;

/* loaded from: classes3.dex */
public final class SelectionMagnifierKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AnimationVector2D f7198a = new AnimationVector2D(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final TwoWayConverter f7199b = VectorConvertersKt.a(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.f7201a, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.f7202a);

    /* renamed from: c, reason: collision with root package name */
    public static final long f7200c;
    public static final SpringSpec d;

    static {
        long a2 = OffsetKt.a(0.01f, 0.01f);
        f7200c = a2;
        d = new SpringSpec(new Offset(a2), 3);
    }
}
