package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class PlaceholderSpan extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f17158a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17159b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17160c;
    public final int d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17161f;

    /* renamed from: g, reason: collision with root package name */
    public Paint.FontMetricsInt f17162g;

    /* renamed from: h, reason: collision with root package name */
    public int f17163h;

    /* renamed from: i, reason: collision with root package name */
    public int f17164i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17165j;

    /* loaded from: classes.dex */
    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Unit {
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface VerticalAlign {
        }
    }

    public PlaceholderSpan(float f2, int i2, int i3, float f3, float f4, int i4) {
        this.f17158a = f2;
        this.f17159b = i2;
        this.f17160c = f3;
        this.d = i3;
        this.e = f4;
        this.f17161f = i4;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f17162g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        a.B0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f17165j) {
            return this.f17164i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        if (this.f17165j) {
            return this.f17163h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        float f2;
        double ceil;
        this.f17165j = true;
        float textSize = paint.getTextSize();
        this.f17162g = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        float f3 = this.e;
        float f4 = this.f17158a;
        int i4 = this.f17159b;
        if (i4 == 0) {
            f2 = f4 * f3;
        } else {
            if (i4 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f2 = f4 * textSize;
        }
        this.f17163h = (int) Math.ceil(f2);
        float f5 = this.f17160c;
        int i5 = this.d;
        if (i5 == 0) {
            ceil = Math.ceil(f5 * f3);
        } else {
            if (i5 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            ceil = Math.ceil(f5 * textSize);
        }
        this.f17164i = (int) ceil;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f17161f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b2 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b2;
                        fontMetricsInt.descent = b() + b2;
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }
}
