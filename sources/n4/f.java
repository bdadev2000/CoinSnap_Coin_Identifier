package n4;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import g4.g0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f implements e4.o {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final p f22409b;

    public /* synthetic */ f(p pVar, int i10) {
        this.a = i10;
        this.f22409b = pVar;
    }

    @Override // e4.o
    public final boolean a(Object obj, e4.m mVar) {
        boolean z10;
        int i10 = this.a;
        p pVar = this.f22409b;
        switch (i10) {
            case 0:
                pVar.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    pVar.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, e4.m mVar) {
        int i12 = this.a;
        p pVar = this.f22409b;
        switch (i12) {
            case 0:
                return pVar.a(new h.c((ByteBuffer) obj, pVar.f22435d, pVar.f22434c, 14), i10, i11, mVar, p.f22431j);
            default:
                return pVar.a(new h.c((ParcelFileDescriptor) obj, pVar.f22435d, pVar.f22434c), i10, i11, mVar, p.f22431j);
        }
    }
}
