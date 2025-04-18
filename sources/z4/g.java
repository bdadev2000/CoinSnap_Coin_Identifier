package z4;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class g implements o {
    public n a;

    /* renamed from: b, reason: collision with root package name */
    public j f28507b;

    /* renamed from: c, reason: collision with root package name */
    public k f28508c;

    /* renamed from: d, reason: collision with root package name */
    public m f28509d;

    /* renamed from: e, reason: collision with root package name */
    public i f28510e;

    /* renamed from: f, reason: collision with root package name */
    public l f28511f;

    /* renamed from: g, reason: collision with root package name */
    public h f28512g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28513h = false;

    /* renamed from: i, reason: collision with root package name */
    public final MediaPlayer f28514i;

    /* renamed from: j, reason: collision with root package name */
    public final f f28515j;

    /* renamed from: k, reason: collision with root package name */
    public f5.a f28516k;

    /* renamed from: l, reason: collision with root package name */
    public Surface f28517l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f28518m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f28519n;

    public g() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f28518m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f28514i = mediaPlayer;
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(k5.d.a, null, null);
                Field declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                try {
                    declaredField.set(newInstance, new Handler());
                    declaredField.setAccessible(false);
                    mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
                } catch (Throwable unused) {
                    declaredField.setAccessible(false);
                }
            } catch (Throwable unused2) {
            }
        }
        this.f28514i.setAudioStreamType(3);
        this.f28515j = new f(this);
        d();
    }

    public final void a(long j3, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        MediaPlayer mediaPlayer = this.f28514i;
        if (i11 >= 26) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            mediaPlayer.seekTo((int) j3);
                            return;
                        } else {
                            mediaPlayer.seekTo((int) j3, 3);
                            return;
                        }
                    }
                    mediaPlayer.seekTo((int) j3, 2);
                    return;
                }
                mediaPlayer.seekTo((int) j3, 1);
                return;
            }
            mediaPlayer.seekTo((int) j3, 0);
            return;
        }
        mediaPlayer.seekTo((int) j3);
    }

    public final synchronized void b(p5.c cVar) {
        f5.a aVar = new f5.a(k5.d.a, cVar);
        f5.a.f17676g.put(cVar.pDU(), aVar);
        this.f28516k = aVar;
        g5.b.a(cVar);
        this.f28514i.setDataSource(this.f28516k);
    }

    public final void c() {
        this.a = null;
        this.f28508c = null;
        this.f28507b = null;
        this.f28509d = null;
        this.f28510e = null;
        this.f28511f = null;
        this.f28512g = null;
    }

    public final void d() {
        MediaPlayer mediaPlayer = this.f28514i;
        f fVar = this.f28515j;
        mediaPlayer.setOnPreparedListener(fVar);
        mediaPlayer.setOnBufferingUpdateListener(fVar);
        mediaPlayer.setOnCompletionListener(fVar);
        mediaPlayer.setOnSeekCompleteListener(fVar);
        mediaPlayer.setOnVideoSizeChangedListener(fVar);
        mediaPlayer.setOnErrorListener(fVar);
        mediaPlayer.setOnInfoListener(fVar);
    }

    public final void finalize() {
        super.finalize();
        try {
            Surface surface = this.f28517l;
            if (surface != null) {
                surface.release();
                this.f28517l = null;
            }
        } catch (Throwable unused) {
        }
    }
}
