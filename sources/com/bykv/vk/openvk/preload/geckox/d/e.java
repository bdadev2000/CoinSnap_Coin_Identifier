package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends com.bykv.vk.openvk.preload.b.d<String, Map<String, List<Pair<String, Long>>>> {

    /* renamed from: g, reason: collision with root package name */
    private File f13253g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f13254h;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<Map<String, List<Pair<String, Long>>>> bVar, String str) throws Throwable {
        Long a6;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", str);
        HashMap hashMap = new HashMap();
        for (String str2 : this.f13254h) {
            File file = new File(this.f13253g, str2);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str3 : list) {
                    File file2 = new File(file, str3);
                    if (file2.isDirectory() && (a6 = j.a(file2)) != null) {
                        arrayList.add(new Pair(str3, a6));
                    }
                }
            }
            hashMap.put(str2, arrayList);
        }
        return bVar.a((com.bykv.vk.openvk.preload.b.b<Map<String, List<Pair<String, Long>>>>) hashMap);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f13253g = (File) objArr[0];
        this.f13254h = (List) objArr[1];
    }
}
