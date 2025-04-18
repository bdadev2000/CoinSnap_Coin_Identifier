package xe;

import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f27640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ze.b f27641c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27642d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze.b f27643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f27644g;

    public g(h hVar, byte[] bArr, ze.b bVar, int i10, ze.b bVar2) {
        this.f27644g = hVar;
        this.f27640b = bArr;
        this.f27641c = bVar;
        this.f27642d = i10;
        this.f27643f = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bArr2 = this.f27640b;
        int i14 = this.f27642d;
        if (i14 == 0) {
            bArr = bArr2;
        } else if (i14 % 90 == 0 && i14 >= 0 && i14 <= 270) {
            ze.b bVar = this.f27641c;
            int i15 = bVar.f28749b;
            byte[] bArr3 = new byte[bArr2.length];
            int i16 = bVar.f28750c;
            int i17 = i15 * i16;
            if (i14 % 180 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i14 % 270 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i14 >= 180) {
                z12 = true;
            } else {
                z12 = false;
            }
            for (int i18 = 0; i18 < i16; i18++) {
                for (int i19 = 0; i19 < i15; i19++) {
                    int i20 = (i18 * i15) + i19;
                    int i21 = ((i18 >> 1) * i15) + i17 + (i19 & (-2));
                    int i22 = i21 + 1;
                    if (z10) {
                        i10 = i16;
                    } else {
                        i10 = i15;
                    }
                    if (z10) {
                        i11 = i15;
                    } else {
                        i11 = i16;
                    }
                    if (z10) {
                        i12 = i18;
                    } else {
                        i12 = i19;
                    }
                    if (z10) {
                        i13 = i19;
                    } else {
                        i13 = i18;
                    }
                    if (z11) {
                        i12 = (i10 - i12) - 1;
                    }
                    if (z12) {
                        i13 = (i11 - i13) - 1;
                    }
                    int i23 = (i13 * i10) + i12;
                    int i24 = ((i13 >> 1) * i10) + i17 + (i12 & (-2));
                    bArr3[i23] = (byte) (bArr2[i20] & UByte.MAX_VALUE);
                    bArr3[i24] = (byte) (bArr2[i21] & UByte.MAX_VALUE);
                    bArr3[i24 + 1] = (byte) (bArr2[i22] & UByte.MAX_VALUE);
                }
            }
            bArr = bArr3;
        } else {
            throw new IllegalArgumentException("0 <= rotation < 360, rotation % 90 == 0");
        }
        h hVar = this.f27644g;
        int i25 = hVar.a.f27648h;
        ze.b bVar2 = this.f27643f;
        YuvImage yuvImage = new YuvImage(bArr, i25, bVar2.f28749b, bVar2.f28750c, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Rect q10 = com.bumptech.glide.e.q(bVar2, hVar.a.f27647g);
        yuvImage.compressToJpeg(q10, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Object obj = hVar.a.a;
        ((fe.k) obj).f17854d = byteArray;
        ((fe.k) obj).f17853c = new ze.b(q10.width(), q10.height());
        i iVar = hVar.a;
        ((fe.k) iVar.a).f17852b = 0;
        iVar.m();
    }
}
