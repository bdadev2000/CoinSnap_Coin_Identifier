package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.l5;
import com.applovin.impl.qa;
import com.applovin.impl.z7;
import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class ra implements qd {

    /* renamed from: a, reason: collision with root package name */
    private final qa.b f26281a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26282b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26283c;
    private final Map d;

    public ra(String str, boolean z2, qa.b bVar) {
        b1.a((z2 && TextUtils.isEmpty(str)) ? false : true);
        this.f26281a = bVar;
        this.f26282b = str;
        this.f26283c = z2;
        this.d = new HashMap();
    }

    @Override // com.applovin.impl.qd
    public byte[] a(UUID uuid, z7.a aVar) {
        String str;
        String b2 = aVar.b();
        if (this.f26283c || TextUtils.isEmpty(b2)) {
            b2 = this.f26282b;
        }
        if (!TextUtils.isEmpty(b2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = t2.e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = t2.f27007c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.d) {
                hashMap.putAll(this.d);
            }
            return a(this.f26281a, b2, aVar.a(), hashMap);
        }
        l5.b bVar = new l5.b();
        Uri uri = Uri.EMPTY;
        throw new rd(bVar.a(uri).a(), uri, gb.h(), 0L, new IllegalStateException("No license URL"));
    }

    @Override // com.applovin.impl.qd
    public byte[] a(UUID uuid, z7.d dVar) {
        return a(this.f26281a, dVar.b() + "&signedRequest=" + xp.a(dVar.a()), null, Collections.emptyMap());
    }

    private static String a(qa.e eVar, int i2) {
        Map map;
        List list;
        int i3 = eVar.d;
        if ((i3 != 307 && i3 != 308) || i2 >= 5 || (map = eVar.f26164g) == null || (list = (List) map.get(HttpHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public void a(String str, String str2) {
        b1.a((Object) str);
        b1.a((Object) str2);
        synchronized (this.d) {
            this.d.put(str, str2);
        }
    }

    private static byte[] a(qa.b bVar, String str, byte[] bArr, Map map) {
        fl flVar = new fl(bVar.a());
        l5 a2 = new l5.b().b(str).a(map).b(2).a(bArr).a(1).a();
        int i2 = 0;
        l5 l5Var = a2;
        while (true) {
            try {
                k5 k5Var = new k5(flVar, l5Var);
                try {
                    try {
                        return xp.a((InputStream) k5Var);
                    } finally {
                        xp.a((Closeable) k5Var);
                    }
                } catch (qa.e e) {
                    String a3 = a(e, i2);
                    if (a3 != null) {
                        i2++;
                        l5Var = l5Var.a().b(a3).a();
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw new rd(a2, (Uri) b1.a(flVar.h()), flVar.e(), flVar.g(), e2);
            }
        }
    }
}
