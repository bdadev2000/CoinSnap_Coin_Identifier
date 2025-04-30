package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static double f16652a = -1.0d;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private AudioManager f16653c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16654d = false;

    /* renamed from: e, reason: collision with root package name */
    private b f16655e;

    /* renamed from: f, reason: collision with root package name */
    private a f16656f;

    /* loaded from: classes3.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<d> f16657a;

        public a(d dVar) {
            this.f16657a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar;
            b b;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = this.f16657a.get()) != null && (b = dVar.b()) != null) {
                double a6 = dVar.a();
                if (a6 >= 0.0d) {
                    b.a(a6);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(double d2);
    }

    public d(Context context) {
        this.b = context;
        this.f16653c = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public final double a() {
        AudioManager audioManager = this.f16653c;
        double streamVolume = ((this.f16653c != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f16652a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.f16655e;
    }

    public final void c() {
        if (this.b != null) {
            this.f16656f = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.b.registerReceiver(this.f16656f, intentFilter);
            this.f16654d = true;
        }
    }

    public final void d() {
        Context context;
        if (this.f16654d && (context = this.b) != null) {
            try {
                context.unregisterReceiver(this.f16656f);
                this.f16655e = null;
                this.f16654d = false;
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public final void a(b bVar) {
        this.f16655e = bVar;
    }
}
