package z4;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.component.qsH.NjR;
import com.bytedance.sdk.component.qsH.YFl.YFl;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.core.GA.AlY.tN;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class e implements h, i, j, k, l, m, n, k5.c, bZ.YFl {
    private static final SparseIntArray bZ = new SparseIntArray();
    private int AlY;
    private bZ GA;
    private volatile boolean GS;
    private int Ne;
    private boolean NjR;
    private SurfaceHolder Sg;
    private boolean UI;
    private boolean UZM;
    private SurfaceTexture YFl;
    private boolean aIu;

    /* renamed from: nc */
    private boolean f28504nc;
    private ArrayList<Runnable> wXo;
    private int tN = 0;
    private boolean wN = false;

    /* renamed from: vc */
    private volatile o f28505vc = null;
    private final boolean DSW = false;
    private boolean qsH = false;
    private volatile int eT = 201;
    private long YoT = -1;
    private boolean pDU = false;
    private long EH = 0;
    private long rkt = Long.MIN_VALUE;
    private long lG = 0;
    private long Wwa = 0;
    private long qO = 0;
    private String VOe = "0";
    private final List<WeakReference<k5.b>> YI = new CopyOnWriteArrayList();
    private p5.c Ga = null;
    private boolean dXO = false;
    private CountDownLatch Cfr = new CountDownLatch(1);
    private volatile int hQ = 200;
    private AtomicBoolean pq = new AtomicBoolean(false);
    private Surface mn = null;
    private final Runnable zB = new a(this, 5);
    private final d Sco = new d((tN) this);
    private long lu = 0;
    private long mB = 0;

    public e() {
        int i10 = 0;
        this.Ne = 0;
        this.UI = false;
        this.Ne = 0;
        bZ YFl = YFl.YFl().YFl(this, NjR.THREAD_NAME_PRE.concat("SSMediaPlayerWrapper"));
        this.GA = YFl;
        this.UI = true;
        if (YFl != null) {
            YFl.post(new a(this, i10));
        }
    }

    public static void eT(e eVar) {
        bZ bZVar = eVar.GA;
        if (bZVar != null) {
            bZVar.post(new a(eVar, 0));
        }
    }

    public static /* synthetic */ bZ qsH(e eVar) {
        return eVar.GA;
    }

    public int EH() {
        return this.tN;
    }

    public boolean GA() {
        return this.eT == 205;
    }

    public SurfaceHolder Wwa() {
        return this.Sg;
    }

    public void YoT() {
        if (qsH()) {
            return;
        }
        this.f28504nc = true;
        ArrayList<Runnable> arrayList = this.wXo;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.wXo.clear();
        }
        bZ bZVar = this.GA;
        if (bZVar != null) {
            try {
                bZVar.removeCallbacksAndMessages(null);
                if (this.f28505vc != null) {
                    this.GA.sendEmptyMessage(103);
                }
                h();
            } catch (Throwable unused) {
                h();
            }
        }
    }

    public final void a() {
        boolean z10;
        ArrayList<Runnable> arrayList = this.wXo;
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !this.NjR) {
            this.NjR = true;
            Iterator it = new ArrayList(this.wXo).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.wXo.clear();
            this.NjR = false;
        }
    }

    public final void b(int i10, int i11) {
        if (i10 == 701) {
            this.lu = SystemClock.elapsedRealtime();
            this.tN++;
            for (WeakReference<k5.b> weakReference : this.YI) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().YFl(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i10 == 702) {
            if (this.lu > 0) {
                this.mB = (SystemClock.elapsedRealtime() - this.lu) + this.mB;
                this.lu = 0L;
            }
            for (WeakReference<k5.b> weakReference2 : this.YI) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().YFl((k5.c) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.UI && i10 == 3) {
            a();
            g();
            Sg(this.dXO);
        }
    }

    public final void c(long j3) {
        boolean z10;
        d dVar = this.Sco;
        dVar.f28501b = j3;
        if (this.UZM) {
            d(dVar);
            return;
        }
        p5.c cVar = this.Ga;
        if (cVar != null && cVar.AlY()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d(this.Sco);
        } else {
            f(this.Sco);
        }
    }

    public final void d(Runnable runnable) {
        if (runnable != null && !qsH()) {
            if (!this.f28504nc) {
                runnable.run();
            } else {
                f(runnable);
            }
        }
    }

    public final void e() {
        if (this.f28505vc == null) {
            return;
        }
        try {
            g gVar = (g) this.f28505vc;
            gVar.getClass();
            try {
                gVar.f28514i.reset();
            } catch (Throwable unused) {
            }
            f5.a aVar = gVar.f28516k;
            if (aVar != null) {
                try {
                    aVar.close();
                } catch (Throwable unused2) {
                }
                gVar.f28516k = null;
            }
            gVar.c();
            gVar.d();
        } catch (Throwable unused3) {
        }
        ((g) this.f28505vc).f28507b = null;
        ((g) this.f28505vc).f28510e = null;
        ((g) this.f28505vc).f28508c = null;
        ((g) this.f28505vc).f28512g = null;
        ((g) this.f28505vc).f28511f = null;
        ((g) this.f28505vc).a = null;
        ((g) this.f28505vc).f28509d = null;
        try {
            g gVar2 = (g) this.f28505vc;
            synchronized (gVar2.f28518m) {
                try {
                    if (!gVar2.f28519n) {
                        gVar2.f28514i.release();
                        gVar2.f28519n = true;
                        try {
                            Surface surface = gVar2.f28517l;
                            if (surface != null) {
                                surface.release();
                                gVar2.f28517l = null;
                            }
                        } catch (Throwable unused4) {
                        }
                        f5.a aVar2 = gVar2.f28516k;
                        if (aVar2 != null) {
                            try {
                                aVar2.close();
                            } catch (Throwable unused5) {
                            }
                            gVar2.f28516k = null;
                        }
                        gVar2.c();
                        gVar2.d();
                    }
                } finally {
                }
            }
        } catch (Throwable unused6) {
        }
    }

    public final void f(Runnable runnable) {
        try {
            if (this.wXo == null) {
                this.wXo = new ArrayList<>();
            }
            this.wXo.add(runnable);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public final void g() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.qO;
        for (WeakReference<k5.b> weakReference : this.YI) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().YFl(this, elapsedRealtime);
            }
        }
        this.wN = true;
    }

    public final void h() {
        bZ bZVar = this.GA;
        if (bZVar != null && bZVar.getLooper() != null) {
            this.GA.post(new a(this, 6));
        }
    }

    public long lG() {
        if (qsH()) {
            return 0L;
        }
        if (this.eT != 206 && this.eT != 207) {
            return 0L;
        }
        try {
            ((g) this.f28505vc).getClass();
            return r0.f28514i.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public long pDU() {
        if (this.pDU) {
            long j3 = this.lG;
            if (j3 > 0) {
                return this.EH + j3;
            }
        }
        return this.EH;
    }

    public SurfaceTexture qO() {
        return this.YFl;
    }

    public long rkt() {
        long j3 = this.Wwa;
        long j10 = 0;
        if (j3 != 0) {
            return j3;
        }
        if (this.eT == 206 || this.eT == 207) {
            try {
                g gVar = (g) this.f28505vc;
                gVar.getClass();
                try {
                    j10 = gVar.f28514i.getDuration();
                } catch (Throwable unused) {
                }
                this.Wwa = j10;
            } catch (Throwable unused2) {
            }
        }
        return this.Wwa;
    }

    @Override // k5.c
    public boolean DSW() {
        bZ bZVar;
        return ((this.eT != 207 && !this.GS) || (bZVar = this.GA) == null || bZVar.hasMessages(100)) ? false : true;
    }

    public void NjR() {
        if (qsH() || this.f28505vc == null) {
            return;
        }
        this.pq.set(true);
        if (this.eT != 206) {
            this.EH = 0L;
            this.tN = 0;
            this.lG = 0L;
            this.pDU = false;
            this.rkt = Long.MIN_VALUE;
            this.GS = false;
            this.Sco.f28502c = true;
            c(0L);
            bZ bZVar = this.GA;
            if (bZVar != null) {
                bZVar.removeCallbacks(this.zB);
                this.GA.postDelayed(this.zB, this.hQ);
            }
        }
        this.Cfr.countDown();
    }

    public void nc() {
        if (qsH() || this.GA == null) {
            return;
        }
        this.pq.set(true);
        this.GA.post(new a(this, 1));
    }

    @Override // k5.c
    public boolean qsH() {
        return this.f28504nc;
    }

    @Override // k5.c
    public boolean vc() {
        bZ bZVar;
        return (this.eT == 206 || ((bZVar = this.GA) != null && bZVar.hasMessages(100))) && !this.GS;
    }

    @Override // k5.c
    public int wN() {
        MediaPlayer mediaPlayer;
        if (this.f28505vc == null || qsH() || (mediaPlayer = ((g) this.f28505vc).f28514i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoHeight();
    }

    public void eT() {
        bZ bZVar;
        if (qsH() || (bZVar = this.GA) == null) {
            return;
        }
        bZVar.removeMessages(100);
        this.GS = true;
        if (!this.UI) {
            if (!this.aIu) {
                p5.c cVar = this.Ga;
                if (!(cVar != null && cVar.AlY())) {
                    f(new a(this, 2));
                    return;
                }
            }
            bZ bZVar2 = this.GA;
            if (bZVar2 != null) {
                bZVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.wN) {
            p5.c cVar2 = this.Ga;
            if (!(cVar2 != null && cVar2.AlY())) {
                f(new a(this, 3));
                return;
            }
        }
        bZ bZVar3 = this.GA;
        if (bZVar3 != null) {
            bZVar3.sendEmptyMessage(101);
        }
    }

    @Override // k5.c
    public int AlY() {
        MediaPlayer mediaPlayer;
        if (this.f28505vc == null || qsH() || (mediaPlayer = ((g) this.f28505vc).f28514i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoWidth();
    }

    @Override // k5.c
    public boolean Sg() {
        return this.eT == 209;
    }

    @Override // k5.c
    public boolean tN() {
        return GA() || vc() || DSW();
    }

    @Override // z4.h
    public boolean Sg(o oVar, int i10, int i11) {
        if (this.f28505vc != oVar) {
            return false;
        }
        if (i11 == -1004) {
            p5.b bVar = new p5.b(i10, i11);
            for (WeakReference<k5.b> weakReference : this.YI) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().YFl(this, bVar);
                }
            }
        }
        b(i10, i11);
        return false;
    }

    @Override // z4.m
    public void tN(o oVar) {
        for (WeakReference<k5.b> weakReference : this.YI) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().YFl((k5.c) this, true);
            }
        }
    }

    public static void YFl(e eVar, long j3, long j10) {
        for (WeakReference<k5.b> weakReference : eVar.YI) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().YFl(eVar, j3, j10);
            }
        }
    }

    @Override // z4.n
    public void Sg(o oVar) {
        if (qsH()) {
            return;
        }
        this.eT = 205;
        try {
            p5.c cVar = this.Ga;
            if (cVar != null) {
                float YoT = cVar.YoT();
                if (YoT > 0.0f) {
                    k5.a aVar = new k5.a();
                    aVar.a = YoT;
                    MediaPlayer mediaPlayer = ((g) this.f28505vc).f28514i;
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(aVar.a));
                }
            }
        } catch (Throwable unused) {
        }
        if (this.GA != null) {
            if (this.GS) {
                bZ bZVar = this.GA;
                if (bZVar != null) {
                    bZVar.post(new a(this, 7));
                }
            } else {
                bZ bZVar2 = this.GA;
                bZVar2.sendMessage(bZVar2.obtainMessage(100, -1, -1));
            }
        }
        bZ.delete(this.Ne);
        boolean z10 = this.UI;
        boolean z11 = this.aIu;
        if (!z10 && !z11) {
            g();
            this.aIu = true;
        }
        for (WeakReference<k5.b> weakReference : this.YI) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Sg(this);
            }
        }
    }

    public void YFl(boolean z10) {
        if (qsH()) {
            return;
        }
        this.UZM = z10;
        if (this.f28505vc != null) {
            ((g) this.f28505vc).f28513h = z10;
            return;
        }
        bZ bZVar = this.GA;
        if (bZVar != null) {
            bZVar.post(new c(this, z10, 1));
        }
    }

    public void YFl(boolean z10, long j3, boolean z11) {
        if (qsH()) {
            return;
        }
        bZ bZVar = this.GA;
        int i10 = 0;
        if (bZVar != null) {
            bZVar.post(new a(this, i10));
        }
        this.dXO = z11;
        this.pq.set(true);
        this.GS = false;
        Sg(z11);
        if (z10) {
            this.YoT = j3;
            d(new a(this, 4));
        } else {
            c(j3);
        }
        bZ bZVar2 = this.GA;
        if (bZVar2 != null) {
            bZVar2.removeCallbacks(this.zB);
            this.GA.postDelayed(this.zB, this.hQ);
        }
        this.Cfr.countDown();
    }

    public void YFl(long j3) {
        if (qsH()) {
            return;
        }
        if (this.eT == 207 || this.eT == 206 || this.eT == 209) {
            d(new b(this, j3));
        }
    }

    public void Sg(boolean z10) {
        bZ bZVar;
        if (qsH() || (bZVar = this.GA) == null) {
            return;
        }
        bZVar.post(new c(this, z10, 0));
    }

    @Override // k5.c
    public boolean YFl() {
        return this.wN;
    }

    public void Sg(int i10) {
        this.AlY = i10;
    }

    public void YFl(SurfaceTexture surfaceTexture) {
        if (qsH()) {
            return;
        }
        this.YFl = surfaceTexture;
        YFl(true);
        d(new androidx.appcompat.widget.j(15, this, surfaceTexture));
    }

    public void YFl(SurfaceHolder surfaceHolder) {
        if (qsH()) {
            return;
        }
        this.Sg = surfaceHolder;
        YFl(true);
        d(new androidx.appcompat.widget.j(16, this, surfaceHolder));
    }

    public void YFl(p5.c cVar) {
        if (qsH()) {
            return;
        }
        this.Ga = cVar;
        if (cVar != null) {
            this.UI = this.UI && !cVar.AlY();
        }
        d(new androidx.appcompat.widget.j(17, this, cVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001b. Please report as an issue. */
    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        int i10 = this.eT;
        int i11 = message.what;
        boolean z10 = false;
        if (this.f28505vc != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.eT == 205 || this.eT == 207 || this.eT == 209) {
                            ((g) this.f28505vc).f28514i.start();
                            this.qO = SystemClock.elapsedRealtime();
                            this.eT = 206;
                            if (this.YoT > 0) {
                                ((g) this.f28505vc).a(this.YoT, this.AlY);
                                this.YoT = -1L;
                            }
                            if (this.Ga != null) {
                                Sg(this.dXO);
                                break;
                            }
                        }
                        z10 = true;
                        break;
                    case 101:
                        if (this.pDU) {
                            this.EH += this.lG;
                        }
                        this.pDU = false;
                        this.lG = 0L;
                        this.rkt = Long.MIN_VALUE;
                        if (this.eT == 206 || this.eT == 207 || this.eT == 209) {
                            ((g) this.f28505vc).f28514i.pause();
                            this.eT = 207;
                            this.GS = false;
                            for (WeakReference<k5.b> weakReference : this.YI) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().AlY(this);
                                }
                            }
                            break;
                        }
                        z10 = true;
                        break;
                    case 102:
                        g gVar = (g) this.f28505vc;
                        gVar.getClass();
                        try {
                            gVar.f28514i.reset();
                        } catch (Throwable unused) {
                        }
                        f5.a aVar = gVar.f28516k;
                        if (aVar != null) {
                            try {
                                aVar.close();
                            } catch (Throwable unused2) {
                            }
                            gVar.f28516k = null;
                        }
                        gVar.c();
                        gVar.d();
                        this.eT = 201;
                        break;
                    case 103:
                        try {
                            e();
                        } catch (Throwable unused3) {
                        }
                        for (WeakReference<k5.b> weakReference2 : this.YI) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().tN(this);
                            }
                        }
                        this.eT = 203;
                        break;
                    case 104:
                        if (this.eT == 202 || this.eT == 208) {
                            MediaPlayer mediaPlayer = ((g) this.f28505vc).f28514i;
                            if (mediaPlayer != null) {
                                mediaPlayer.prepareAsync();
                                break;
                            }
                        }
                        z10 = true;
                        break;
                    case 105:
                        if (this.eT == 205 || this.eT == 206 || this.eT == 208 || this.eT == 207 || this.eT == 209) {
                            ((g) this.f28505vc).f28514i.stop();
                            this.eT = 208;
                            break;
                        }
                        z10 = true;
                        break;
                    case 106:
                        if (this.eT == 206 || this.eT == 207 || this.eT == 209) {
                            ((g) this.f28505vc).a(((Long) message.obj).longValue(), this.AlY);
                            break;
                        }
                        z10 = true;
                        break;
                    case 107:
                        this.EH = 0L;
                        this.tN = 0;
                        this.lG = 0L;
                        this.pDU = false;
                        this.rkt = Long.MIN_VALUE;
                        if (this.eT == 201 || this.eT == 203) {
                            p5.c cVar = (p5.c) message.obj;
                            if (TextUtils.isEmpty(cVar.Sg())) {
                                if (TextUtils.isEmpty(k5.d.f20272b)) {
                                    try {
                                        File file = new File(k5.d.a.getFilesDir(), "ttad_dir");
                                        if (!file.exists()) {
                                            file.mkdirs();
                                        }
                                        k5.d.f20272b = file.getAbsolutePath();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                cVar.YFl(k5.d.f20272b);
                            }
                            File file2 = new File(cVar.Sg(), cVar.pDU());
                            if (file2.exists()) {
                                file2.getAbsolutePath();
                                if (k5.d.f20273c) {
                                    FileInputStream fileInputStream = new FileInputStream(file2.getAbsolutePath());
                                    ((g) this.f28505vc).f28514i.setDataSource(fileInputStream.getFD());
                                    fileInputStream.close();
                                } else {
                                    o oVar = this.f28505vc;
                                    String absolutePath = file2.getAbsolutePath();
                                    g gVar2 = (g) oVar;
                                    gVar2.getClass();
                                    Uri parse = Uri.parse(absolutePath);
                                    String scheme = parse.getScheme();
                                    boolean isEmpty = TextUtils.isEmpty(scheme);
                                    MediaPlayer mediaPlayer2 = gVar2.f28514i;
                                    if (!isEmpty && scheme.equalsIgnoreCase("file")) {
                                        mediaPlayer2.setDataSource(parse.getPath());
                                    } else {
                                        mediaPlayer2.setDataSource(absolutePath);
                                    }
                                }
                            } else {
                                cVar.GA();
                                ((g) this.f28505vc).b(cVar);
                                cVar.GA();
                            }
                            this.eT = 202;
                            break;
                        }
                        z10 = true;
                        break;
                    case 110:
                        SurfaceHolder surfaceHolder = (SurfaceHolder) message.obj;
                        g gVar3 = (g) this.f28505vc;
                        synchronized (gVar3.f28518m) {
                            try {
                                if (!gVar3.f28519n && surfaceHolder != null && surfaceHolder.getSurface() != null && gVar3.f28513h) {
                                    gVar3.f28514i.setDisplay(surfaceHolder);
                                }
                            } catch (Throwable unused5) {
                            }
                        }
                        ((g) this.f28505vc).f28514i.setScreenOnWhilePlaying(true);
                        this.Cfr.await(1L, TimeUnit.SECONDS);
                        a();
                        break;
                    case 111:
                        this.mn = new Surface((SurfaceTexture) message.obj);
                        o oVar2 = this.f28505vc;
                        Surface surface = this.mn;
                        g gVar4 = (g) oVar2;
                        gVar4.getClass();
                        try {
                            Surface surface2 = gVar4.f28517l;
                            if (surface2 != null) {
                                surface2.release();
                                gVar4.f28517l = null;
                            }
                        } catch (Throwable unused6) {
                        }
                        gVar4.f28517l = surface;
                        gVar4.f28514i.setSurface(surface);
                        ((g) this.f28505vc).f28514i.setScreenOnWhilePlaying(true);
                        this.Cfr.await(1L, TimeUnit.SECONDS);
                        a();
                        break;
                }
            } catch (Throwable unused7) {
            }
        }
        if (z10) {
            this.eT = 200;
            if (this.qsH) {
                return;
            }
            p5.b bVar = new p5.b(308, i11);
            bVar.f23475c = i10 + "," + i11;
            for (WeakReference<k5.b> weakReference3 : this.YI) {
                if (weakReference3 != null && weakReference3.get() != null) {
                    weakReference3.get().YFl(this, bVar);
                }
            }
            this.qsH = true;
        }
    }

    @Override // z4.k
    public void YFl(o oVar, int i10) {
        if (this.f28505vc != oVar) {
            return;
        }
        for (WeakReference<k5.b> weakReference : this.YI) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Sg(this, i10);
            }
        }
    }

    @Override // z4.l
    public boolean YFl(o oVar, int i10, int i11) {
        SparseIntArray sparseIntArray = bZ;
        Integer valueOf = Integer.valueOf(sparseIntArray.get(this.Ne));
        if (valueOf == null) {
            sparseIntArray.put(this.Ne, 1);
        } else {
            sparseIntArray.put(this.Ne, valueOf.intValue() + 1);
        }
        this.eT = 200;
        bZ bZVar = this.GA;
        if (bZVar != null) {
            bZVar.removeCallbacks(this.zB);
        }
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            z10 = true;
        }
        if (z10) {
            h();
        }
        if (!this.pq.get()) {
            return true;
        }
        this.pq.set(false);
        p5.b bVar = new p5.b(i10, i11);
        for (WeakReference<k5.b> weakReference : this.YI) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().YFl(this, bVar);
            }
        }
        return true;
    }

    @Override // z4.j
    public void YFl(o oVar) {
        this.eT = 209;
        bZ.delete(this.Ne);
        bZ bZVar = this.GA;
        if (bZVar != null) {
            bZVar.removeCallbacks(this.zB);
        }
        for (WeakReference<k5.b> weakReference : this.YI) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().YFl(this);
            }
        }
    }

    @Override // z4.i
    public void YFl(o oVar, int i10, int i11, int i12, int i13) {
        for (WeakReference<k5.b> weakReference : this.YI) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().YFl((k5.c) this, i10, i11);
            }
        }
    }

    public void YFl(k5.b bVar) {
        if (bVar == null) {
            return;
        }
        for (WeakReference<k5.b> weakReference : this.YI) {
            if (weakReference != null && weakReference.get() == bVar) {
                return;
            }
        }
        this.YI.add(new WeakReference<>(bVar));
    }

    public void YFl(int i10) {
        if (qsH()) {
            return;
        }
        this.hQ = i10;
    }
}
