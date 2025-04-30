package x2;

import A2.g;
import G7.j;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2917b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2917b f24218a = new Object();

    public static final ArrayList a(View view) {
        if (O2.a.b(C2917b.class)) {
            return null;
        }
        try {
            j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ArrayList arrayList = new ArrayList();
            ViewGroup h6 = g.h(view);
            if (h6 != null) {
                Iterator it = g.a(h6).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(f24218a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            O2.a.a(C2917b.class, th);
            return null;
        }
    }

    public static final ArrayList b(View view) {
        List list;
        if (O2.a.b(C2917b.class)) {
            return null;
        }
        try {
            j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ArrayList arrayList = new ArrayList();
            arrayList.add(g.g(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    j.d(resourceName, "resourceName");
                    Pattern compile = Pattern.compile("/");
                    j.d(compile, "compile(...)");
                    O7.g.S(0);
                    Matcher matcher = compile.matcher(resourceName);
                    if (!matcher.find()) {
                        list = android.support.v4.media.session.a.w(resourceName.toString());
                    } else {
                        ArrayList arrayList2 = new ArrayList(10);
                        int i9 = 0;
                        do {
                            arrayList2.add(resourceName.subSequence(i9, matcher.start()).toString());
                            i9 = matcher.end();
                        } while (matcher.find());
                        arrayList2.add(resourceName.subSequence(i9, resourceName.length()).toString());
                        list = arrayList2;
                    }
                    Object[] array = list.toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length == 2) {
                            arrayList.add(strArr[1]);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList3.add(lowerCase);
                }
            }
            return arrayList3;
        } catch (Throwable th) {
            O2.a.a(C2917b.class, th);
            return null;
        }
    }

    public static final boolean d(ArrayList arrayList, ArrayList arrayList2) {
        if (O2.a.b(C2917b.class)) {
            return false;
        }
        try {
            j.e(arrayList, "indicators");
            j.e(arrayList2, "keys");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C2917b c2917b = f24218a;
                if (!O2.a.b(c2917b)) {
                    try {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (O7.g.E((String) it2.next(), str)) {
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        O2.a.a(c2917b, th);
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            O2.a.a(C2917b.class, th2);
            return false;
        }
    }

    public final ArrayList c(View view) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0 && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            Iterator it = g.a(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(c((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }
}
