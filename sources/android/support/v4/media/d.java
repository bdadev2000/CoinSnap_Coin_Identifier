package android.support.v4.media;

import a4.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.webkit.WebView;
import c6.k;
import com.facebook.internal.i;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kd.h;
import v8.u0;
import y7.j;

/* loaded from: classes.dex */
public final class d {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public Object f522b;

    /* renamed from: c, reason: collision with root package name */
    public Object f523c;

    /* renamed from: d, reason: collision with root package name */
    public Object f524d;

    /* renamed from: e, reason: collision with root package name */
    public Object f525e;

    /* renamed from: f, reason: collision with root package name */
    public Object f526f;

    /* renamed from: g, reason: collision with root package name */
    public Object f527g;

    /* renamed from: h, reason: collision with root package name */
    public Object f528h;

    /* renamed from: i, reason: collision with root package name */
    public Object f529i;

    public d(y yVar, WebView webView, String str, List list, String str2, String str3, kd.c cVar) {
        this.a = 4;
        ArrayList arrayList = new ArrayList();
        this.f525e = arrayList;
        this.f526f = new HashMap();
        this.f523c = yVar;
        this.f524d = webView;
        this.f522b = str;
        this.f529i = cVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                ((Map) this.f526f).put(UUID.randomUUID().toString(), hVar);
            }
        }
        this.f528h = str2;
        this.f527g = str3;
    }

    public static d a(y yVar, String str, List list, String str2, String str3) {
        i.a(str, "OM SDK JS script content is null");
        i.a(list, "VerificationScriptResources is null");
        if (str3 != null && str3.length() > 256) {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
        return new d(yVar, null, str, list, str2, str3, kd.c.NATIVE);
    }

    public final String b() {
        switch (this.a) {
            case 4:
                return (String) this.f528h;
            default:
                return (String) this.f528h;
        }
    }

    public final String c() {
        switch (this.a) {
            case 4:
                return (String) this.f527g;
            default:
                return (String) this.f527g;
        }
    }

    public final Map d() {
        switch (this.a) {
            case 4:
                return Collections.unmodifiableMap((Map) this.f526f);
            default:
                return Collections.unmodifiableMap((Map) this.f526f);
        }
    }

    public final List e() {
        switch (this.a) {
            case 4:
                return Collections.unmodifiableList((List) this.f525e);
            default:
                return Collections.unmodifiableList((List) this.f525e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ra.p f(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f523c
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r5.f523c
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r0.get(r6)
            ra.p r6 = (ra.p) r6
            return r6
        L1d:
            java.lang.Object r0 = r5.f526f
            m9.k r0 = (m9.k) r0
            r0.getClass()
            java.lang.Class<v8.y> r1 = v8.y.class
            r2 = 0
            if (r6 == 0) goto L6e
            r3 = 1
            if (r6 == r3) goto L5d
            r4 = 2
            if (r6 == r4) goto L4d
            r4 = 3
            if (r6 == r4) goto L3d
            r1 = 4
            if (r6 == r1) goto L36
            goto L7d
        L36:
            v8.k r1 = new v8.k     // Catch: java.lang.ClassNotFoundException -> L7d
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L7d
        L3b:
            r2 = r1
            goto L7d
        L3d:
            java.lang.String r0 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7d
            java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7d
            s7.t r1 = new s7.t     // Catch: java.lang.ClassNotFoundException -> L7d
            r1.<init>(r0, r3)     // Catch: java.lang.ClassNotFoundException -> L7d
            goto L3b
        L4d:
            java.lang.String r3 = "com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L7d
            java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7d
            v8.k r3 = new v8.k     // Catch: java.lang.ClassNotFoundException -> L7d
            r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L7d
            goto L7c
        L5d:
            java.lang.String r4 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L7d
            java.lang.Class r1 = r4.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7d
            v8.k r4 = new v8.k     // Catch: java.lang.ClassNotFoundException -> L7d
            r4.<init>()     // Catch: java.lang.ClassNotFoundException -> L7d
            r2 = r4
            goto L7d
        L6e:
            java.lang.Class<com.google.android.exoplayer2.source.dash.DashMediaSource$Factory> r3 = com.google.android.exoplayer2.source.dash.DashMediaSource$Factory.class
            int r4 = com.google.android.exoplayer2.source.dash.DashMediaSource$Factory.f11488h     // Catch: java.lang.ClassNotFoundException -> L7d
            java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7d
            v8.k r3 = new v8.k     // Catch: java.lang.ClassNotFoundException -> L7d
            r4 = 0
            r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L7d
        L7c:
            r2 = r3
        L7d:
            java.lang.Object r0 = r5.f523c
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.put(r1, r2)
            if (r2 == 0) goto L95
            java.lang.Object r0 = r5.f524d
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.add(r6)
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.d.f(int):ra.p");
    }

    public d(y yVar, WebView webView, String str, List list, vd.c cVar) {
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.f525e = arrayList;
        this.f526f = new HashMap();
        this.f523c = yVar;
        this.f524d = webView;
        this.f522b = str;
        this.f529i = cVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vd.h hVar = (vd.h) it.next();
                ((Map) this.f526f).put(UUID.randomUUID().toString(), hVar);
            }
        }
        this.f528h = null;
        this.f527g = null;
    }

    public d(Context context) {
        this.a = 2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k.y(context, R.attr.materialCalendarStyle, com.google.android.material.datepicker.k.class.getCanonicalName()).data, r9.a.f24030l);
        this.f522b = k0.c.a(context, obtainStyledAttributes.getResourceId(4, 0));
        this.f528h = k0.c.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f523c = k0.c.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f524d = k0.c.a(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList z10 = u0.z(context, obtainStyledAttributes, 7);
        this.f525e = k0.c.a(context, obtainStyledAttributes.getResourceId(9, 0));
        this.f526f = k0.c.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f527g = k0.c.a(context, obtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f529i = paint;
        paint.setColor(z10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public d(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, qa.a aVar) {
        this.a = 3;
        this.f522b = str;
        this.f523c = str2;
        this.f524d = arrayList;
        this.f525e = str3;
        this.f526f = str4;
        this.f527g = str5;
        this.f528h = str6;
        this.f529i = aVar;
    }

    public d() {
        this.a = 0;
    }

    public d(j jVar) {
        this.a = 1;
        this.f522b = jVar;
        this.f523c = new HashMap();
        this.f524d = new HashSet();
        this.f525e = new HashMap();
    }
}
