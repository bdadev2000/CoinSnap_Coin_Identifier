package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class z implements View.OnClickListener {
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21393c;

    /* renamed from: d, reason: collision with root package name */
    public Method f21394d;

    /* renamed from: f, reason: collision with root package name */
    public Context f21395f;

    public z(View view, String str) {
        this.b = view;
        this.f21393c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f21394d == null) {
            View view2 = this.b;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f21393c;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f21394d = method;
                            this.f21395f = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    n2.append(view2.getClass());
                    n2.append(str);
                    throw new IllegalStateException(n2.toString());
                }
            }
        }
        try {
            this.f21394d.invoke(this.f21395f, view);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
        } catch (InvocationTargetException e9) {
            throw new IllegalStateException("Could not execute method for android:onClick", e9);
        }
    }
}
