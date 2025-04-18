package v8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import s7.p2;

/* loaded from: classes3.dex */
public final class h0 implements w, v {

    /* renamed from: b, reason: collision with root package name */
    public final w[] f26140b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f26141c;

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.internal.m f26142d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f26143f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f26144g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public v f26145h;

    /* renamed from: i, reason: collision with root package name */
    public j1 f26146i;

    /* renamed from: j, reason: collision with root package name */
    public w[] f26147j;

    /* renamed from: k, reason: collision with root package name */
    public fb.c f26148k;

    public h0(com.facebook.internal.m mVar, long[] jArr, w... wVarArr) {
        this.f26142d = mVar;
        this.f26140b = wVarArr;
        mVar.getClass();
        this.f26148k = new fb.c(new b1[0], 25);
        this.f26141c = new IdentityHashMap();
        this.f26147j = new w[0];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f26140b[i10] = new f0(wVarArr[i10], j3);
            }
        }
    }

    @Override // v8.v
    public final void a(w wVar) {
        ArrayList arrayList = this.f26143f;
        arrayList.remove(wVar);
        if (!arrayList.isEmpty()) {
            return;
        }
        w[] wVarArr = this.f26140b;
        int i10 = 0;
        for (w wVar2 : wVarArr) {
            i10 += wVar2.getTrackGroups().f26181b;
        }
        i1[] i1VarArr = new i1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < wVarArr.length; i12++) {
            j1 trackGroups = wVarArr[i12].getTrackGroups();
            int i13 = trackGroups.f26181b;
            int i14 = 0;
            while (i14 < i13) {
                i1 a = trackGroups.a(i14);
                i1 i1Var = new i1(i12 + ":" + a.f26164c, a.f26166f);
                this.f26144g.put(i1Var, a);
                i1VarArr[i11] = i1Var;
                i14++;
                i11++;
            }
        }
        this.f26146i = new j1(i1VarArr);
        v vVar = this.f26145h;
        vVar.getClass();
        vVar.a(this);
    }

    @Override // v8.a1
    public final void b(b1 b1Var) {
        v vVar = this.f26145h;
        vVar.getClass();
        vVar.b(this);
    }

    @Override // v8.b1
    public final boolean continueLoading(long j3) {
        ArrayList arrayList = this.f26143f;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((w) arrayList.get(i10)).continueLoading(j3);
            }
            return false;
        }
        return this.f26148k.continueLoading(j3);
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        return this.f26148k.getBufferedPositionUs();
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        return this.f26148k.getNextLoadPositionUs();
    }

    @Override // v8.w
    public final j1 getTrackGroups() {
        j1 j1Var = this.f26146i;
        j1Var.getClass();
        return j1Var;
    }

    @Override // v8.b1
    public final boolean isLoading() {
        return this.f26148k.isLoading();
    }

    @Override // v8.w
    public final void maybeThrowPrepareError() {
        for (w wVar : this.f26140b) {
            wVar.maybeThrowPrepareError();
        }
    }

    @Override // v8.w
    public final void n(v vVar, long j3) {
        this.f26145h = vVar;
        ArrayList arrayList = this.f26143f;
        w[] wVarArr = this.f26140b;
        Collections.addAll(arrayList, wVarArr);
        for (w wVar : wVarArr) {
            wVar.n(this, j3);
        }
    }

    @Override // v8.w
    public final void o(long j3) {
        for (w wVar : this.f26147j) {
            wVar.o(j3);
        }
    }

    @Override // v8.w
    public final long r(k9.q[] qVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        z0 z0Var;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.f26141c;
            if (i11 >= length) {
                break;
            }
            z0 z0Var2 = z0VarArr[i11];
            if (z0Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(z0Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i11] = intValue;
            k9.q qVar = qVarArr[i11];
            if (qVar != null) {
                String str = qVar.getTrackGroup().f26164c;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        z0[] z0VarArr2 = new z0[length2];
        z0[] z0VarArr3 = new z0[qVarArr.length];
        k9.q[] qVarArr2 = new k9.q[qVarArr.length];
        w[] wVarArr = this.f26140b;
        ArrayList arrayList2 = new ArrayList(wVarArr.length);
        long j10 = j3;
        int i12 = 0;
        while (i12 < wVarArr.length) {
            int i13 = i10;
            while (i13 < qVarArr.length) {
                if (iArr[i13] == i12) {
                    z0Var = z0VarArr[i13];
                } else {
                    z0Var = null;
                }
                z0VarArr3[i13] = z0Var;
                if (iArr2[i13] == i12) {
                    k9.q qVar2 = qVarArr[i13];
                    qVar2.getClass();
                    arrayList = arrayList2;
                    i1 i1Var = (i1) this.f26144g.get(qVar2.getTrackGroup());
                    i1Var.getClass();
                    qVarArr2[i13] = new e0(qVar2, i1Var);
                } else {
                    arrayList = arrayList2;
                    qVarArr2[i13] = null;
                }
                i13++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i14 = i12;
            w[] wVarArr2 = wVarArr;
            k9.q[] qVarArr3 = qVarArr2;
            long r6 = wVarArr[i12].r(qVarArr2, zArr, z0VarArr3, zArr2, j10);
            if (i14 == 0) {
                j10 = r6;
            } else if (r6 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < qVarArr.length; i15++) {
                boolean z11 = true;
                if (iArr2[i15] == i14) {
                    z0 z0Var3 = z0VarArr3[i15];
                    z0Var3.getClass();
                    z0VarArr2[i15] = z0VarArr3[i15];
                    identityHashMap.put(z0Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    if (z0VarArr3[i15] != null) {
                        z11 = false;
                    }
                    u0.m(z11);
                }
            }
            if (z10) {
                arrayList3.add(wVarArr2[i14]);
            }
            i12 = i14 + 1;
            arrayList2 = arrayList3;
            wVarArr = wVarArr2;
            qVarArr2 = qVarArr3;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(z0VarArr2, i16, z0VarArr, i16, length2);
        w[] wVarArr3 = (w[]) arrayList2.toArray(new w[i16]);
        this.f26147j = wVarArr3;
        this.f26142d.getClass();
        this.f26148k = new fb.c(wVarArr3, 25);
        return j10;
    }

    @Override // v8.w
    public final long readDiscontinuity() {
        long j3 = -9223372036854775807L;
        for (w wVar : this.f26147j) {
            long readDiscontinuity = wVar.readDiscontinuity();
            if (readDiscontinuity != C.TIME_UNSET) {
                if (j3 == C.TIME_UNSET) {
                    for (w wVar2 : this.f26147j) {
                        if (wVar2 == wVar) {
                            break;
                        }
                        if (wVar2.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = readDiscontinuity;
                } else if (readDiscontinuity != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != C.TIME_UNSET && wVar.seekToUs(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
        this.f26148k.reevaluateBuffer(j3);
    }

    @Override // v8.w
    public final long s(long j3, p2 p2Var) {
        w wVar;
        w[] wVarArr = this.f26147j;
        if (wVarArr.length > 0) {
            wVar = wVarArr[0];
        } else {
            wVar = this.f26140b[0];
        }
        return wVar.s(j3, p2Var);
    }

    @Override // v8.w
    public final long seekToUs(long j3) {
        long seekToUs = this.f26147j[0].seekToUs(j3);
        int i10 = 1;
        while (true) {
            w[] wVarArr = this.f26147j;
            if (i10 < wVarArr.length) {
                if (wVarArr[i10].seekToUs(seekToUs) == seekToUs) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return seekToUs;
            }
        }
    }
}
