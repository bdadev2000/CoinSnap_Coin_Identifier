package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes3.dex */
public interface Alignment {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14658a = 0;

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final BiasAlignment f14659a = new BiasAlignment(-1.0f, -1.0f);

        /* renamed from: b, reason: collision with root package name */
        public static final BiasAlignment f14660b = new BiasAlignment(0.0f, -1.0f);

        /* renamed from: c, reason: collision with root package name */
        public static final BiasAlignment f14661c = new BiasAlignment(1.0f, -1.0f);
        public static final BiasAlignment d = new BiasAlignment(-1.0f, 0.0f);
        public static final BiasAlignment e = new BiasAlignment(0.0f, 0.0f);

        /* renamed from: f, reason: collision with root package name */
        public static final BiasAlignment f14662f = new BiasAlignment(1.0f, 0.0f);

        /* renamed from: g, reason: collision with root package name */
        public static final BiasAlignment f14663g = new BiasAlignment(-1.0f, 1.0f);

        /* renamed from: h, reason: collision with root package name */
        public static final BiasAlignment f14664h = new BiasAlignment(0.0f, 1.0f);

        /* renamed from: i, reason: collision with root package name */
        public static final BiasAlignment f14665i = new BiasAlignment(1.0f, 1.0f);

        /* renamed from: j, reason: collision with root package name */
        public static final BiasAlignment.Vertical f14666j = new BiasAlignment.Vertical(-1.0f);

        /* renamed from: k, reason: collision with root package name */
        public static final BiasAlignment.Vertical f14667k = new BiasAlignment.Vertical(0.0f);

        /* renamed from: l, reason: collision with root package name */
        public static final BiasAlignment.Vertical f14668l = new BiasAlignment.Vertical(1.0f);

        /* renamed from: m, reason: collision with root package name */
        public static final BiasAlignment.Horizontal f14669m = new BiasAlignment.Horizontal(-1.0f);

        /* renamed from: n, reason: collision with root package name */
        public static final BiasAlignment.Horizontal f14670n = new BiasAlignment.Horizontal(0.0f);

        /* renamed from: o, reason: collision with root package name */
        public static final BiasAlignment.Horizontal f14671o = new BiasAlignment.Horizontal(1.0f);
    }

    @Stable
    /* loaded from: classes3.dex */
    public interface Horizontal {
        int a(int i2, int i3, LayoutDirection layoutDirection);
    }

    @Stable
    /* loaded from: classes3.dex */
    public interface Vertical {
        int a(int i2, int i3);
    }

    long a(long j2, long j3, LayoutDirection layoutDirection);
}
