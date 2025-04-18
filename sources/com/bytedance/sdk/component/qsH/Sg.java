package com.bytedance.sdk.component.qsH;

import a4.j;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.YoT;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
class Sg implements Comparable, Runnable {
    private Thread AlY = null;
    private YFl Sg;
    private qsH YFl;
    private long tN;

    public Sg(qsH qsh, YFl yFl) {
        this.tN = 0L;
        this.YFl = qsh;
        this.Sg = yFl;
        this.tN = SystemClock.uptimeMillis();
    }

    private void YFl(String str, String str2, long j3) {
        StringBuilder p10 = j.p("pool is ", str, "  name is ", str2, "is timeout,cost ");
        p10.append(j3);
        YoT.YFl("DelegateRunnable", p10.toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof Sg) {
            return this.YFl.compareTo(((Sg) obj).YFl());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        qsH qsh;
        return (obj instanceof Sg) && (qsh = this.YFl) != null && qsh.equals(((Sg) obj).YFl());
    }

    public int hashCode() {
        return this.YFl.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        String str3;
        String str4;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.AlY = Thread.currentThread();
        qsH qsh = this.YFl;
        if (qsh != null) {
            qsh.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.Sg != null) {
            AlY.YFl();
        }
        if (YoT.YFl()) {
            YFl yFl = this.Sg;
            if (yFl != null) {
                yFl.YFl();
            }
            qsH qsh2 = this.YFl;
            if (qsh2 != null) {
                qsh2.getName();
            }
            String YFl = this.Sg.YFl();
            YFl.getClass();
            char c10 = 65535;
            switch (YFl.hashCode()) {
                case 3107:
                    if (YFl.equals("ad")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3366:
                    if (YFl.equals("io")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (YFl.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3237136:
                    if (YFl.equals("init")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 212371911:
                    if (YFl.equals("computation")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            String str5 = AbstractJsonLexerKt.NULL;
            switch (c10) {
                case 0:
                case 3:
                    if (uptimeMillis2 > AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        YFl yFl2 = this.Sg;
                        if (yFl2 != null) {
                            str = yFl2.YFl();
                        } else {
                            str = AbstractJsonLexerKt.NULL;
                        }
                        qsH qsh3 = this.YFl;
                        if (qsh3 != null) {
                            str5 = qsh3.getName();
                        }
                        YFl(str, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 1:
                    if (uptimeMillis2 > DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
                        YFl yFl3 = this.Sg;
                        if (yFl3 != null) {
                            str2 = yFl3.YFl();
                        } else {
                            str2 = AbstractJsonLexerKt.NULL;
                        }
                        qsH qsh4 = this.YFl;
                        if (qsh4 != null) {
                            str5 = qsh4.getName();
                        }
                        YFl(str2, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 2:
                    if (uptimeMillis2 > 3000) {
                        YFl yFl4 = this.Sg;
                        if (yFl4 != null) {
                            str3 = yFl4.YFl();
                        } else {
                            str3 = AbstractJsonLexerKt.NULL;
                        }
                        qsH qsh5 = this.YFl;
                        if (qsh5 != null) {
                            str5 = qsh5.getName();
                        }
                        YFl(str3, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 4:
                    if (uptimeMillis2 > 1000) {
                        YFl yFl5 = this.Sg;
                        if (yFl5 != null) {
                            str4 = yFl5.YFl();
                        } else {
                            str4 = AbstractJsonLexerKt.NULL;
                        }
                        qsH qsh6 = this.YFl;
                        if (qsh6 != null) {
                            str5 = qsh6.getName();
                        }
                        YFl(str4, str5, uptimeMillis2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public qsH YFl() {
        return this.YFl;
    }
}
