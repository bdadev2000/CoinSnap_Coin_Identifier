package androidx.compose.ui.platform;

import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes4.dex */
public final class WrapperRenderNodeLayerHelperMethods {

    /* renamed from: a, reason: collision with root package name */
    public static final WrapperRenderNodeLayerHelperMethods f16700a = new Object();

    @DoNotInline
    public final void a(@NotNull AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
