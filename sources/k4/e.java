package k4;

import java.io.File;

/* loaded from: classes.dex */
public final class e implements y {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20231b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.f20231b = obj;
    }

    @Override // k4.y
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, e4.m mVar) {
        int i12 = this.a;
        Object obj2 = this.f20231b;
        switch (i12) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new x(new v4.d(bArr), new d(bArr, (c) obj2));
            case 1:
                return new x(new v4.d(obj), new h(0, obj.toString(), (kc.c) obj2));
            default:
                File file = (File) obj;
                return new x(new v4.d(file), new h(1, file, (o) obj2));
        }
    }
}
