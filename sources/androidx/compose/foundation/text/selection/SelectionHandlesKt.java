package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;

/* loaded from: classes2.dex */
public final class SelectionHandlesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7185a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f7186b;

    /* renamed from: c, reason: collision with root package name */
    public static final SemanticsPropertyKey f7187c = new SemanticsPropertyKey("SelectionHandleInfo");

    static {
        float f2 = 25;
        f7185a = f2;
        f7186b = f2;
    }

    public static final long a(long j2) {
        return OffsetKt.a(Offset.g(j2), Offset.h(j2) - 1.0f);
    }
}
