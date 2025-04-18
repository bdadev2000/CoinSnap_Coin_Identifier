package androidx.compose.ui.text.android.selection;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes.dex */
public final class Api34SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public static final Api34SegmentFinder f17132a = new Object();

    @DoNotInline
    @NotNull
    public final android.text.SegmentFinder a(@NotNull final SegmentFinder segmentFinder) {
        return new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public final int nextEndBoundary(int i2) {
                return SegmentFinder.this.c(i2);
            }

            public final int nextStartBoundary(int i2) {
                return SegmentFinder.this.a(i2);
            }

            public final int previousEndBoundary(int i2) {
                return SegmentFinder.this.d(i2);
            }

            public final int previousStartBoundary(int i2) {
                return SegmentFinder.this.b(i2);
            }
        };
    }
}
