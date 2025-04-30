package y2;

import a.AbstractC0325a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.facebook.H;
import com.facebook.internal.z;
import com.facebook.r;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.ar.core.Camera;
import com.google.ar.core.TrackingFailureReason;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import f1.AbstractC2260i;
import f1.C2255d;
import f1.C2259h;
import i8.O;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import y.AbstractC2933a;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2947c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f24353a;

    public static final boolean a(byte[] bArr, int i9, byte[] bArr2, int i10, int i11) {
        G7.j.e(bArr, "a");
        G7.j.e(bArr2, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        if (i11 > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (bArr[i12 + i9] != bArr2[i12 + i10]) {
                    return false;
                }
                if (i13 < i11) {
                    i12 = i13;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = q(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = c(r9, r10, r11)
            boolean r1 = c(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = q(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.AbstractC2947c.b(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean c(int i9, Rect rect, Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static final void h(long j7, long j9, long j10) {
        if ((j9 | j10) >= 0 && j9 <= j7 && j7 - j9 >= j10) {
            return;
        }
        StringBuilder a6 = AbstractC2933a.a("size=", j7, " offset=");
        a6.append(j9);
        a6.append(" byteCount=");
        a6.append(j10);
        throw new ArrayIndexOutOfBoundsException(a6.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                jArr[i9] = iArr[i9];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static O j(String str) {
        G7.j.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return O.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return O.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return O.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return O.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return O.SSL_3_0;
        }
        throw new IllegalArgumentException(G7.j.j(str, "Unexpected TLS version: "));
    }

    public static final String k(Context context) {
        G7.j.e(context, "ctx");
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            G7.j.d(signatureArr, "signatures");
            int length = signatureArr.length;
            int i9 = 0;
            while (i9 < length) {
                Signature signature = signatureArr[i9];
                i9++;
                messageDigest.update(signature.toByteArray());
                sb.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            String sb2 = sb.toString();
            G7.j.d(sb2, "sb.toString()");
            return sb2;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static float l(int i9, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i9]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static String m(Camera camera) {
        TrackingFailureReason trackingFailureReason = camera.getTrackingFailureReason();
        switch (s2.e.b[trackingFailureReason.ordinal()]) {
            case 1:
                return "";
            case 2:
                return "Tracking lost due to bad internal state. Please try restarting the AR experience.";
            case 3:
                if (Build.VERSION.SDK_INT < 31) {
                    return "Too dark. Try moving to a well-lit area.";
                }
                return "Too dark. Try moving to a well-lit area. Also, make sure the Block Camera is set to off in system settings.";
            case 4:
                return "Moving too fast. Slow down.";
            case 5:
                return "Can't find anything. Aim device at a surface with more texture or color.";
            case 6:
                return "Another app is using the camera. Tap on this app or try closing the other one.";
            default:
                return "Unknown tracking failure reason: " + trackingFailureReason;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(android.content.Context r4) {
        /*
            android.content.SharedPreferences r0 = y8.a.l(r4)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Le
            return
        Le:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r1 = r4.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r1 == 0) goto L37
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            boolean r0 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            goto L38
        L37:
            r0 = 1
        L38:
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r1 != 0) goto L43
            r4 = 0
            com.google.android.gms.tasks.Tasks.forResult(r4)
            goto L53
        L43:
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            U4.v r2 = new U4.v
            r2.<init>(r4, r0, r1)
            r2.run()
            r1.getTask()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.AbstractC2947c.n(android.content.Context):void");
    }

    public static boolean o(int i9, Rect rect, Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 == 130) {
                        int i10 = rect.top;
                        int i11 = rect2.top;
                        if ((i10 >= i11 && rect.bottom > i11) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i12 = rect.left;
                int i13 = rect2.left;
                if ((i12 >= i13 && rect.right > i13) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if ((i14 <= i15 && rect.top < i15) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if ((i16 <= i17 && rect.left < i17) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static boolean p(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int q(int i9, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 == 130) {
                        i10 = rect2.top;
                        i11 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i10 = rect2.left;
                    i11 = rect.right;
                }
            } else {
                i10 = rect.top;
                i11 = rect2.bottom;
            }
        } else {
            i10 = rect.left;
            i11 = rect2.right;
        }
        return Math.max(0, i10 - i11);
    }

    public static int r(int i9, Rect rect, Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static int u(Context context, int i9, int i10) {
        TypedValue n2 = AbstractC0325a.n(context, i9);
        if (n2 != null && n2.type == 16) {
            return n2.data;
        }
        return i10;
    }

    public static TimeInterpolator v(Context context, int i9, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!p(valueOf, "cubic-bezier") && !p(valueOf, MBridgeConstans.DYNAMIC_VIEW_WX_PATH)) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (p(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return V.a.b(l(0, split), l(1, split), l(2, split), l(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            }
            if (p(valueOf, MBridgeConstans.DYNAMIC_VIEW_WX_PATH)) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    L.i.b(AbstractC0325a.c(substring), path);
                    return V.a.c(path);
                } catch (RuntimeException e4) {
                    throw new RuntimeException("Error in parsing ".concat(substring), e4);
                }
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static final int w(int i9) {
        return ((i9 & 255) << 24) | (((-16777216) & i9) >>> 24) | ((16711680 & i9) >>> 8) | ((65280 & i9) << 8);
    }

    public static void x(HashMap hashMap) {
        SharedPreferences sharedPreferences = r.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = hashMap.get("dataset_id");
        Object obj2 = hashMap.get("endpoint");
        Object obj3 = hashMap.get("access_key");
        if (obj != null && obj2 != null && obj3 != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("dataset_id", obj.toString());
            edit.putString("endpoint", obj2.toString());
            edit.putString("access_key", obj3.toString());
            edit.apply();
            L4.f fVar = z.f13680c;
            r.h(H.f13413f);
        }
    }

    public static void y(PAGRequest pAGRequest, String str, MediationAdConfiguration mediationAdConfiguration) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String watermark = mediationAdConfiguration.getWatermark();
        if (TextUtils.isEmpty(watermark)) {
            return;
        }
        Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new HashMap<>();
        }
        extraInfo.put("admob_watermark", watermark);
        pAGRequest.setExtraInfo(extraInfo);
    }

    public abstract boolean e(AbstractC2260i abstractC2260i, C2255d c2255d, C2255d c2255d2);

    public abstract boolean f(AbstractC2260i abstractC2260i, Object obj, Object obj2);

    public abstract boolean g(AbstractC2260i abstractC2260i, C2259h c2259h, C2259h c2259h2);

    public abstract void s(C2259h c2259h, C2259h c2259h2);

    public abstract void t(C2259h c2259h, Thread thread);
}
