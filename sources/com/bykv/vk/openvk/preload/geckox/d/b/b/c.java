package com.bykv.vk.openvk.preload.geckox.d.b.b;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;

/* loaded from: classes.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f13240g;

    /* renamed from: h, reason: collision with root package name */
    private File f13241h;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f13240g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f13241h = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start download patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getPatch().getLength();
        File file = this.f13241h;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getAccessKey());
        String str = File.separator;
        sb.append(str);
        sb.append(updatePackage.getChannel());
        sb.append(str);
        sb.append(updatePackage.getVersion());
        sb.append("--updating");
        File file2 = new File(file, sb.toString());
        file2.mkdirs();
        com.bykv.vk.openvk.preload.geckox.buffer.a a6 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file2, "patch.tmp"), length);
        try {
            this.f13240g.f13194d.downloadFile(uri, length, new BufferOutputStream(a6));
            try {
                return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a6, updatePackage));
            } finally {
                a6.e();
            }
        } catch (Throwable th) {
            a6.e();
            StringBuilder n2 = o.n("download patch zip failed, url:", uri, ", channel:");
            n2.append(updatePackage.getChannel());
            n2.append(", pkg id:");
            n2.append(updatePackage.getPatch().getId());
            n2.append(", caused by:");
            n2.append(th.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(n2.toString(), th);
        }
    }
}
