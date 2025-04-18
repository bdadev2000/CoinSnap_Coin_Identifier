package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import java.text.Bidi;
import q0.p;
import w0.e;

/* loaded from: classes4.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    public static final float a(float[] fArr, int i2, int i3) {
        return fArr[((i2 - i3) * 2) + 1];
    }

    public static final int b(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i2, RectF rectF, SegmentFinder segmentFinder, p pVar, boolean z2) {
        LayoutHelper.BidiRun[] bidiRunArr;
        int i3;
        LayoutHelper.BidiRun[] bidiRunArr2;
        int i4;
        int i5;
        int c2;
        int i6;
        int b2;
        Bidi createLineBidi;
        boolean z3;
        float a2;
        float a3;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i7 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i7];
        Layout layout2 = textLayout.f17116f;
        int lineStart2 = layout2.getLineStart(i2);
        int g2 = textLayout.g(i2);
        if (i7 < (g2 - lineStart2) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2".toString());
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(textLayout);
        boolean z4 = false;
        boolean z5 = layout2.getParagraphDirection(i2) == 1;
        int i8 = 0;
        while (lineStart2 < g2) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z5 && !isRtlCharAt) {
                a2 = horizontalPositionCache.a(lineStart2, z4, z4, true);
                a3 = horizontalPositionCache.a(lineStart2 + 1, true, true, true);
                z3 = z5;
            } else if (z5 && isRtlCharAt) {
                z3 = z5;
                a3 = horizontalPositionCache.a(lineStart2, false, false, false);
                a2 = horizontalPositionCache.a(lineStart2 + 1, true, true, false);
            } else {
                z3 = z5;
                if (isRtlCharAt) {
                    float a4 = horizontalPositionCache.a(lineStart2, false, false, true);
                    a2 = horizontalPositionCache.a(lineStart2 + 1, true, true, true);
                    a3 = a4;
                } else {
                    a2 = horizontalPositionCache.a(lineStart2, false, false, false);
                    a3 = horizontalPositionCache.a(lineStart2 + 1, true, true, false);
                }
            }
            fArr[i8] = a2;
            fArr[i8 + 1] = a3;
            i8 += 2;
            lineStart2++;
            z5 = z3;
            z4 = false;
        }
        Layout layout3 = layoutHelper.f17077a;
        int lineStart3 = layout3.getLineStart(i2);
        int lineEnd2 = layout3.getLineEnd(i2);
        int d = layoutHelper.d(lineStart3, false);
        int e = layoutHelper.e(d);
        int i9 = lineStart3 - e;
        int i10 = lineEnd2 - e;
        Bidi a5 = layoutHelper.a(d);
        if (a5 == null || (createLineBidi = a5.createLineBidi(i9, i10)) == null) {
            bidiRunArr = new LayoutHelper.BidiRun[]{new LayoutHelper.BidiRun(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            bidiRunArr = new LayoutHelper.BidiRun[runCount];
            int i11 = 0;
            while (i11 < runCount) {
                int i12 = runCount;
                bidiRunArr[i11] = new LayoutHelper.BidiRun(createLineBidi.getRunStart(i11) + lineStart3, createLineBidi.getRunLimit(i11) + lineStart3, createLineBidi.getRunLevel(i11) % 2 == 1);
                i11++;
                runCount = i12;
            }
        }
        e eVar = z2 ? new e(0, bidiRunArr.length - 1, 1) : new e(bidiRunArr.length - 1, 0, -1);
        int i13 = eVar.f31406a;
        int i14 = eVar.f31407b;
        int i15 = eVar.f31408c;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return -1;
        }
        while (true) {
            LayoutHelper.BidiRun bidiRun = bidiRunArr[i13];
            boolean z6 = bidiRun.f17082c;
            int i16 = bidiRun.f17080a;
            int i17 = bidiRun.f17081b;
            float f2 = z6 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
            float a6 = z6 ? a(fArr, i16, lineStart) : a(fArr, i17 - 1, lineStart);
            boolean z7 = bidiRun.f17082c;
            if (z2) {
                float f3 = rectF.left;
                if (a6 >= f3) {
                    bidiRunArr2 = bidiRunArr;
                    float f4 = rectF.right;
                    if (f2 <= f4) {
                        if ((z7 || f3 > f2) && (!z7 || f4 < a6)) {
                            int i18 = i16;
                            i6 = i17;
                            while (true) {
                                i3 = i15;
                                if (i6 - i18 <= 1) {
                                    break;
                                }
                                int i19 = (i6 + i18) / 2;
                                float f5 = fArr[(i19 - lineStart) * 2];
                                if ((z7 || f5 <= rectF.left) && (!z7 || f5 >= rectF.right)) {
                                    i18 = i19;
                                } else {
                                    i6 = i19;
                                }
                                i15 = i3;
                            }
                            if (!z7) {
                                i6 = i18;
                            }
                        } else {
                            i3 = i15;
                            i6 = i16;
                        }
                        int c3 = segmentFinder.c(i6);
                        if (c3 != -1 && (b2 = segmentFinder.b(c3)) < i17) {
                            if (b2 >= i16) {
                                i16 = b2;
                            }
                            if (c3 > i17) {
                                c3 = i17;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i20 = c3;
                            while (true) {
                                rectF2.left = z7 ? fArr[((i20 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
                                rectF2.right = z7 ? a(fArr, i16, lineStart) : a(fArr, i20 - 1, lineStart);
                                if (!((Boolean) pVar.invoke(rectF2, rectF)).booleanValue()) {
                                    i16 = segmentFinder.a(i16);
                                    if (i16 == -1 || i16 >= i17) {
                                        break;
                                    }
                                    i20 = segmentFinder.c(i16);
                                    if (i20 > i17) {
                                        i20 = i17;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    } else {
                        i3 = i15;
                    }
                } else {
                    i3 = i15;
                    bidiRunArr2 = bidiRunArr;
                }
                i16 = -1;
            } else {
                i3 = i15;
                bidiRunArr2 = bidiRunArr;
                float f6 = rectF.left;
                if (a6 >= f6) {
                    float f7 = rectF.right;
                    if (f2 <= f7) {
                        if ((z7 || f7 < a6) && (!z7 || f6 > f2)) {
                            int i21 = i16;
                            int i22 = i17;
                            while (i22 - i21 > 1) {
                                int i23 = (i22 + i21) / 2;
                                float f8 = fArr[(i23 - lineStart) * 2];
                                int i24 = i22;
                                if ((z7 || f8 <= rectF.right) && (!z7 || f8 >= rectF.left)) {
                                    i22 = i24;
                                    i21 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            i5 = z7 ? i22 : i21;
                        } else {
                            i5 = i17 - 1;
                        }
                        int b3 = segmentFinder.b(i5 + 1);
                        if (b3 != -1 && (c2 = segmentFinder.c(b3)) > i16) {
                            if (b3 < i16) {
                                b3 = i16;
                            }
                            if (c2 <= i17) {
                                i17 = c2;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i25 = b3;
                            while (true) {
                                rectF3.left = z7 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i25 - lineStart) * 2];
                                rectF3.right = z7 ? a(fArr, i25, lineStart) : a(fArr, i17 - 1, lineStart);
                                if (!((Boolean) pVar.invoke(rectF3, rectF)).booleanValue()) {
                                    i17 = segmentFinder.d(i17);
                                    if (i17 == -1 || i17 <= i16) {
                                        break;
                                    }
                                    i25 = segmentFinder.b(i17);
                                    if (i25 < i16) {
                                        i25 = i16;
                                    }
                                } else {
                                    i4 = i17;
                                    break;
                                }
                            }
                        }
                    }
                }
                i4 = -1;
                i16 = i4;
            }
            if (i16 >= 0) {
                return i16;
            }
            if (i13 == i14) {
                return -1;
            }
            i13 += i3;
            bidiRunArr = bidiRunArr2;
            i15 = i3;
        }
    }
}
