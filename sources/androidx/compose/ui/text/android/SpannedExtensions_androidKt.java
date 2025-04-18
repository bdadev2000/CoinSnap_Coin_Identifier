package androidx.compose.ui.text.android;

import android.text.Spanned;

/* loaded from: classes2.dex */
public final class SpannedExtensions_androidKt {
    public static final boolean a(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
