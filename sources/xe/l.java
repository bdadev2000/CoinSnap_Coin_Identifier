package xe;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.s;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class l extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ie.h f27652k;

    /* renamed from: l, reason: collision with root package name */
    public final s f27653l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f27654m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f27655n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f27656o;

    public l(fe.k kVar, s sVar, ye.h hVar, ze.a aVar) {
        super(kVar, sVar, hVar, aVar, sVar.T);
        Integer num;
        this.f27653l = sVar;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        ie.h hVar2 = new ie.h(Arrays.asList(new ie.i(2500L, new je.c(0)), new k(this, z10 ? 1 : 0, z10 ? 1 : 0)));
        this.f27652k = hVar2;
        hVar2.b(new j(this, z10 ? 1 : 0));
        TotalCaptureResult totalCaptureResult = sVar.f19071a0;
        if (totalCaptureResult == null) {
            p.f27669d.a(2, "Picture snapshot requested very early, before the first preview frame.", "Metering might not work as intended.");
        }
        if (totalCaptureResult == null) {
            num = null;
        } else {
            num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        }
        if (sVar.f19104y && num != null && num.intValue() == 4) {
            z10 = true;
        }
        this.f27654m = z10;
        this.f27655n = (Integer) sVar.Z.get(CaptureRequest.CONTROL_AE_MODE);
        this.f27656o = (Integer) sVar.Z.get(CaptureRequest.FLASH_MODE);
    }

    @Override // xe.o, k.d
    public final void m() {
        new k(this, 1, 0).l(this.f27653l);
        super.m();
    }

    @Override // xe.o, k.d
    public final void q() {
        boolean z10 = this.f27654m;
        fe.c cVar = p.f27669d;
        if (!z10) {
            cVar.a(1, "take:", "Engine does no metering or needs no flash.", "Taking fast snapshot.");
            super.q();
        } else {
            cVar.a(1, "take:", "Engine needs flash. Starting action");
            this.f27652k.l(this.f27653l);
        }
    }
}
