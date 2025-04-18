package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.emoji2.text.EmojiExclusions;
import androidx.emoji2.text.EmojiProcessor;
import androidx.emoji2.text.flatbuffer.MetadataList;
import com.google.android.gms.common.api.Api;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
/* loaded from: classes.dex */
public class EmojiCompat {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f19503j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile EmojiCompat f19504k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f19505a;

    /* renamed from: b, reason: collision with root package name */
    public final ArraySet f19506b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f19507c;
    public final Handler d;
    public final CompatInternal19 e;

    /* renamed from: f, reason: collision with root package name */
    public final MetadataRepoLoader f19508f;

    /* renamed from: g, reason: collision with root package name */
    public final DefaultSpanFactory f19509g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19510h;

    /* renamed from: i, reason: collision with root package name */
    public final GlyphChecker f19511i;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface CodepointSequenceMatchResult {
    }

    /* loaded from: classes.dex */
    public static class CompatInternal {

        /* renamed from: a, reason: collision with root package name */
        public final EmojiCompat f19512a;

        public CompatInternal(EmojiCompat emojiCompat) {
            this.f19512a = emojiCompat;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class CompatInternal19 extends CompatInternal {

        /* renamed from: b, reason: collision with root package name */
        public volatile EmojiProcessor f19513b;

        /* renamed from: c, reason: collision with root package name */
        public volatile MetadataRepo f19514c;

        /* renamed from: androidx.emoji2.text.EmojiCompat$CompatInternal19$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass1 extends MetadataRepoLoaderCallback {
            public AnonymousClass1() {
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public final void a(Throwable th) {
                CompatInternal19.this.f19512a.i(th);
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public final void b(MetadataRepo metadataRepo) {
                CompatInternal19 compatInternal19 = CompatInternal19.this;
                compatInternal19.f19514c = metadataRepo;
                MetadataRepo metadataRepo2 = compatInternal19.f19514c;
                EmojiCompat emojiCompat = compatInternal19.f19512a;
                compatInternal19.f19513b = new EmojiProcessor(metadataRepo2, emojiCompat.f19509g, emojiCompat.f19511i, Build.VERSION.SDK_INT >= 34 ? EmojiExclusions.EmojiExclusions_Api34.a() : EmojiExclusions.EmojiExclusions_Reflections.a());
                compatInternal19.f19512a.j();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Config {

        /* renamed from: a, reason: collision with root package name */
        public final MetadataRepoLoader f19516a;

        /* renamed from: b, reason: collision with root package name */
        public int f19517b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final GlyphChecker f19518c = new DefaultGlyphChecker();

        public Config(MetadataRepoLoader metadataRepoLoader) {
            this.f19516a = metadataRepoLoader;
        }
    }

    @RestrictTo
    /* loaded from: classes.dex */
    public static class DefaultSpanFactory implements SpanFactory {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.emoji2.text.EmojiSpan, androidx.emoji2.text.TypefaceEmojiSpan] */
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public final TypefaceEmojiSpan a(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new EmojiSpan(typefaceEmojiRasterizer);
        }
    }

    /* loaded from: classes.dex */
    public interface GlyphChecker {
        boolean a(CharSequence charSequence, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static abstract class InitCallback {
        public void a() {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class ListenerDispatcher implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19519a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19520b;

        public ListenerDispatcher(List list, int i2, Throwable th) {
            if (list == null) {
                throw new NullPointerException("initCallbacks cannot be null");
            }
            this.f19519a = new ArrayList(list);
            this.f19520b = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f19519a;
            int size = arrayList.size();
            int i2 = 0;
            if (this.f19520b != 1) {
                while (i2 < size) {
                    ((InitCallback) arrayList.get(i2)).a();
                    i2++;
                }
            } else {
                while (i2 < size) {
                    ((InitCallback) arrayList.get(i2)).b();
                    i2++;
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface LoadStrategy {
    }

    /* loaded from: classes.dex */
    public interface MetadataRepoLoader {
        void a(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    /* loaded from: classes.dex */
    public static abstract class MetadataRepoLoaderCallback {
        public abstract void a(Throwable th);

        public abstract void b(MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface ReplaceStrategy {
    }

    /* loaded from: classes.dex */
    public interface SpanFactory {
        TypefaceEmojiSpan a(TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.emoji2.text.EmojiCompat$DefaultSpanFactory, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.emoji2.text.EmojiCompat$CompatInternal, androidx.emoji2.text.EmojiCompat$CompatInternal19] */
    public EmojiCompat(Config config) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f19505a = reentrantReadWriteLock;
        this.f19507c = 3;
        MetadataRepoLoader metadataRepoLoader = config.f19516a;
        this.f19508f = metadataRepoLoader;
        int i2 = config.f19517b;
        this.f19510h = i2;
        this.f19511i = config.f19518c;
        this.d = new Handler(Looper.getMainLooper());
        this.f19506b = new ArraySet(0);
        this.f19509g = new Object();
        ?? compatInternal = new CompatInternal(this);
        this.e = compatInternal;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f19507c = 0;
            } catch (Throwable th) {
                this.f19505a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (d() == 0) {
            try {
                metadataRepoLoader.a(new CompatInternal19.AnonymousClass1());
            } catch (Throwable th2) {
                i(th2);
            }
        }
    }

    public static EmojiCompat a() {
        EmojiCompat emojiCompat;
        synchronized (f19503j) {
            try {
                emojiCompat = f19504k;
                if (!(emojiCompat != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return emojiCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0086, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0079, code lost:
    
        if (r11 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiCompat.e(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean f(Editable editable, int i2, KeyEvent keyEvent) {
        boolean a2;
        if (i2 == 67) {
            a2 = EmojiProcessor.a(editable, keyEvent, false);
        } else {
            if (i2 != 112) {
                return false;
            }
            a2 = EmojiProcessor.a(editable, keyEvent, true);
        }
        if (!a2) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean g() {
        return f19504k != null;
    }

    public final int b(int i2, CharSequence charSequence) {
        EmojiProcessor emojiProcessor = this.e.f19513b;
        emojiProcessor.getClass();
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessor.EmojiProcessLookupCallback) emojiProcessor.c(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Api.BaseClientBuilder.API_PRIORITY_OTHER, true, new EmojiProcessor.EmojiProcessLookupCallback(i2))).f19533c;
    }

    public final int c(int i2, CharSequence charSequence) {
        EmojiProcessor emojiProcessor = this.e.f19513b;
        emojiProcessor.getClass();
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessor.EmojiProcessLookupCallback) emojiProcessor.c(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Api.BaseClientBuilder.API_PRIORITY_OTHER, true, new EmojiProcessor.EmojiProcessLookupCallback(i2))).f19532b;
    }

    public final int d() {
        this.f19505a.readLock().lock();
        try {
            return this.f19507c;
        } finally {
            this.f19505a.readLock().unlock();
        }
    }

    public final void h() {
        if (!(this.f19510h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (d() == 1) {
            return;
        }
        this.f19505a.writeLock().lock();
        try {
            if (this.f19507c == 0) {
                return;
            }
            this.f19507c = 0;
            this.f19505a.writeLock().unlock();
            CompatInternal19 compatInternal19 = this.e;
            EmojiCompat emojiCompat = compatInternal19.f19512a;
            try {
                emojiCompat.f19508f.a(new CompatInternal19.AnonymousClass1());
            } catch (Throwable th) {
                emojiCompat.i(th);
            }
        } finally {
            this.f19505a.writeLock().unlock();
        }
    }

    public final void i(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f19505a.writeLock().lock();
        try {
            this.f19507c = 2;
            arrayList.addAll(this.f19506b);
            this.f19506b.clear();
            this.f19505a.writeLock().unlock();
            this.d.post(new ListenerDispatcher(arrayList, this.f19507c, th));
        } catch (Throwable th2) {
            this.f19505a.writeLock().unlock();
            throw th2;
        }
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        this.f19505a.writeLock().lock();
        try {
            this.f19507c = 1;
            arrayList.addAll(this.f19506b);
            this.f19506b.clear();
            this.f19505a.writeLock().unlock();
            this.d.post(new ListenerDispatcher(arrayList, this.f19507c, null));
        } catch (Throwable th) {
            this.f19505a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:69:0x005f, B:72:0x0064, B:74:0x0068, B:76:0x0075, B:31:0x0091, B:33:0x0099, B:35:0x009c, B:37:0x009f, B:39:0x00ab, B:41:0x00ae, B:46:0x00bd, B:49:0x00c4, B:51:0x00d7, B:29:0x0087), top: B:68:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:69:0x005f, B:72:0x0064, B:74:0x0068, B:76:0x0075, B:31:0x0091, B:33:0x0099, B:35:0x009c, B:37:0x009f, B:39:0x00ab, B:41:0x00ae, B:46:0x00bd, B:49:0x00c4, B:51:0x00d7, B:29:0x0087), top: B:68:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, androidx.emoji2.text.UnprecomputeTextOnModificationSpannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence k(int r12, int r13, java.lang.CharSequence r14, int r15) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiCompat.k(int, int, java.lang.CharSequence, int):java.lang.CharSequence");
    }

    public final void l(InitCallback initCallback) {
        if (initCallback == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.f19505a.writeLock().lock();
        try {
            if (this.f19507c != 1 && this.f19507c != 2) {
                this.f19506b.add(initCallback);
                this.f19505a.writeLock().unlock();
            }
            this.d.post(new ListenerDispatcher(Arrays.asList(initCallback), this.f19507c, null));
            this.f19505a.writeLock().unlock();
        } catch (Throwable th) {
            this.f19505a.writeLock().unlock();
            throw th;
        }
    }

    public final void m(EditorInfo editorInfo) {
        if (d() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        CompatInternal19 compatInternal19 = this.e;
        compatInternal19.getClass();
        Bundle bundle = editorInfo.extras;
        MetadataList metadataList = compatInternal19.f19514c.f19552a;
        int a2 = metadataList.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? metadataList.f19585b.getInt(a2 + metadataList.f19584a) : 0);
        Bundle bundle2 = editorInfo.extras;
        compatInternal19.f19512a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
