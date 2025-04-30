package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class fl {

    /* renamed from: a */
    private final Context f7727a;
    private final Handler b;

    /* renamed from: c */
    private final b f7728c;

    /* renamed from: d */
    private final AudioManager f7729d;

    /* renamed from: e */
    private c f7730e;

    /* renamed from: f */
    private int f7731f;

    /* renamed from: g */
    private int f7732g;

    /* renamed from: h */
    private boolean f7733h;

    /* loaded from: classes.dex */
    public interface b {
        void a(int i9, boolean z8);

        void d(int i9);
    }

    /* loaded from: classes.dex */
    public final class c extends BroadcastReceiver {
        private c() {
        }

        public static /* synthetic */ void b(fl flVar) {
            flVar.d();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            fl.this.b.post(new F0(fl.this, 1));
        }

        public /* synthetic */ c(fl flVar, a aVar) {
            this();
        }
    }

    public fl(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7727a = applicationContext;
        this.b = handler;
        this.f7728c = bVar;
        AudioManager audioManager = (AudioManager) AbstractC0669a1.b((AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f7729d = audioManager;
        this.f7731f = 3;
        this.f7732g = b(audioManager, 3);
        this.f7733h = a(audioManager, this.f7731f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f7730e = cVar;
        } catch (RuntimeException e4) {
            kc.c("StreamVolumeManager", "Error registering stream volume receiver", e4);
        }
    }

    public void d() {
        int b8 = b(this.f7729d, this.f7731f);
        boolean a6 = a(this.f7729d, this.f7731f);
        if (this.f7732g != b8 || this.f7733h != a6) {
            this.f7732g = b8;
            this.f7733h = a6;
            this.f7728c.a(b8, a6);
        }
    }

    public void c() {
        c cVar = this.f7730e;
        if (cVar != null) {
            try {
                this.f7727a.unregisterReceiver(cVar);
            } catch (RuntimeException e4) {
                kc.c("StreamVolumeManager", "Error unregistering stream volume receiver", e4);
            }
            this.f7730e = null;
        }
    }

    private static int b(AudioManager audioManager, int i9) {
        try {
            return audioManager.getStreamVolume(i9);
        } catch (RuntimeException e4) {
            kc.c("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i9, e4);
            return audioManager.getStreamMaxVolume(i9);
        }
    }

    public int a() {
        return this.f7729d.getStreamMaxVolume(this.f7731f);
    }

    public void a(int i9) {
        if (this.f7731f == i9) {
            return;
        }
        this.f7731f = i9;
        d();
        this.f7728c.d(i9);
    }

    public int b() {
        int streamMinVolume;
        if (yp.f12451a < 28) {
            return 0;
        }
        streamMinVolume = this.f7729d.getStreamMinVolume(this.f7731f);
        return streamMinVolume;
    }

    private static boolean a(AudioManager audioManager, int i9) {
        if (yp.f12451a >= 23) {
            return audioManager.isStreamMute(i9);
        }
        return b(audioManager, i9) == 0;
    }
}
