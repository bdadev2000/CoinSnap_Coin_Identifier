package j;

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
import androidx.appcompat.widget.i3;
import androidx.appcompat.widget.s1;
import java.io.IOException;
import k.r;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class k extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f19695e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f19696f;
    public final Object[] a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f19697b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f19698c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19699d;

    static {
        Class[] clsArr = {Context.class};
        f19695e = clsArr;
        f19696f = clsArr;
    }

    public k(Context context) {
        super(context);
        this.f19698c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.f19697b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        j jVar = new j(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
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
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                Menu menu2 = jVar.a;
                z11 = z11;
                z11 = z11;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            z12 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            jVar.f19671b = 0;
                            jVar.f19672c = 0;
                            jVar.f19673d = 0;
                            jVar.f19674e = 0;
                            jVar.f19675f = true;
                            jVar.f19676g = true;
                            z11 = z11;
                        } else if (name2.equals("item")) {
                            z11 = z11;
                            if (!jVar.f19677h) {
                                r rVar = jVar.f19694z;
                                if (rVar != null && rVar.f20174b.hasSubMenu()) {
                                    jVar.f19677h = true;
                                    jVar.b(menu2.addSubMenu(jVar.f19671b, jVar.f19678i, jVar.f19679j, jVar.f19680k).getItem());
                                    z11 = z11;
                                } else {
                                    jVar.f19677h = true;
                                    jVar.b(menu2.add(jVar.f19671b, jVar.f19678i, jVar.f19679j, jVar.f19680k));
                                    z11 = z11;
                                }
                            }
                        } else {
                            z11 = z11;
                            if (name2.equals("menu")) {
                                z11 = true;
                            }
                        }
                    }
                } else if (!z12) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    k kVar = jVar.E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = kVar.f19698c.obtainStyledAttributes(attributeSet, g.a.f17893p);
                        jVar.f19671b = obtainStyledAttributes.getResourceId(1, 0);
                        jVar.f19672c = obtainStyledAttributes.getInt(3, 0);
                        jVar.f19673d = obtainStyledAttributes.getInt(4, 0);
                        jVar.f19674e = obtainStyledAttributes.getInt(5, 0);
                        jVar.f19675f = obtainStyledAttributes.getBoolean(2, true);
                        jVar.f19676g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        z11 = z11;
                    } else if (name3.equals("item")) {
                        Context context = kVar.f19698c;
                        i3 i3Var = new i3(context, context.obtainStyledAttributes(attributeSet, g.a.f17894q));
                        jVar.f19678i = i3Var.i(2, 0);
                        jVar.f19679j = (i3Var.h(5, jVar.f19672c) & (-65536)) | (i3Var.h(6, jVar.f19673d) & 65535);
                        jVar.f19680k = i3Var.k(7);
                        jVar.f19681l = i3Var.k(8);
                        jVar.f19682m = i3Var.i(0, 0);
                        String j3 = i3Var.j(9);
                        if (j3 == null) {
                            charAt = 0;
                        } else {
                            charAt = j3.charAt(0);
                        }
                        jVar.f19683n = charAt;
                        jVar.f19684o = i3Var.h(16, 4096);
                        String j10 = i3Var.j(10);
                        if (j10 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j10.charAt(0);
                        }
                        jVar.f19685p = charAt2;
                        jVar.f19686q = i3Var.h(20, 4096);
                        if (i3Var.l(11)) {
                            jVar.f19687r = i3Var.a(11, false) ? 1 : 0;
                        } else {
                            jVar.f19687r = jVar.f19674e;
                        }
                        jVar.f19688s = i3Var.a(3, false);
                        jVar.f19689t = i3Var.a(4, jVar.f19675f);
                        jVar.u = i3Var.a(1, jVar.f19676g);
                        jVar.f19690v = i3Var.h(21, -1);
                        jVar.f19693y = i3Var.j(12);
                        jVar.f19691w = i3Var.i(13, 0);
                        jVar.f19692x = i3Var.j(15);
                        String j11 = i3Var.j(14);
                        if (j11 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && jVar.f19691w == 0 && jVar.f19692x == null) {
                            jVar.f19694z = (r) jVar.a(j11, f19696f, kVar.f19697b);
                        } else {
                            if (z10) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            jVar.f19694z = null;
                        }
                        jVar.A = i3Var.k(17);
                        jVar.B = i3Var.k(22);
                        if (i3Var.l(19)) {
                            jVar.D = s1.b(i3Var.h(19, -1), jVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            jVar.D = null;
                        }
                        if (i3Var.l(18)) {
                            jVar.C = i3Var.b(18);
                        } else {
                            jVar.C = colorStateList;
                        }
                        i3Var.o();
                        jVar.f19677h = false;
                    } else if (name3.equals("menu")) {
                        jVar.f19677h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(jVar.f19671b, jVar.f19678i, jVar.f19679j, jVar.f19680k);
                        jVar.b(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z12 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i10 = 2;
                z11 = z11;
                z12 = z12;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof i0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f19698c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
