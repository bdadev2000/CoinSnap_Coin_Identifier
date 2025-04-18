package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import q0.l;

/* loaded from: classes3.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper a(InputConnection inputConnection, l lVar) {
        return Build.VERSION.SDK_INT >= 34 ? new NullableInputConnectionWrapperApi21(inputConnection, lVar) : new NullableInputConnectionWrapperApi21(inputConnection, lVar);
    }
}
