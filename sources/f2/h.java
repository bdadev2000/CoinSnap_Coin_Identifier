package F2;

import F7.p;
import G7.j;
import G7.s;
import G7.v;
import Q7.AbstractC0251t;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.d0;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import d4.J;
import f8.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.C2487e;
import n7.InterfaceC2483a;
import o1.C2492a;
import o1.C2493b;
import r7.C2682b;
import w7.k;
import w7.l;
import x7.C2929b;
import x7.C2930c;
import y7.AbstractC2952a;
import y7.AbstractC2954c;
import y7.AbstractC2958g;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static Class f1143a = null;
    public static int b = 2;

    public static String B(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb;
        int i9 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e4) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i10] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i9 < objArr.length && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb5.append((CharSequence) str, i11, indexOf);
            sb5.append(objArr[i9]);
            i11 = indexOf + 2;
            i9++;
        }
        sb5.append((CharSequence) str, i11, str.length());
        if (i9 < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb5.append(", ");
                sb5.append(objArr[i12]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static final a C(a aVar, int i9) {
        int i10;
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            j.e(aVar, "x");
            int[] iArr = aVar.f1116a;
            int i11 = 0;
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = (i13 - i9) + 1;
            a aVar2 = new a(new int[]{i12, i15, i14});
            float[] fArr = aVar.f1117c;
            float[] fArr2 = aVar2.f1117c;
            if (i12 > 0) {
                int i16 = 0;
                while (true) {
                    int i17 = i16 + 1;
                    if (i14 > 0) {
                        int i18 = i11;
                        while (true) {
                            int i19 = i18 + 1;
                            if (i15 > 0) {
                                int i20 = i11;
                                while (true) {
                                    int i21 = i20 + 1;
                                    int i22 = i20 * i14;
                                    int i23 = (i16 * i15 * i14) + i22 + i18;
                                    int i24 = (i16 * i13 * i14) + i22 + i18;
                                    fArr2[i23] = Float.MIN_VALUE;
                                    if (i9 > 0) {
                                        int i25 = 0;
                                        while (true) {
                                            int i26 = i25 + 1;
                                            i10 = i13;
                                            fArr2[i23] = Math.max(fArr2[i23], fArr[(i25 * i14) + i24]);
                                            if (i26 >= i9) {
                                                break;
                                            }
                                            i25 = i26;
                                            i13 = i10;
                                        }
                                    } else {
                                        i10 = i13;
                                    }
                                    if (i21 >= i15) {
                                        break;
                                    }
                                    i20 = i21;
                                    i13 = i10;
                                }
                            } else {
                                i10 = i13;
                            }
                            if (i19 >= i14) {
                                break;
                            }
                            i18 = i19;
                            i13 = i10;
                            i11 = 0;
                        }
                    } else {
                        i10 = i13;
                    }
                    if (i17 >= i12) {
                        break;
                    }
                    i16 = i17;
                    i13 = i10;
                    i11 = 0;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static final a D(a aVar, a aVar2) {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            j.e(aVar, "x");
            j.e(aVar2, "w");
            int i9 = 0;
            int i10 = aVar.f1116a[0];
            int[] iArr = aVar2.f1116a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            a aVar3 = new a(new int[]{i10, i12});
            float[] fArr = aVar.f1117c;
            float[] fArr2 = aVar2.f1117c;
            float[] fArr3 = aVar3.f1117c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i12 > 0) {
                        int i15 = i9;
                        while (true) {
                            int i16 = i15 + 1;
                            int i17 = (i13 * i12) + i15;
                            fArr3[i17] = 0.0f;
                            if (i11 > 0) {
                                int i18 = i9;
                                while (true) {
                                    int i19 = i18 + 1;
                                    fArr3[i17] = (fArr[(i13 * i11) + i18] * fArr2[(i18 * i12) + i15]) + fArr3[i17];
                                    if (i19 >= i11) {
                                        break;
                                    }
                                    i18 = i19;
                                }
                            }
                            if (i16 >= i12) {
                                break;
                            }
                            i15 = i16;
                            i9 = 0;
                        }
                    }
                    if (i14 >= i10) {
                        break;
                    }
                    i13 = i14;
                    i9 = 0;
                }
            }
            return aVar3;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [k0.b, k0.c] */
    public static k0.b P(MappedByteBuffer mappedByteBuffer) {
        long j7;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i9 = duplicate.getShort() & 65535;
        if (i9 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    int i11 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j7 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i11) {
                        break;
                    }
                    i10++;
                } else {
                    j7 = -1;
                    break;
                }
            }
            if (j7 != -1) {
                duplicate.position(duplicate.position() + ((int) (j7 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j9 = duplicate.getInt() & 4294967295L;
                for (int i12 = 0; i12 < j9; i12++) {
                    int i13 = duplicate.getInt();
                    long j10 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (j10 + j7));
                        ?? cVar = new k0.c();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        cVar.b = duplicate;
                        cVar.f21396a = position;
                        int i14 = position - duplicate.getInt(position);
                        cVar.f21397c = i14;
                        cVar.f21398d = cVar.b.getShort(i14);
                        return cVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void Q(a aVar) {
        if (O2.a.b(h.class)) {
            return;
        }
        try {
            j.e(aVar, "x");
            float[] fArr = aVar.f1117c;
            int length = fArr.length - 1;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    if (fArr[i9] < 0.0f) {
                        fArr[i9] = 0.0f;
                    }
                    if (i10 <= length) {
                        i9 = i10;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            O2.a.a(h.class, th);
        }
    }

    public static final void R(String str, String str2) {
        try {
            if (f1143a == null) {
                f1143a = Class.forName("com.unity3d.player.UnityPlayer");
            }
            Class cls = f1143a;
            if (cls != null) {
                Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
                Class cls2 = f1143a;
                if (cls2 != null) {
                    method.invoke(cls2, "UnityFacebookSDKPlugin", str, str2);
                    return;
                } else {
                    j.k("unityPlayer");
                    throw null;
                }
            }
            j.k("unityPlayer");
            throw null;
        } catch (Exception e4) {
            Log.e("F2.h", "Failed to send message to Unity", e4);
        }
    }

    public static int T(int i9) {
        return (int) (Integer.rotateLeft((int) (i9 * (-862048943)), 15) * 461845907);
    }

    public static int U(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return T(hashCode);
    }

    public static final void V(a aVar) {
        if (O2.a.b(h.class)) {
            return;
        }
        try {
            j.e(aVar, "x");
            int[] iArr = aVar.f1116a;
            int i9 = 0;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr = aVar.f1117c;
            if (i10 <= 0) {
                return;
            }
            while (true) {
                int i12 = i9 + 1;
                int i13 = i9 * i11;
                int i14 = i13 + i11;
                float f9 = Float.MIN_VALUE;
                if (i13 < i14) {
                    int i15 = i13;
                    while (true) {
                        int i16 = i15 + 1;
                        float f10 = fArr[i15];
                        if (f10 > f9) {
                            f9 = f10;
                        }
                        if (i16 >= i14) {
                            break;
                        } else {
                            i15 = i16;
                        }
                    }
                }
                float f11 = 0.0f;
                if (i13 < i14) {
                    int i17 = i13;
                    while (true) {
                        int i18 = i17 + 1;
                        float exp = (float) Math.exp(fArr[i17] - f9);
                        fArr[i17] = exp;
                        f11 += exp;
                        if (i18 >= i14) {
                            break;
                        } else {
                            i17 = i18;
                        }
                    }
                }
                if (i13 < i14) {
                    while (true) {
                        int i19 = i13 + 1;
                        fArr[i13] = fArr[i13] / f11;
                        if (i19 >= i14) {
                            break;
                        } else {
                            i13 = i19;
                        }
                    }
                }
                if (i12 < i10) {
                    i9 = i12;
                } else {
                    return;
                }
            }
        } catch (Throwable th) {
            O2.a.a(h.class, th);
        }
    }

    public static final a W(a aVar) {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f1116a;
            int i9 = iArr[0];
            int i10 = iArr[1];
            a aVar2 = new a(new int[]{i10, i9});
            float[] fArr = aVar.f1117c;
            float[] fArr2 = aVar2.f1117c;
            if (i9 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            fArr2[(i13 * i9) + i11] = fArr[(i11 * i10) + i13];
                            if (i14 >= i10) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    if (i12 >= i9) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static final a X(a aVar) {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f1116a;
            int i9 = iArr[0];
            int i10 = iArr[1];
            int i11 = iArr[2];
            a aVar2 = new a(new int[]{i11, i10, i9});
            float[] fArr = aVar.f1117c;
            float[] fArr2 = aVar2.f1117c;
            if (i9 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i10 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            if (i11 > 0) {
                                int i16 = 0;
                                while (true) {
                                    int i17 = i16 + 1;
                                    fArr2[(i14 * i9) + (i16 * i9 * i10) + i12] = fArr[(i14 * i11) + (i12 * i10 * i11) + i16];
                                    if (i17 >= i11) {
                                        break;
                                    }
                                    i16 = i17;
                                }
                            }
                            if (i15 >= i10) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i9) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static final void a(a aVar, a aVar2) {
        if (O2.a.b(h.class)) {
            return;
        }
        try {
            j.e(aVar, "x");
            j.e(aVar2, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            int[] iArr = aVar.f1116a;
            int i9 = iArr[0];
            int i10 = iArr[1];
            int i11 = iArr[2];
            float[] fArr = aVar.f1117c;
            float[] fArr2 = aVar2.f1117c;
            if (i9 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i10 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            if (i11 > 0) {
                                int i16 = 0;
                                while (true) {
                                    int i17 = i16 + 1;
                                    int i18 = (i14 * i11) + (i12 * i10 * i11) + i16;
                                    fArr[i18] = fArr[i18] + fArr2[i16];
                                    if (i17 >= i11) {
                                        break;
                                    } else {
                                        i16 = i17;
                                    }
                                }
                            }
                            if (i15 >= i10) {
                                break;
                            } else {
                                i14 = i15;
                            }
                        }
                    }
                    if (i13 < i9) {
                        i12 = i13;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            O2.a.a(h.class, th);
        }
    }

    public static Object a0(p pVar, Object obj, w7.f fVar) {
        Object abstractC2954c;
        j.e(pVar, "<this>");
        k context = fVar.getContext();
        if (context == l.b) {
            abstractC2954c = new AbstractC2958g(fVar);
        } else {
            abstractC2954c = new AbstractC2954c(fVar, context);
        }
        v.b(2, pVar);
        return pVar.g(obj, abstractC2954c);
    }

    public static final f8.i b(d8.c cVar) {
        f8.i iVar;
        j.e(cVar, "<this>");
        if (cVar instanceof f8.i) {
            iVar = (f8.i) cVar;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + s.a(cVar.getClass()));
    }

    public static final o c(d8.d dVar) {
        o oVar;
        j.e(dVar, "<this>");
        if (dVar instanceof o) {
            oVar = (o) dVar;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + s.a(dVar.getClass()));
    }

    public static int f(int i9, int i10, int i11) {
        if (i9 < i10) {
            return i10;
        }
        if (i9 > i11) {
            return i11;
        }
        return i9;
    }

    public static final a g(a[] aVarArr) {
        int i9;
        if (O2.a.b(h.class)) {
            return null;
        }
        int i10 = 0;
        try {
            int i11 = aVarArr[0].f1116a[0];
            int length = aVarArr.length - 1;
            if (length >= 0) {
                int i12 = 0;
                i9 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    i9 += aVarArr[i12].f1116a[1];
                    if (i13 > length) {
                        break;
                    }
                    i12 = i13;
                }
            } else {
                i9 = 0;
            }
            a aVar = new a(new int[]{i11, i9});
            float[] fArr = aVar.f1117c;
            if (i11 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    int i16 = i14 * i9;
                    int length2 = aVarArr.length - 1;
                    if (length2 >= 0) {
                        int i17 = i10;
                        while (true) {
                            int i18 = i17 + 1;
                            a aVar2 = aVarArr[i17];
                            float[] fArr2 = aVar2.f1117c;
                            int i19 = aVar2.f1116a[1];
                            System.arraycopy(fArr2, i14 * i19, fArr, i16, i19);
                            i16 += i19;
                            if (i18 > length2) {
                                break;
                            }
                            i17 = i18;
                        }
                    }
                    if (i15 >= i11) {
                        break;
                    }
                    i14 = i15;
                    i10 = 0;
                }
            }
            return aVar;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static final a h(a aVar, a aVar2) {
        Class<h> cls;
        a aVar3;
        Class<h> cls2 = h.class;
        if (O2.a.b(cls2)) {
            return null;
        }
        try {
            j.e(aVar, "x");
            j.e(aVar2, "w");
            int[] iArr = aVar.f1116a;
            int i9 = 0;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int[] iArr2 = aVar2.f1116a;
            int i13 = iArr2[0];
            int i14 = (i11 - i13) + 1;
            int i15 = iArr2[2];
            a aVar4 = new a(new int[]{i10, i14, i15});
            float[] fArr = aVar.f1117c;
            float[] fArr2 = aVar4.f1117c;
            float[] fArr3 = aVar2.f1117c;
            if (i10 > 0) {
                int i16 = 0;
                while (true) {
                    int i17 = i16 + 1;
                    if (i15 > 0) {
                        int i18 = i9;
                        while (true) {
                            int i19 = i18 + 1;
                            if (i14 > 0) {
                                int i20 = 0;
                                while (true) {
                                    int i21 = i20 + 1;
                                    float f9 = 0.0f;
                                    if (i13 > 0) {
                                        int i22 = 0;
                                        while (true) {
                                            cls = cls2;
                                            int i23 = i22 + 1;
                                            if (i12 > 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    aVar3 = aVar4;
                                                    int i25 = i24 + 1;
                                                    try {
                                                        f9 = (fArr[((i22 + i20) * i12) + (i11 * i12 * i16) + i24] * fArr3[(((i22 * i12) + i24) * i15) + i18]) + f9;
                                                        if (i25 >= i12) {
                                                            break;
                                                        }
                                                        i24 = i25;
                                                        aVar4 = aVar3;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        O2.a.a(cls, th);
                                                        return null;
                                                    }
                                                }
                                            } else {
                                                aVar3 = aVar4;
                                            }
                                            if (i23 >= i13) {
                                                break;
                                            }
                                            i22 = i23;
                                            cls2 = cls;
                                            aVar4 = aVar3;
                                        }
                                    } else {
                                        cls = cls2;
                                        aVar3 = aVar4;
                                    }
                                    fArr2[(i20 * i15) + (i14 * i15 * i16) + i18] = f9;
                                    if (i21 >= i14) {
                                        break;
                                    }
                                    i20 = i21;
                                    cls2 = cls;
                                    aVar4 = aVar3;
                                }
                            } else {
                                cls = cls2;
                                aVar3 = aVar4;
                            }
                            if (i19 >= i15) {
                                break;
                            }
                            i18 = i19;
                            cls2 = cls;
                            aVar4 = aVar3;
                        }
                    } else {
                        cls = cls2;
                        aVar3 = aVar4;
                    }
                    if (i17 < i10) {
                        i16 = i17;
                        cls2 = cls;
                        aVar4 = aVar3;
                        i9 = 0;
                    } else {
                        return aVar3;
                    }
                }
            } else {
                return aVar4;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static w7.f i(p pVar, Object obj, w7.f fVar) {
        j.e(pVar, "<this>");
        j.e(fVar, "completion");
        if (pVar instanceof AbstractC2952a) {
            return ((AbstractC2952a) pVar).c(obj, fVar);
        }
        k context = fVar.getContext();
        if (context == l.b) {
            return new C2929b(pVar, obj, fVar);
        }
        return new C2930c(fVar, context, pVar, obj);
    }

    public static final a j(a aVar, a aVar2, a aVar3) {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            j.e(aVar, "x");
            j.e(aVar2, "w");
            j.e(aVar3, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            int i9 = aVar.f1116a[0];
            int i10 = aVar3.f1116a[0];
            a D8 = D(aVar, aVar2);
            float[] fArr = aVar3.f1117c;
            float[] fArr2 = D8.f1117c;
            if (i9 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            int i15 = (i11 * i10) + i13;
                            fArr2[i15] = fArr2[i15] + fArr[i13];
                            if (i14 >= i10) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    if (i12 >= i9) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return D8;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static final a k(String[] strArr, a aVar) {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            j.e(aVar, "w");
            int length = strArr.length;
            int i9 = aVar.f1116a[1];
            a aVar2 = new a(new int[]{length, 128, i9});
            float[] fArr = aVar2.f1117c;
            float[] fArr2 = aVar.f1117c;
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    int[] d2 = i.f1144a.d(strArr[i10]);
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        System.arraycopy(fArr2, d2[i12] * i9, fArr, (i12 * i9) + (i9 * 128 * i10), i9);
                        if (i13 >= 128) {
                            break;
                        }
                        i12 = i13;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static final void l(a aVar) {
        int i9;
        if (O2.a.b(h.class)) {
            return;
        }
        try {
            j.e(aVar, "x");
            int[] iArr = aVar.f1116a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            if (1 < length) {
                int i10 = 1;
                i9 = 1;
                while (true) {
                    int i11 = i10 + 1;
                    i9 *= aVar.f1116a[i10];
                    if (i11 >= length) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            } else {
                i9 = 1;
            }
            int[] iArr2 = {aVar.f1116a[0], i9};
            aVar.f1116a = iArr2;
            int a6 = i.a(iArr2);
            float[] fArr = new float[a6];
            System.arraycopy(aVar.f1117c, 0, fArr, 0, Math.min(aVar.b, a6));
            aVar.f1117c = fArr;
            aVar.b = a6;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
        }
    }

    public static C2487e m(f.l lVar, d0 d0Var) {
        s6.b bVar = (s6.b) ((InterfaceC2483a) com.facebook.appevents.g.l(lVar, InterfaceC2483a.class));
        bVar.getClass();
        Boolean bool = Boolean.TRUE;
        C2682b c2682b = new C2682b(J.b(4, new Object[]{"z6.i", bool, "I6.i", bool, "N6.j", bool, "W6.f", bool}, null));
        k8.c cVar = new k8.c(bVar.f22974a, bVar.b);
        d0Var.getClass();
        return new C2487e(c2682b, d0Var, cVar);
    }

    public static ColorStateList n(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && G.a.s(drawable)) {
            return G.a.b(G.a.d(drawable));
        }
        return null;
    }

    public static void w(View view, final Activity activity, final EditText editText) {
        j.e(editText, "editText");
        if (view instanceof ImageView) {
            return;
        }
        if (!(view instanceof EditText) && view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: a7.c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    EditText editText2 = editText;
                    j.e(editText2, "$editText");
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        Object systemService = activity2.getSystemService("input_method");
                        j.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        View currentFocus = activity2.getCurrentFocus();
                        if (currentFocus != null) {
                            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                        }
                        editText2.clearFocus();
                    }
                    return false;
                }
            });
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                w(viewGroup.getChildAt(i9), activity, editText);
            }
        }
    }

    public static w7.f x(w7.f fVar) {
        AbstractC2954c abstractC2954c;
        w7.f fVar2;
        j.e(fVar, "<this>");
        if (fVar instanceof AbstractC2954c) {
            abstractC2954c = (AbstractC2954c) fVar;
        } else {
            abstractC2954c = null;
        }
        if (abstractC2954c != null) {
            w7.f fVar3 = abstractC2954c.f24447d;
            if (fVar3 == null) {
                w7.h hVar = (w7.h) abstractC2954c.getContext().h(w7.g.b);
                if (hVar != null) {
                    fVar2 = new V7.h((AbstractC0251t) hVar, abstractC2954c);
                } else {
                    fVar2 = abstractC2954c;
                }
                abstractC2954c.f24447d = fVar2;
                return fVar2;
            }
            return fVar3;
        }
        return fVar;
    }

    public abstract boolean A(float f9, float f10);

    public abstract boolean S(View view, float f9);

    public abstract void Y(ViewGroup.MarginLayoutParams marginLayoutParams, int i9);

    public abstract void Z(ViewGroup.MarginLayoutParams marginLayoutParams, int i9, int i10);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i9);

    public abstract int o(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract int t(View view);

    public abstract int u(CoordinatorLayout coordinatorLayout);

    public abstract int v();

    public abstract boolean y(float f9);

    public abstract boolean z(View view);

    public void E() {
    }

    public void F() {
    }

    public void I() {
    }

    public void L() {
    }

    public void N() {
    }

    public void G(LoadAdError loadAdError) {
    }

    public void H(AdError adError) {
    }

    public void J(C2492a c2492a) {
    }

    public void K(InterstitialAd interstitialAd) {
    }

    public void M(C2493b c2493b) {
    }

    public void O(NativeAd nativeAd) {
    }
}
