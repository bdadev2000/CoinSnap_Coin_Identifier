package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.annotation.RequiresApi;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.ConcurrencyHelpers;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class BackgroundDefaultConfig extends EmojiCompat.Config {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a, reason: collision with root package name */
        public final Context f19523a;

        public BackgroundDefaultLoader(Context context) {
            this.f19523a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void a(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.b
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader = EmojiCompatInitializer.BackgroundDefaultLoader.this;
                    final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = metadataRepoLoaderCallback;
                    final ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    backgroundDefaultLoader.getClass();
                    try {
                        FontRequestEmojiCompatConfig a2 = DefaultEmojiCompatConfig.a(backgroundDefaultLoader.f19523a);
                        if (a2 == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = (FontRequestEmojiCompatConfig.FontRequestMetadataLoader) a2.f19516a;
                        synchronized (fontRequestMetadataLoader.d) {
                            fontRequestMetadataLoader.f19547f = threadPoolExecutor2;
                        }
                        a2.f19516a.a(new EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
                            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                            public final void a(Throwable th) {
                                ThreadPoolExecutor threadPoolExecutor3 = threadPoolExecutor2;
                                try {
                                    EmojiCompat.MetadataRepoLoaderCallback.this.a(th);
                                } finally {
                                    threadPoolExecutor3.shutdown();
                                }
                            }

                            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                            public final void b(MetadataRepo metadataRepo) {
                                ThreadPoolExecutor threadPoolExecutor3 = threadPoolExecutor2;
                                try {
                                    EmojiCompat.MetadataRepoLoaderCallback.this.b(metadataRepo);
                                } finally {
                                    threadPoolExecutor3.shutdown();
                                }
                            }
                        });
                    } catch (Throwable th) {
                        metadataRepoLoaderCallback2.a(th);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static class LoadEmojiCompatRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i2 = TraceCompat.f18616a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.g()) {
                    EmojiCompat.a().h();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i3 = TraceCompat.f18616a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // androidx.startup.Initializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean create(Context context) {
        Object obj;
        EmojiCompat.Config config = new EmojiCompat.Config(new BackgroundDefaultLoader(context));
        config.f19517b = 1;
        if (EmojiCompat.f19504k == null) {
            synchronized (EmojiCompat.f19503j) {
                try {
                    if (EmojiCompat.f19504k == null) {
                        EmojiCompat.f19504k = new EmojiCompat(config);
                    }
                } finally {
                }
            }
        }
        AppInitializer c2 = AppInitializer.c(context);
        c2.getClass();
        synchronized (AppInitializer.e) {
            try {
                obj = c2.f21500a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final Lifecycle lifecycle = ((LifecycleOwner) obj).getLifecycle();
        lifecycle.a(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? ConcurrencyHelpers.Handler28Impl.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Object(), 500L);
                lifecycle.d(this);
            }
        });
        return Boolean.TRUE;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
