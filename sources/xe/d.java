package xe;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.DngCreator;
import android.media.Image;
import android.media.ImageReader;
import he.s;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class d extends e implements ImageReader.OnImageAvailableListener {

    /* renamed from: e, reason: collision with root package name */
    public final s f27634e;

    /* renamed from: f, reason: collision with root package name */
    public final he.m f27635f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageReader f27636g;

    /* renamed from: h, reason: collision with root package name */
    public final CaptureRequest.Builder f27637h;

    /* renamed from: i, reason: collision with root package name */
    public DngCreator f27638i;

    public d(fe.k kVar, s sVar, CaptureRequest.Builder builder, ImageReader imageReader) {
        super(kVar, sVar);
        this.f27634e = sVar;
        this.f27637h = builder;
        this.f27636g = imageReader;
        imageReader.setOnImageAvailableListener(this, te.i.a("FallbackCameraThread").f25394c);
        this.f27635f = new he.m(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    @Override // android.media.ImageReader.OnImageAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onImageAvailable(android.media.ImageReader r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Unknown format: "
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.lang.String r4 = "onImageAvailable started."
            r2[r3] = r4
            fe.c r4 = xe.e.f27639d
            r4.a(r1, r2)
            r2 = 0
            android.media.Image r7 = r7.acquireNextImage()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            java.lang.Object r5 = r6.a     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            fe.k r5 = (fe.k) r5     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            ge.k r5 = r5.f17855e     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            if (r5 == 0) goto L3e
            if (r5 != r1) goto L26
            r6.t(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            goto L41
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            java.lang.Object r0 = r6.a     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            fe.k r0 = (fe.k) r0     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            ge.k r0 = r0.f17855e     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r3.append(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            throw r1     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
        L3e:
            r6.s(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
        L41:
            if (r7 == 0) goto L46
            r7.close()
        L46:
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r0 = "onImageAvailable ended."
            r7[r3] = r0
            r4.a(r1, r7)
            r6.m()
            return
        L53:
            r0 = move-exception
            r2 = r7
            goto L69
        L56:
            r0 = move-exception
            goto L5c
        L58:
            r7 = move-exception
            goto L6a
        L5a:
            r0 = move-exception
            r7 = r2
        L5c:
            r6.a = r2     // Catch: java.lang.Throwable -> L53
            r6.f20055c = r0     // Catch: java.lang.Throwable -> L53
            r6.m()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L68
            r7.close()
        L68:
            return
        L69:
            r7 = r0
        L6a:
            if (r2 == 0) goto L6f
            r2.close()
        L6f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.d.onImageAvailable(android.media.ImageReader):void");
    }

    @Override // k.d
    public final void q() {
        this.f27635f.l(this.f27634e);
    }

    public final void s(Image image) {
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        fe.k kVar = (fe.k) this.a;
        kVar.f17854d = bArr;
        kVar.f17852b = 0;
        try {
            int c10 = new f1.g(new ByteArrayInputStream(((fe.k) this.a).f17854d)).c();
            ((fe.k) this.a).f17852b = a6.k.y(c10);
        } catch (IOException unused) {
        }
    }

    public final void t(Image image) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        try {
            this.f27638i.writeImage(bufferedOutputStream, image);
            bufferedOutputStream.flush();
            ((fe.k) this.a).f17854d = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            this.f27638i.close();
            try {
                bufferedOutputStream.close();
            } catch (IOException unused) {
            }
            throw new RuntimeException(e2);
        }
    }
}
