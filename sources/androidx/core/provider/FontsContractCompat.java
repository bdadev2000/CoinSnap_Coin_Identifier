package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.BaseColumns;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontRequestWorker;
import androidx.core.util.Consumer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class FontsContractCompat {

    /* loaded from: classes.dex */
    public static final class Columns implements BaseColumns {
    }

    /* loaded from: classes.dex */
    public static class FontFamilyResult {

        /* renamed from: a, reason: collision with root package name */
        public final int f18641a;

        /* renamed from: b, reason: collision with root package name */
        public final FontInfo[] f18642b;

        public FontFamilyResult(int i2, FontInfo[] fontInfoArr) {
            this.f18641a = i2;
            this.f18642b = fontInfoArr;
        }
    }

    /* loaded from: classes.dex */
    public static class FontInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f18643a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18644b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18645c;
        public final boolean d;
        public final int e;

        public FontInfo(Uri uri, int i2, int i3, boolean z2, int i4) {
            uri.getClass();
            this.f18643a = uri;
            this.f18644b = i2;
            this.f18645c = i3;
            this.d = z2;
            this.e = i4;
        }
    }

    /* loaded from: classes.dex */
    public static class FontRequestCallback {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        /* loaded from: classes.dex */
        public @interface FontRequestFailReason {
        }

        public void a(int i2) {
        }

        public void b(Typeface typeface) {
        }
    }

    public static FontFamilyResult a(Context context, FontRequest fontRequest) {
        return FontProvider.a(context, fontRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.core.provider.RequestExecutor$ReplyRunnable, java.lang.Object, java.lang.Runnable] */
    public static Typeface b(final Context context, final FontRequest fontRequest, final int i2, boolean z2, int i3, Handler handler, TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter) {
        final CallbackWithHandler callbackWithHandler = new CallbackWithHandler(resourcesCallbackAdapter, handler);
        if (z2) {
            LruCache lruCache = FontRequestWorker.f18628a;
            final String str = fontRequest.e + "-" + i2;
            Typeface typeface = (Typeface) FontRequestWorker.f18628a.get(str);
            if (typeface != null) {
                callbackWithHandler.a(new FontRequestWorker.TypefaceResult(typeface));
                return typeface;
            }
            if (i3 == -1) {
                FontRequestWorker.TypefaceResult a2 = FontRequestWorker.a(str, context, fontRequest, i2);
                callbackWithHandler.a(a2);
                return a2.f18639a;
            }
            try {
                try {
                    try {
                        FontRequestWorker.TypefaceResult typefaceResult = (FontRequestWorker.TypefaceResult) FontRequestWorker.f18629b.submit(new Callable<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                            @Override // java.util.concurrent.Callable
                            public final TypefaceResult call() {
                                return FontRequestWorker.a(str, context, fontRequest, i2);
                            }
                        }).get(i3, TimeUnit.MILLISECONDS);
                        callbackWithHandler.a(typefaceResult);
                        return typefaceResult.f18639a;
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    } catch (TimeoutException unused) {
                        throw new InterruptedException("timeout");
                    }
                } catch (InterruptedException e2) {
                    throw e2;
                }
            } catch (InterruptedException unused2) {
                callbackWithHandler.a(new FontRequestWorker.TypefaceResult(-3));
                return null;
            }
        }
        LruCache lruCache2 = FontRequestWorker.f18628a;
        final String str2 = fontRequest.e + "-" + i2;
        Typeface typeface2 = (Typeface) FontRequestWorker.f18628a.get(str2);
        if (typeface2 != null) {
            callbackWithHandler.a(new FontRequestWorker.TypefaceResult(typeface2));
            return typeface2;
        }
        Consumer<FontRequestWorker.TypefaceResult> consumer = new Consumer<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                TypefaceResult typefaceResult2 = (TypefaceResult) obj;
                if (typefaceResult2 == null) {
                    typefaceResult2 = new TypefaceResult(-3);
                }
                CallbackWithHandler.this.a(typefaceResult2);
            }
        };
        synchronized (FontRequestWorker.f18630c) {
            try {
                SimpleArrayMap simpleArrayMap = FontRequestWorker.d;
                ArrayList arrayList = (ArrayList) simpleArrayMap.get(str2);
                if (arrayList != null) {
                    arrayList.add(consumer);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(consumer);
                    simpleArrayMap.put(str2, arrayList2);
                    Callable<FontRequestWorker.TypefaceResult> callable = new Callable<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.3
                        @Override // java.util.concurrent.Callable
                        public final TypefaceResult call() {
                            try {
                                return FontRequestWorker.a(str2, context, fontRequest, i2);
                            } catch (Throwable unused3) {
                                return new TypefaceResult(-3);
                            }
                        }
                    };
                    ThreadPoolExecutor threadPoolExecutor = FontRequestWorker.f18629b;
                    Consumer<FontRequestWorker.TypefaceResult> consumer2 = new Consumer<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            TypefaceResult typefaceResult2 = (TypefaceResult) obj;
                            synchronized (FontRequestWorker.f18630c) {
                                try {
                                    SimpleArrayMap simpleArrayMap2 = FontRequestWorker.d;
                                    ArrayList arrayList3 = (ArrayList) simpleArrayMap2.get(str2);
                                    if (arrayList3 == null) {
                                        return;
                                    }
                                    simpleArrayMap2.remove(str2);
                                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                        ((Consumer) arrayList3.get(i4)).accept(typefaceResult2);
                                    }
                                } finally {
                                }
                            }
                        }
                    };
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    ?? obj = new Object();
                    obj.f18649a = callable;
                    obj.f18650b = consumer2;
                    obj.f18651c = handler2;
                    threadPoolExecutor.execute(obj);
                }
            } finally {
            }
        }
        return null;
    }
}
