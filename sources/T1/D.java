package T1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import j2.AbstractC2384b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class D implements v, N1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final D f2961c = new D(0);
    public final /* synthetic */ int b;

    public /* synthetic */ D(int i9) {
        this.b = i9;
    }

    public static ByteArrayInputStream c(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf != -1) {
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        throw new IllegalArgumentException("Not a valid image data URL.");
    }

    public void a(Object obj) {
        switch (this.b) {
            case 8:
                ((ParcelFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public Object b(byte[] bArr) {
        switch (this.b) {
            case 1:
                return ByteBuffer.wrap(bArr);
            default:
                return new ByteArrayInputStream(bArr);
        }
    }

    public Class d() {
        switch (this.b) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    public Object e(File file) {
        switch (this.b) {
            case 8:
                return ParcelFileDescriptor.open(file, 268435456);
            default:
                return new FileInputStream(file);
        }
    }

    @Override // T1.v
    public u i(A a6) {
        switch (this.b) {
            case 0:
                return E.b;
            case 2:
                return new C0297c(new D(1), 0);
            case 4:
                return new C0297c(new D(3), 0);
            case 6:
                return new E(1);
            case 11:
                return new C(a6.b(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new C(a6.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new C(a6.b(Uri.class, InputStream.class), 0);
            default:
                return new H(a6.b(k.class, InputStream.class));
        }
    }

    @Override // N1.b
    public boolean m(Object obj, File file, N1.i iVar) {
        try {
            AbstractC2384b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e4) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e4);
            }
            return false;
        }
    }
}
