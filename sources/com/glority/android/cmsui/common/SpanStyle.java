package com.glority.android.cmsui.common;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SpanStyle.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/glority/android/cmsui/common/SpanStyle;", "", "parent", "", "child", "(Ljava/lang/String;Ljava/lang/String;)V", TtmlNode.BOLD, "", "getChild", "()Ljava/lang/String;", "color", "", TtmlNode.ITALIC, "getParent", "textSize", "create", "Landroid/text/SpannableString;", "setBold", "setItalic", "setTextColor", "textColor", "setTextSize", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class SpanStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean bold;
    private final String child;
    private int color;
    private boolean italic;
    private final String parent;
    private int textSize;

    public SpanStyle(String parent, String child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        this.parent = parent;
        this.child = child;
    }

    public final String getChild() {
        return this.child;
    }

    public final String getParent() {
        return this.parent;
    }

    public final SpanStyle setTextColor(int textColor) {
        this.color = textColor;
        return this;
    }

    public final SpanStyle setTextSize(int textSize) {
        this.textSize = textSize;
        return this;
    }

    public final SpanStyle setBold() {
        this.bold = true;
        return this;
    }

    public final SpanStyle setItalic() {
        this.italic = true;
        return this;
    }

    public final SpannableString create() {
        SpannableString spannableString = new SpannableString(this.parent);
        if (this.child.length() == 0) {
            return spannableString;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, this.child, 0, false, 6, (Object) null);
        int length = this.child.length() + indexOf$default;
        if (this.color != 0 && indexOf$default >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(this.color), indexOf$default, length, 17);
        }
        if (this.textSize > 0 && indexOf$default >= 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(this.textSize), indexOf$default, length, 17);
        }
        if (this.bold && indexOf$default >= 0) {
            spannableString.setSpan(new StyleSpan(1), indexOf$default, length, 17);
        }
        if (this.italic && indexOf$default >= 0) {
            spannableString.setSpan(new StyleSpan(2), indexOf$default, length, 17);
        }
        return spannableString;
    }

    /* compiled from: SpanStyle.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\tJ/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\tJ/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\f2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/glority/android/cmsui/common/SpanStyle$Companion;", "", "()V", "setSpanBold", "Landroid/text/SpannableString;", "spannableString", "childes", "", "", "(Landroid/text/SpannableString;[Ljava/lang/String;)Landroid/text/SpannableString;", "setSpanColor", "color", "", "(Landroid/text/SpannableString;I[Ljava/lang/String;)Landroid/text/SpannableString;", "setSpanItalic", "setSpanSize", "textSize", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SpannableString setSpanBold(SpannableString spannableString, String... childes) {
            Intrinsics.checkNotNullParameter(spannableString, "spannableString");
            Intrinsics.checkNotNullParameter(childes, "childes");
            for (String str : childes) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null);
                int length = str.length() + indexOf$default;
                if (indexOf$default >= 0) {
                    spannableString.setSpan(new StyleSpan(1), indexOf$default, length, 17);
                }
            }
            return spannableString;
        }

        public final SpannableString setSpanItalic(SpannableString spannableString, String... childes) {
            Intrinsics.checkNotNullParameter(spannableString, "spannableString");
            Intrinsics.checkNotNullParameter(childes, "childes");
            for (String str : childes) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null);
                int length = str.length() + indexOf$default;
                if (indexOf$default >= 0) {
                    spannableString.setSpan(new StyleSpan(2), indexOf$default, length, 17);
                }
            }
            return spannableString;
        }

        public final SpannableString setSpanSize(SpannableString spannableString, int textSize, String... childes) {
            Intrinsics.checkNotNullParameter(spannableString, "spannableString");
            Intrinsics.checkNotNullParameter(childes, "childes");
            for (String str : childes) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null);
                int length = str.length() + indexOf$default;
                if (indexOf$default >= 0) {
                    spannableString.setSpan(new AbsoluteSizeSpan(textSize), indexOf$default, length, 17);
                }
            }
            return spannableString;
        }

        public final SpannableString setSpanColor(SpannableString spannableString, int color, String... childes) {
            Intrinsics.checkNotNullParameter(spannableString, "spannableString");
            Intrinsics.checkNotNullParameter(childes, "childes");
            for (String str : childes) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null);
                int length = str.length() + indexOf$default;
                if (indexOf$default >= 0) {
                    spannableString.setSpan(new ForegroundColorSpan(color), indexOf$default, length, 17);
                }
            }
            return spannableString;
        }
    }
}
