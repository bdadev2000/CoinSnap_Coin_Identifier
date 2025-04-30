package com.meta.analytics.dsp.uinode;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08462j extends Drawable {
    public static InterfaceC08452i A0G;
    public static byte[] A0H;
    public static String[] A0I = {"YEFrjfwCEWu", "", "GYovhjhdb5Je", "S1Fz", "LeiEw92n2EsObareFd", "xgqXw3gEiUgyln4SIM", "kGClknFKKNldAaaK4EgXWOsNKvCYjz7L", "I70UDyBH67pytg1dUxrP2KgAWNh3bG3K"};
    public static final double A0J;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public ColorStateList A04;
    public Paint A05;
    public Paint A06;
    public Path A08;
    public final RectF A0F;
    public boolean A0A = true;
    public boolean A09 = true;
    public boolean A0B = false;
    public final int A0E = 922746880;
    public final int A0D = 50331648;
    public final int A0C = AbstractC08412e.A09;
    public Paint A07 = new Paint(5);

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0I;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[5] = "Hial5Dc7DTVcebgm6Z";
            strArr2[4] = "T1onITFvXBLfXkfgru";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 69);
            i12++;
        }
    }

    public static void A05() {
        A0H = new byte[]{114, 124, 17, 41, 47, 40, 124, 62, 57, 124, 98, 97, 124, 108, 115, 84, 76, 91, 86, 83, 94, Ascii.SUB, 87, 91, 66, Ascii.SUB, 73, 82, 91, 94, 85, 77, Ascii.SUB, 73, 83, 64, 95, Ascii.SUB, 8, 47, 55, 32, 45, 40, 37, 97, 51, 32, 37, 40, 52, 50, 97, 1, 38, 62, 41, 36, 33, 44, 104, 59, 32, 41, 44, 39, 63, 104, 59, 33, 50, 45, 104};
    }

    static {
        A05();
        A0J = Math.cos(Math.toRadians(45.0d));
    }

    public C08462j(Resources resources, ColorStateList colorStateList, float f9, float f10, float f11) {
        A07(colorStateList);
        Paint paint = new Paint(5);
        this.A05 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A00 = (int) (0.5f + f9);
        this.A0F = new RectF();
        Paint paint2 = new Paint(this.A05);
        this.A06 = paint2;
        paint2.setAntiAlias(false);
        A06(f10, f11);
    }

    public static float A00(float f9, float f10, boolean z8) {
        if (z8) {
            double d2 = f9;
            if (A0I[2].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[5] = "P9aPeBSvznAhF57KLP";
            strArr[4] = "W3RUpaMuYeMV1XeTAU";
            return (float) (d2 + ((1.0d - A0J) * f10));
        }
        return f9;
    }

    public static float A01(float f9, float f10, boolean z8) {
        if (z8) {
            return (float) ((1.5f * f9) + ((1.0d - A0J) * f10));
        }
        return 1.5f * f9;
    }

    private int A02(float f9) {
        int i9 = (int) (0.5f + f9);
        if (i9 % 2 == 1) {
            int i10 = i9 - 1;
            String[] strArr = A0I;
            String str = strArr[0];
            String str2 = strArr[3];
            int length = str.length();
            int i11 = str2.length();
            if (length == i11) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "0g5GSSLFt9w";
            strArr2[3] = "EJV6";
            return i10;
        }
        return i9;
    }

    private void A04() {
        float f9 = this.A00;
        RectF rectF = new RectF(-f9, -f9, f9, f9);
        RectF rectF2 = new RectF(rectF);
        float f10 = this.A03;
        rectF2.inset(-f10, -f10);
        Path path = this.A08;
        if (path == null) {
            this.A08 = new Path();
        } else {
            path.reset();
        }
        this.A08.setFillType(Path.FillType.EVEN_ODD);
        this.A08.moveTo(-this.A00, 0.0f);
        this.A08.rLineTo(-this.A03, 0.0f);
        this.A08.arcTo(rectF2, 180.0f, 90.0f, false);
        this.A08.arcTo(rectF, 270.0f, -90.0f, false);
        this.A08.close();
        float f11 = this.A00;
        float f12 = f11 / (this.A03 + f11);
        Paint paint = this.A05;
        float f13 = this.A03 + this.A00;
        int i9 = this.A0E;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f13, new int[]{i9, i9, this.A0D}, new float[]{0.0f, f12, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.A06;
        float f14 = this.A00;
        float startRatio = this.A03;
        float f15 = (-f14) + startRatio;
        float f16 = (-f14) - startRatio;
        int i10 = this.A0E;
        paint2.setShader(new LinearGradient(0.0f, f15, 0.0f, f16, new int[]{i10, i10, this.A0D}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.A06.setAntiAlias(false);
    }

    private void A06(float f9, float f10) {
        String A03 = A03(0, 14, 25);
        if (f9 < 0.0f) {
            throw new IllegalArgumentException(A03(53, 20, 13) + f9 + A03);
        }
        if (A0I[1].length() == 0) {
            A0I[2] = "3ZLq2wnsXXEHTe1p9";
            if (f10 >= 0.0f) {
                float A02 = A02(f9);
                float A022 = A02(f10);
                if (A02 > A022) {
                    A02 = A022;
                    if (!this.A0B) {
                        this.A0B = true;
                    }
                }
                if (this.A02 == A02 && this.A01 == A022) {
                    return;
                }
                this.A02 = A02;
                this.A01 = A022;
                float f11 = 1.5f * A02;
                if (A0I[2].length() != 3) {
                    A0I[2] = "TJpNel9JPCCGijw6acwFd0iMJz";
                    this.A03 = (int) (f11 + this.A0C + 0.5f);
                    this.A0A = true;
                    invalidateSelf();
                    return;
                }
            } else {
                throw new IllegalArgumentException(A03(14, 24, 127) + f10 + A03);
            }
        }
        throw new RuntimeException();
    }

    private void A07(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.A04 = colorStateList;
        Paint paint = this.A07;
        int[] state = getState();
        int defaultColor = this.A04.getDefaultColor();
        if (A0I[2].length() == 3) {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[0] = "VZiE9OVYqDu";
        strArr[3] = "EWr6";
        paint.setColor(colorStateList.getColorForState(state, defaultColor));
    }

    private void A08(Canvas canvas) {
        float f9 = this.A00;
        float f10 = (-f9) - this.A03;
        float edgeShadowTop = this.A0C;
        float f11 = f9 + edgeShadowTop;
        float edgeShadowTop2 = this.A02;
        float inset = f11 + (edgeShadowTop2 / 2.0f);
        float edgeShadowTop3 = inset * 2.0f;
        boolean z8 = this.A0F.width() - edgeShadowTop3 > 0.0f;
        float edgeShadowTop4 = inset * 2.0f;
        boolean z9 = this.A0F.height() - edgeShadowTop4 > 0.0f;
        int save = canvas.save();
        float f12 = this.A0F.left + inset;
        float edgeShadowTop5 = this.A0F.top;
        canvas.translate(f12, edgeShadowTop5 + inset);
        canvas.drawPath(this.A08, this.A05);
        if (z8) {
            float edgeShadowTop6 = inset * 2.0f;
            float width = this.A0F.width() - edgeShadowTop6;
            float edgeShadowTop7 = this.A00;
            canvas.drawRect(0.0f, f10, width, -edgeShadowTop7, this.A06);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        float f13 = this.A0F.right - inset;
        float edgeShadowTop8 = this.A0F.bottom;
        canvas.translate(f13, edgeShadowTop8 - inset);
        canvas.rotate(180.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z8) {
            float edgeShadowTop9 = inset * 2.0f;
            float width2 = this.A0F.width() - edgeShadowTop9;
            float edgeShadowTop10 = this.A00;
            float f14 = -edgeShadowTop10;
            float edgeShadowTop11 = this.A03;
            canvas.drawRect(0.0f, f10, width2, f14 + edgeShadowTop11, this.A06);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        float f15 = this.A0F.left + inset;
        float edgeShadowTop12 = this.A0F.bottom;
        canvas.translate(f15, edgeShadowTop12 - inset);
        if (A0I[2].length() != 3) {
            A0I[2] = "QAUm";
            canvas.rotate(270.0f);
            canvas.drawPath(this.A08, this.A05);
            if (z9) {
                float edgeShadowTop13 = inset * 2.0f;
                float height = this.A0F.height() - edgeShadowTop13;
                float edgeShadowTop14 = this.A00;
                canvas.drawRect(0.0f, f10, height, -edgeShadowTop14, this.A06);
            }
            canvas.restoreToCount(save3);
            int save4 = canvas.save();
            float f16 = this.A0F.right - inset;
            float f17 = this.A0F.top;
            if (A0I[2].length() != 3) {
                A0I[2] = "4hs9knzgsM3vbS2";
                canvas.translate(f16, f17 + inset);
                canvas.rotate(90.0f);
                canvas.drawPath(this.A08, this.A05);
                if (z9) {
                    canvas.drawRect(0.0f, f10, this.A0F.height() - (2.0f * inset), -this.A00, this.A06);
                }
                canvas.restoreToCount(save4);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A09(Rect rect) {
        float f9 = this.A01 * 1.5f;
        RectF rectF = this.A0F;
        float f10 = rect.left;
        float verticalOffset = this.A01;
        float f11 = rect.right;
        float verticalOffset2 = this.A01;
        float f12 = f11 - verticalOffset2;
        float verticalOffset3 = rect.bottom;
        rectF.set(f10 + verticalOffset, rect.top + f9, f12, verticalOffset3 - f9);
        A04();
    }

    public final float A0A() {
        return this.A00;
    }

    public final float A0B() {
        return this.A01;
    }

    public final float A0C() {
        float f9 = this.A01;
        float max = Math.max(f9, this.A00 + this.A0C + ((f9 * 1.5f) / 2.0f)) * 2.0f;
        float f10 = this.A01 * 1.5f;
        float content = this.A0C;
        return ((f10 + content) * 2.0f) + max;
    }

    public final float A0D() {
        float f9 = this.A01;
        float max = Math.max(f9, this.A00 + this.A0C + (f9 / 2.0f)) * 2.0f;
        float f10 = this.A01;
        float content = this.A0C;
        return ((f10 + content) * 2.0f) + max;
    }

    public final float A0E() {
        return this.A02;
    }

    public final ColorStateList A0F() {
        return this.A04;
    }

    public final void A0G(float f9) {
        if (f9 >= 0.0f) {
            float f10 = (int) (0.5f + f9);
            if (this.A00 == f10) {
                return;
            }
            this.A00 = f10;
            this.A0A = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException(A03(38, 15, 4) + f9 + A03(0, 14, 25));
    }

    public final void A0H(float f9) {
        A06(this.A02, f9);
    }

    public final void A0I(float f9) {
        A06(f9, this.A01);
    }

    public final void A0J(ColorStateList colorStateList) {
        A07(colorStateList);
        invalidateSelf();
    }

    public final void A0K(Rect rect) {
        getPadding(rect);
    }

    public final void A0L(boolean z8) {
        this.A09 = z8;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A0A) {
            A09(getBounds());
            this.A0A = false;
        }
        canvas.translate(0.0f, this.A02 / 2.0f);
        A08(canvas);
        canvas.translate(0.0f, (-this.A02) / 2.0f);
        A0G.A5E(canvas, this.A0F, this.A00, this.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(A01(this.A01, this.A00, this.A09));
        int vOffset = (int) Math.ceil(A00(this.A01, this.A00, this.A09));
        rect.set(vOffset, ceil, vOffset, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.A04;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.A04;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        int newColor = this.A07.getColor();
        if (newColor == colorForState) {
            return false;
        }
        this.A07.setColor(colorForState);
        this.A0A = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.A07.setAlpha(i9);
        this.A05.setAlpha(i9);
        this.A06.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }
}
