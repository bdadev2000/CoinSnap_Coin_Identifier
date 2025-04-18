package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;

@Stable
/* loaded from: classes3.dex */
public final class SegmentedButtonDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final SegmentedButtonDefaults f11083a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f11084b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f11085c;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.SegmentedButtonDefaults, java.lang.Object] */
    static {
        float f2 = OutlinedSegmentedButtonTokens.f13463a;
        f11084b = OutlinedSegmentedButtonTokens.f13464b;
        f11085c = OutlinedSegmentedButtonTokens.f13465c;
    }

    public static SegmentedButtonColors c(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        SegmentedButtonColors segmentedButtonColors = a2.f8539r0;
        if (segmentedButtonColors != null) {
            return segmentedButtonColors;
        }
        float f2 = OutlinedSegmentedButtonTokens.f13463a;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f13282r;
        long e = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        long e2 = ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13272h);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.f13276l;
        long e3 = ColorSchemeKt.e(a2, colorSchemeKeyTokens2);
        long j2 = a2.f8534p;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.f13273i;
        SegmentedButtonColors segmentedButtonColors2 = new SegmentedButtonColors(e, e2, e3, j2, ColorSchemeKt.e(a2, colorSchemeKeyTokens3), ColorSchemeKt.e(a2, colorSchemeKeyTokens2), ColorSchemeKt.e(a2, colorSchemeKeyTokens), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens3), 0.38f), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens2), 0.12f), a2.f8534p, ColorSchemeKt.e(a2, colorSchemeKeyTokens3), ColorSchemeKt.e(a2, colorSchemeKeyTokens2));
        a2.f8539r0 = segmentedButtonColors2;
        return segmentedButtonColors2;
    }

    public final void a(Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1273041460);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            ImageVector imageVector = CheckKt.f7369a;
            if (imageVector == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i4 = VectorKt.f15465a;
                SolidColor solidColor = new SolidColor(Color.f14957b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.f(9.0f, 16.17f);
                pathBuilder.d(4.83f, 12.0f);
                pathBuilder.e(-1.42f, 1.41f);
                pathBuilder.d(9.0f, 19.0f);
                pathBuilder.d(21.0f, 7.0f);
                pathBuilder.e(-1.41f, -1.41f);
                pathBuilder.a();
                builder.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.f15330a);
                imageVector = builder.d();
                CheckKt.f7369a = imageVector;
            }
            IconKt.b(imageVector, null, SizeKt.n(Modifier.Companion.f14687a, f11085c), 0L, g2, 48, 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SegmentedButtonDefaults$ActiveIcon$1(this, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r17, q0.p r18, q0.p r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonDefaults.b(boolean, q0.p, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
