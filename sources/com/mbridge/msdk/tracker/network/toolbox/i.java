package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.ad;
import com.mbridge.msdk.tracker.network.ae;
import com.mbridge.msdk.tracker.network.q;
import java.io.IOException;
import java.io.InputStream;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
final class i {

    /* loaded from: classes4.dex */
    public static class a {
        final String a;

        /* renamed from: b, reason: collision with root package name */
        final ad f15486b;

        private a(String str, ad adVar) {
            this.a = str;
            this.f15486b = adVar;
        }
    }

    public static byte[] a(InputStream inputStream, int i10, c cVar, q qVar) throws IOException {
        byte[] bArr;
        l lVar = new l(cVar, i10);
        if (qVar != null) {
            qVar.f(0L);
        }
        try {
            bArr = cVar.a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
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
                } catch (Throwable th2) {
                    th = th2;
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
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
    }
}
