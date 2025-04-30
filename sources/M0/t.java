package M0;

import android.view.animation.AnimationUtils;
import i0.C2333c;
import i0.C2334d;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: a, reason: collision with root package name */
    public long f1902a = -1;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1903c;

    /* renamed from: d, reason: collision with root package name */
    public C2333c f1904d;

    /* renamed from: e, reason: collision with root package name */
    public final D0.l f1905e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f1906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f1907g;

    public t(C c9) {
        this.f1907g = c9;
        D0.l lVar = new D0.l((byte) 0, 3);
        long[] jArr = new long[20];
        lVar.f626c = jArr;
        lVar.f627d = new float[20];
        lVar.b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f1905e = lVar;
    }

    @Override // M0.x, M0.u
    public final void f(w wVar) {
        this.f1903c = true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, i0.b] */
    public final void g() {
        float sqrt;
        int i9;
        int i10;
        if (this.f1904d != null) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f9 = (float) this.f1902a;
        D0.l lVar = this.f1905e;
        int i11 = (lVar.b + 1) % 20;
        lVar.b = i11;
        ((long[]) lVar.f626c)[i11] = currentAnimationTimeMillis;
        ((float[]) lVar.f627d)[i11] = f9;
        ?? obj = new Object();
        float f10 = 0.0f;
        obj.f20617a = 0.0f;
        this.f1904d = new C2333c(obj);
        C2334d c2334d = new C2334d();
        c2334d.b = 1.0f;
        int i12 = 0;
        c2334d.f20629c = false;
        c2334d.f20628a = Math.sqrt(200.0f);
        c2334d.f20629c = false;
        C2333c c2333c = this.f1904d;
        c2333c.l = c2334d;
        c2333c.b = (float) this.f1902a;
        c2333c.f20619c = true;
        if (!c2333c.f20621e) {
            ArrayList arrayList = c2333c.f20627k;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            C2333c c2333c2 = this.f1904d;
            int i13 = lVar.b;
            long[] jArr = (long[]) lVar.f626c;
            long j7 = Long.MIN_VALUE;
            if (i13 != 0 || jArr[i13] != Long.MIN_VALUE) {
                long j9 = jArr[i13];
                long j10 = j9;
                while (true) {
                    long j11 = jArr[i13];
                    if (j11 != j7) {
                        float f11 = (float) (j9 - j11);
                        float abs = (float) Math.abs(j11 - j10);
                        if (f11 > 100.0f || abs > 40.0f) {
                            break;
                        }
                        if (i13 == 0) {
                            i13 = 20;
                        }
                        i13--;
                        i12++;
                        if (i12 >= 20) {
                            break;
                        }
                        j10 = j11;
                        j7 = Long.MIN_VALUE;
                    } else {
                        break;
                    }
                }
                if (i12 >= 2) {
                    float[] fArr = (float[]) lVar.f627d;
                    if (i12 == 2) {
                        int i14 = lVar.b;
                        if (i14 == 0) {
                            i10 = 19;
                        } else {
                            i10 = i14 - 1;
                        }
                        float f12 = (float) (jArr[i14] - jArr[i10]);
                        if (f12 != 0.0f) {
                            sqrt = (fArr[i14] - fArr[i10]) / f12;
                        }
                    } else {
                        int i15 = lVar.b;
                        int i16 = ((i15 - i12) + 21) % 20;
                        int i17 = (i15 + 21) % 20;
                        long j12 = jArr[i16];
                        float f13 = fArr[i16];
                        int i18 = i16 + 1;
                        int i19 = i18 % 20;
                        float f14 = 0.0f;
                        while (i19 != i17) {
                            long j13 = jArr[i19];
                            long[] jArr2 = jArr;
                            float f15 = (float) (j13 - j12);
                            if (f15 == f10) {
                                i9 = i17;
                            } else {
                                float f16 = fArr[i19];
                                i9 = i17;
                                float f17 = (f16 - f13) / f15;
                                float abs2 = (Math.abs(f17) * (f17 - ((float) (Math.sqrt(2.0f * Math.abs(f14)) * Math.signum(f14))))) + f14;
                                if (i19 == i18) {
                                    abs2 *= 0.5f;
                                }
                                f14 = abs2;
                                f13 = f16;
                                j12 = j13;
                            }
                            i19 = (i19 + 1) % 20;
                            jArr = jArr2;
                            i17 = i9;
                            f10 = 0.0f;
                        }
                        sqrt = (float) (Math.sqrt(Math.abs(f14) * 2.0f) * Math.signum(f14));
                    }
                    f10 = sqrt * 1000.0f;
                }
            }
            c2333c2.f20618a = f10;
            C2333c c2333c3 = this.f1904d;
            c2333c3.f20622f = (float) (this.f1907g.f1939z + 1);
            c2333c3.f20623g = -1.0f;
            c2333c3.f20625i = 4.0f;
            s sVar = new s(this);
            ArrayList arrayList2 = c2333c3.f20626j;
            if (!arrayList2.contains(sVar)) {
                arrayList2.add(sVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }
}
