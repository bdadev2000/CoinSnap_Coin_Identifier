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

/* renamed from: com.applovin.impl.sdk.f */
/* loaded from: classes.dex */
public class C0754f extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: i */
    public static int f10796i = -1;

    /* renamed from: a */
    private final AudioManager f10797a;
    private final Context b;

    /* renamed from: c */
    private final k f10798c;

    /* renamed from: d */
    private final Set f10799d = new HashSet();

    /* renamed from: f */
    private final Object f10800f = new Object();

    /* renamed from: g */
    private boolean f10801g;

    /* renamed from: h */
    private int f10802h;

    /* renamed from: com.applovin.impl.sdk.f$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i9);
    }

    public C0754f(k kVar) {
        this.f10798c = kVar;
        Context k6 = k.k();
        this.b = k6;
        this.f10797a = (AudioManager) k6.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public static boolean a(int i9) {
        return i9 == 0 || i9 == 1;
    }

    private void c() {
        this.f10798c.L();
        if (t.a()) {
            this.f10798c.L().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f10797a.getRingerMode());
        }
    }

    public int a() {
        return this.f10797a.getRingerMode();
    }

    public void b(a aVar) {
        synchronized (this.f10800f) {
            try {
                if (this.f10799d.contains(aVar)) {
                    this.f10799d.remove(aVar);
                    if (this.f10799d.isEmpty()) {
                        c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f10800f) {
            try {
                if (this.f10799d.contains(aVar)) {
                    return;
                }
                this.f10799d.add(aVar);
                if (this.f10799d.size() == 1) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f10801g = true;
            this.f10802h = this.f10797a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f10801g = false;
            if (this.f10802h != this.f10797a.getRingerMode()) {
                this.f10802h = f10796i;
                b(this.f10797a.getRingerMode());
            }
        }
    }

    private void b() {
        this.f10798c.L();
        if (t.a()) {
            this.f10798c.L().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f10802h = f10796i;
        this.b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(int i9) {
        if (this.f10801g) {
            return;
        }
        this.f10798c.L();
        if (t.a()) {
            this.f10798c.L().a("AudioSessionManager", "Ringer mode is " + i9);
        }
        synchronized (this.f10800f) {
            try {
                Iterator it = this.f10799d.iterator();
                while (it.hasNext()) {
                    AppLovinSdkUtils.runOnUiThread(new K.m(i9, 3, (a) it.next()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
