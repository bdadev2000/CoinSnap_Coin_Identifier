package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.ad;
import com.mbridge.msdk.tracker.network.ae;
import com.mbridge.msdk.tracker.network.q;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class i {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final String f18247a;
        final ad b;

        private a(String str, ad adVar) {
            this.f18247a = str;
            this.b = adVar;
        }
    }

    public static byte[] a(InputStream inputStream, int i9, c cVar, q qVar) throws IOException {
        byte[] bArr;
        l lVar = new l(cVar, i9);
        if (qVar != null) {
            qVar.f(0L);
        }
        try {
            bArr = cVar.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    lVar.write(bArr, 0, read);
                    if (qVar != null) {
                        qVar.f(qVar.f() + read);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            ae.a("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.a(bArr);
                    lVar.close();
                    throw th;
                }
            }
            byte[] byteArray = lVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                ae.a("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.a(bArr);
            lVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }
}
