package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.selection.b;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import g1.f;
import h0.l;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class ScrollCapture implements ComposeScrollCaptureCallback.ScrollCaptureSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f16765a;

    public ScrollCapture() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f16765a = f2;
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public final void a() {
        this.f16765a.setValue(Boolean.TRUE);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public final void b() {
        this.f16765a.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [q0.l[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.a, q0.l] */
    @DoNotInline
    public final void c(@NotNull View view, @NotNull SemanticsOwner semanticsOwner, @NotNull l lVar, @NotNull Consumer<ScrollCaptureTarget> consumer) {
        MutableVector mutableVector = new MutableVector(new ScrollCaptureCandidate[16]);
        ScrollCapture_androidKt.a(semanticsOwner.a(), 0, new kotlin.jvm.internal.a(1, mutableVector, MutableVector.class, ImpressionLog.f29260l, "add(Ljava/lang/Object;)Z", 8));
        mutableVector.q(new b(new q0.l[]{ScrollCapture$onScrollCaptureSearch$2.f16766a, ScrollCapture$onScrollCaptureSearch$3.f16767a}, 1));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (mutableVector.l() ? null : mutableVector.f14142a[mutableVector.f14144c - 1]);
        if (scrollCaptureCandidate == null) {
            return;
        }
        f c2 = p0.a.c(lVar);
        SemanticsNode semanticsNode = scrollCaptureCandidate.f16768a;
        IntRect intRect = scrollCaptureCandidate.f16770c;
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(semanticsNode, intRect, c2, this);
        LayoutCoordinates layoutCoordinates = scrollCaptureCandidate.d;
        Rect Q = LayoutCoordinatesKt.c(layoutCoordinates).Q(layoutCoordinates, true);
        long a2 = IntOffsetKt.a(intRect.f17490a, intRect.f17491b);
        ScrollCaptureTarget k2 = androidx.compose.ui.contentcapture.a.k(view, RectHelper_androidKt.b(IntRectKt.b(Q)), new Point((int) (a2 >> 32), (int) (a2 & 4294967295L)), composeScrollCaptureCallback);
        k2.setScrollBounds(RectHelper_androidKt.b(intRect));
        consumer.accept(k2);
    }
}
