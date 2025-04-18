package androidx.emoji2.text;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import com.google.firebase.messaging.FirebaseMessaging;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1532b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1533c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1534d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1535e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1536f;

    public t(kd.d dVar, kd.g gVar) {
        kd.f fVar = kd.f.BEGIN_TO_RENDER;
        kd.g gVar2 = kd.g.NATIVE;
        this.a = 3;
        this.f1535e = dVar;
        this.f1536f = fVar;
        this.f1533c = gVar2;
        this.f1534d = gVar;
        this.f1532b = false;
    }

    public static t a(kd.d dVar, kd.g gVar) {
        if (dVar != kd.d.DEFINED_BY_JAVASCRIPT) {
            return new t(dVar, gVar);
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    public static t b(vd.d dVar, vd.f fVar, vd.g gVar, vd.g gVar2) {
        if (gVar != vd.g.NONE) {
            vd.d dVar2 = vd.d.DEFINED_BY_JAVASCRIPT;
            vd.g gVar3 = vd.g.NATIVE;
            if (dVar == dVar2 && gVar == gVar3) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (fVar == vd.f.DEFINED_BY_JAVASCRIPT && gVar == gVar3) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new t(dVar, fVar, gVar, gVar2);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z10) {
        boolean z11;
        b0[] b0VarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && (b0VarArr = (b0[]) editable.getSpans(selectionStart, selectionEnd, b0.class)) != null && b0VarArr.length > 0) {
            for (b0 b0Var : b0VarArr) {
                int spanStart = editable.getSpanStart(b0Var);
                int spanEnd = editable.getSpanEnd(b0Var);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(CharSequence charSequence, int i10, int i11, r rVar) {
        int i12;
        if (rVar.f1524c == 0) {
            i iVar = (i) this.f1535e;
            d1.a c10 = rVar.c();
            int a = c10.a(8);
            if (a != 0) {
                ((ByteBuffer) c10.f16791d).getShort(a + c10.a);
            }
            e eVar = (e) iVar;
            eVar.getClass();
            ThreadLocal threadLocal = e.f1497b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = eVar.a;
            String sb3 = sb2.toString();
            int i13 = g0.i.a;
            if (g0.g.a(textPaint, sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            rVar.f1524c = i12;
        }
        if (rVar.f1524c != 2) {
            return false;
        }
        return true;
    }

    public final synchronized void e() {
        if (this.f1532b) {
            return;
        }
        Boolean h10 = h();
        this.f1535e = h10;
        if (h10 == null) {
            hf.d dVar = new hf.d(this);
            this.f1534d = dVar;
            db.l lVar = (db.l) ((zb.c) this.f1533c);
            lVar.a(lVar.f16960c, dVar);
        }
        this.f1532b = true;
    }

    public final synchronized boolean f() {
        boolean h10;
        e();
        Object obj = this.f1535e;
        if (((Boolean) obj) != null) {
            h10 = ((Boolean) obj).booleanValue();
        } else {
            h10 = ((FirebaseMessaging) this.f1536f).a.h();
        }
        return h10;
    }

    public final boolean g() {
        int i10 = this.a;
        Object obj = this.f1533c;
        switch (i10) {
            case 3:
                if (kd.g.NATIVE == ((kd.g) obj)) {
                    return true;
                }
                return false;
            default:
                if (vd.g.NATIVE == ((vd.g) obj)) {
                    return true;
                }
                return false;
        }
    }

    public final Boolean h() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        va.g gVar = ((FirebaseMessaging) this.f1536f).a;
        gVar.a();
        Context context = gVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final JSONObject i() {
        int i10 = this.a;
        Object obj = this.f1536f;
        Object obj2 = this.f1533c;
        switch (i10) {
            case 3:
                JSONObject jSONObject = new JSONObject();
                qd.c.b(jSONObject, "impressionOwner", (kd.g) obj2);
                qd.c.b(jSONObject, "mediaEventsOwner", (kd.g) this.f1534d);
                qd.c.b(jSONObject, "creativeType", (kd.d) this.f1535e);
                qd.c.b(jSONObject, "impressionType", (kd.f) obj);
                qd.c.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f1532b));
                return jSONObject;
            default:
                JSONObject jSONObject2 = new JSONObject();
                zd.b.b(jSONObject2, "impressionOwner", (vd.g) obj2);
                zd.b.b(jSONObject2, "mediaEventsOwner", (vd.g) this.f1534d);
                zd.b.b(jSONObject2, "creativeType", (vd.d) this.f1535e);
                zd.b.b(jSONObject2, "impressionType", (vd.f) obj);
                zd.b.b(jSONObject2, "isolateVerificationScripts", Boolean.valueOf(this.f1532b));
                return jSONObject2;
        }
    }

    public t(vd.d dVar, vd.f fVar, vd.g gVar, vd.g gVar2) {
        this.a = 4;
        this.f1535e = dVar;
        this.f1536f = fVar;
        this.f1533c = gVar;
        this.f1534d = gVar2;
        this.f1532b = false;
    }

    public t(m9.k kVar) {
        this.a = 1;
        kVar.getClass();
        this.f1533c = kVar;
        this.f1534d = new ac.e();
        this.f1532b = true;
    }

    public t(s2.h hVar, ka.e eVar, e eVar2) {
        this.a = 0;
        this.f1533c = eVar;
        this.f1534d = hVar;
        this.f1535e = eVar2;
        this.f1532b = false;
        this.f1536f = null;
    }

    public t(FirebaseMessaging firebaseMessaging, zb.c cVar) {
        this.a = 2;
        this.f1536f = firebaseMessaging;
        this.f1533c = cVar;
    }
}
