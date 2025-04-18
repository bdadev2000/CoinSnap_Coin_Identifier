package com.applovin.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* loaded from: classes.dex */
public final class f7 extends Surface {

    /* renamed from: d, reason: collision with root package name */
    private static int f4614d;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f4615f;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final b f4616b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4617c;

    private f7(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f4616b = bVar;
        this.a = z10;
    }

    private static int a(Context context) {
        if (z9.a(context)) {
            return z9.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (f7.class) {
            z10 = true;
            if (!f4615f) {
                f4614d = a(context);
                f4615f = true;
            }
            if (f4614d == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f4616b) {
            if (!this.f4617c) {
                this.f4616b.a();
                this.f4617c = true;
            }
        }
    }

    public static f7 a(Context context, boolean z10) {
        a1.b(!z10 || b(context));
        return new b().a(z10 ? f4614d : 0);
    }

    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {
        private l7 a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f4618b;

        /* renamed from: c, reason: collision with root package name */
        private Error f4619c;

        /* renamed from: d, reason: collision with root package name */
        private RuntimeException f4620d;

        /* renamed from: f, reason: collision with root package name */
        private f7 f4621f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i10) {
            a1.a(this.a);
            this.a.a(i10);
            this.f4621f = new f7(this, this.a.c(), i10 != 0);
        }

        public f7 a(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f4618b = handler;
            this.a = new l7(handler);
            synchronized (this) {
                z10 = false;
                this.f4618b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f4621f == null && this.f4620d == null && this.f4619c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f4620d;
            if (runtimeException == null) {
                Error error = this.f4619c;
                if (error == null) {
                    return (f7) a1.a(this.f4621f);
                }
                throw error;
            }
            throw runtimeException;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
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
                } catch (Error e2) {
                    kc.a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f4619c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    kc.a("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f4620d = e10;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }

        private void b() {
            a1.a(this.a);
            this.a.d();
        }

        public void a() {
            a1.a(this.f4618b);
            this.f4618b.sendEmptyMessage(2);
        }
    }
}
