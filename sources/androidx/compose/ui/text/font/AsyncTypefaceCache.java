package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.ContainerHelpersKt;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.SynchronizedObject;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class AsyncTypefaceCache {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f17213a = new LruCache(16);

    /* renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap f17214b;

    /* renamed from: c, reason: collision with root package name */
    public final SynchronizedObject f17215c;

    /* loaded from: classes.dex */
    public static final class AsyncTypefaceResult {

        /* renamed from: a, reason: collision with root package name */
        public final Object f17216a;

        public /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.f17216a = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof AsyncTypefaceResult) {
                return a.g(this.f17216a, ((AsyncTypefaceResult) obj).f17216a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f17216a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.f17216a + ')';
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Key {

        /* renamed from: a, reason: collision with root package name */
        public final Font f17217a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f17218b;

        public Key(Font font, Object obj) {
            this.f17217a = font;
            this.f17218b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return a.g(this.f17217a, key.f17217a) && a.g(this.f17218b, key.f17218b);
        }

        public final int hashCode() {
            int hashCode = this.f17217a.hashCode() * 31;
            Object obj = this.f17218b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Key(font=" + this.f17217a + ", loaderKey=" + this.f17218b + ')';
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.text.caches.SimpleArrayMap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.compose.ui.text.platform.SynchronizedObject] */
    public AsyncTypefaceCache() {
        ?? obj = new Object();
        obj.f17180a = ContainerHelpersKt.f17173a;
        obj.f17181b = ContainerHelpersKt.f17174b;
        obj.f17182c = 0;
        this.f17214b = obj;
        this.f17215c = new Object();
    }

    public static void a(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj) {
        asyncTypefaceCache.getClass();
        platformFontLoader.b();
        Object obj2 = null;
        Key key = new Key(font, null);
        synchronized (asyncTypefaceCache.f17215c) {
            try {
                if (obj == null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.compose.ui.text.font.Font r7, androidx.compose.ui.text.font.PlatformFontLoader r8, boolean r9, q0.l r10, h0.g r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.f17223g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17223g = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f17223g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            boolean r9 = r0.f17221c
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r7 = r0.f17220b
            androidx.compose.ui.text.font.AsyncTypefaceCache r8 = r0.f17219a
            kotlin.jvm.internal.q.m(r11)
            goto L73
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.jvm.internal.q.m(r11)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r11 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            r8.b()
            r11.<init>(r7, r3)
            androidx.compose.ui.text.platform.SynchronizedObject r7 = r6.f17215c
            monitor-enter(r7)
            androidx.compose.ui.text.caches.LruCache r8 = r6.f17213a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r8 = r8.a(r11)     // Catch: java.lang.Throwable -> L57
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r8     // Catch: java.lang.Throwable -> L57
            if (r8 != 0) goto L59
            androidx.compose.ui.text.caches.SimpleArrayMap r8 = r6.f17214b     // Catch: java.lang.Throwable -> L57
            java.lang.Object r8 = r8.a(r11)     // Catch: java.lang.Throwable -> L57
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r8     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r8 = move-exception
            goto La0
        L59:
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r8.f17216a     // Catch: java.lang.Throwable -> L57
            monitor-exit(r7)
            return r8
        L5f:
            monitor-exit(r7)
            r0.f17219a = r6
            r0.f17220b = r11
            r0.f17221c = r9
            r0.f17223g = r4
            java.lang.Object r7 = r10.invoke(r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r8 = r6
            r5 = r11
            r11 = r7
            r7 = r5
        L73:
            androidx.compose.ui.text.platform.SynchronizedObject r10 = r8.f17215c
            monitor-enter(r10)
            if (r11 != 0) goto L85
            androidx.compose.ui.text.caches.SimpleArrayMap r8 = r8.f17214b     // Catch: java.lang.Throwable -> L83
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult     // Catch: java.lang.Throwable -> L83
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L83
            r8.d(r7, r9)     // Catch: java.lang.Throwable -> L83
            goto L9c
        L83:
            r7 = move-exception
            goto L9e
        L85:
            if (r9 == 0) goto L92
            androidx.compose.ui.text.caches.SimpleArrayMap r8 = r8.f17214b     // Catch: java.lang.Throwable -> L83
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult     // Catch: java.lang.Throwable -> L83
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L83
            r8.d(r7, r9)     // Catch: java.lang.Throwable -> L83
            goto L9c
        L92:
            androidx.compose.ui.text.caches.LruCache r8 = r8.f17213a     // Catch: java.lang.Throwable -> L83
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult     // Catch: java.lang.Throwable -> L83
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L83
            r8.b(r7, r9)     // Catch: java.lang.Throwable -> L83
        L9c:
            monitor-exit(r10)
            return r11
        L9e:
            monitor-exit(r10)
            throw r7
        La0:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.b(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, q0.l, h0.g):java.lang.Object");
    }
}
