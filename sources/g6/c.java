package g6;

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
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y5.g;

/* loaded from: classes3.dex */
public final class c {
    public static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final List f18214b = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    public static final ArrayList a(View view) {
        if (m6.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = f18214b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = g.a(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (m6.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = g.a(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
            return null;
        }
    }

    public static final String d(View hostView) {
        boolean z10;
        if (m6.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String i10 = g.i(hostView);
            if (i10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return i10;
            }
            String join = TextUtils.join(" ", a.c(hostView));
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        boolean z10;
        if (m6.a.b(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String i10 = g.i(view);
                String g10 = g.g(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", g.b(view));
                boolean z11 = true;
                if (i10.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    json.put(MimeTypes.BASE_TYPE_TEXT, i10);
                }
                if (g10.length() <= 0) {
                    z11 = false;
                }
                if (z11) {
                    json.put("hint", g10);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
        }
    }

    public final ArrayList c(View view) {
        boolean z10;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = g.a(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String i10 = g.i(view2);
                if (i10.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(i10);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }
}
