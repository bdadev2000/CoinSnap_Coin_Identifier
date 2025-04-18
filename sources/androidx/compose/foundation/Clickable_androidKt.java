package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.ui.input.key.Key_androidKt;

/* loaded from: classes2.dex */
public final class Clickable_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2655a = ViewConfiguration.getTapTimeout();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2656b = 0;

    public static final boolean a(KeyEvent keyEvent) {
        int a2 = (int) (Key_androidKt.a(keyEvent.getKeyCode()) >> 32);
        return a2 == 23 || a2 == 66 || a2 == 160;
    }
}
