package com.bykv.vk.openvk.preload.geckox.d;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.k;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

/* loaded from: classes.dex */
public class h extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: h, reason: collision with root package name */
    private int f13256h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.k
    public final boolean a(Throwable th) {
        GeckoLogger.w("gecko-debug-tag", "patch update failed", th);
        if (this.f13256h >= ((UpdatePackage) this.f13157g).getPatch().getUrlList().size()) {
            return false;
        }
        return (th instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage updatePackage = (UpdatePackage) this.f13157g;
        List<String> urlList = updatePackage.getPatch().getUrlList();
        int i9 = this.f13256h;
        this.f13256h = i9 + 1;
        return new Pair<>(Uri.parse(urlList.get(i9)), updatePackage);
    }
}
