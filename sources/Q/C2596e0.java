package q;

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
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: q.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2596e0 {
    public static final RectF l = new RectF();
    public static final ConcurrentHashMap m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f22643a = 0;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f22644c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f22645d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f22646e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f22647f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f22648g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f22649h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f22650i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f22651j;

    /* renamed from: k, reason: collision with root package name */
    public final C2590b0 f22652k;

    public C2596e0(TextView textView) {
        this.f22650i = textView;
        this.f22651j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f22652k = new C2592c0();
        } else {
            this.f22652k = new C2590b0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i9 : iArr) {
            if (i9 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i9)) < 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (!f()) {
            return;
        }
        if (this.b) {
            if (this.f22650i.getMeasuredHeight() > 0 && this.f22650i.getMeasuredWidth() > 0) {
                if (this.f22652k.b(this.f22650i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f22650i.getMeasuredWidth() - this.f22650i.getTotalPaddingLeft()) - this.f22650i.getTotalPaddingRight();
                }
                int height = (this.f22650i.getHeight() - this.f22650i.getCompoundPaddingBottom()) - this.f22650i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = l;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float c9 = c(rectF);
                            if (c9 != this.f22650i.getTextSize()) {
                                g(0, c9);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.b = true;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f22647f.length;
        if (length != 0) {
            int i9 = length - 1;
            int i10 = 0;
            int i11 = 1;
            while (i11 <= i9) {
                int i12 = (i11 + i9) / 2;
                int i13 = this.f22647f[i12];
                TextView textView = this.f22650i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f22649h;
                if (textPaint == null) {
                    this.f22649h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f22649h.set(textView.getPaint());
                this.f22649h.setTextSize(i13);
                StaticLayout a6 = AbstractC2588a0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f22650i, this.f22649h, this.f22652k);
                if ((maxLines != -1 && (a6.getLineCount() > maxLines || a6.getLineEnd(a6.getLineCount() - 1) != text.length())) || a6.getHeight() > rectF.bottom) {
                    i10 = i12 - 1;
                    i9 = i10;
                } else {
                    int i14 = i12 + 1;
                    i10 = i11;
                    i11 = i14;
                }
            }
            return this.f22647f[i10];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f22643a != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i9, float f9) {
        Resources resources;
        Context context = this.f22651j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i9, f9, resources.getDisplayMetrics());
        TextView textView = this.f22650i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f22643a == 1) {
            if (!this.f22648g || this.f22647f.length == 0) {
                int floor = ((int) Math.floor((this.f22646e - this.f22645d) / this.f22644c)) + 1;
                int[] iArr = new int[floor];
                for (int i9 = 0; i9 < floor; i9++) {
                    iArr[i9] = Math.round((i9 * this.f22644c) + this.f22645d);
                }
                this.f22647f = b(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final boolean i() {
        boolean z8;
        if (this.f22647f.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f22648g = z8;
        if (z8) {
            this.f22643a = 1;
            this.f22645d = r0[0];
            this.f22646e = r0[r1 - 1];
            this.f22644c = -1.0f;
        }
        return z8;
    }

    public final boolean j() {
        return !(this.f22650i instanceof AppCompatEditText);
    }

    public final void k(float f9, float f10, float f11) {
        if (f9 > 0.0f) {
            if (f10 > f9) {
                if (f11 > 0.0f) {
                    this.f22643a = 1;
                    this.f22645d = f9;
                    this.f22646e = f10;
                    this.f22644c = f11;
                    this.f22648g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f9 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f9 + "px) is less or equal to (0px)");
    }
}
