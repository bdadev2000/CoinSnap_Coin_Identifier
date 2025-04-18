package y7;

import android.app.UiModeManager;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.LinkedHashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u implements o0.u, SuccessContinuation, uc.n, xd.b, OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public Object f28007b;

    public /* synthetic */ u(Object obj) {
        this.f28007b = obj;
    }

    @Override // xd.b
    public final JSONObject a(View view) {
        boolean z10 = false;
        JSONObject a = zd.b.a(0, 0, 0, 0);
        UiModeManager uiModeManager = com.bumptech.glide.e.f9647n;
        int i10 = 2;
        char c10 = 3;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType == 4) {
                    c10 = 1;
                }
            } else {
                c10 = 2;
            }
        }
        if (c10 == 1) {
            i10 = com.facebook.appevents.g.f10942g;
        }
        if (zd.a.a[t.h.b(i10)] == 1) {
            z10 = true;
        }
        try {
            a.put("noOutputDevice", z10);
        } catch (JSONException e2) {
            com.facebook.internal.i.b("Error with setting output device status", e2);
        }
        return a;
    }

    @Override // uc.n
    public final Object b() {
        Object obj = this.f28007b;
        if (((Type) obj) instanceof ParameterizedType) {
            Type type = ((ParameterizedType) ((Type) obj)).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return new EnumMap((Class) type);
            }
            throw new com.google.gson.q("Invalid EnumMap type: " + ((Type) this.f28007b).toString());
        }
        throw new com.google.gson.q("Invalid EnumMap type: " + ((Type) this.f28007b).toString());
    }

    public final String c(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            e(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    @Override // xd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r7, org.json.JSONObject r8, xd.a r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            wd.c r10 = wd.c.f26969c
            if (r10 == 0) goto L8f
            java.util.Collection r10 = r10.a()
            int r0 = r10.size()
            int r0 = r0 * 2
            int r0 = r0 + 3
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L1e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r10.next()
            vd.i r0 = (vd.i) r0
            ce.a r0 = r0.f26512d
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1e
            boolean r2 = r0.isAttachedToWindow()
            if (r2 != 0) goto L3b
            goto L4e
        L3b:
            boolean r2 = r0.isShown()
            if (r2 != 0) goto L42
            goto L4e
        L42:
            r2 = r0
        L43:
            if (r2 == 0) goto L5d
            float r3 = r2.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L50
        L4e:
            r2 = 0
            goto L5e
        L50:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L5b
            android.view.View r2 = (android.view.View) r2
            goto L43
        L5b:
            r2 = 0
            goto L43
        L5d:
            r2 = 1
        L5e:
            if (r2 == 0) goto L1e
            android.view.View r0 = r0.getRootView()
            if (r0 == 0) goto L1e
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L1e
            r1.put(r0, r0)
            float r2 = r0.getZ()
            int r3 = r7.size()
        L77:
            if (r3 <= 0) goto L8b
            int r4 = r3 + (-1)
            java.lang.Object r5 = r7.get(r4)
            android.view.View r5 = (android.view.View) r5
            float r5 = r5.getZ()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L8b
            r3 = r4
            goto L77
        L8b:
            r7.add(r3, r0)
            goto L1e
        L8f:
            java.util.Iterator r7 = r7.iterator()
        L93:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r7.next()
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r0 = r6.f28007b
            xd.b r0 = (xd.b) r0
            r1 = r9
            ae.a r1 = (ae.a) r1
            r1.a(r10, r0, r8, r11)
            goto L93
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.u.d(android.view.View, org.json.JSONObject, xd.a, boolean, boolean):void");
    }

    public final void e(Object obj, Writer writer) {
        xb.d dVar = (xb.d) this.f28007b;
        xb.e eVar = new xb.e(writer, dVar.a, dVar.f27620b, dVar.f27621c, dVar.f27622d);
        eVar.h(obj);
        eVar.j();
        eVar.f27623b.flush();
    }

    public final l8.b f(m mVar, nb.a aVar) {
        l8.b bVar = null;
        int i10 = 0;
        while (true) {
            try {
                mVar.peekFully(((n9.x) this.f28007b).a, 0, 10);
                ((n9.x) this.f28007b).G(0);
                if (((n9.x) this.f28007b).x() != 4801587) {
                    break;
                }
                ((n9.x) this.f28007b).H(3);
                int u = ((n9.x) this.f28007b).u();
                int i11 = u + 10;
                if (bVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(((n9.x) this.f28007b).a, 0, bArr, 0, 10);
                    mVar.peekFully(bArr, 10, u);
                    bVar = new q8.i(aVar).E(i11, bArr);
                } else {
                    mVar.advancePeekPosition(u);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        mVar.resetPeekPosition();
        mVar.advancePeekPosition(i10);
        return bVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        c1 c1Var = (c1) ((he.a0) this.f28007b).f19028c;
        ((fe.c) c1Var.f11924c).a(1, "dispatchOnCameraClosed");
        ((CameraView) c1Var.f11925d).f16484l.post(new fe.i(c1Var, 2));
    }

    @Override // o0.u
    public final boolean p(View view) {
        boolean z10;
        boolean z11 = false;
        if (!((SwipeDismissBehavior) this.f28007b).w(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ((SwipeDismissBehavior) this.f28007b).f11562d;
        if ((i10 == 0 && z10) || (i10 == 1 && !z10)) {
            z11 = true;
        }
        int width = view.getWidth();
        if (z11) {
            width = -width;
        }
        ViewCompat.offsetLeftAndRight(view, width);
        view.setAlpha(0.0f);
        ((SwipeDismissBehavior) this.f28007b).getClass();
        return true;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public u(int i10) {
        if (i10 == 8) {
            this.f28007b = null;
        } else if (i10 != 13) {
            if (i10 != 14) {
                this.f28007b = new n9.x(10);
            } else {
                this.f28007b = new LinkedHashSet();
            }
        }
    }
}
