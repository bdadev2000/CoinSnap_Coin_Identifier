package com.bykv.vk.openvk.component.video.zp.zp.zp;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class zp implements com.bykv.vk.openvk.component.video.api.zp.lMd {
    private String zp = "video_reward_full";
    private String lMd = "video_brand";
    private String KS = "video_splash";
    private String jU = "video_default";
    private String COT = null;
    private String HWF = null;
    private String QR = null;
    private String ku = null;
    private String YW = null;

    private List<com.bykv.vk.openvk.component.video.api.zp.zp> HWF() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.component.video.api.zp.zp(new File(zp()).listFiles(), com.bykv.vk.openvk.component.video.zp.zp.KS()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.zp.zp(new File(lMd()).listFiles(), com.bykv.vk.openvk.component.video.zp.zp.lMd()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.zp.zp(new File(COT()).listFiles(), com.bykv.vk.openvk.component.video.zp.zp.jU()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.zp.zp(new File(KS()).listFiles(), com.bykv.vk.openvk.component.video.zp.zp.COT()));
        return arrayList;
    }

    private Set<String> QR() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.component.video.zp.zp.zp zpVar : com.bykv.vk.openvk.component.video.zp.zp.zp.zp.values()) {
            if (zpVar != null && zpVar.zp() != null) {
                com.bykv.vk.openvk.component.video.api.KS.KS zp = zpVar.zp();
                hashSet.add(com.bykv.vk.openvk.component.video.zp.COT.lMd.lMd(zp.lMd(), zp.rV()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.component.video.zp.COT.lMd.KS(zp.lMd(), zp.rV()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.component.video.zp.zp.lMd.lMd lmd : com.bykv.vk.openvk.component.video.zp.zp.lMd.KS.zp.values()) {
            if (lmd != null && lmd.zp() != null) {
                com.bykv.vk.openvk.component.video.api.KS.KS zp2 = lmd.zp();
                hashSet.add(com.bykv.vk.openvk.component.video.zp.COT.lMd.lMd(zp2.lMd(), zp2.rV()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.component.video.zp.COT.lMd.KS(zp2.lMd(), zp2.rV()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public String COT() {
        if (this.QR == null) {
            this.QR = this.COT + File.separator + this.lMd;
            File file = new File(this.QR);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.QR;
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp.lMd
    public String KS() {
        if (this.YW == null) {
            this.YW = this.COT + File.separator + this.jU;
            File file = new File(this.YW);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.YW;
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp.lMd
    public synchronized void jU() {
        try {
            Set<String> set = null;
            for (com.bykv.vk.openvk.component.video.api.zp.zp zpVar : HWF()) {
                File[] zp = zpVar.zp();
                if (zp != null && zp.length >= zpVar.lMd()) {
                    if (set == null) {
                        set = QR();
                    }
                    int lMd = zpVar.lMd() - 2;
                    if (lMd < 0) {
                        lMd = 0;
                    }
                    zp(zpVar.zp(), lMd, set);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp.lMd
    public String lMd() {
        if (this.ku == null) {
            this.ku = this.COT + File.separator + this.KS;
            File file = new File(this.ku);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.ku;
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp.lMd
    public void zp(String str) {
        this.COT = str;
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp.lMd
    public String zp() {
        if (this.HWF == null) {
            this.HWF = this.COT + File.separator + this.zp;
            File file = new File(this.HWF);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.HWF;
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp.lMd
    public long lMd(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        if (TextUtils.isEmpty(ks.lMd()) || TextUtils.isEmpty(ks.rV())) {
            return 0L;
        }
        return com.bykv.vk.openvk.component.video.zp.COT.lMd.zp(ks.lMd(), ks.rV());
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp.lMd
    public boolean zp(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        if (TextUtils.isEmpty(ks.lMd()) || TextUtils.isEmpty(ks.rV())) {
            return false;
        }
        return new File(ks.lMd(), ks.rV()).exists();
    }

    private static void zp(File[] fileArr, int i9, Set<String> set) {
        if (i9 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i9) {
                    List asList = Arrays.asList(fileArr);
                    Collections.sort(asList, new Comparator<File>() { // from class: com.bykv.vk.openvk.component.video.zp.zp.zp.zp.1
                        @Override // java.util.Comparator
                        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long lastModified = file2.lastModified() - file.lastModified();
                            if (lastModified == 0) {
                                return 0;
                            }
                            if (lastModified < 0) {
                                return -1;
                            }
                            return 1;
                        }
                    });
                    while (i9 < asList.size()) {
                        File file = (File) asList.get(i9);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) asList.get(i9)).delete();
                        }
                        i9++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
