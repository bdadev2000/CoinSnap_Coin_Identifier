package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.flatbuffer.MetadataItem;

@RequiresApi
/* loaded from: classes4.dex */
public abstract class EmojiSpan extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final TypefaceEmojiRasterizer f19542b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f19541a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f19543c = -1;
    public float d = 1.0f;

    public EmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer == null) {
            throw new NullPointerException("rasterizer cannot be null");
        }
        this.f19542b = typefaceEmojiRasterizer;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f19541a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        TypefaceEmojiRasterizer typefaceEmojiRasterizer = this.f19542b;
        this.d = abs / (typefaceEmojiRasterizer.c().a(14) != 0 ? r8.f19585b.getShort(r1 + r8.f19584a) : (short) 0);
        MetadataItem c2 = typefaceEmojiRasterizer.c();
        int a2 = c2.a(14);
        if (a2 != 0) {
            c2.f19585b.getShort(a2 + c2.f19584a);
        }
        short s2 = (short) ((typefaceEmojiRasterizer.c().a(12) != 0 ? r5.f19585b.getShort(r7 + r5.f19584a) : (short) 0) * this.d);
        this.f19543c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
