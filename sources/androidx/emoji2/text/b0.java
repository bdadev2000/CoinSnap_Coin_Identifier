package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b0 extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final r f1493b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f1494c = 1.0f;

    public b0(r rVar) {
        if (rVar != null) {
            this.f1493b = rVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s5;
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        r rVar = this.f1493b;
        d1.a c10 = rVar.c();
        int a = c10.a(14);
        short s10 = 0;
        if (a != 0) {
            s5 = ((ByteBuffer) c10.f16791d).getShort(a + c10.a);
        } else {
            s5 = 0;
        }
        this.f1494c = abs / s5;
        d1.a c11 = rVar.c();
        int a10 = c11.a(14);
        if (a10 != 0) {
            ((ByteBuffer) c11.f16791d).getShort(a10 + c11.a);
        }
        d1.a c12 = rVar.c();
        int a11 = c12.a(12);
        if (a11 != 0) {
            s10 = ((ByteBuffer) c12.f16791d).getShort(a11 + c12.a);
        }
        short s11 = (short) (s10 * this.f1494c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s11;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        l.a().getClass();
        r rVar = this.f1493b;
        s2.h hVar = rVar.f1523b;
        Typeface typeface = (Typeface) hVar.f24172f;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) hVar.f24170c, rVar.a * 2, 2, f10, i13, paint);
        paint.setTypeface(typeface2);
    }
}
