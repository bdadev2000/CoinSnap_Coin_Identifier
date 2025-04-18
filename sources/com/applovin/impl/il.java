package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class il {

    /* renamed from: a */
    private final Context f24511a;

    /* renamed from: b */
    private final Handler f24512b;

    /* renamed from: c */
    private final b f24513c;
    private final AudioManager d;
    private c e;

    /* renamed from: f */
    private int f24514f;

    /* renamed from: g */
    private int f24515g;

    /* renamed from: h */
    private boolean f24516h;

    /* loaded from: classes.dex */
    public interface b {
        void a(int i2, boolean z2);

        void d(int i2);
    }

    /* loaded from: classes.dex */
    public final class c extends BroadcastReceiver {
        private c() {
        }

        public static /* synthetic */ void b(il ilVar) {
            ilVar.d();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            il.this.f24512b.post(new mt(il.this, 1));
        }

        public /* synthetic */ c(il ilVar, a aVar) {
            this();
        }
    }

    public il(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f24511a = applicationContext;
        this.f24512b = handler;
        this.f24513c = bVar;
        AudioManager audioManager = (AudioManager) b1.b((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f24514f = 3;
        this.f24515g = b(audioManager, 3);
        this.f24516h = a(audioManager, this.f24514f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = cVar;
        } catch (RuntimeException e) {
            pc.c("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public void d() {
        int b2 = b(this.d, this.f24514f);
        boolean a2 = a(this.d, this.f24514f);
        if (this.f24515g == b2 && this.f24516h == a2) {
            return;
        }
        this.f24515g = b2;
        this.f24516h = a2;
        this.f24513c.a(b2, a2);
    }

    public void c() {
        c cVar = this.e;
        if (cVar != null) {
            try {
                this.f24511a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                pc.c("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    private static int b(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e) {
            pc.c("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i2, e);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public int a() {
        return this.d.getStreamMaxVolume(this.f24514f);
    }

    public void a(int i2) {
        if (this.f24514f == i2) {
            return;
        }
        this.f24514f = i2;
        d();
        this.f24513c.d(i2);
    }

    private static boolean a(AudioManager audioManager, int i2) {
        if (xp.f27962a >= 23) {
            return audioManager.isStreamMute(i2);
        }
        return b(audioManager, i2) == 0;
    }

    public int b() {
        int streamMinVolume;
        if (xp.f27962a < 28) {
            return 0;
        }
        streamMinVolume = this.d.getStreamMinVolume(this.f24514f);
        return streamMinVolume;
    }
}
