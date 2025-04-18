package androidx.compose.runtime.snapshots;

/* loaded from: classes3.dex */
public final class SnapshotStateListKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14592a = new Object();

    public static final void a(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }
}
