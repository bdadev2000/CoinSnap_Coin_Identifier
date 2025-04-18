package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public final class d extends ContentObserver {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f12243b;

    /* renamed from: c, reason: collision with root package name */
    private final a f12244c;

    /* renamed from: d, reason: collision with root package name */
    private final c f12245d;

    /* renamed from: e, reason: collision with root package name */
    private float f12246e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.a = context;
        this.f12243b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f12244c = aVar;
        this.f12245d = cVar;
    }

    private float a() {
        return this.f12244c.a(this.f12243b.getStreamVolume(3), this.f12243b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f12245d.a(this.f12246e);
    }

    public void c() {
        this.f12246e = a();
        b();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float a = a();
        if (a(a)) {
            this.f12246e = a;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f12246e;
    }
}
