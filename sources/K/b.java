package K;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f1611a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f1612c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f1613d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1614e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f1615f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1616g;

    public static D0.l b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i9) {
        D0.l lVar;
        if (c(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i9, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new D0.l((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                lVar = D0.l.c(typedArray.getResources(), typedArray.getResourceId(i9, 0), theme);
            } catch (Exception e4) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
                lVar = null;
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new D0.l((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int d(float f9) {
        float f10;
        boolean z8;
        float f11;
        if (f9 < 1.0f) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (f9 > 99.0f) {
            return -1;
        }
        float f12 = (f9 + 16.0f) / 116.0f;
        if (f9 > 8.0f) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f9 / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z8) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f1612c;
        return L.c.a(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static float e(int i9) {
        float pow;
        float f9 = i9 / 255.0f;
        if (f9 <= 0.04045f) {
            pow = f9 / 12.92f;
        } else {
            pow = (float) Math.pow((f9 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static e i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i9;
        boolean z8;
        int i10;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), H.a.b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        k(xmlResourceParser);
                    }
                    return new h(new F1.i(string, j(resources, resourceId), string2, string3), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), H.a.f1340c);
                            int i11 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i11 = 1;
                            }
                            int i12 = obtainAttributes2.getInt(i11, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i9 = 6;
                            } else {
                                i9 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i9, 0)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            int i13 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i13 = 3;
                            }
                            int i14 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i14 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i14);
                            int i15 = obtainAttributes2.getInt(i13, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i10 = 5;
                            } else {
                                i10 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                            String string6 = obtainAttributes2.getString(i10);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                k(xmlResourceParser);
                            }
                            arrayList.add(new g(string6, i12, string5, i15, resourceId2, z8));
                        } else {
                            k(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new f((g[]) arrayList.toArray(new g[0]));
                }
            } else {
                k(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List j(Resources resources, int i9) {
        if (i9 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i9);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (d.a(obtainTypedArray, 0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i9);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlResourceParser xmlResourceParser) {
        int i9 = 1;
        while (i9 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i9--;
                }
            } else {
                i9++;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i9) {
        new Handler(Looper.getMainLooper()).post(new m(i9, 0, this));
    }

    public abstract void g(int i9);

    public abstract void h(Typeface typeface);
}
