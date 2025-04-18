package df;

import android.opengl.EGLSurface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public final EGLSurface a;

    public e(EGLSurface eGLSurface) {
        this.a = eGLSurface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        EGLSurface eGLSurface = this.a;
        if (eGLSurface == null) {
            return 0;
        }
        return eGLSurface.hashCode();
    }

    public final String toString() {
        return "EglSurface(native=" + this.a + ')';
    }
}
