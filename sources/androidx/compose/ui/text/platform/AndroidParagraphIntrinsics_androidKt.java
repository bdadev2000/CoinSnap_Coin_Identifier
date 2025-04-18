package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;

/* loaded from: classes4.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    public static final boolean a(TextStyle textStyle) {
        PlatformParagraphStyle platformParagraphStyle;
        PlatformTextStyle platformTextStyle = textStyle.f17061c;
        EmojiSupportMatch emojiSupportMatch = (platformTextStyle == null || (platformParagraphStyle = platformTextStyle.f16950b) == null) ? null : new EmojiSupportMatch(platformParagraphStyle.f16947b);
        boolean z2 = false;
        if (emojiSupportMatch != null && emojiSupportMatch.f16904a == 1) {
            z2 = true;
        }
        return !z2;
    }
}
