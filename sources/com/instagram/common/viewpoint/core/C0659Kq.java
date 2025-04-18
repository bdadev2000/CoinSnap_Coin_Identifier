package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0659Kq {
    public static byte[] A00;
    public static String[] A01 = {"WbJlBxxP9hhDyVkliYvNWFvleez5wFba", "Us5Q3ca4sjVLZknlXhQB6hWi1VD5Erza", "gJqO8U9bMVlcsLp5HSGrl2qXu5TMOPYV", "P57OBps6tL2979s4xCAUfWnFOcUQoKvX", "CjMQtwUDrO8ZQ06PzRRzPVuypWFQdtNK", "DynPiig1xYxCb14sB97Y7RAQimyT6aIC", "zcq0zXyldopis2WSYxgyl16P5Uge3oHA", "fUMP1AC"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1045Zs> A06;
    public static final AtomicReference<InterfaceC0666Kz> A07;
    public static final AtomicReference<L1> A08;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 54, 51, 57, 32, 40, 54, 51, 40, 56, 53, 61, 40, 62, 51, 40, 60, 50, 46, 57, 86, 83, 89, 64, 72, 88, 69, 94, 80, 94, 89, 86, 91, 72, 82, 79, 67, 69, 86, 68, 21, 122, Byte.MAX_VALUE, 117, 108, 100, 104, 122, 109, 126, Byte.MAX_VALUE, 100, 104, 111, 122, 111, 126, 100, Byte.MAX_VALUE, 122, 111, 122, 75, 121, 110, 125, 124, 56, 107, 108, 121, 108, 125, 56, 122, 109, 118, 124, 116, 125, 56, 113, 107, 56, 125, 117, 104, 108, 97, 57, 23, 21, 2, 41, 3, 2, 31, 26, 26, 21, 36, 24, 23, 18, 30, 21, 15, 36, 15, 20, 16, 30, 21, 100, 104, 106, 41, 97, 102, 100, 98, 101, 104, 104, 108, 41, 102, 99, 116, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 110, 119, 100, 41, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 85, 98, 106, 104, 115, 98, 70, 100, 115, 110, 113, 110, 115, 126, 109, 100, 107, 97, 105, 96, 80, 119, 108, 67, 106, 119, 87, 96, 118, 112, 105, 113, 15, 8, 29, 14, 8, 61, 31, 8, 21, 10, 21, 8, 5, 3, 4, 17, 2, 4, 49, 19, 4, 25, 6, 25, 4, 9, 54, 31, 2, 34, 21, 3, 5, 28, 4};
    }

    static {
        A07();
        A02 = C0659Kq.class.getPackage();
        A04 = A02 + A06(40, 22, 116);
        A03 = A02 + A06(0, 19, 56);
        A05 = A02 + A06(19, 21, 88);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent intent) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(intent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A01(Intent intent, ClassLoader classLoader) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Bundle audienceNetworkActivityBundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            audienceNetworkActivityBundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(audienceNetworkActivityBundle);
        return cloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            if (A01[2].charAt(4) != '8') {
                throw new RuntimeException();
            }
            A01[7] = "Zue8yRDoBrDWRSev";
            obtain.recycle();
            return readBundle;
        }
        throw new IllegalStateException(A06(62, 28, 87));
    }

    public static C1045Zs A03(Intent intent) {
        String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (C1045Zs c1045Zs : A06) {
                String adId = c1045Zs.A0E().getId();
                if (stringExtra.equals(adId)) {
                    return c1045Zs;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C1045Zs c1045Zs) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1045Zs.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1045Zs.A0E().getId());
        A06.add(c1045Zs);
        return adActivityIntent;
    }

    public static Class A05() {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            try {
                return Class.forName(A06(Opcodes.LREM, 59, 72));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return AudienceNetworkActivity.class;
    }

    public static void A08(Activity activity, Intent intent) throws C0657Ko {
        try {
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e) {
            throw new C0657Ko(e);
        }
    }

    public static void A09(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A0A(C1045Zs c1045Zs, AdActivityIntent adActivityIntent) throws C0657Ko {
        Context launchContext;
        Context applicationContext = c1045Zs.getApplicationContext();
        if (C0608Im.A2Q(c1045Zs) && (launchContext = c1045Zs.A0D()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & 268435456) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ 268435456);
            }
        }
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!A0J(c1045Zs, adActivityIntent)) {
                    c1045Zs.A0E().AFT();
                    return;
                }
                return;
            }
            applicationContext.startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e) {
            throw new C0657Ko(e);
        }
    }

    public static boolean A0B(Intent intent, Set<String> set) {
        Uri intentUri = intent.getData();
        if (intentUri == null) {
            return false;
        }
        String uri = intentUri.toString();
        Iterator<String> it = set.iterator();
        do {
            boolean hasNext = it.hasNext();
            if (A01[5].charAt(30) != 'I') {
                throw new RuntimeException();
            }
            A01[2] = "hOpA8yyYIRQLuX6WeWELRCriZfzSUGqk";
            if (!hasNext) {
                return false;
            }
        } while (!uri.startsWith(it.next()));
        return true;
    }

    public static boolean A0C(C1045Zs c1045Zs, Intent intent) throws C0657Ko {
        A07.get();
        return A0G(c1045Zs, intent, null);
    }

    public static boolean A0D(C1045Zs c1045Zs, Intent intent) throws C0657Ko {
        A07.get();
        if (0 != 0) {
            Activity A0D = c1045Zs.A0D();
            if (A01[7].length() == 30) {
                throw new RuntimeException();
            }
            A01[7] = "PLLjYBDqb811z0Dn6rlZ87lQdZ7C";
            if (A0D != null) {
                c1045Zs.A0B();
                try {
                    c1045Zs.A0D();
                    throw new NullPointerException(A06(203, 22, 63));
                } catch (ActivityNotFoundException e) {
                    throw new C0657Ko(e);
                } catch (Exception e2) {
                    c1045Zs.A07().AA0(A06(90, 8, 57), C8E.A07, new C8F(e2));
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean A0E(C1045Zs c1045Zs, Intent intent) throws C0657Ko {
        return A0F(c1045Zs, A00(intent), -1);
    }

    public static boolean A0F(C1045Zs c1045Zs, Intent intent, int i2) throws C0657Ko {
        try {
            Activity currentActivity = ActivityUtils.A00();
            if (currentActivity == null) {
                currentActivity = c1045Zs.A0D();
            }
            if (currentActivity != null) {
                if (i2 >= 0) {
                    currentActivity.startActivityForResult(intent, i2);
                    return true;
                }
                currentActivity.startActivity(intent);
                return true;
            }
            return false;
        } catch (ActivityNotFoundException e) {
            throw new C0657Ko(e);
        }
    }

    public static boolean A0G(C1045Zs c1045Zs, Intent intent, InterfaceC0666Kz interfaceC0666Kz) throws C0657Ko {
        if (A0B(intent, C0608Im.A0X(c1045Zs))) {
            return false;
        }
        Context context = c1045Zs;
        if (A01[1].charAt(5) != 'g') {
            A01[2] = "mGLT8eS8inmCxtBfGXr0XCfYNSNKmj30";
            Context startContext = c1045Zs.A0D();
            if (startContext != null) {
                context = startContext;
            } else {
                intent.addFlags(268435456);
            }
            if (interfaceC0666Kz != null && !A0B(intent, C0608Im.A0Z(c1045Zs))) {
                c1045Zs.A0B();
                try {
                    throw new NullPointerException(A06(190, 13, 51));
                } catch (ActivityNotFoundException e) {
                    throw new C0657Ko(e);
                } catch (Exception e2) {
                    c1045Zs.A07().AA0(A06(90, 8, 57), C8E.A08, new C8F(e2));
                    return false;
                }
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e3) {
                throw new C0657Ko(e3);
            }
        }
        throw new RuntimeException();
    }

    public static boolean A0H(C1045Zs c1045Zs, Uri uri, String str) throws ActivityNotFoundException {
        A08.get();
        return A0I(c1045Zs, uri, str, null);
    }

    public static boolean A0I(C1045Zs c1045Zs, Uri uri, String str, L1 l12) throws ActivityNotFoundException {
        if (l12 == null || c1045Zs.A0D() == null) {
            return false;
        }
        new Bundle().putString(A06(98, 15, 52), str);
        uri.toString();
        c1045Zs.A0D();
        throw new NullPointerException(A06(Opcodes.IRETURN, 18, 74));
    }

    public static boolean A0J(C1045Zs c1045Zs, AdActivityIntent adActivityIntent) throws C0657Ko {
        return A0F(c1045Zs, A00(adActivityIntent), 0);
    }
}
