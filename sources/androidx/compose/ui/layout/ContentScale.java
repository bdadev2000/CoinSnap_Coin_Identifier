package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface ContentScale {

    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentScale$Companion$Crop$1 f15720a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static final ContentScale$Companion$Fit$1 f15721b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public static final ContentScale$Companion$FillHeight$1 f15722c = new Object();
        public static final ContentScale$Companion$FillWidth$1 d = new Object();
        public static final ContentScale$Companion$Inside$1 e = new Object();

        /* renamed from: f, reason: collision with root package name */
        public static final FixedScale f15723f = new FixedScale();

        /* renamed from: g, reason: collision with root package name */
        public static final ContentScale$Companion$FillBounds$1 f15724g = new Object();
    }

    long a(long j2, long j3);
}
