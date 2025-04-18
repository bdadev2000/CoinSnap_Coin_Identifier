package androidx.compose.foundation.layout;

import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public final class WindowInsetsConnection_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f4132a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f4133b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f4134c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f4133b = log;
        f4134c = log - 1.0d;
    }
}
