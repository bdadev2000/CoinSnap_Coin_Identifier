package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f1503i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile l f1504j;
    public final ReentrantReadWriteLock a;

    /* renamed from: b, reason: collision with root package name */
    public final r.c f1505b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1506c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1507d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1508e;

    /* renamed from: f, reason: collision with root package name */
    public final k f1509f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1510g;

    /* renamed from: h, reason: collision with root package name */
    public final e f1511h;

    public l(m mVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.f1506c = 3;
        this.f1509f = mVar.a;
        int i10 = mVar.f1501b;
        this.f1510g = i10;
        this.f1511h = mVar.f1502c;
        this.f1507d = new Handler(Looper.getMainLooper());
        this.f1505b = new r.c(0);
        g gVar = new g(this);
        this.f1508e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1506c = 0;
            } catch (Throwable th2) {
                this.a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                this.f1509f.d(new f(gVar));
            } catch (Throwable th3) {
                d(th3);
            }
        }
    }

    public static l a() {
        l lVar;
        boolean z10;
        synchronized (f1503i) {
            lVar = f1504j;
            if (lVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return lVar;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.f1506c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11 = true;
        if (this.f1510g == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (b() != 1) {
                z11 = false;
            }
            if (z11) {
                return;
            }
            this.a.writeLock().lock();
            try {
                if (this.f1506c == 0) {
                    return;
                }
                this.f1506c = 0;
                this.a.writeLock().unlock();
                g gVar = this.f1508e;
                Object obj = gVar.f26021c;
                try {
                    ((l) obj).f1509f.d(new f(gVar));
                    return;
                } catch (Throwable th2) {
                    ((l) obj).d(th2);
                    return;
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.f1506c = 2;
            arrayList.addAll(this.f1505b);
            this.f1505b.clear();
            this.a.writeLock().unlock();
            this.f1507d.post(new d.d(arrayList, this.f1506c, th2));
        } catch (Throwable th3) {
            this.a.writeLock().unlock();
            throw th3;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.f1506c = 1;
            arrayList.addAll(this.f1505b);
            this.f1505b.clear();
            this.a.writeLock().unlock();
            this.f1507d.post(new d.d(arrayList, this.f1506c));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence f(int i10, int i11, CharSequence charSequence) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (b() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    if (i10 <= i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    com.bumptech.glide.e.i(z11, "start should be <= than end");
                    if (charSequence == null) {
                        return null;
                    }
                    if (i10 <= charSequence.length()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    com.bumptech.glide.e.i(z12, "start should be < than charSequence length");
                    if (i11 > charSequence.length()) {
                        z13 = false;
                    }
                    com.bumptech.glide.e.i(z13, "end should be < than charSequence length");
                    if (charSequence.length() != 0 && i10 != i11) {
                        return this.f1508e.F(charSequence, i10, i11, false);
                    }
                    return charSequence;
                }
                throw new IllegalArgumentException("end cannot be negative");
            }
            throw new IllegalArgumentException("start cannot be negative");
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public final void g(j jVar) {
        if (jVar != null) {
            this.a.writeLock().lock();
            try {
                if (this.f1506c != 1 && this.f1506c != 2) {
                    this.f1505b.add(jVar);
                    return;
                }
                this.f1507d.post(new d.d(jVar, this.f1506c));
                return;
            } finally {
                this.a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }
}
