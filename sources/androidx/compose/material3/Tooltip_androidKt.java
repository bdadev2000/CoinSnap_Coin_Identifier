package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;

/* loaded from: classes4.dex */
public final class Tooltip_androidKt {
    public static final DrawResult a(CacheDrawScope cacheDrawScope, CaretType caretType, Density density, Configuration configuration, long j2, long j3, LayoutCoordinates layoutCoordinates) {
        long j4;
        AndroidPath a2 = AndroidPath_androidKt.a();
        if (layoutCoordinates != null) {
            int F0 = density.F0(DpSize.a(j3));
            int F02 = density.F0(DpSize.b(j3));
            int F03 = density.F0(configuration.screenWidthDp);
            int F04 = density.F0(TooltipKt.f12528a);
            Rect b2 = LayoutCoordinatesKt.b(layoutCoordinates);
            float f2 = b2.f14916c;
            float f3 = b2.f14914a;
            float f4 = 2;
            float f5 = (f2 + f3) / f4;
            float f6 = f2 - f3;
            float d = Size.d(cacheDrawScope.f14796a.b());
            float b3 = Size.b(cacheDrawScope.f14796a.b());
            boolean z2 = (b2.f14915b - b3) - ((float) F04) < 0.0f;
            if (z2) {
                b3 = 0.0f;
            }
            if (caretType == CaretType.f8181a) {
                float f7 = F03;
                j4 = (d / f4) + f5 > f7 ? OffsetKt.a(d - (f7 - f5), b3) : OffsetKt.a(f5 - Math.max(f3 - ((Size.d(cacheDrawScope.f14796a.b()) / f4) - (f6 / f4)), 0.0f), b3);
            } else {
                long a3 = OffsetKt.a(f5 - f3, b3);
                float f8 = F03;
                if (f3 + d > f8) {
                    float f9 = f2 - d;
                    a3 = OffsetKt.a(f5 - f9, b3);
                    if (f9 < 0.0f) {
                        float f10 = d / f4;
                        float f11 = f6 / f4;
                        j4 = (f3 - f10) + f11 <= 0.0f ? OffsetKt.a(f5, b3) : (f2 + f10) - f11 >= f8 ? OffsetKt.a(d - (f8 - f5), b3) : OffsetKt.a(f10, b3);
                    }
                }
                j4 = a3;
            }
            if (z2) {
                a2.n(Offset.g(j4), Offset.h(j4));
                float f12 = F02 / 2;
                a2.u(Offset.g(j4) + f12, Offset.h(j4));
                a2.u(Offset.g(j4), Offset.h(j4) - F0);
                a2.u(Offset.g(j4) - f12, Offset.h(j4));
                a2.close();
            } else {
                a2.n(Offset.g(j4), Offset.h(j4));
                float f13 = F02 / 2;
                a2.u(Offset.g(j4) + f13, Offset.h(j4));
                a2.u(Offset.g(j4), Offset.h(j4) + F0);
                a2.u(Offset.g(j4) - f13, Offset.h(j4));
                a2.close();
            }
        }
        return cacheDrawScope.n(new Tooltip_androidKt$drawCaretWithPath$4(layoutCoordinates, a2, j2));
    }
}
