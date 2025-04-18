package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.Dp;
import q0.p;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextLayoutState {

    /* renamed from: a, reason: collision with root package name */
    public final TextFieldLayoutStateCache f6644a;

    /* renamed from: b, reason: collision with root package name */
    public p f6645b;

    /* renamed from: c, reason: collision with root package name */
    public final TextFieldLayoutStateCache f6646c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6647f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6648g;

    /* renamed from: h, reason: collision with root package name */
    public final BringIntoViewRequester f6649h;

    public TextLayoutState() {
        ParcelableSnapshotMutableState f2;
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.f6644a = textFieldLayoutStateCache;
        this.f6646c = textFieldLayoutStateCache;
        this.d = SnapshotStateKt.f(null, SnapshotStateKt.h());
        this.e = SnapshotStateKt.f(null, SnapshotStateKt.h());
        this.f6647f = SnapshotStateKt.f(null, SnapshotStateKt.h());
        f2 = SnapshotStateKt.f(new Dp(0), StructuralEqualityPolicy.f14078a);
        this.f6648g = f2;
        this.f6649h = BringIntoViewRequesterKt.a();
    }

    public final long a(long j2) {
        Rect rect;
        LayoutCoordinates d = d();
        Rect rect2 = Rect.e;
        if (d != null) {
            if (d.B()) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f6647f.getValue();
                rect = layoutCoordinates != null ? layoutCoordinates.Q(d, true) : null;
            } else {
                rect = rect2;
            }
            if (rect != null) {
                rect2 = rect;
            }
        }
        return TextLayoutStateKt.a(j2, rect2);
    }

    public final TextLayoutResult b() {
        return (TextLayoutResult) this.f6646c.getValue();
    }

    public final int c(long j2, boolean z2) {
        TextLayoutResult b2 = b();
        if (b2 == null) {
            return -1;
        }
        if (z2) {
            j2 = a(j2);
        }
        return b2.f17047b.e(TextLayoutStateKt.b(this, j2));
    }

    public final LayoutCoordinates d() {
        return (LayoutCoordinates) this.d.getValue();
    }

    public final boolean e(long j2) {
        TextLayoutResult b2 = b();
        if (b2 == null) {
            return false;
        }
        long b3 = TextLayoutStateKt.b(this, a(j2));
        int c2 = b2.f17047b.c(Offset.h(b3));
        return Offset.g(b3) >= b2.g(c2) && Offset.g(b3) <= b2.h(c2);
    }
}
