package com.bytedance.sdk.component.adexpress.YFl.Sg;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.YFl.tN.YFl;
import com.bytedance.sdk.component.utils.YI;
import com.bytedance.sdk.component.utils.YoT;
import eb.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class tN {
    public List<YFl.C0082YFl> Sg(com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl, com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<YFl.C0082YFl> arrayList3 = new ArrayList<>();
        if (yFl2 != null && !yFl2.vc().isEmpty()) {
            if (yFl.vc().isEmpty()) {
                arrayList.addAll(yFl2.vc());
            } else {
                for (YFl.C0082YFl c0082YFl : yFl.vc()) {
                    if (!yFl2.vc().contains(c0082YFl) && c0082YFl != null && c0082YFl.YFl() != null && c0082YFl.Sg() != null) {
                        arrayList2.add(c0082YFl);
                    }
                }
                for (YFl.C0082YFl c0082YFl2 : yFl2.vc()) {
                    if (!yFl.vc().contains(c0082YFl2)) {
                        arrayList.add(c0082YFl2);
                    }
                }
            }
        } else {
            arrayList2.addAll(yFl.vc());
        }
        if (YFl(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public abstract File YFl();

    public boolean YFl(Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl = map.get(it.next());
            if (yFl != null && !YFl(yFl.vc())) {
                return false;
            }
        }
        return true;
    }

    public void tN(List<YFl.C0082YFl> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<YFl.C0082YFl> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(YFl(), com.bytedance.sdk.component.utils.wN.YFl(it.next().YFl()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean YFl(List<YFl.C0082YFl> list) {
        if (list == null || list.size() <= 0 || YFl() == null) {
            return false;
        }
        for (YFl.C0082YFl c0082YFl : list) {
            String YFl = com.bytedance.sdk.component.utils.wN.YFl(c0082YFl.YFl());
            if (TextUtils.isEmpty(YFl)) {
                return false;
            }
            File file = new File(YFl(), YFl);
            String YFl2 = com.bytedance.sdk.component.utils.wN.YFl(file);
            if (!file.exists() || !file.isFile() || c0082YFl.Sg() == null || !c0082YFl.Sg().equals(YFl2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean tN(com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl, com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl2) {
        if (yFl != null) {
            try {
                if (!TextUtils.isEmpty(yFl.tN())) {
                    if (yFl2 == null) {
                        return false;
                    }
                    if (YFl(yFl.tN(), yFl2.tN())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl = yFl.YFl();
                    Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl2 = yFl2.YFl();
                    if (YFl.isEmpty()) {
                        return !YFl2.isEmpty();
                    }
                    if (YFl2.isEmpty()) {
                        return false;
                    }
                    return YFl(YFl, YFl2);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean YFl(YFl.Sg sg2) {
        if (sg2 == null || YFl() == null) {
            return false;
        }
        List<Pair<String, String>> Sg = sg2.Sg();
        if (Sg == null || Sg.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = Sg.iterator();
        while (it.hasNext()) {
            File file = new File(YFl(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void Sg(List<YFl.C0082YFl> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<YFl.C0082YFl> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(YFl(), com.bytedance.sdk.component.utils.wN.YFl(it.next().YFl()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<YFl.C0082YFl> YFl(com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl, com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl2) {
        Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl = yFl.YFl();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<YFl.C0082YFl> arrayList3 = new ArrayList<>();
        if (YFl.size() == 0) {
            if (yFl2 != null && yFl2.YFl().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl2 = yFl2.YFl();
                Iterator<String> it = YFl2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl3 = YFl2.get(it.next());
                    if (yFl3 != null) {
                        arrayList.addAll(yFl3.vc());
                    }
                }
            }
        } else if (yFl2 != null && yFl2.YFl().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl3 = yFl2.YFl();
            for (String str : YFl.keySet()) {
                com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl4 = YFl.get(str);
                com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl5 = YFl3.get(str);
                if (yFl5 == null && yFl4 != null) {
                    arrayList2.addAll(yFl4.vc());
                } else if (yFl4 == null && yFl5 != null) {
                    arrayList.addAll(yFl5.vc());
                } else if (yFl4 != null) {
                    for (YFl.C0082YFl c0082YFl : yFl4.vc()) {
                        if (c0082YFl != null && !yFl5.vc().contains(c0082YFl) && c0082YFl.Sg() != null && c0082YFl.YFl() != null) {
                            arrayList2.add(c0082YFl);
                        }
                    }
                    for (YFl.C0082YFl c0082YFl2 : yFl5.vc()) {
                        if (c0082YFl2 != null && !yFl4.vc().contains(c0082YFl2)) {
                            arrayList.add(c0082YFl2);
                        }
                    }
                }
            }
        } else if (YFl.size() != 0) {
            Iterator<String> it2 = YFl.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl6 = YFl.get(it2.next());
                if (yFl6 != null) {
                    arrayList2.addAll(yFl6.vc());
                }
            }
        }
        if (YFl(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void Sg(File file, com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl, String str) {
        if (yFl == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (yFl.vc() != null) {
            Iterator<YFl.C0082YFl> it = yFl.vc().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.wN.YFl(it.next().YFl())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean YFl(List<YFl.C0082YFl> list, List<YFl.C0082YFl> list2) {
        for (YFl.C0082YFl c0082YFl : list) {
            String YFl = c0082YFl.YFl();
            String YFl2 = com.bytedance.sdk.component.utils.wN.YFl(YFl);
            File file = new File(YFl(), YFl2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.DSW.Sg.YFl vc2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().vc();
            vc2.Sg(YFl);
            vc2.YFl(YFl().getAbsolutePath(), YFl2);
            com.bytedance.sdk.component.DSW.Sg YFl3 = vc2.YFl();
            list2.add(c0082YFl);
            if (YFl3 == null || !YFl3.vc() || YFl3.wN() == null || !YFl3.wN().exists()) {
                tN(list2);
                return false;
            }
        }
        return true;
    }

    public boolean YFl(String str) {
        File file = new File(YFl().getAbsoluteFile(), j.k(com.bytedance.sdk.component.utils.wN.YFl(str), ".zip"));
        com.bytedance.sdk.component.DSW.Sg.YFl vc2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().vc();
        vc2.Sg(str);
        vc2.YFl(file.getParent(), file.getName());
        com.bytedance.sdk.component.DSW.Sg YFl = vc2.YFl();
        if (YFl.vc() && YFl.wN() != null && YFl.wN().exists()) {
            File wN = YFl.wN();
            try {
                YI.YFl(wN.getAbsolutePath(), file.getParent());
                if (!wN.exists()) {
                    return true;
                }
                wN.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void YFl(int i10) {
        if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().AlY() != null) {
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().AlY().YFl(i10);
        }
    }

    public static void YFl(File file, com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl, String str) {
        FileOutputStream fileOutputStream;
        if (yFl == null) {
            return;
        }
        String NjR = yFl.NjR();
        if (TextUtils.isEmpty(NjR)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file3);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(NjR.getBytes("utf-8"));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            try {
                YoT.YFl("PlayComponentEngineCacheManager", "version save error3", th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th4) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th4;
            }
        }
    }

    private static boolean YFl(Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> map, Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl = map.get(str);
            if (yFl == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl2 = map2.get(str);
            if (yFl2 == null) {
                return false;
            }
            if (YFl(yFl.tN(), yFl2.tN())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean YFl(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.YFl.Sg.tN.YFl(java.lang.String, java.lang.String):boolean");
    }

    @Deprecated
    public static boolean YFl(com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl, String str) {
        if (yFl == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(yFl.tN())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return YFl(yFl.tN(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
