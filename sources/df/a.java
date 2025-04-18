package df;

import android.opengl.EGLConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final EGLConfig a;

    public a(EGLConfig eGLConfig) {
        Intrinsics.checkNotNullParameter(eGLConfig, "native");
        this.a = eGLConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EglConfig(native=" + this.a + ')';
    }
}
