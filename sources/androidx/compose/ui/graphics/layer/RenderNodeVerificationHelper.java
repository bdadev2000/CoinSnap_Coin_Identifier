package androidx.compose.ui.graphics.layer;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes3.dex */
public final class RenderNodeVerificationHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final RenderNodeVerificationHelper f15251a = new Object();

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode, @Nullable RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
    }
}
