package com.bykv.vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.f.b;
import com.bykv.vk.openvk.preload.geckox.g.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements ILoader {
    public b a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f9990b = new AtomicBoolean(false);

    public a(Context context, String str, File file) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (file != null) {
                    this.a = new b(context, str, file);
                    return;
                }
                throw new RuntimeException("resRootDir == null");
            }
            throw new RuntimeException("access key empty");
        }
        throw new RuntimeException("context == null");
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final boolean exist(String str) throws Exception {
        if (!this.f9990b.get()) {
            b bVar = this.a;
            if (!bVar.f10088b.get()) {
                if (!TextUtils.isEmpty(str)) {
                    com.bykv.vk.openvk.preload.geckox.f.a a = bVar.a(str.trim());
                    return a.a(a.f10083b).b(com.bykv.vk.openvk.preload.geckox.f.a.a(a.f10083b, str));
                }
                throw new RuntimeException("relativePath empty");
            }
            throw new RuntimeException("released");
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final Map<String, Long> getChannelVersion() {
        return this.a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final InputStream getInputStream(String str) throws Exception {
        if (!this.f9990b.get()) {
            GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
            b bVar = this.a;
            if (!bVar.f10088b.get()) {
                if (!TextUtils.isEmpty(str)) {
                    com.bykv.vk.openvk.preload.geckox.f.a a = bVar.a(str.trim());
                    return a.a(a.f10083b).a(com.bykv.vk.openvk.preload.geckox.f.a.a(a.f10083b, str));
                }
                throw new RuntimeException("relativePath empty");
            }
            throw new RuntimeException("released");
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final String getResRootDir() {
        return this.a.f10089c;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final void release() throws Exception {
        if (this.f9990b.getAndSet(true)) {
            return;
        }
        b bVar = this.a;
        if (!bVar.f10088b.getAndSet(true)) {
            GeckoLogger.d("Loader", "release version res loader");
            synchronized (bVar.a) {
                for (com.bykv.vk.openvk.preload.geckox.f.a aVar : bVar.a.values()) {
                    if (!aVar.f10086e.getAndSet(true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(aVar.a);
                        String str = File.separator;
                        sb2.append(str);
                        sb2.append(aVar.f10083b);
                        sb2.append(str);
                        sb2.append("select.lock");
                        com.bykv.vk.openvk.preload.geckox.g.b a = com.bykv.vk.openvk.preload.geckox.g.b.a(sb2.toString());
                        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
                        try {
                            if (aVar.f10084c != null) {
                                c.b(aVar.f10084c.getAbsolutePath() + str + "using.lock");
                                a.a();
                                com.bykv.vk.openvk.preload.geckox.a.c.a(aVar.a + str + aVar.f10083b);
                            }
                        } finally {
                            a.a();
                        }
                    }
                }
                bVar.a.clear();
            }
        }
    }
}
