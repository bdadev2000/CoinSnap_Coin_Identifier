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

    /* renamed from: a, reason: collision with root package name */
    public b f13162a;
    public AtomicBoolean b = new AtomicBoolean(false);

    public a(Context context, String str, File file) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (file != null) {
                    this.f13162a = new b(context, str, file);
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
        if (!this.b.get()) {
            b bVar = this.f13162a;
            if (!bVar.b.get()) {
                if (!TextUtils.isEmpty(str)) {
                    com.bykv.vk.openvk.preload.geckox.f.a a6 = bVar.a(str.trim());
                    return a6.a(a6.b).b(com.bykv.vk.openvk.preload.geckox.f.a.a(a6.b, str));
                }
                throw new RuntimeException("relativePath empty");
            }
            throw new RuntimeException("released");
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final Map<String, Long> getChannelVersion() {
        return this.f13162a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final InputStream getInputStream(String str) throws Exception {
        if (!this.b.get()) {
            GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
            b bVar = this.f13162a;
            if (!bVar.b.get()) {
                if (!TextUtils.isEmpty(str)) {
                    com.bykv.vk.openvk.preload.geckox.f.a a6 = bVar.a(str.trim());
                    return a6.a(a6.b).a(com.bykv.vk.openvk.preload.geckox.f.a.a(a6.b, str));
                }
                throw new RuntimeException("relativePath empty");
            }
            throw new RuntimeException("released");
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final String getResRootDir() {
        return this.f13162a.f13265c;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final void release() throws Exception {
        if (this.b.getAndSet(true)) {
            return;
        }
        b bVar = this.f13162a;
        if (!bVar.b.getAndSet(true)) {
            GeckoLogger.d("Loader", "release version res loader");
            synchronized (bVar.f13264a) {
                for (com.bykv.vk.openvk.preload.geckox.f.a aVar : bVar.f13264a.values()) {
                    if (!aVar.f13261e.getAndSet(true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(aVar.f13258a);
                        String str = File.separator;
                        sb.append(str);
                        sb.append(aVar.b);
                        sb.append(str);
                        sb.append("select.lock");
                        com.bykv.vk.openvk.preload.geckox.g.b a6 = com.bykv.vk.openvk.preload.geckox.g.b.a(sb.toString());
                        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
                        try {
                            if (aVar.f13259c != null) {
                                c.b(aVar.f13259c.getAbsolutePath() + str + "using.lock");
                                a6.a();
                                com.bykv.vk.openvk.preload.geckox.a.c.a(aVar.f13258a + str + aVar.b);
                            }
                        } finally {
                            a6.a();
                        }
                    }
                }
                bVar.f13264a.clear();
            }
        }
    }
}
