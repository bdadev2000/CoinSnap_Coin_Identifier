package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class k0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f18624b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18625c;

    /* renamed from: d, reason: collision with root package name */
    public Method f18626d;

    /* renamed from: f, reason: collision with root package name */
    public Context f18627f;

    public k0(View view, String str) {
        this.f18624b = view;
        this.f18625c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f18626d == null) {
            View view2 = this.f18624b;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f18625c;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f18626d = method;
                            this.f18627f = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder o10 = a4.j.o("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    o10.append(view2.getClass());
                    o10.append(str);
                    throw new IllegalStateException(o10.toString());
                }
            }
        }
        try {
            this.f18626d.invoke(this.f18627f, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
