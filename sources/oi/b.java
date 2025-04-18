package oi;

import java.util.regex.Pattern;
import ki.i;
import ni.l;
import wh.a0;
import wh.g0;
import wh.s0;
import yg.r;

/* loaded from: classes5.dex */
public final class b implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f23337c;

    /* renamed from: b, reason: collision with root package name */
    public final yg.l f23338b;

    static {
        Pattern pattern = g0.f27059d;
        f23337c = a0.r("application/json; charset=UTF-8");
    }

    public b(yg.l lVar) {
        this.f23338b = lVar;
    }

    @Override // ni.l
    public final Object convert(Object obj) {
        i iVar = new i();
        this.f23338b.toJson(new r(iVar), obj);
        return s0.create(f23337c, iVar.readByteString());
    }
}
