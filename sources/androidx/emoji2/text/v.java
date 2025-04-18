package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import androidx.recyclerview.widget.s0;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v implements k {

    /* renamed from: b, reason: collision with root package name */
    public final Context f1539b;

    /* renamed from: c, reason: collision with root package name */
    public final k0.c f1540c;

    /* renamed from: d, reason: collision with root package name */
    public final ac.e f1541d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1542f;

    /* renamed from: g, reason: collision with root package name */
    public Handler f1543g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f1544h;

    /* renamed from: i, reason: collision with root package name */
    public ThreadPoolExecutor f1545i;

    /* renamed from: j, reason: collision with root package name */
    public com.facebook.appevents.i f1546j;

    /* renamed from: k, reason: collision with root package name */
    public u0.a f1547k;

    public v(Context context, k0.c cVar) {
        ac.e eVar = m.f1512d;
        this.f1542f = new Object();
        if (context != null) {
            this.f1539b = context.getApplicationContext();
            this.f1540c = cVar;
            this.f1541d = eVar;
            return;
        }
        throw new NullPointerException("Context cannot be null");
    }

    public final void a() {
        synchronized (this.f1542f) {
            this.f1546j = null;
            u0.a aVar = this.f1547k;
            if (aVar != null) {
                ac.e eVar = this.f1541d;
                Context context = this.f1539b;
                eVar.getClass();
                context.getContentResolver().unregisterContentObserver(aVar);
                this.f1547k = null;
            }
            Handler handler = this.f1543g;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f1543g = null;
            ThreadPoolExecutor threadPoolExecutor = this.f1545i;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f1544h = null;
            this.f1545i = null;
        }
    }

    public final void b() {
        synchronized (this.f1542f) {
            if (this.f1546j == null) {
                return;
            }
            final int i10 = 0;
            if (this.f1544h == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.f1545i = threadPoolExecutor;
                this.f1544h = threadPoolExecutor;
            }
            this.f1544h.execute(new Runnable(this) { // from class: androidx.emoji2.text.u

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ v f1538c;

                {
                    this.f1538c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            v vVar = this.f1538c;
                            synchronized (vVar.f1542f) {
                                if (vVar.f1546j != null) {
                                    try {
                                        k0.h c10 = vVar.c();
                                        int i11 = c10.f20207e;
                                        if (i11 == 2) {
                                            synchronized (vVar.f1542f) {
                                            }
                                        }
                                        if (i11 == 0) {
                                            try {
                                                int i12 = j0.n.a;
                                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                ac.e eVar = vVar.f1541d;
                                                Context context = vVar.f1539b;
                                                eVar.getClass();
                                                Typeface w10 = g0.l.a.w(context, new k0.h[]{c10}, 0);
                                                MappedByteBuffer I = com.bumptech.glide.c.I(vVar.f1539b, c10.a);
                                                if (I != null && w10 != null) {
                                                    try {
                                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                        s2.h hVar = new s2.h(w10, com.facebook.appevents.o.u(I));
                                                        Trace.endSection();
                                                        Trace.endSection();
                                                        synchronized (vVar.f1542f) {
                                                            com.facebook.appevents.i iVar = vVar.f1546j;
                                                            if (iVar != null) {
                                                                iVar.d(hVar);
                                                            }
                                                        }
                                                        vVar.a();
                                                        return;
                                                    } finally {
                                                        int i13 = j0.n.a;
                                                        Trace.endSection();
                                                    }
                                                }
                                                throw new RuntimeException("Unable to open file.");
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                                    } catch (Throwable th3) {
                                        synchronized (vVar.f1542f) {
                                            com.facebook.appevents.i iVar2 = vVar.f1546j;
                                            if (iVar2 != null) {
                                                iVar2.c(th3);
                                            }
                                            vVar.a();
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                        default:
                            this.f1538c.b();
                            return;
                    }
                }
            });
        }
    }

    public final k0.h c() {
        try {
            ac.e eVar = this.f1541d;
            Context context = this.f1539b;
            k0.c cVar = this.f1540c;
            eVar.getClass();
            s0 p10 = d6.g.p(context, cVar);
            if (p10.f2031b == 0) {
                k0.h[] hVarArr = (k0.h[]) p10.f2032c;
                if (hVarArr != null && hVarArr.length != 0) {
                    return hVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(vd.e.g(new StringBuilder("fetchFonts failed ("), p10.f2031b, ")"));
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // androidx.emoji2.text.k
    public final void d(com.facebook.appevents.i iVar) {
        synchronized (this.f1542f) {
            this.f1546j = iVar;
        }
        b();
    }
}
