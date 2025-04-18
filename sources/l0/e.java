package l0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {
    public final TextPaint a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f21102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21103c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21104d;

    public e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            com.bytedance.sdk.component.adexpress.vc.a.s();
            breakStrategy = d.d(textPaint).setBreakStrategy(i10);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.a = textPaint;
        this.f21102b = textDirectionHeuristic;
        this.f21103c = i10;
        this.f21104d = i11;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f21103c == eVar.f21103c && this.f21104d == eVar.f21104d) {
            TextPaint textPaint = this.a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = eVar.a;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                z10 = true;
                if (z10 && this.f21102b == eVar.f21102b) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (z10) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f21102b, Integer.valueOf(this.f21103c), Integer.valueOf(this.f21104d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb2.append(sb4.toString());
        }
        sb2.append(", textDir=" + this.f21102b);
        sb2.append(", breakStrategy=" + this.f21103c);
        sb2.append(", hyphenationFrequency=" + this.f21104d);
        sb2.append("}");
        return sb2.toString();
    }

    public e(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.a = textPaint;
        textDirection = params.getTextDirection();
        this.f21102b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f21103c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f21104d = hyphenationFrequency;
    }
}
