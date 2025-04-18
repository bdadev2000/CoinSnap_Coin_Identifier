package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class RenderNodeVerificationHelper28 {

    /* renamed from: a, reason: collision with root package name */
    public static final RenderNodeVerificationHelper28 f15253a = new Object();

    @DoNotInline
    public final int a(@NotNull RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    @DoNotInline
    public final int b(@NotNull RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    @DoNotInline
    public final void c(@NotNull RenderNode renderNode, int i2) {
        renderNode.setAmbientShadowColor(i2);
    }

    @DoNotInline
    public final void d(@NotNull RenderNode renderNode, int i2) {
        renderNode.setSpotShadowColor(i2);
    }
}
