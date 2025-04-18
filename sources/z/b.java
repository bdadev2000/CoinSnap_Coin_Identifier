package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28300b;

    /* renamed from: c, reason: collision with root package name */
    public int f28301c;

    /* renamed from: d, reason: collision with root package name */
    public float f28302d;

    /* renamed from: e, reason: collision with root package name */
    public String f28303e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28304f;

    /* renamed from: g, reason: collision with root package name */
    public int f28305g;

    public b(String str, int i10, Object obj, boolean z10) {
        this.a = false;
        this.f28300b = i10;
        this.a = z10;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f28447d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        Object obj = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            int i12 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i13 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i13 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i13 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i12 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i10 = i12;
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i13;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new b(str, i10, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (t.h.b(this.f28300b)) {
            case 0:
            case 7:
                this.f28301c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f28302d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f28305g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f28303e = (String) obj;
                return;
            case 5:
                this.f28304f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f28302d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public b(b bVar, Object obj) {
        this.a = false;
        bVar.getClass();
        this.f28300b = bVar.f28300b;
        b(obj);
    }
}
