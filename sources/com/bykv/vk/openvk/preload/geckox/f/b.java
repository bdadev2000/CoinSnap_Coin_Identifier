package com.bykv.vk.openvk.preload.geckox.f;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, a> f13264a = new HashMap();
    public AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public String f13265c;

    /* renamed from: d, reason: collision with root package name */
    private String f13266d;

    public b(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            this.f13266d = str;
            if (file == null) {
                this.f13265c = new File(context.getFilesDir(), AbstractC2914a.h(new StringBuilder("gecko_offline_res_x"), File.separator, str)).getAbsolutePath();
                return;
            } else {
                this.f13265c = new File(file, str).getAbsolutePath();
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
        synchronized (this.f13264a) {
            try {
                aVar = this.f13264a.get(substring);
                if (aVar == null) {
                    aVar = new a(this.f13265c, substring);
                    this.f13264a.put(substring, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final Map<String, Long> a() {
        HashMap hashMap = new HashMap();
        synchronized (this.f13264a) {
            try {
                Collection<a> values = this.f13264a.values();
                if (values == null) {
                    return hashMap;
                }
                for (a aVar : values) {
                    hashMap.put(aVar.b, aVar.f13260d);
                }
                return hashMap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
