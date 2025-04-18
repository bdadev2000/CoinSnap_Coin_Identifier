package s7;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class e {
    public final AudioManager a;

    /* renamed from: b, reason: collision with root package name */
    public final c f24325b;

    /* renamed from: c, reason: collision with root package name */
    public final d f24326c;

    /* renamed from: d, reason: collision with root package name */
    public u7.e f24327d;

    /* renamed from: e, reason: collision with root package name */
    public int f24328e;

    /* renamed from: f, reason: collision with root package name */
    public int f24329f;

    /* renamed from: g, reason: collision with root package name */
    public float f24330g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f24331h;

    public e(Context context, Handler handler, f0 f0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        audioManager.getClass();
        this.a = audioManager;
        this.f24326c = f0Var;
        this.f24325b = new c(this, handler);
        this.f24328e = 0;
    }

    public final void a() {
        if (this.f24328e == 0) {
            return;
        }
        int i10 = n9.h0.a;
        AudioManager audioManager = this.a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f24331h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f24325b);
        }
        d(0);
    }

    public final void b(int i10) {
        d dVar = this.f24326c;
        if (dVar != null) {
            i0 i0Var = ((f0) dVar).f24350b;
            boolean z10 = i0Var.z();
            int i11 = 1;
            if (z10 && i10 != 1) {
                i11 = 2;
            }
            i0Var.P(i10, i11, z10);
        }
    }

    public final void c() {
        if (!n9.h0.a(this.f24327d, null)) {
            this.f24327d = null;
            this.f24329f = 0;
        }
    }

    public final void d(int i10) {
        float f10;
        if (this.f24328e == i10) {
            return;
        }
        this.f24328e = i10;
        if (i10 == 3) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        if (this.f24330g == f10) {
            return;
        }
        this.f24330g = f10;
        d dVar = this.f24326c;
        if (dVar != null) {
            i0 i0Var = ((f0) dVar).f24350b;
            i0Var.J(1, 2, Float.valueOf(i0Var.Y * i0Var.f24424z.f24330g));
        }
    }

    public final int e(int i10, boolean z10) {
        boolean z11;
        int requestAudioFocus;
        AudioFocusRequest.Builder j3;
        boolean z12;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int i11 = 1;
        if (i10 != 1 && this.f24329f == 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            a();
            if (z10) {
                return 1;
            }
            return -1;
        }
        if (!z10) {
            return -1;
        }
        if (this.f24328e != 1) {
            int i12 = n9.h0.a;
            c cVar = this.f24325b;
            AudioManager audioManager = this.a;
            if (i12 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f24331h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        androidx.core.app.f1.p();
                        j3 = androidx.core.app.f1.f(this.f24329f);
                    } else {
                        androidx.core.app.f1.p();
                        j3 = androidx.core.app.f1.j(this.f24331h);
                    }
                    u7.e eVar = this.f24327d;
                    if (eVar != null && eVar.f25552b == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    eVar.getClass();
                    audioAttributes = j3.setAudioAttributes((AudioAttributes) eVar.a().f20640c);
                    willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z12);
                    onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(cVar);
                    build = onAudioFocusChangeListener.build();
                    this.f24331h = build;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this.f24331h);
            } else {
                u7.e eVar2 = this.f24327d;
                eVar2.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(cVar, n9.h0.v(eVar2.f25554d), this.f24329f);
            }
            if (requestAudioFocus == 1) {
                d(1);
            } else {
                d(0);
                i11 = -1;
            }
        }
        return i11;
    }
}
