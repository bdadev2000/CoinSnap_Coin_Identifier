package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class RenderNodeVerificationHelper24 {

    /* renamed from: a, reason: collision with root package name */
    public static final RenderNodeVerificationHelper24 f15252a = new Object();

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
