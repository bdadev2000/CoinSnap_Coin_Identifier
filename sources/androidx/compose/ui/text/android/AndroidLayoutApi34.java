package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.input.internal.e;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@StabilityInferred
@RequiresApi
/* loaded from: classes4.dex */
public final class AndroidLayoutApi34 {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLayoutApi34 f17064a = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.text.android.a] */
    @DoNotInline
    @Nullable
    public final int[] a(@NotNull TextLayout textLayout, @NotNull RectF rectF, int i2, @NotNull final p pVar) {
        SegmentFinder p2;
        int[] rangeForRect;
        if (i2 == 1) {
            p2 = Api34SegmentFinder.f17132a.a(new WordSegmentFinder(textLayout.f17116f.getText(), textLayout.k()));
        } else {
            e.t();
            p2 = e.p(e.o(textLayout.f17116f.getText(), textLayout.f17113a));
        }
        rangeForRect = textLayout.f17116f.getRangeForRect(rectF, p2, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) p.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
        return rangeForRect;
    }
}
