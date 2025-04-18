package xe;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.s;

/* loaded from: classes4.dex */
public final class k extends ie.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f27651f;

    public /* synthetic */ k(l lVar, int i10) {
        this.f27650e = i10;
        this.f27651f = lVar;
    }

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f27650e) {
            case 0:
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                if (num == null) {
                    p.f27669d.a(2, "FlashAction:", "Waiting flash, but flashState is null!", "Taking snapshot.");
                    k(Integer.MAX_VALUE);
                    return;
                } else if (num.intValue() == 3) {
                    p.f27669d.a(1, "FlashAction:", "Waiting flash and we have FIRED state!", "Taking snapshot.");
                    k(Integer.MAX_VALUE);
                    return;
                } else {
                    p.f27669d.a(1, "FlashAction:", "Waiting flash but flashState is", num, ". Waiting...");
                    return;
                }
            default:
                return;
        }
    }

    @Override // ie.e
    public final void i(ie.b bVar) {
        switch (this.f27650e) {
            case 0:
                this.f19605c = bVar;
                p.f27669d.a(1, "FlashAction:", "Parameters locked, opening torch.");
                s sVar = (s) bVar;
                sVar.Z.set(CaptureRequest.FLASH_MODE, 2);
                sVar.Z.set(CaptureRequest.CONTROL_AE_MODE, 1);
                sVar.d0();
                return;
            default:
                l lVar = this.f27651f;
                this.f19605c = bVar;
                try {
                    p.f27669d.a(1, "ResetFlashAction:", "Reverting the flash changes.");
                    CaptureRequest.Builder builder = ((s) bVar).Z;
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    builder.set(CaptureRequest.FLASH_MODE, 0);
                    s sVar2 = (s) bVar;
                    if (sVar2.f19029d.f23631f == pe.f.PREVIEW && !sVar2.f()) {
                        sVar2.Y.capture(builder.build(), sVar2.f19079i0, null);
                    }
                    builder.set(CaptureRequest.CONTROL_AE_MODE, lVar.f27655n);
                    builder.set(CaptureRequest.FLASH_MODE, lVar.f27656o);
                    ((s) bVar).d0();
                    return;
                } catch (CameraAccessException unused) {
                    return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i10, int i11) {
        this(lVar, 0);
        this.f27650e = i10;
        int i12 = 1;
        if (i10 != 1) {
        } else {
            this(lVar, i12);
        }
    }
}
