package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class AndroidComposeViewForceDarkModeQ {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewForceDarkModeQ f16318a = new Object();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view) {
        view.setForceDarkAllowed(false);
    }
}
