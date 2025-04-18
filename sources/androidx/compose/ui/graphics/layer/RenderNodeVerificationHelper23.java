package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class RenderNodeVerificationHelper23 {
    @DoNotInline
    public final void a(@NotNull RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
