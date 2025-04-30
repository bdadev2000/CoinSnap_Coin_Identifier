package com.bytedance.sdk.component.adexpress.zp.lMd;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.zp.KS.zp;
import com.bytedance.sdk.component.utils.Gzh;
import com.bytedance.sdk.component.utils.tG;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class KS {
    public void KS(List<zp.C0085zp> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<zp.C0085zp> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(zp(), com.bytedance.sdk.component.utils.COT.zp(it.next().zp()));
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

    public List<zp.C0085zp> lMd(com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar, com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<zp.C0085zp> arrayList3 = new ArrayList<>();
        if (zpVar2 != null && !zpVar2.HWF().isEmpty()) {
            if (zpVar.HWF().isEmpty()) {
                arrayList.addAll(zpVar2.HWF());
            } else {
                for (zp.C0085zp c0085zp : zpVar.HWF()) {
                    if (!zpVar2.HWF().contains(c0085zp) && c0085zp != null && c0085zp.zp() != null && c0085zp.lMd() != null) {
                        arrayList2.add(c0085zp);
                    }
                }
                for (zp.C0085zp c0085zp2 : zpVar2.HWF()) {
                    if (!zpVar.HWF().contains(c0085zp2)) {
                        arrayList.add(c0085zp2);
                    }
                }
            }
        } else {
            arrayList2.addAll(zpVar.HWF());
        }
        if (zp(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public abstract File zp();

    public boolean zp(Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar = map.get(it.next());
            if (zpVar != null && !zp(zpVar.HWF())) {
                return false;
            }
        }
        return true;
    }

    public boolean zp(List<zp.C0085zp> list) {
        if (list == null || list.size() <= 0 || zp() == null) {
            return false;
        }
        for (zp.C0085zp c0085zp : list) {
            String zp = com.bytedance.sdk.component.utils.COT.zp(c0085zp.zp());
            if (TextUtils.isEmpty(zp)) {
                return false;
            }
            File file = new File(zp(), zp);
            String zp2 = com.bytedance.sdk.component.utils.COT.zp(file);
            if (!file.exists() || !file.isFile() || c0085zp.lMd() == null || !c0085zp.lMd().equals(zp2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean KS(com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar, com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar2) {
        if (zpVar != null) {
            try {
                if (!TextUtils.isEmpty(zpVar.KS())) {
                    if (zpVar2 == null) {
                        return false;
                    }
                    if (zp(zpVar.KS(), zpVar2.KS())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> zp = zpVar.zp();
                    Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> zp2 = zpVar2.zp();
                    if (zp.isEmpty()) {
                        return !zp2.isEmpty();
                    }
                    if (zp2.isEmpty()) {
                        return false;
                    }
                    return zp(zp, zp2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean zp(zp.lMd lmd) {
        if (lmd == null || zp() == null) {
            return false;
        }
        List<Pair<String, String>> lMd = lmd.lMd();
        if (lMd == null || lMd.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = lMd.iterator();
        while (it.hasNext()) {
            File file = new File(zp(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void lMd(List<zp.C0085zp> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<zp.C0085zp> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(zp(), com.bytedance.sdk.component.utils.COT.zp(it.next().zp()));
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

    public List<zp.C0085zp> zp(com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar, com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> zp = zpVar.zp();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<zp.C0085zp> arrayList3 = new ArrayList<>();
        if (zp.size() == 0) {
            if (zpVar2 != null && zpVar2.zp().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> zp2 = zpVar2.zp();
                Iterator<String> it = zp2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar3 = zp2.get(it.next());
                    if (zpVar3 != null) {
                        arrayList.addAll(zpVar3.HWF());
                    }
                }
            }
        } else if (zpVar2 != null && zpVar2.zp().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> zp3 = zpVar2.zp();
            for (String str : zp.keySet()) {
                com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar4 = zp.get(str);
                com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar5 = zp3.get(str);
                if (zpVar5 == null && zpVar4 != null) {
                    arrayList2.addAll(zpVar4.HWF());
                } else if (zpVar4 == null && zpVar5 != null) {
                    arrayList.addAll(zpVar5.HWF());
                } else if (zpVar4 != null) {
                    for (zp.C0085zp c0085zp : zpVar4.HWF()) {
                        if (c0085zp != null && !zpVar5.HWF().contains(c0085zp) && c0085zp.lMd() != null && c0085zp.zp() != null) {
                            arrayList2.add(c0085zp);
                        }
                    }
                    for (zp.C0085zp c0085zp2 : zpVar5.HWF()) {
                        if (c0085zp2 != null && !zpVar4.HWF().contains(c0085zp2)) {
                            arrayList.add(c0085zp2);
                        }
                    }
                }
            }
        } else if (zp.size() != 0) {
            Iterator<String> it2 = zp.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar6 = zp.get(it2.next());
                if (zpVar6 != null) {
                    arrayList2.addAll(zpVar6.HWF());
                }
            }
        }
        if (zp(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void lMd(File file, com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar, String str) {
        if (zpVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (zpVar.HWF() != null) {
            Iterator<zp.C0085zp> it = zpVar.HWF().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.COT.zp(it.next().zp())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean zp(List<zp.C0085zp> list, List<zp.C0085zp> list2) {
        for (zp.C0085zp c0085zp : list) {
            String zp = c0085zp.zp();
            String zp2 = com.bytedance.sdk.component.utils.COT.zp(zp);
            File file = new File(zp(), zp2);
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
            com.bytedance.sdk.component.QR.lMd.zp HWF = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().HWF();
            HWF.lMd(zp);
            HWF.zp(zp().getAbsolutePath(), zp2);
            com.bytedance.sdk.component.QR.lMd zp3 = HWF.zp();
            list2.add(c0085zp);
            if (zp3 == null || !zp3.HWF() || zp3.COT() == null || !zp3.COT().exists()) {
                KS(list2);
                return false;
            }
        }
        return true;
    }

    public boolean zp(String str) {
        File file = new File(zp().getAbsoluteFile(), o.j(com.bytedance.sdk.component.utils.COT.zp(str), ".zip"));
        com.bytedance.sdk.component.QR.lMd.zp HWF = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().HWF();
        HWF.lMd(str);
        HWF.zp(file.getParent(), file.getName());
        com.bytedance.sdk.component.QR.lMd zp = HWF.zp();
        if (zp.HWF() && zp.COT() != null && zp.COT().exists()) {
            File COT = zp.COT();
            try {
                Gzh.zp(COT.getAbsolutePath(), file.getParent());
                if (!COT.exists()) {
                    return true;
                }
                COT.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void zp(int i9) {
        if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().jU() != null) {
            com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().jU().zp(i9);
        }
    }

    public static void zp(File file, com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar, String str) {
        if (zpVar == null) {
            return;
        }
        String YW = zpVar.YW();
        if (TextUtils.isEmpty(YW)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                fileOutputStream2.write(YW.getBytes("utf-8"));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    tG.zp("PlayComponentEngineCacheManager", "version save error3", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean zp(Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> map, Map<String, com.bytedance.sdk.component.adexpress.zp.KS.zp> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar = map.get(str);
            if (zpVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar2 = map2.get(str);
            if (zpVar2 == null) {
                return false;
            }
            if (zp(zpVar.KS(), zpVar2.KS())) {
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
    private static boolean zp(java.lang.String r6, java.lang.String r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.zp.lMd.KS.zp(java.lang.String, java.lang.String):boolean");
    }

    @Deprecated
    public static boolean zp(com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar, String str) {
        if (zpVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(zpVar.KS())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return zp(zpVar.KS(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
