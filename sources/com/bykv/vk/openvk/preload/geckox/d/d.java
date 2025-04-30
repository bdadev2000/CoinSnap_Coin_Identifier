package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<List<String>, List<Pair<String, Long>>> {

    /* renamed from: g, reason: collision with root package name */
    private File f13251g;

    /* renamed from: h, reason: collision with root package name */
    private String f13252h;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<List<Pair<String, Long>>> bVar, List<String> list) throws Throwable {
        List<String> list2 = list;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f13251g, this.f13252h);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long a6 = j.a(new File(file, str));
            arrayList.add(new Pair(str, Long.valueOf(a6 == null ? 0L : a6.longValue())));
        }
        return bVar.a((com.bykv.vk.openvk.preload.b.b<List<Pair<String, Long>>>) arrayList);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f13251g = (File) objArr[0];
        this.f13252h = (String) objArr[1];
    }
}
