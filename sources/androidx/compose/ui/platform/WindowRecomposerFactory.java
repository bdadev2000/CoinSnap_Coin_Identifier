package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;

@InternalComposeUiApi
/* loaded from: classes.dex */
public interface WindowRecomposerFactory {

    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final p f16654a = new Object();
    }

    Recomposer a(View view);
}
