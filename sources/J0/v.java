package j0;

import U4.y;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public final class v extends ReplacementSpan {

    /* renamed from: c, reason: collision with root package name */
    public final u f21006c;

    /* renamed from: g, reason: collision with root package name */
    public TextPaint f21009g;
    public final Paint.FontMetricsInt b = new Paint.FontMetricsInt();

    /* renamed from: d, reason: collision with root package name */
    public short f21007d = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f21008f = 1.0f;

    public v(u uVar) {
        C2.m.h(uVar, "rasterizer cannot be null");
        this.f21006c = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f9, int i11, int i12, int i13, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i9, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f21009g;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f21009g = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f9, i11, f9 + this.f21007d, i13, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        j.a().getClass();
        float f10 = i12;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        u uVar = this.f21006c;
        y yVar = uVar.b;
        Typeface typeface = (Typeface) yVar.f3336d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) yVar.b, uVar.f21004a * 2, 2, f9, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        short s5;
        Paint.FontMetricsInt fontMetricsInt2 = this.b;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f21006c;
        k0.a c9 = uVar.c();
        int a6 = c9.a(14);
        short s9 = 0;
        if (a6 != 0) {
            s5 = c9.b.getShort(a6 + c9.f21396a);
        } else {
            s5 = 0;
        }
        this.f21008f = abs / s5;
        k0.a c10 = uVar.c();
        int a9 = c10.a(14);
        if (a9 != 0) {
            c10.b.getShort(a9 + c10.f21396a);
        }
        k0.a c11 = uVar.c();
        int a10 = c11.a(12);
        if (a10 != 0) {
            s9 = c11.b.getShort(a10 + c11.f21396a);
        }
        short s10 = (short) (s9 * this.f21008f);
        this.f21007d = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
