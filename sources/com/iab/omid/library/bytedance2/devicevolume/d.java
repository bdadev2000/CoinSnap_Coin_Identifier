package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14510a;
    private final AudioManager b;

    /* renamed from: c, reason: collision with root package name */
    private final a f14511c;

    /* renamed from: d, reason: collision with root package name */
    private final c f14512d;

    /* renamed from: e, reason: collision with root package name */
    private float f14513e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f14510a = context;
        this.b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f14511c = aVar;
        this.f14512d = cVar;
    }

    private float a() {
        return this.f14511c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f14512d.a(this.f14513e);
    }

    public void c() {
        this.f14513e = a();
        b();
        this.f14510a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f14510a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z8) {
        super.onChange(z8);
        float a6 = a();
        if (a(a6)) {
            this.f14513e = a6;
            b();
        }
    }

    private boolean a(float f9) {
        return f9 != this.f14513e;
    }
}
