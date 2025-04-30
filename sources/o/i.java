package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import j.AbstractC2379a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p.ActionProviderVisibilityListenerC2536o;
import p.MenuC2533l;
import q.AbstractC2610l0;

/* loaded from: classes.dex */
public final class i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f21914e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f21915f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21916a;
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f21917c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21918d;

    static {
        Class[] clsArr = {Context.class};
        f21914e = clsArr;
        f21915f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f21917c = context;
        Object[] objArr = {context};
        this.f21916a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i9;
        boolean z8;
        char charAt;
        char charAt2;
        boolean z9;
        ColorStateList colorStateList;
        int resourceId;
        h hVar = new h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i9 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != r42) {
                if (eventType != i9) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z11 && name2.equals(str)) {
                            z8 = r42;
                            z11 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            r42 = z8;
                            i9 = 2;
                            z11 = z11;
                        } else if (name2.equals("group")) {
                            hVar.b = 0;
                            hVar.f21892c = 0;
                            hVar.f21893d = 0;
                            hVar.f21894e = 0;
                            hVar.f21895f = r42;
                            hVar.f21896g = r42;
                        } else if (name2.equals("item")) {
                            if (!hVar.f21897h) {
                                ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o = hVar.f21913z;
                                if (actionProviderVisibilityListenerC2536o != null && actionProviderVisibilityListenerC2536o.f22152c.hasSubMenu()) {
                                    hVar.f21897h = r42;
                                    hVar.b(hVar.f21891a.addSubMenu(hVar.b, hVar.f21898i, hVar.f21899j, hVar.f21900k).getItem());
                                } else {
                                    hVar.f21897h = r42;
                                    hVar.b(hVar.f21891a.add(hVar.b, hVar.f21898i, hVar.f21899j, hVar.f21900k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z8 = r42;
                            z10 = z8;
                        }
                    }
                    z8 = r42;
                } else {
                    if (!z11) {
                        String name3 = xmlResourceParser.getName();
                        boolean equals = name3.equals("group");
                        i iVar = hVar.f21890E;
                        if (equals) {
                            TypedArray obtainStyledAttributes = iVar.f21917c.obtainStyledAttributes(attributeSet, AbstractC2379a.f20954p);
                            hVar.b = obtainStyledAttributes.getResourceId(r42, 0);
                            hVar.f21892c = obtainStyledAttributes.getInt(3, 0);
                            hVar.f21893d = obtainStyledAttributes.getInt(4, 0);
                            hVar.f21894e = obtainStyledAttributes.getInt(5, 0);
                            hVar.f21895f = obtainStyledAttributes.getBoolean(2, r42);
                            hVar.f21896g = obtainStyledAttributes.getBoolean(0, r42);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                Context context = iVar.f21917c;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2379a.f20955q);
                                hVar.f21898i = obtainStyledAttributes2.getResourceId(2, 0);
                                hVar.f21899j = (obtainStyledAttributes2.getInt(5, hVar.f21892c) & (-65536)) | (obtainStyledAttributes2.getInt(6, hVar.f21893d) & 65535);
                                hVar.f21900k = obtainStyledAttributes2.getText(7);
                                hVar.l = obtainStyledAttributes2.getText(8);
                                hVar.m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                hVar.f21901n = charAt;
                                hVar.f21902o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                hVar.f21903p = charAt2;
                                hVar.f21904q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    hVar.f21905r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    hVar.f21905r = hVar.f21894e;
                                }
                                hVar.f21906s = obtainStyledAttributes2.getBoolean(3, false);
                                hVar.f21907t = obtainStyledAttributes2.getBoolean(4, hVar.f21895f);
                                hVar.f21908u = obtainStyledAttributes2.getBoolean(1, hVar.f21896g);
                                hVar.f21909v = obtainStyledAttributes2.getInt(21, -1);
                                hVar.f21912y = obtainStyledAttributes2.getString(12);
                                hVar.f21910w = obtainStyledAttributes2.getResourceId(13, 0);
                                hVar.f21911x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9 && hVar.f21910w == 0 && hVar.f21911x == null) {
                                    hVar.f21913z = (ActionProviderVisibilityListenerC2536o) hVar.a(string3, f21915f, iVar.b);
                                } else {
                                    if (z9) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    hVar.f21913z = null;
                                }
                                hVar.f21886A = obtainStyledAttributes2.getText(17);
                                hVar.f21887B = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    hVar.f21889D = AbstractC2610l0.c(obtainStyledAttributes2.getInt(19, -1), hVar.f21889D);
                                } else {
                                    hVar.f21889D = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = I.h.getColorStateList(context, resourceId)) == null) {
                                        colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                    }
                                    hVar.f21888C = colorStateList;
                                } else {
                                    hVar.f21888C = null;
                                }
                                obtainStyledAttributes2.recycle();
                                hVar.f21897h = false;
                                z8 = true;
                            } else if (name3.equals("menu")) {
                                z8 = true;
                                hVar.f21897h = true;
                                SubMenu addSubMenu = hVar.f21891a.addSubMenu(hVar.b, hVar.f21898i, hVar.f21899j, hVar.f21900k);
                                hVar.b(addSubMenu.getItem());
                                b(xmlResourceParser, attributeSet, addSubMenu);
                            } else {
                                z8 = true;
                                str = name3;
                                z11 = true;
                            }
                            eventType = xmlResourceParser.next();
                            r42 = z8;
                            i9 = 2;
                            z11 = z11;
                        }
                    }
                    z8 = r42;
                }
                eventType = xmlResourceParser.next();
                r42 = z8;
                i9 = 2;
                z11 = z11;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i9, Menu menu) {
        if (!(menu instanceof MenuC2533l)) {
            super.inflate(i9, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z8 = false;
        try {
            try {
                xmlResourceParser = this.f21917c.getResources().getLayout(i9);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC2533l) {
                    MenuC2533l menuC2533l = (MenuC2533l) menu;
                    if (!menuC2533l.f22114r) {
                        menuC2533l.w();
                        z8 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z8) {
                    ((MenuC2533l) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th) {
            if (z8) {
                ((MenuC2533l) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
