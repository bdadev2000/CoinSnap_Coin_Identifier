package h5;

import a4.j;
import com.bumptech.glide.d;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.eT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import p5.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public final File f18770c;

    /* renamed from: d, reason: collision with root package name */
    public final File f18771d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18772e;

    /* renamed from: h, reason: collision with root package name */
    public RandomAccessFile f18775h;

    /* renamed from: i, reason: collision with root package name */
    public final c f18776i;
    public volatile long a = -2147483648L;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18769b = new Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f18773f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f18774g = false;

    public a(c cVar) {
        this.f18772e = 0L;
        this.f18775h = null;
        this.f18776i = cVar;
        try {
            File a = d.a(cVar.Sg(), cVar.pDU());
            this.f18770c = a;
            File G = d.G(cVar.Sg(), cVar.pDU());
            this.f18771d = G;
            if (G.exists()) {
                this.f18775h = new RandomAccessFile(G, CampaignEx.JSON_KEY_AD_R);
            } else {
                this.f18775h = new RandomAccessFile(a, "rw");
            }
            if (!G.exists()) {
                this.f18772e = a.length();
                b();
            }
        } catch (Throwable unused) {
            cVar.GA();
        }
    }

    public static void a(a aVar) {
        synchronized (aVar.f18769b) {
            if (aVar.f18771d.exists()) {
                aVar.f18776i.GA();
                aVar.f18776i.pDU();
                return;
            }
            try {
            } finally {
                return;
            }
            if (aVar.f18770c.renameTo(aVar.f18771d)) {
                RandomAccessFile randomAccessFile = aVar.f18775h;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                aVar.f18775h = new RandomAccessFile(aVar.f18771d, "rw");
                aVar.f18776i.pDU();
                aVar.f18776i.GA();
                return;
            }
            throw new IOException("Error renaming file " + aVar.f18770c + " to " + aVar.f18771d + " for completion!");
        }
    }

    public final void b() {
        eT.YFl yFl;
        if (k5.d.a() != null) {
            yFl = k5.d.a().Sg();
        } else {
            yFl = new eT.YFl("v_cache");
        }
        c cVar = this.f18776i;
        long rkt = cVar.rkt();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yFl.YFl(rkt, timeUnit).Sg(cVar.lG(), timeUnit).tN(cVar.Wwa(), timeUnit);
        eT YFl = yFl.YFl();
        cVar.pDU();
        YFl.YFl(new GA.YFl().YFl("RANGE", j.j(new StringBuilder("bytes="), this.f18772e, "-")).Sg(cVar.GA()).YFl().YFl("videoLoadWhenPlaying").YFl(9).Sg()).YFl(new v3.c(this, 23));
    }
}
