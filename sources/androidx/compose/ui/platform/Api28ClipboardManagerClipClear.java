package androidx.compose.ui.platform;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class Api28ClipboardManagerClipClear {
    @DoNotInline
    public static final void a(@NotNull android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
