package com.bykv.vk.openvk.preload.geckox.a;

import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    public static void a(final String str) {
        i.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c.c(str);
                } catch (Throwable th) {
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(new RuntimeException("delete old channel version failed，path：" + str, th));
                }
            }
        });
    }

    public static boolean b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append("update.lock");
            com.bykv.vk.openvk.preload.geckox.g.a a6 = com.bykv.vk.openvk.preload.geckox.g.a.a(sb.toString());
            if (a6 == null) {
                return true;
            }
            try {
                com.bykv.vk.openvk.preload.geckox.g.b a9 = com.bykv.vk.openvk.preload.geckox.g.b.a(str + str2 + "select.lock");
                try {
                    com.bykv.vk.openvk.preload.geckox.utils.c.c(new File(str));
                } catch (Throwable unused) {
                }
                a9.a();
                return true;
            } finally {
                a6.a();
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: all -> 0x004d, LOOP:0: B:21:0x005d->B:23:0x0063, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:8:0x0030, B:10:0x0040, B:12:0x0043, B:15:0x0048, B:17:0x0052, B:20:0x0059, B:21:0x005d, B:23:0x0063), top: B:7:0x0030, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void c(java.lang.String r4) throws java.lang.Exception {
        /*
            java.lang.StringBuilder r0 = z.AbstractC2965e.b(r4)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r2 = "update.lock"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.openvk.preload.geckox.g.a r0 = com.bykv.vk.openvk.preload.geckox.g.a.a(r0)
            if (r0 == 0) goto L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r2.<init>()     // Catch: java.lang.Throwable -> L8e
            r2.append(r4)     // Catch: java.lang.Throwable -> L8e
            r2.append(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "select.lock"
            r2.append(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L8e
            com.bykv.vk.openvk.preload.geckox.g.b r1 = com.bykv.vk.openvk.preload.geckox.g.b.a(r1)     // Catch: java.lang.Throwable -> L8e
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            com.bykv.vk.openvk.preload.geckox.a.c$2 r4 = new com.bykv.vk.openvk.preload.geckox.a.c$2     // Catch: java.lang.Throwable -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4d
            java.io.File[] r4 = r2.listFiles(r4)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4f
            int r2 = r4.length     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L4f
            int r2 = r4.length     // Catch: java.lang.Throwable -> L4d
            r3 = 1
            if (r2 != r3) goto L48
            goto L4f
        L48:
            java.util.List r4 = a(r4)     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r4 = move-exception
            goto L97
        L4f:
            r4 = 0
        L50:
            if (r4 == 0) goto L90
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L59
            goto L90
        L59:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4d
        L5d:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L87
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L4d
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r3.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L4d
            r3.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L4d
            r3.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "using.lock"
            r3.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L4d
            com.bykv.vk.openvk.preload.geckox.g.c.c(r2)     // Catch: java.lang.Throwable -> L4d
            goto L5d
        L87:
            r1.a()     // Catch: java.lang.Throwable -> L8e
            r0.a()
            return
        L8e:
            r4 = move-exception
            goto L9b
        L90:
            r1.a()     // Catch: java.lang.Throwable -> L8e
            r0.a()
            return
        L97:
            r1.a()     // Catch: java.lang.Throwable -> L8e
            throw r4     // Catch: java.lang.Throwable -> L8e
        L9b:
            r0.a()
            throw r4
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.a.c.c(java.lang.String):void");
    }

    private static List<File> a(File[] fileArr) {
        long j7;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j9 = -1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                a(file2);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (parseLong > j9) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j9 = parseLong;
                                a(file2);
                            }
                        }
                        file = file2;
                        j9 = parseLong;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file3 = (File) it.next();
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                a(file3);
            } else {
                try {
                    j7 = Long.parseLong(name2.substring(0, indexOf));
                } catch (NumberFormatException e4) {
                    e4.printStackTrace();
                    j7 = -1;
                }
                if (j7 <= j9) {
                    a(file3);
                }
            }
        }
        return arrayList2;
    }

    private static void a(final File file) {
        e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
            }
        });
    }
}
