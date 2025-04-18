package androidx.compose.ui.input.key;

import p0.a;

/* loaded from: classes4.dex */
public final class KeyEvent {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.KeyEvent f15514a;

    public final boolean equals(Object obj) {
        if (obj instanceof KeyEvent) {
            return a.g(this.f15514a, ((KeyEvent) obj).f15514a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15514a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f15514a + ')';
    }
}
