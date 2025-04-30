package com.bytedance.sdk.component.ku;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.tG;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
class lMd implements Comparable, Runnable {
    private long KS;
    private Thread jU = null;
    private zp lMd;
    private ku zp;

    public lMd(ku kuVar, zp zpVar) {
        this.KS = 0L;
        this.zp = kuVar;
        this.lMd = zpVar;
        this.KS = SystemClock.uptimeMillis();
    }

    private void zp(String str, String str2, long j7) {
        StringBuilder o3 = o.o("pool is ", str, "  name is ", str2, "is timeout,cost ");
        o3.append(j7);
        tG.zp("DelegateRunnable", o3.toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof lMd) {
            return this.zp.compareTo(((lMd) obj).zp());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        ku kuVar;
        if ((obj instanceof lMd) && (kuVar = this.zp) != null && kuVar.equals(((lMd) obj).zp())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.zp.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        String str3;
        String str4;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.jU = Thread.currentThread();
        ku kuVar = this.zp;
        if (kuVar != null) {
            kuVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.lMd != null) {
            jU.zp();
        }
        if (tG.zp()) {
            zp zpVar = this.lMd;
            if (zpVar != null) {
                zpVar.zp();
            }
            ku kuVar2 = this.zp;
            if (kuVar2 != null) {
                kuVar2.getName();
            }
            String zp = this.lMd.zp();
            zp.getClass();
            String str5 = "null";
            char c9 = 65535;
            switch (zp.hashCode()) {
                case 3107:
                    if (zp.equals("ad")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 3366:
                    if (zp.equals("io")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (zp.equals("log")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 3237136:
                    if (zp.equals("init")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 212371911:
                    if (zp.equals("computation")) {
                        c9 = 4;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                case 3:
                    if (uptimeMillis2 > AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        zp zpVar2 = this.lMd;
                        if (zpVar2 == null) {
                            str = "null";
                        } else {
                            str = zpVar2.zp();
                        }
                        ku kuVar3 = this.zp;
                        if (kuVar3 != null) {
                            str5 = kuVar3.getName();
                        }
                        zp(str, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 1:
                    if (uptimeMillis2 > DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
                        zp zpVar3 = this.lMd;
                        if (zpVar3 == null) {
                            str2 = "null";
                        } else {
                            str2 = zpVar3.zp();
                        }
                        ku kuVar4 = this.zp;
                        if (kuVar4 != null) {
                            str5 = kuVar4.getName();
                        }
                        zp(str2, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 2:
                    if (uptimeMillis2 > 3000) {
                        zp zpVar4 = this.lMd;
                        if (zpVar4 == null) {
                            str3 = "null";
                        } else {
                            str3 = zpVar4.zp();
                        }
                        ku kuVar5 = this.zp;
                        if (kuVar5 != null) {
                            str5 = kuVar5.getName();
                        }
                        zp(str3, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 4:
                    if (uptimeMillis2 > 1000) {
                        zp zpVar5 = this.lMd;
                        if (zpVar5 == null) {
                            str4 = "null";
                        } else {
                            str4 = zpVar5.zp();
                        }
                        ku kuVar6 = this.zp;
                        if (kuVar6 != null) {
                            str5 = kuVar6.getName();
                        }
                        zp(str4, str5, uptimeMillis2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public ku zp() {
        return this.zp;
    }
}
