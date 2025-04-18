package okhttp3;

import android.support.v4.media.d;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

/* loaded from: classes3.dex */
public final class CacheControl {

    @Nullable
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();

    @NotNull
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).build();

    /* loaded from: classes3.dex */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j2) {
            return j2 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j2;
        }

        @NotNull
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        @NotNull
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @NotNull
        public final Builder maxAge(int i2, @NotNull TimeUnit timeUnit) {
            a.s(timeUnit, "timeUnit");
            if (i2 < 0) {
                throw new IllegalArgumentException(d.i("maxAge < 0: ", i2).toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i2));
            return this;
        }

        @NotNull
        public final Builder maxStale(int i2, @NotNull TimeUnit timeUnit) {
            a.s(timeUnit, "timeUnit");
            if (i2 < 0) {
                throw new IllegalArgumentException(d.i("maxStale < 0: ", i2).toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i2));
            return this;
        }

        @NotNull
        public final Builder minFresh(int i2, @NotNull TimeUnit timeUnit) {
            a.s(timeUnit, "timeUnit");
            if (i2 < 0) {
                throw new IllegalArgumentException(d.i("minFresh < 0: ", i2).toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i2));
            return this;
        }

        @NotNull
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @NotNull
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @NotNull
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @NotNull
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                if (m.N0(str2, str.charAt(i2))) {
                    return i2;
                }
                i2++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return companion.indexOfElement(str, str2, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r27) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    public /* synthetic */ CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str, k kVar) {
        this(z2, z3, i2, i3, z4, z5, z6, i4, i5, z7, z8, z9, str);
    }

    @NotNull
    public static final CacheControl parse(@NotNull Headers headers) {
        return Companion.parse(headers);
    }

    @d0.a
    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m642deprecated_immutable() {
        return this.immutable;
    }

    @d0.a
    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m643deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @d0.a
    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m644deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @d0.a
    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m645deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @d0.a
    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m646deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @d0.a
    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m647deprecated_noCache() {
        return this.noCache;
    }

    @d0.a
    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m648deprecated_noStore() {
        return this.noStore;
    }

    @d0.a
    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m649deprecated_noTransform() {
        return this.noTransform;
    }

    @d0.a
    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m650deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @d0.a
    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m651deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @NotNull
    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = sb2;
        return sb2;
    }

    private CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.noCache = z2;
        this.noStore = z3;
        this.maxAgeSeconds = i2;
        this.sMaxAgeSeconds = i3;
        this.isPrivate = z4;
        this.isPublic = z5;
        this.mustRevalidate = z6;
        this.maxStaleSeconds = i4;
        this.minFreshSeconds = i5;
        this.onlyIfCached = z7;
        this.noTransform = z8;
        this.immutable = z9;
        this.headerValue = str;
    }
}
