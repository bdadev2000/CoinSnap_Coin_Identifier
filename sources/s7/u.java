package s7;

import android.util.Base64;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ra.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24768b;

    @Override // ra.p
    public final Object get() {
        switch (this.f24768b) {
            case 0:
                return new m();
            default:
                byte[] bArr = new byte[12];
                t7.r.f25330h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
