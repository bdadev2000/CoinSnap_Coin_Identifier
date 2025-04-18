package y5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.internal.m0;
import com.facebook.x;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {
    public static final g a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f27929b = new WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public static Method f27930c;

    public static final ArrayList a(View view) {
        int childCount;
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                    if (i11 >= childCount) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0065, code lost:
    
        if (n0.t.class.isInstance(r3) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:6:0x000a, B:9:0x0016, B:11:0x001c, B:12:0x001e, B:17:0x006f, B:18:0x0071, B:20:0x0075, B:22:0x007c, B:24:0x0082, B:25:0x0085, B:27:0x0089, B:28:0x008d, B:30:0x0091, B:33:0x0094, B:35:0x0098, B:38:0x009d, B:40:0x00a1, B:42:0x00a5, B:44:0x00a9, B:46:0x00ac, B:48:0x00b0, B:84:0x0069, B:57:0x0028, B:61:0x0031, B:67:0x004a, B:70:0x0051, B:63:0x005c, B:74:0x0061, B:81:0x0041), top: B:5:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:6:0x000a, B:9:0x0016, B:11:0x001c, B:12:0x001e, B:17:0x006f, B:18:0x0071, B:20:0x0075, B:22:0x007c, B:24:0x0082, B:25:0x0085, B:27:0x0089, B:28:0x008d, B:30:0x0091, B:33:0x0094, B:35:0x0098, B:38:0x009d, B:40:0x00a1, B:42:0x00a5, B:44:0x00a9, B:46:0x00ac, B:48:0x00b0, B:84:0x0069, B:57:0x0028, B:61:0x0031, B:67:0x004a, B:70:0x0051, B:63:0x005c, B:74:0x0061, B:81:0x0041), top: B:5:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:6:0x000a, B:9:0x0016, B:11:0x001c, B:12:0x001e, B:17:0x006f, B:18:0x0071, B:20:0x0075, B:22:0x007c, B:24:0x0082, B:25:0x0085, B:27:0x0089, B:28:0x008d, B:30:0x0091, B:33:0x0094, B:35:0x0098, B:38:0x009d, B:40:0x00a1, B:42:0x00a5, B:44:0x00a9, B:46:0x00ac, B:48:0x00b0, B:84:0x0069, B:57:0x0028, B:61:0x0031, B:67:0x004a, B:70:0x0051, B:63:0x005c, B:74:0x0061, B:81:0x0041), top: B:5:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0061 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #3 {all -> 0x0045, blocks: (B:57:0x0028, B:61:0x0031, B:67:0x004a, B:70:0x0051, B:63:0x005c, B:74:0x0061, B:81:0x0041, B:65:0x003b), top: B:56:0x0028, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.g.b(android.view.View):int");
    }

    public static final JSONObject c(View view) {
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f27929b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList a10 = a(view);
                int size = a10.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(c((View) a10.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e2) {
                Log.e("y5.g", "Failed to create JSONObject for view.", e2);
            }
            return jSONObject;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final View.OnClickListener e(View view) {
        Field declaredField;
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final View.OnTouchListener f(View view) {
        Field declaredField;
        try {
            if (m6.a.b(g.class)) {
                return null;
            }
            try {
                try {
                    try {
                        Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        if (declaredField2 != null) {
                            declaredField2.setAccessible(true);
                        }
                        Object obj = declaredField2.get(view);
                        if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                            return null;
                        }
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        if (obj2 != null) {
                            return (View.OnTouchListener) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                    } catch (IllegalAccessException unused) {
                        x xVar = x.a;
                        return null;
                    }
                } catch (ClassNotFoundException unused2) {
                    x xVar2 = x.a;
                    return null;
                }
            } catch (NoSuchFieldException unused3) {
                x xVar3 = x.a;
                return null;
            }
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final String g(View view) {
        CharSequence charSequence;
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            String obj = charSequence.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final ViewGroup h(View view) {
        if (m6.a.b(g.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) parent;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence valueOf;
        Object selectedItem;
        String str;
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    valueOf = str;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i10 = 0;
                if (view instanceof DatePicker) {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                    int intValue2 = currentMinute.intValue();
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i10);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            }
                            if (i11 >= childCount) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public static final void m(View view, JSONObject json) {
        if (m6.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String i10 = i(view);
                String g10 = g(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", b(view));
                json.put("id", view.getId());
                if (!f.b(view)) {
                    json.put(MimeTypes.BASE_TYPE_TEXT, m0.e(m0.K(i10)));
                } else {
                    json.put(MimeTypes.BASE_TYPE_TEXT, "");
                    json.put("is_user_input", true);
                }
                json.put("hint", m0.e(m0.K(g10)));
                if (tag != null) {
                    json.put("tag", m0.e(m0.K(tag.toString())));
                }
                if (contentDescription != null) {
                    json.put("description", m0.e(m0.K(contentDescription.toString())));
                }
                json.put("dimension", a.d(view));
            } catch (JSONException unused) {
                x xVar = x.a;
            }
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
        }
    }

    public final JSONObject d(View view) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put(TtmlNode.LEFT, view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e2) {
                Log.e("y5.g", "Failed to create JSONObject for dimension.", e2);
            }
            return jSONObject;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final View j(float[] fArr, View view) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            k();
            Method method = f27930c;
            if (method != null && view != null) {
                try {
                    try {
                        if (method != null) {
                            Object invoke = method.invoke(null, fArr, view);
                            if (invoke != null) {
                                View view2 = (View) invoke;
                                if (view2.getId() > 0) {
                                    Object parent = view2.getParent();
                                    if (parent != null) {
                                        return (View) parent;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    } catch (InvocationTargetException unused) {
                        x xVar = x.a;
                    }
                } catch (IllegalAccessException unused2) {
                    x xVar2 = x.a;
                }
            }
            return null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final void k() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (f27930c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f27930c = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (ClassNotFoundException unused) {
                x xVar = x.a;
            } catch (NoSuchMethodException unused2) {
                x xVar2 = x.a;
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final boolean l(View view, View view2) {
        if (m6.a.b(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!m6.a.b(this)) {
                try {
                    view.getLocationOnScreen(new int[2]);
                    fArr = new float[]{r4[0], r4[1]};
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            }
            View j3 = j(fArr, view2);
            if (j3 == null) {
                return false;
            }
            if (j3.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th3) {
            m6.a.a(this, th3);
            return false;
        }
    }
}
