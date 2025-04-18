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
    private final ma.b a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6387b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6388c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f6389d;

    public na(String str, boolean z10, ma.b bVar) {
        boolean z11;
        if (z10 && TextUtils.isEmpty(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        a1.a(z11);
        this.a = bVar;
        this.f6387b = str;
        this.f6388c = z10;
        this.f6389d = new HashMap();
    }

    @Override // com.applovin.impl.ld
    public byte[] a(UUID uuid, x7.a aVar) {
        String str;
        String b3 = aVar.b();
        if (this.f6388c || TextUtils.isEmpty(b3)) {
            b3 = this.f6387b;
        }
        if (!TextUtils.isEmpty(b3)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = r2.f7313e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = r2.f7311c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f6389d) {
                hashMap.putAll(this.f6389d);
            }
            return a(this.a, b3, aVar.a(), hashMap);
        }
        j5.b bVar = new j5.b();
        Uri uri = Uri.EMPTY;
        throw new md(bVar.a(uri).a(), uri, cb.h(), 0L, new IllegalStateException("No license URL"));
    }

    @Override // com.applovin.impl.ld
    public byte[] a(UUID uuid, x7.d dVar) {
        return a(this.a, dVar.b() + "&signedRequest=" + yp.a(dVar.a()), null, Collections.emptyMap());
    }

    private static String a(ma.e eVar, int i10) {
        Map map;
        List list;
        int i11 = eVar.f5950d;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = eVar.f5952g) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public void a(String str, String str2) {
        a1.a((Object) str);
        a1.a((Object) str2);
        synchronized (this.f6389d) {
            this.f6389d.put(str, str2);
        }
    }

    private static byte[] a(ma.b bVar, String str, byte[] bArr, Map map) {
        cl clVar = new cl(bVar.a());
        j5 a = new j5.b().b(str).a(map).b(2).a(bArr).a(1).a();
        int i10 = 0;
        j5 j5Var = a;
        while (true) {
            try {
                i5 i5Var = new i5(clVar, j5Var);
                try {
                    return yp.a((InputStream) i5Var);
                } catch (ma.e e2) {
                    String a10 = a(e2, i10);
                    if (a10 != null) {
                        i10++;
                        j5Var = j5Var.a().b(a10).a();
                    } else {
                        throw e2;
                    }
                } finally {
                    yp.a((Closeable) i5Var);
                }
            } catch (Exception e10) {
                throw new md(a, (Uri) a1.a(clVar.h()), clVar.e(), clVar.g(), e10);
            }
        }
    }
}
