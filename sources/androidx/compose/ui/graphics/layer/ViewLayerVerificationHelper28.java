package androidx.compose.ui.graphics.layer;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes3.dex */
final class ViewLayerVerificationHelper28 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewLayerVerificationHelper28 f15265a = new Object();

    @DoNotInline
    public final void a(@NotNull View view) {
        view.resetPivot();
    }

    @DoNotInline
    public final void b(@NotNull View view, int i2) {
        view.setOutlineAmbientShadowColor(i2);
    }

    @DoNotInline
    public final void c(@NotNull View view, int i2) {
        view.setOutlineSpotShadowColor(i2);
    }
}
