package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f947l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f948m = new ConcurrentHashMap();
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f949b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f950c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f951d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f952e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f953f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f954g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f955h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f956i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f957j;

    /* renamed from: k, reason: collision with root package name */
    public final j1 f958k;

    static {
        new ConcurrentHashMap();
    }

    public n1(TextView textView) {
        this.f956i = textView;
        this.f957j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f958k = new l1();
        } else {
            this.f958k = new j1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f948m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        boolean z10;
        int measuredWidth;
        if (i() && this.a != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (this.f949b) {
            if (this.f956i.getMeasuredHeight() > 0 && this.f956i.getMeasuredWidth() > 0) {
                if (this.f958k.b(this.f956i)) {
                    measuredWidth = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    measuredWidth = (this.f956i.getMeasuredWidth() - this.f956i.getTotalPaddingLeft()) - this.f956i.getTotalPaddingRight();
                }
                int height = (this.f956i.getHeight() - this.f956i.getCompoundPaddingBottom()) - this.f956i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f947l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c10 = c(rectF);
                        if (c10 != this.f956i.getTextSize()) {
                            f(c10, 0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f949b = true;
    }

    public final int c(RectF rectF) {
        boolean z10;
        CharSequence transformation;
        int length = this.f953f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f953f[i13];
                TextView textView = this.f956i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int b3 = g1.b(textView);
                TextPaint textPaint = this.f955h;
                if (textPaint == null) {
                    this.f955h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f955h.set(textView.getPaint());
                this.f955h.setTextSize(i14);
                StaticLayout a = i1.a(text, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), b3, this.f956i, this.f955h, this.f958k);
                if ((b3 != -1 && (a.getLineCount() > b3 || a.getLineEnd(a.getLineCount() - 1) != text.length())) || a.getHeight() > rectF.bottom) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f953f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(float f10, int i10) {
        Resources resources;
        Context context = this.f957j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        TextView textView = this.f956i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a = h1.a(textView);
            if (textView.getLayout() != null) {
                this.f949b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!a) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.a == 1) {
            if (!this.f954g || this.f953f.length == 0) {
                int floor = ((int) Math.floor((this.f952e - this.f951d) / this.f950c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f950c) + this.f951d);
                }
                this.f953f = b(iArr);
            }
            this.f949b = true;
        } else {
            this.f949b = false;
        }
        return this.f949b;
    }

    public final boolean h() {
        boolean z10;
        if (this.f953f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f954g = z10;
        if (z10) {
            this.a = 1;
            this.f951d = r0[0];
            this.f952e = r0[r1 - 1];
            this.f950c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f956i instanceof y);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.a = 1;
                    this.f951d = f10;
                    this.f952e = f11;
                    this.f950c = f12;
                    this.f954g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }
}
