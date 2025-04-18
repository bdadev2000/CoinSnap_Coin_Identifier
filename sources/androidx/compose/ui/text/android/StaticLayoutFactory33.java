package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.activity.e;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes4.dex */
public final class StaticLayoutFactory33 {
    @DoNotInline
    public static final boolean a(@NotNull StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    @DoNotInline
    public static final void b(@NotNull StaticLayout.Builder builder, int i2, int i3) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = e.b().setLineBreakStyle(i2);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i3);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
