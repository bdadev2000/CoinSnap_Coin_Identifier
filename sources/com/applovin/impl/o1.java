package com.applovin.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a */
    private final AudioManager f25803a;

    /* renamed from: b */
    private final a f25804b;

    /* renamed from: c */
    private b f25805c;
    private l1 d;

    /* renamed from: f */
    private int f25806f;

    /* renamed from: h */
    private AudioFocusRequest f25808h;

    /* renamed from: i */
    private boolean f25809i;

    /* renamed from: g */
    private float f25807g = 1.0f;
    private int e = 0;

    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f25810a;

        public a(Handler handler) {
            this.f25810a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i2) {
            this.f25810a.post(new du(i2, 1, this));
        }

        public /* synthetic */ void a(int i2) {
            o1.this.b(i2);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b(float f2);

        void f(int i2);
    }

    public o1(Context context, Handler handler, b bVar) {
        this.f25803a = (AudioManager) b1.a((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f25805c = bVar;
        this.f25804b = new a(handler);
    }

    private void a() {
        this.f25803a.abandonAudioFocus(this.f25804b);
    }

    public void b(int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2 && !i()) {
                c(3);
                return;
            } else {
                a(0);
                c(2);
                return;
            }
        }
        if (i2 == -1) {
            a(-1);
            b();
        } else if (i2 != 1) {
            com.applovin.impl.adview.t.u("Unknown focus change type: ", i2, "AudioFocusManager");
        } else {
            c(1);
            a(1);
        }
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f25808h;
        if (audioFocusRequest != null) {
            this.f25803a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private int f() {
        if (this.e == 1) {
            return 1;
        }
        if ((xp.f27962a >= 26 ? h() : g()) == 1) {
            c(1);
            return 1;
        }
        c(0);
        return -1;
    }

    private int g() {
        return this.f25803a.requestAudioFocus(this.f25804b, xp.e(((l1) b1.a(this.d)).f24971c), this.f25806f);
    }

    private int h() {
        AudioFocusRequest audioFocusRequest = this.f25808h;
        if (audioFocusRequest == null || this.f25809i) {
            this.f25808h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f25806f) : new AudioFocusRequest.Builder(this.f25808h)).setAudioAttributes(((l1) b1.a(this.d)).a()).setWillPauseWhenDucked(i()).setOnAudioFocusChangeListener(this.f25804b).build();
            this.f25809i = false;
        }
        return this.f25803a.requestAudioFocus(this.f25808h);
    }

    private boolean i() {
        l1 l1Var = this.d;
        return l1Var != null && l1Var.f24969a == 1;
    }

    public float d() {
        return this.f25807g;
    }

    public void e() {
        this.f25805c = null;
        b();
    }

    private void c(int i2) {
        if (this.e == i2) {
            return;
        }
        this.e = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.f25807g == f2) {
            return;
        }
        this.f25807g = f2;
        b bVar = this.f25805c;
        if (bVar != null) {
            bVar.b(f2);
        }
    }

    private boolean d(int i2) {
        return i2 == 1 || this.f25806f != 1;
    }

    private static int a(l1 l1Var) {
        if (l1Var == null) {
            return 0;
        }
        switch (l1Var.f24971c) {
            case 0:
                pc.d("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (l1Var.f24969a == 1) {
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
                pc.d("AudioFocusManager", "Unidentified audio usage: " + l1Var.f24971c);
                return 0;
            case 16:
                return xp.f27962a >= 19 ? 4 : 2;
        }
    }

    private void a(int i2) {
        b bVar = this.f25805c;
        if (bVar != null) {
            bVar.f(i2);
        }
    }

    public int a(boolean z2, int i2) {
        if (d(i2)) {
            b();
            return z2 ? 1 : -1;
        }
        if (z2) {
            return f();
        }
        return -1;
    }

    private void b() {
        if (this.e == 0) {
            return;
        }
        if (xp.f27962a >= 26) {
            c();
        } else {
            a();
        }
        c(0);
    }

    public void b(l1 l1Var) {
        if (xp.a(this.d, l1Var)) {
            return;
        }
        this.d = l1Var;
        int a2 = a(l1Var);
        this.f25806f = a2;
        boolean z2 = true;
        if (a2 != 1 && a2 != 0) {
            z2 = false;
        }
        b1.a(z2, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }
}
