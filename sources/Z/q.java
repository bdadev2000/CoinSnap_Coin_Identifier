package Z;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f3867a;
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    public Class f3868c;

    /* renamed from: d, reason: collision with root package name */
    public Method f3869d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3870e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3871f = false;

    public q(ActionMode.Callback callback, TextView textView) {
        this.f3867a = callback;
        this.b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f3867a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f3867a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f3867a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        boolean z8;
        TextView textView = this.b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f3871f) {
            this.f3871f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f3868c = cls;
                this.f3869d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f3870e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f3868c = null;
                this.f3869d = null;
                this.f3870e = false;
            }
        }
        try {
            if (this.f3870e && this.f3868c.isInstance(menu)) {
                declaredMethod = this.f3869d;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i9);
                MenuItem add = menu.add(0, 0, i9 + 100, resolveInfo2.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z8);
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f3867a.onPrepareActionMode(actionMode, menu);
    }
}
