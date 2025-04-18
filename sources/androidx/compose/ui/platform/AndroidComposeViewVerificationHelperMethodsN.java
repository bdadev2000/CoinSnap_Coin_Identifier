package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes2.dex */
final class AndroidComposeViewVerificationHelperMethodsN {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewVerificationHelperMethodsN f16322a = new Object();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view, @Nullable PointerIcon pointerIcon) {
        android.view.PointerIcon systemIcon;
        if (pointerIcon instanceof AndroidPointerIcon) {
            ((AndroidPointerIcon) pointerIcon).getClass();
            systemIcon = null;
        } else {
            systemIcon = pointerIcon instanceof AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(view.getContext(), ((AndroidPointerIconType) pointerIcon).f15544b) : android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (p0.a.g(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
