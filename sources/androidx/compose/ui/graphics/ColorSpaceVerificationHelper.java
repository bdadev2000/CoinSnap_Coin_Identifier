package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import java.util.function.DoubleUnaryOperator;
import org.jetbrains.annotations.NotNull;
import q0.l;

@RequiresApi
/* loaded from: classes2.dex */
final class ColorSpaceVerificationHelper {
    @DoNotInline
    @RequiresApi
    @NotNull
    public static final ColorSpace a(@NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        float[] fArr;
        ColorSpace.Rgb.TransferParameters transferParameters;
        if (p0.a.g(colorSpace, ColorSpaces.f15075c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15085o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15086p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15083m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15078h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15077g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15088r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15087q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15079i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15080j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (p0.a.g(colorSpace, ColorSpaces.e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15076f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (p0.a.g(colorSpace, ColorSpaces.d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15081k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15084n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (p0.a.g(colorSpace, ColorSpaces.f15082l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(colorSpace instanceof Rgb)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Rgb rgb = (Rgb) colorSpace;
        float[] a2 = rgb.d.a();
        TransferParameters transferParameters2 = rgb.f15105g;
        if (transferParameters2 != null) {
            fArr = a2;
            transferParameters = new ColorSpace.Rgb.TransferParameters(transferParameters2.f15119b, transferParameters2.f15120c, transferParameters2.d, transferParameters2.e, transferParameters2.f15121f, transferParameters2.f15122g, transferParameters2.f15118a);
        } else {
            fArr = a2;
            transferParameters = null;
        }
        if (transferParameters != null) {
            return new ColorSpace.Rgb(colorSpace.f15070a, ((Rgb) colorSpace).f15106h, fArr, transferParameters);
        }
        String str = colorSpace.f15070a;
        Rgb rgb2 = (Rgb) colorSpace;
        float[] fArr2 = rgb2.f15106h;
        final l lVar = rgb2.f15110l;
        final int i2 = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.c
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i3 = i2;
                l lVar2 = lVar;
                switch (i3) {
                    case 0:
                        return ((Number) lVar2.invoke(Double.valueOf(d))).doubleValue();
                    default:
                        return ((Number) lVar2.invoke(Double.valueOf(d))).doubleValue();
                }
            }
        };
        final l lVar2 = rgb2.f15113o;
        final int i3 = 1;
        return new ColorSpace.Rgb(str, fArr2, fArr, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.c
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i32 = i3;
                l lVar22 = lVar2;
                switch (i32) {
                    case 0:
                        return ((Number) lVar22.invoke(Double.valueOf(d))).doubleValue();
                    default:
                        return ((Number) lVar22.invoke(Double.valueOf(d))).doubleValue();
                }
            }
        }, colorSpace.c(0), colorSpace.b(0));
    }

    @DoNotInline
    @RequiresApi
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace b(@NotNull final ColorSpace colorSpace) {
        WhitePoint whitePoint;
        ColorSpace.Rgb rgb;
        TransferParameters transferParameters;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.f15075c;
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.f15085o;
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.f15086p;
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.f15083m;
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.f15078h;
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.f15077g;
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.f15088r;
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.f15087q;
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.f15079i;
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.f15080j;
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.e;
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.f15076f;
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.d;
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.f15081k;
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.f15084n;
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.f15082l;
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return ColorSpaces.f15075c;
        }
        ColorSpace.Rgb rgb2 = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters2 = rgb2.getTransferParameters();
        if (rgb2.getWhitePoint().length == 3) {
            float f2 = rgb2.getWhitePoint()[0];
            float f3 = rgb2.getWhitePoint()[1];
            float f4 = f2 + f3 + rgb2.getWhitePoint()[2];
            whitePoint = new WhitePoint(f2 / f4, f3 / f4);
        } else {
            whitePoint = new WhitePoint(rgb2.getWhitePoint()[0], rgb2.getWhitePoint()[1]);
        }
        WhitePoint whitePoint2 = whitePoint;
        if (transferParameters2 != null) {
            rgb = rgb2;
            transferParameters = new TransferParameters(transferParameters2.g, transferParameters2.a, transferParameters2.b, transferParameters2.c, transferParameters2.d, transferParameters2.e, transferParameters2.f);
        } else {
            rgb = rgb2;
            transferParameters = null;
        }
        final int i2 = 0;
        final int i3 = 1;
        return new Rgb(rgb.getName(), rgb.getPrimaries(), whitePoint2, rgb.getTransform(), new DoubleFunction() { // from class: androidx.compose.ui.graphics.d
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double c(double d) {
                int i4 = i2;
                ColorSpace colorSpace2 = colorSpace;
                switch (i4) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace2).getOetf().applyAsDouble(d);
                    default:
                        return ((ColorSpace.Rgb) colorSpace2).getEotf().applyAsDouble(d);
                }
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.d
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double c(double d) {
                int i4 = i3;
                ColorSpace colorSpace2 = colorSpace;
                switch (i4) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace2).getOetf().applyAsDouble(d);
                    default:
                        return ((ColorSpace.Rgb) colorSpace2).getEotf().applyAsDouble(d);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters, rgb.getId());
    }
}
