package com.applovin.impl;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f26998a;

    /* renamed from: b, reason: collision with root package name */
    private int f26999b;

    /* renamed from: c, reason: collision with root package name */
    private long f27000c;
    private long d;
    private long e;

    /* renamed from: f, reason: collision with root package name */
    private long f27001f;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f27002a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f27003b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f27004c;
        private long d;
        private long e;

        public a(AudioTrack audioTrack) {
            this.f27002a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.f27003b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f27002a.getTimestamp(this.f27003b);
            if (timestamp) {
                long j2 = this.f27003b.framePosition;
                if (this.d > j2) {
                    this.f27004c++;
                }
                this.d = j2;
                this.e = j2 + (this.f27004c << 32);
            }
            return timestamp;
        }
    }

    public t1(AudioTrack audioTrack) {
        if (xp.f27962a >= 19) {
            this.f26998a = new a(audioTrack);
            f();
        } else {
            this.f26998a = null;
            a(3);
        }
    }

    public void a() {
        if (this.f26999b == 4) {
            f();
        }
    }

    public long b() {
        a aVar = this.f26998a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f26998a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f26999b == 2;
    }

    public void e() {
        a(4);
    }

    public void f() {
        if (this.f26998a != null) {
            a(0);
        }
    }

    public boolean a(long j2) {
        a aVar = this.f26998a;
        if (aVar == null || j2 - this.e < this.d) {
            return false;
        }
        this.e = j2;
        boolean c2 = aVar.c();
        int i2 = this.f26999b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c2) {
                        f();
                    }
                } else if (!c2) {
                    f();
                }
            } else if (!c2) {
                f();
            } else if (this.f26998a.a() > this.f27001f) {
                a(2);
            }
        } else if (c2) {
            if (this.f26998a.b() < this.f27000c) {
                return false;
            }
            this.f27001f = this.f26998a.a();
            a(1);
        } else if (j2 - this.f27000c > 500000) {
            a(3);
        }
        return c2;
    }

    private void a(int i2) {
        this.f26999b = i2;
        if (i2 == 0) {
            this.e = 0L;
            this.f27001f = -1L;
            this.f27000c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i2 == 1) {
            this.d = 10000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.d = 10000000L;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
