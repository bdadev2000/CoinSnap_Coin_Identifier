package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25174a;

    /* renamed from: b, reason: collision with root package name */
    private final a f25175b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25176c;

    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f25177a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f25178b;

        public a(Handler handler, b bVar) {
            this.f25178b = handler;
            this.f25177a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f25178b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m1.this.f25176c) {
                this.f25177a.c();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void c();
    }

    public m1(Context context, Handler handler, b bVar) {
        this.f25174a = context.getApplicationContext();
        this.f25175b = new a(handler, bVar);
    }

    public void a(boolean z2) {
        if (z2 && !this.f25176c) {
            this.f25174a.registerReceiver(this.f25175b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f25176c = true;
        } else {
            if (z2 || !this.f25176c) {
                return;
            }
            this.f25174a.unregisterReceiver(this.f25175b);
            this.f25176c = false;
        }
    }
}
