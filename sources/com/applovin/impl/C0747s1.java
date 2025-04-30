package com.applovin.impl;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.applovin.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0747s1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f10551a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private long f10552c;

    /* renamed from: d, reason: collision with root package name */
    private long f10553d;

    /* renamed from: e, reason: collision with root package name */
    private long f10554e;

    /* renamed from: f, reason: collision with root package name */
    private long f10555f;

    /* renamed from: com.applovin.impl.s1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f10556a;
        private final AudioTimestamp b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f10557c;

        /* renamed from: d, reason: collision with root package name */
        private long f10558d;

        /* renamed from: e, reason: collision with root package name */
        private long f10559e;

        public a(AudioTrack audioTrack) {
            this.f10556a = audioTrack;
        }

        public long a() {
            return this.f10559e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f10556a.getTimestamp(this.b);
            if (timestamp) {
                long j7 = this.b.framePosition;
                if (this.f10558d > j7) {
                    this.f10557c++;
                }
                this.f10558d = j7;
                this.f10559e = j7 + (this.f10557c << 32);
            }
            return timestamp;
        }
    }

    public C0747s1(AudioTrack audioTrack) {
        if (yp.f12451a >= 19) {
            this.f10551a = new a(audioTrack);
            f();
        } else {
            this.f10551a = null;
            a(3);
        }
    }

    public void a() {
        if (this.b == 4) {
            f();
        }
    }

    public long b() {
        a aVar = this.f10551a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f10551a;
        if (aVar != null) {
            return aVar.b();
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public boolean d() {
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public void e() {
        a(4);
    }

    public void f() {
        if (this.f10551a != null) {
            a(0);
        }
    }

    public boolean a(long j7) {
        a aVar = this.f10551a;
        if (aVar == null || j7 - this.f10554e < this.f10553d) {
            return false;
        }
        this.f10554e = j7;
        boolean c9 = aVar.c();
        int i9 = this.b;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c9) {
                        f();
                    }
                } else if (!c9) {
                    f();
                }
            } else if (!c9) {
                f();
            } else if (this.f10551a.a() > this.f10555f) {
                a(2);
            }
        } else if (c9) {
            if (this.f10551a.b() < this.f10552c) {
                return false;
            }
            this.f10555f = this.f10551a.a();
            a(1);
        } else if (j7 - this.f10552c > 500000) {
            a(3);
        }
        return c9;
    }

    private void a(int i9) {
        this.b = i9;
        if (i9 == 0) {
            this.f10554e = 0L;
            this.f10555f = -1L;
            this.f10552c = System.nanoTime() / 1000;
            this.f10553d = 10000L;
            return;
        }
        if (i9 == 1) {
            this.f10553d = 10000L;
            return;
        }
        if (i9 == 2 || i9 == 3) {
            this.f10553d = 10000000L;
        } else {
            if (i9 == 4) {
                this.f10553d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
