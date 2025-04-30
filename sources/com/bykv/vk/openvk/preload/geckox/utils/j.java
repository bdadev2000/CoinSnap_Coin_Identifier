package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {
    public static Long a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.j.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        Long l = null;
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                try {
                    Long valueOf = Long.valueOf(file2.getName());
                    long longValue = valueOf.longValue();
                    if (l == null || longValue > l.longValue()) {
                        l = valueOf;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l;
    }

    public static List<Long> b(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.j.2
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (listFiles != null && listFiles.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                try {
                    Long valueOf = Long.valueOf(file2.getName());
                    valueOf.longValue();
                    arrayList.add(valueOf);
                } catch (Exception unused) {
                }
            }
            return arrayList;
        }
        return null;
    }
}
