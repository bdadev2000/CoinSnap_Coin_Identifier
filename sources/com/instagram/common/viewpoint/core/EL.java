package com.instagram.common.viewpoint.core;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A0F;
    public static String[] A0G = {"otHTb9LvI8ybF6vrVoO1rTrPCp306O74", "Rx1vO7hG8Az7i2Yj5pT4De7fyKew8lrJ", "xjFXtX9mXqBQEfJw2y9yGwIvt6nkyUB", "C8lHiEVGsA1InycY308zMITezDqlCJlt", "8V8H42NkZamtdcgQEkzyKv1AlHm2P2", "xa3iAkfTrkxPXtVHKDgHiLu9rp62G8cA", "MIua6DThmQIF1vqzpVDjqirjX1nsx6C7", "GEPWk2OCqdzdo4xY0bozaqI"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final E1 A09;
    public final EQ A0A;
    public final ArrayList<EI> A0B;
    public final ArrayList<EI> A0C;
    public final CopyOnWriteArraySet<EE> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            byte b2 = (byte) ((copyOfRange[i5] ^ i4) ^ 99);
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "YsGjonOW8fRp2ADpBQb8BIeWFn3N4H";
            strArr2[7] = "cgMIGSsvrovKZppoEzUMmRP";
            copyOfRange[i5] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{70, 5, 10, 7, 21, 14, 3, 21, 70, 17, 15, 18, 14, 70, 108, 118, 124, 73, 29, 81, 88, 92, 78, 73, 29, 82, 83, 88, 29, 121, 88, 78, 88, 79, 84, 92, 81, 84, 71, 88, 79, 29, 84, 78, 29, 79, 88, 76, 72, 84, 79, 88, 89, 19, 86, 125, 101, 124, 126, 125, 115, 118, 95, 115, 124, 115, 117, 119, 96, 50, 116, 123, 126, 119, 50, 123, 61, 125, 5, 48, 34, 58, 113, 56, 34, 113, 48, 53, 53, 52, 53, 34, 23, 5, 29, 86, 5, 2, 23, 2, 19, 86, 31, 5, 86, 21, 30, 23, 24, 17, 19, 18};
    }

    static {
        A0C();
    }

    public EL(EQ eq, int i2, int i3, File file, DownloadAction.Deserializer... deserializerArr) {
        AbstractC0576Hf.A05(deserializerArr.length > 0, A05(16, 38, 94));
        this.A0A = eq;
        this.A04 = i2;
        this.A05 = i3;
        this.A09 = new E1(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.A08 = new HandlerThread(A05(54, 24, Opcodes.LREM));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EI A02(DownloadAction downloadAction) {
        int i2 = this.A00;
        this.A00 = i2 + 1;
        EI ei = new EI(i2, this, downloadAction, this.A05, null);
        this.A0C.add(ei);
        A0K(A05(78, 13, 50), ei);
        return ei;
    }

    private void A08() {
        this.A06.post(new EC(this));
    }

    private void A09() {
        if (!A0S()) {
            return;
        }
        Iterator<EE> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().AC7(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc A[EDGE_INSN: B:52:0x00dc->B:39:0x00dc BREAK  A[LOOP:1: B:28:0x0099->B:34:0x00cf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.EL.A0A():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i2 = 0; i2 < this.A0C.size(); i2++) {
            downloadActionArr[i2] = EI.A06(this.A0C.get(i2));
        }
        this.A06.post(new ED(this, downloadActionArr));
    }

    private final void A0D() {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        if (A0G[2].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[0] = "kr6gKh0rssOkehhghCFLcVwB9pZxiZaT";
        strArr[5] = "rfZkRg3bvMesL7GazOt2jRzrapFwd57m";
        for (int i2 = 0; i2 < this.A0C.size(); i2++) {
            EI.A0D(this.A0C.get(i2));
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        this.A06.post(new EA(this, conditionVariable));
        conditionVariable.block();
        this.A08.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(EI ei) {
        A0K(A05(91, 21, 21), ei);
        EK A0M = ei.A0M();
        Iterator<EE> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().ADl(this, A0M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(EI ei) {
        if (this.A03) {
            return;
        }
        boolean A0N = ei.A0N();
        if (A0G[2].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "37NPLrajbAjLzkLuMj2xLkQATtgOEqIn";
        strArr[1] = "qsbydxnKXALymqP4MnHEOj9tIKxnSORB";
        boolean stopped = !A0N;
        if (stopped) {
            this.A0B.remove(ei);
        }
        A0E(ei);
        if (ei.A0O()) {
            this.A0C.remove(ei);
            A0B();
        }
        if (stopped) {
            A0A();
            A09();
        }
    }

    public static void A0K(String str, EI ei) {
        String str2 = str + A05(14, 2, 53) + ei;
    }

    public final int A0P(DownloadAction downloadAction) {
        AbstractC0576Hf.A04(!this.A03);
        EI A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (EI.A03(A02) == 0) {
                A0E(A02);
            }
        }
        return EI.A04(A02);
    }

    public final void A0Q() {
        AbstractC0576Hf.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0R(EE ee) {
        this.A0D.add(ee);
    }

    public final boolean A0S() {
        AbstractC0576Hf.A04(!this.A03);
        if (!this.A02) {
            return false;
        }
        int i2 = 0;
        while (true) {
            ArrayList<EI> arrayList = this.A0C;
            if (A0G[2].length() == 27) {
                throw new RuntimeException();
            }
            A0G[2] = "lfjS8VPE";
            int i3 = arrayList.size();
            if (i2 >= i3) {
                return true;
            }
            if (this.A0C.get(i2).A0N()) {
                return false;
            }
            i2++;
        }
    }

    public final EK[] A0T() {
        AbstractC0576Hf.A04(!this.A03);
        EK[] ekArr = new EK[this.A0C.size()];
        for (int i2 = 0; i2 < ekArr.length; i2++) {
            ekArr[i2] = this.A0C.get(i2).A0M();
        }
        return ekArr;
    }
}
