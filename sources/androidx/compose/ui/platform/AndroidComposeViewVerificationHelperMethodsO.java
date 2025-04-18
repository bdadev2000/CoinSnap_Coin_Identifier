package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class AndroidComposeViewVerificationHelperMethodsO {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewVerificationHelperMethodsO f16323a = new Object();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view, int i2, boolean z2) {
        view.setFocusable(i2);
        view.setDefaultFocusHighlightEnabled(z2);
    }
}
