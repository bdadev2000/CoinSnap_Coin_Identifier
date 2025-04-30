package I2;

import G7.j;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u7.AbstractC2817h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1436a = new Object();
    public static final List b = AbstractC2817h.B(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        if (O2.a.b(c.class)) {
            return null;
        }
        try {
            j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = A2.g.a(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            O2.a.a(c.class, th);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (O2.a.b(c.class)) {
            return null;
        }
        try {
            j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = A2.g.a(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            O2.a.a(c.class, th);
            return null;
        }
    }

    public static final String d(View view) {
        if (O2.a.b(c.class)) {
            return null;
        }
        try {
            j.e(view, "hostView");
            String i9 = A2.g.i(view);
            if (i9.length() > 0) {
                return i9;
            }
            String join = TextUtils.join(" ", f1436a.c(view));
            j.d(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            O2.a.a(c.class, th);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (O2.a.b(c.class)) {
            return;
        }
        try {
            j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            try {
                String i9 = A2.g.i(view);
                String g9 = A2.g.g(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", A2.g.b(view));
                if (i9.length() > 0) {
                    jSONObject.put(MimeTypes.BASE_TYPE_TEXT, i9);
                }
                if (g9.length() > 0) {
                    jSONObject.put("hint", g9);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            O2.a.a(c.class, th);
        }
    }

    public final ArrayList c(View view) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = A2.g.a(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String i9 = A2.g.i(view2);
                if (i9.length() > 0) {
                    arrayList.add(i9);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }
}
