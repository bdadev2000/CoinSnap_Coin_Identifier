package d6;

import a4.s;
import android.R;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.x;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.s0;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAdRevenue;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.applovin.sdk.AppLovinEventParameters;
import com.bumptech.glide.k;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import eb.j;
import h.q0;
import i7.m;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import k4.e0;
import k4.i;
import k4.n;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import n0.l1;
import n4.a0;
import n4.f0;
import n4.l;
import t0.o;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: i, reason: collision with root package name */
    public static long f16892i;

    /* renamed from: j, reason: collision with root package name */
    public static Method f16893j;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16885b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16886c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f16887d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16888e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f16889f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final k0.b f16890g = new k0.b(0);

    /* renamed from: h, reason: collision with root package name */
    public static final m f16891h = new m(1);

    /* renamed from: k, reason: collision with root package name */
    public static final q0 f16894k = new q0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q0 f16895l = new q0(2);

    public static byte[] A(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new IllegalStateException(j.i("Not enough bytes to read: ", i10));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.finished() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] B(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L88
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L88
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L88
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L88
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L55:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.g.B(java.io.FileInputStream, int, int):byte[]");
    }

    public static long C(InputStream inputStream, int i10) {
        byte[] A = A(inputStream, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 += (A[i11] & UByte.MAX_VALUE) << (i11 * 8);
        }
        return j3;
    }

    public static int D(InputStream inputStream) {
        return (int) C(inputStream, 2);
    }

    public static final void E(a x10) {
        if (m6.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            float[] fArr = x10.f16858c;
            int length = fArr.length - 1;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (fArr[i10] < 0.0f) {
                        fArr[i10] = 0.0f;
                    }
                    if (i11 <= length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
        }
    }

    public static void F(TextView textView, int i10) {
        int i11;
        com.bumptech.glide.e.j(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            o.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void G(TextView textView, int i10) {
        int i11;
        com.bumptech.glide.e.j(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static final void H(a x10) {
        if (m6.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.a;
            int i10 = 0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            float[] fArr = x10.f16858c;
            if (i11 <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                int i14 = i10 * i12;
                int i15 = i14 + i12;
                float f10 = Float.MIN_VALUE;
                if (i14 < i15) {
                    int i16 = i14;
                    while (true) {
                        int i17 = i16 + 1;
                        float f11 = fArr[i16];
                        if (f11 > f10) {
                            f10 = f11;
                        }
                        if (i17 >= i15) {
                            break;
                        } else {
                            i16 = i17;
                        }
                    }
                }
                float f12 = 0.0f;
                if (i14 < i15) {
                    int i18 = i14;
                    while (true) {
                        int i19 = i18 + 1;
                        float exp = (float) Math.exp(fArr[i18] - f10);
                        fArr[i18] = exp;
                        f12 += exp;
                        if (i19 >= i15) {
                            break;
                        } else {
                            i18 = i19;
                        }
                    }
                }
                if (i14 < i15) {
                    while (true) {
                        int i20 = i14 + 1;
                        fArr[i14] = fArr[i14] / f12;
                        if (i20 >= i15) {
                            break;
                        } else {
                            i14 = i20;
                        }
                    }
                }
                if (i13 < i11) {
                    i10 = i13;
                } else {
                    return;
                }
            }
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
        }
    }

    public static final a I(a x10) {
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            a aVar = new a(new int[]{i11, i10});
            float[] fArr = x10.f16858c;
            float[] fArr2 = aVar.f16858c;
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            fArr2[(i14 * i10) + i12] = fArr[(i12 * i11) + i14];
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final a J(a x10) {
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            a aVar = new a(new int[]{i12, i11, i10});
            float[] fArr = x10.f16858c;
            float[] fArr2 = aVar.f16858c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i11 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    fArr2[(i15 * i10) + (i17 * i10 * i11) + i13] = fArr[(i15 * i12) + (i13 * i11 * i12) + i17];
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    i17 = i18;
                                }
                            }
                            if (i16 >= i11) {
                                break;
                            }
                            i15 = i16;
                        }
                    }
                    if (i14 >= i10) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static void K(final p pVar, final y1.d dVar) {
        androidx.lifecycle.o oVar = ((x) pVar).f1835d;
        if (oVar != androidx.lifecycle.o.INITIALIZED && !oVar.a(androidx.lifecycle.o.STARTED)) {
            pVar.a(new t() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.t
                public final void a(v source, n event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == n.ON_START) {
                        p.this.b(this);
                        dVar.d();
                    }
                }
            });
        } else {
            dVar.d();
        }
    }

    public static ActionMode.Callback L(ActionMode.Callback callback) {
        if ((callback instanceof t0.p) && Build.VERSION.SDK_INT >= 26) {
            return ((t0.p) callback).a;
        }
        return callback;
    }

    public static ActionMode.Callback M(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof t0.p) && callback != null) {
            return new t0.p(callback, textView);
        }
        return callback;
    }

    public static void N(ByteArrayOutputStream byteArrayOutputStream, long j3, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j3 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void O(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        N(byteArrayOutputStream, i10, 2);
    }

    public static float a(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void c(a x10, a b3) {
        if (m6.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(b3, "b");
            int[] iArr = x10.a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            float[] fArr = x10.f16858c;
            float[] fArr2 = b3.f16858c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i11 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    int i19 = (i15 * i12) + (i13 * i11 * i12) + i17;
                                    fArr[i19] = fArr[i19] + fArr2[i17];
                                    if (i18 >= i12) {
                                        break;
                                    } else {
                                        i17 = i18;
                                    }
                                }
                            }
                            if (i16 >= i11) {
                                break;
                            } else {
                                i15 = i16;
                            }
                        }
                    }
                    if (i14 < i10) {
                        i13 = i14;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
        }
    }

    public static final void d(x0 viewModel, y1.d registry, p lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f1782d) {
            savedStateHandleController.c(lifecycle, registry);
            K(lifecycle, registry);
        }
    }

    public static String e(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b3 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b3)));
        }
        return sb2.toString();
    }

    public static byte[] f(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static final a g(a[] tensors) {
        int i10;
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int i11 = 0;
            int i12 = tensors[0].a[0];
            int length = tensors.length - 1;
            if (length >= 0) {
                int i13 = 0;
                i10 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    i10 += tensors[i13].a[1];
                    if (i14 > length) {
                        break;
                    }
                    i13 = i14;
                }
            } else {
                i10 = 0;
            }
            a aVar = new a(new int[]{i12, i10});
            float[] fArr = aVar.f16858c;
            if (i12 > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    int i17 = i15 * i10;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i18 = i11;
                        while (true) {
                            int i19 = i18 + 1;
                            a aVar2 = tensors[i18];
                            float[] fArr2 = aVar2.f16858c;
                            int i20 = aVar2.a[1];
                            System.arraycopy(fArr2, i15 * i20, fArr, i17, i20);
                            i17 += i20;
                            if (i19 > length2) {
                                break;
                            }
                            i18 = i19;
                        }
                    }
                    if (i16 >= i12) {
                        break;
                    }
                    i15 = i16;
                    i11 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final a h(a x10, a w10) {
        Class<g> cls;
        Class<g> cls2;
        a aVar;
        Class<g> cls3 = g.class;
        if (m6.a.b(cls3)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            try {
                int[] iArr = x10.a;
                int i10 = 0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int[] iArr2 = w10.a;
                int i14 = iArr2[0];
                int i15 = (i12 - i14) + 1;
                int i16 = iArr2[2];
                a aVar2 = new a(new int[]{i11, i15, i16});
                float[] fArr = x10.f16858c;
                float[] fArr2 = aVar2.f16858c;
                float[] fArr3 = w10.f16858c;
                if (i11 > 0) {
                    int i17 = 0;
                    while (true) {
                        int i18 = i17 + 1;
                        if (i16 > 0) {
                            int i19 = i10;
                            while (true) {
                                int i20 = i19 + 1;
                                if (i15 > 0) {
                                    int i21 = 0;
                                    while (true) {
                                        int i22 = i21 + 1;
                                        float f10 = 0.0f;
                                        if (i14 > 0) {
                                            int i23 = 0;
                                            while (true) {
                                                cls2 = cls3;
                                                int i24 = i23 + 1;
                                                if (i13 > 0) {
                                                    int i25 = 0;
                                                    while (true) {
                                                        aVar = aVar2;
                                                        int i26 = i25 + 1;
                                                        try {
                                                            f10 = (fArr[((i23 + i21) * i13) + (i12 * i13 * i17) + i25] * fArr3[(((i23 * i13) + i25) * i16) + i19]) + f10;
                                                            if (i26 >= i13) {
                                                                break;
                                                            }
                                                            i25 = i26;
                                                            aVar2 = aVar;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            cls = cls2;
                                                            m6.a.a(cls, th);
                                                            return null;
                                                        }
                                                    }
                                                } else {
                                                    aVar = aVar2;
                                                }
                                                if (i24 >= i14) {
                                                    break;
                                                }
                                                i23 = i24;
                                                cls3 = cls2;
                                                aVar2 = aVar;
                                            }
                                        } else {
                                            cls2 = cls3;
                                            aVar = aVar2;
                                        }
                                        fArr2[(i21 * i16) + (i15 * i16 * i17) + i19] = f10;
                                        if (i22 >= i15) {
                                            break;
                                        }
                                        i21 = i22;
                                        cls3 = cls2;
                                        aVar2 = aVar;
                                    }
                                } else {
                                    cls2 = cls3;
                                    aVar = aVar2;
                                }
                                if (i20 >= i16) {
                                    break;
                                }
                                i19 = i20;
                                cls3 = cls2;
                                aVar2 = aVar;
                            }
                        } else {
                            cls2 = cls3;
                            aVar = aVar2;
                        }
                        if (i18 < i11) {
                            i17 = i18;
                            cls3 = cls2;
                            aVar2 = aVar;
                            i10 = 0;
                        } else {
                            return aVar;
                        }
                    }
                } else {
                    return aVar2;
                }
            } catch (Throwable th3) {
                th = th3;
                cls2 = cls3;
            }
        } catch (Throwable th4) {
            th = th4;
            cls = cls3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static final SavedStateHandleController j(y1.d registry, p lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        Bundle a10 = registry.a(str);
        Class[] clsArr = androidx.lifecycle.q0.f1813f;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, ac.e.b(a10, bundle));
        savedStateHandleController.c(lifecycle, registry);
        K(lifecycle, registry);
        return savedStateHandleController;
    }

    public static k k(com.bumptech.glide.b bVar, List list) {
        e4.o fVar;
        e4.o aVar;
        int i10;
        Resources resources;
        String str;
        h4.d dVar = bVar.f9606b;
        com.bumptech.glide.g gVar = bVar.f9608d;
        Context applicationContext = gVar.getApplicationContext();
        kc.c cVar = gVar.f9670h;
        k kVar = new k();
        l lVar = new l();
        s sVar = kVar.f9683g;
        synchronized (sVar) {
            sVar.a.add(lVar);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            n4.s sVar2 = new n4.s();
            s sVar3 = kVar.f9683g;
            synchronized (sVar3) {
                sVar3.a.add(sVar2);
            }
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList d10 = kVar.d();
        h4.h hVar = bVar.f9609f;
        p4.a aVar2 = new p4.a(applicationContext, d10, dVar, hVar);
        f0 f0Var = new f0(dVar, new com.facebook.b(21));
        n4.p pVar = new n4.p(kVar.d(), resources2.getDisplayMetrics(), dVar, hVar);
        int i12 = 28;
        int i13 = 2;
        int i14 = 0;
        if (i11 >= 28 && ((Map) cVar.f20640c).containsKey(com.bumptech.glide.c.class)) {
            aVar = new n4.g(1);
            fVar = new n4.g(0);
        } else {
            fVar = new n4.f(pVar, i14);
            aVar = new n4.a(i13, pVar, hVar);
        }
        if (i11 >= 28) {
            i10 = i11;
            resources = resources2;
            kVar.a(new o4.a(new d3.g(i12, d10, hVar), 1), InputStream.class, Drawable.class, "Animation");
            kVar.a(new o4.a(new d3.g(28, d10, hVar), 0), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            i10 = i11;
            resources = resources2;
        }
        o4.d dVar2 = new o4.d(applicationContext);
        n4.b bVar2 = new n4.b(hVar);
        s0 s0Var = new s0(2);
        z1.d dVar3 = new z1.d(22);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        com.facebook.b bVar3 = new com.facebook.b(14);
        com.facebook.f0 f0Var2 = kVar.f9678b;
        synchronized (f0Var2) {
            f0Var2.a.add(new r4.a(ByteBuffer.class, bVar3));
        }
        f.a aVar3 = new f.a(hVar, 21);
        com.facebook.f0 f0Var3 = kVar.f9678b;
        synchronized (f0Var3) {
            f0Var3.a.add(new r4.a(InputStream.class, aVar3));
        }
        kVar.a(fVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        kVar.a(aVar, InputStream.class, Bitmap.class, "Bitmap");
        String str2 = Build.FINGERPRINT;
        if (!"robolectric".equals(str2)) {
            str = "Animation";
            kVar.a(new n4.f(pVar, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        } else {
            str = "Animation";
        }
        kVar.a(f0Var, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        kVar.a(new f0(dVar, new z1.d((vd.e) null)), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        ni.a aVar4 = ni.a.f22776c;
        kVar.c(Bitmap.class, Bitmap.class, aVar4);
        kVar.a(new a0(0), Bitmap.class, Bitmap.class, "Bitmap");
        kVar.b(Bitmap.class, bVar2);
        Resources resources3 = resources;
        kVar.a(new n4.a(resources3, fVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.a(new n4.a(resources3, aVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.a(new n4.a(resources3, f0Var), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.b(BitmapDrawable.class, new d3.g(26, dVar, bVar2));
        p4.j jVar = new p4.j(d10, aVar2, hVar);
        String str3 = str;
        kVar.a(jVar, InputStream.class, p4.c.class, str3);
        kVar.a(aVar2, ByteBuffer.class, p4.c.class, str3);
        kVar.b(p4.c.class, new com.facebook.b(22));
        kVar.c(d4.a.class, d4.a.class, aVar4);
        kVar.a(new n4.c(dVar), d4.a.class, Bitmap.class, "Bitmap");
        kVar.a(dVar2, Uri.class, Drawable.class, "legacy_append");
        kVar.a(new n4.a(1, dVar2, dVar), Uri.class, Bitmap.class, "legacy_append");
        kVar.g(new com.bumptech.glide.load.data.h(2));
        kVar.c(File.class, ByteBuffer.class, new z1.d(14));
        kVar.c(File.class, InputStream.class, new n(1));
        kVar.a(new a0(2), File.class, File.class, "legacy_append");
        kVar.c(File.class, ParcelFileDescriptor.class, new n(0));
        kVar.c(File.class, File.class, aVar4);
        kVar.g(new com.bumptech.glide.load.data.m(hVar));
        int i15 = 1;
        if (!"robolectric".equals(str2)) {
            kVar.g(new com.bumptech.glide.load.data.h(i15));
        }
        k4.j jVar2 = new k4.j(applicationContext, 0);
        i iVar = new i(applicationContext, 0);
        androidx.emoji2.text.p pVar2 = new androidx.emoji2.text.p(applicationContext, 1);
        Class cls = Integer.TYPE;
        kVar.c(cls, InputStream.class, jVar2);
        kVar.c(Integer.class, InputStream.class, jVar2);
        kVar.c(cls, AssetFileDescriptor.class, iVar);
        kVar.c(Integer.class, AssetFileDescriptor.class, iVar);
        kVar.c(cls, Drawable.class, pVar2);
        kVar.c(Integer.class, Drawable.class, pVar2);
        kVar.c(Uri.class, InputStream.class, new k4.j(applicationContext, 1));
        kVar.c(Uri.class, AssetFileDescriptor.class, new androidx.emoji2.text.p(applicationContext, 2));
        v3.c cVar2 = new v3.c(resources3, 19);
        kc.c cVar3 = new kc.c(resources3, 21);
        e0 e0Var = new e0(0, resources3);
        kVar.c(Integer.class, Uri.class, cVar2);
        kVar.c(cls, Uri.class, cVar2);
        kVar.c(Integer.class, AssetFileDescriptor.class, cVar3);
        kVar.c(cls, AssetFileDescriptor.class, cVar3);
        kVar.c(Integer.class, InputStream.class, e0Var);
        kVar.c(cls, InputStream.class, e0Var);
        int i16 = 20;
        kVar.c(String.class, InputStream.class, new f.a(20));
        kVar.c(Uri.class, InputStream.class, new f.a(20));
        int i17 = 17;
        kVar.c(String.class, InputStream.class, new z1.d(i17));
        kVar.c(String.class, ParcelFileDescriptor.class, new com.facebook.b(i17));
        kVar.c(String.class, AssetFileDescriptor.class, new z1.d(16));
        int i18 = 19;
        kVar.c(Uri.class, InputStream.class, new f.a(applicationContext.getAssets(), i18));
        kVar.c(Uri.class, AssetFileDescriptor.class, new kc.c(applicationContext.getAssets(), i18));
        kVar.c(Uri.class, InputStream.class, new i(applicationContext, 1));
        kVar.c(Uri.class, InputStream.class, new androidx.emoji2.text.p(applicationContext, 3));
        if (i10 >= 29) {
            kVar.c(Uri.class, InputStream.class, new l4.b(applicationContext, 1));
            kVar.c(Uri.class, ParcelFileDescriptor.class, new l4.b(applicationContext, 0));
        }
        kVar.c(Uri.class, InputStream.class, new kc.c(contentResolver, 22));
        kVar.c(Uri.class, ParcelFileDescriptor.class, new fb.c(contentResolver, i17));
        kVar.c(Uri.class, AssetFileDescriptor.class, new v3.c(contentResolver, i16));
        int i19 = 18;
        kVar.c(Uri.class, InputStream.class, new com.facebook.b(i19));
        kVar.c(URL.class, InputStream.class, new z1.d(i19));
        kVar.c(Uri.class, File.class, new j.a(applicationContext));
        kVar.c(k4.p.class, InputStream.class, new f.a(22));
        int i20 = 13;
        kVar.c(byte[].class, ByteBuffer.class, new com.facebook.b(i20));
        kVar.c(byte[].class, InputStream.class, new z1.d(i20));
        kVar.c(Uri.class, Uri.class, aVar4);
        kVar.c(Drawable.class, Drawable.class, aVar4);
        int i21 = 1;
        kVar.a(new a0(i21), Drawable.class, Drawable.class, "legacy_append");
        kVar.h(Bitmap.class, BitmapDrawable.class, new e0(i21, resources3));
        kVar.h(Bitmap.class, byte[].class, s0Var);
        kVar.h(Drawable.class, byte[].class, new h.c(dVar, s0Var, dVar3, i17));
        kVar.h(p4.c.class, byte[].class, dVar3);
        f0 f0Var4 = new f0(dVar, new com.facebook.b(i16));
        kVar.a(f0Var4, ByteBuffer.class, Bitmap.class, "legacy_append");
        kVar.a(new n4.a(resources3, f0Var4), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return kVar;
        }
        a4.j.t(it.next());
        throw null;
    }

    public static final a l(a x10, a w10, a b3) {
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            Intrinsics.checkNotNullParameter(b3, "b");
            int i10 = x10.a[0];
            int i11 = b3.a[0];
            a y4 = y(x10, w10);
            float[] fArr = b3.f16858c;
            float[] fArr2 = y4.f16858c;
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            int i16 = (i12 * i11) + i14;
                            fArr2[i16] = fArr2[i16] + fArr[i14];
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return y4;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final a m(String[] texts, a w10) {
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w10, "w");
            int length = texts.length;
            int i10 = w10.a[1];
            int i11 = 0;
            a aVar = new a(new int[]{length, 128, i10});
            float[] fArr = aVar.f16858c;
            float[] fArr2 = w10.f16858c;
            if (length > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    int[] d10 = h.f16896b.d(texts[i12]);
                    int i14 = i11;
                    while (true) {
                        int i15 = i14 + 1;
                        System.arraycopy(fArr2, d10[i14] * i10, fArr, (i14 * i10) + (i10 * 128 * i12), i10);
                        if (i15 >= 128) {
                            break;
                        }
                        i14 = i15;
                    }
                    if (i13 >= length) {
                        break;
                    }
                    i12 = i13;
                    i11 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static int n(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        if (f10 <= 0.0f) {
            return i10;
        }
        if (f10 >= 1.0f) {
            return i11;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float a10 = a(((i10 >> 16) & 255) / 255.0f);
        float a11 = a(((i10 >> 8) & 255) / 255.0f);
        float a12 = a((i10 & 255) / 255.0f);
        float a13 = a(((i11 >> 16) & 255) / 255.0f);
        float a14 = a(((i11 >> 8) & 255) / 255.0f);
        float a15 = a((i11 & 255) / 255.0f);
        float b3 = vd.e.b(f12, f11, f10, f11);
        float b10 = vd.e.b(a13, a10, f10, a10);
        float b11 = vd.e.b(a14, a11, f10, a11);
        float b12 = vd.e.b(a15, a12, f10, a12);
        float b13 = b(b10) * 255.0f;
        float b14 = b(b11) * 255.0f;
        return Math.round(b(b12) * 255.0f) | (Math.round(b13) << 16) | (Math.round(b3 * 255.0f) << 24) | (Math.round(b14) << 8);
    }

    public static final void o(a x10) {
        int i10;
        if (m6.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            if (1 < length) {
                int i11 = 1;
                i10 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    i10 *= x10.a[i11];
                    if (i12 >= length) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            } else {
                i10 = 1;
            }
            int[] shape = {x10.a[0], i10};
            Intrinsics.checkNotNullParameter(shape, "shape");
            x10.a = shape;
            int i13 = a.f16856d;
            int a10 = com.facebook.c.a(shape);
            float[] fArr = new float[a10];
            System.arraycopy(x10.f16858c, 0, fArr, 0, Math.min(x10.f16857b, a10));
            x10.f16858c = fArr;
            x10.f16857b = a10;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[LOOP:1: B:13:0x0054->B:27:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b A[EDGE_INSN: B:28:0x009b->B:29:0x009b BREAK  A[LOOP:1: B:13:0x0054->B:27:0x0097], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.recyclerview.widget.s0 p(android.content.Context r21, k0.c r22) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.g.p(android.content.Context, k0.c):androidx.recyclerview.widget.s0");
    }

    public static l0.e q(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new l0.e(o.c(textView));
        }
        androidx.activity.result.i iVar = new androidx.activity.result.i(new TextPaint(textView.getPaint()));
        iVar.f608b = t0.m.a(textView);
        iVar.f609c = t0.m.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z10 = false;
            if (i10 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(o.b(t0.n.a(textView.getTextLocale()))[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            } else {
                if (textView.getLayoutDirection() == 1) {
                    z10 = true;
                }
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        }
                }
            }
        }
        iVar.f611f = textDirectionHeuristic;
        return new l0.e((TextPaint) iVar.f610d, textDirectionHeuristic, iVar.f608b, iVar.f609c);
    }

    public static boolean r() {
        try {
            if (f16893j == null) {
                return ba.a.t();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f16893j == null) {
                f16892i = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f16893j = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f16893j.invoke(null, Long.valueOf(f16892i))).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
            return false;
        }
    }

    public static boolean s(String str) {
        boolean z10;
        l2.b bVar = l2.n.a;
        Set<l2.g> unmodifiableSet = Collections.unmodifiableSet(l2.c.f21114c);
        HashSet hashSet = new HashSet();
        for (l2.g gVar : unmodifiableSet) {
            if (((l2.c) gVar).a.equals(str)) {
                hashSet.add(gVar);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            do {
                z10 = false;
                if (!it.hasNext()) {
                    return false;
                }
                l2.c cVar = (l2.c) ((l2.g) it.next());
                if (cVar.a() || cVar.b()) {
                    z10 = true;
                }
            } while (!z10);
            return true;
        }
        throw new RuntimeException("Unknown feature ".concat(str));
    }

    public static void t(Context context, String str) {
        Log.d("ITGLogEventManager", String.format("User click ad for ad unit %s.", str));
        Bundle bundle = new Bundle();
        bundle.putString("ad_unit_id", str);
        FirebaseAnalytics.getInstance(context).a(bundle, "event_user_click_ads");
        com.facebook.c cVar = com.facebook.appevents.k.f10950b;
        com.facebook.c.z(context).a(bundle, "event_user_click_ads");
    }

    public static void u(Context context, String str) {
        float f10 = context.getSharedPreferences("itg_ad_pref", 0).getFloat("KEY_CURRENT_TOTAL_REVENUE_AD", 0.0f);
        Bundle bundle = new Bundle();
        bundle.putFloat(AppMeasurementSdk.ConditionalUserProperty.VALUE, f10);
        FirebaseAnalytics.getInstance(context).a(bundle, str);
        com.facebook.c cVar = com.facebook.appevents.k.f10950b;
        com.facebook.c.z(context).a(bundle, str);
    }

    public static void v(Context context, AdValue adValue, String str, String str2) {
        float valueMicros = (float) adValue.getValueMicros();
        int precisionType = adValue.getPrecisionType();
        Bundle bundle = new Bundle();
        double d10 = valueMicros;
        bundle.putDouble("valuemicros", d10);
        bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, "USD");
        bundle.putInt("precision", precisionType);
        bundle.putString("adunitid", str);
        bundle.putString("network", str2);
        double d11 = d10 / 1000000.0d;
        Bundle bundle2 = new Bundle();
        bundle2.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, d11);
        bundle2.putString(AppLovinEventParameters.REVENUE_CURRENCY, "USD");
        bundle2.putInt("precision", precisionType);
        bundle2.putString("adunitid", str);
        bundle2.putString("network", str2);
        if (((h3.b) d3.g.r().f16812c).f18727b != null && ((h3.b) d3.g.r().f16812c).f18727b.f18722c) {
            AdjustEvent adjustEvent = new AdjustEvent((String) ((h3.b) d3.g.r().f16812c).f18727b.f18725g);
            adjustEvent.setRevenue(d11, "USD");
            Adjust.trackEvent(adjustEvent);
        }
        FirebaseAnalytics.getInstance(context).a(bundle2, "paid_ad_impression_value");
        com.facebook.c cVar = com.facebook.appevents.k.f10950b;
        com.facebook.c.z(context).a(bundle2, "paid_ad_impression_value");
        FirebaseAnalytics.getInstance(context).a(bundle, "paid_ad_impression");
        com.facebook.c.z(context).a(bundle, "paid_ad_impression");
        context.getSharedPreferences("itg_ad_pref", 0).edit().putFloat("KEY_CURRENT_TOTAL_REVENUE_AD", (float) (d11 + r4.getFloat("KEY_CURRENT_TOTAL_REVENUE_AD", 0.0f))).apply();
        u(context, "event_current_total_revenue_ad");
        float f10 = l3.a.f21122b + valueMicros;
        l3.a.f21122b = f10;
        context.getSharedPreferences("itg_ad_pref", 0).edit().putFloat("KEY_CURRENT_TOTAL_REVENUE_001_AD", f10).apply();
        float f11 = l3.a.f21122b / 1000000.0f;
        if (f11 >= 0.01d) {
            l3.a.f21122b = 0.0f;
            context.getSharedPreferences("itg_ad_pref", 0).edit().putFloat("KEY_CURRENT_TOTAL_REVENUE_001_AD", 0.0f).apply();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(AppMeasurementSdk.ConditionalUserProperty.VALUE, f11);
            FirebaseAnalytics.getInstance(context).a(bundle3, "paid_ad_impression_value_001");
            com.facebook.c.z(context).a(bundle3, "paid_ad_impression_value_001");
        }
        long j3 = context.getSharedPreferences("itg_ad_pref", 0).getLong("KEY_INSTALL_TIME", 0L);
        if (!context.getSharedPreferences("itg_ad_pref", 0).getBoolean("KEY_PUSH_EVENT_REVENUE_3_DAY", false) && System.currentTimeMillis() - j3 >= 259200000) {
            Log.d("ITGLogEventManager", "logTotalRevenueAdAt3DaysIfNeed: ");
            u(context, "event_total_revenue_ad_in_3_days");
            context.getSharedPreferences("itg_ad_pref", 0).edit().putBoolean("KEY_PUSH_EVENT_REVENUE_3_DAY", true).apply();
        }
        long j10 = context.getSharedPreferences("itg_ad_pref", 0).getLong("KEY_INSTALL_TIME", 0L);
        if (!context.getSharedPreferences("itg_ad_pref", 0).getBoolean("KEY_PUSH_EVENT_REVENUE_7_DAY", false) && System.currentTimeMillis() - j10 >= 604800000) {
            Log.d("ITGLogEventManager", "logTotalRevenueAdAt7DaysIfNeed: ");
            u(context, "event_total_revenue_ad_in_7_days");
            context.getSharedPreferences("itg_ad_pref", 0).edit().putBoolean("KEY_PUSH_EVENT_REVENUE_7_DAY", true).apply();
        }
        if (c6.k.f2645e) {
            AdjustAdRevenue adjustAdRevenue = new AdjustAdRevenue(AdjustConfig.AD_REVENUE_ADMOB);
            adjustAdRevenue.setRevenue(Double.valueOf(adValue.getValueMicros() / 1000000.0d), adValue.getCurrencyCode());
            Adjust.trackAdRevenue(adjustAdRevenue);
        }
        float valueMicros2 = ((((float) adValue.getValueMicros()) * 1.0f) / 1000000.0f) * 25000.0f;
        com.facebook.appevents.k z10 = com.facebook.c.z(context);
        BigDecimal valueOf = BigDecimal.valueOf(valueMicros2);
        Currency currency = Currency.getInstance("VND");
        com.facebook.appevents.l lVar = z10.a;
        lVar.getClass();
        if (!m6.a.b(lVar)) {
            try {
                if (!m6.a.b(lVar)) {
                    try {
                        if (c6.g.a()) {
                            Log.w(com.facebook.appevents.l.f10951c, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                        }
                        lVar.g(valueOf, currency, null, false);
                    } catch (Throwable th2) {
                        m6.a.a(lVar, th2);
                    }
                }
            } catch (Throwable th3) {
                m6.a.a(lVar, th3);
            }
        }
    }

    public static void w(AdValue adValue, String str, String str2) {
        AdjustEvent adjustEvent = new AdjustEvent(str2);
        adjustEvent.setRevenue((((float) adValue.getValueMicros()) * 1.0f) / 1000000.0f, "USD");
        adjustEvent.setOrderId(str);
        Adjust.trackEvent(adjustEvent);
    }

    public static final a x(a x10, int i10) {
        int i11;
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.a;
            int i12 = 0;
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            int i16 = (i14 - i10) + 1;
            a aVar = new a(new int[]{i13, i16, i15});
            float[] fArr = x10.f16858c;
            float[] fArr2 = aVar.f16858c;
            if (i13 > 0) {
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    if (i15 > 0) {
                        int i19 = i12;
                        while (true) {
                            int i20 = i19 + 1;
                            if (i16 > 0) {
                                int i21 = i12;
                                while (true) {
                                    int i22 = i21 + 1;
                                    int i23 = i21 * i15;
                                    int i24 = (i17 * i16 * i15) + i23 + i19;
                                    int i25 = (i17 * i14 * i15) + i23 + i19;
                                    fArr2[i24] = Float.MIN_VALUE;
                                    if (i10 > 0) {
                                        int i26 = 0;
                                        while (true) {
                                            int i27 = i26 + 1;
                                            i11 = i14;
                                            fArr2[i24] = Math.max(fArr2[i24], fArr[(i26 * i15) + i25]);
                                            if (i27 >= i10) {
                                                break;
                                            }
                                            i26 = i27;
                                            i14 = i11;
                                        }
                                    } else {
                                        i11 = i14;
                                    }
                                    if (i22 >= i16) {
                                        break;
                                    }
                                    i21 = i22;
                                    i14 = i11;
                                }
                            } else {
                                i11 = i14;
                            }
                            if (i20 >= i15) {
                                break;
                            }
                            i19 = i20;
                            i14 = i11;
                            i12 = 0;
                        }
                    } else {
                        i11 = i14;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                    i17 = i18;
                    i14 = i11;
                    i12 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final a y(a x10, a w10) {
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int i10 = 0;
            int i11 = x10.a[0];
            int[] iArr = w10.a;
            int i12 = iArr[0];
            int i13 = iArr[1];
            a aVar = new a(new int[]{i11, i13});
            float[] fArr = x10.f16858c;
            float[] fArr2 = w10.f16858c;
            float[] fArr3 = aVar.f16858c;
            if (i11 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (i13 > 0) {
                        int i16 = i10;
                        while (true) {
                            int i17 = i16 + 1;
                            int i18 = (i14 * i13) + i16;
                            fArr3[i18] = 0.0f;
                            if (i12 > 0) {
                                int i19 = i10;
                                while (true) {
                                    int i20 = i19 + 1;
                                    fArr3[i18] = (fArr[(i14 * i12) + i19] * fArr2[(i19 * i13) + i16]) + fArr3[i18];
                                    if (i20 >= i12) {
                                        break;
                                    }
                                    i19 = i20;
                                }
                            }
                            if (i17 >= i13) {
                                break;
                            }
                            i16 = i17;
                            i10 = 0;
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
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static b1.b z(String name, z0.a aVar) {
        l1 produceMigrations = l1.f22309d;
        CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new b1.b(name, aVar, produceMigrations, scope);
    }
}
