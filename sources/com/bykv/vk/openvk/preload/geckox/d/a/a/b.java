package com.bykv.vk.openvk.preload.geckox.d.a.a;

import a4.j;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes.dex */
public class b extends d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f10060g;

    /* renamed from: h, reason: collision with root package name */
    private File f10061h;

    public static String a(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                if (TextUtils.isEmpty(substring)) {
                    throw new RuntimeException("url path illegal, url:".concat(str));
                }
                return substring;
            }
            throw new RuntimeException("url path illegal, url:".concat(str));
        }
        throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f10060g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f10061h = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.f10061h;
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
        com.bykv.vk.openvk.preload.geckox.buffer.a a = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file2, "res" + str + a(updatePackage, uri)), length);
        try {
            this.f10060g.f10019d.downloadFile(uri, length, new BufferOutputStream(a));
            try {
                try {
                    Object a10 = bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a, updatePackage));
                    try {
                        a.e();
                    } catch (Exception e2) {
                        GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e2);
                    }
                    return a10;
                } catch (Exception e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                try {
                    a.e();
                } catch (Exception e11) {
                    GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e11);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            a.e();
            StringBuilder o10 = j.o("download full single file failed! url:", uri, ", channel:");
            o10.append(updatePackage.getChannel());
            o10.append(", pkg id:");
            o10.append(updatePackage.getFullPackage().getId());
            o10.append(", caused by:");
            o10.append(th3.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(o10.toString(), th3);
        }
    }
}
