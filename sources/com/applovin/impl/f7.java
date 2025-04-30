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
    private static int f7567d;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f7568f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7569a;
    private final b b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7570c;

    private f7(b bVar, SurfaceTexture surfaceTexture, boolean z8) {
        super(surfaceTexture);
        this.b = bVar;
        this.f7569a = z8;
    }

    private static int a(Context context) {
        if (z9.a(context)) {
            return z9.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z8;
        synchronized (f7.class) {
            try {
                z8 = true;
                if (!f7568f) {
                    f7567d = a(context);
                    f7568f = true;
                }
                if (f7567d == 0) {
                    z8 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.f7570c) {
                    this.b.a();
                    this.f7570c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f7 a(Context context, boolean z8) {
        AbstractC0669a1.b(!z8 || b(context));
        return new b().a(z8 ? f7567d : 0);
    }

    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private l7 f7571a;
        private Handler b;

        /* renamed from: c, reason: collision with root package name */
        private Error f7572c;

        /* renamed from: d, reason: collision with root package name */
        private RuntimeException f7573d;

        /* renamed from: f, reason: collision with root package name */
        private f7 f7574f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i9) {
            AbstractC0669a1.a(this.f7571a);
            this.f7571a.a(i9);
            this.f7574f = new f7(this, this.f7571a.c(), i9 != 0);
        }

        public f7 a(int i9) {
            boolean z8;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.b = handler;
            this.f7571a = new l7(handler);
            synchronized (this) {
                z8 = false;
                this.b.obtainMessage(1, i9, 0).sendToTarget();
                while (this.f7574f == null && this.f7573d == null && this.f7572c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z8 = true;
                    }
                }
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f7573d;
            if (runtimeException == null) {
                Error error = this.f7572c;
                if (error == null) {
                    return (f7) AbstractC0669a1.a(this.f7574f);
                }
                throw error;
            }
            throw runtimeException;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            try {
                if (i9 != 1) {
                    if (i9 != 2) {
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
                } catch (Error e4) {
                    kc.a("DummySurface", "Failed to initialize dummy surface", e4);
                    this.f7572c = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    kc.a("DummySurface", "Failed to initialize dummy surface", e9);
                    this.f7573d = e9;
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
            AbstractC0669a1.a(this.f7571a);
            this.f7571a.d();
        }

        public void a() {
            AbstractC0669a1.a(this.b);
            this.b.sendEmptyMessage(2);
        }
    }
}
