package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes3.dex */
public final class Api34StartStylusHandwriting {

    /* renamed from: a, reason: collision with root package name */
    public static final Api34StartStylusHandwriting f6368a = new Object();

    @DoNotInline
    public final void a(@NotNull android.view.inputmethod.InputMethodManager inputMethodManager, @NotNull View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
