package com.bykv.vk.openvk.preload.geckox.d;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.k;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

/* loaded from: classes.dex */
public class g extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: h, reason: collision with root package name */
    private int f13255h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.k
    public final boolean a(Throwable th) {
        GeckoLogger.w("gecko-debug-tag", "full update failed and retry", th);
        if (this.f13255h >= ((UpdatePackage) this.f13157g).getFullPackage().getUrlList().size()) {
            return false;
        }
        return (th instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage updatePackage = (UpdatePackage) this.f13157g;
        List<String> urlList = updatePackage.getFullPackage().getUrlList();
        int i9 = this.f13255h;
        this.f13255h = i9 + 1;
        return new Pair<>(Uri.parse(urlList.get(i9)), updatePackage);
    }
}
