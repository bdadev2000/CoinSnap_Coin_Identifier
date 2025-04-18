package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 f6377a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        View view = (View) obj;
        return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImpl(view) : new ComposeInputMethodManagerImpl(view);
    }
}
