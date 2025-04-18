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
    private File f10077g;

    /* renamed from: h, reason: collision with root package name */
    private String f10078h;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<List<Pair<String, Long>>> bVar, List<String> list) throws Throwable {
        List<String> list2 = list;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f10077g, this.f10078h);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long a = j.a(new File(file, str));
            arrayList.add(new Pair(str, Long.valueOf(a == null ? 0L : a.longValue())));
        }
        return bVar.a((com.bykv.vk.openvk.preload.b.b<List<Pair<String, Long>>>) arrayList);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f10077g = (File) objArr[0];
        this.f10078h = (String) objArr[1];
    }
}
