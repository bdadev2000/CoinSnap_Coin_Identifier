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
    private final Context a;

    /* renamed from: b */
    private final Handler f4771b;

    /* renamed from: c */
    private final b f4772c;

    /* renamed from: d */
    private final AudioManager f4773d;

    /* renamed from: e */
    private c f4774e;

    /* renamed from: f */
    private int f4775f;

    /* renamed from: g */
    private int f4776g;

    /* renamed from: h */
    private boolean f4777h;

    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, boolean z10);

        void d(int i10);
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
            fl.this.f4771b.post(new nt(fl.this, 1));
        }

        public /* synthetic */ c(fl flVar, a aVar) {
            this();
        }
    }

    public fl(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f4771b = handler;
        this.f4772c = bVar;
        AudioManager audioManager = (AudioManager) a1.b((AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f4773d = audioManager;
        this.f4775f = 3;
        this.f4776g = b(audioManager, 3);
        this.f4777h = a(audioManager, this.f4775f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f4774e = cVar;
        } catch (RuntimeException e2) {
            kc.c("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    public void d() {
        int b3 = b(this.f4773d, this.f4775f);
        boolean a10 = a(this.f4773d, this.f4775f);
        if (this.f4776g != b3 || this.f4777h != a10) {
            this.f4776g = b3;
            this.f4777h = a10;
            this.f4772c.a(b3, a10);
        }
    }

    public void c() {
        c cVar = this.f4774e;
        if (cVar != null) {
            try {
                this.a.unregisterReceiver(cVar);
            } catch (RuntimeException e2) {
                kc.c("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            this.f4774e = null;
        }
    }

    private static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e2) {
            kc.c("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e2);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public int a() {
        return this.f4773d.getStreamMaxVolume(this.f4775f);
    }

    public void a(int i10) {
        if (this.f4775f == i10) {
            return;
        }
        this.f4775f = i10;
        d();
        this.f4772c.d(i10);
    }

    public int b() {
        int streamMinVolume;
        if (yp.a < 28) {
            return 0;
        }
        streamMinVolume = this.f4773d.getStreamMinVolume(this.f4775f);
        return streamMinVolume;
    }

    private static boolean a(AudioManager audioManager, int i10) {
        if (yp.a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return b(audioManager, i10) == 0;
    }
}
