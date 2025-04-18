package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@RequiresApi
/* loaded from: classes4.dex */
public final class TextToolbarHelperMethods {

    /* renamed from: a, reason: collision with root package name */
    public static final TextToolbarHelperMethods f16600a = new Object();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @DoNotInline
    @RequiresApi
    @Nullable
    public final ActionMode b(@NotNull View view, @NotNull ActionMode.Callback callback, int i2) {
        return view.startActionMode(callback, i2);
    }
}
