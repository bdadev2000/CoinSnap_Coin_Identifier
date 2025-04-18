package k9;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import n9.h0;
import s7.r0;
import v8.i1;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class c implements q {
    public final i1 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20399b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f20400c;

    /* renamed from: d, reason: collision with root package name */
    public final r0[] f20401d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f20402e;

    /* renamed from: f, reason: collision with root package name */
    public int f20403f;

    public c(i1 i1Var, int[] iArr) {
        boolean z10;
        r0[] r0VarArr;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        i1Var.getClass();
        this.a = i1Var;
        int length = iArr.length;
        this.f20399b = length;
        this.f20401d = new r0[length];
        int i10 = 0;
        while (true) {
            int length2 = iArr.length;
            r0VarArr = i1Var.f26166f;
            if (i10 >= length2) {
                break;
            }
            this.f20401d[i10] = r0VarArr[iArr[i10]];
            i10++;
        }
        Arrays.sort(this.f20401d, new k0.b(9));
        this.f20400c = new int[this.f20399b];
        int i11 = 0;
        while (true) {
            int i12 = this.f20399b;
            if (i11 < i12) {
                int[] iArr2 = this.f20400c;
                r0 r0Var = this.f20401d[i11];
                int i13 = 0;
                while (true) {
                    if (i13 < r0VarArr.length) {
                        if (r0Var == r0VarArr[i13]) {
                            break;
                        } else {
                            i13++;
                        }
                    } else {
                        i13 = -1;
                        break;
                    }
                }
                iArr2[i11] = i13;
                i11++;
            } else {
                this.f20402e = new long[i12];
                return;
            }
        }
    }

    @Override // k9.q
    public final boolean a(int i10, long j3) {
        return this.f20402e[i10] > j3;
    }

    @Override // k9.q
    public final int b(r0 r0Var) {
        for (int i10 = 0; i10 < this.f20399b; i10++) {
            if (this.f20401d[i10] == r0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // k9.q
    public final boolean c(int i10, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f20399b && !a; i11++) {
            if (i11 != i10 && !a(i11, elapsedRealtime)) {
                a = true;
            } else {
                a = false;
            }
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.f20402e;
        long j10 = jArr[i10];
        int i12 = h0.a;
        long j11 = elapsedRealtime + j3;
        if (((j3 ^ j11) & (elapsedRealtime ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j10, j11);
        return true;
    }

    @Override // k9.q
    public void disable() {
    }

    @Override // k9.q
    public void enable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && Arrays.equals(this.f20400c, cVar.f20400c)) {
            return true;
        }
        return false;
    }

    @Override // k9.q
    public int evaluateQueueSize(long j3, List list) {
        return list.size();
    }

    @Override // k9.q
    public final r0 getFormat(int i10) {
        return this.f20401d[i10];
    }

    @Override // k9.q
    public final int getIndexInTrackGroup(int i10) {
        return this.f20400c[i10];
    }

    @Override // k9.q
    public final r0 getSelectedFormat() {
        return this.f20401d[getSelectedIndex()];
    }

    @Override // k9.q
    public final i1 getTrackGroup() {
        return this.a;
    }

    public final int hashCode() {
        if (this.f20403f == 0) {
            this.f20403f = Arrays.hashCode(this.f20400c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f20403f;
    }

    @Override // k9.q
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f20399b; i11++) {
            if (this.f20400c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // k9.q
    public final int length() {
        return this.f20400c.length;
    }

    @Override // k9.q
    public void onPlaybackSpeed(float f10) {
    }
}
