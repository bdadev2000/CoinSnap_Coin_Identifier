package com.bykv.vk.openvk.component.video.zp.lMd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public class vDp {
    private int COT = -1;
    private int HWF;
    private final ArrayList<zp> KS;
    private final int QR;
    private final int jU;
    private static final Set<String> zp = new HashSet();
    private static final Set<String> lMd = new HashSet();

    /* loaded from: classes.dex */
    public class zp {
        int lMd;
        final String zp;

        public zp(String str) {
            this.zp = str;
        }

        public void lMd() {
            vDp.lMd.add(this.zp);
        }

        public String toString() {
            return this.zp;
        }

        public void zp() {
            vDp.zp.add(this.zp);
        }
    }

    public vDp(List<String> list) {
        int i9;
        if (!list.isEmpty()) {
            int size = list.size();
            this.jU = size;
            this.KS = new ArrayList<>(size);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (String str : list) {
                zp zpVar = new zp(str);
                if (zp.contains(str)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(zpVar);
                } else if (lMd.contains(str)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(zpVar);
                } else {
                    this.KS.add(zpVar);
                }
            }
            if (arrayList != null) {
                this.KS.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.KS.addAll(arrayList2);
            }
            Integer num = COT.YW;
            if (num != null && num.intValue() > 0) {
                i9 = num.intValue();
            } else {
                i9 = this.jU >= 2 ? 1 : 2;
            }
            this.QR = i9;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    public zp lMd() {
        if (zp()) {
            int i9 = this.COT + 1;
            if (i9 >= this.jU - 1) {
                this.COT = -1;
                this.HWF++;
            } else {
                this.COT = i9;
            }
            zp zpVar = this.KS.get(i9);
            zpVar.lMd = (this.HWF * this.jU) + this.COT;
            return zpVar;
        }
        throw new NoSuchElementException();
    }

    public boolean zp() {
        if (this.HWF < this.QR) {
            return true;
        }
        return false;
    }

    public vDp(String str) {
        ArrayList<zp> arrayList = new ArrayList<>(1);
        this.KS = arrayList;
        arrayList.add(new zp(str));
        this.jU = 1;
        this.QR = 1;
    }
}
