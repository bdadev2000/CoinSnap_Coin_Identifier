package androidx.compose.ui.platform;

import androidx.compose.ui.unit.DpKt;

/* loaded from: classes.dex */
public interface ViewConfiguration {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    long a();

    void b();

    long c();

    default float d() {
        return 2.0f;
    }

    default long e() {
        float f2 = 48;
        return DpKt.b(f2, f2);
    }

    default float f() {
        return Float.MAX_VALUE;
    }

    float g();

    default float h() {
        return 16.0f;
    }
}
