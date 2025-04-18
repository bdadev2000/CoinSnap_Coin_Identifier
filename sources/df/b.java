package df;

import android.opengl.EGLContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final EGLContext a;

    public b(EGLContext eGLContext) {
        this.a = eGLContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        EGLContext eGLContext = this.a;
        if (eGLContext == null) {
            return 0;
        }
        return eGLContext.hashCode();
    }

    public final String toString() {
        return "EglContext(native=" + this.a + ')';
    }
}
