package com.bykv.vk.openvk.preload.geckox.d.a.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.BsPatch;
import java.io.File;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f13237g;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* bridge */ /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        return a2(bVar, pair);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f13237g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static Object a2(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start merge patch single file, channel:", ((UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        File f9 = aVar.f();
        aVar.a();
        aVar.e();
        File parentFile = f9.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getLocalVersion());
        String str = File.separator;
        File file = new File(parentFile, AbstractC2914a.h(sb, str, "res"));
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            File file2 = listFiles[0];
            File file3 = new File(f9.getParentFile(), "res" + str + com.bykv.vk.openvk.preload.geckox.d.a.a.b.a(updatePackage, updatePackage.getFullPackage().getUrlList().get(0)));
            com.bykv.vk.openvk.preload.geckox.utils.c.a(file3);
            try {
                try {
                    BsPatch.a(file2, f9, file3.getParentFile(), file3.getName());
                    com.bykv.vk.openvk.preload.geckox.utils.c.a(f9);
                    com.bykv.vk.openvk.preload.geckox.buffer.a a6 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file3, file3.length());
                    try {
                        return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a6, updatePackage));
                    } finally {
                        a6.e();
                    }
                } catch (Exception e4) {
                    throw new RuntimeException("merge patch single file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e4.getMessage(), e4);
                }
            } catch (Throwable th) {
                com.bykv.vk.openvk.preload.geckox.utils.c.a(f9);
                throw th;
            }
        }
        throw new RuntimeException("can not found old full single file,:" + file.getAbsolutePath());
    }
}
