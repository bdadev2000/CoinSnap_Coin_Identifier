package l4;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import e4.l;
import e4.m;
import java.util.ArrayDeque;
import k4.p;
import k4.w;
import k4.x;
import k4.y;
import w4.i;

/* loaded from: classes.dex */
public final class a implements y {

    /* renamed from: b, reason: collision with root package name */
    public static final l f21123b = l.a(Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final v3.c a;

    public a(v3.c cVar) {
        this.a = cVar;
    }

    @Override // k4.y
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, m mVar) {
        p pVar = (p) obj;
        v3.c cVar = this.a;
        if (cVar != null) {
            w a = w.a(pVar);
            i iVar = (i) cVar.f26021c;
            Object a10 = iVar.a(a);
            ArrayDeque arrayDeque = w.f20267d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a);
            }
            p pVar2 = (p) a10;
            if (pVar2 == null) {
                iVar.d(w.a(pVar), pVar);
            } else {
                pVar = pVar2;
            }
        }
        return new x(pVar, new com.bumptech.glide.load.data.l(pVar, ((Integer) mVar.c(f21123b)).intValue()));
    }
}
