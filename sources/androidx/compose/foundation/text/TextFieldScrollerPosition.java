package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;

@Stable
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {

    /* renamed from: f, reason: collision with root package name */
    public static final SaverKt$Saver$1 f6197f = ListSaverKt.a(TextFieldScrollerPosition$Companion$Saver$2.f6202a, TextFieldScrollerPosition$Companion$Saver$1.f6201a);

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f6198a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f6199b = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public Rect f6200c = Rect.e;
    public long d = TextRange.f17056b;
    public final ParcelableSnapshotMutableState e;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public TextFieldScrollerPosition(Orientation orientation, float f2) {
        this.f6198a = PrimitiveSnapshotStateKt.a(f2);
        this.e = SnapshotStateKt.f(orientation, SnapshotStateKt.m());
    }

    public final void a(Orientation orientation, Rect rect, int i2, int i3) {
        float f2 = i3 - i2;
        this.f6199b.n(f2);
        Rect rect2 = this.f6200c;
        float f3 = rect2.f14914a;
        float f4 = rect.f14914a;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f6198a;
        float f5 = rect.f14915b;
        if (f4 != f3 || f5 != rect2.f14915b) {
            boolean z2 = orientation == Orientation.f3394a;
            if (z2) {
                f4 = f5;
            }
            float f6 = z2 ? rect.d : rect.f14916c;
            float c2 = parcelableSnapshotMutableFloatState.c();
            float f7 = i2;
            float f8 = c2 + f7;
            parcelableSnapshotMutableFloatState.n(parcelableSnapshotMutableFloatState.c() + ((f6 <= f8 && (f4 >= c2 || f6 - f4 <= f7)) ? (f4 >= c2 || f6 - f4 > f7) ? 0.0f : f4 - c2 : f6 - f8));
            this.f6200c = rect;
        }
        parcelableSnapshotMutableFloatState.n(p0.a.z(parcelableSnapshotMutableFloatState.c(), 0.0f, f2));
    }
}
