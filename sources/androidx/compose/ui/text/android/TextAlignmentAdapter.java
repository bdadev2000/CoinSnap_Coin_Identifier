package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextAlignmentAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f17110a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f17111b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (p0.a.g(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (p0.a.g(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f17110a = alignment;
        f17111b = alignment2;
    }
}
