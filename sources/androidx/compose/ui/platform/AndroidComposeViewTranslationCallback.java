package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes4.dex */
public final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewTranslationCallback f16320a = new Object();

    public final boolean onClearTranslation(View view) {
        p0.a.q(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().f();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        p0.a.q(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().h();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        p0.a.q(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().i();
        return true;
    }
}
