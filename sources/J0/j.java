package j0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f20970j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f20971k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f20972a;
    public final x.c b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f20973c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f20974d;

    /* renamed from: e, reason: collision with root package name */
    public final f f20975e;

    /* renamed from: f, reason: collision with root package name */
    public final i f20976f;

    /* renamed from: g, reason: collision with root package name */
    public final L4.f f20977g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20978h;

    /* renamed from: i, reason: collision with root package name */
    public final d f20979i;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f20972a = reentrantReadWriteLock;
        this.f20973c = 3;
        i iVar = qVar.f20998a;
        this.f20976f = iVar;
        int i9 = qVar.b;
        this.f20978h = i9;
        this.f20979i = qVar.f20999c;
        this.f20974d = new Handler(Looper.getMainLooper());
        this.b = new x.c(0);
        this.f20977g = new L4.f(25);
        f fVar = new f(this);
        this.f20975e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i9 == 0) {
            try {
                this.f20973c = 0;
            } catch (Throwable th) {
                this.f20972a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.b(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        boolean z8;
        synchronized (f20970j) {
            try {
                jVar = f20971k;
                if (jVar != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f20972a.readLock().lock();
        try {
            return this.f20973c;
        } finally {
            this.f20972a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z8;
        if (this.f20978h == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (b() == 1) {
                return;
            }
            this.f20972a.writeLock().lock();
            try {
                if (this.f20973c == 0) {
                    return;
                }
                this.f20973c = 0;
                this.f20972a.writeLock().unlock();
                f fVar = this.f20975e;
                j jVar = (j) fVar.f20969c;
                try {
                    jVar.f20976f.b(new e(fVar));
                    return;
                } catch (Throwable th) {
                    jVar.d(th);
                    return;
                }
            } finally {
                this.f20972a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f20972a.writeLock().lock();
        try {
            this.f20973c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f20972a.writeLock().unlock();
            this.f20974d.post(new Q.a(arrayList, this.f20973c, th));
        } catch (Throwable th2) {
            this.f20972a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f20972a.writeLock().lock();
        try {
            this.f20973c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f20972a.writeLock().unlock();
            this.f20974d.post(new Q.a(arrayList, this.f20973c, (Throwable) null));
        } catch (Throwable th) {
            this.f20972a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:67:0x005c, B:70:0x0061, B:72:0x0065, B:74:0x0072, B:29:0x008e, B:31:0x0098, B:33:0x009b, B:35:0x009e, B:37:0x00ae, B:39:0x00b1, B:44:0x00c0, B:47:0x00c7, B:49:0x00df, B:27:0x0084), top: B:66:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:67:0x005c, B:70:0x0061, B:72:0x0065, B:74:0x0072, B:29:0x008e, B:31:0x0098, B:33:0x009b, B:35:0x009e, B:37:0x00ae, B:39:0x00b1, B:44:0x00c0, B:47:0x00c7, B:49:0x00df, B:27:0x0084), top: B:66:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v6, types: [j0.x, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.j.f(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void g(h hVar) {
        C2.m.h(hVar, "initCallback cannot be null");
        this.f20972a.writeLock().lock();
        try {
            if (this.f20973c != 1 && this.f20973c != 2) {
                this.b.add(hVar);
                this.f20972a.writeLock().unlock();
            }
            this.f20974d.post(new Q.a(Arrays.asList(hVar), this.f20973c, (Throwable) null));
            this.f20972a.writeLock().unlock();
        } catch (Throwable th) {
            this.f20972a.writeLock().unlock();
            throw th;
        }
    }
}
