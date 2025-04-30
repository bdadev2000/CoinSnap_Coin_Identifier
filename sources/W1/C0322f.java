package W1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: W1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322f implements N1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3576a;
    public final q b;

    public /* synthetic */ C0322f(q qVar, int i9) {
        this.f3576a = i9;
        this.b = qVar;
    }

    @Override // N1.k
    public final boolean a(Object obj, N1.i iVar) {
        switch (this.f3576a) {
            case 0:
                this.b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    this.b.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // N1.k
    public final P1.B b(Object obj, int i9, int i10, N1.i iVar) {
        switch (this.f3576a) {
            case 0:
                q qVar = this.b;
                return qVar.a(new C.c((ByteBuffer) obj, (ArrayList) qVar.f3594d, qVar.f3593c, 8), i9, i10, iVar, q.f3590j);
            default:
                q qVar2 = this.b;
                return qVar2.a(new C.c((ParcelFileDescriptor) obj, (ArrayList) qVar2.f3594d, qVar2.f3593c), i9, i10, iVar, q.f3590j);
        }
    }
}
