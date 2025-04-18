package androidx.compose.ui.input.key;

/* loaded from: classes4.dex */
public final class KeyEvent_androidKt {
    public static final int a(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
