package androidx.compose.ui.platform;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class JvmActuals_jvmKt {
    public static final String a(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        p0.a.r(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
}
