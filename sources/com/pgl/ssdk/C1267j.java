package com.pgl.ssdk;

import com.pgl.ssdk.AbstractC1260c;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pgl.ssdk.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1267j {
    @DungeonFlag
    private static C1262e a(ByteBuffer byteBuffer) throws C1258a, NoSuchAlgorithmException, CertificateException {
        ByteBuffer a = C1264g.a(byteBuffer);
        a.get(new byte[a.remaining()]);
        a.flip();
        a.position(0);
        C1264g.a(a);
        byte[] b3 = C1264g.b(C1264g.a(a));
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b3));
            if (generateCertificate instanceof X509Certificate) {
                return new C1262e(String.valueOf(((X509Certificate) generateCertificate).getSubjectDN()), b3);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<C1262e> a(InterfaceC1271n interfaceC1271n, AbstractC1260c.a aVar) throws IOException, C1263f {
        try {
            try {
                ByteBuffer a = C1264g.a(C1264g.a(interfaceC1271n, aVar, 1896449818).a);
                if (!a.hasRemaining()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (a.hasRemaining()) {
                    try {
                        arrayList.add(a(C1264g.a(a)));
                    } catch (NoSuchAlgorithmException | CertificateException unused) {
                    }
                }
                return arrayList;
            } catch (C1258a | BufferUnderflowException unused2) {
                return null;
            }
        } catch (C1266i e2) {
            throw new C1263f(e2.getMessage());
        }
    }
}
