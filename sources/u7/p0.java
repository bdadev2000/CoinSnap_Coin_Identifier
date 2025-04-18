package u7;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class p0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ q0 a;

    public p0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        r0 r0Var;
        f.a aVar;
        s7.j0 j0Var;
        if (audioTrack.equals(this.a.f25602c.f25634v) && (aVar = (r0Var = this.a.f25602c).f25631r) != null && r0Var.V && (j0Var = ((u0) aVar.f17509c).S0) != null) {
            j0Var.a.f24620j.d(2);
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        r0 r0Var;
        f.a aVar;
        s7.j0 j0Var;
        if (audioTrack.equals(this.a.f25602c.f25634v) && (aVar = (r0Var = this.a.f25602c).f25631r) != null && r0Var.V && (j0Var = ((u0) aVar.f17509c).S0) != null) {
            j0Var.a.f24620j.d(2);
        }
    }
}
