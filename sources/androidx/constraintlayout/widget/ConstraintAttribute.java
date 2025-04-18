package androidx.constraintlayout.widget;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.d;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ConstraintAttribute {

    /* renamed from: a, reason: collision with root package name */
    public AttributeType f18179a;

    /* renamed from: b, reason: collision with root package name */
    public int f18180b;

    /* renamed from: c, reason: collision with root package name */
    public float f18181c;
    public String d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f18182f;

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18183a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f18183a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18183a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18183a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18183a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18183a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18183a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18183a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class AttributeType {

        /* renamed from: a, reason: collision with root package name */
        public static final AttributeType f18184a;

        /* renamed from: b, reason: collision with root package name */
        public static final AttributeType f18185b;

        /* renamed from: c, reason: collision with root package name */
        public static final AttributeType f18186c;
        public static final AttributeType d;

        /* renamed from: f, reason: collision with root package name */
        public static final AttributeType f18187f;

        /* renamed from: g, reason: collision with root package name */
        public static final AttributeType f18188g;

        /* renamed from: h, reason: collision with root package name */
        public static final AttributeType f18189h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AttributeType[] f18190i;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.constraintlayout.widget.ConstraintAttribute$AttributeType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.constraintlayout.widget.ConstraintAttribute$AttributeType] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.constraintlayout.widget.ConstraintAttribute$AttributeType] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.constraintlayout.widget.ConstraintAttribute$AttributeType] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.constraintlayout.widget.ConstraintAttribute$AttributeType] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.constraintlayout.widget.ConstraintAttribute$AttributeType] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.constraintlayout.widget.ConstraintAttribute$AttributeType] */
        static {
            ?? r02 = new Enum("INT_TYPE", 0);
            f18184a = r02;
            ?? r1 = new Enum("FLOAT_TYPE", 1);
            f18185b = r1;
            ?? r2 = new Enum("COLOR_TYPE", 2);
            f18186c = r2;
            ?? r3 = new Enum("COLOR_DRAWABLE_TYPE", 3);
            d = r3;
            ?? r4 = new Enum("STRING_TYPE", 4);
            f18187f = r4;
            ?? r5 = new Enum("BOOLEAN_TYPE", 5);
            f18188g = r5;
            ?? r6 = new Enum("DIMENSION_TYPE", 6);
            f18189h = r6;
            f18190i = new AttributeType[]{r02, r1, r2, r3, r4, r5, r6};
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) f18190i.clone();
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        constraintAttribute.getClass();
        this.f18179a = constraintAttribute.f18179a;
        b(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0032. Please report as an issue. */
    public static void a(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) hashMap.get(str);
            String b2 = j.b("set", str);
            try {
                switch (constraintAttribute.f18179a.ordinal()) {
                    case 0:
                        cls.getMethod(b2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f18180b));
                        break;
                    case 1:
                        cls.getMethod(b2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f18181c));
                        break;
                    case 2:
                        cls.getMethod(b2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f18182f));
                        break;
                    case 3:
                        Method method = cls.getMethod(b2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f18182f);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(b2, CharSequence.class).invoke(view, constraintAttribute.d);
                        break;
                    case 5:
                        cls.getMethod(b2, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.e));
                        break;
                    case 6:
                        cls.getMethod(b2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f18181c));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder v2 = d.v(" Custom Attribute \"", str, "\" not found on ");
                v2.append(cls.getName());
                Log.e("TransitionLayout", v2.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + b2);
            } catch (InvocationTargetException e3) {
                StringBuilder v3 = d.v(" Custom Attribute \"", str, "\" not found on ");
                v3.append(cls.getName());
                Log.e("TransitionLayout", v3.toString());
                e3.printStackTrace();
            }
        }
    }

    public final void b(Object obj) {
        switch (this.f18179a.ordinal()) {
            case 0:
                this.f18180b = ((Integer) obj).intValue();
                return;
            case 1:
                this.f18181c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f18182f = ((Integer) obj).intValue();
                return;
            case 4:
                this.d = (String) obj;
                return;
            case 5:
                this.e = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f18181c = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
