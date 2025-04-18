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
    private int f10082h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.k
    public final boolean a(Throwable th2) {
        GeckoLogger.w("gecko-debug-tag", "patch update failed", th2);
        if (this.f10082h >= ((UpdatePackage) this.f9987g).getPatch().getUrlList().size()) {
            return false;
        }
        return (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage updatePackage = (UpdatePackage) this.f9987g;
        List<String> urlList = updatePackage.getPatch().getUrlList();
        int i10 = this.f10082h;
        this.f10082h = i10 + 1;
        return new Pair<>(Uri.parse(urlList.get(i10)), updatePackage);
    }
}
