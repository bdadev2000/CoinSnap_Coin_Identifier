package T1;

import i2.C2341d;
import java.io.File;

/* renamed from: T1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2967a;
    public final Object b;

    public /* synthetic */ C0297c(Object obj, int i9) {
        this.f2967a = i9;
        this.b = obj;
    }

    @Override // T1.u
    public final boolean a(Object obj) {
        switch (this.f2967a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, N1.i iVar) {
        switch (this.f2967a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new t(new C2341d(bArr), new p(1, bArr, (D) this.b));
            case 1:
                return new t(new C2341d(obj), new O1.b(1, obj.toString(), (D) this.b));
            default:
                File file = (File) obj;
                return new t(new C2341d(file), new O1.b(2, file, (D) this.b));
        }
    }
}
