package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes4.dex */
final class ViewLayerVerificationHelper31 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewLayerVerificationHelper31 f16642a = new Object();

    @DoNotInline
    public final void a(@NotNull View view, @Nullable RenderEffect renderEffect) {
        view.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
    }
}
