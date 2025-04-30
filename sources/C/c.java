package C;

import P1.B;
import W1.C0320d;
import W1.y;
import a2.C0333b;
import android.content.ClipDescription;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0511v;
import androidx.lifecycle.a0;
import androidx.work.OverwritingInputMerger;
import b2.InterfaceC0554a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.facebook.C1849l;
import com.facebook.internal.C1838g;
import com.facebook.internal.G;
import com.facebook.login.q;
import com.facebook.login.r;
import com.facebook.login.s;
import com.facebook.login.t;
import d0.ChoreographerFrameCallbackC2156c;
import d1.C2161b;
import d1.C2163d;
import d1.C2164e;
import d1.C2168i;
import f2.InterfaceC2268f;
import g1.InterfaceC2286a;
import g6.AbstractAsyncTaskC2304a;
import j0.u;
import j0.v;
import j2.AbstractC2384b;
import j2.C2383a;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k2.InterfaceC2429a;
import k2.InterfaceC2430b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements Y.g, InterfaceC0554a, G, InterfaceC2286a, S.c {

    /* renamed from: g, reason: collision with root package name */
    public static c f346g;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f347c;

    /* renamed from: d, reason: collision with root package name */
    public Object f348d;

    /* renamed from: f, reason: collision with root package name */
    public Object f349f;

    public c(byte b, int i9) {
        this.b = i9;
        switch (i9) {
            case 15:
                this.f347c = Collections.emptyList();
                this.f348d = Collections.emptyList();
                return;
            case 23:
                this.f348d = new ArrayDeque();
                this.f349f = null;
                this.f347c = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                return;
            default:
                this.f348d = new ArrayDeque();
                this.f349f = null;
                this.f347c = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                return;
        }
    }

    public static boolean n(Editable editable, KeyEvent keyEvent, boolean z8) {
        v[] vVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
            for (v vVar : vVarArr) {
                int spanStart = editable.getSpanStart(vVar);
                int spanEnd = editable.getSpanEnd(vVar);
                if ((z8 && spanStart == selectionStart) || ((!z8 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public void A(String str) {
        if (str != null) {
            this.f347c = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void B(String[] strArr, int[] iArr, int[] iArr2) {
        ((String[][]) this.f347c)[1] = strArr;
        ((int[][]) this.f348d)[1] = iArr;
        ((int[][]) this.f349f)[1] = iArr2;
    }

    public void C(B.e eVar, int i9, int i10, int i11) {
        int i12 = eVar.f138b0;
        int i13 = eVar.f140c0;
        eVar.f138b0 = 0;
        eVar.f140c0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f138b0 = 0;
        } else {
            eVar.f138b0 = i12;
        }
        if (i13 < 0) {
            eVar.f140c0 = 0;
        } else {
            eVar.f140c0 = i13;
        }
        B.e eVar2 = (B.e) this.f349f;
        eVar2.f188t0 = i9;
        eVar2.U();
    }

    public void D() {
        switch (this.b) {
            case 8:
                return;
            case 9:
                y yVar = (y) ((com.bumptech.glide.load.data.h) this.f347c).f12856c;
                synchronized (yVar) {
                    yVar.f3606d = yVar.b.length;
                }
                return;
            default:
                return;
        }
    }

    public void G(B.e eVar) {
        ArrayList arrayList = (ArrayList) this.f347c;
        arrayList.clear();
        int size = eVar.f185q0.size();
        for (int i9 = 0; i9 < size; i9++) {
            B.d dVar = (B.d) eVar.f185q0.get(i9);
            int[] iArr = dVar.f163p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f187s0.b = true;
    }

    @Override // b2.InterfaceC0554a
    public B a(B b, N1.i iVar) {
        Drawable drawable = (Drawable) b.get();
        if (drawable instanceof BitmapDrawable) {
            return ((InterfaceC0554a) this.f348d).a(C0320d.b((Q1.a) this.f347c, ((BitmapDrawable) drawable).getBitmap()), iVar);
        }
        if (drawable instanceof C0333b) {
            return ((InterfaceC0554a) this.f349f).a(b, iVar);
        }
        return null;
    }

    @Override // S.c
    public boolean b(Object obj) {
        if (obj instanceof InterfaceC2430b) {
            ((InterfaceC2430b) obj).b().f21400a = true;
        }
        ((k2.c) this.f348d).i(obj);
        return ((S.c) this.f349f).b(obj);
    }

    @Override // com.facebook.internal.G
    public void c(JSONObject jSONObject) {
        String string;
        Bundle bundle = (Bundle) this.f347c;
        com.facebook.login.m mVar = (com.facebook.login.m) this.f348d;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e4) {
                t e9 = mVar.e();
                q qVar = mVar.e().f13775i;
                String message = e4.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                e9.d(new s(qVar, r.ERROR, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        mVar.m((q) this.f349f, bundle);
    }

    @Override // Y.g
    public Uri d() {
        return (Uri) this.f347c;
    }

    @Override // Y.g
    public Uri f() {
        return (Uri) this.f349f;
    }

    @Override // S.c
    public Object g() {
        Object g9 = ((S.c) this.f349f).g();
        if (g9 == null) {
            g9 = ((InterfaceC2429a) this.f347c).e();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + g9.getClass());
            }
        }
        if (g9 instanceof InterfaceC2430b) {
            ((InterfaceC2430b) g9).b().f21400a = false;
        }
        return g9;
    }

    @Override // Y.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f348d;
    }

    @Override // com.facebook.internal.G
    public void h(C1849l c1849l) {
        String message;
        com.facebook.login.m mVar = (com.facebook.login.m) this.f348d;
        t e4 = mVar.e();
        q qVar = mVar.e().f13775i;
        if (c1849l == null) {
            message = null;
        } else {
            message = c1849l.getMessage();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        e4.d(new s(qVar, r.ERROR, null, TextUtils.join(": ", arrayList), null));
    }

    @Override // Y.g
    public Object i() {
        return null;
    }

    public void j() {
        switch (this.b) {
            case 11:
                W5.a aVar = (W5.a) ((ArrayDeque) this.f348d).poll();
                this.f349f = aVar;
                if (aVar != null) {
                    aVar.executeOnExecutor((ThreadPoolExecutor) this.f347c, new Object[0]);
                    return;
                }
                return;
            default:
                AbstractAsyncTaskC2304a abstractAsyncTaskC2304a = (AbstractAsyncTaskC2304a) ((ArrayDeque) this.f348d).poll();
                this.f349f = abstractAsyncTaskC2304a;
                if (abstractAsyncTaskC2304a != null) {
                    abstractAsyncTaskC2304a.executeOnExecutor((ThreadPoolExecutor) this.f347c, new Object[0]);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.work.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [d1.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.work.c, java.lang.Object] */
    public androidx.work.p k() {
        boolean z8;
        UUID uuid = (UUID) this.f347c;
        C2168i c2168i = (C2168i) this.f348d;
        HashSet hashSet = (HashSet) this.f349f;
        ?? obj = new Object();
        obj.f5248a = uuid;
        obj.b = c2168i;
        obj.f5249c = hashSet;
        androidx.work.c cVar = c2168i.f19809j;
        if (cVar.f5209h.f5211a.size() <= 0 && !cVar.f5205d && !cVar.b && !cVar.f5204c) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (((C2168i) this.f348d).f19814q && z8) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f347c = UUID.randomUUID();
        C2168i c2168i2 = (C2168i) this.f348d;
        ?? obj2 = new Object();
        obj2.b = 1;
        androidx.work.g gVar = androidx.work.g.f5213c;
        obj2.f19804e = gVar;
        obj2.f19805f = gVar;
        obj2.f19809j = androidx.work.c.f5202i;
        obj2.l = 1;
        obj2.m = 30000L;
        obj2.f19813p = -1L;
        obj2.f19815r = 1;
        obj2.f19801a = c2168i2.f19801a;
        obj2.f19802c = c2168i2.f19802c;
        obj2.b = c2168i2.b;
        obj2.f19803d = c2168i2.f19803d;
        obj2.f19804e = new androidx.work.g(c2168i2.f19804e);
        obj2.f19805f = new androidx.work.g(c2168i2.f19805f);
        obj2.f19806g = c2168i2.f19806g;
        obj2.f19807h = c2168i2.f19807h;
        obj2.f19808i = c2168i2.f19808i;
        androidx.work.c cVar2 = c2168i2.f19809j;
        ?? obj3 = new Object();
        obj3.f5203a = 1;
        obj3.f5207f = -1L;
        obj3.f5208g = -1L;
        obj3.f5209h = new androidx.work.e();
        obj3.b = cVar2.b;
        obj3.f5204c = cVar2.f5204c;
        obj3.f5203a = cVar2.f5203a;
        obj3.f5205d = cVar2.f5205d;
        obj3.f5206e = cVar2.f5206e;
        obj3.f5209h = cVar2.f5209h;
        obj2.f19809j = obj3;
        obj2.f19810k = c2168i2.f19810k;
        obj2.l = c2168i2.l;
        obj2.m = c2168i2.m;
        obj2.f19811n = c2168i2.f19811n;
        obj2.f19812o = c2168i2.f19812o;
        obj2.f19813p = c2168i2.f19813p;
        obj2.f19814q = c2168i2.f19814q;
        obj2.f19815r = c2168i2.f19815r;
        this.f348d = obj2;
        obj2.f19801a = ((UUID) this.f347c).toString();
        return obj;
    }

    public k3.j l() {
        String str;
        if (((String) this.f347c) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((h3.d) this.f349f) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new k3.j((String) this.f347c, (byte[]) this.f348d, (h3.d) this.f349f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public Bitmap m(BitmapFactory.Options options) {
        switch (this.b) {
            case 8:
                return BitmapFactory.decodeStream(new C2383a(AbstractC2384b.c((ByteBuffer) this.f347c)), null, options);
            case 9:
                y yVar = (y) ((com.bumptech.glide.load.data.h) this.f347c).f12856c;
                yVar.reset();
                return BitmapFactory.decodeStream(yVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.h) this.f349f).e().getFileDescriptor(), null, options);
        }
    }

    public void o(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f347c;
        J4.f fVar = new J4.f(byteArrayOutputStream, map, (Map) this.f348d, (G4.d) this.f349f);
        if (obj != null) {
            G4.d dVar = (G4.d) map.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, fVar);
            } else {
                throw new RuntimeException("No encoder for " + obj.getClass());
            }
        }
    }

    public void p(Runnable runnable) {
        ((e1.i) this.f347c).execute(runnable);
    }

    public int q() {
        y yVar;
        switch (this.b) {
            case 8:
                ByteBuffer c9 = AbstractC2384b.c((ByteBuffer) this.f347c);
                Q1.f fVar = (Q1.f) this.f349f;
                if (c9 == null) {
                    return -1;
                }
                List list = (List) this.f348d;
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    try {
                        int d2 = ((N1.e) list.get(i9)).d(c9, fVar);
                        if (d2 != -1) {
                            return d2;
                        }
                    } finally {
                        AbstractC2384b.c(c9);
                    }
                }
                return -1;
            case 9:
                y yVar2 = (y) ((com.bumptech.glide.load.data.h) this.f347c).f12856c;
                yVar2.reset();
                return z2.i.i((ArrayList) ((List) this.f349f), yVar2, (Q1.f) this.f348d);
            default:
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f349f;
                Q1.f fVar2 = (Q1.f) this.f347c;
                ArrayList arrayList = (ArrayList) ((List) this.f348d);
                int size2 = arrayList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    N1.e eVar = (N1.e) arrayList.get(i10);
                    y yVar3 = null;
                    try {
                        yVar = new y(new FileInputStream(hVar.e().getFileDescriptor()), fVar2);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        int c10 = eVar.c(yVar, fVar2);
                        yVar.release();
                        hVar.e();
                        if (c10 != -1) {
                            return c10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        yVar3 = yVar;
                        if (yVar3 != null) {
                            yVar3.release();
                        }
                        hVar.e();
                        throw th;
                    }
                }
                return -1;
        }
    }

    public ImageHeaderParser$ImageType r() {
        y yVar;
        switch (this.b) {
            case 8:
                return z2.i.k((List) this.f348d, AbstractC2384b.c((ByteBuffer) this.f347c));
            case 9:
                y yVar2 = (y) ((com.bumptech.glide.load.data.h) this.f347c).f12856c;
                yVar2.reset();
                return z2.i.j((List) this.f349f, yVar2, (Q1.f) this.f348d);
            default:
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f349f;
                Q1.f fVar = (Q1.f) this.f347c;
                List list = (List) this.f348d;
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    N1.e eVar = (N1.e) list.get(i9);
                    y yVar3 = null;
                    try {
                        yVar = new y(new FileInputStream(hVar.e().getFileDescriptor()), fVar);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        ImageHeaderParser$ImageType b = eVar.b(yVar);
                        yVar.release();
                        hVar.e();
                        if (b != ImageHeaderParser$ImageType.UNKNOWN) {
                            return b;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        yVar3 = yVar;
                        if (yVar3 != null) {
                            yVar3.release();
                        }
                        hVar.e();
                        throw th;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public C2163d s(String str) {
        C2163d c2163d;
        D0.m c9 = D0.m.c(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            c9.i(1);
        } else {
            c9.j(1, str);
        }
        D0.j jVar = (D0.j) this.f347c;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            int f9 = com.facebook.appevents.i.f(g9, "work_spec_id");
            int f10 = com.facebook.appevents.i.f(g9, "system_id");
            if (g9.moveToFirst()) {
                c2163d = new C2163d(g9.getString(f9), g9.getInt(f10));
            } else {
                c2163d = null;
            }
            return c2163d;
        } finally {
            g9.close();
            c9.release();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(87:5|(4:7|(1:9)|10|(2:12|(2:13|(2:15|(3:17|18|(1:20)(0))(1:21))(1:22)))(0))(0)|23|(84:284|285|(1:27)|28|29|30|(1:32)|281|34|35|(3:256|257|(79:259|(71:261|(1:263)|38|(1:40)|41|(1:43)|44|(62:46|(1:242)|50|(1:52)|53|(1:55)(2:232|(1:237)(1:236))|56|(1:58)|59|(1:61)(5:220|(1:222)|223|(1:225)(1:231)|(1:227)(2:228|(1:230)))|62|(1:64)(6:202|(4:205|(2:213|214)(1:211)|212|203)|215|216|(1:218)|219)|65|(1:67)(1:201)|(1:69)|70|(44:197|198|(1:76)|77|(1:79)|80|(38:188|(1:192)|(1:84)|85|(34:183|(1:187)|(1:89)|90|(30:180|(1:182)|(1:94)|95|(26:176|177|(1:99)|100|(3:166|167|(23:169|(1:171)|172|(1:104)|105|(4:151|152|153|(2:155|(17:157|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)(1:150)|121|(1:123)|124|(1:149)|126|(6:134|135|(1:137)(1:144)|138|(1:140)(1:143)|141)|128|129|(1:131)|132|133)(2:158|159))(2:160|161))|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)(2:173|174))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|72|(44:193|194|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|243|(2:251|252)|(1:250)|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|264|(74:266|(1:268)|38|(0)|41|(0)|44|(0)|243|(1:245)|251|252|(1:248)|250|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)(1:277)|269|(3:271|(1:273)(1:275)|274)|276|38|(0)|41|(0)|44|(0)|243|(0)|251|252|(0)|250|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133))|37|38|(0)|41|(0)|44|(0)|243|(0)|251|252|(0)|250|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|25|(0)|28|29|30|(0)|281|34|35|(0)|37|38|(0)|41|(0)|44|(0)|243|(0)|251|252|(0)|250|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133) */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0211, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0212, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x00d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x00d1, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0608 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0396 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[Catch: NameNotFoundException -> 0x00d0, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x00d0, blocks: (B:30:0x00c4, B:32:0x00ca), top: B:29:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d0  */
    /* JADX WARN: Type inference failed for: r0v125, types: [int] */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v206 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.core.app.O] */
    /* JADX WARN: Type inference failed for: r2v56, types: [B1.f, androidx.core.app.J] */
    /* JADX WARN: Type inference failed for: r3v23, types: [B1.f, androidx.core.app.I] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean t() {
        /*
            Method dump skipped, instructions count: 1698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.c.t():boolean");
    }

    public String toString() {
        switch (this.b) {
            case 17:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f347c);
                sb.append('{');
                a7.b bVar = (a7.b) ((a7.b) this.f348d).f4078d;
                String str = "";
                while (bVar != null) {
                    Object obj = bVar.f4077c;
                    sb.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    bVar = (a7.b) bVar.f4078d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(CharSequence charSequence, int i9, int i10, u uVar) {
        int i11;
        if ((uVar.f21005c & 3) == 0) {
            j0.g gVar = (j0.g) this.f349f;
            k0.a c9 = uVar.c();
            int a6 = c9.a(8);
            if (a6 != 0) {
                c9.b.getShort(a6 + c9.f21396a);
            }
            j0.d dVar = (j0.d) gVar;
            dVar.getClass();
            ThreadLocal threadLocal = j0.d.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i9 < i10) {
                sb.append(charSequence.charAt(i9));
                i9++;
            }
            TextPaint textPaint = dVar.f20966a;
            String sb2 = sb.toString();
            int i12 = L.h.f1672a;
            boolean a9 = L.f.a(textPaint, sb2);
            int i13 = uVar.f21005c & 4;
            if (a9) {
                i11 = i13 | 2;
            } else {
                i11 = i13 | 1;
            }
            uVar.f21005c = i11;
        }
        if ((uVar.f21005c & 3) == 2) {
            return true;
        }
        return false;
    }

    public void v(C2163d c2163d) {
        D0.j jVar = (D0.j) this.f347c;
        jVar.b();
        jVar.c();
        try {
            ((C2161b) this.f348d).e(c2163d);
            jVar.h();
        } finally {
            jVar.f();
        }
    }

    public boolean w(int i9, B.d dVar, E.f fVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int[] iArr = dVar.f163p0;
        int i10 = iArr[0];
        b bVar = (b) this.f348d;
        bVar.f337a = i10;
        bVar.b = iArr[1];
        bVar.f338c = dVar.q();
        bVar.f339d = dVar.k();
        bVar.f344i = false;
        bVar.f345j = i9;
        if (bVar.f337a == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (bVar.b == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && dVar.f132W > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && dVar.f132W > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        int[] iArr2 = dVar.f167t;
        if (z10 && iArr2[0] == 4) {
            bVar.f337a = 1;
        }
        if (z11 && iArr2[1] == 4) {
            bVar.b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f340e);
        dVar.L(bVar.f341f);
        dVar.f115E = bVar.f343h;
        dVar.I(bVar.f342g);
        bVar.f345j = 0;
        return bVar.f344i;
    }

    public void x(EnumC0503m enumC0503m) {
        a0 a0Var = (a0) this.f349f;
        if (a0Var != null) {
            a0Var.run();
        }
        a0 a0Var2 = new a0((C0513x) this.f347c, enumC0503m);
        this.f349f = a0Var2;
        ((Handler) this.f348d).postAtFrontOfQueue(a0Var2);
    }

    public Object y(CharSequence charSequence, int i9, int i10, int i11, boolean z8, j0.n nVar) {
        j0.r rVar;
        char c9;
        j0.r rVar2 = null;
        j0.o oVar = new j0.o((j0.r) ((U4.y) this.f348d).f3335c, false, null);
        int codePointAt = Character.codePointAt(charSequence, i9);
        int i12 = 0;
        boolean z9 = true;
        int i13 = i9;
        int i14 = i13;
        while (i13 < i10 && i12 < i11 && z9) {
            SparseArray sparseArray = oVar.f20984c.f21000a;
            if (sparseArray == null) {
                rVar = rVar2;
            } else {
                rVar = (j0.r) sparseArray.get(codePointAt);
            }
            if (oVar.f20983a != 2) {
                if (rVar == null) {
                    oVar.a();
                    c9 = 1;
                } else {
                    oVar.f20983a = 2;
                    oVar.f20984c = rVar;
                    oVar.f20987f = 1;
                    c9 = 2;
                }
            } else {
                if (rVar != null) {
                    oVar.f20984c = rVar;
                    oVar.f20987f++;
                } else {
                    if (codePointAt == 65038) {
                        oVar.a();
                    } else if (codePointAt != 65039) {
                        j0.r rVar3 = oVar.f20984c;
                        if (rVar3.b != null) {
                            if (oVar.f20987f == 1) {
                                if (oVar.b()) {
                                    oVar.f20985d = oVar.f20984c;
                                    oVar.a();
                                } else {
                                    oVar.a();
                                }
                            } else {
                                oVar.f20985d = rVar3;
                                oVar.a();
                            }
                            c9 = 3;
                        } else {
                            oVar.a();
                        }
                    }
                    c9 = 1;
                }
                c9 = 2;
            }
            oVar.f20986e = codePointAt;
            if (c9 != 1) {
                if (c9 != 2) {
                    if (c9 == 3) {
                        if (z8 || !u(charSequence, i14, i13, oVar.f20985d.b)) {
                            z9 = nVar.d(charSequence, i14, i13, oVar.f20985d.b);
                            i12++;
                        }
                    }
                } else {
                    int charCount = Character.charCount(codePointAt) + i13;
                    if (charCount < i10) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i13 = charCount;
                }
                rVar2 = null;
            } else {
                i13 = Character.charCount(Character.codePointAt(charSequence, i14)) + i14;
                if (i13 < i10) {
                    codePointAt = Character.codePointAt(charSequence, i13);
                }
            }
            i14 = i13;
            rVar2 = null;
        }
        if (oVar.f20983a == 2 && oVar.f20984c.b != null && ((oVar.f20987f > 1 || oVar.b()) && i12 < i11 && z9 && (z8 || !u(charSequence, i14, i13, oVar.f20984c.b)))) {
            nVar.d(charSequence, i14, i13, oVar.f20984c.b);
        }
        return nVar.b();
    }

    public void z(String str) {
        D0.j jVar = (D0.j) this.f347c;
        jVar.b();
        C2164e c2164e = (C2164e) this.f349f;
        I0.f a6 = c2164e.a();
        if (str == null) {
            a6.i(1);
        } else {
            a6.j(1, str);
        }
        jVar.c();
        try {
            a6.p();
            jVar.h();
        } finally {
            jVar.f();
            c2164e.c(a6);
        }
    }

    public /* synthetic */ c(int i9, char c9) {
        this.b = i9;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i9) {
        this.b = i9;
        this.f347c = obj;
        this.f348d = obj2;
        this.f349f = obj3;
    }

    public c(D0.j jVar) {
        this.b = 21;
        this.f347c = jVar;
        this.f348d = new C2161b(jVar, 2);
        this.f349f = new C2164e(jVar, 0);
    }

    public c(InterfaceC0511v interfaceC0511v) {
        this.b = 13;
        G7.j.e(interfaceC0511v, "provider");
        this.f347c = new C0513x(interfaceC0511v);
        this.f348d = new Handler();
    }

    public c(ExecutorService executorService) {
        this.b = 22;
        this.f348d = new Handler(Looper.getMainLooper());
        this.f349f = new P.h(this, 1);
        this.f347c = new e1.i(executorService);
    }

    public c(M3.b bVar, View view) {
        Object obj;
        this.b = 3;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            obj = new Object();
        } else {
            obj = i9 >= 33 ? new Object() : null;
        }
        this.f347c = obj;
        this.f348d = bVar;
        this.f349f = view;
    }

    private final void E() {
    }

    private final void F() {
    }

    @Override // Y.g
    public void e() {
    }

    public c(Context context, U4.s sVar, ExecutorService executorService) {
        this.b = 7;
        this.f347c = executorService;
        this.f348d = context;
        this.f349f = sVar;
    }

    public c(Context context, LocationManager locationManager) {
        this.b = 27;
        this.f349f = new Object();
        this.f347c = context;
        this.f348d = locationManager;
    }

    public c(B.e eVar) {
        this.b = 0;
        this.f347c = new ArrayList();
        this.f348d = new Object();
        this.f349f = eVar;
    }

    public c(Class cls) {
        this.b = 14;
        this.f349f = new HashSet();
        this.f347c = UUID.randomUUID();
        this.f348d = new C2168i(((UUID) this.f347c).toString(), cls.getName());
        ((HashSet) this.f349f).add(cls.getName());
        ((C2168i) this.f348d).f19803d = OverwritingInputMerger.class.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [j0.n, J1.a, java.lang.Object] */
    public c(U4.y yVar, L4.f fVar, j0.g gVar, Set set) {
        this.b = 26;
        this.f347c = fVar;
        this.f348d = yVar;
        this.f349f = gVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            ?? obj = new Object();
            obj.b = str;
            y(str, 0, str.length(), 1, true, obj);
        }
    }

    public c(S.e eVar, InterfaceC2429a interfaceC2429a, k2.c cVar) {
        this.b = 28;
        this.f349f = eVar;
        this.f347c = interfaceC2429a;
        this.f348d = cVar;
    }

    public c(String str) {
        this.b = 17;
        a7.b bVar = new a7.b(17, false);
        this.f348d = bVar;
        this.f349f = bVar;
        this.f347c = str;
    }

    public c(j2.k kVar, ArrayList arrayList, Q1.f fVar) {
        this.b = 9;
        j2.g.c(fVar, "Argument must not be null");
        this.f348d = fVar;
        j2.g.c(arrayList, "Argument must not be null");
        this.f349f = arrayList;
        this.f347c = new com.bumptech.glide.load.data.h(kVar, fVar);
    }

    public c(C1838g c1838g) {
        this.b = 24;
        this.b = 24;
        this.f347c = c1838g;
        this.f348d = Choreographer.getInstance();
        this.f349f = new ChoreographerFrameCallbackC2156c(this, 1);
    }

    public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, Q1.f fVar) {
        this.b = 10;
        j2.g.c(fVar, "Argument must not be null");
        this.f347c = fVar;
        j2.g.c(arrayList, "Argument must not be null");
        this.f348d = arrayList;
        this.f349f = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }

    public c(P1.n nVar, InterfaceC2268f interfaceC2268f, P1.r rVar) {
        this.b = 6;
        this.f349f = nVar;
        this.f348d = interfaceC2268f;
        this.f347c = rVar;
    }

    public c(int i9) {
        this.b = 20;
        this.f347c = new String[i9];
        this.f348d = new int[i9];
        this.f349f = new int[i9];
    }
}
