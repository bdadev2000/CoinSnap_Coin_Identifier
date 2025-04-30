package com.bykv.vk.openvk.preload.geckox.d.b.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.BsPatch;
import java.io.File;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f13242g;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* bridge */ /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        return a2(bVar, pair);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f13242g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static Object a2(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start merge patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        File f9 = aVar.f();
        aVar.a();
        aVar.e();
        File parentFile = f9.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getLocalVersion());
        File file = new File(parentFile, AbstractC2914a.h(sb, File.separator, "res.zip"));
        File file2 = new File(f9.getParentFile(), "res.zip");
        com.bykv.vk.openvk.preload.geckox.utils.c.a(file2);
        try {
            try {
                BsPatch.a(file, f9, file2.getParentFile(), file2.getName());
                com.bykv.vk.openvk.preload.geckox.utils.c.a(f9);
                com.bykv.vk.openvk.preload.geckox.buffer.a a6 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file2, file2.length());
                try {
                    return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a6, updatePackage));
                } finally {
                    a6.e();
                }
            } catch (Throwable th) {
                com.bykv.vk.openvk.preload.geckox.utils.c.a(f9);
                throw th;
            }
        } catch (Exception e4) {
            throw new RuntimeException("merged patch zip file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e4.getMessage(), e4);
        }
    }
}
