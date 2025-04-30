package G;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f1225a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1226c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1227d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1228e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1229f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1230g;

    /* renamed from: h, reason: collision with root package name */
    public int f1231h;

    /* renamed from: i, reason: collision with root package name */
    public int f1232i;

    /* renamed from: j, reason: collision with root package name */
    public int f1233j;

    /* renamed from: k, reason: collision with root package name */
    public View f1234k;
    public View l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1235n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1236o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1237p;

    public e() {
        super(-2, -2);
        this.b = false;
        this.f1226c = 0;
        this.f1227d = 0;
        this.f1228e = -1;
        this.f1229f = -1;
        this.f1230g = 0;
        this.f1231h = 0;
        this.f1237p = new Rect();
    }

    public final boolean a(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return false;
            }
            return this.f1236o;
        }
        return this.f1235n;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.b = false;
        this.f1226c = 0;
        this.f1227d = 0;
        this.f1228e = -1;
        this.f1229f = -1;
        this.f1230g = 0;
        this.f1231h = 0;
        this.f1237p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F.a.b);
        this.f1226c = obtainStyledAttributes.getInteger(0, 0);
        this.f1229f = obtainStyledAttributes.getResourceId(1, -1);
        this.f1227d = obtainStyledAttributes.getInteger(2, 0);
        this.f1228e = obtainStyledAttributes.getInteger(6, -1);
        this.f1230g = obtainStyledAttributes.getInt(5, 0);
        this.f1231h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f4341v;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f4341v;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f4343x;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f4342w);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e4) {
                    throw new RuntimeException(AbstractC2914a.d("Could not inflate Behavior subclass ", string), e4);
                }
            }
            this.f1225a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f1225a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.b = false;
        this.f1226c = 0;
        this.f1227d = 0;
        this.f1228e = -1;
        this.f1229f = -1;
        this.f1230g = 0;
        this.f1231h = 0;
        this.f1237p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.f1226c = 0;
        this.f1227d = 0;
        this.f1228e = -1;
        this.f1229f = -1;
        this.f1230g = 0;
        this.f1231h = 0;
        this.f1237p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.f1226c = 0;
        this.f1227d = 0;
        this.f1228e = -1;
        this.f1229f = -1;
        this.f1230g = 0;
        this.f1231h = 0;
        this.f1237p = new Rect();
    }
}
