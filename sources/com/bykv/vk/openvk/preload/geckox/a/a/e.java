package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class e extends b {
    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.f10014f.iterator();
        while (it.hasNext()) {
            List<File> b3 = com.bykv.vk.openvk.preload.geckox.utils.c.b(new File(this.f10013e, it.next()));
            if (b3 != null && b3.size() > this.f10012d.a) {
                for (File file : b3.subList(0, b3.size() - this.f10012d.a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.f10012d.f10007c != null) {
                        file.getName();
                    }
                }
            }
        }
    }
}
