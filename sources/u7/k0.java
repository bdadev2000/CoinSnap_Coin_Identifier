package u7;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class k0 {
    public final s7.r0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25570b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25571c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25572d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25573e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25574f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25575g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25576h;

    /* renamed from: i, reason: collision with root package name */
    public final m f25577i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f25578j;

    public k0(s7.r0 r0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, m mVar, boolean z10) {
        this.a = r0Var;
        this.f25570b = i10;
        this.f25571c = i11;
        this.f25572d = i12;
        this.f25573e = i13;
        this.f25574f = i14;
        this.f25575g = i15;
        this.f25576h = i16;
        this.f25577i = mVar;
        this.f25578j = z10;
    }

    public static AudioAttributes c(e eVar, boolean z10) {
        if (z10) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) eVar.a().f20640c;
    }

    public final AudioTrack a(boolean z10, e eVar, int i10) {
        boolean z11;
        boolean z12;
        int i11 = this.f25571c;
        try {
            AudioTrack b3 = b(z10, eVar, i10);
            int state = b3.getState();
            if (state == 1) {
                return b3;
            }
            try {
                b3.release();
            } catch (Exception unused) {
            }
            int i12 = this.f25573e;
            int i13 = this.f25574f;
            int i14 = this.f25576h;
            s7.r0 r0Var = this.a;
            if (i11 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            throw new u(state, i12, i13, i14, r0Var, z12, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            int i15 = this.f25573e;
            int i16 = this.f25574f;
            int i17 = this.f25576h;
            s7.r0 r0Var2 = this.a;
            if (i11 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            throw new u(0, i15, i16, i17, r0Var2, z11, e2);
        }
    }

    public final AudioTrack b(boolean z10, e eVar, int i10) {
        AudioTrack.Builder offloadedPlayback;
        int i11 = n9.h0.a;
        int i12 = this.f25575g;
        int i13 = this.f25574f;
        int i14 = this.f25573e;
        if (i11 >= 29) {
            AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(c(eVar, z10)).setAudioFormat(r0.f(i14, i13, i12));
            boolean z11 = true;
            AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.f25576h).setSessionId(i10);
            if (this.f25571c != 1) {
                z11 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z11);
            return offloadedPlayback.build();
        }
        if (i11 >= 21) {
            return new AudioTrack(c(eVar, z10), r0.f(i14, i13, i12), this.f25576h, 1, i10);
        }
        int v10 = n9.h0.v(eVar.f25554d);
        if (i10 == 0) {
            return new AudioTrack(v10, this.f25573e, this.f25574f, this.f25575g, this.f25576h, 1);
        }
        return new AudioTrack(v10, this.f25573e, this.f25574f, this.f25575g, this.f25576h, 1, i10);
    }
}
