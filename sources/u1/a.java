package U1;

import N1.h;
import N1.i;
import T1.k;
import T1.r;
import T1.s;
import T1.t;
import T1.u;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayDeque;
import n1.C2475f;

/* loaded from: classes.dex */
public final class a implements u {
    public static final h b = h.a(Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final C2475f f3113a;

    public a(C2475f c2475f) {
        this.f3113a = c2475f;
    }

    @Override // T1.u
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, i iVar) {
        k kVar = (k) obj;
        C2475f c2475f = this.f3113a;
        if (c2475f != null) {
            s a6 = s.a(kVar);
            r rVar = (r) c2475f.f21833c;
            Object a9 = rVar.a(a6);
            ArrayDeque arrayDeque = s.f2990d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a6);
            }
            k kVar2 = (k) a9;
            if (kVar2 == null) {
                rVar.d(s.a(kVar), kVar);
            } else {
                kVar = kVar2;
            }
        }
        return new t(kVar, new com.bumptech.glide.load.data.k(kVar, ((Integer) iVar.c(b)).intValue()));
    }
}
