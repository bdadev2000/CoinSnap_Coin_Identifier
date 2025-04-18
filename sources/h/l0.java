package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f18629b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f18630c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f18631d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f18632e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f18633f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f18634g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final r.k f18635h = new r.k();
    public final Object[] a = new Object[2];

    public androidx.appcompat.widget.q a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.q(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public androidx.appcompat.widget.s c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.checkboxStyle);
    }

    public androidx.appcompat.widget.f0 d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f0(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        r.k kVar = f18635h;
        Constructor constructor = (Constructor) kVar.getOrDefault(str, null);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f18629b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }

    public final void g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
