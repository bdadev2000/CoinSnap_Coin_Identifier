package v8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.i3;
import androidx.core.view.ViewCompat;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.collect.z1;
import com.mbridge.msdk.MBridgeConstans;
import com.plantcare.ai.identifier.plantid.R;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class u0 {
    public static Constructor a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f26296b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f26297c;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f26298d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f26299e;

    /* renamed from: f, reason: collision with root package name */
    public static e3.b f26300f;

    /* renamed from: g, reason: collision with root package name */
    public static e3.b f26301g;

    /* renamed from: h, reason: collision with root package name */
    public static e3.b f26302h;

    /* renamed from: i, reason: collision with root package name */
    public static e3.b f26303i;

    /* renamed from: j, reason: collision with root package name */
    public static hf.c f26304j;

    /* renamed from: k, reason: collision with root package name */
    public static e3.a f26305k;

    /* renamed from: l, reason: collision with root package name */
    public static Handler f26306l;

    /* renamed from: m, reason: collision with root package name */
    public static fe.j f26307m;

    /* renamed from: n, reason: collision with root package name */
    public static final i7.m f26308n = new i7.m(4);

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f26309o = {48, 49, 53, 0};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f26310p = {48, 49, 48, 0};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f26311q = {48, 48, 57, 0};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f26312r = {48, 48, 53, 0};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f26313s = {48, 48, 49, 0};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f26314t = {48, 48, 49, 0};
    public static final byte[] u = {48, 48, 50, 0};

    public static ColorStateList A(Context context, i3 i3Var, int i10) {
        int i11;
        ColorStateList colorStateList;
        if (i3Var.l(i10) && (i11 = i3Var.i(i10, 0)) != 0 && (colorStateList = d0.h.getColorStateList(context, i11)) != null) {
            return colorStateList;
        }
        return i3Var.b(i10);
    }

    public static Drawable B(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable t5;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (t5 = com.bumptech.glide.c.t(context, resourceId)) != null) {
            return t5;
        }
        return typedArray.getDrawable(i10);
    }

    public static ka.f C(Class cls, String str) {
        try {
            return new ka.f(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    public static float D(int i10, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static int[] E(String str) {
        boolean z10;
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ba, code lost:
    
        if (r0.equals("video/mp2t") == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int F(java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.u0.F(java.util.Map):int");
    }

    public static int G(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (!lastPathSegment.endsWith(".avi")) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static boolean H(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.areEqual(method, "POST") && !Intrinsics.areEqual(method, "PATCH") && !Intrinsics.areEqual(method, "PUT") && !Intrinsics.areEqual(method, "DELETE") && !Intrinsics.areEqual(method, "MOVE")) {
            return false;
        }
        return true;
    }

    public static boolean I(int i10) {
        boolean z10;
        double pow;
        double pow2;
        double pow3;
        if (i10 != 0) {
            ThreadLocal threadLocal = g0.d.a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d10 = red / 255.0d;
                if (d10 < 0.04045d) {
                    pow = d10 / 12.92d;
                } else {
                    pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = green / 255.0d;
                if (d11 < 0.04045d) {
                    pow2 = d11 / 12.92d;
                } else {
                    pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                double d12 = blue / 255.0d;
                if (d12 < 0.04045d) {
                    pow3 = d12 / 12.92d;
                } else {
                    pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                }
                z10 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d13;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d13 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    public static boolean J(XmlPullParser xmlPullParser, String str) {
        boolean z10;
        if (xmlPullParser.getEventType() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean L(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static boolean M(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean N(XmlPullParser xmlPullParser, String str) {
        return M(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static int O(float f10, int i10, int i11) {
        return g0.d.b(g0.d.c(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static String P(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb2;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = AbstractJsonLexerKt.NULL;
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb4);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(name2.length() + String.valueOf(sb4).length() + 9);
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i11] = sb2;
        }
        StringBuilder sb6 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = str.indexOf("%s", i12)) != -1) {
            sb6.append((CharSequence) str, i12, indexOf);
            sb6.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb6.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb6.append(" [");
            sb6.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb6.append(", ");
                sb6.append(objArr[i13]);
            }
            sb6.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb6.toString();
    }

    public static void Q(FrameLayout frAds, h.m activity, String id2, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(frAds, "frAds");
        if (com.facebook.internal.i.A(activity) && z10) {
            d3.g r6 = d3.g.r();
            int i10 = 0;
            hf.a aVar = new hf.a(frAds, i10);
            r6.getClass();
            c3.j b3 = c3.j.b();
            b3.getClass();
            FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.banner_container);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) activity.findViewById(R.id.shimmer_container_banner);
            Boolean bool = Boolean.FALSE;
            if (g3.c.a().f18018m) {
                shimmerFrameLayout.setVisibility(8);
                return;
            }
            shimmerFrameLayout.setVisibility(0);
            com.facebook.shimmer.e eVar = shimmerFrameLayout.f11367c;
            ValueAnimator valueAnimator = eVar.f11393e;
            if (valueAnimator != null) {
                if (valueAnimator.isStarted()) {
                    i10 = 1;
                }
                if (i10 == 0 && eVar.getCallback() != null) {
                    eVar.f11393e.start();
                }
            }
            try {
                AdView adView = new AdView(activity);
                adView.setAdUnitId(id2);
                frameLayout.addView(adView);
                AdSize a10 = c3.j.a(activity, bool, "BANNER_INLINE_LARGE_STYLE");
                shimmerFrameLayout.getLayoutParams().height = (int) ((a10.getHeight() * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
                adView.setAdSize(a10);
                adView.setLayerType(1, null);
                adView.setAdListener(new c3.e(b3, shimmerFrameLayout, frameLayout, aVar, adView, id2, 0));
                adView.loadAd(new AdRequest.Builder().build());
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        com.bumptech.glide.e.D(frAds);
    }

    public static void R(FrameLayout frAds, h.m activity, String id2, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(frAds, "frAds");
        if (com.facebook.internal.i.A(activity) && z10 && !g3.c.a().f18018m) {
            d3.g r6 = d3.g.r();
            int i10 = 0;
            hf.b bVar = new hf.b(i10);
            r6.getClass();
            c3.j b3 = c3.j.b();
            b3.getClass();
            FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.banner_container);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) activity.findViewById(R.id.shimmer_container_banner);
            if (g3.c.a().f18018m) {
                shimmerFrameLayout.setVisibility(8);
                return;
            }
            shimmerFrameLayout.setVisibility(0);
            com.facebook.shimmer.e eVar = shimmerFrameLayout.f11367c;
            ValueAnimator valueAnimator = eVar.f11393e;
            if (valueAnimator != null) {
                if (valueAnimator.isStarted()) {
                    i10 = 1;
                }
                if (i10 == 0 && eVar.getCallback() != null) {
                    eVar.f11393e.start();
                }
            }
            try {
                AdView adView = new AdView(activity);
                adView.setAdUnitId(id2);
                frameLayout.addView(adView);
                AdSize a10 = c3.j.a(activity, Boolean.FALSE, "");
                shimmerFrameLayout.getLayoutParams().height = (int) ((a10.getHeight() * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
                adView.setAdSize(a10);
                adView.setLayerType(1, null);
                AdRequest.Builder builder = new AdRequest.Builder();
                Bundle bundle = new Bundle();
                bundle.putString("collapsible", "bottom");
                bundle.putString("collapsible_request_id", UUID.randomUUID().toString());
                builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
                adView.loadAd(builder.build());
                adView.setAdListener(new c3.e(b3, shimmerFrameLayout, frameLayout, bVar, adView, id2, 1));
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        com.bumptech.glide.e.D(frAds);
        com.bumptech.glide.e.D(frAds);
    }

    public static Typeface S(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 31 && com.google.android.gms.internal.ads.b.c(configuration) != Integer.MAX_VALUE && com.google.android.gms.internal.ads.b.c(configuration) != 0 && typeface != null) {
            return androidx.appcompat.widget.b1.m(typeface, com.bumptech.glide.e.o(com.google.android.gms.internal.ads.b.c(configuration) + com.bytedance.sdk.component.adexpress.vc.a.a(typeface), 1, 1000), typeface.isItalic());
        }
        return null;
    }

    public static void T(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static ArrayList U(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList V(Object... objArr) {
        int length = objArr.length;
        a6.k.j(length, "arraySize");
        ArrayList arrayList = new ArrayList(c6.c.z(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static PorterDuff.Mode W(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final boolean X(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.areEqual(method, "GET") && !Intrinsics.areEqual(method, "HEAD")) {
            return true;
        }
        return false;
    }

    public static void Y(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j3 = Math.max(j3, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j3);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static void Z() {
        if (a == null || f26296b == null || f26297c == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            a = cls.getConstructor(new Class[0]);
            f26296b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f26297c = cls.getMethod("build", new Class[0]);
        }
        if (f26298d == null || f26299e == null) {
            Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
            f26298d = cls2.getConstructor(new Class[0]);
            f26299e = cls2.getMethod("build", new Class[0]);
        }
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                h0.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                h0.a.h(drawable, colorStateList);
            }
            if (mode != null) {
                h0.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void a0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            h0.a.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return P("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return P("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(a4.j.c(26, "negative size: ", i11));
    }

    public static String b0(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i15 = i10;
        int i16 = i15;
        while (i15 <= i11) {
            if (i15 == i11) {
                i12 = i15;
            } else if (sb2.charAt(i15) == '/') {
                i12 = i15 + 1;
            } else {
                i15++;
            }
            int i17 = i16 + 1;
            if (i15 == i17 && sb2.charAt(i16) == '.') {
                sb2.delete(i16, i12);
                i11 -= i12 - i16;
            } else {
                if (i15 == i16 + 2 && sb2.charAt(i16) == '.' && sb2.charAt(i17) == '.') {
                    i13 = sb2.lastIndexOf("/", i16 - 2) + 1;
                    if (i13 > i10) {
                        i14 = i13;
                    } else {
                        i14 = i10;
                    }
                    sb2.delete(i14, i12);
                    i11 -= i12 - i14;
                } else {
                    i13 = i15 + 1;
                }
                i16 = i13;
            }
            i15 = i16;
        }
        return sb2.toString();
    }

    public static m9.p c(z8.m mVar, String str, z8.j jVar, int i10) {
        m9.o oVar = new m9.o();
        oVar.a = Uri.parse(e0(str, jVar.f28629c));
        oVar.f21700f = jVar.a;
        oVar.f21701g = jVar.f28628b;
        String a10 = mVar.a();
        if (a10 == null) {
            a10 = Uri.parse(e0(((z8.b) mVar.f28636c.get(0)).a, jVar.f28629c)).toString();
        }
        oVar.f21702h = a10;
        oVar.f21703i = i10;
        return oVar.a();
    }

    public static void c0(a9.a aVar) {
        aVar.f352k = -3.4028235E38f;
        aVar.f351j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.a;
            charSequence2.getClass();
            d0((Spannable) charSequence2, new l9.t(0));
        }
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void d0(Spannable spannable, l9.t tVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (tVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static void e(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static String e0(String str, String str2) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] E = E(str2);
        if (E[0] != -1) {
            sb2.append(str2);
            b0(sb2, E[1], E[2]);
            return sb2.toString();
        }
        int[] E2 = E(str);
        if (E[3] == 0) {
            sb2.append((CharSequence) str, 0, E2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (E[2] == 0) {
            sb2.append((CharSequence) str, 0, E2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i11 = E[1];
        if (i11 != 0) {
            int i12 = E2[0] + 1;
            sb2.append((CharSequence) str, 0, i12);
            sb2.append(str2);
            return b0(sb2, E[1] + i12, i12 + E[2]);
        }
        if (str2.charAt(i11) == '/') {
            sb2.append((CharSequence) str, 0, E2[1]);
            sb2.append(str2);
            int i13 = E2[1];
            return b0(sb2, i13, E[2] + i13);
        }
        int i14 = E2[0] + 2;
        int i15 = E2[1];
        if (i14 < i15 && i15 == E2[2]) {
            sb2.append((CharSequence) str, 0, i15);
            sb2.append('/');
            sb2.append(str2);
            int i16 = E2[1];
            return b0(sb2, i16, E[2] + i16 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, E2[2] - 1);
        if (lastIndexOf == -1) {
            i10 = E2[1];
        } else {
            i10 = lastIndexOf + 1;
        }
        sb2.append((CharSequence) str, 0, i10);
        sb2.append(str2);
        return b0(sb2, E2[1], i10 + E[2]);
    }

    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static float f0(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    public static void g(int i10, int i11) {
        String P;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 >= 0) {
                P = P("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            } else {
                throw new IllegalArgumentException(a4.j.c(26, "negative size: ", i11));
            }
        } else {
            P = P("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(P);
    }

    public static int g0(Context context, int i10, int i11) {
        TypedValue v10 = c6.k.v(context, i10);
        if (v10 != null && v10.type == 16) {
            return v10.data;
        }
        return i11;
    }

    public static void h(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(a4.j.c(20, "at index ", i11));
            }
        }
    }

    public static TimeInterpolator h0(Context context, int i10, Interpolator interpolator) {
        boolean z10;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!L(valueOf, "cubic-bezier") && !L(valueOf, MBridgeConstans.DYNAMIC_VIEW_WX_PATH)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (L(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return p0.a.b(D(0, split), D(1, split), D(2, split), D(3, split));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                }
                if (L(valueOf, MBridgeConstans.DYNAMIC_VIEW_WX_PATH)) {
                    return p0.a.c(com.bumptech.glide.e.t(valueOf.substring(5, valueOf.length() - 1)));
                }
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static void i(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void i0(String key, Object obj, SharedPreferences sharedPreferences) {
        boolean z10;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof String;
        }
        if (z10) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Intrinsics.checkNotNull(edit);
            Intrinsics.checkNotNullExpressionValue(edit.putString(key, (String) obj), "putString(...)");
            edit.apply();
            return;
        }
        if (obj instanceof Integer) {
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            Intrinsics.checkNotNull(edit2);
            Intrinsics.checkNotNullExpressionValue(edit2.putInt(key, ((Number) obj).intValue()), "putInt(...)");
            edit2.apply();
            return;
        }
        if (obj instanceof Boolean) {
            SharedPreferences.Editor edit3 = sharedPreferences.edit();
            Intrinsics.checkNotNull(edit3);
            Intrinsics.checkNotNullExpressionValue(edit3.putBoolean(key, ((Boolean) obj).booleanValue()), "putBoolean(...)");
            edit3.apply();
            return;
        }
        if (obj instanceof Float) {
            SharedPreferences.Editor edit4 = sharedPreferences.edit();
            Intrinsics.checkNotNull(edit4);
            Intrinsics.checkNotNullExpressionValue(edit4.putFloat(key, ((Number) obj).floatValue()), "putFloat(...)");
            edit4.apply();
            return;
        }
        if (obj instanceof Long) {
            SharedPreferences.Editor edit5 = sharedPreferences.edit();
            Intrinsics.checkNotNull(edit5);
            Intrinsics.checkNotNullExpressionValue(edit5.putLong(key, ((Number) obj).longValue()), "putLong(...)");
            edit5.apply();
            return;
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j0(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(eb.j.i("csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void k(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, "index"));
        }
    }

    public static void k0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z11 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (hasOnClickListeners || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i10);
    }

    public static void l(int i10, int i11, int i12) {
        String b3;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                b3 = P("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                b3 = b(i11, i12, "end index");
            }
        } else {
            b3 = b(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(b3);
    }

    public static void l0(View view, ka.i iVar) {
        boolean z10;
        ca.a aVar = iVar.f20557b.f20537c;
        if (aVar != null && aVar.a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f10 += ViewCompat.getElevation((View) parent);
            }
            ka.h hVar = iVar.f20557b;
            if (hVar.f20548n != f10) {
                hVar.f20548n = f10;
                iVar.n();
            }
        }
    }

    public static void m(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static String m0(int i10) {
        return n9.h0.k("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }

    public static void n(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static void o(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void p(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void q(m9.v0 v0Var) {
        if (v0Var != null) {
            try {
                v0Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ImageView.ScaleType r(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static p6.a s(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new ka.k();
            }
            return new ka.d();
        }
        return new ka.k();
    }

    public static boolean t(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object u(Serializable serializable, Serializable serializable2) {
        if (serializable != null) {
            return serializable;
        }
        if (serializable2 != null) {
            return serializable2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static z1 v(s7.h hVar, ArrayList arrayList) {
        com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
        com.google.common.collect.m0 m0Var = new com.google.common.collect.m0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            m0Var.u(hVar.g(bundle));
        }
        return m0Var.y();
    }

    public static String w(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static int x(int i10, View view) {
        Context context = view.getContext();
        TypedValue y4 = c6.k.y(view.getContext(), i10, view.getClass().getCanonicalName());
        int i11 = y4.resourceId;
        if (i11 != 0) {
            return d0.h.getColor(context, i11);
        }
        return y4.data;
    }

    public static int y(Context context, int i10, int i11) {
        Integer num;
        int i12;
        TypedValue v10 = c6.k.v(context, i10);
        if (v10 != null) {
            int i13 = v10.resourceId;
            if (i13 != 0) {
                i12 = d0.h.getColor(context, i13);
            } else {
                i12 = v10.data;
            }
            num = Integer.valueOf(i12);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i11;
    }

    public static ColorStateList z(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (colorStateList = d0.h.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i10);
    }
}
