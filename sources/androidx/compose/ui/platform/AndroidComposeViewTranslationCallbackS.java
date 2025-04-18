package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes3.dex */
public final class AndroidComposeViewTranslationCallbackS {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewTranslationCallbackS f16321a = new Object();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view) {
        view.clearViewTranslationCallback();
    }

    @DoNotInline
    @RequiresApi
    public final void b(@NotNull View view) {
        ViewTranslationCallback unused;
        AndroidComposeViewTranslationCallback androidComposeViewTranslationCallback = AndroidComposeViewTranslationCallback.f16320a;
        unused = AndroidComposeViewTranslationCallback.f16320a;
        view.setViewTranslationCallback(AndroidComposeViewTranslationCallback.f16320a);
    }
}
