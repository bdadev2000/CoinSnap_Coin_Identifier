package df;

import android.opengl.EGLDisplay;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public final EGLDisplay a;

    public c(EGLDisplay eGLDisplay) {
        this.a = eGLDisplay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        EGLDisplay eGLDisplay = this.a;
        if (eGLDisplay == null) {
            return 0;
        }
        return eGLDisplay.hashCode();
    }

    public final String toString() {
        return "EglDisplay(native=" + this.a + ')';
    }
}
