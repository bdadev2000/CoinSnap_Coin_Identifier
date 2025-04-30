package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.c.a;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i implements Handler.Callback, c {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f16699a;
    protected String b;

    /* renamed from: d, reason: collision with root package name */
    protected Context f16701d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f16702e;

    /* renamed from: c, reason: collision with root package name */
    protected final int f16700c = 1;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f16703f = new Handler(Looper.getMainLooper(), this);

    public i(Context context) {
        this.f16701d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public final void a(WindVaneWebView windVaneWebView) {
        this.f16702e = windVaneWebView;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            r1 = 1
            if (r7 != 0) goto Lc
            goto L68
        Lc:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r6.f16702e
            com.mbridge.msdk.mbsignalcommon.windvane.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.c.a(r2, r7)
            if (r2 == 0) goto L19
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r7 = r6.f16702e
            r2.b = r7
            goto L69
        L19:
            java.util.regex.Pattern r2 = r6.f16699a
            java.util.regex.Matcher r7 = r2.matcher(r7)
            boolean r2 = r7.matches()
            if (r2 == 0) goto L68
            com.mbridge.msdk.mbsignalcommon.windvane.a r2 = new com.mbridge.msdk.mbsignalcommon.windvane.a
            r2.<init>()
            int r3 = r7.groupCount()
            r4 = 5
            if (r3 < r4) goto L37
            java.lang.String r4 = r7.group(r4)
            r2.f16681f = r4
        L37:
            r4 = 3
            if (r3 < r4) goto L68
            java.lang.String r3 = r7.group(r1)
            r2.f16679d = r3
            r3 = 2
            java.lang.String r3 = r7.group(r3)
            r2.f16682g = r3
            java.lang.String r7 = r7.group(r4)
            r2.f16680e = r7
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.mbridge.msdk.mbsignalcommon.base.e.f16595k
            if (r3 == 0) goto L63
            boolean r7 = r3.containsKey(r7)
            if (r7 == 0) goto L63
            java.util.HashMap<java.lang.String, java.lang.String> r7 = com.mbridge.msdk.mbsignalcommon.base.e.f16595k
            java.lang.String r3 = r2.f16680e
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            r2.f16680e = r7
        L63:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r7 = r6.f16702e
            r2.b = r7
            goto L69
        L68:
            r2 = r0
        L69:
            if (r2 != 0) goto L6c
            return
        L6c:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r7 = r2.b
            if (r7 != 0) goto L71
            goto L77
        L71:
            java.lang.String r0 = r2.f16679d
            java.lang.Object r0 = r7.getJsObject(r0)
        L77:
            if (r0 != 0) goto L7a
            goto Lbe
        L7a:
            android.content.Context r7 = r6.f16701d     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            com.mbridge.msdk.mbsignalcommon.c.a$c r7 = com.mbridge.msdk.mbsignalcommon.c.a.a(r7, r3)     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            java.lang.String r3 = r2.f16680e     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5}     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            com.mbridge.msdk.mbsignalcommon.c.a$d r7 = r7.a(r3, r4)     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            r7.a()     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            boolean r3 = r0 instanceof com.mbridge.msdk.mbsignalcommon.windvane.h     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            if (r3 == 0) goto Lbe
            r2.f16677a = r7     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            r2.f16678c = r0     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            android.os.Message r7 = android.os.Message.obtain()     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            r7.what = r1     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            r7.obj = r2     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            android.os.Handler r0 = r6.f16703f     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            r0.sendMessage(r7)     // Catch: java.lang.Exception -> Lb3 com.mbridge.msdk.mbsignalcommon.c.a.b.C0169a -> Lb5
            goto Lbe
        Lb3:
            r7 = move-exception
            goto Lb7
        Lb5:
            r7 = move-exception
            goto Lbb
        Lb7:
            r7.printStackTrace()
            goto Lbe
        Lbb:
            r7.printStackTrace()
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.windvane.i.b(java.lang.String):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = aVar.f16678c;
        a.d dVar = aVar.f16677a;
        if (dVar != null && obj != null) {
            if (TextUtils.isEmpty(aVar.f16681f)) {
                str = JsonUtils.EMPTY_JSON;
            } else {
                str = aVar.f16681f;
            }
            dVar.a(obj, aVar, str);
        }
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public final boolean a(String str) {
        if (!j.a(str)) {
            return false;
        }
        this.f16699a = j.b(str);
        this.b = str;
        return true;
    }
}
