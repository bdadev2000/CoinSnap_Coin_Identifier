package b0;

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

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public a a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2248b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2249c;

    /* renamed from: d, reason: collision with root package name */
    public int f2250d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2251e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2252f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2253g;

    /* renamed from: h, reason: collision with root package name */
    public int f2254h;

    /* renamed from: i, reason: collision with root package name */
    public int f2255i;

    /* renamed from: j, reason: collision with root package name */
    public int f2256j;

    /* renamed from: k, reason: collision with root package name */
    public View f2257k;

    /* renamed from: l, reason: collision with root package name */
    public View f2258l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2259m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2260n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2261o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2262p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f2263q;

    public d() {
        super(-2, -2);
        this.f2248b = false;
        this.f2249c = 0;
        this.f2250d = 0;
        this.f2251e = -1;
        this.f2252f = -1;
        this.f2253g = 0;
        this.f2254h = 0;
        this.f2263q = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return this.f2261o;
        }
        return this.f2260n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        this.f2248b = false;
        this.f2249c = 0;
        this.f2250d = 0;
        this.f2251e = -1;
        this.f2252f = -1;
        this.f2253g = 0;
        this.f2254h = 0;
        this.f2263q = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f5b);
        this.f2249c = obtainStyledAttributes.getInteger(0, 0);
        this.f2252f = obtainStyledAttributes.getResourceId(1, -1);
        this.f2250d = obtainStyledAttributes.getInteger(2, 0);
        this.f2251e = obtainStyledAttributes.getInteger(6, -1);
        this.f2253g = obtainStyledAttributes.getInt(5, 0);
        this.f2254h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f2248b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1144v;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1144v;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1146x;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1145w);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException(vd.e.e("Could not inflate Behavior subclass ", string), e2);
                }
            }
            this.a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.g(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f2248b = false;
        this.f2249c = 0;
        this.f2250d = 0;
        this.f2251e = -1;
        this.f2252f = -1;
        this.f2253g = 0;
        this.f2254h = 0;
        this.f2263q = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2248b = false;
        this.f2249c = 0;
        this.f2250d = 0;
        this.f2251e = -1;
        this.f2252f = -1;
        this.f2253g = 0;
        this.f2254h = 0;
        this.f2263q = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2248b = false;
        this.f2249c = 0;
        this.f2250d = 0;
        this.f2251e = -1;
        this.f2252f = -1;
        this.f2253g = 0;
        this.f2254h = 0;
        this.f2263q = new Rect();
    }
}
