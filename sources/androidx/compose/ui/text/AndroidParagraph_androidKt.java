package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001a\u0016\u0010 \u001a\u00020\u0006*\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "toLayoutTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toLayoutTextGranularity-duNsdkg", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class AndroidParagraph_androidKt {
    public static final /* synthetic */ CharSequence access$attachIndentationFixSpan(CharSequence charSequence) {
        return attachIndentationFixSpan(charSequence);
    }

    public static final /* synthetic */ int access$numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        return numberOfLinesThatFitMaxHeight(textLayout, i);
    }

    public static final /* synthetic */ boolean access$shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        return shouldAttachIndentationFixSpan(textStyle, z);
    }

    /* renamed from: access$toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final /* synthetic */ int m6299access$toLayoutAlignaXe7zB0(int i) {
        return m6305toLayoutAlignaXe7zB0(i);
    }

    /* renamed from: access$toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final /* synthetic */ int m6300access$toLayoutBreakStrategyxImikfE(int i) {
        return m6306toLayoutBreakStrategyxImikfE(i);
    }

    /* renamed from: access$toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final /* synthetic */ int m6301access$toLayoutHyphenationFrequency3fSNIE(int i) {
        return m6307toLayoutHyphenationFrequency3fSNIE(i);
    }

    /* renamed from: access$toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final /* synthetic */ int m6302access$toLayoutLineBreakStylehpcqdu8(int i) {
        return m6308toLayoutLineBreakStylehpcqdu8(i);
    }

    /* renamed from: access$toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final /* synthetic */ int m6303access$toLayoutLineBreakWordStylewPN0Rpw(int i) {
        return m6309toLayoutLineBreakWordStylewPN0Rpw(i);
    }

    /* renamed from: access$toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final /* synthetic */ int m6304access$toLayoutTextGranularityduNsdkg(int i) {
        return m6310toLayoutTextGranularityduNsdkg(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m6305toLayoutAlignaXe7zB0(int i) {
        if (TextAlign.m6860equalsimpl0(i, TextAlign.INSTANCE.m6867getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m6860equalsimpl0(i, TextAlign.INSTANCE.m6868getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m6860equalsimpl0(i, TextAlign.INSTANCE.m6864getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m6860equalsimpl0(i, TextAlign.INSTANCE.m6869getStarte0LSkKk()) && TextAlign.m6860equalsimpl0(i, TextAlign.INSTANCE.m6865getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m6307toLayoutHyphenationFrequency3fSNIE(int i) {
        if (Hyphens.m6770equalsimpl0(i, Hyphens.INSTANCE.m6774getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m6770equalsimpl0(i, Hyphens.INSTANCE.m6775getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m6306toLayoutBreakStrategyxImikfE(int i) {
        if (LineBreak.Strategy.m6801equalsimpl0(i, LineBreak.Strategy.INSTANCE.m6807getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m6801equalsimpl0(i, LineBreak.Strategy.INSTANCE.m6806getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m6801equalsimpl0(i, LineBreak.Strategy.INSTANCE.m6805getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m6308toLayoutLineBreakStylehpcqdu8(int i) {
        if (LineBreak.Strictness.m6812equalsimpl0(i, LineBreak.Strictness.INSTANCE.m6816getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m6812equalsimpl0(i, LineBreak.Strictness.INSTANCE.m6817getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m6812equalsimpl0(i, LineBreak.Strictness.INSTANCE.m6818getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m6812equalsimpl0(i, LineBreak.Strictness.INSTANCE.m6819getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m6309toLayoutLineBreakWordStylewPN0Rpw(int i) {
        return (!LineBreak.WordBreak.m6824equalsimpl0(i, LineBreak.WordBreak.INSTANCE.m6828getDefaultjp8hJ3c()) && LineBreak.WordBreak.m6824equalsimpl0(i, LineBreak.WordBreak.INSTANCE.m6829getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        return (!z || TextUnit.m7187equalsimpl0(textStyle.m6496getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m7187equalsimpl0(textStyle.m6496getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m7201getUnspecifiedXSAIIZE()) || TextAlign.m6860equalsimpl0(textStyle.m6501getTextAligne0LSkKk(), TextAlign.INSTANCE.m6870getUnspecifiede0LSkKk()) || TextAlign.m6860equalsimpl0(textStyle.m6501getTextAligne0LSkKk(), TextAlign.INSTANCE.m6869getStarte0LSkKk()) || TextAlign.m6860equalsimpl0(textStyle.m6501getTextAligne0LSkKk(), TextAlign.INSTANCE.m6866getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m6310toLayoutTextGranularityduNsdkg(int i) {
        return (!TextGranularity.m6420equalsimpl0(i, TextGranularity.INSTANCE.m6424getCharacterDRrd7Zo()) && TextGranularity.m6420equalsimpl0(i, TextGranularity.INSTANCE.m6425getWordDRrd7Zo())) ? 1 : 0;
    }
}
