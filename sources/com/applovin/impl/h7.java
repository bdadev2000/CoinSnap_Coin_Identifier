package com.applovin.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class h7 extends Surface {
    private static int d;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f24233f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24234a;

    /* renamed from: b, reason: collision with root package name */
    private final b f24235b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24236c;

    private h7(b bVar, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.f24235b = bVar;
        this.f24234a = z2;
    }

    private static int a(Context context) {
        if (ba.a(context)) {
            return ba.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z2;
        synchronized (h7.class) {
            try {
                if (!f24233f) {
                    d = a(context);
                    f24233f = true;
                }
                z2 = d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f24235b) {
            try {
                if (!this.f24236c) {
                    this.f24235b.a();
                    this.f24236c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static h7 a(Context context, boolean z2) {
        b1.b(!z2 || b(context));
        return new b().a(z2 ? d : 0);
    }

    /* loaded from: classes3.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private n7 f24237a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f24238b;

        /* renamed from: c, reason: collision with root package name */
        private Error f24239c;
        private RuntimeException d;

        /* renamed from: f, reason: collision with root package name */
        private h7 f24240f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i2) {
            b1.a(this.f24237a);
            this.f24237a.a(i2);
            this.f24240f = new h7(this, this.f24237a.c(), i2 != 0);
        }

        public h7 a(int i2) {
            boolean z2;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f24238b = handler;
            this.f24237a = new n7(handler);
            synchronized (this) {
                z2 = false;
                this.f24238b.obtainMessage(1, i2, 0).sendToTarget();
                while (this.f24240f == null && this.d == null && this.f24239c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f24239c;
            if (error == null) {
                return (h7) b1.a(this.f24240f);
            }
            throw error;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    pc.a("DummySurface", "Failed to initialize dummy surface", e);
                    this.f24239c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    pc.a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        private void b() {
            b1.a(this.f24237a);
            this.f24237a.d();
        }

        public void a() {
            b1.a(this.f24238b);
            this.f24238b.sendEmptyMessage(2);
        }
    }
}
