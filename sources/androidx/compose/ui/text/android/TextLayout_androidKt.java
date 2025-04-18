package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: classes2.dex */
public final class TextLayout_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TextAndroidCanvas f17128a = new Canvas();

    /* renamed from: b, reason: collision with root package name */
    public static final long f17129b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.text.android.TextAndroidCanvas, android.graphics.Canvas] */
    static {
        long j2 = 0;
        f17129b = (j2 & 4294967295L) | (j2 << 32);
    }

    public static final TextDirectionHeuristic a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
