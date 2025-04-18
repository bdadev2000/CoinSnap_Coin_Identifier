package com.applovin.impl;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s1 {
    private final a a;

    /* renamed from: b, reason: collision with root package name */
    private int f7426b;

    /* renamed from: c, reason: collision with root package name */
    private long f7427c;

    /* renamed from: d, reason: collision with root package name */
    private long f7428d;

    /* renamed from: e, reason: collision with root package name */
    private long f7429e;

    /* renamed from: f, reason: collision with root package name */
    private long f7430f;

    /* loaded from: classes.dex */
    public static final class a {
        private final AudioTrack a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f7431b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f7432c;

        /* renamed from: d, reason: collision with root package name */
        private long f7433d;

        /* renamed from: e, reason: collision with root package name */
        private long f7434e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.f7434e;
        }

        public long b() {
            return this.f7431b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.f7431b);
            if (timestamp) {
                long j3 = this.f7431b.framePosition;
                if (this.f7433d > j3) {
                    this.f7432c++;
                }
                this.f7433d = j3;
                this.f7434e = j3 + (this.f7432c << 32);
            }
            return timestamp;
        }
    }

    public s1(AudioTrack audioTrack) {
        if (yp.a >= 19) {
            this.a = new a(audioTrack);
            f();
        } else {
            this.a = null;
            a(3);
        }
    }

    public void a() {
        if (this.f7426b == 4) {
            f();
        }
    }

    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.a;
        return aVar != null ? aVar.b() : C.TIME_UNSET;
    }

    public boolean d() {
        return this.f7426b == 2;
    }

    public void e() {
        a(4);
    }

    public void f() {
        if (this.a != null) {
            a(0);
        }
    }

    public boolean a(long j3) {
        a aVar = this.a;
        if (aVar == null || j3 - this.f7429e < this.f7428d) {
            return false;
        }
        this.f7429e = j3;
        boolean c10 = aVar.c();
        int i10 = this.f7426b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c10) {
                        f();
                    }
                } else if (!c10) {
                    f();
                }
            } else if (!c10) {
                f();
            } else if (this.a.a() > this.f7430f) {
                a(2);
            }
        } else if (c10) {
            if (this.a.b() < this.f7427c) {
                return false;
            }
            this.f7430f = this.a.a();
            a(1);
        } else if (j3 - this.f7427c > 500000) {
            a(3);
        }
        return c10;
    }

    private void a(int i10) {
        this.f7426b = i10;
        if (i10 == 0) {
            this.f7429e = 0L;
            this.f7430f = -1L;
            this.f7427c = System.nanoTime() / 1000;
            this.f7428d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f7428d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f7428d = 10000000L;
        } else {
            if (i10 == 4) {
                this.f7428d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
