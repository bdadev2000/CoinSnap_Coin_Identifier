package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720l1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8770a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8771c;

    /* renamed from: com.applovin.impl.l1$a */
    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f8772a;
        private final Handler b;

        public a(Handler handler, b bVar) {
            this.b = handler;
            this.f8772a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0720l1.this.f8771c) {
                this.f8772a.c();
            }
        }
    }

    /* renamed from: com.applovin.impl.l1$b */
    /* loaded from: classes.dex */
    public interface b {
        void c();
    }

    public C0720l1(Context context, Handler handler, b bVar) {
        this.f8770a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    public void a(boolean z8) {
        if (z8 && !this.f8771c) {
            this.f8770a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f8771c = true;
        } else {
            if (z8 || !this.f8771c) {
                return;
            }
            this.f8770a.unregisterReceiver(this.b);
            this.f8771c = false;
        }
    }
}
