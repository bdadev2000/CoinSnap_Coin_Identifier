package androidx.compose.ui.input.pointer;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
public final class PointerKeyboardModifiers {

    /* renamed from: a, reason: collision with root package name */
    public final int f15638a;

    public /* synthetic */ PointerKeyboardModifiers(int i2) {
        this.f15638a = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PointerKeyboardModifiers) {
            return this.f15638a == ((PointerKeyboardModifiers) obj).f15638a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15638a);
    }

    public final String toString() {
        return d.o(new StringBuilder("PointerKeyboardModifiers(packedValue="), this.f15638a, ')');
    }
}
