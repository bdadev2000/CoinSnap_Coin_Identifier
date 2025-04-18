package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class d {
    public static double a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private Context f14122b;

    /* renamed from: c, reason: collision with root package name */
    private AudioManager f14123c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14124d = false;

    /* renamed from: e, reason: collision with root package name */
    private b f14125e;

    /* renamed from: f, reason: collision with root package name */
    private a f14126f;

    /* loaded from: classes4.dex */
    public static class a extends BroadcastReceiver {
        private WeakReference<d> a;

        public a(d dVar) {
            this.a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar;
            b b3;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = this.a.get()) != null && (b3 = dVar.b()) != null) {
                double a = dVar.a();
                if (a >= 0.0d) {
                    b3.a(a);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f14122b = context;
        this.f14123c = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public final double a() {
        AudioManager audioManager = this.f14123c;
        double streamVolume = ((this.f14123c != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.f14125e;
    }

    public final void c() {
        if (this.f14122b != null) {
            this.f14126f = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f14122b.registerReceiver(this.f14126f, intentFilter);
            this.f14124d = true;
        }
    }

    public final void d() {
        Context context;
        if (this.f14124d && (context = this.f14122b) != null) {
            try {
                context.unregisterReceiver(this.f14126f);
                this.f14125e = null;
                this.f14124d = false;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(b bVar) {
        this.f14125e = bVar;
    }
}
