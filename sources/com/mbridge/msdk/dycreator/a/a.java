package com.mbridge.msdk.dycreator.a;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import eb.j;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final Class[] f12610f = {Context.class, AttributeSet.class};

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Constructor> f12611g = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static String f12612j = "com.mbridge.msdk.dycreator.baseview.MB";
    protected final Context a;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0164a f12614c;

    /* renamed from: d, reason: collision with root package name */
    private b f12615d;

    /* renamed from: h, reason: collision with root package name */
    private HashMap<String, Boolean> f12617h;

    /* renamed from: i, reason: collision with root package name */
    private long f12618i;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12613b = true;

    /* renamed from: e, reason: collision with root package name */
    private final Object[] f12616e = new Object[2];

    /* renamed from: com.mbridge.msdk.dycreator.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0164a {
        View a(String str, Context context, AttributeSet attributeSet);
    }

    /* loaded from: classes4.dex */
    public interface b {
        boolean a(Class cls);
    }

    public a(Context context) {
        this.a = context;
    }

    private XmlPullParser a(String str) {
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(new FileInputStream(str), "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return newPullParser;
    }

    private void b(String str, String str2, AttributeSet attributeSet) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(attributeSet.getPositionDescription());
        sb2.append(": Class not allowed to be inflated ");
        if (str2 != null) {
            str = j.k(str2, str);
        }
        sb2.append(str);
        throw new InflateException(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
    private View a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z10) {
        int next;
        ViewGroup.LayoutParams layoutParams;
        synchronized (this.f12616e) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f12616e[0] = this.a;
            do {
                try {
                    try {
                        next = xmlPullParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (IOException e2) {
                        InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e2.getMessage());
                        inflateException.initCause(e2);
                        throw inflateException;
                    }
                } catch (XmlPullParserException e10) {
                    InflateException inflateException2 = new InflateException(e10.getMessage());
                    inflateException2.initCause(e10);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                String name = xmlPullParser.getName();
                System.out.println("**************************");
                System.out.println("Creating root view: " + name);
                System.out.println("**************************");
                if (!"merge".equals(name)) {
                    View a = a(name, asAttributeSet);
                    if (viewGroup != 0) {
                        System.out.println("Creating params from root: " + ((Object) viewGroup));
                        layoutParams = viewGroup.generateLayoutParams(asAttributeSet);
                        if (!z10) {
                            a.setLayoutParams(layoutParams);
                        }
                    } else {
                        layoutParams = null;
                    }
                    System.out.println("-----> start inflating children");
                    a(xmlPullParser, a, asAttributeSet);
                    System.out.println("-----> done inflating children");
                    if (viewGroup != 0 && z10) {
                        viewGroup.addView(a, layoutParams);
                    }
                    if (viewGroup == 0 || !z10) {
                        viewGroup = a;
                    }
                } else if (viewGroup != 0 && z10) {
                    a(xmlPullParser, (View) viewGroup, asAttributeSet);
                } else {
                    throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                }
            } else {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return viewGroup;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        if (r8 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
    
        a(r0, r2, r1);
        r7.addView(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        r2.setLayoutParams(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0068, code lost:
    
        if (r8 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(org.xmlpull.v1.XmlPullParser r6, android.view.View r7, android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lac
            r0 = 0
            r1 = 0
            java.lang.String r2 = "layout"
            int r0 = r8.getAttributeResourceValue(r1, r2, r0)
            if (r0 != 0) goto L2a
            java.lang.String r6 = r8.getAttributeValue(r1, r2)
            if (r6 != 0) goto L1c
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "You must specifiy a layout in the include tag: <include layout=\"@layout/layoutID\" />"
            r6.<init>(r7)
            throw r6
        L1c:
            android.view.InflateException r7 = new android.view.InflateException
            java.lang.String r8 = "You must specifiy a valid layout reference. The layout ID "
            java.lang.String r0 = " is not valid."
            java.lang.String r6 = com.applovin.impl.mediation.ads.e.f(r8, r6, r0)
            r7.<init>(r6)
            throw r7
        L2a:
            android.content.Context r1 = r5.a
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.XmlResourceParser r0 = r1.getLayout(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch: java.lang.Throwable -> La7
        L38:
            int r2 = r0.next()     // Catch: java.lang.Throwable -> La7
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L43
            if (r2 == r3) goto L43
            goto L38
        L43:
            if (r2 != r4) goto L8c
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = "merge"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L55
            r5.a(r0, r7, r1)     // Catch: java.lang.Throwable -> La7
            goto L73
        L55:
            android.view.View r2 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> La7
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> La7
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r8)     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            if (r8 == 0) goto L6d
            goto L6a
        L62:
            r6 = move-exception
            goto L8b
        L64:
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r1)     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L6d
        L6a:
            r2.setLayoutParams(r8)     // Catch: java.lang.Throwable -> La7
        L6d:
            r5.a(r0, r2, r1)     // Catch: java.lang.Throwable -> La7
            r7.addView(r2)     // Catch: java.lang.Throwable -> La7
        L73:
            r0.close()
            int r7 = r6.getDepth()
        L7a:
            int r8 = r6.next()
            r0 = 3
            if (r8 != r0) goto L87
            int r0 = r6.getDepth()
            if (r0 <= r7) goto L8a
        L87:
            if (r8 == r3) goto L8a
            goto L7a
        L8a:
            return
        L8b:
            throw r6     // Catch: java.lang.Throwable -> La7
        L8c:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r7.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r8 = r0.getPositionDescription()     // Catch: java.lang.Throwable -> La7
            r7.append(r8)     // Catch: java.lang.Throwable -> La7
            java.lang.String r8 = ": No start tag found!"
            r7.append(r8)     // Catch: java.lang.Throwable -> La7
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La7
            r6.<init>(r7)     // Catch: java.lang.Throwable -> La7
            throw r6     // Catch: java.lang.Throwable -> La7
        La7:
            r6 = move-exception
            r0.close()
            throw r6
        Lac:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "<include /> can only be used inside of a ViewGroup"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.a.a.b(org.xmlpull.v1.XmlPullParser, android.view.View, android.util.AttributeSet):void");
    }

    private View a(String str, String str2, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        String str3;
        String str4;
        HashMap<String, Constructor> hashMap = f12611g;
        Constructor<?> constructor = hashMap.get(str);
        Class<?> cls = null;
        try {
            if (constructor == null) {
                ClassLoader classLoader = this.a.getClassLoader();
                if (str2 != null) {
                    str4 = str2 + str;
                } else {
                    str4 = str;
                }
                cls = classLoader.loadClass(str4);
                b bVar = this.f12615d;
                if (bVar != null && cls != null && !bVar.a(cls)) {
                    b(str, str2, attributeSet);
                }
                constructor = cls.getConstructor(f12610f);
                hashMap.put(str, constructor);
            } else if (this.f12615d != null) {
                Boolean bool = this.f12617h.get(str);
                if (bool == null) {
                    ClassLoader classLoader2 = this.a.getClassLoader();
                    if (str2 != null) {
                        str3 = str2 + str;
                    } else {
                        str3 = str;
                    }
                    cls = classLoader2.loadClass(str3);
                    boolean z10 = cls != null && this.f12615d.a(cls);
                    this.f12617h.put(str, Boolean.valueOf(z10));
                    if (!z10) {
                        b(str, str2, attributeSet);
                    }
                } else if (bool.equals(Boolean.FALSE)) {
                    b(str, str2, attributeSet);
                }
            }
            Object[] objArr = this.f12616e;
            objArr[1] = attributeSet;
            return (View) constructor.newInstance(objArr);
        } catch (ClassNotFoundException e2) {
            throw e2;
        } catch (NoSuchMethodException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Error inflating class ");
            if (str2 != null) {
                str = j.k(str2, str);
            }
            sb2.append(str);
            InflateException inflateException = new InflateException(sb2.toString());
            inflateException.initCause(e10);
            throw inflateException;
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Error inflating class ");
            sb3.append(cls == null ? "<unknown>" : cls.getName());
            InflateException inflateException2 = new InflateException(sb3.toString());
            inflateException2.initCause(e11);
            throw inflateException2;
        }
    }

    private View a(String str, AttributeSet attributeSet) {
        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        System.out.println("******** Creating view: " + str);
        try {
            InterfaceC0164a interfaceC0164a = this.f12614c;
            View a = interfaceC0164a == null ? null : interfaceC0164a.a(str, this.a, attributeSet);
            if (a == null) {
                if (-1 == str.indexOf(46)) {
                    if (!str.equals("MBStarLevelLayoutView") && !str.equals("LuckPan")) {
                        a = a(str, f12612j, attributeSet);
                    }
                    a = a(str, "", attributeSet);
                } else {
                    a = a(str, (String) null, attributeSet);
                }
            }
            System.out.println("Created view is: " + a);
            return a;
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e10) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e10);
            throw inflateException;
        } catch (Exception e11) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e11);
            throw inflateException2;
        }
    }

    private void a(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int next;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next2 = xmlPullParser.next();
            if ((next2 == 3 && xmlPullParser.getDepth() <= depth) || next2 == 1) {
                return;
            }
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    view.requestFocus();
                    int depth2 = xmlPullParser.getDepth();
                    do {
                        next = xmlPullParser.next();
                        if (next != 3 || xmlPullParser.getDepth() > depth2) {
                        }
                    } while (next != 1);
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        b(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    View a = a(name, attributeSet);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams generateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                    a(xmlPullParser, a, attributeSet);
                    viewGroup.addView(a, generateLayoutParams);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }

    public final View a(String str, ViewGroup viewGroup) {
        boolean z10 = viewGroup != null;
        this.f12618i = System.currentTimeMillis();
        System.out.println("INFLATING from resource: " + str);
        return a(a(str), viewGroup, z10);
    }
}
