package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Trace;
import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    public static final FontProviderHelper d = new Object();

    /* loaded from: classes2.dex */
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class FontProviderHelper {
    }

    /* loaded from: classes2.dex */
    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a, reason: collision with root package name */
        public final Context f19544a;

        /* renamed from: b, reason: collision with root package name */
        public final FontRequest f19545b;

        /* renamed from: c, reason: collision with root package name */
        public final FontProviderHelper f19546c;
        public final Object d;
        public Handler e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f19547f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f19548g;

        /* renamed from: h, reason: collision with root package name */
        public EmojiCompat.MetadataRepoLoaderCallback f19549h;

        /* renamed from: i, reason: collision with root package name */
        public ContentObserver f19550i;

        /* renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass1 extends ContentObserver {
            @Override // android.database.ContentObserver
            public final void onChange(boolean z2, Uri uri) {
                throw null;
            }
        }

        public FontRequestMetadataLoader(Context context, FontRequest fontRequest) {
            FontProviderHelper fontProviderHelper = FontRequestEmojiCompatConfig.d;
            this.d = new Object();
            if (context == null) {
                throw new NullPointerException("Context cannot be null");
            }
            this.f19544a = context.getApplicationContext();
            this.f19545b = fontRequest;
            this.f19546c = fontProviderHelper;
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            synchronized (this.d) {
                this.f19549h = metadataRepoLoaderCallback;
            }
            c();
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.f19549h = null;
                    ContentObserver contentObserver = this.f19550i;
                    if (contentObserver != null) {
                        FontProviderHelper fontProviderHelper = this.f19546c;
                        Context context = this.f19544a;
                        fontProviderHelper.getClass();
                        context.getContentResolver().unregisterContentObserver(contentObserver);
                        this.f19550i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f19548g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f19547f = null;
                    this.f19548g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            synchronized (this.d) {
                try {
                    if (this.f19549h == null) {
                        return;
                    }
                    if (this.f19547f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f19548g = threadPoolExecutor;
                        this.f19547f = threadPoolExecutor;
                    }
                    final int i2 = 0;
                    this.f19547f.execute(new Runnable(this) { // from class: androidx.emoji2.text.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f19571b;

                        {
                            this.f19571b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = this.f19571b;
                                    synchronized (fontRequestMetadataLoader.d) {
                                        try {
                                            if (fontRequestMetadataLoader.f19549h == null) {
                                                return;
                                            }
                                            try {
                                                FontsContractCompat.FontInfo d = fontRequestMetadataLoader.d();
                                                int i3 = d.e;
                                                if (i3 == 2) {
                                                    synchronized (fontRequestMetadataLoader.d) {
                                                    }
                                                }
                                                if (i3 != 0) {
                                                    throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                                                }
                                                try {
                                                    int i4 = TraceCompat.f18616a;
                                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                    FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper = fontRequestMetadataLoader.f19546c;
                                                    Context context = fontRequestMetadataLoader.f19544a;
                                                    fontProviderHelper.getClass();
                                                    Typeface a2 = TypefaceCompat.a(context, new FontsContractCompat.FontInfo[]{d}, 0);
                                                    MappedByteBuffer e = TypefaceCompatUtil.e(fontRequestMetadataLoader.f19544a, d.f18643a);
                                                    if (e == null || a2 == null) {
                                                        throw new RuntimeException("Unable to open file.");
                                                    }
                                                    try {
                                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                        MetadataRepo metadataRepo = new MetadataRepo(a2, MetadataListReader.a(e));
                                                        Trace.endSection();
                                                        Trace.endSection();
                                                        synchronized (fontRequestMetadataLoader.d) {
                                                            try {
                                                                EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = fontRequestMetadataLoader.f19549h;
                                                                if (metadataRepoLoaderCallback != null) {
                                                                    metadataRepoLoaderCallback.b(metadataRepo);
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        fontRequestMetadataLoader.b();
                                                        return;
                                                    } finally {
                                                        int i5 = TraceCompat.f18616a;
                                                        Trace.endSection();
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                synchronized (fontRequestMetadataLoader.d) {
                                                    try {
                                                        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = fontRequestMetadataLoader.f19549h;
                                                        if (metadataRepoLoaderCallback2 != null) {
                                                            metadataRepoLoaderCallback2.a(th2);
                                                        }
                                                        fontRequestMetadataLoader.b();
                                                        return;
                                                    } finally {
                                                    }
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                default:
                                    this.f19571b.c();
                                    return;
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final FontsContractCompat.FontInfo d() {
            try {
                FontProviderHelper fontProviderHelper = this.f19546c;
                Context context = this.f19544a;
                FontRequest fontRequest = this.f19545b;
                fontProviderHelper.getClass();
                FontsContractCompat.FontFamilyResult a2 = FontsContractCompat.a(context, fontRequest);
                int i2 = a2.f18641a;
                if (i2 != 0) {
                    throw new RuntimeException(d.j("fetchFonts failed (", i2, ")"));
                }
                FontsContractCompat.FontInfo[] fontInfoArr = a2.f18642b;
                if (fontInfoArr == null || fontInfoArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return fontInfoArr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class RetryPolicy {
    }
}
