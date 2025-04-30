package k;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import q.C2579B;
import q.C2615o;
import q.C2619q;

/* renamed from: k.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2404A {
    public static final Class[] b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f21220c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21221d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f21222e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f21223f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f21224g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final x.l f21225h = new x.l();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21226a = new Object[2];

    public C2615o a(Context context, AttributeSet attributeSet) {
        return new C2615o(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C2619q c(Context context, AttributeSet attributeSet) {
        return new C2619q(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.checkboxStyle);
    }

    public C2579B d(Context context, AttributeSet attributeSet) {
        return new C2579B(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        x.l lVar = f21225h;
        Constructor constructor = (Constructor) lVar.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            lVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f21226a);
    }
}
