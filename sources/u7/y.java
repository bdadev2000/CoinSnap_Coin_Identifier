package u7;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class y {
    public final x a;

    /* renamed from: b, reason: collision with root package name */
    public int f25707b;

    /* renamed from: c, reason: collision with root package name */
    public long f25708c;

    /* renamed from: d, reason: collision with root package name */
    public long f25709d;

    /* renamed from: e, reason: collision with root package name */
    public long f25710e;

    /* renamed from: f, reason: collision with root package name */
    public long f25711f;

    public y(AudioTrack audioTrack) {
        if (n9.h0.a >= 19) {
            this.a = new x(audioTrack);
            a();
        } else {
            this.a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f25707b = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f25709d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f25709d = 10000000L;
                return;
            }
            this.f25709d = 10000L;
            return;
        }
        this.f25710e = 0L;
        this.f25711f = -1L;
        this.f25708c = System.nanoTime() / 1000;
        this.f25709d = 10000L;
    }
}
