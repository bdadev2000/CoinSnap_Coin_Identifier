package z8;

import a4.y;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import n9.h0;
import s7.c1;

/* loaded from: classes3.dex */
public final class c implements u8.a {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28591b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28592c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28593d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28594e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28595f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28596g;

    /* renamed from: h, reason: collision with root package name */
    public final long f28597h;

    /* renamed from: i, reason: collision with root package name */
    public final y f28598i;

    /* renamed from: j, reason: collision with root package name */
    public final c1 f28599j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f28600k;

    /* renamed from: l, reason: collision with root package name */
    public final i f28601l;

    /* renamed from: m, reason: collision with root package name */
    public final List f28602m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, y yVar, c1 c1Var, Uri uri, ArrayList arrayList) {
        this.a = j3;
        this.f28591b = j10;
        this.f28592c = j11;
        this.f28593d = z10;
        this.f28594e = j12;
        this.f28595f = j13;
        this.f28596g = j14;
        this.f28597h = j15;
        this.f28601l = iVar;
        this.f28598i = yVar;
        this.f28600k = uri;
        this.f28599j = c1Var;
        this.f28602m = arrayList;
    }

    public final h a(int i10) {
        return (h) this.f28602m.get(i10);
    }

    public final int b() {
        return this.f28602m.size();
    }

    public final long c(int i10) {
        long j3;
        long j10;
        List list = this.f28602m;
        if (i10 == list.size() - 1) {
            j3 = this.f28591b;
            if (j3 == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j10 = ((h) list.get(i10)).f28621b;
        } else {
            j3 = ((h) list.get(i10 + 1)).f28621b;
            j10 = ((h) list.get(i10)).f28621b;
        }
        return j3 - j10;
    }

    public final long d(int i10) {
        return h0.H(c(i10));
    }
}
