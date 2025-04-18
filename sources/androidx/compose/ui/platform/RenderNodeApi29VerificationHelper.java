package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes.dex */
final class RenderNodeApi29VerificationHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final RenderNodeApi29VerificationHelper f16571a = new Object();

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode, @Nullable RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
    }
}
