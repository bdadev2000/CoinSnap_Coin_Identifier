package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
public final class OutlineVerificationHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final OutlineVerificationHelper f15250a = new Object();

    @DoNotInline
    public final void a(@NotNull Outline outline, @NotNull Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((AndroidPath) path).f14938a);
    }
}
