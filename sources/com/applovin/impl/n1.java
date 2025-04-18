package com.applovin.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class n1 {
    private final AudioManager a;

    /* renamed from: b */
    private final a f6335b;

    /* renamed from: c */
    private b f6336c;

    /* renamed from: d */
    private k1 f6337d;

    /* renamed from: f */
    private int f6339f;

    /* renamed from: h */
    private AudioFocusRequest f6341h;

    /* renamed from: i */
    private boolean f6342i;

    /* renamed from: g */
    private float f6340g = 1.0f;

    /* renamed from: e */
    private int f6338e = 0;

    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        private final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            this.a.post(new st(i10, 1, this));
        }

        public /* synthetic */ void a(int i10) {
            n1.this.b(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b(float f10);

        void f(int i10);
    }

    public n1(Context context, Handler handler, b bVar) {
        this.a = (AudioManager) a1.a((AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f6336c = bVar;
        this.f6335b = new a(handler);
    }

    private void a() {
        this.a.abandonAudioFocus(this.f6335b);
    }

    public void b(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !i()) {
                c(3);
                return;
            } else {
                a(0);
                c(2);
                return;
            }
        }
        if (i10 == -1) {
            a(-1);
            b();
        } else if (i10 != 1) {
            a4.j.u("Unknown focus change type: ", i10, "AudioFocusManager");
        } else {
            c(1);
            a(1);
        }
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f6341h;
        if (audioFocusRequest != null) {
            this.a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private int f() {
        int g10;
        if (this.f6338e == 1) {
            return 1;
        }
        if (yp.a >= 26) {
            g10 = h();
        } else {
            g10 = g();
        }
        if (g10 == 1) {
            c(1);
            return 1;
        }
        c(0);
        return -1;
    }

    private int g() {
        return this.a.requestAudioFocus(this.f6335b, yp.e(((k1) a1.a(this.f6337d)).f5585c), this.f6339f);
    }

    private int h() {
        AudioFocusRequest.Builder j3;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f6341h;
        if (audioFocusRequest == null || this.f6342i) {
            if (audioFocusRequest == null) {
                androidx.core.app.f1.p();
                j3 = androidx.core.app.f1.f(this.f6339f);
            } else {
                androidx.core.app.f1.p();
                j3 = androidx.core.app.f1.j(this.f6341h);
            }
            boolean i10 = i();
            audioAttributes = j3.setAudioAttributes(((k1) a1.a(this.f6337d)).a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(i10);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f6335b);
            build = onAudioFocusChangeListener.build();
            this.f6341h = build;
            this.f6342i = false;
        }
        requestAudioFocus = this.a.requestAudioFocus(this.f6341h);
        return requestAudioFocus;
    }

    private boolean i() {
        k1 k1Var = this.f6337d;
        return k1Var != null && k1Var.a == 1;
    }

    public float d() {
        return this.f6340g;
    }

    public void e() {
        this.f6336c = null;
        b();
    }

    private boolean d(int i10) {
        return i10 == 1 || this.f6339f != 1;
    }

    private static int a(k1 k1Var) {
        if (k1Var == null) {
            return 0;
        }
        switch (k1Var.f5585c) {
            case 0:
                kc.d("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (k1Var.a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                kc.d("AudioFocusManager", "Unidentified audio usage: " + k1Var.f5585c);
                return 0;
            case 16:
                return yp.a >= 19 ? 4 : 2;
        }
    }

    private void c(int i10) {
        if (this.f6338e == i10) {
            return;
        }
        this.f6338e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f6340g == f10) {
            return;
        }
        this.f6340g = f10;
        b bVar = this.f6336c;
        if (bVar != null) {
            bVar.b(f10);
        }
    }

    private void a(int i10) {
        b bVar = this.f6336c;
        if (bVar != null) {
            bVar.f(i10);
        }
    }

    public int a(boolean z10, int i10) {
        if (d(i10)) {
            b();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return f();
        }
        return -1;
    }

    private void b() {
        if (this.f6338e == 0) {
            return;
        }
        if (yp.a >= 26) {
            c();
        } else {
            a();
        }
        c(0);
    }

    public void b(k1 k1Var) {
        if (yp.a(this.f6337d, k1Var)) {
            return;
        }
        this.f6337d = k1Var;
        int a10 = a(k1Var);
        this.f6339f = a10;
        boolean z10 = true;
        if (a10 != 1 && a10 != 0) {
            z10 = false;
        }
        a1.a(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }
}
