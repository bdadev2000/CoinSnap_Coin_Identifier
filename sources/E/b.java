package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f760a = false;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f761c;

    /* renamed from: d, reason: collision with root package name */
    public float f762d;

    /* renamed from: e, reason: collision with root package name */
    public String f763e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f764f;

    /* renamed from: g, reason: collision with root package name */
    public int f765g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.b = bVar.b;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [E.b, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f958d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i9 = 0;
        boolean z8 = false;
        Object obj = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z8 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i9 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i9 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i11 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i9 = i11;
                            }
                        }
                        i9 = 7;
                    }
                }
                i9 = i12;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.b = i9;
            obj2.f760a = z8;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC2965e.d(this.b)) {
            case 0:
            case 7:
                this.f761c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f762d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f765g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f763e = (String) obj;
                return;
            case 5:
                this.f764f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f762d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
