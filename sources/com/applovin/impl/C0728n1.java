package com.applovin.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* renamed from: com.applovin.impl.n1 */
/* loaded from: classes.dex */
public final class C0728n1 {

    /* renamed from: a */
    private final AudioManager f9258a;
    private final a b;

    /* renamed from: c */
    private b f9259c;

    /* renamed from: d */
    private C0716k1 f9260d;

    /* renamed from: f */
    private int f9262f;

    /* renamed from: h */
    private AudioFocusRequest f9264h;

    /* renamed from: i */
    private boolean f9265i;

    /* renamed from: g */
    private float f9263g = 1.0f;

    /* renamed from: e */
    private int f9261e = 0;

    /* renamed from: com.applovin.impl.n1$a */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f9266a;

        public a(Handler handler) {
            this.f9266a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i9) {
            this.f9266a.post(new K0(i9, 1, this));
        }

        public /* synthetic */ void a(int i9) {
            C0728n1.this.b(i9);
        }
    }

    /* renamed from: com.applovin.impl.n1$b */
    /* loaded from: classes.dex */
    public interface b {
        void b(float f9);

        void f(int i9);
    }

    public C0728n1(Context context, Handler handler, b bVar) {
        this.f9258a = (AudioManager) AbstractC0669a1.a((AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f9259c = bVar;
        this.b = new a(handler);
    }

    private void a() {
        this.f9258a.abandonAudioFocus(this.b);
    }

    private void b() {
        if (this.f9261e == 0) {
            return;
        }
        if (yp.f12451a >= 26) {
            c();
        } else {
            a();
        }
        c(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f9264h;
        if (audioFocusRequest != null) {
            this.f9258a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private int f() {
        int g9;
        if (this.f9261e == 1) {
            return 1;
        }
        if (yp.f12451a >= 26) {
            g9 = h();
        } else {
            g9 = g();
        }
        if (g9 == 1) {
            c(1);
            return 1;
        }
        c(0);
        return -1;
    }

    private int g() {
        return this.f9258a.requestAudioFocus(this.b, yp.e(((C0716k1) AbstractC0669a1.a(this.f9260d)).f8532c), this.f9262f);
    }

    private int h() {
        AudioFocusRequest.Builder m;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f9264h;
        if (audioFocusRequest == null || this.f9265i) {
            if (audioFocusRequest == null) {
                V1.a.o();
                m = V1.a.i(this.f9262f);
            } else {
                V1.a.o();
                m = V1.a.m(this.f9264h);
            }
            boolean i9 = i();
            audioAttributes = m.setAudioAttributes(((C0716k1) AbstractC0669a1.a(this.f9260d)).a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(i9);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.b);
            build = onAudioFocusChangeListener.build();
            this.f9264h = build;
            this.f9265i = false;
        }
        requestAudioFocus = this.f9258a.requestAudioFocus(this.f9264h);
        return requestAudioFocus;
    }

    private boolean i() {
        C0716k1 c0716k1 = this.f9260d;
        if (c0716k1 != null && c0716k1.f8531a == 1) {
            return true;
        }
        return false;
    }

    public float d() {
        return this.f9263g;
    }

    public void e() {
        this.f9259c = null;
        b();
    }

    private boolean d(int i9) {
        return i9 == 1 || this.f9262f != 1;
    }

    private static int a(C0716k1 c0716k1) {
        if (c0716k1 == null) {
            return 0;
        }
        switch (c0716k1.f8532c) {
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
                if (c0716k1.f8531a == 1) {
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
                kc.d("AudioFocusManager", "Unidentified audio usage: " + c0716k1.f8532c);
                return 0;
            case 16:
                return yp.f12451a >= 19 ? 4 : 2;
        }
    }

    private void c(int i9) {
        if (this.f9261e == i9) {
            return;
        }
        this.f9261e = i9;
        float f9 = i9 == 3 ? 0.2f : 1.0f;
        if (this.f9263g == f9) {
            return;
        }
        this.f9263g = f9;
        b bVar = this.f9259c;
        if (bVar != null) {
            bVar.b(f9);
        }
    }

    public void b(int i9) {
        if (i9 == -3 || i9 == -2) {
            if (i9 != -2 && !i()) {
                c(3);
                return;
            } else {
                a(0);
                c(2);
                return;
            }
        }
        if (i9 == -1) {
            a(-1);
            b();
        } else if (i9 != 1) {
            L.p(i9, "Unknown focus change type: ", "AudioFocusManager");
        } else {
            c(1);
            a(1);
        }
    }

    private void a(int i9) {
        b bVar = this.f9259c;
        if (bVar != null) {
            bVar.f(i9);
        }
    }

    public int a(boolean z8, int i9) {
        if (d(i9)) {
            b();
            return z8 ? 1 : -1;
        }
        if (z8) {
            return f();
        }
        return -1;
    }

    public void b(C0716k1 c0716k1) {
        if (yp.a(this.f9260d, c0716k1)) {
            return;
        }
        this.f9260d = c0716k1;
        int a6 = a(c0716k1);
        this.f9262f = a6;
        boolean z8 = true;
        if (a6 != 1 && a6 != 0) {
            z8 = false;
        }
        AbstractC0669a1.a(z8, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }
}
