package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v4.media.d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.objectweb.asm.Opcodes;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo
/* loaded from: classes2.dex */
public class SupportMenuInflater extends MenuInflater {
    public static final Class[] e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f610f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f611a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f612b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f613c;
    public Object d;

    /* loaded from: classes2.dex */
    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class[] f614c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f615a;

        /* renamed from: b, reason: collision with root package name */
        public Method f616b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f616b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f615a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class MenuState {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a, reason: collision with root package name */
        public final Menu f617a;

        /* renamed from: h, reason: collision with root package name */
        public boolean f622h;

        /* renamed from: i, reason: collision with root package name */
        public int f623i;

        /* renamed from: j, reason: collision with root package name */
        public int f624j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f625k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f626l;

        /* renamed from: m, reason: collision with root package name */
        public int f627m;

        /* renamed from: n, reason: collision with root package name */
        public char f628n;

        /* renamed from: o, reason: collision with root package name */
        public int f629o;

        /* renamed from: p, reason: collision with root package name */
        public char f630p;

        /* renamed from: q, reason: collision with root package name */
        public int f631q;

        /* renamed from: r, reason: collision with root package name */
        public int f632r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f633s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f634t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f635u;

        /* renamed from: v, reason: collision with root package name */
        public int f636v;
        public int w;
        public String x;

        /* renamed from: y, reason: collision with root package name */
        public String f637y;

        /* renamed from: z, reason: collision with root package name */
        public ActionProvider f638z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b, reason: collision with root package name */
        public int f618b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f619c = 0;
        public int d = 0;
        public int e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f620f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f621g = true;

        public MenuState(Menu menu) {
            this.f617a = menu;
        }

        public final Object a(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.f613c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, androidx.appcompat.view.SupportMenuInflater$InflatedOnMenuItemClickListener, java.lang.Object] */
        public final void b(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f633s).setVisible(this.f634t).setEnabled(this.f635u).setCheckable(this.f632r >= 1).setTitleCondensed(this.f626l).setIcon(this.f627m);
            int i2 = this.f636v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            String str = this.f637y;
            SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
            if (str != null) {
                if (supportMenuInflater.f613c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (supportMenuInflater.d == null) {
                    supportMenuInflater.d = SupportMenuInflater.a(supportMenuInflater.f613c);
                }
                Object obj = supportMenuInflater.d;
                String str2 = this.f637y;
                ?? obj2 = new Object();
                obj2.f615a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f616b = cls.getMethod(str2, InflatedOnMenuItemClickListener.f614c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder v2 = d.v("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    v2.append(cls.getName());
                    InflateException inflateException = new InflateException(v2.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.f632r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).g(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    MenuItemWrapperICS menuItemWrapperICS = (MenuItemWrapperICS) menuItem;
                    try {
                        Method method = menuItemWrapperICS.e;
                        SupportMenuItem supportMenuItem = menuItemWrapperICS.d;
                        if (method == null) {
                            menuItemWrapperICS.e = supportMenuItem.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemWrapperICS.e.invoke(supportMenuItem, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str3 = this.x;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, SupportMenuInflater.e, supportMenuInflater.f611a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            ActionProvider actionProvider = this.f638z;
            if (actionProvider != null) {
                if (menuItem instanceof SupportMenuItem) {
                    ((SupportMenuItem) menuItem).b(actionProvider);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            MenuItemCompat.b(menuItem, this.A);
            MenuItemCompat.f(menuItem, this.B);
            MenuItemCompat.a(menuItem, this.f628n, this.f629o);
            MenuItemCompat.e(menuItem, this.f630p, this.f631q);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                MenuItemCompat.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                MenuItemCompat.c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f610f = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f613c = context;
        Object[] objArr = {context};
        this.f611a = objArr;
        this.f612b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v16 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i2;
        boolean z2;
        ColorStateList colorStateList;
        MenuState menuState = new MenuState(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r4;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        menuState.f618b = 0;
                        menuState.f619c = 0;
                        menuState.d = 0;
                        menuState.e = 0;
                        menuState.f620f = r4;
                        menuState.f621g = r4;
                    } else if (name2.equals("item")) {
                        if (!menuState.f622h) {
                            ActionProvider actionProvider = menuState.f638z;
                            if (actionProvider == null || !actionProvider.a()) {
                                menuState.f622h = r4;
                                menuState.b(menuState.f617a.add(menuState.f618b, menuState.f623i, menuState.f624j, menuState.f625k));
                            } else {
                                menuState.f622h = r4;
                                menuState.b(menuState.f617a.addSubMenu(menuState.f618b, menuState.f623i, menuState.f624j, menuState.f625k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r4;
                        z3 = z2;
                    }
                }
                z2 = r4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = supportMenuInflater.f613c.obtainStyledAttributes(attributeSet, R.styleable.f325q);
                        menuState.f618b = obtainStyledAttributes.getResourceId(r4, 0);
                        menuState.f619c = obtainStyledAttributes.getInt(3, 0);
                        menuState.d = obtainStyledAttributes.getInt(4, 0);
                        menuState.e = obtainStyledAttributes.getInt(5, 0);
                        menuState.f620f = obtainStyledAttributes.getBoolean(2, r4);
                        menuState.f621g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                        z2 = r4;
                        i2 = 2;
                    } else if (name3.equals("item")) {
                        Context context = supportMenuInflater.f613c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.f326r);
                        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes2);
                        menuState.f623i = obtainStyledAttributes2.getResourceId(2, 0);
                        menuState.f624j = (obtainStyledAttributes2.getInt(6, menuState.d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (obtainStyledAttributes2.getInt(5, menuState.f619c) & Opcodes.V_PREVIEW);
                        menuState.f625k = obtainStyledAttributes2.getText(7);
                        menuState.f626l = obtainStyledAttributes2.getText(8);
                        menuState.f627m = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        menuState.f628n = string == null ? (char) 0 : string.charAt(0);
                        menuState.f629o = obtainStyledAttributes2.getInt(16, 4096);
                        String string2 = obtainStyledAttributes2.getString(10);
                        menuState.f630p = string2 == null ? (char) 0 : string2.charAt(0);
                        menuState.f631q = obtainStyledAttributes2.getInt(20, 4096);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            menuState.f632r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            menuState.f632r = menuState.e;
                        }
                        menuState.f633s = obtainStyledAttributes2.getBoolean(3, false);
                        menuState.f634t = obtainStyledAttributes2.getBoolean(4, menuState.f620f);
                        menuState.f635u = obtainStyledAttributes2.getBoolean(1, menuState.f621g);
                        menuState.f636v = obtainStyledAttributes2.getInt(21, -1);
                        menuState.f637y = obtainStyledAttributes2.getString(12);
                        menuState.w = obtainStyledAttributes2.getResourceId(13, 0);
                        menuState.x = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        boolean z5 = string3 != null;
                        if (z5 && menuState.w == 0 && menuState.x == null) {
                            menuState.f638z = (ActionProvider) menuState.a(string3, f610f, supportMenuInflater.f612b);
                        } else {
                            if (z5) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            menuState.f638z = null;
                        }
                        menuState.A = obtainStyledAttributes2.getText(17);
                        menuState.B = obtainStyledAttributes2.getText(22);
                        if (obtainStyledAttributes2.hasValue(19)) {
                            menuState.D = DrawableUtils.c(obtainStyledAttributes2.getInt(19, -1), menuState.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            menuState.D = null;
                        }
                        if (obtainStyledAttributes2.hasValue(18)) {
                            menuState.C = tintTypedArray.a(18);
                        } else {
                            menuState.C = colorStateList;
                        }
                        tintTypedArray.f();
                        menuState.f622h = false;
                        i2 = 2;
                        z2 = true;
                    } else {
                        i2 = 2;
                        if (name3.equals("menu")) {
                            z2 = true;
                            menuState.f622h = true;
                            SubMenu addSubMenu = menuState.f617a.addSubMenu(menuState.f618b, menuState.f623i, menuState.f624j, menuState.f625k);
                            menuState.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                    }
                    eventType = xmlResourceParser.next();
                    r4 = z2;
                    z4 = z4;
                }
                z2 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f613c.getResources().getLayout(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuBuilder) {
                    MenuBuilder menuBuilder = (MenuBuilder) menu;
                    if (menuBuilder.isDispatchingItemsChanged()) {
                        menuBuilder.stopDispatchingItemsChanged();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuBuilder) menu).startDispatchingItemsChanged();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuBuilder) menu).startDispatchingItemsChanged();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
