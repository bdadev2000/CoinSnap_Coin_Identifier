package c6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.common.collect.b1;
import com.google.common.collect.k2;
import com.google.common.collect.l2;
import com.google.common.collect.m2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import l9.t;
import n4.q;
import n4.y;
import n9.o;
import n9.x;
import v8.u0;
import y7.a0;

/* loaded from: classes3.dex */
public abstract class c {
    public static int a = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f2628c = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final q f2627b = new q();

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2629d = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: e, reason: collision with root package name */
    public static final y0.i f2630e = new y0.i();

    public static boolean A(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static int[] B(Collection collection) {
        if (collection instanceof ta.a) {
            ta.a aVar = (ta.a) collection;
            return Arrays.copyOfRange(aVar.f25375b, aVar.f25376c, aVar.f25377d);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final String a(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            byte b3 = bytes[i10];
            i10++;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b3)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static int b(long j3) {
        int i10 = (int) j3;
        if (((long) i10) == j3) {
            return i10;
        }
        throw new IllegalArgumentException(u0.P("Out of range: %s", Long.valueOf(j3)));
    }

    public static int c(int i10, int i11) {
        boolean z10;
        if (i11 <= 1073741823) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.min(Math.max(i10, i11), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        }
        throw new IllegalArgumentException(u0.P("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i11), Integer.valueOf(LockFreeTaskQueueCore.MAX_CAPACITY_MASK)));
    }

    public static void d(long j3, x xVar, a0[] a0VarArr) {
        int i10;
        int i11;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (xVar.f22600c - xVar.f22599b > 1) {
                int i12 = 0;
                while (true) {
                    if (xVar.f22600c - xVar.f22599b == 0) {
                        i10 = -1;
                        break;
                    }
                    int v10 = xVar.v();
                    i12 += v10;
                    if (v10 != 255) {
                        i10 = i12;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (xVar.f22600c - xVar.f22599b == 0) {
                        i13 = -1;
                        break;
                    }
                    int v11 = xVar.v();
                    i13 += v11;
                    if (v11 != 255) {
                        break;
                    }
                }
                int i14 = xVar.f22599b;
                int i15 = i14 + i13;
                if (i13 != -1 && i13 <= xVar.f22600c - i14) {
                    if (i10 == 4 && i13 >= 8) {
                        int v12 = xVar.v();
                        int A = xVar.A();
                        if (A == 49) {
                            i11 = xVar.f();
                        } else {
                            i11 = 0;
                        }
                        int v13 = xVar.v();
                        if (A == 47) {
                            xVar.H(1);
                        }
                        if (v12 == 181 && ((A == 49 || A == 47) && v13 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (A == 49) {
                            if (i11 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            e(j3, xVar, a0VarArr);
                        }
                    }
                } else {
                    o.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i15 = xVar.f22600c;
                }
                xVar.G(i15);
            } else {
                return;
            }
        }
    }

    public static void e(long j3, x xVar, a0[] a0VarArr) {
        boolean z10;
        int v10 = xVar.v();
        if ((v10 & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        xVar.H(1);
        int i10 = (v10 & 31) * 3;
        int i11 = xVar.f22599b;
        for (a0 a0Var : a0VarArr) {
            xVar.G(i11);
            a0Var.a(i10, xVar);
            if (j3 != C.TIME_UNSET) {
                a0Var.d(j3, 1, i10, 0, null);
            }
        }
    }

    public static n4.d f(h4.d dVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i11 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i10 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i11 = current.getIntrinsicHeight();
                }
                Lock lock = y.f22456b;
                lock.lock();
                Bitmap b3 = dVar.b(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(b3);
                    current.setBounds(0, 0, i10, i11);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = b3;
                    z10 = true;
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }
            bitmap = null;
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            dVar = f2627b;
        }
        return n4.d.b(bitmap, dVar);
    }

    public static AdError g(int i10, String str) {
        return new AdError(i10, str, "com.google.ads.mediation.mintegral");
    }

    public static AdError h(int i10, String str) {
        return new AdError(i10, str, "com.mbridge.msdk");
    }

    public static String i(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static boolean j() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            va.g.c();
            va.g c10 = va.g.c();
            c10.a();
            Context context = c10.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l2 l(Set set, t tVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof l2) {
                l2 l2Var = (l2) sortedSet;
                ra.j jVar = l2Var.f12000c;
                jVar.getClass();
                return new m2((SortedSet) l2Var.f11999b, new ra.k(Arrays.asList(jVar, tVar)));
            }
            sortedSet.getClass();
            return new m2(sortedSet, tVar);
        }
        if (set instanceof l2) {
            l2 l2Var2 = (l2) set;
            ra.j jVar2 = l2Var2.f12000c;
            jVar2.getClass();
            return new l2((Set) l2Var2.f11999b, new ra.k(Arrays.asList(jVar2, tVar)));
        }
        set.getClass();
        return new l2(set, tVar);
    }

    public static void m(int i10, x xVar) {
        xVar.D(7);
        byte[] bArr = xVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static final va.g n() {
        Intrinsics.checkNotNullParameter(b6.a.f2290h, "<this>");
        va.g c10 = va.g.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getInstance()");
        return c10;
    }

    public static Object o(Future future) {
        Object obj;
        boolean z10 = false;
        if (future.isDone()) {
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(u0.P("Future was expected to be done: %s", future));
    }

    public static void p(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return;
        }
        a4.j.t(it.next());
        throw null;
    }

    public static final View q(Activity activity) {
        if (m6.a.b(c.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
            return null;
        }
    }

    public static int r(Set set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 = ~(~(i11 + i10));
        }
        return i11;
    }

    public static k2 s(b1 b1Var, b1 b1Var2) {
        if (b1Var != null) {
            if (b1Var2 != null) {
                return new k2(b1Var, b1Var2, 1);
            }
            throw new NullPointerException("set2");
        }
        throw new NullPointerException("set1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r0 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean t() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r2 = "generic"
            boolean r3 = kotlin.text.StringsKt.z(r0, r2)
            if (r3 != 0) goto L73
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = kotlin.text.StringsKt.z(r0, r1)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r3 = "google_sdk"
            boolean r4 = kotlin.text.StringsKt.d(r0, r3)
            if (r4 != 0) goto L73
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "Emulator"
            boolean r4 = kotlin.text.StringsKt.d(r0, r4)
            if (r4 != 0) goto L73
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = kotlin.text.StringsKt.d(r0, r1)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = kotlin.text.StringsKt.d(r0, r1)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = kotlin.text.StringsKt.z(r0, r2)
            if (r0 == 0) goto L68
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = kotlin.text.StringsKt.z(r0, r2)
            if (r0 != 0) goto L73
        L68:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L71
            goto L73
        L71:
            r0 = 0
            goto L74
        L73:
            r0 = 1
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.t():boolean");
    }

    public static boolean u(Uri uri) {
        if (uri != null && AppLovinEventTypes.USER_VIEWED_CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void v(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.v(android.content.Intent):void");
    }

    public static void w(Bundle bundle, String str) {
        String str2;
        try {
            va.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            if (hb.d.h(bundle)) {
                str2 = "display";
            } else {
                str2 = DataSchemeDataSource.SCHEME_DATA;
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            za.b bVar = (za.b) va.g.c().b(za.b.class);
            if (bVar != null) {
                ((za.c) bVar).a(AppMeasurement.FCM_ORIGIN, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        if (r11 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.recyclerview.widget.y1 x(y7.c0 r11) {
        /*
            r0 = 16
            int r1 = r11.i(r0)
            int r0 = r11.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r11.i(r1)
            r4 = 0
            r5 = 3
            if (r2 != r5) goto L3d
            r6 = r4
        L2b:
            int r7 = r11.i(r1)
            int r7 = r7 + r6
            boolean r6 = r11.h()
            if (r6 != 0) goto L38
            int r2 = r2 + r7
            goto L3d
        L38:
            int r7 = r7 + 1
            int r6 = r7 << 2
            goto L2b
        L3d:
            r6 = 10
            int r6 = r11.i(r6)
            boolean r7 = r11.h()
            if (r7 == 0) goto L52
            int r7 = r11.i(r5)
            if (r7 <= 0) goto L52
            r11.r(r1)
        L52:
            boolean r7 = r11.h()
            r8 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            if (r7 == 0) goto L60
            r7 = r8
            goto L61
        L60:
            r7 = r9
        L61:
            int r11 = r11.i(r3)
            int[] r10 = c6.c.f2629d
            if (r7 != r9) goto L70
            r9 = 13
            if (r11 != r9) goto L70
            r11 = r10[r11]
            goto L9b
        L70:
            if (r7 != r8) goto L9a
            r8 = 14
            if (r11 >= r8) goto L9a
            r4 = r10[r11]
            int r6 = r6 % 5
            r8 = 1
            r9 = 8
            if (r6 == r8) goto L94
            r8 = 11
            if (r6 == r1) goto L8f
            if (r6 == r5) goto L94
            if (r6 == r3) goto L88
            goto L9a
        L88:
            if (r11 == r5) goto L98
            if (r11 == r9) goto L98
            if (r11 != r8) goto L9a
            goto L98
        L8f:
            if (r11 == r9) goto L98
            if (r11 != r8) goto L9a
            goto L98
        L94:
            if (r11 == r5) goto L98
            if (r11 != r9) goto L9a
        L98:
            int r4 = r4 + 1
        L9a:
            r11 = r4
        L9b:
            androidx.recyclerview.widget.y1 r1 = new androidx.recyclerview.widget.y1
            r1.<init>(r2, r7, r0, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.x(y7.c0):androidx.recyclerview.widget.y1");
    }

    public static r4.c y(x xVar) {
        xVar.H(1);
        int x10 = xVar.x();
        long j3 = xVar.f22599b + x10;
        int i10 = x10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long o10 = xVar.o();
            if (o10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = o10;
            jArr2[i11] = xVar.o();
            xVar.H(2);
            i11++;
        }
        xVar.H((int) (j3 - xVar.f22599b));
        return new r4.c(jArr, jArr2, 20);
    }

    public static int z(long j3) {
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }
}
