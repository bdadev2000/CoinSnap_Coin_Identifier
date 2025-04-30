package com.bykv.vk.openvk.preload.geckox.d.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;

/* loaded from: classes.dex */
public class b extends d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f13233g;

    /* renamed from: h, reason: collision with root package name */
    private File f13234h;

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
        this.f13233g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f13234h = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.f13234h;
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
        com.bykv.vk.openvk.preload.geckox.buffer.a a6 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file2, "res" + str + a(updatePackage, uri)), length);
        try {
            this.f13233g.f13194d.downloadFile(uri, length, new BufferOutputStream(a6));
            try {
                try {
                    Object a9 = bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a6, updatePackage));
                    try {
                        a6.e();
                    } catch (Exception e4) {
                        GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e4);
                    }
                    return a9;
                } catch (Throwable th) {
                    try {
                        a6.e();
                    } catch (Exception e9) {
                        GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e9);
                    }
                    throw th;
                }
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            a6.e();
            StringBuilder n2 = o.n("download full single file failed! url:", uri, ", channel:");
            n2.append(updatePackage.getChannel());
            n2.append(", pkg id:");
            n2.append(updatePackage.getFullPackage().getId());
            n2.append(", caused by:");
            n2.append(th2.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(n2.toString(), th2);
        }
    }
}
