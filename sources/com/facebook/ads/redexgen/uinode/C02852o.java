package com.facebook.ads.redexgen.uinode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.2o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02852o {
    public static C02852o A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C02842n>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C02842n>> A03 = new HashMap<>();
    public final ArrayList<C02832m> A02 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, Ascii.ESC, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, 66, 67, Ascii.FS, 48, Base64.padSymbol, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, Ascii.SO, -1, 1, 9, Ascii.FF, 19, 9, 6, Ascii.EM, 6, Ascii.GS, 34, Ascii.EM, Ascii.SO, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C02852o(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2l
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C02852o.this.A02();
                        return;
                    default:
                        super.handleMessage(message);
                        return;
                }
            }
        };
    }

    public static C02852o A00(Context context) {
        C02852o c02852o;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C02852o(context.getApplicationContext());
            }
            c02852o = A05;
        }
        return c02852o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:10:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            r8 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.facebook.ads.redexgen.X.2n>> r1 = r8.A04
            monitor-enter(r1)
            java.util.ArrayList<com.facebook.ads.redexgen.X.2m> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L45
            if (r0 > 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            goto L44
        Ld:
            com.facebook.ads.redexgen.X.2m[] r7 = new com.facebook.ads.redexgen.uinode.C02832m[r0]     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.2m> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.toArray(r7)     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.2m> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L1b:
            int r0 = r7.length
            if (r6 >= r0) goto L0
            r5 = r7[r6]
            java.util.ArrayList<com.facebook.ads.redexgen.X.2n> r0 = r5.A01
            int r4 = r0.size()
            r3 = 0
        L27:
            if (r3 >= r4) goto L41
            java.util.ArrayList<com.facebook.ads.redexgen.X.2n> r0 = r5.A01
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.2n r1 = (com.facebook.ads.redexgen.uinode.C02842n) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L3e
            android.content.BroadcastReceiver r2 = r1.A02
            android.content.Context r1 = r8.A00
            android.content.Intent r0 = r5.A00
            r2.onReceive(r1, r0)
        L3e:
            int r3 = r3 + 1
            goto L27
        L41:
            int r6 = r6 + 1
            goto L1b
        L44:
            return
        L45:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C02852o.A02():void");
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C02842n> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C02842n c02842n = remove.get(size);
                c02842n.A01 = true;
                for (int j3 = 0; j3 < c02842n.A03.countActions(); j3++) {
                    String action = c02842n.A03.getAction(j3);
                    ArrayList<C02842n> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i10 = arrayList.size();
                        for (int i11 = i10 - 1; i11 >= 0; i11--) {
                            C02842n c02842n2 = arrayList.get(i11);
                            if (c02842n2.A02 == broadcastReceiver) {
                                c02842n2.A01 = true;
                                arrayList.remove(i11);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C02842n c02842n = new C02842n(intentFilter, broadcastReceiver);
            ArrayList<C02842n> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c02842n);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<C02842n> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c02842n);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb2 = new StringBuilder();
                String type = A01(128, 15, 14);
                StringBuilder append = sb2.append(type).append(resolveTypeIfNeeded);
                String type2 = A01(62, 8, 14);
                StringBuilder append2 = append.append(type2).append(action2);
                String type3 = A01(51, 11, 42);
                append2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<C02842n>> hashMap = this.A03;
            String type4 = intent.getAction();
            ArrayList<C02842n> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb3 = new StringBuilder();
                    String type5 = A01(70, 13, 23);
                    sb3.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    C02842n c02842n = arrayList.get(i10);
                    if (debug) {
                        StringBuilder sb4 = new StringBuilder();
                        String type6 = A01(104, 24, 48);
                        sb4.append(type6).append(c02842n.A03).toString();
                    }
                    if (!c02842n.A00) {
                        int match = c02842n.A03.match(action, resolveTypeIfNeeded, action2, data, categories, A01(83, 21, 127));
                        if (match >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 33) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c02842n);
                            c02842n.A00 = true;
                        } else if (debug) {
                            switch (match) {
                                case C.RESULT_BUFFER_READ /* -4 */:
                                    A01 = A01(149, 8, 74);
                                    break;
                                case -3:
                                    A01 = A01(143, 6, 60);
                                    break;
                                case -2:
                                    A01 = A01(157, 4, 85);
                                    break;
                                case -1:
                                    A01 = A01(161, 4, 89);
                                    break;
                                default:
                                    A01 = A01(165, 14, 6);
                                    break;
                            }
                            String str2 = A01(0, 24, 28) + A01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        ((C02842n) arrayList2.get(i11)).A00 = false;
                    }
                    this.A02.add(new C02832m(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
