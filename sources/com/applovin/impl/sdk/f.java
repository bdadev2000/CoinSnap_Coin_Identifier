package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class f extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: i */
    public static int f26614i = -1;

    /* renamed from: a */
    private final AudioManager f26615a;

    /* renamed from: b */
    private final Context f26616b;

    /* renamed from: c */
    private final j f26617c;
    private final Set d = new HashSet();

    /* renamed from: f */
    private final Object f26618f = new Object();

    /* renamed from: g */
    private boolean f26619g;

    /* renamed from: h */
    private int f26620h;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i2);
    }

    public f(j jVar) {
        this.f26617c = jVar;
        Context l2 = j.l();
        this.f26616b = l2;
        this.f26615a = (AudioManager) l2.getSystemService("audio");
    }

    public static boolean a(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private void c() {
        this.f26617c.J();
        if (n.a()) {
            this.f26617c.J().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f26616b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f26615a.getRingerMode());
        }
    }

    public int a() {
        return this.f26615a.getRingerMode();
    }

    public void b(a aVar) {
        synchronized (this.f26618f) {
            try {
                if (this.d.contains(aVar)) {
                    this.d.remove(aVar);
                    if (this.d.isEmpty()) {
                        c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f26618f) {
            try {
                if (this.d.contains(aVar)) {
                    return;
                }
                this.d.add(aVar);
                if (this.d.size() == 1) {
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
            this.f26619g = true;
            this.f26620h = this.f26615a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f26619g = false;
            if (this.f26620h != this.f26615a.getRingerMode()) {
                this.f26620h = f26614i;
                b(this.f26615a.getRingerMode());
            }
        }
    }

    private void b() {
        this.f26617c.J();
        if (n.a()) {
            this.f26617c.J().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f26620h = f26614i;
        this.f26616b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(int i2) {
        if (this.f26619g) {
            return;
        }
        this.f26617c.J();
        if (n.a()) {
            this.f26617c.J().a("AudioSessionManager", "Ringer mode is " + i2);
        }
        synchronized (this.f26618f) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    AppLovinSdkUtils.runOnUiThread(new androidx.core.content.res.b(i2, 2, (a) it.next()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
