package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28949a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f28950b;

    /* renamed from: c, reason: collision with root package name */
    private final a f28951c;
    private final c d;
    private float e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f28949a = context;
        this.f28950b = (AudioManager) context.getSystemService("audio");
        this.f28951c = aVar;
        this.d = cVar;
    }

    private boolean a(float f2) {
        return f2 != this.e;
    }

    private void b() {
        this.d.a(this.e);
    }

    public void c() {
        this.e = a();
        b();
        this.f28949a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f28949a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float a2 = a();
        if (a(a2)) {
            this.e = a2;
            b();
        }
    }

    private float a() {
        return this.f28951c.a(this.f28950b.getStreamVolume(3), this.f28950b.getStreamMaxVolume(3));
    }
}
