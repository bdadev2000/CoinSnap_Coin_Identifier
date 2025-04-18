package he;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.k f19083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19084d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f19085f;

    public /* synthetic */ u(v vVar, fe.k kVar, boolean z10, int i10) {
        this.f19082b = i10;
        this.f19085f = vVar;
        this.f19083c = kVar;
        this.f19084d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f19082b;
        boolean z12 = this.f19084d;
        fe.k kVar = this.f19083c;
        v vVar = this.f19085f;
        boolean z13 = true;
        switch (i10) {
            case 0:
                fe.c cVar = a0.f19026e;
                Object[] objArr = new Object[3];
                objArr[0] = "takePicture:";
                objArr[1] = "running. isTakingPicture:";
                if (vVar.f19088h != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objArr[2] = Boolean.valueOf(z11);
                cVar.a(1, objArr);
                if (vVar.f19088h == null) {
                    z13 = false;
                }
                if (!z13) {
                    if (vVar.H != ge.j.VIDEO) {
                        kVar.getClass();
                        kVar.a = vVar.f19100t;
                        kVar.f17855e = vVar.f19099s;
                        vVar.S(kVar, z12);
                        return;
                    }
                    throw new IllegalStateException("Can't take hq pictures while in VIDEO mode");
                }
                return;
            default:
                fe.c cVar2 = a0.f19026e;
                Object[] objArr2 = new Object[3];
                objArr2[0] = "takePictureSnapshot:";
                objArr2[1] = "running. isTakingPicture:";
                if (vVar.f19088h != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr2[2] = Boolean.valueOf(z10);
                cVar2.a(1, objArr2);
                if (vVar.f19088h == null) {
                    z13 = false;
                }
                if (!z13) {
                    kVar.a = vVar.f19100t;
                    kVar.f17855e = ge.k.JPEG;
                    ze.b O = vVar.O(4);
                    HashMap hashMap = ze.a.f28746d;
                    vVar.T(kVar, ze.a.a(O.f28749b, O.f28750c), z12);
                    return;
                }
                return;
        }
    }
}
