package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class f extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: i */
    public static int f7660i = -1;
    private final AudioManager a;

    /* renamed from: b */
    private final Context f7661b;

    /* renamed from: c */
    private final k f7662c;

    /* renamed from: d */
    private final Set f7663d = new HashSet();

    /* renamed from: f */
    private final Object f7664f = new Object();

    /* renamed from: g */
    private boolean f7665g;

    /* renamed from: h */
    private int f7666h;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);
    }

    public f(k kVar) {
        this.f7662c = kVar;
        Context k10 = k.k();
        this.f7661b = k10;
        this.a = (AudioManager) k10.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public static /* synthetic */ void b(a aVar, int i10) {
        aVar.a(i10);
    }

    private void c() {
        this.f7662c.L();
        if (t.a()) {
            this.f7662c.L().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f7661b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.a.getRingerMode());
        }
    }

    public int a() {
        return this.a.getRingerMode();
    }

    public void b(a aVar) {
        synchronized (this.f7664f) {
            if (this.f7663d.contains(aVar)) {
                this.f7663d.remove(aVar);
                if (this.f7663d.isEmpty()) {
                    c();
                }
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f7664f) {
            if (this.f7663d.contains(aVar)) {
                return;
            }
            this.f7663d.add(aVar);
            if (this.f7663d.size() == 1) {
                b();
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f7665g = true;
            this.f7666h = this.a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f7665g = false;
            if (this.f7666h != this.a.getRingerMode()) {
                this.f7666h = f7660i;
                b(this.a.getRingerMode());
            }
        }
    }

    private void b() {
        this.f7662c.L();
        if (t.a()) {
            this.f7662c.L().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f7666h = f7660i;
        this.f7661b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(int i10) {
        if (this.f7665g) {
            return;
        }
        this.f7662c.L();
        if (t.a()) {
            this.f7662c.L().a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f7664f) {
            Iterator it = this.f7663d.iterator();
            while (it.hasNext()) {
                AppLovinSdkUtils.runOnUiThread(new f0.m(i10, 2, (a) it.next()));
            }
        }
    }
}
