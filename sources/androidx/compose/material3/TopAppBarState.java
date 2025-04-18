package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class TopAppBarState {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f12609a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f12610b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f12611c;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    static {
        ListSaverKt.a(TopAppBarState$Companion$Saver$2.f12613a, TopAppBarState$Companion$Saver$1.f12612a);
    }

    public TopAppBarState(float f2, float f3, float f4) {
        this.f12609a = PrimitiveSnapshotStateKt.a(f2);
        this.f12610b = PrimitiveSnapshotStateKt.a(f4);
        this.f12611c = PrimitiveSnapshotStateKt.a(f3);
    }

    public final float a() {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f12609a;
        if (parcelableSnapshotMutableFloatState.c() == 0.0f) {
            return 0.0f;
        }
        return this.f12611c.c() / parcelableSnapshotMutableFloatState.c();
    }

    public final void b(float f2) {
        this.f12611c.n(p0.a.z(f2, this.f12609a.c(), 0.0f));
    }
}
