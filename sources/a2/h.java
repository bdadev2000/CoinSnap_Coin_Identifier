package a2;

import N1.i;
import N1.k;
import P1.B;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final List f3950a;
    public final k b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.f f3951c;

    public h(ArrayList arrayList, C0332a c0332a, Q1.f fVar) {
        this.f3950a = arrayList;
        this.b = c0332a;
        this.f3951c = fVar;
    }

    @Override // N1.k
    public final boolean a(Object obj, i iVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) iVar.c(AbstractC0338g.b)).booleanValue() && z2.i.j(this.f3950a, inputStream, this.f3951c) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    @Override // N1.k
    public final B b(Object obj, int i9, int i10, i iVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e4);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i9, i10, iVar);
    }
}
