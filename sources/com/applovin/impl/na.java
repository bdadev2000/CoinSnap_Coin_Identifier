package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.j5;
import com.applovin.impl.ma;
import com.applovin.impl.x7;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class na implements ld {

    /* renamed from: a, reason: collision with root package name */
    private final ma.b f9323a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9324c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f9325d;

    public na(String str, boolean z8, ma.b bVar) {
        boolean z9;
        if (z8 && TextUtils.isEmpty(str)) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC0669a1.a(z9);
        this.f9323a = bVar;
        this.b = str;
        this.f9324c = z8;
        this.f9325d = new HashMap();
    }

    @Override // com.applovin.impl.ld
    public byte[] a(UUID uuid, x7.a aVar) {
        String str;
        String b = aVar.b();
        if (this.f9324c || TextUtils.isEmpty(b)) {
            b = this.b;
        }
        if (!TextUtils.isEmpty(b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = AbstractC0744r2.f10447e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = AbstractC0744r2.f10445c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f9325d) {
                hashMap.putAll(this.f9325d);
            }
            return a(this.f9323a, b, aVar.a(), hashMap);
        }
        j5.b bVar = new j5.b();
        Uri uri = Uri.EMPTY;
        throw new md(bVar.a(uri).a(), uri, cb.h(), 0L, new IllegalStateException("No license URL"));
    }

    @Override // com.applovin.impl.ld
    public byte[] a(UUID uuid, x7.d dVar) {
        return a(this.f9323a, dVar.b() + "&signedRequest=" + yp.a(dVar.a()), null, Collections.emptyMap());
    }

    private static String a(ma.e eVar, int i9) {
        Map map;
        List list;
        int i10 = eVar.f8900d;
        if ((i10 != 307 && i10 != 308) || i9 >= 5 || (map = eVar.f8902g) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public void a(String str, String str2) {
        AbstractC0669a1.a((Object) str);
        AbstractC0669a1.a((Object) str2);
        synchronized (this.f9325d) {
            this.f9325d.put(str, str2);
        }
    }

    private static byte[] a(ma.b bVar, String str, byte[] bArr, Map map) {
        cl clVar = new cl(bVar.a());
        j5 a6 = new j5.b().b(str).a(map).b(2).a(bArr).a(1).a();
        int i9 = 0;
        j5 j5Var = a6;
        while (true) {
            try {
                i5 i5Var = new i5(clVar, j5Var);
                try {
                    try {
                        return yp.a((InputStream) i5Var);
                    } finally {
                        yp.a((Closeable) i5Var);
                    }
                } catch (ma.e e4) {
                    String a9 = a(e4, i9);
                    if (a9 != null) {
                        i9++;
                        j5Var = j5Var.a().b(a9).a();
                    } else {
                        throw e4;
                    }
                }
            } catch (Exception e9) {
                throw new md(a6, (Uri) AbstractC0669a1.a(clVar.h()), clVar.e(), clVar.g(), e9);
            }
        }
    }
}
