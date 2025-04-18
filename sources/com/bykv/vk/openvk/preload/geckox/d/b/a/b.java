package com.bykv.vk.openvk.preload.geckox.d.b.a;

import a4.j;
import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes.dex */
public class b extends com.bykv.vk.openvk.preload.b.d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f10065g;

    /* renamed from: h, reason: collision with root package name */
    private File f10066h;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f10065g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f10066h = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start download full zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.f10066h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(updatePackage.getAccessKey());
        String str = File.separator;
        sb2.append(str);
        sb2.append(updatePackage.getChannel());
        sb2.append(str);
        sb2.append(updatePackage.getVersion());
        sb2.append("--updating");
        File file2 = new File(file, sb2.toString());
        file2.mkdirs();
        com.bykv.vk.openvk.preload.geckox.buffer.a a = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file2, "res.zip"), length);
        try {
            this.f10065g.f10019d.downloadFile(uri, length, new BufferOutputStream(a));
            try {
                return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a, updatePackage));
            } finally {
                a.e();
            }
        } catch (Throwable th2) {
            a.e();
            StringBuilder o10 = j.o("download full zip file failed, url:", uri, ", channel:");
            o10.append(updatePackage.getChannel());
            o10.append(", pkg id:");
            o10.append(updatePackage.getFullPackage().getId());
            o10.append(", caused by:");
            o10.append(th2.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(o10.toString(), th2);
        }
    }
}
