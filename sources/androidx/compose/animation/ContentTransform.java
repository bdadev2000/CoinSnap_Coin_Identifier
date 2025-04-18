package androidx.compose.animation;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ContentTransform {

    /* renamed from: a, reason: collision with root package name */
    public final EnterTransition f1779a;

    /* renamed from: b, reason: collision with root package name */
    public final ExitTransition f1780b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f1781c;
    public SizeTransform d;

    public ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f2, SizeTransform sizeTransform) {
        this.f1779a = enterTransition;
        this.f1780b = exitTransition;
        this.f1781c = PrimitiveSnapshotStateKt.a(f2);
        this.d = sizeTransform;
    }
}
