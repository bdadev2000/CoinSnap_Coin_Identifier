package androidx.compose.runtime;

/* loaded from: classes3.dex */
public final class PreconditionsKt {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }
}
