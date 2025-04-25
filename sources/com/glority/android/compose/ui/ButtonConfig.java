package com.glority.android.compose.ui;

import androidx.compose.ui.text.font.FontWeight;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/glority/android/compose/ui/ButtonConfig;", "", TtmlNode.ATTR_TTS_FONT_SIZE, "", "verticalPadding", "horizontalPadding", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "(IIILandroidx/compose/ui/text/font/FontWeight;)V", "getFontSize", "()I", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getHorizontalPadding", "getVerticalPadding", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
final class ButtonConfig {
    private final int fontSize;
    private final FontWeight fontWeight;
    private final int horizontalPadding;
    private final int verticalPadding;

    public ButtonConfig(int i, int i2, int i3, FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontSize = i;
        this.verticalPadding = i2;
        this.horizontalPadding = i3;
        this.fontWeight = fontWeight;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }
}
