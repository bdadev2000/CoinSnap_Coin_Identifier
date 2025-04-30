package A2;

import G7.j;
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
import com.facebook.internal.H;
import com.facebook.r;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f40a = new Object();
    public static WeakReference b = new WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public static Method f41c;

    public static final ArrayList a(View view) {
        int childCount;
        if (O2.a.b(g.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i9));
                    if (i10 >= childCount) {
                        break;
                    }
                    i9 = i10;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0064, code lost:
    
        if (T.InterfaceC0288t.class.isInstance(r3) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:6:0x000a, B:9:0x0016, B:11:0x001c, B:12:0x001e, B:82:0x0069, B:15:0x006c, B:17:0x0070, B:19:0x0076, B:21:0x007c, B:22:0x008c, B:24:0x0090, B:27:0x007f, B:29:0x0083, B:31:0x0093, B:33:0x0097, B:36:0x009c, B:38:0x00a0, B:40:0x00a4, B:42:0x00a8, B:44:0x00ab, B:46:0x00af, B:55:0x0027, B:59:0x0030, B:64:0x0047, B:67:0x0050, B:30:0x005b, B:71:0x0060, B:79:0x0041), top: B:5:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:55:0x0027, B:59:0x0030, B:64:0x0047, B:67:0x0050, B:30:0x005b, B:71:0x0060, B:79:0x0041, B:75:0x003b), top: B:54:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.g.b(android.view.View):int");
    }

    public static final JSONObject c(View view) {
        if (O2.a.b(g.class)) {
            return null;
        }
        try {
            j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList a6 = a(view);
                int size = a6.size() - 1;
                if (size >= 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        jSONArray.put(c((View) a6.get(i9)));
                        if (i10 > size) {
                            break;
                        }
                        i9 = i10;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e4) {
                Log.e("A2.g", "Failed to create JSONObject for view.", e4);
            }
            return jSONObject;
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    public static final View.OnClickListener e(View view) {
        Field declaredField;
        if (O2.a.b(g.class)) {
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
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    public static final View.OnTouchListener f(View view) {
        Field declaredField;
        try {
            if (O2.a.b(g.class)) {
                return null;
            }
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
                    r rVar = r.f13801a;
                    return null;
                } catch (NoSuchFieldException unused2) {
                    r rVar2 = r.f13801a;
                    return null;
                }
            } catch (ClassNotFoundException unused3) {
                r rVar3 = r.f13801a;
                return null;
            }
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    public static final String g(View view) {
        CharSequence charSequence;
        if (O2.a.b(g.class)) {
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
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    public static final ViewGroup h(View view) {
        if (O2.a.b(g.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) parent;
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence valueOf;
        Object selectedItem;
        String str;
        if (O2.a.b(g.class)) {
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
            } else if (view instanceof DatePicker) {
                valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
            } else if (view instanceof TimePicker) {
                Integer currentHour = ((TimePicker) view).getCurrentHour();
                j.d(currentHour, "view.currentHour");
                int intValue = currentHour.intValue();
                Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                j.d(currentMinute, "view.currentMinute");
                valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
            } else if (view instanceof RadioGroup) {
                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                int childCount = ((RadioGroup) view).getChildCount();
                if (childCount > 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        View childAt = ((RadioGroup) view).getChildAt(i9);
                        if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                            valueOf = ((RadioButton) childAt).getText();
                            break;
                        }
                        if (i10 >= childCount) {
                            break;
                        }
                        i9 = i10;
                    }
                }
                valueOf = null;
            } else {
                if (view instanceof RatingBar) {
                    valueOf = String.valueOf(((RatingBar) view).getRating());
                }
                valueOf = null;
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    public static final void m(View view, JSONObject jSONObject) {
        if (O2.a.b(g.class)) {
            return;
        }
        try {
            j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            try {
                String i9 = i(view);
                String g9 = g(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", b(view));
                jSONObject.put("id", view.getId());
                if (!f.b(view)) {
                    jSONObject.put(MimeTypes.BASE_TYPE_TEXT, H.e(H.M(i9)));
                } else {
                    jSONObject.put(MimeTypes.BASE_TYPE_TEXT, "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", H.e(H.M(g9)));
                if (tag != null) {
                    jSONObject.put("tag", H.e(H.M(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", H.e(H.M(contentDescription.toString())));
                }
                jSONObject.put("dimension", f40a.d(view));
            } catch (JSONException unused) {
                r rVar = r.f13801a;
            }
        } catch (Throwable th) {
            O2.a.a(g.class, th);
        }
    }

    public final JSONObject d(View view) {
        if (O2.a.b(this)) {
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
            } catch (JSONException e4) {
                Log.e("A2.g", "Failed to create JSONObject for dimension.", e4);
            }
            return jSONObject;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final View j(float[] fArr, View view) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            k();
            Method method = f41c;
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
                    } catch (IllegalAccessException unused) {
                        r rVar = r.f13801a;
                    }
                } catch (InvocationTargetException unused2) {
                    r rVar2 = r.f13801a;
                }
            }
            return null;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final void k() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (f41c != null) {
                return;
            }
            try {
                try {
                    Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                    f41c = declaredMethod;
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } catch (NoSuchMethodException unused) {
                    r rVar = r.f13801a;
                }
            } catch (ClassNotFoundException unused2) {
                r rVar2 = r.f13801a;
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final boolean l(View view, View view2) {
        if (O2.a.b(this)) {
            return false;
        }
        try {
            j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!O2.a.b(this)) {
                try {
                    view.getLocationOnScreen(new int[2]);
                    fArr = new float[]{r2[0], r2[1]};
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            }
            View j7 = j(fArr, view2);
            if (j7 != null) {
                if (j7.getId() == view.getId()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            O2.a.a(this, th2);
            return false;
        }
    }
}
