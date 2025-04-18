package y8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ic.t;
import java.util.ArrayList;
import java.util.List;
import m9.o0;
import n9.h0;
import s7.r0;

/* loaded from: classes3.dex */
public final class m implements a {
    public final o0 a;

    /* renamed from: b, reason: collision with root package name */
    public final t f28088b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f28089c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28090d;

    /* renamed from: e, reason: collision with root package name */
    public final m9.l f28091e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28092f;

    /* renamed from: g, reason: collision with root package name */
    public final p f28093g;

    /* renamed from: h, reason: collision with root package name */
    public final k[] f28094h;

    /* renamed from: i, reason: collision with root package name */
    public k9.q f28095i;

    /* renamed from: j, reason: collision with root package name */
    public z8.c f28096j;

    /* renamed from: k, reason: collision with root package name */
    public int f28097k;

    /* renamed from: l, reason: collision with root package name */
    public v8.b f28098l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28099m;

    public m(o0 o0Var, z8.c cVar, t tVar, int i10, int[] iArr, k9.q qVar, int i11, m9.l lVar, long j3, boolean z10, ArrayList arrayList, p pVar) {
        boolean z11;
        int i12;
        y7.l lVar2;
        x8.d dVar;
        this.a = o0Var;
        this.f28096j = cVar;
        this.f28088b = tVar;
        this.f28089c = iArr;
        this.f28095i = qVar;
        this.f28090d = i11;
        this.f28091e = lVar;
        this.f28097k = i10;
        this.f28092f = j3;
        this.f28093g = pVar;
        long d10 = cVar.d(i10);
        ArrayList b3 = b();
        this.f28094h = new k[qVar.length()];
        int i13 = 0;
        while (i13 < this.f28094h.length) {
            z8.m mVar = (z8.m) b3.get(qVar.getIndexInTrackGroup(i13));
            z8.b j10 = tVar.j(mVar.f28636c);
            k[] kVarArr = this.f28094h;
            z8.b bVar = j10 == null ? (z8.b) mVar.f28636c.get(0) : j10;
            r0 r0Var = mVar.f28635b;
            String str = r0Var.f24722m;
            if (n9.q.k(str)) {
                dVar = null;
            } else {
                if (str == null || (!str.startsWith(MimeTypes.VIDEO_WEBM) && !str.startsWith(MimeTypes.AUDIO_WEBM) && !str.startsWith(MimeTypes.APPLICATION_WEBM) && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    lVar2 = new e8.d(1);
                } else {
                    if (z10) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    lVar2 = new g8.l(i12, arrayList, pVar);
                }
                dVar = new x8.d(lVar2, i11, r0Var);
            }
            int i14 = i13;
            kVarArr[i14] = new k(d10, mVar, bVar, dVar, 0L, mVar.b());
            i13 = i14 + 1;
        }
    }

    public final long a(long j3) {
        z8.c cVar = this.f28096j;
        long j10 = cVar.a;
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return j3 - h0.H(j10 + cVar.a(this.f28097k).f28621b);
    }

    public final ArrayList b() {
        List list = this.f28096j.a(this.f28097k).f28622c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f28089c) {
            arrayList.addAll(((z8.a) list.get(i10)).f28584c);
        }
        return arrayList;
    }

    public final k c(int i10) {
        k[] kVarArr = this.f28094h;
        k kVar = kVarArr[i10];
        z8.b j3 = this.f28088b.j(kVar.f28079b.f28636c);
        if (j3 != null && !j3.equals(kVar.f28080c)) {
            k kVar2 = new k(kVar.f28082e, kVar.f28079b, j3, kVar.a, kVar.f28083f, kVar.f28081d);
            kVarArr[i10] = kVar2;
            return kVar2;
        }
        return kVar;
    }
}
