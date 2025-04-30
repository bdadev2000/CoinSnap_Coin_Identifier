package com.pgl.ssdk;

import com.pgl.ssdk.AbstractC2049c;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.pgl.ssdk.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2055i {
    @DungeonFlag
    private static Collection<? extends Certificate> a(ByteBuffer byteBuffer) throws C2047a, NoSuchAlgorithmException, CertificateException {
        ByteBuffer a6 = C2052f.a(byteBuffer);
        a6.get(new byte[a6.remaining()]);
        a6.flip();
        a6.position(0);
        C2052f.a(a6);
        return CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(C2052f.b(C2052f.a(a6))));
    }

    public static List<Certificate> a(InterfaceC2059m interfaceC2059m, AbstractC2049c.a aVar) throws IOException, C2051e {
        try {
            try {
                ByteBuffer a6 = C2052f.a(C2052f.a(interfaceC2059m, aVar, 1896449818).f19581a);
                if (!a6.hasRemaining()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (a6.hasRemaining()) {
                    try {
                        arrayList.addAll(a(C2052f.a(a6)));
                    } catch (NoSuchAlgorithmException | CertificateException unused) {
                    }
                }
                return arrayList;
            } catch (C2047a | BufferUnderflowException unused2) {
                return null;
            }
        } catch (C2054h e4) {
            throw new C2051e(e4.getMessage());
        }
    }
}
