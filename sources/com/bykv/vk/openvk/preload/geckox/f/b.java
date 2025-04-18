package com.bykv.vk.openvk.preload.geckox.f;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import vd.e;

/* loaded from: classes.dex */
public final class b {
    public final Map<String, a> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f10088b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public String f10089c;

    /* renamed from: d, reason: collision with root package name */
    private String f10090d;

    public b(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            this.f10090d = str;
            if (file == null) {
                this.f10089c = new File(context.getFilesDir(), e.h(new StringBuilder("gecko_offline_res_x"), File.separator, str)).getAbsolutePath();
                return;
            } else {
                this.f10089c = new File(file, str).getAbsolutePath();
                return;
            }
        }
        throw new RuntimeException("access key empty");
    }

    public final a a(String str) {
        a aVar;
        int indexOf = str.indexOf("/");
        if (indexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String substring = str.substring(0, indexOf);
        synchronized (this.a) {
            aVar = this.a.get(substring);
            if (aVar == null) {
                aVar = new a(this.f10089c, substring);
                this.a.put(substring, aVar);
            }
        }
        return aVar;
    }

    public final Map<String, Long> a() {
        HashMap hashMap = new HashMap();
        synchronized (this.a) {
            Collection<a> values = this.a.values();
            if (values == null) {
                return hashMap;
            }
            for (a aVar : values) {
                hashMap.put(aVar.f10083b, aVar.f10085d);
            }
            return hashMap;
        }
    }
}
