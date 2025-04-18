package androidx.compose.foundation.lazy.layout;

/* loaded from: classes3.dex */
public interface LazyLayoutKeyIndexMap {

    /* loaded from: classes3.dex */
    public static final class Empty implements LazyLayoutKeyIndexMap {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Empty f4795a = new Object();

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public final int b(Object obj) {
            return -1;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public final /* bridge */ /* synthetic */ Object c(int i2) {
            return null;
        }
    }

    int b(Object obj);

    Object c(int i2);
}
