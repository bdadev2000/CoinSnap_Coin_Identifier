package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14408a;
    private final AudioManager b;

    /* renamed from: c, reason: collision with root package name */
    private final a f14409c;

    /* renamed from: d, reason: collision with root package name */
    private final c f14410d;

    /* renamed from: e, reason: collision with root package name */
    private float f14411e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f14408a = context;
        this.b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f14409c = aVar;
        this.f14410d = cVar;
    }

    private float a() {
        return this.f14409c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f14410d.a(this.f14411e);
    }

    public void c() {
        this.f14411e = a();
        b();
        this.f14408a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f14408a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z8) {
        super.onChange(z8);
        float a6 = a();
        if (a(a6)) {
            this.f14411e = a6;
            b();
        }
    }

    private boolean a(float f9) {
        return f9 != this.f14411e;
    }
}
