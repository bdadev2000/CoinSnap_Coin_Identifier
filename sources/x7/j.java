package x7;

import android.net.Uri;
import com.google.common.collect.q2;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import s7.b1;
import s7.j1;
import v8.u0;

/* loaded from: classes3.dex */
public final class j {
    public final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public b1 f27480b;

    /* renamed from: c, reason: collision with root package name */
    public i f27481c;

    public static i a(b1 b1Var) {
        String uri;
        m9.w wVar = new m9.w();
        byte[] bArr = null;
        wVar.f21780b = null;
        Uri uri2 = b1Var.f24294c;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        h3.a aVar = new h3.a(uri, b1Var.f24298h, wVar);
        q2 it = b1Var.f24295d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((Map) aVar.f18725g)) {
                ((Map) aVar.f18725g).put(str, str2);
            }
        }
        e eVar = new e();
        UUID uuid = b1Var.f24293b;
        hf.d dVar = f0.f27448f;
        uuid.getClass();
        eVar.f27442b = uuid;
        eVar.f27443c = dVar;
        eVar.f27444d = b1Var.f24296f;
        eVar.f27445e = b1Var.f24297g;
        int[] B = c6.c.B(b1Var.f24299i);
        for (int i10 : B) {
            boolean z10 = true;
            if (i10 != 2 && i10 != 1) {
                z10 = false;
            }
            u0.d(z10);
        }
        i iVar = new i(eVar.f27442b, eVar.f27443c, aVar, eVar.a, eVar.f27444d, (int[]) B.clone(), eVar.f27445e, eVar.f27446f, eVar.f27447g);
        byte[] bArr2 = b1Var.f24300j;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        u0.m(iVar.f27468m.isEmpty());
        iVar.f27476v = 0;
        iVar.f27477w = bArr;
        return iVar;
    }

    public final u b(j1 j1Var) {
        i iVar;
        j1Var.f24453c.getClass();
        b1 b1Var = j1Var.f24453c.f24344d;
        if (b1Var != null && n9.h0.a >= 18) {
            synchronized (this.a) {
                if (!n9.h0.a(b1Var, this.f27480b)) {
                    this.f27480b = b1Var;
                    this.f27481c = a(b1Var);
                }
                iVar = this.f27481c;
                iVar.getClass();
            }
            return iVar;
        }
        return u.a;
    }
}
