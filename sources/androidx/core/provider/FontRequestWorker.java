package androidx.core.provider;

import android.graphics.Typeface;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FontRequestWorker {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache f18628a = new LruCache(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f18629b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18630c;
    public static final SimpleArrayMap d;

    /* loaded from: classes3.dex */
    public static final class TypefaceResult {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f18639a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18640b;

        public TypefaceResult(int i2) {
            this.f18639a = null;
            this.f18640b = i2;
        }

        public TypefaceResult(Typeface typeface) {
            this.f18639a = typeface;
            this.f18640b = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, androidx.core.provider.RequestExecutor$DefaultThreadFactory, java.util.concurrent.ThreadFactory] */
    static {
        ?? obj = new Object();
        obj.f18646a = "fonts-androidx";
        obj.f18647b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f18629b = threadPoolExecutor;
        f18630c = new Object();
        d = new SimpleArrayMap(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.provider.FontRequestWorker.TypefaceResult a(java.lang.String r6, android.content.Context r7, androidx.core.provider.FontRequest r8, int r9) {
        /*
            androidx.collection.LruCache r0 = androidx.core.provider.FontRequestWorker.f18628a
            java.lang.Object r1 = r0.get(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            androidx.core.provider.FontRequestWorker$TypefaceResult r6 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r6.<init>(r1)
            return r6
        L10:
            androidx.core.provider.FontsContractCompat$FontFamilyResult r8 = androidx.core.provider.FontProvider.a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L58
            r1 = 1
            r2 = -3
            androidx.core.provider.FontsContractCompat$FontInfo[] r3 = r8.f18642b
            int r8 = r8.f18641a
            if (r8 == 0) goto L22
            if (r8 == r1) goto L20
        L1e:
            r1 = r2
            goto L3b
        L20:
            r1 = -2
            goto L3b
        L22:
            if (r3 == 0) goto L3b
            int r8 = r3.length
            if (r8 != 0) goto L28
            goto L3b
        L28:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L2b:
            if (r4 >= r8) goto L3b
            r5 = r3[r4]
            int r5 = r5.e
            if (r5 == 0) goto L38
            if (r5 >= 0) goto L36
            goto L1e
        L36:
            r1 = r5
            goto L3b
        L38:
            int r4 = r4 + 1
            goto L2b
        L3b:
            if (r1 == 0) goto L43
            androidx.core.provider.FontRequestWorker$TypefaceResult r6 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r6.<init>(r1)
            return r6
        L43:
            android.graphics.Typeface r7 = androidx.core.graphics.TypefaceCompat.a(r7, r3, r9)
            if (r7 == 0) goto L52
            r0.put(r6, r7)
            androidx.core.provider.FontRequestWorker$TypefaceResult r6 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r6.<init>(r7)
            return r6
        L52:
            androidx.core.provider.FontRequestWorker$TypefaceResult r6 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r6.<init>(r2)
            return r6
        L58:
            androidx.core.provider.FontRequestWorker$TypefaceResult r6 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontRequestWorker.a(java.lang.String, android.content.Context, androidx.core.provider.FontRequest, int):androidx.core.provider.FontRequestWorker$TypefaceResult");
    }
}
