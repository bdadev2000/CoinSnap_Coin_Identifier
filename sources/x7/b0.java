package x7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface b0 {
    int a();

    void b(v3.c cVar);

    w7.b c(byte[] bArr);

    void closeSession(byte[] bArr);

    z e(byte[] bArr, List list, int i10, HashMap hashMap);

    default void f(byte[] bArr, t7.x xVar) {
    }

    boolean g(String str, byte[] bArr);

    a0 getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
