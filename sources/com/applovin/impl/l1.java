package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
final class l1 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5806b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5807c;

    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {
        private final b a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f5808b;

        public a(Handler handler, b bVar) {
            this.f5808b = handler;
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f5808b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l1.this.f5807c) {
                this.a.c();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void c();
    }

    public l1(Context context, Handler handler, b bVar) {
        this.a = context.getApplicationContext();
        this.f5806b = new a(handler, bVar);
    }

    public void a(boolean z10) {
        if (z10 && !this.f5807c) {
            this.a.registerReceiver(this.f5806b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f5807c = true;
        } else {
            if (z10 || !this.f5807c) {
                return;
            }
            this.a.unregisterReceiver(this.f5806b);
            this.f5807c = false;
        }
    }
}
