package s7;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f24751b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24754e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f24755f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f24756g;
    public final Handler a = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public int f24752c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f24753d = -1;

    /* renamed from: h, reason: collision with root package name */
    public final Object f24757h = new te.g(this);

    public s2(Context context, com.google.common.collect.c1 c1Var) {
        this.f24751b = context;
        this.f24755f = c1Var;
        this.f24756g = new te.f(this, context.getApplicationContext());
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e2) {
            n9.o.g("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e2);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final int a() {
        int rotation = ((WindowManager) this.f24751b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    public final void c() {
        final boolean z10;
        AudioManager audioManager = (AudioManager) this.f24756g;
        final int b3 = b(audioManager, this.f24752c);
        int i10 = this.f24752c;
        if (n9.h0.a >= 23) {
            z10 = audioManager.isStreamMute(i10);
        } else if (b(audioManager, i10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f24753d != b3 || this.f24754e != z10) {
            this.f24753d = b3;
            this.f24754e = z10;
            ((f0) ((r2) this.f24755f)).f24350b.f24411l.k(30, new n9.l() { // from class: s7.e0
                @Override // n9.l
                public final void invoke(Object obj) {
                    ((f2) obj).k(b3, z10);
                }
            });
        }
    }
}
