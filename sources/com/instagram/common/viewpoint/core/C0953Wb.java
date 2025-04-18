package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0953Wb implements C2I {
    public static C0953Wb A01;
    public static byte[] A02;
    public static String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final String A04;
    public final LinkedHashMap<String, C0619Iz> A00 = new LinkedHashMap<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{74, 93, 70, 76, 68, 77, 87, 77, 80, 92, 90, 73, 91, 87, 67, 77, 81, 6, 39, 49, 54, 48, 45, 59, 39, 38, 98, 3, 38, 98, 112, 119, 113, 124, 98, 103, 124, 106, 103, 124, 104, 102, 122};
    }

    static {
        A02();
        A04 = C0953Wb.class.getSimpleName();
    }

    public static C0953Wb A00() {
        if (A01 == null) {
            A01 = new C0953Wb();
        }
        return A01;
    }

    public final AnonymousClass22 A03(String str) {
        C0619Iz adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(31) == strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
        strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
        return null;
    }

    public final C0619Iz A04(String str) {
        return this.A00.get(str);
    }

    public final C0619Iz A05(String str, Messenger messenger, String str2) {
        C0619Iz c0619Iz = new C0619Iz(str, messenger, str2);
        this.A00.put(str, c0619Iz);
        return c0619Iz;
    }

    public final void A06() {
        Iterator<Map.Entry<String, C0619Iz>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (hasNext) {
                AnonymousClass22 anonymousClass22 = it.next().getValue().A00;
                if (anonymousClass22 != null) {
                    anonymousClass22.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i2, String str, Bundle bundle, Messenger messenger) {
        try {
            Message obtain = Message.obtain((Handler) null, i2);
            if (str != null) {
                obtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                obtain.getData().putBundle(A01(0, 17, 116), bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        C0619Iz c0619Iz = this.A00.get(str);
        if (c0619Iz != null && c0619Iz.A00 != null) {
            String str2 = A01(17, 13, 62) + str;
            c0619Iz.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C2I
    public final void ACk(int i2, String str, Bundle bundle) {
        C0619Iz adRecord = A04(str);
        if (adRecord != null) {
            A07(i2, str, bundle, adRecord.A01);
        }
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, C0619Iz>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            C0619Iz value = it.next().getValue();
            try {
                value.A01.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                hashSet.add(value.A02);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (hasNext) {
                A08((String) it2.next());
            } else {
                return;
            }
        }
    }
}
