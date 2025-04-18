package g8;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import y7.a0;
import y7.b0;

/* loaded from: classes3.dex */
public final class m {
    public final q a;

    /* renamed from: b, reason: collision with root package name */
    public final t f18303b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f18304c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f18305d;

    /* renamed from: e, reason: collision with root package name */
    public int f18306e;

    public m(q qVar, t tVar, a0 a0Var) {
        b0 b0Var;
        this.a = qVar;
        this.f18303b = tVar;
        this.f18304c = a0Var;
        if (MimeTypes.AUDIO_TRUEHD.equals(qVar.f18337f.f24723n)) {
            b0Var = new b0();
        } else {
            b0Var = null;
        }
        this.f18305d = b0Var;
    }
}
